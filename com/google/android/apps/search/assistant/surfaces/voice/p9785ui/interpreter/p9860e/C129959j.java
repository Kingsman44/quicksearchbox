package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.j */
/* compiled from: PG */
public enum C129959j {
    INTRO_STATE,
    WAITING_STATE,
    LANGUAGE_UNDECIDED_STATE,
    TRANSCRIPTION_STATE,
    TRANSLATION_STATE,
    STATE_NOT_SET;

    /* renamed from: a */
    public static C129959j m212139a(int i) {
        if (i == 0) {
            return STATE_NOT_SET;
        }
        if (i == 1) {
            return INTRO_STATE;
        }
        if (i == 2) {
            return WAITING_STATE;
        }
        if (i == 4) {
            return LANGUAGE_UNDECIDED_STATE;
        }
        if (i == 5) {
            return TRANSCRIPTION_STATE;
        }
        if (i != 6) {
            return null;
        }
        return TRANSLATION_STATE;
    }
}
