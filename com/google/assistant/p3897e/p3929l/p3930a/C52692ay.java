package com.google.assistant.p3897e.p3929l.p3930a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.l.a.ay */
/* compiled from: PG */
public enum C52692ay implements C62957cd {
    UNKNOWN_FACE_ENROLLMENT_ERROR(0),
    MISSING_FRONTAL_POSE(1),
    FACE_NOT_DETECTED(2),
    MULTIPLE_FACE_DETECTED(3),
    FACE_WITHOUT_SIGNATURE(4),
    FACE_DETECTION_LOW_CONFIDENCE(5),
    FACE_LANDMARK_LOW_CONFIDENCE(6),
    FACE_WITHOUT_CONFIDENCE(7),
    FACE_TOO_SMALL(8),
    FAILED_TO_READ_IMAGE(9),
    FAILED_TO_DECODE_IMAGE(10),
    FACE_DETECTION_ERROR(11),
    FACE_WITHOUT_EMBEDDING_CONFIDENCE(12);
    

    /* renamed from: n */
    public final int f138334n;

    private C52692ay(int i) {
        this.f138334n = i;
    }

    /* renamed from: a */
    public static C52692ay m86689a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_FACE_ENROLLMENT_ERROR;
            case 1:
                return MISSING_FRONTAL_POSE;
            case 2:
                return FACE_NOT_DETECTED;
            case 3:
                return MULTIPLE_FACE_DETECTED;
            case 4:
                return FACE_WITHOUT_SIGNATURE;
            case 5:
                return FACE_DETECTION_LOW_CONFIDENCE;
            case 6:
                return FACE_LANDMARK_LOW_CONFIDENCE;
            case 7:
                return FACE_WITHOUT_CONFIDENCE;
            case 8:
                return FACE_TOO_SMALL;
            case 9:
                return FAILED_TO_READ_IMAGE;
            case 10:
                return FAILED_TO_DECODE_IMAGE;
            case 11:
                return FACE_DETECTION_ERROR;
            case 12:
                return FACE_WITHOUT_EMBEDDING_CONFIDENCE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m86690b() {
        return C52691ax.f138319a;
    }

    public final int getNumber() {
        return this.f138334n;
    }

    public final String toString() {
        return Integer.toString(this.f138334n);
    }
}
