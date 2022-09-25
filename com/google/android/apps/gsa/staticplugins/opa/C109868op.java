package com.google.android.apps.gsa.staticplugins.opa;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4566l.C60218r;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.op */
/* compiled from: PG */
public final /* synthetic */ class C109868op implements C91096f {

    /* renamed from: a */
    public final /* synthetic */ C109870or f306126a;

    /* renamed from: b */
    public final /* synthetic */ Intent f306127b;

    public /* synthetic */ C109868op(C109870or orVar, Intent intent) {
        this.f306126a = orVar;
        this.f306127b = intent;
    }

    /* renamed from: hg */
    public final boolean mo17703hg(int i, Intent intent, Context context) {
        C109870or orVar = this.f306126a;
        String stringExtra = this.f306127b.getStringExtra("ZeroStateTapToUpdateDeeplinkUrl");
        C59104x b = ZeroStateActivity.f295675j.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ZeroStateActivity");
        ((C59052c) ((C59052c) b).mo56372aa(23023)).mo56389s("#ResultCallback(): deeplink: %s", stringExtra);
        if (C58837ba.m90859h(stringExtra)) {
            return true;
        }
        ZeroStateActivity zeroStateActivity = orVar.f306131f;
        zeroStateActivity.f295683H.mo101590b(zeroStateActivity.f295700r.mo81695b(context, stringExtra, (C60218r) null));
        return true;
    }
}
