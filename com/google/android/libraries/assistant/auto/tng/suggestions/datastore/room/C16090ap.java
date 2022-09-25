package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import com.google.assistant.p3994s.p3995a.C53306j;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.ap */
/* compiled from: PG */
public enum C16090ap {
    HOME_SCREEN,
    SMART_CHIP,
    WIDGET,
    SIDE_CARD,
    MORRIS_DRIVING_SCREEN,
    COOLWALK,
    COOLWALK_MEDIA_CARD,
    VOICEPLATE_IMMERSIVE;

    /* renamed from: a */
    public static C16090ap m32978a(String str) {
        return (C16090ap) Enum.valueOf(C16090ap.class, str);
    }

    /* renamed from: b */
    public final C53306j mo22725b() {
        int ordinal = ordinal();
        if (ordinal == 4) {
            return C53306j.MORRIS_DRIVING_SCREEN;
        }
        if (ordinal == 5 || ordinal == 6 || ordinal == 7) {
            return C53306j.AUTO_PROJECTED;
        }
        return C53306j.AUTO_EMBEDDED;
    }

    /* renamed from: c */
    public final int mo22726c() {
        return ordinal() != 1 ? 1 : 2;
    }
}
