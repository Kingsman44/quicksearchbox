package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80696by;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80734di;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.p */
/* compiled from: PG */
final class C78490p extends C78391bn {

    /* renamed from: a */
    public final C78393bp f216158a;

    /* renamed from: b */
    public final C80734di f216159b;

    /* renamed from: c */
    public final C80696by f216160c;

    /* renamed from: d */
    public final Optional f216161d;

    /* renamed from: e */
    public final int f216162e;

    public C78490p(C78393bp bpVar, C80734di diVar, C80696by byVar, int i, Optional optional) {
        this.f216158a = bpVar;
        this.f216159b = diVar;
        this.f216160c = byVar;
        this.f216162e = i;
        this.f216161d = optional;
    }

    /* renamed from: a */
    public final C78390bm mo73343a() {
        return new C78489o(this);
    }

    /* renamed from: b */
    public final C78393bp mo73344b() {
        return this.f216158a;
    }

    /* renamed from: c */
    public final C80696by mo73345c() {
        return this.f216160c;
    }

    /* renamed from: d */
    public final C80734di mo73346d() {
        return this.f216159b;
    }

    /* renamed from: e */
    public final Optional mo73347e() {
        return this.f216161d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C78391bn) {
            C78391bn bnVar = (C78391bn) obj;
            if (this.f216158a.equals(bnVar.mo73344b()) && this.f216159b.equals(bnVar.mo73346d()) && this.f216160c.equals(bnVar.mo73345c())) {
                int i = this.f216162e;
                int f = bnVar.mo73348f();
                if (i != 0) {
                    return i == f && this.f216161d.equals(bnVar.mo73347e());
                }
                throw null;
            }
        }
    }

    /* renamed from: f */
    public final int mo73348f() {
        return this.f216162e;
    }

    public final int hashCode() {
        int hashCode = (((((this.f216158a.hashCode() ^ 1000003) * 1000003) ^ this.f216159b.hashCode()) * 1000003) ^ this.f216160c.hashCode()) * 1000003;
        int i = this.f216162e;
        if (i != 0) {
            return ((hashCode ^ i) * 1000003) ^ this.f216161d.hashCode();
        }
        throw null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f216158a);
        String valueOf2 = String.valueOf(this.f216159b);
        String valueOf3 = String.valueOf(this.f216160c);
        int i = this.f216162e;
        String str = i != 1 ? i != 2 ? i != 3 ? "null" : "DEFAULT" : "SMALL_PLATE" : "FULL_SCREEN";
        String valueOf4 = String.valueOf(this.f216161d);
        return "BaseStageInput{content=" + valueOf + ", heroChip=" + valueOf2 + ", blueBar=" + valueOf3 + ", inputPlateType=" + str + ", tactileContentKey=" + valueOf4 + "}";
    }
}
