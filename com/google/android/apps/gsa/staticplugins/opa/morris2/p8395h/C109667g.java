package com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14483kx;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14485kz;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.common.p4552o.C59728dm;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.h.g */
/* compiled from: PG */
final class C109667g extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C109669i f305434a;

    public C109667g(C109669i iVar) {
        this.f305434a = iVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null && "com.google.android.apps.gsa.staticplugins.opa.morris.shared.INTENT_ACTION_EXIT_MORRIS_BY_ASSISTANT_PROCESS_CRASH".equals(intent.getAction())) {
            C109669i iVar = this.f305434a;
            if (iVar.f305440e) {
                C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
                C14483kx kxVar = (C14483kx) C14485kz.f43772d.createBuilder();
                kxVar.copyOnWrite();
                ((C14485kz) kxVar.instance).f43774a = 13;
                gtVar.copyOnWrite();
                C14492lf lfVar = (C14492lf) gtVar.instance;
                C14485kz kzVar = (C14485kz) kxVar.build();
                kzVar.getClass();
                lfVar.f43799b = kzVar;
                lfVar.f43798a = 1;
                ((C14986h) iVar.f305439d.mo17428b()).mo21875g((C14492lf) gtVar.build());
                return;
            }
            iVar.f305438c.n(Optional.m71637of(C59728dm.UNKNOWN_SHOW_MORRIS_UI_RESULT));
        }
    }
}
