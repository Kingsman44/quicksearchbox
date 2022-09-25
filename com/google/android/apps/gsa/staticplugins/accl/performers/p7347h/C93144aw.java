package com.google.android.apps.gsa.staticplugins.accl.performers.p7347h;

import android.text.TextUtils;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90374h;
import com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.h.aw */
/* compiled from: PG */
final class C93144aw implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C58833ax f259790a;

    /* renamed from: b */
    final /* synthetic */ C93150bb f259791b;

    public C93144aw(C93150bb bbVar, C58833ax axVar) {
        this.f259791b = bbVar;
        this.f259790a = axVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C93150bb.f259800a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "NotifReadPerformer");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(13388)).mo56386p("Failed to update notificationsStore");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C52070ec ecVar = (C52070ec) obj;
        C59071e eVar = C93150bb.f259800a;
        C58976aa aaVar = C58975e.f156826a;
        String i = ((BundledMessageNotification) this.f259790a.mo56107c()).mo84119i();
        if (!TextUtils.isEmpty(i)) {
            C90374h hVar = this.f259791b.f259804e;
            hVar.f252407c.put(i, Long.valueOf(hVar.f252408d.mo26870b()));
        }
    }
}
