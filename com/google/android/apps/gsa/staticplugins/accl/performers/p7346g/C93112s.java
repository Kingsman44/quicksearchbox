package com.google.android.apps.gsa.staticplugins.accl.performers.p7346g;

import com.google.android.apps.search.assistant.verticals.newsplayer.p10065b.C132408a;
import com.google.android.apps.search.assistant.verticals.newsplayer.p10068e.C132416a;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.apps.tiktok.account.AccountId;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58894dd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.g.s */
/* compiled from: PG */
public final /* synthetic */ class C93112s implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C93081ad f259739a;

    /* renamed from: b */
    public final /* synthetic */ C52176ia f259740b;

    public /* synthetic */ C93112s(C93081ad adVar, C52176ia iaVar) {
        this.f259739a = adVar;
        this.f259740b = iaVar;
    }

    public final C60870cx apply(Object obj) {
        C93081ad adVar = this.f259739a;
        try {
            ((C132416a) adVar.f259637e.mo27525b()).mo110712n((AccountId) obj, this.f259740b);
            boolean isDeviceLocked = adVar.f259635c.f230023b.isDeviceLocked();
            C58976aa aaVar = C58975e.f156826a;
            if (!isDeviceLocked) {
                adVar.f259634b.mo27807a(C132408a.m215227a(adVar.f259636d));
            }
            return C60856cj.m92900i(C22402a.f61893a);
        } catch (C58894dd unused) {
            return C60856cj.m92900i(C22402a.m41822b(C52235kf.INTERNAL, "Failed to start NewsPlayer"));
        }
    }
}
