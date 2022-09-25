package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7728a.p7733d.p7734a;

import com.google.android.apps.gsa.c.f.u;
import com.google.android.apps.gsa.p8889z.p8907d.p8908a.C118947a;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8912b.C118979t;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.speech.C90603k;
import com.google.android.apps.gsa.shared.speech.p7139a.C90510b;
import com.google.android.apps.gsa.shared.speech.p7139a.C90511c;
import com.google.android.apps.gsa.shared.speech.p7139a.C90513e;
import com.google.android.apps.gsa.shared.speech.p7139a.C90528t;
import com.google.android.apps.gsa.speech.p7269b.C92216a;
import com.google.android.apps.gsa.staticplugins.p7714cv.p7723g.C98770q;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.a.d.a.b */
/* compiled from: PG */
public final class C98890b implements C92216a {

    /* renamed from: b */
    private static final C59071e f276334b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cv.i.b.a.d.a.b");

    /* renamed from: a */
    public boolean f276335a;

    /* renamed from: c */
    private final C118947a f276336c;

    /* renamed from: d */
    private final C118979t f276337d;

    /* renamed from: e */
    private final C98770q f276338e;

    /* renamed from: f */
    private final C68214a f276339f;

    /* renamed from: g */
    private final C58833ax f276340g;

    /* renamed from: h */
    private final C68214a f276341h;

    public C98890b(C118947a aVar, C118979t tVar, C98770q qVar, C68214a aVar2, C58833ax axVar, C68214a aVar3) {
        this.f276336c = aVar;
        this.f276337d = tVar;
        this.f276338e = qVar;
        this.f276339f = aVar2;
        this.f276340g = axVar;
        this.f276341h = aVar3;
    }

    /* renamed from: a */
    public final void mo70939a(C90528t tVar) {
        mo91319d(tVar, true);
    }

    /* renamed from: b */
    public final void mo70940b(C90528t tVar) {
        if ((tVar instanceof C90511c) || (tVar instanceof C90513e)) {
            mo91319d(tVar, false);
            return;
        }
        C59104x d = f276334b.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ErrorProcessor");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(tVar)).mo56372aa(31275)).mo56386p("onNonFatalError");
        ((C89911f) this.f276339f.mo27525b()).mo83756b(tVar).mo83721a();
    }

    /* renamed from: c */
    public final void mo70941c(C90603k kVar) {
    }

    /* renamed from: d */
    public final void mo91319d(C90528t tVar, boolean z) {
        int i = tVar.f253081b;
        C58976aa aaVar = C58975e.f156826a;
        ((C89911f) this.f276339f.mo27525b()).mo83756b(tVar).mo83721a();
        if (z) {
            this.f276336c.mo91284d(i);
        }
        if (this.f276338e.mo91296a(i) != 0) {
            C59104x d = f276334b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ErrorProcessor");
            ((C59052c) ((C59052c) d).mo56372aa(31269)).mo56395y("onFatalError, ignoring error from engine(%d): %s", i, tVar);
            return;
        }
        C59071e eVar = f276334b;
        C59104x d2 = eVar.mo56226d();
        d2.mo56378ag(C58975e.f156826a, "ErrorProcessor");
        ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(tVar)).mo56372aa(31271)).mo56387q("onFatalError, processing error from engine(%d)", tVar.f253081b);
        ((u) this.f276341h.mo27525b()).g("ErrorProcessor", this.f276340g, false);
        if (tVar instanceof C90510b) {
            C59104x b = eVar.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ErrorProcessor");
            ((C59052c) ((C59052c) b).mo56372aa(31274)).mo56386p("No recognizers available.");
        } else {
            C59104x c = eVar.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ErrorProcessor");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(tVar)).mo56372aa(31273)).mo56386p("onError");
        }
        this.f276337d.mo91307d(2, this.f276335a, tVar);
    }
}
