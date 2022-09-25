package com.google.android.apps.gsa.staticplugins.p7613bw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.common.base.C58831av;
import com.google.common.p4526f.C59071e;
import com.google.p4152bb.p4153a.C55160ib;

/* renamed from: com.google.android.apps.gsa.staticplugins.bw.e */
/* compiled from: PG */
final class C97308e extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C97309f f271746a;

    public C97308e(C97309f fVar) {
        this.f271746a = fVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if (!"MediaControlWorker.ACTION_MEDIA_CONTROL_COMMAND".equals(intent.getAction())) {
            C59071e eVar = C97309f.f271747a;
            return;
        }
        C97309f fVar = this.f271746a;
        fVar.f271750f.mo28213m("MediaControlWorker - Perform Command", fVar.f271749c.mo79743a(C90120fr.f250783W), new C97307d(this, (C55160ib) C58831av.m90830c(C55160ib.m87611a(intent.getIntExtra("MediaControlWorker.EXTRA_MEDIA_CONTROL_COMMAND", C97309f.f271748b.f145231q)), C55160ib.INVALID_COMMAND), intent));
    }
}
