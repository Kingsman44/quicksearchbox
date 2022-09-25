package com.google.android.apps.gsa.staticplugins.opa.p8296ar.p8298b;

import android.text.TextUtils;
import com.google.android.apps.gsa.opa.p6443g.p6446c.C83692a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90055dg;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C107992as;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C107997ax;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C108013bm;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3803ag.p3804a.C48855bv;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ar.b.g */
/* compiled from: PG */
public final class C107408g implements C83692a, C90991b {

    /* renamed from: a */
    private final C108013bm f298921a;

    /* renamed from: b */
    private final C22871g f298922b;

    /* renamed from: c */
    private final C86124t f298923c;

    public C107408g(C108013bm bmVar, C22871g gVar, C86124t tVar, C91022f fVar) {
        this.f298921a = bmVar;
        this.f298922b = gVar;
        this.f298923c = tVar;
        fVar.mo85301a(this);
    }

    /* renamed from: h */
    public static String m178311h(C48855bv bvVar) {
        return TextUtils.join("_", (List) Collection.EL.stream(bvVar.f126426a).map(C107405d.f298918a).collect(Collectors.toList()));
    }

    /* renamed from: a */
    public final C60870cx mo77009a() {
        return this.f298921a.mo96366w();
    }

    /* renamed from: b */
    public final C60870cx mo77010b(C48855bv bvVar) {
        return this.f298922b.mo28210j(this.f298921a.mo96366w(), "clientContentListFuture", new C107407f(bvVar));
    }

    /* renamed from: c */
    public final C60870cx mo77011c() {
        return this.f298921a.mo96365v();
    }

    /* renamed from: e */
    public final C60870cx mo77012e(C63088z zVar) {
        return this.f298921a.f300493i.mo96376e(17, 28, C58833ax.m90834k(zVar.mo59174N()), C107992as.f300461a);
    }

    /* renamed from: f */
    public final C60870cx mo77013f(C48855bv bvVar) {
        return this.f298921a.f300493i.mo96376e(17, 30, C58833ax.m90834k(bvVar.toByteString().mo59174N()), C107997ax.f300466a);
    }

    /* renamed from: g */
    public final C60870cx mo77014g() {
        return this.f298922b.mo28210j(this.f298921a.mo96366w(), "clientContentListFuture", new C107402a());
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        if (this.f298923c.mo79746e(C90055dg.f248997b)) {
            fVar.mo85291r("PAPIclient");
            C60870cx w = this.f298921a.mo96366w();
            C60870cx v = this.f298921a.mo96365v();
            this.f298922b.mo28210j(C60856cj.m92907p(w, v), "dumpPapiContent", new C107404c(fVar));
        }
    }
}
