package com.google.android.apps.search.googleapp.p10516t.p10522f;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.search.googleapp.t.f.b */
/* compiled from: PG */
public enum C139707b implements C62957cd {
    SRP_SUCCESS(1),
    ASSISTANT_SUCCESS(2),
    SRP_UNKNOWN_FAILURE(3),
    ASSISTANT_FAILURE(4),
    CANCEL(5),
    RECOGNITION_FAILURE(6),
    ACCOUNT_FAILURE(7),
    NETWORK_TIMEOUT(8),
    NETWORK_FAILURE(9),
    NO_SPEECH_DETECTED(10),
    AUDIO_LISTENING_FAILURE(11),
    SRP_SERVER_ERROR(12),
    SRP_SSL_FAILURE(13),
    ASSISTANT_LAUNCHED(14),
    RESTARTED_BY_NUDGE(15),
    SBT_SEARCH_BOX_CLICK_SUCCESS(16);
    

    /* renamed from: q */
    public final int f379733q;

    private C139707b(int i) {
        this.f379733q = i;
    }

    public final int getNumber() {
        return this.f379733q;
    }

    public final String toString() {
        return Integer.toString(this.f379733q);
    }
}
