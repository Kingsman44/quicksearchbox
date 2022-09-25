package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.fm */
/* compiled from: PG */
public enum C82924fm implements C62957cd {
    POST_PROCESSOR_TYPE_UNDEFINED(0),
    SUGGESTIONS(1),
    SURVEY(2),
    DICTATION(3),
    CACHED_ANSWERS_POST_PROCESSOR(4),
    LOCKSCREEN_ARBITRATOR(5),
    AOL_ARBITRATOR(6),
    GEN_X_TTS(7),
    ABLATION(8);
    

    /* renamed from: j */
    public final int f226236j;

    private C82924fm(int i) {
        this.f226236j = i;
    }

    /* renamed from: a */
    public static C82924fm m132429a(int i) {
        switch (i) {
            case 0:
                return POST_PROCESSOR_TYPE_UNDEFINED;
            case 1:
                return SUGGESTIONS;
            case 2:
                return SURVEY;
            case 3:
                return DICTATION;
            case 4:
                return CACHED_ANSWERS_POST_PROCESSOR;
            case 5:
                return LOCKSCREEN_ARBITRATOR;
            case 6:
                return AOL_ARBITRATOR;
            case 7:
                return GEN_X_TTS;
            case 8:
                return ABLATION;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m132430b() {
        return C82923fl.f226225a;
    }

    public final int getNumber() {
        return this.f226236j;
    }

    public final String toString() {
        return Integer.toString(this.f226236j);
    }
}
