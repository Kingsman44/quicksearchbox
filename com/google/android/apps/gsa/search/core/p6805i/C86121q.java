package com.google.android.apps.gsa.search.core.p6805i;

import com.google.android.apps.gsa.search.core.preferences.C86341u;
import com.google.android.apps.gsa.search.core.preferences.C86346z;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.libraries.gsa.p1876k.C22869e;
import java.util.List;
import java.util.Set;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.search.core.i.q */
/* compiled from: PG */
public final /* synthetic */ class C86121q implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C86124t f232769a;

    /* renamed from: b */
    public final /* synthetic */ Supplier f232770b;

    /* renamed from: c */
    public final /* synthetic */ List f232771c;

    /* renamed from: d */
    public final /* synthetic */ C86111g f232772d;

    public /* synthetic */ C86121q(C86124t tVar, Supplier supplier, List list, C86111g gVar) {
        this.f232769a = tVar;
        this.f232770b = supplier;
        this.f232771c = list;
        this.f232772d = gVar;
    }

    public final void run() {
        C86124t tVar = this.f232769a;
        Supplier supplier = this.f232770b;
        List<C86123s> list = this.f232771c;
        C86111g gVar = this.f232772d;
        C86117m mVar = (C86117m) supplier.get();
        for (C86109e a : (Set) tVar.f232777c.mo27525b()) {
            a.mo70818a(tVar, mVar);
        }
        for (C86123s a2 : list) {
            a2.mo78019a();
        }
        if (gVar != null) {
            C86341u uVar = new C86341u((C86346z) tVar.f232778d.f232790a.mo79723b());
            uVar.mo80068c(C90507o.f253017g, gVar.toByteArray());
            uVar.mo80086l(false);
        }
    }
}
