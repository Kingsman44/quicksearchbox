package com.google.android.apps.search.podcasts.settings;

import android.support.p031v4.app.C0167am;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60845bz;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.settings.l */
/* compiled from: PG */
public final class C141089l implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C141093p f383044a;

    public C141089l(C141093p pVar) {
        this.f383044a = pVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) C141093p.f383048a.mo56226d();
        cVar.mo56379ah(new C59094n(41646));
        cVar.mo56386p("Failed to update all new episode notification settings");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        C0167am activity = this.f383044a.f383050c.getActivity();
        if (activity != null) {
            this.f383044a.f383058k.mo115673a(activity);
        }
    }
}
