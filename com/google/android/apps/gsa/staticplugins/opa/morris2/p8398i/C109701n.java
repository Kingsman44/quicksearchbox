package com.google.android.apps.gsa.staticplugins.opa.morris2.p8398i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14499lm;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.i.n */
/* compiled from: PG */
final class C109701n extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C109702o f305604a;

    public C109701n(C109702o oVar) {
        this.f305604a = oVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if (C109702o.m182624d(intent, "ui_state")) {
            this.f305604a.f305608c.mo21976d((C14499lm) C109702o.m182623a(C14499lm.class, C14499lm.f43848e.getParserForType(), intent, "ui_state"), this.f305604a.f305606a.mo79746e(C90051dc.f248901cc));
        }
        if (C109702o.m182624d(intent, "event")) {
            this.f305604a.f305607b.mo21875g((C14492lf) C109702o.m182623a(C14492lf.class, C14492lf.f43796e.getParserForType(), intent, "event"));
        }
    }
}
