package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.p10712d.C142320az;
import com.google.android.p10712d.C142346by;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.by */
/* compiled from: PG */
public final /* synthetic */ class C9606by implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C9619ck f33215a;

    public /* synthetic */ C9606by(C9619ck ckVar) {
        this.f33215a = ckVar;
    }

    public final void run() {
        C9619ck ckVar = this.f33215a;
        if (ckVar.f33286t == null) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        String b = ckVar.mo17909b();
        if (b == null) {
            C58976aa aaVar2 = C58975e.f156826a;
            return;
        }
        C142346by byVar = ckVar.f33291y.f386120f;
        if (byVar == null) {
            byVar = C142346by.f386219m;
        }
        C142320az azVar = byVar.f386226f;
        if (azVar == null) {
            azVar = C142320az.f386099j;
        }
        String e = C58837ba.m90856e(azVar.f386109i);
        if (e == null) {
            C58976aa aaVar3 = C58975e.f156826a;
            return;
        }
        Uri build = Uri.parse(e).buildUpon().appendPath(ckVar.f33286t).build();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(build).putExtra("key_device_id", ckVar.f33286t).setPackage(b);
        C91097g f = ckVar.mo17793f();
        if (f == null || !f.mo65092d()) {
            C58976aa aaVar4 = C58975e.f156826a;
        } else {
            f.mo65090b(intent, new C9583bb(ckVar));
        }
    }
}
