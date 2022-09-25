package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6391m.p6392a;

import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80826ae;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80859e;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81564g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.m.a.ah */
/* compiled from: PG */
public final /* synthetic */ class C81880ah implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C81889aq f223901a;

    /* renamed from: b */
    public final /* synthetic */ LottieAnimationView f223902b;

    public /* synthetic */ C81880ah(C81889aq aqVar, LottieAnimationView lottieAnimationView) {
        this.f223901a = aqVar;
        this.f223902b = lottieAnimationView;
    }

    public final void onClick(View view) {
        C81889aq aqVar = this.f223901a;
        aqVar.f223931p.mo75430a(this.f223902b);
        if (((Boolean) ((C83361k) aqVar.f223928m).f227199b.get()).booleanValue()) {
            C81564g gVar = aqVar.f223921f;
            C80859e eVar = (C80859e) C80831aj.f221751c.createBuilder();
            C80826ae aeVar = C80826ae.f221745a;
            eVar.copyOnWrite();
            C80831aj ajVar = (C80831aj) eVar.instance;
            aeVar.getClass();
            ajVar.f221754b = aeVar;
            ajVar.f221753a = 13;
            gVar.mo73552a((C80831aj) eVar.build());
        }
    }
}
