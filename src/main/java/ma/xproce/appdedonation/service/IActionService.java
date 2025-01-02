package ma.xproce.appdedonation.service;

import ma.xproce.appdedonation.dao.entities.Action;
import ma.xproce.appdedonation.dao.entities.Don;
import ma.xproce.appdedonation.dto.NewActionDto;

import java.util.List;

public interface IActionService {
    public NewActionDto saveAction(NewActionDto action) ;
    public List<Don> findDonByActionID(Long id) ;
}
