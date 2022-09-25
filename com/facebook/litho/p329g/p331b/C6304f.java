package com.facebook.litho.p329g.p331b;

import android.support.p033v7.widget.C0710hr;
import com.facebook.litho.C6411u;
import com.facebook.litho.widget.C6427am;
import com.facebook.litho.widget.C6430ap;
import com.facebook.litho.widget.C6498dc;

/* renamed from: com.facebook.litho.g.b.f */
/* compiled from: PG */
public final class C6304f implements C6319u {

    /* renamed from: a */
    public final int f18606a;

    /* renamed from: b */
    public final int f18607b;

    /* renamed from: c */
    public int f18608c;

    /* renamed from: d */
    public int f18609d;

    /* renamed from: e */
    private final C6308j f18610e;

    @Deprecated
    public C6304f() {
        int i = C6302d.f18601e;
        throw null;
    }

    /* renamed from: a */
    public final int mo13303a() {
        return this.f18606a;
    }

    /* renamed from: b */
    public final int mo13304b() {
        return this.f18607b;
    }

    /* renamed from: c */
    public final C0710hr mo13305c() {
        return C6498dc.m17607a(this.f18607b, this.f18608c, this.f18609d);
    }

    /* renamed from: d */
    public final C6308j mo13306d() {
        return this.f18610e;
    }

    /* renamed from: e */
    public final C6427am mo13307e(C6411u uVar) {
        return new C6430ap(uVar.f19009b, this.f18606a);
    }

    @Deprecated
    public C6304f(int i, int i2, C6308j jVar, C6303e eVar) {
        this.f18608c = Integer.MAX_VALUE;
        this.f18609d = 1;
        if (i != 1 || i2 == Integer.MIN_VALUE || i2 == -1) {
            this.f18606a = i;
            this.f18607b = i2;
            this.f18610e = jVar == null ? C6302d.f18599a : jVar;
            if (eVar == null) {
                int i3 = C6302d.f18601e;
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Only snap to start is implemented for vertical lists");
    }
}
