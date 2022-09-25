package com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.gsa.speech.hotword.enrollmentutils.a.e */
/* compiled from: PG */
public enum C92381e implements C62957cd {
    UNKNOWN_ERROR(0),
    ACCOUNT_NOT_LINKED(2),
    ACCOUNT_LINKING_VALIDATION_FAILED(3),
    ENROLLMENT_NOT_UPLOADED(4),
    ENROLLMENT_UTTERANCES_NOT_READY(5),
    CLOUD_ENROLLMENT_FAILED(6),
    SETTINGS_UPDATE_FAILED(7),
    ENROLLMENT_TIMED_OUT(8),
    CAN_ENROLL_CHECK_FAILED(9),
    NO_ACCOUNT_LOGGED_IN(10),
    NO_ENROLLMENT_ACTIVITY(11),
    INVALID_SCREEN(12),
    INVALID_UTTERANCE_COUNT(13),
    AGSA_NOT_DEFAULT_APP(14),
    AUDIO_HISTORY_NOT_FETCHED(15),
    AUDIO_PERMISSION_NOT_FOUND(16),
    FAMILY_NOT_FETCHED(17),
    RETRAIN_FAILED(18),
    OPA_INELIGIBLE(19);
    

    /* renamed from: t */
    public final int f257628t;

    private C92381e(int i) {
        this.f257628t = i;
    }

    public final int getNumber() {
        return this.f257628t;
    }

    public final String toString() {
        return Integer.toString(this.f257628t);
    }
}
