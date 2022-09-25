package com.google.android.gms.learning.dynamite;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.phenotype.C145738p;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146013ai;
import com.google.android.gms.tasks.C146014aj;

/* renamed from: com.google.android.gms.learning.dynamite.z */
/* compiled from: PG */
final class C144736z extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        String a = C144615aa.m235121a(context);
        if (a.equals(stringExtra)) {
            C146006ab b = C145738p.m237003b(context).mo121902b(a, BuildConfig.FLAVOR);
            C146014aj ajVar = (C146014aj) b;
            ajVar.mo122495n(C146013ai.f394700a, new C144734x());
            ajVar.mo122494m(C146013ai.f394700a, new C144735y(a));
        }
    }
}
