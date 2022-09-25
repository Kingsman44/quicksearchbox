package com.google.android.apps.search.podcasts.p10565f;

import android.content.Context;
import android.view.View;
import com.google.android.apps.search.podcasts.p10573k.p10575b.C140436c;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60845bz;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.f.u */
/* compiled from: PG */
public final class C140325u implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ View f381187a;

    /* renamed from: b */
    final /* synthetic */ C140285af f381188b;

    public C140325u(View view, C140285af afVar) {
        this.f381187a = view;
        this.f381188b = afVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) C140285af.f381117a.mo56226d();
        cVar.mo56379ah(new C59094n(41585));
        cVar.mo56386p("Failed to update new episode notification setting");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        if (this.f381187a.getContext() != null) {
            C140436c cVar = this.f381188b.f381129m;
            Context context = this.f381187a.getContext();
            C69664n.m101060f(context, "rootView.context");
            cVar.mo115673a(context);
        }
    }
}
