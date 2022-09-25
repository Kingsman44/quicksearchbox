package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6378f.p6379a;

import android.view.View;
import com.google.android.apps.gsa.nga.shared.p6417x.C83369s;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.f.a.q */
/* compiled from: PG */
public final /* synthetic */ class C81590q implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C81596w f223178a;

    public /* synthetic */ C81590q(C81596w wVar) {
        this.f223178a = wVar;
    }

    public final void accept(Object obj) {
        C81596w wVar = this.f223178a;
        View view = (View) obj;
        C81594u c = wVar.mo75198c(view.findViewById(R.id.nga_assist_hero_chip), "Hero Chip");
        C81594u c2 = wVar.mo75198c(view.findViewById(R.id.nga_assist_privacy_chip), "Privacy Chip");
        C81594u c3 = wVar.mo75198c(view.findViewById(R.id.nga_assist_promo_chip_container), "Promo Chip");
        wVar.f223189d.mo28212l("[NGA] HeroChipRenderer#onViewAvailable", new C81584k(c, c2));
        wVar.f223192g.mo76663c(wVar.f223191f.mo75158k(), new C83369s(wVar.f223189d, "onChipUpdated", new C81585l(wVar, c, c2, c3)));
        wVar.f223192g.mo76663c(wVar.f223196k.mo75136a(), new C83369s(wVar.f223189d, "isDarkModeEnabled", new C81586m(wVar, c3)));
        wVar.f223189d.mo28212l("[NGA] attachView heroChip", new C81587n(wVar, view));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
