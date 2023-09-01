package com.mycompany.catvaccination.logic;

import com.mycompany.catvaccination.logic.Owner;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-09-01T13:57:16", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Pet.class)
public class Pet_ { 

    public static volatile SingularAttribute<Pet, String> petName;
    public static volatile SingularAttribute<Pet, String> allergic;
    public static volatile SingularAttribute<Pet, Owner> owner;
    public static volatile SingularAttribute<Pet, String> color;
    public static volatile SingularAttribute<Pet, Integer> customer_num;
    public static volatile SingularAttribute<Pet, String> specialCareInfo;
    public static volatile SingularAttribute<Pet, String> age;

}