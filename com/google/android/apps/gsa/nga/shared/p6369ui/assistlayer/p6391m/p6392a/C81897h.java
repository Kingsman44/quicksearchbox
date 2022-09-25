package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6391m.p6392a;

import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.m.a.h */
/* compiled from: PG */
public final /* synthetic */ class C81897h implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C81889aq f223963a;

    /* renamed from: b */
    public final /* synthetic */ LottieAnimationView f223964b;

    public /* synthetic */ C81897h(C81889aq aqVar, LottieAnimationView lottieAnimationView) {
        this.f223963a = aqVar;
        this.f223964b = lottieAnimationView;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C81889aq aqVar = this.f223963a;
        LottieAnimationView lottieAnimationView = this.f223964b;
        C81888ap apVar = (C81888ap) obj;
        if (aqVar.f223936u != null) {
            if (lottieAnimationView.getVisibility() == 0) {
                aqVar.f223917b.mo28213m("[NGA] Mic > Edge Lights timeout", 283, new C81906q(aqVar, apVar));
            } else {
                aqVar.f223936u.mo75394a(apVar);
            }
        }
    }
}
