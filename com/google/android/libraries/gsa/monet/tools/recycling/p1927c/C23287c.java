package com.google.android.libraries.gsa.monet.tools.recycling.p1927c;

import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;
import java.util.List;

/* renamed from: com.google.android.libraries.gsa.monet.tools.recycling.c.c */
/* compiled from: PG */
final class C23287c implements C23286b {

    /* renamed from: a */
    final /* synthetic */ C23290f f63760a;

    public C23287c(C23290f fVar) {
        this.f63760a = fVar;
    }

    /* renamed from: a */
    public final void mo28761a(String str, int i, C23293i iVar) {
        int R = this.f63760a.mo28770R(str);
        C23290f fVar = this.f63760a;
        C23286b bVar = fVar.f63765E;
        if (bVar != null) {
            bVar.mo28761a(fVar.f63126Q.mo28342l(), R + i, iVar);
        }
    }

    /* renamed from: b */
    public final void mo28762b(String str, int i, int i2) {
        int R = this.f63760a.mo28770R(str);
        C23290f fVar = this.f63760a;
        C23286b bVar = fVar.f63765E;
        if (bVar != null) {
            bVar.mo28762b(fVar.f63126Q.mo28342l(), i + R, R + i2);
        }
    }

    /* renamed from: c */
    public final void mo28763c(String str, int i) {
        int R = this.f63760a.mo28770R(str);
        C23290f fVar = this.f63760a;
        C23286b bVar = fVar.f63765E;
        if (bVar != null) {
            bVar.mo28763c(fVar.f63126Q.mo28342l(), R + i);
        }
    }

    /* renamed from: d */
    public final void mo28764d(String str, int i, List list) {
        int R = this.f63760a.mo28770R(str);
        C23290f fVar = this.f63760a;
        C23286b bVar = fVar.f63765E;
        if (bVar != null) {
            bVar.mo28764d(fVar.f63126Q.mo28342l(), R + i, list);
        }
    }

    /* renamed from: e */
    public final void mo28765e(String str, int i, int i2, int i3) {
        int R = this.f63760a.mo28770R(str);
        C23290f fVar = this.f63760a;
        C23286b bVar = fVar.f63765E;
        if (bVar != null) {
            bVar.mo28765e(fVar.f63126Q.mo28342l(), i + R, R + i2, i3);
        }
    }

    /* renamed from: f */
    public final void mo28766f(String str, int i, int i2) {
        C23067b.m43236i(this.f63760a.mo28773U(str), "Remove attempted on an untracked child");
        int R = this.f63760a.mo28770R(str);
        C23290f fVar = this.f63760a;
        C23286b bVar = fVar.f63765E;
        if (bVar != null) {
            bVar.mo28766f(fVar.f63126Q.mo28342l(), R + i, i2);
        }
    }
}
