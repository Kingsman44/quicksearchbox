package com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.assistant.shared.ax;
import com.google.android.libraries.assistant.p1467d.p1471b.C17823i;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.assistant.p3897e.p3917i.p3918a.C51474ja;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.h.v */
/* compiled from: PG */
final class C109682v extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C109685y f305471a;

    public C109682v(C109685y yVar) {
        this.f305471a = yVar;
    }

    public final void onReceive(Context context, Intent intent) {
        C17823i iVar;
        if ("android.intent.action.CONFIGURATION_CHANGED".equals(intent.getAction()) && ((Boolean) this.f305471a.f305508q.mo17428b()).booleanValue()) {
            C109685y yVar = this.f305471a;
            C58976aa aaVar = C58975e.f156826a;
            yVar.mo98003x();
            if (yVar.mo97995p()) {
                synchronized (yVar) {
                    if (yVar.mo97994o() || yVar.mo97977C()) {
                        yVar.f305495d.mo21431e(C37182a.f98069fj.mo40813g());
                        yVar.mo97993n(Optional.empty());
                    }
                }
            } else if (yVar.mo98003x() == 1) {
                if (yVar.f305503l) {
                    iVar = (C17823i) yVar.f305501j.get();
                } else {
                    iVar = (C17823i) yVar.f305499h.mo3842a();
                }
                if (iVar != C17823i.GUIDED_NAVIGATION_IN_FOREGROUND) {
                    return;
                }
                if (yVar.mo97978D()) {
                    yVar.f305495d.mo21431e(C37182a.f98070fk.mo40813g());
                    yVar.mo97993n(Optional.empty());
                } else if (!yVar.mo97977C()) {
                    yVar.f305494c.mo21425c(C37182a.f97987eG.mo40813g());
                    if (yVar.mo97979E(C51474ja.GOOGLE_MAP)) {
                        if (!yVar.f305503l) {
                            yVar.f305499h.mo5708l(iVar);
                        } else if (Optional.ofNullable(yVar.f305509r.f304937b).isPresent()) {
                            ((ax) Optional.ofNullable(yVar.f305509r.f304937b).get()).c(iVar);
                        }
                    }
                }
            }
        }
    }
}
