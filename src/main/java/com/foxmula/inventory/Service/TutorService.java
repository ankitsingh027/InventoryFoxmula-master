package com.foxmula.inventory.Service;

import com.foxmula.inventory.Model.Tutor;

public interface TutorService {
    Tutor addTutor(Tutor tutor);

    Tutor getTutor(Long id);

    Tutor updateTutor(Long id, Tutor tutor);

    Boolean deleteTutor(Long id);
}
