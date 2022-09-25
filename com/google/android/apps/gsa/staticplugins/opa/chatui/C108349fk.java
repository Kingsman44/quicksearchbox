package com.google.android.apps.gsa.staticplugins.opa.chatui;

import androidx.slice.Slice;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.fk */
/* compiled from: PG */
public final /* synthetic */ class C108349fk implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ OpaAppActionsSliceCard f301387a;

    /* renamed from: b */
    public final /* synthetic */ C89859i f301388b;

    /* renamed from: c */
    public final /* synthetic */ C107698i f301389c;

    public /* synthetic */ C108349fk(OpaAppActionsSliceCard opaAppActionsSliceCard, C89859i iVar, C107698i iVar2) {
        this.f301387a = opaAppActionsSliceCard;
        this.f301388b = iVar;
        this.f301389c = iVar2;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        OpaAppActionsSliceCard opaAppActionsSliceCard = this.f301387a;
        C89859i iVar = this.f301388b;
        C107698i iVar2 = this.f301389c;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            opaAppActionsSliceCard.f300903e = (Slice) axVar.mo56107c();
            opaAppActionsSliceCard.mo96554b(opaAppActionsSliceCard.f300903e, iVar, iVar2);
        }
    }
}
