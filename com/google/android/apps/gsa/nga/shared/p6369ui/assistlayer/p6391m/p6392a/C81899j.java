package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6391m.p6392a;

import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80707ci;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80708cj;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80710cl;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.animation.C147770c;
import com.google.android.libraries.animation.C147785k;
import com.google.android.libraries.animation.C147790p;
import com.google.android.libraries.animation.C147794t;
import com.google.android.libraries.animation.impl.C147779b;
import com.google.android.libraries.animation.impl.C147783f;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.m.a.j */
/* compiled from: PG */
public final /* synthetic */ class C81899j implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C81889aq f223968a;

    /* renamed from: b */
    public final /* synthetic */ LottieAnimationView f223969b;

    public /* synthetic */ C81899j(C81889aq aqVar, LottieAnimationView lottieAnimationView) {
        this.f223968a = aqVar;
        this.f223969b = lottieAnimationView;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C81889aq aqVar = this.f223968a;
        LottieAnimationView lottieAnimationView = this.f223969b;
        C80710cl clVar = (C80710cl) obj;
        C80707ci ciVar = C80707ci.SHOW_WITH_TIMEOUT;
        int ordinal = clVar.mo74470a().ordinal();
        if (ordinal == 0 || ordinal == 1) {
            if (!aqVar.f223940y) {
                aqVar.mo75390i(clVar.mo74470a());
            }
        } else if (ordinal == 3) {
            C147785k kVar = aqVar.f223937v;
            if (kVar != null) {
                kVar.mo124464f();
                aqVar.f223937v = null;
            }
            if (clVar.mo74471b().equals(C80708cj.GONE)) {
                aqVar.mo75387c(206);
                C83349aj.m132647b(aqVar.f223918c, aqVar.f223928m, false, "isVisible");
            } else if (lottieAnimationView.getVisibility() != 8) {
                C81913x xVar = new C81913x(aqVar);
                C81894e eVar = aqVar.f223936u;
                if (eVar != null) {
                    C147783f fVar = eVar.f223958b;
                    C147770c cVar = new C147770c(new C81893d(eVar));
                    C147794t b = C147794t.m240888b(0.0f, 333.0f);
                    b.f398763c = new C147790p(191.0f, 236.0f);
                    C147779b bVar = new C147779b(fVar, cVar.mo124447a(b));
                    bVar.f398748b = xVar;
                    C147785k a = bVar.mo124453a();
                    a.mo124459a(0.0f, 333.0f, Duration.ofMillis(333));
                    aqVar.f223937v = a;
                }
            }
        }
    }
}
