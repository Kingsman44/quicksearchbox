package com.facebook.litho.p329g.p331b;

import android.support.p033v7.widget.C0710hr;
import com.facebook.litho.C6411u;
import com.facebook.litho.widget.C6416ab;
import com.facebook.litho.widget.C6427am;
import com.facebook.litho.widget.C6498dc;

/* renamed from: com.facebook.litho.g.b.c */
/* compiled from: PG */
public final class C6301c implements C6319u {

    /* renamed from: a */
    public final int f18593a;

    /* renamed from: b */
    public final int f18594b;

    /* renamed from: c */
    public int f18595c = Integer.MAX_VALUE;

    /* renamed from: d */
    public int f18596d = 1;

    /* renamed from: e */
    private final int f18597e;

    /* renamed from: f */
    private final C6308j f18598f;

    @Deprecated
    public C6301c(int i, int i2, C6308j jVar, C6300b bVar, int i3) {
        this.f18593a = i;
        this.f18597e = i2;
        this.f18598f = jVar == null ? C6299a.f18584a : jVar;
        if (bVar == null) {
            int i4 = C6299a.f18586g;
        }
        this.f18594b = i3;
    }

    /* renamed from: a */
    public final int mo13303a() {
        return this.f18593a;
    }

    /* renamed from: b */
    public final int mo13304b() {
        return this.f18594b;
    }

    /* renamed from: c */
    public final C0710hr mo13305c() {
        return C6498dc.m17607a(this.f18594b, this.f18595c, this.f18596d);
    }

    /* renamed from: d */
    public final C6308j mo13306d() {
        return this.f18598f;
    }

    /* renamed from: e */
    public final C6427am mo13307e(C6411u uVar) {
        return new C6416ab(uVar.f19009b, this.f18597e, this.f18593a);
    }
}
