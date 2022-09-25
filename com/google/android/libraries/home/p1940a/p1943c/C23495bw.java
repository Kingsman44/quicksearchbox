package com.google.android.libraries.home.p1940a.p1943c;

import java.util.LinkedHashMap;
import p5462h.p5463a.C69505av;

/* renamed from: com.google.android.libraries.home.a.c.bw */
/* compiled from: PG */
public enum C23495bw {
    UNKNOWN_PLAYBACK_STATE(0),
    PLAYING(1),
    BUFFERING(2),
    PAUSED(3),
    FAST_FORWARDING(4),
    REWINDING(5);
    

    /* renamed from: g */
    public final int f64243g;

    static {
        int i;
        int b = C69505av.m100860b(r1);
        if (b < 16) {
            b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(b);
        for (C23495bw bwVar : values()) {
            linkedHashMap.put(Integer.valueOf(bwVar.f64243g), bwVar);
        }
    }

    private C23495bw(int i) {
        this.f64243g = i;
    }
}
