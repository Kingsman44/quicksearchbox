package androidx.media3.exoplayer.p150j;

import androidx.media3.common.C2652bn;
import androidx.media3.common.p136b.C2633u;

/* renamed from: androidx.media3.exoplayer.j.ac */
/* compiled from: PG */
public final class C3196ac {

    /* renamed from: a */
    public final C2652bn f9603a;

    /* renamed from: b */
    public final int[] f9604b;

    public C3196ac(C2652bn bnVar, int[] iArr) {
        if (iArr.length == 0) {
            C2633u.m7048c("ETSDefinition", C2633u.m7046a("Empty tracks are not allowed", new IllegalArgumentException()));
        }
        this.f9603a = bnVar;
        this.f9604b = iArr;
    }
}
