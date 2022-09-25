package com.google.android.apps.gsa.staticplugins.accl.performers.p7347h;

import android.text.TextUtils;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.h.r */
/* compiled from: PG */
final class C93179r implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C58833ax f259878a;

    /* renamed from: b */
    final /* synthetic */ C93180s f259879b;

    public C93179r(C93180s sVar, C58833ax axVar) {
        this.f259879b = sVar;
        this.f259878a = axVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C93180s.f259880a.mo56226d()).mo56382g(th)).mo56372aa(13378)).mo56386p("Failed to update notificationsStore");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C118826c cVar = (C118826c) obj;
        String i = ((BundledMessageNotification) this.f259878a.mo56107c()).mo84119i();
        if (!TextUtils.isEmpty(i)) {
            this.f259879b.f259883d.f252407c.remove(i);
        }
    }
}
