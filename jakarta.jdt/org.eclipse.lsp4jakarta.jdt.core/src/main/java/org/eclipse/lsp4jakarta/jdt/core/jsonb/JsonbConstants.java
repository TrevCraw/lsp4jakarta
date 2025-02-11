/*******************************************************************************
 * Copyright (c) 2020, 2022 IBM Corporation and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *
 *******************************************************************************/
package org.eclipse.lsp4jakarta.jdt.core.jsonb;

import java.util.List;

public class JsonbConstants {

    /* Source */
    public static final String DIAGNOSTIC_SOURCE = "jakarta-jsonb";

    /* Code */
    public static final String DIAGNOSTIC_CODE_ANNOTATION = "MultipleJsonbCreatorAnnotations";
    public static final String DIAGNOSTIC_CODE_ANNOTATION_TRANSIENT_FIELD = "NonmutualJsonbTransientAnnotation";
    public static final String DIAGNOSTIC_CODE_ANNOTATION_TRANSIENT_ACCESSOR = "NonmutualJsonbTransientAnnotationOnAccessor";
    

    /* Annotation Constants */
    public static final String JSONB_PACKAGE = "jakarta.json.bind.annotation.";
    public static final String JSONB_PREFIX = "Jsonb";

    public static final String JSONB_CREATOR = JSONB_PACKAGE + JSONB_PREFIX + "Creator";
    public static final String ERROR_MESSAGE_JSONB_CREATOR = "Only one constructor or static factory method can be annotated with @JsonbCreator in a given class.";
    public static final int MAX_METHOD_WITH_JSONBCREATOR = 1;

    public static final String JSONB_TRANSIENT = JSONB_PREFIX + "Transient";
    public static final String JSONB_TRANSIENT_FQ_NAME = JSONB_PACKAGE + JSONB_PREFIX + "Transient";
    public static final String ERROR_MESSAGE_JSONB_TRANSIENT_ON_FIELD = "When a class field is annotated with @JsonbTransient, this field, getter or setter must not be annotated with other JSON Binding annotations.";
    public static final String ERROR_MESSAGE_JSONB_TRANSIENT_ON_ACCESSOR = "When an accessor is annotated with @JsonbTransient, its field or the accessor must not be annotated with other JSON Binding annotations.";

    public static final String JSONB_ANNOTATION = JSONB_PACKAGE + JSONB_PREFIX + "Annotation";
    public static final String JSONB_DATE_FORMAT = JSONB_PACKAGE + JSONB_PREFIX + "DateFormat";
    public static final String JSONB_NILLABLE = JSONB_PACKAGE + JSONB_PREFIX + "Nillable";
    public static final String JSONB_NUMBER_FORMAT = JSONB_PACKAGE + JSONB_PREFIX + "NumberFormat";
    public static final String JSONB_PROPERTY = JSONB_PACKAGE + JSONB_PREFIX + "Property";
    public static final String JSONB_PROPERTY_ORDER = JSONB_PACKAGE + JSONB_PREFIX + "PropertyOrder";
    public static final String JSONB_TYPE_ADAPTER = JSONB_PACKAGE + JSONB_PREFIX + "TypeAdapter";
    public static final String JSONB_TYPE_DESERIALIZER = JSONB_PACKAGE + JSONB_PREFIX + "TypeDeserializer";
    public static final String JSONB_TYPE_SERIALIZER = JSONB_PACKAGE + JSONB_PREFIX + "TypeSerializer";
    public static final String JSONB_VISIBILITY = JSONB_PACKAGE + JSONB_PREFIX + "Visibility";

    public static final List<String> JSONB_ANNOTATIONS = List.of(JSONB_CREATOR, JSONB_TRANSIENT_FQ_NAME, JSONB_ANNOTATION,
            JSONB_DATE_FORMAT, JSONB_NILLABLE, JSONB_NUMBER_FORMAT, JSONB_PROPERTY, JSONB_PROPERTY_ORDER,
            JSONB_TYPE_ADAPTER, JSONB_TYPE_DESERIALIZER, JSONB_TYPE_SERIALIZER, JSONB_VISIBILITY);

}
