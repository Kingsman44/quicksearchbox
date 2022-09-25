package com.google.android.apps.gsa.staticplugins.bisto.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.ax */
/* compiled from: PG */
public final class C96466ax extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C96467ay f269866a;

    public C96466ax(C96467ay ayVar) {
        this.f269866a = ayVar;
    }

    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (C96467ay.f269868b.contains(action)) {
            C59104x b = C96467ay.f269867a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "PRNotifHelper");
            ((C59052c) ((C59052c) b).mo56372aa(17170)).mo56389s("Received: %s", action);
            this.f269866a.f269872f.cancel(1);
            if ("com.google.android.apps.gsa.staticplugins.bisto.settings.ACTION_GACS_PR_LAUNCH_SETTINGS".equals(action)) {
                C59104x b2 = C96467ay.f269867a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "PRNotifHelper");
                ((C59052c) ((C59052c) b2).mo56372aa(17171)).mo56386p("Start settings");
                String stringExtra = intent.getStringExtra("key_device_id");
                if (stringExtra != null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("assistant_surface", 8);
                    bundle.putString("assistant_device_id", stringExtra);
                    C18509a c = C18522b.m35986c();
                    C18523c cVar = (C18523c) c;
                    cVar.f52492a = "device_info";
                    cVar.f52493b = bundle;
                    Intent a = c.mo24020b().mo24031a();
                    if (IntentLauncherActivity.m159794a(a, context)) {
                        context.startActivity(new Intent().putExtra("EXTRA_INTENT", a).putExtra("EXTRA_START_ACTIVITY_FOR_RESULT", true).setClass(context, IntentLauncherActivity.class).addFlags(32768).addFlags(268435456));
                    }
                    if (Build.VERSION.SDK_INT < 31) {
                        context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                    }
                    this.f269866a.mo90162l(3);
                }
            }
            if ("com.google.android.apps.gsa.staticplugins.bisto.settings.ACTION_GACS_PR_NEGATIVE".equals(action)) {
                this.f269866a.mo90162l(4);
            }
            if ("com.google.android.apps.gsa.staticplugins.bisto.settings.ACTION_GACS_PR_DISMISS".equals(action)) {
                this.f269866a.mo90162l(7);
            }
            C96466ax axVar = this.f269866a.f269875i;
            if (axVar != null) {
                context.unregisterReceiver(axVar);
                this.f269866a.f269875i = null;
                return;
            }
            return;
        }
        C59104x d = C96467ay.f269867a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "PRNotifHelper");
        ((C59052c) ((C59052c) d).mo56372aa(17172)).mo56389s("Intent ignored: %s", action);
    }
}
