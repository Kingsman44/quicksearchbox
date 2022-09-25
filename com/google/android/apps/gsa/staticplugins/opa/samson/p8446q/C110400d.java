package com.google.android.apps.gsa.staticplugins.opa.samson.p8446q;

import android.content.Context;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.q.d */
/* compiled from: PG */
public final class C110400d {

    /* renamed from: a */
    private static final C59071e f307687a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.q.d");

    /* renamed from: a */
    public final void mo98628a(Context context) {
        try {
            Class.forName("android.app.StatusBarManager").getMethod("expandNotificationsPanel", new Class[0]).invoke(context.getSystemService("statusbar"), new Object[0]);
        } catch (Throwable th) {
            C59104x c = f307687a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SBarUtil");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(25997)).mo56386p("Exception caught in OnClick");
        }
    }
}
