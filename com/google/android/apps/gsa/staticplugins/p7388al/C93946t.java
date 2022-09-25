package com.google.android.apps.gsa.staticplugins.p7388al;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.gsa.opaonboarding.C83903bi;
import com.google.android.apps.gsa.opaonboarding.C83904bj;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.al.t */
/* compiled from: PG */
public final class C93946t implements C83904bj {

    /* renamed from: c */
    private static final C59071e f262362c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.al.t");

    /* renamed from: a */
    public String f262363a;

    /* renamed from: b */
    public boolean f262364b = false;

    /* renamed from: c */
    private final C83903bi m154986c() {
        Intent intent = null;
        if (this.f262364b) {
            C59104x b = f262362c.mo56224b();
            b.mo56378ag(C58975e.f156826a, "DeviceScanResultCont");
            ((C59052c) ((C59052c) b).mo56372aa(19357)).mo56386p("VM Scan skipped!");
            return C83903bi.m133649e(0, (Intent) null);
        }
        if (!TextUtils.isEmpty(this.f262363a)) {
            intent = new Intent().putExtra("locale", this.f262363a);
        }
        return C83903bi.m133649e(-1, intent);
    }

    /* renamed from: b */
    public final C83903bi mo77310b() {
        return m154986c();
    }

    /* renamed from: i */
    public final C83903bi mo77311i() {
        return m154986c();
    }
}
