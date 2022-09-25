package com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.f.a.g.b */
/* compiled from: PG */
public enum C127454b implements C62957cd {
    UNKNOWN(0),
    MIC_ICON(1),
    SUGGESTION_CHIP(2),
    CORRECTION_CHIP(3),
    TEXT_SUBMIT(4),
    CSAT_FEEDBACK_SURVEY(5),
    CLIENT_INPUT(6),
    INLINE_REFINEMENT_QUERY(7),
    TRY_SAYING_SUGGESTION_TEXT_QUERY(8),
    UNRECOGNIZED(-1);
    

    /* renamed from: k */
    private final int f350935k;

    private C127454b(int i) {
        this.f350935k = i;
    }

    /* renamed from: a */
    public static C127454b m208419a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return MIC_ICON;
            case 2:
                return SUGGESTION_CHIP;
            case 3:
                return CORRECTION_CHIP;
            case 4:
                return TEXT_SUBMIT;
            case 5:
                return CSAT_FEEDBACK_SURVEY;
            case 6:
                return CLIENT_INPUT;
            case 7:
                return INLINE_REFINEMENT_QUERY;
            case 8:
                return TRY_SAYING_SUGGESTION_TEXT_QUERY;
            default:
                return null;
        }
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f350935k;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
