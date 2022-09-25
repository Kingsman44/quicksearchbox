package com.google.android.apps.search.googleapp.settingsui;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.RecyclerView;
import androidx.preference.C3990ap;
import com.google.android.apps.search.googleapp.p10536x.C139873i;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.aw */
/* compiled from: PG */
public final class C139169aw implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C139178ba f378493a;

    public C139169aw(C139178ba baVar) {
        this.f378493a = baVar;
    }

    /* renamed from: h */
    public final void mo20960h(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) ((C59052c) C139178ba.f378511a.mo56225c()).mo56382g(th);
        cVar.mo56379ah(new C59094n(41356));
        cVar.mo56386p("Failed to load the selected Settings category.");
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        C139873i iVar = (C139873i) obj;
        C139178ba baVar = this.f378493a;
        if (baVar.f378525o && iVar != null) {
            C139873i iVar2 = baVar.f378522l;
            if (iVar2 != iVar) {
                if (iVar2 != null) {
                    baVar.mo114801b(iVar2);
                    RecyclerView recyclerView = baVar.f378513c.f12808c;
                    C0640fb fbVar = recyclerView.mAdapter;
                    C69664n.m101059e(fbVar, "null cannot be cast to non-null type androidx.preference.PreferenceGroupAdapter");
                    int c = ((C3990ap) fbVar).mo8425c(iVar.name());
                    if (c != -1 && recyclerView.findViewHolderForAdapterPosition(c) == null) {
                        baVar.mo114802c(iVar);
                    }
                } else if (iVar != C69540x.m100821C(baVar.mo114800a())) {
                    baVar.mo114802c(iVar);
                }
            }
            baVar.f378522l = iVar;
            baVar.mo114801b(iVar);
        }
    }
}
