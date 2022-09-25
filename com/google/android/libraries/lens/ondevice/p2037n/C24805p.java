package com.google.android.libraries.lens.ondevice.p2037n;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.lens.ondevice.n.p */
/* compiled from: PG */
public enum C24805p implements C62957cd {
    UNKNOWN_EVENT(0),
    PRIMITIVE_LOAD_START(1),
    PRIMITIVE_LOAD_SUCCESS(2),
    PRIMITIVE_LOAD_ERROR(3),
    PRIMITIVE_RUN_START(4),
    PRIMITIVE_RUN_SUCCESS(5),
    PRIMITIVE_RUN_ERROR(6),
    CASCADE_RUN_START(7),
    CASCADE_RUN_SUCCESS(8),
    CASCADE_RUN_ERROR(9),
    ENGINE_INIT_START(10),
    ENGINE_INIT_SUCCESS(11),
    ENGINE_INIT_ERROR(12),
    DYNAMIC_LOADING_START(13),
    DYNAMIC_LOADING_SUCCESS(14),
    DYNAMIC_LOADING_ERROR(15),
    DOWNLOAD_REQUESTED(16),
    DOWNLOAD_MODEL_AVAILABLE(17),
    FEATURE_SPLIT_INSTALL_REQUESTED(18),
    FEATURE_SPLIT_MODULE_AVAILABLE(19),
    CASCADE_DEPENDENCIES_CHECK_START(20),
    CASCADE_DEPENDENCIES_CHECK_SUCCESS(21),
    CASCADE_DEPENDENCIES_CHECK_ERROR(22),
    MODEL_RETRIEVAL_START(23),
    MODEL_RETRIEVAL_SUCCESS(24),
    MODEL_RETRIEVAL_ERROR(25);
    

    /* renamed from: A */
    public final int f67802A;

    private C24805p(int i) {
        this.f67802A = i;
    }

    /* renamed from: a */
    public static C24805p m45929a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_EVENT;
            case 1:
                return PRIMITIVE_LOAD_START;
            case 2:
                return PRIMITIVE_LOAD_SUCCESS;
            case 3:
                return PRIMITIVE_LOAD_ERROR;
            case 4:
                return PRIMITIVE_RUN_START;
            case 5:
                return PRIMITIVE_RUN_SUCCESS;
            case 6:
                return PRIMITIVE_RUN_ERROR;
            case 7:
                return CASCADE_RUN_START;
            case 8:
                return CASCADE_RUN_SUCCESS;
            case 9:
                return CASCADE_RUN_ERROR;
            case 10:
                return ENGINE_INIT_START;
            case 11:
                return ENGINE_INIT_SUCCESS;
            case 12:
                return ENGINE_INIT_ERROR;
            case 13:
                return DYNAMIC_LOADING_START;
            case 14:
                return DYNAMIC_LOADING_SUCCESS;
            case 15:
                return DYNAMIC_LOADING_ERROR;
            case 16:
                return DOWNLOAD_REQUESTED;
            case 17:
                return DOWNLOAD_MODEL_AVAILABLE;
            case 18:
                return FEATURE_SPLIT_INSTALL_REQUESTED;
            case 19:
                return FEATURE_SPLIT_MODULE_AVAILABLE;
            case 20:
                return CASCADE_DEPENDENCIES_CHECK_START;
            case 21:
                return CASCADE_DEPENDENCIES_CHECK_SUCCESS;
            case 22:
                return CASCADE_DEPENDENCIES_CHECK_ERROR;
            case 23:
                return MODEL_RETRIEVAL_START;
            case 24:
                return MODEL_RETRIEVAL_SUCCESS;
            case 25:
                return MODEL_RETRIEVAL_ERROR;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m45930b() {
        return C24804o.f67774a;
    }

    public final int getNumber() {
        return this.f67802A;
    }

    public final String toString() {
        return Integer.toString(this.f67802A);
    }
}
