package com.google.android.apps.gsa.staticplugins.avocado;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.fa */
/* compiled from: PG */
public enum C94303fa implements C62957cd {
    LOCAL_FACE_MATCH_ERROR_UNDEFINED(0),
    CAMERA_ERROR(1),
    SEND_IMAGE_FAILED(2),
    DETECTOR_NOT_OPERATIONAL(3),
    UP_DOWN_POSES_NOT_SUPPORTED(4),
    TRANSFORM_IMAGE_FAILED(5),
    FRONT_CAMERA_MISSING(6),
    CLOUD_VALIDATION_OR_FLIP_THE_AVOCADO_BIT_CANCELED(7),
    CLOUD_VALIDATION_OR_FLIP_THE_AVOCADO_BIT_EXCEPTION(8),
    FLIP_THE_AVOCADO_BIT_FAILED(9),
    CHECK_ENROLLMENT_STATUS_FAILED(10);
    

    /* renamed from: l */
    public final int f263529l;

    private C94303fa(int i) {
        this.f263529l = i;
    }

    /* renamed from: a */
    public static C94303fa m155612a(int i) {
        switch (i) {
            case 0:
                return LOCAL_FACE_MATCH_ERROR_UNDEFINED;
            case 1:
                return CAMERA_ERROR;
            case 2:
                return SEND_IMAGE_FAILED;
            case 3:
                return DETECTOR_NOT_OPERATIONAL;
            case 4:
                return UP_DOWN_POSES_NOT_SUPPORTED;
            case 5:
                return TRANSFORM_IMAGE_FAILED;
            case 6:
                return FRONT_CAMERA_MISSING;
            case 7:
                return CLOUD_VALIDATION_OR_FLIP_THE_AVOCADO_BIT_CANCELED;
            case 8:
                return CLOUD_VALIDATION_OR_FLIP_THE_AVOCADO_BIT_EXCEPTION;
            case 9:
                return FLIP_THE_AVOCADO_BIT_FAILED;
            case 10:
                return CHECK_ENROLLMENT_STATUS_FAILED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m155613b() {
        return C94301ez.f263515a;
    }

    public final int getNumber() {
        return this.f263529l;
    }

    public final String toString() {
        return Integer.toString(this.f263529l);
    }
}
