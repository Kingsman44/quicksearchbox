package com.google.android.apps.gsa.staticplugins.opa.morris2.p8384e;

import android.os.Bundle;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.e.f */
/* compiled from: PG */
final class C109516f implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f305022a = "active_notifications";

    /* renamed from: b */
    final /* synthetic */ C87739bu f305023b;

    /* renamed from: c */
    final /* synthetic */ C109517g f305024c;

    public C109516f(C109517g gVar, C87739bu buVar) {
        this.f305024c = gVar;
        this.f305023b = buVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C109517g.f305025a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "Morris.NotiListener");
        ((C59052c) ((C59052c) d).mo56372aa(24989)).mo56389s("Failed to parse notifications and send client event. Error message: %s", th.getMessage());
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        if (!arrayList.isEmpty()) {
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList(this.f305022a, arrayList);
            this.f305024c.mo97883j(this.f305023b, bundle);
        }
    }
}
