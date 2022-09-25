package com.google.android.apps.search.transcription.voiceime;

import java.util.Arrays;

/* renamed from: com.google.android.apps.search.transcription.voiceime.ay */
/* compiled from: PG */
public final class C141987ay {

    /* renamed from: a */
    public final int f385275a;

    /* renamed from: b */
    public final int f385276b;

    public C141987ay(int i, int i2) {
        this.f385275a = Math.min(i, i2);
        this.f385276b = Math.max(i, i2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C141987ay)) {
            return false;
        }
        C141987ay ayVar = (C141987ay) obj;
        if (this.f385275a == ayVar.f385275a && this.f385276b == ayVar.f385276b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f385275a), Integer.valueOf(this.f385276b)});
    }
}
