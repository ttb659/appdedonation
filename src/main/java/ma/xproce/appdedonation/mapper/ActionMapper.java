package ma.xproce.appdedonation.mapper;
import ma.xproce.appdedonation.dao.entities.Action;
import ma.xproce.appdedonation.dto.NewActionDto;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ActionMapper {
    ModelMapper model= new ModelMapper();

    public NewActionDto actionToDto(Action action) {
        return model.map(action, NewActionDto.class);
    }
    public Action dtoToAction(NewActionDto newActionDto) {
        return model.map(newActionDto, Action.class);
    }


}
