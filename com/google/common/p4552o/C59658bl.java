package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.bl */
/* compiled from: PG */
public enum C59658bl implements C62957cd {
    VIOLATION_UNKNOWN(0),
    MISSING_CLIENT_CONVERSATION_DONE(1),
    FAILED_TO_START_GRAPH(2),
    STUCK_IN_PLAYING_TTS(3),
    STUCK_IN_PLAYING_TTS_OUTSIDE_OF_UTTERANCE(4),
    GRAPH_FAILED(5);
    

    /* renamed from: g */
    public final int f159980g;

    private C59658bl(int i) {
        this.f159980g = i;
    }

    /* renamed from: a */
    public static C59658bl m92474a(int i) {
        if (i == 0) {
            return VIOLATION_UNKNOWN;
        }
        if (i == 1) {
            return MISSING_CLIENT_CONVERSATION_DONE;
        }
        if (i == 2) {
            return FAILED_TO_START_GRAPH;
        }
        if (i == 3) {
            return STUCK_IN_PLAYING_TTS;
        }
        if (i == 4) {
            return STUCK_IN_PLAYING_TTS_OUTSIDE_OF_UTTERANCE;
        }
        if (i != 5) {
            return null;
        }
        return GRAPH_FAILED;
    }

    /* renamed from: b */
    public static C62959cf m92475b() {
        return C59657bk.f159972a;
    }

    public final int getNumber() {
        return this.f159980g;
    }

    public final String toString() {
        return Integer.toString(this.f159980g);
    }
}
