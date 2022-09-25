package com.google.android.apps.gsa.assist.p503c;

import com.google.android.apps.gsa.assist.p503c.p504a.C9388a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assist.c.c */
/* compiled from: PG */
public final class C9390c implements C9388a {

    /* renamed from: a */
    private final C9394g f32555a;

    public C9390c(C9394g gVar) {
        this.f32555a = gVar;
    }

    /* renamed from: h */
    private final boolean m23857h(int i) {
        int a = this.f32555a.mo17589a();
        return a > 0 && (i & a) != 0;
    }

    /* renamed from: a */
    public final void mo17579a(boolean z) {
        int i = 1;
        if (true == z) {
            i = 3;
        }
        this.f32555a.mo17590b(i);
    }

    /* renamed from: b */
    public final void mo17580b() {
        this.f32555a.mo17590b(-1);
    }

    /* renamed from: c */
    public final void mo17581c() {
        this.f32555a.mo17590b(0);
    }

    /* renamed from: d */
    public final boolean mo17582d() {
        return m23857h(2);
    }

    /* renamed from: e */
    public final boolean mo17583e() {
        boolean h = m23857h(1);
        C58976aa aaVar = C58975e.f156826a;
        return h;
    }

    /* renamed from: f */
    public final boolean mo17584f() {
        return false;
    }

    /* renamed from: g */
    public final boolean mo17585g() {
        return this.f32555a.mo17589a() == -1;
    }
}
