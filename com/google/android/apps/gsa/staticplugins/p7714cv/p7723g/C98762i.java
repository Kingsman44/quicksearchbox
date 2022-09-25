package com.google.android.apps.gsa.staticplugins.p7714cv.p7723g;

import com.google.android.apps.gsa.c.f.u;
import com.google.android.apps.gsa.p8889z.p8907d.p8908a.C118947a;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.speech.C90603k;
import com.google.android.apps.gsa.shared.speech.p7139a.C90511c;
import com.google.android.apps.gsa.shared.speech.p7139a.C90513e;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.android.apps.gsa.shared.speech.p7139a.C90528t;
import com.google.android.apps.gsa.speech.p7269b.C92216a;
import com.google.android.apps.gsa.speech.p7294j.C92435e;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.g.i */
/* compiled from: PG */
public final class C98762i implements C92216a {

    /* renamed from: b */
    private static final C59071e f275890b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cv.g.i");

    /* renamed from: a */
    public final List f275891a = new ArrayList();

    /* renamed from: c */
    private final C118947a f275892c;

    /* renamed from: d */
    private final C92435e f275893d;

    /* renamed from: e */
    private final C98770q f275894e;

    /* renamed from: f */
    private final C68214a f275895f;

    /* renamed from: g */
    private final C58833ax f275896g;

    /* renamed from: h */
    private final u f275897h;

    /* renamed from: i */
    private C90528t f275898i;

    public C98762i(C118947a aVar, C92435e eVar, C98770q qVar, C68214a aVar2, C58833ax axVar, u uVar) {
        this.f275892c = aVar;
        this.f275893d = eVar;
        this.f275894e = qVar;
        this.f275895f = aVar2;
        this.f275896g = axVar;
        this.f275897h = uVar;
    }

    /* renamed from: d */
    private final void m163610d(C90528t tVar, boolean z) {
        int i = tVar.f253081b;
        C58976aa aaVar = C58975e.f156826a;
        ((C89911f) this.f275895f.mo27525b()).mo83756b(tVar).mo83721a();
        if (z) {
            this.f275892c.mo91284d(i);
        }
        int a = this.f275894e.mo91296a(i);
        if (a == 0) {
            C90528t tVar2 = this.f275898i;
            if (tVar2 != null) {
                tVar = tVar2;
            }
            C59104x d = f275890b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "GacsErrorProcessor");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(tVar)).mo56372aa(31096)).mo56387q("onFatalError, processing error from engine(%d)", tVar.f253081b);
            this.f275897h.h("GacsErrorProcessor", this.f275896g);
            this.f275893d.mo87095a(tVar);
        } else if (a != 1) {
            C59104x d2 = f275890b.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "GacsErrorProcessor");
            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(tVar)).mo56372aa(31098)).mo56395y("onFatalError, ignoring error from engine(%d): %s", i, tVar);
        } else {
            C59104x d3 = f275890b.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "GacsErrorProcessor");
            ((C59052c) ((C59052c) ((C59052c) d3).mo56382g(tVar)).mo56372aa(31097)).mo56387q("onFatalError, primary engine(%d) error, fallback to secondary", i);
            this.f275898i = tVar;
            for (C98760g b : this.f275891a) {
                b.mo91294b();
            }
        }
    }

    /* renamed from: a */
    public final void mo70939a(C90528t tVar) {
        m163610d(tVar, true);
    }

    /* renamed from: b */
    public final void mo70940b(C90528t tVar) {
        if ((tVar instanceof C90511c) || (tVar instanceof C90513e) || (tVar instanceof C90523o)) {
            m163610d(tVar, false);
            return;
        }
        C59104x d = f275890b.mo56226d();
        d.mo56378ag(C58975e.f156826a, "GacsErrorProcessor");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(tVar)).mo56372aa(31099)).mo56386p("onNonFatalError");
        ((C89911f) this.f275895f.mo27525b()).mo83756b(tVar).mo83721a();
    }

    /* renamed from: c */
    public final void mo70941c(C90603k kVar) {
    }
}
