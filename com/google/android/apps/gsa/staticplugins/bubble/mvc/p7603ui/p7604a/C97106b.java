package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7604a;

import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7610f.C97213a;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7610f.C97214b;
import com.google.android.libraries.p10982ad.C147446j;
import com.google.android.libraries.p10982ad.C147454r;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.b */
/* compiled from: PG */
public final class C97106b {

    /* renamed from: a */
    public final List f271315a = new ArrayList();

    /* renamed from: b */
    public final C147446j f271316b;

    /* renamed from: c */
    public final C147446j f271317c;

    /* renamed from: d */
    private C97214b f271318d;

    /* renamed from: e */
    private C97214b f271319e;

    public C97106b() {
        C97214b bVar = C97214b.f271609c;
        this.f271318d = bVar;
        this.f271319e = bVar;
        C147446j jVar = new C147446j(0.0f);
        this.f271316b = jVar;
        C147446j jVar2 = new C147446j(0.0f);
        this.f271317c = jVar2;
        jVar.mo124188n(new C97105a(this));
        jVar2.mo124188n(new C97105a(this));
    }

    /* renamed from: e */
    public static boolean m160742e(float f, C147446j jVar) {
        return f >= jVar.f397998d && f <= jVar.f397999e;
    }

    /* renamed from: f */
    private static C97214b m160743f(float f, float f2, C97214b bVar) {
        return (bVar.mo90592a() == f && bVar.mo90593b() == f2) ? bVar : new C97213a(f, f2);
    }

    /* renamed from: a */
    public final C97214b mo90472a() {
        C97214b f = m160743f(this.f271316b.mo124175a(), this.f271317c.mo124175a(), this.f271318d);
        this.f271318d = f;
        return f;
    }

    /* renamed from: b */
    public final C97214b mo90473b() {
        C97214b f = m160743f(this.f271316b.mo124176b(), this.f271317c.mo124176b(), this.f271319e);
        this.f271319e = f;
        return f;
    }

    /* renamed from: c */
    public final void mo90474c(C97214b bVar) {
        C97213a aVar = (C97213a) bVar;
        this.f271316b.mo124186l(aVar.f271607a);
        this.f271317c.mo124186l(aVar.f271608b);
    }

    /* renamed from: d */
    public final void mo90475d(C147454r rVar, C97214b bVar) {
        this.f271316b.mo124185k(rVar).mo124174a(bVar.mo90592a());
        this.f271317c.mo124185k(rVar).mo124174a(bVar.mo90593b());
    }
}
