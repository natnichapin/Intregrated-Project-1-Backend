package sit.int221.sas.sit_announcement_system_backend.execeptions;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import sit.int221.sas.sit_announcement_system_backend.DTO.AnnouncementsRequestDTO;
import sit.int221.sas.sit_announcement_system_backend.entity.Announcement;

public class CloseDateAfterPublishDateValidator implements ConstraintValidator<CloseDateAfterPublishDate, AnnouncementsRequestDTO> {

    @Override
    public void initialize(CloseDateAfterPublishDate constraintAnnotation) {
        // No initialization needed
    }

    @Override
    public boolean isValid(AnnouncementsRequestDTO announcementsRequestDTO, ConstraintValidatorContext context) {
        return announcementsRequestDTO.getPublishDate() != null && announcementsRequestDTO.getCloseDate() != null &&
                announcementsRequestDTO.getCloseDate().isAfter(announcementsRequestDTO.getPublishDate());
    }
}