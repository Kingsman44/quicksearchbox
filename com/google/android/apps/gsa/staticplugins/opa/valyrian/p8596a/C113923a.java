package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8596a;

import android.support.p033v7.widget.C0653fo;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108232bc;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.a.a */
/* compiled from: PG */
public final class C113923a implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C113924b f315477a;

    public C113923a(C113924b bVar) {
        this.f315477a = bVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x d = C113924b.f315478a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "VHistoryCtrl");
        ((C59052c) ((C59052c) d).mo56372aa(28617)).mo56386p("Cannot get history elements");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        for (C108232bc c : (List) obj) {
            this.f315477a.f315479b.mo101153c(c);
        }
        this.f315477a.f315479b.mObservable.mo2879a();
        C113924b bVar = this.f315477a;
        bVar.f315480c.stopScroll();
        C0653fo foVar = bVar.f315480c.mLayout;
        if (foVar != null) {
            foVar.scrollToPosition(bVar.f315479b.mo101151a());
        }
    }
}
