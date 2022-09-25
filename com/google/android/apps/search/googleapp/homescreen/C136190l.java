package com.google.android.apps.search.googleapp.homescreen;

import android.view.View;
import androidx.core.p098j.C2043bi;
import com.google.android.apps.search.googleapp.homescreen.searchbox.SearchboxView;
import com.google.android.apps.search.googleapp.promomanager.p10372b.C137007dh;
import com.google.android.apps.search.googleapp.promomanager.p10377f.C137087ap;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63934bu;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.homescreen.l */
/* compiled from: PG */
public final class C136190l implements C46792di {

    /* renamed from: a */
    final /* synthetic */ C136193o f370883a;

    public C136190l(C136193o oVar) {
        this.f370883a = oVar;
    }

    /* renamed from: a */
    public final void mo18077a(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) ((C59052c) C136193o.f370887a.mo56225c()).mo56382g(th);
        cVar.mo56379ah(new C59094n(40693));
        cVar.mo56386p("Error while subscribing to promo manager tooltip data service");
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
        View r = C2043bi.m5589r(this.f370883a.f370907b.requireView(), R.id.googleapp_facade_search_box_view);
        C69664n.m101060f(r, "requireViewById<Searchbo…ch_box_view\n            )");
        C137087ap apVar = this.f370883a.f370889B;
        C63934bu buVar = C63934bu.VOICE_SEARCH_ICON;
        View b = ((SearchboxView) r).mo17754z().mo112833b();
        apVar.mo113504b(buVar.f172907h, b, (C137007dh) obj);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo18079c() {
    }
}
