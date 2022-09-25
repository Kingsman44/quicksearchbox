package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.content.Context;
import android.widget.Toast;
import com.google.android.apps.gsa.assistant.shared.n.k;
import com.google.assistant.p3861at.C50004h;
import com.google.assistant.p3861at.acz;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.af */
/* compiled from: PG */
final class C108822af extends k {

    /* renamed from: a */
    final /* synthetic */ Context f302589a;

    public C108822af(Context context) {
        this.f302589a = context;
    }

    /* renamed from: gn */
    public final void mo97201gn(Throwable th) {
        int i = C108823ag.f302590f;
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: go */
    public final /* synthetic */ void mo97202go(Object obj) {
        int i = C108823ag.f302590f;
        C58976aa aaVar = C58975e.f156826a;
        C50004h hVar = ((acz) obj).f129015d;
        if (hVar == null) {
            hVar = C50004h.f129989d;
        }
        if ((hVar.f129991a & 2) != 0) {
            Toast.makeText(this.f302589a, hVar.f129993c, 0).show();
        }
    }
}
