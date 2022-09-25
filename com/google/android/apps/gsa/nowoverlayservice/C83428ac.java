package com.google.android.apps.gsa.nowoverlayservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.ac */
/* compiled from: PG */
final class C83428ac extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C83553y f227402a;

    public C83428ac(C83553y yVar) {
        this.f227402a = yVar;
    }

    public final void onReceive(Context context, Intent intent) {
        String action;
        if (intent != null && (action = intent.getAction()) != null) {
            if (action.equals("android.intent.action.MY_PACKAGE_SUSPENDED") || action.equals("android.intent.action.MY_PACKAGE_UNSUSPENDED")) {
                C59104x b = C83553y.f227783a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "GLCOC");
                ((C59052c) ((C59052c) b).mo56372aa(6684)).mo56389s("Received intent action: %s", action);
                C83553y yVar = this.f227402a;
                if ("android.intent.action.MY_PACKAGE_SUSPENDED".equals(action) && !yVar.f227785A) {
                    ((C118831d) yVar.f227833d.mo6453a()).mo104025g(1);
                }
                if ("android.intent.action.MY_PACKAGE_UNSUSPENDED".equals(action) && yVar.f227853x && !yVar.f227854y && yVar.f227785A) {
                    ((C118831d) yVar.f227834e.mo6453a()).mo104025g(1);
                }
                this.f227402a.mo76878D();
            }
        }
    }
}
