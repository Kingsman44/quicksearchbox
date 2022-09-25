package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.d.b */
/* compiled from: PG */
public enum C127282b {
    LAUNCHER,
    VOICE_SEARCH,
    TYPE_NOT_SET;

    /* renamed from: a */
    public static C127282b m208209a(int i) {
        if (i == 0) {
            return TYPE_NOT_SET;
        }
        if (i == 1) {
            return LAUNCHER;
        }
        if (i != 2) {
            return null;
        }
        return VOICE_SEARCH;
    }
}
