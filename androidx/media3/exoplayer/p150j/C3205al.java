package androidx.media3.exoplayer.p150j;

import androidx.media3.common.C2657bs;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.C2895cx;

/* renamed from: androidx.media3.exoplayer.j.al */
/* compiled from: PG */
public final class C3205al {

    /* renamed from: a */
    public final int f9613a;

    /* renamed from: b */
    public final C2895cx[] f9614b;

    /* renamed from: c */
    public final C3197ad[] f9615c;

    /* renamed from: d */
    public final C2657bs f9616d;

    /* renamed from: e */
    public final Object f9617e;

    public C3205al(C2895cx[] cxVarArr, C3197ad[] adVarArr, C2657bs bsVar, Object obj) {
        this.f9614b = cxVarArr;
        this.f9615c = (C3197ad[]) adVarArr.clone();
        this.f9616d = bsVar;
        this.f9617e = obj;
        this.f9613a = cxVarArr.length;
    }

    /* renamed from: a */
    public final boolean mo7206a(C3205al alVar, int i) {
        if (alVar != null && C2612ak.m6951aa(this.f9614b[i], alVar.f9614b[i]) && C2612ak.m6951aa(this.f9615c[i], alVar.f9615c[i])) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo7207b(int i) {
        return this.f9614b[i] != null;
    }
}
