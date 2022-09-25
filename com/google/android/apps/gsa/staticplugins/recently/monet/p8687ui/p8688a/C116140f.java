package com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui.p8688a;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui.RecentlyGifView;
import com.google.android.libraries.gsa.p1875j.C22838i;
import com.google.android.libraries.gsa.p1875j.C22845p;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.monet.ui.a.f */
/* compiled from: PG */
public final /* synthetic */ class C116140f implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C116143i f322057a;

    /* renamed from: b */
    public final /* synthetic */ RecentlyGifView f322058b;

    /* renamed from: c */
    public final /* synthetic */ C22845p f322059c;

    public /* synthetic */ C116140f(C116143i iVar, RecentlyGifView recentlyGifView, C22845p pVar) {
        this.f322057a = iVar;
        this.f322058b = recentlyGifView;
        this.f322059c = pVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C116143i iVar = this.f322057a;
        RecentlyGifView recentlyGifView = this.f322058b;
        C22845p pVar = this.f322059c;
        ((C59052c) ((C59052c) ((C59052c) C116143i.f322063c.mo56225c()).mo56382g((Exception) obj)).mo56372aa(30909)).mo56386p("Failed to load gif data from storage.");
        C22838i iVar2 = pVar.f62901j;
        if (iVar2 == null) {
            iVar2 = C22838i.f62869h;
        }
        iVar.mo102525h(recentlyGifView, iVar2);
    }
}
