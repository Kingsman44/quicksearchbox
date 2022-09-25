package com.google.android.apps.gsa.sidekick.shared.p7256ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.apps.gsa.shared.p7148ui.C90628ad;
import com.google.android.apps.gsa.shared.util.C91043j;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.ui.c */
/* compiled from: PG */
public final /* synthetic */ class C91927c implements C91043j {

    /* renamed from: a */
    public final /* synthetic */ ClusterCard f256382a;

    public /* synthetic */ C91927c(ClusterCard clusterCard) {
        this.f256382a = clusterCard;
    }

    /* renamed from: a */
    public final void mo17709a(Object obj) {
        ClusterCard clusterCard = this.f256382a;
        C90628ad adVar = (C90628ad) obj;
        if (adVar == null) {
            ((C59052c) ((C59052c) ClusterCard.f256348a.mo56226d()).mo56372aa(11935)).mo56386p("Can't consume null pendingViewDismiss");
            int i = C90755l.f253831a;
            return;
        }
        clusterCard.f256351d = false;
        View view = clusterCard.f256352e;
        if (view != null && view.getParent() != null) {
            clusterCard.f256353f = clusterCard.f256352e;
            View view2 = clusterCard.f256353f;
            view2.getClass();
            clusterCard.f256354g = ((View) view2.getParent()).getHeight();
            Drawable drawable = clusterCard.f256355h;
            if (drawable != null) {
                view2.setBackground(drawable);
                clusterCard.f256355h = null;
            }
            clusterCard.f256352e = null;
            adVar.mo84880a(new C91929e());
        }
    }
}
