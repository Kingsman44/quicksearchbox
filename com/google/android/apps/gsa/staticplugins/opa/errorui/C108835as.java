package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.content.Context;
import android.widget.Toast;
import com.google.android.apps.gsa.assistant.shared.n.k;
import com.google.assistant.p3861at.C50004h;
import com.google.assistant.p3861at.acz;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.as */
/* compiled from: PG */
final class C108835as extends k {

    /* renamed from: a */
    final /* synthetic */ Context f302613a;

    public C108835as(Context context) {
        this.f302613a = context;
    }

    /* renamed from: gn */
    public final void mo97208gn(Throwable th) {
        int i = C108836at.f302614t;
    }

    /* renamed from: go */
    public final /* bridge */ /* synthetic */ void mo97209go(Object obj) {
        int i = C108836at.f302614t;
        C50004h hVar = ((acz) obj).f129015d;
        if (hVar == null) {
            hVar = C50004h.f129989d;
        }
        if ((hVar.f129991a & 2) != 0) {
            Toast.makeText(this.f302613a, hVar.f129993c, 0).show();
        }
    }
}
