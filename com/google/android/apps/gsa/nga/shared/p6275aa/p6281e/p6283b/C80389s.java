package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.b.s */
/* compiled from: PG */
public enum C80389s implements C62957cd {
    DEFAULT_KEY(0),
    APP_FOREGROUND(1),
    APP_FOREGROUND_SEARCH(2),
    APP_BACKGROUND(3),
    APP_BACKGROUND_SEARCH(4),
    HIGH_CONFIDENCE_COMPLEX_QUERIES(5),
    DEFAULT_1P_ACTIONS(6),
    NEWS(7),
    WEATHER(8),
    MEDIA_HIGH_CONFIDENCE(9),
    SPORTSTALK(10),
    INCOMPLETE_QUERY(11),
    KNOWLEDGE_ANSWER(12),
    LOCAL(13),
    MEDIA_LOW_CONFIDENCE(14),
    LOW_CONFIDENCE_COMPLEX_QUERIES(15),
    OPEN_URL(16),
    OPEN_URL_SEARCH(18),
    CLOUD_HANDOVER(17),
    DICTATION(19),
    IN_APP_SEARCH(20),
    DEEPLINK_IN_FOREGROUND_APP_SEARCH(21),
    AUTOBOT_SEARCH_ON_SITE(22),
    UNRECOGNIZED(-1);
    

    /* renamed from: y */
    private final int f220629y;

    private C80389s(int i) {
        this.f220629y = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f220629y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
