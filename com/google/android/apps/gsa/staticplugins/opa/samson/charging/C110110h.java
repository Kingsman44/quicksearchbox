package com.google.android.apps.gsa.staticplugins.opa.samson.charging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2384o;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.shared.C110121g;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.shared.OpaAmbientUiStatus;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.h */
/* compiled from: PG */
final class C110110h extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C110111i f306809a;

    public C110110h(C110111i iVar) {
        this.f306809a = iVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null && "android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            C110111i iVar = this.f306809a;
            C58976aa aaVar = C58975e.f156826a;
            if (iVar.f306813c.mo98624b(true)) {
                OpaAmbientUiStatus opaAmbientUiStatus = iVar.f306812b;
                if (opaAmbientUiStatus.f306843a) {
                    opaAmbientUiStatus.f306843a = false;
                } else if (!opaAmbientUiStatus.f306845c && iVar.f306815e.getMode() != 3 && iVar.f306815e.getMode() != 2) {
                    if (iVar.f306811a.mo79746e(C90014bt.f247069aG)) {
                        OpaAmbientUiStatus opaAmbientUiStatus2 = iVar.f306812b;
                        if (opaAmbientUiStatus2.f306844b) {
                            opaAmbientUiStatus2.f306844b = false;
                            return;
                        }
                    }
                    if (iVar.f306811a.mo79746e(C90014bt.f247069aG)) {
                        Iterator it = iVar.f306812b.f306850h.iterator();
                        while (it.hasNext()) {
                            C110121g gVar = (C110121g) ((WeakReference) it.next()).get();
                            if (gVar == null) {
                                it.remove();
                            } else {
                                C2384o a = gVar.mo98325a();
                                if (a != null && a.mo5789a().mo5788a(C2383n.STARTED)) {
                                    return;
                                }
                            }
                        }
                    }
                    iVar.mo98386c(0);
                }
            }
        }
    }
}
