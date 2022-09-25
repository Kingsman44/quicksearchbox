package com.google.android.apps.gsa.staticplugins.opa.morris2.p8393g;

import com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification;
import com.google.android.apps.gsa.shared.notificationlistening.common.NotificationWrapper;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.g.a */
/* compiled from: PG */
final class C109643a implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ LinkedHashMap f305353a;

    /* renamed from: b */
    final /* synthetic */ C109645b f305354b;

    public C109643a(C109645b bVar, LinkedHashMap linkedHashMap) {
        this.f305354b = bVar;
        this.f305353a = linkedHashMap;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C109645b.f305356a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.SessionCtlr");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(25008)).mo56386p("Failed to update receive notifications.");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        List<BundledMessageNotification> list = (List) obj;
        C59071e eVar = C109645b.f305356a;
        C58976aa aaVar = C58975e.f156826a;
        if (list != null && !list.isEmpty()) {
            for (BundledMessageNotification bundledMessageNotification : list) {
                String i = bundledMessageNotification.mo84119i();
                if (this.f305353a.containsKey(i)) {
                    this.f305354b.f305357c.mo97914b(bundledMessageNotification, (NotificationWrapper) this.f305353a.get(i));
                }
            }
        }
    }
}
