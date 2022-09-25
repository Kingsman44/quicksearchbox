package com.google.android.libraries.lens.sdk.avs.data;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.libraries.lens.sdk.avs.data.i */
/* compiled from: PG */
public enum C24874i implements C62957cd {
    UNSPECIFIED(0),
    LENS_PRIME_ENGINE_READY(1),
    LENS_PRIME_SESSION_REQUEST_TO_CONNECT(2),
    LENS_PRIME_QUERY_REQUEST(3),
    LENS_PRIME_QUERY_RESPONSE(4),
    LENS_PROACTIVE_TEXT_PIPELINE_DENYLIST_TERMINATION(5),
    LENS_PROACTIVE_TEXT_PIPELINE_WITH_SHOPPING_DOMAIN_PASSED(6),
    LENS_PROACTIVE_PARTICLE_EXTRACTION_PASSED(7),
    LENS_PROACTIVE_SHOPPING_CLASSIFICATION_PASSED(8),
    LENS_PROACTIVE_SENSITIVITY_CLASSIFICATION_PASSED(9),
    LENS_PROACTIVE_RAID_DETECTIONS_FOUND(10),
    LENS_PROACTIVE_POST_SALIENCY_DETECTIONS_FOUND(11),
    LENS_PRIME_TRANSLATE_RESPONSE(12),
    LENS_PRIME_ERROR(13),
    LENS_PRIME_SESSION_STOPPED(14),
    LENS_PROACTIVE_SHOPPING_CLASSIFICATION_PRIMITIVE_START(15),
    LENS_PROACTIVE_SHOPPING_CLASSIFICATION_PRIMITIVE_END(16),
    LENS_PROACTIVE_SENSITIVITY_CLASSIFICATION_PRIMITIVE_START(17),
    LENS_PROACTIVE_SENSITIVITY_CLASSIFICATION_PRIMITIVE_END(18),
    LENS_PROACTIVE_SALIENT_REGION_DETECTION_PRIMITIVE_START(19),
    LENS_PROACTIVE_SALIENT_REGION_DETECTION_PRIMITIVE_END(20),
    LENS_PROACTIVE_PARTICLE_EXTRACTOR_ENGINE_PRIMITIVE_START(21),
    LENS_PROACTIVE_PARTICLE_EXTRACTOR_ENGINE_PRIMITIVE_END(22);
    

    /* renamed from: x */
    private final int f67957x;

    private C24874i(int i) {
        this.f67957x = i;
    }

    public final int getNumber() {
        return this.f67957x;
    }

    public final String toString() {
        return Integer.toString(this.f67957x);
    }
}