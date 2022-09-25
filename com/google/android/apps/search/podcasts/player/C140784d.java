package com.google.android.apps.search.podcasts.player;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.player.d */
/* compiled from: PG */
public final class C140784d {

    /* renamed from: a */
    public final float f382275a;

    /* renamed from: b */
    public final boolean f382276b;

    public C140784d(float f, boolean z) {
        this.f382275a = f;
        this.f382276b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C140784d)) {
            return false;
        }
        C140784d dVar = (C140784d) obj;
        return C69664n.m101066l(Float.valueOf(this.f382275a), Float.valueOf(dVar.f382275a)) && this.f382276b == dVar.f382276b;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f382275a) * 31) + (this.f382276b ? 1 : 0);
    }

    public final String toString() {
        float f = this.f382275a;
        boolean z = this.f382276b;
        return "PlaybackParameters(playbackSpeed=" + f + ", trimSilence=" + z + ")";
    }
}
