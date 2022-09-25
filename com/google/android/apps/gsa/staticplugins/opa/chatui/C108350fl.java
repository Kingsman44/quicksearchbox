package com.google.android.apps.gsa.staticplugins.opa.chatui;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.fl */
/* compiled from: PG */
public final /* synthetic */ class C108350fl implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ OpaAppActionsSliceCard f301390a;

    /* renamed from: b */
    public final /* synthetic */ String f301391b;

    public /* synthetic */ C108350fl(OpaAppActionsSliceCard opaAppActionsSliceCard, String str) {
        this.f301390a = opaAppActionsSliceCard;
        this.f301391b = str;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        OpaAppActionsSliceCard opaAppActionsSliceCard = this.f301390a;
        ((C59052c) ((C59052c) OpaAppActionsSliceCard.f300899a.mo56225c()).mo56372aa(24015)).mo56354G("Failed to retrieve initial slice from slice URI: %s because of %s", this.f301391b, ((Exception) obj).getMessage());
        opaAppActionsSliceCard.f300902d.mo8630e(opaAppActionsSliceCard.f300905g, opaAppActionsSliceCard.f300904f);
        opaAppActionsSliceCard.f300906h = false;
    }
}
