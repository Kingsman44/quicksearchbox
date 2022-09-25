package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.content.Intent;
import com.google.android.apps.gsa.shared.util.permissions.C91078e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.je */
/* compiled from: PG */
public final /* synthetic */ class C96317je implements C91078e {

    /* renamed from: a */
    public final /* synthetic */ OobeActivity f269522a;

    /* renamed from: b */
    public final /* synthetic */ Intent f269523b;

    /* renamed from: c */
    public final /* synthetic */ String f269524c;

    public /* synthetic */ C96317je(OobeActivity oobeActivity, Intent intent, String str) {
        this.f269522a = oobeActivity;
        this.f269523b = intent;
        this.f269524c = str;
    }

    /* renamed from: a */
    public final void mo18206a(String[] strArr, int[] iArr) {
        OobeActivity oobeActivity = this.f269522a;
        Intent intent = this.f269523b;
        String str = this.f269524c;
        for (int valueOf : iArr) {
            if (Integer.valueOf(valueOf).intValue() != 0) {
                C59104x d = OobeActivity.f268955k.mo56226d();
                d.mo56378ag(C58975e.f156826a, "OobeActivity");
                ((C59052c) ((C59052c) d).mo56372aa(17055)).mo56386p("Connect not granted");
                oobeActivity.setResult(1);
                oobeActivity.finish();
                return;
            }
        }
        oobeActivity.f268961l.getClass();
        oobeActivity.mo89929w(intent, str);
    }
}
