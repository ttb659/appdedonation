package ma.xproce.appdedonation.service;

import ma.xproce.appdedonation.dao.entities.Don;
import ma.xproce.appdedonation.dao.repositories.ActionRepository;
import ma.xproce.appdedonation.dto.NewActionDto;
import ma.xproce.appdedonation.mapper.ActionMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IactionServiceImpl implements IActionService{

    private final ActionRepository actionRepository;
    private final ActionMapper actionMapper;

    public IactionServiceImpl(ActionRepository actionRepository, ActionMapper actionMapper){
        this.actionRepository = actionRepository;
        this.actionMapper = actionMapper;
    }

    @Override
    public NewActionDto saveAction(NewActionDto newActionDto) {
        return actionMapper.actionToDto(actionRepository.save(actionMapper.dtoToAction(newActionDto)));
    }

    @Override
    public List<Don> findDonByActionID(Long id) {
        return (List<Don>) actionMapper.dtoToAction(actionMapper.actionToDto(actionRepository.findById(id).get())).getDons();
    }

}
