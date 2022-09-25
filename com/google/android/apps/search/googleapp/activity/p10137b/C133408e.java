package com.google.android.apps.search.googleapp.activity.p10137b;

import android.view.View;
import com.google.android.apps.search.googleapp.promomanager.p10372b.C137007dh;
import com.google.android.apps.search.googleapp.promomanager.p10377f.C137087ap;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.common.p4526f.C59052c;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63934bu;

/* renamed from: com.google.android.apps.search.googleapp.activity.b.e */
/* compiled from: PG */
class C133408e implements C46792di {

    /* renamed from: a */
    final /* synthetic */ C133409f f363510a;

    public C133408e(C133409f fVar) {
        this.f363510a = fVar;
    }

    /* renamed from: a */
    public final void mo18077a(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C133409f.f363511a.mo56225c()).mo56382g(th)).mo56372aa(40052)).mo56386p("Error while subscribing to promo manager data service");
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
        C137087ap apVar = this.f363510a.f363522l;
        C63934bu buVar = C63934bu.SEARCH_BOTTOMBAR_ICON;
        View findViewById = this.f363510a.f363512b.requireView().findViewById(R.id.googleapp_navigation_bar_search);
        apVar.mo113504b(buVar.f172907h, findViewById, (C137007dh) obj);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo18079c() {
    }
}
