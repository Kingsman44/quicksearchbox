package com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1079a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14483kx;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14485kz;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.d */
/* compiled from: PG */
public final class C14657d extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C14658e f44265a;

    public C14657d(C14658e eVar) {
        this.f44265a = eVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.CONFIGURATION_CHANGED".equals(intent.getAction())) {
            C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
            C14483kx kxVar = (C14483kx) C14485kz.f43772d.createBuilder();
            kxVar.copyOnWrite();
            ((C14485kz) kxVar.instance).f43774a = 10;
            gtVar.copyOnWrite();
            C14492lf lfVar = (C14492lf) gtVar.instance;
            C14485kz kzVar = (C14485kz) kxVar.build();
            kzVar.getClass();
            lfVar.f43799b = kzVar;
            lfVar.f43798a = 1;
            ((C14986h) this.f44265a.f44269d.mo17428b()).mo21875g((C14492lf) gtVar.build());
        }
    }
}
