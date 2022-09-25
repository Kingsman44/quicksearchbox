package com.google.apps.p3589d.p3593d;

import com.evernote.android.state.BuildConfig;
import com.google.apps.p3589d.p3591b.C45712c;
import com.google.apps.p3589d.p3591b.C45719j;
import com.google.apps.p3589d.p3591b.C45723n;

/* renamed from: com.google.apps.d.d.ae */
/* compiled from: PG */
public final class C45737ae extends C45755n {

    /* renamed from: a */
    public final C45740ah f120246a;

    /* renamed from: b */
    public final String f120247b;

    /* renamed from: i */
    public final C45719j f120248i;

    /* renamed from: j */
    public final C45719j f120249j;

    public C45737ae(C45737ae aeVar, C45750i iVar) {
        super((C45755n) aeVar, iVar);
        this.f120246a = aeVar.f120246a;
        this.f120247b = aeVar.f120247b;
        this.f120248i = aeVar.f120248i;
        this.f120249j = aeVar.f120249j.mo49814c(new C45735ac(iVar)).mo49829f();
    }

    /* renamed from: n */
    public static int m81534n(C45719j jVar) {
        C45719j jVar2 = (C45719j) jVar.mo49816e(0);
        if (jVar2 == null) {
            return 0;
        }
        return jVar2.f120220a.size();
    }

    /* renamed from: o */
    public static C45737ae m81535o(C45740ah ahVar, String str, C45719j jVar) {
        int n = m81534n(jVar);
        if (jVar.f120220a.size() == 0 || n == 0) {
            throw new AssertionError("Tables must have at least one cell.");
        }
        C45712c cVar = new C45712c(jVar);
        while (cVar.hasNext()) {
            if (((C45719j) cVar.next()).f120220a.size() != n) {
                throw new AssertionError("All rows must have the same number of columns.");
            }
        }
        C45719j jVar2 = ahVar.f120259i;
        int size = jVar2.f120220a.size();
        if (size != n) {
            C45723n nVar = new C45723n(0);
            for (int i = 0; i < n; i++) {
                nVar.f120220a.add((C45736ad) jVar2.mo49815d(i % size));
            }
            jVar2 = nVar.mo49829f();
        }
        return new C45737ae(ahVar, str, jVar2, jVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C45755n mo49862a(C45750i iVar) {
        return new C45737ae(this, iVar);
    }

    /* renamed from: g */
    public final void mo49863g(C45741ai aiVar, C45742aj ajVar) {
        mo49889h(aiVar, ajVar);
        C45712c cVar = new C45712c(this.f120249j);
        while (cVar.hasNext()) {
            C45712c cVar2 = new C45712c((C45719j) cVar.next());
            while (cVar2.hasNext()) {
                ((C45763v) cVar2.next()).mo49898g(aiVar, ajVar, this);
            }
        }
    }

    /* renamed from: i */
    public final boolean mo49864i() {
        C45712c cVar = new C45712c(this.f120249j);
        while (cVar.hasNext()) {
            C45712c cVar2 = new C45712c((C45719j) cVar.next());
            while (true) {
                if (cVar2.hasNext()) {
                    if (!((C45763v) cVar2.next()).f120342a.f120220a.isEmpty()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private C45737ae(C45740ah ahVar, String str, C45719j jVar, C45719j jVar2) {
        super(21, BuildConfig.FLAVOR);
        this.f120246a = ahVar;
        this.f120247b = str;
        this.f120248i = jVar;
        this.f120249j = jVar2;
        if (m81534n(jVar2) != jVar.f120220a.size()) {
            throw new AssertionError("Number of column alignments must match number of table columns.");
        }
    }
}
