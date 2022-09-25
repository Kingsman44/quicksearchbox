package com.google.android.apps.gsa.staticplugins.accl.performers.p7347h;

import android.text.TextUtils;
import com.google.android.apps.gsa.shared.notificationlistening.collection.C90394ab;
import com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification;
import com.google.assistant.p3897e.p3921j.afb;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.h.bd */
/* compiled from: PG */
public final /* synthetic */ class C93152bd implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C93156bh f259816a;

    /* renamed from: b */
    public final /* synthetic */ afb f259817b;

    public /* synthetic */ C93152bd(C93156bh bhVar, afb afb) {
        this.f259816a = bhVar;
        this.f259817b = afb;
    }

    public final C60870cx apply(Object obj) {
        C93156bh bhVar = this.f259816a;
        afb afb = this.f259817b;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            ((C59052c) ((C59052c) C93156bh.f259823a.mo56226d()).mo56372aa(13422)).mo56386p("Failed to find bundled message notification. Can't reply");
            return C60856cj.m92899h(new RuntimeException("Failed to find bundled message notification."));
        }
        BundledMessageNotification bundledMessageNotification = (BundledMessageNotification) axVar.mo56107c();
        String str = afb.f134988c;
        if (!afb.f134989d) {
            return bhVar.f259824b.mo78569l(bundledMessageNotification, str);
        }
        String i = bundledMessageNotification.mo84119i();
        if (TextUtils.isEmpty(i)) {
            ((C59052c) ((C59052c) C93156bh.f259823a.mo56226d()).mo56372aa(13423)).mo56386p("Notification doesn't have a valid key. Can't reply.");
            return C60856cj.m92899h(new RuntimeException("Notification doesn't have a valid key."));
        } else if (C90394ab.m147004b(i)) {
            return bhVar.f259824b.mo78570m(bundledMessageNotification, str);
        } else {
            return bhVar.f259824b.mo78568k(i, str);
        }
    }
}
