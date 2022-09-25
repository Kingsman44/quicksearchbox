package com.google.android.apps.gsa.staticplugins.opa.p8319bb;

import android.util.Pair;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91007g;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.d */
/* compiled from: PG */
final class C107763d implements C91007g {

    /* renamed from: a */
    final C107801e f299844a;

    /* renamed from: b */
    final C107801e f299845b;

    /* renamed from: c */
    C107801e f299846c;

    /* renamed from: d */
    final List f299847d = new ArrayList();

    /* renamed from: e */
    final /* synthetic */ C107923f f299848e;

    public C107763d(C107923f fVar, Query query) {
        this.f299848e = fVar;
        this.f299844a = new C107801e(((C86054o) fVar.f300277b.mo27525b()).mo79659F());
        this.f299845b = new C107801e(query);
        this.f299846c = new C107801e(query);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("OpaDebugDataCollector_DebugData");
        Query query = (Query) this.f299845b.f299968a.get();
        if (query != null) {
            fVar.mo85288o("Initial query", query);
        }
        Query query2 = (Query) this.f299846c.f299968a.get();
        if (query2 != null) {
            fVar.mo85288o("Updated query", query2);
        }
        C91006f e = fVar.mo85281e((Object) null);
        e.mo85291r("Response stream status");
        for (Pair pair : this.f299847d) {
            e.mo85293t("Time: %s, ResponseStatus: %s", C90752i.m148232f(new Date(((Long) pair.second).longValue())), C90752i.m148229c((CharSequence) pair.first));
        }
    }
}
