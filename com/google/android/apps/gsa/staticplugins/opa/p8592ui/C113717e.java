package com.google.android.apps.gsa.staticplugins.opa.p8592ui;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.assist.p503c.p504a.C9388a;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.logging.C28285c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ui.e */
/* compiled from: PG */
public final /* synthetic */ class C113717e implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C113719g f314940a;

    /* renamed from: b */
    public final /* synthetic */ AlertDialog f314941b;

    public /* synthetic */ C113717e(C113719g gVar, AlertDialog alertDialog) {
        this.f314940a = gVar;
        this.f314941b = alertDialog;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C113719g gVar = this.f314940a;
        C89949q.m146521e(C28285c.m52882i(this.f314941b.getButton(-1), 5, (Integer) null), false);
        if (gVar.f314943a.mo17584f()) {
            Bundle bundle = new Bundle();
            bundle.putString(":settings:fragment_args_key", "context");
            Intent intent = new Intent("android.settings.VOICE_INPUT_SETTINGS");
            intent.putExtra(":settings:show_fragment_args", bundle);
            gVar.startActivity(intent);
            return;
        }
        C9388a aVar = gVar.f314943a;
        if (aVar == null || gVar.f314944b == null) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        aVar.mo17579a(false);
        gVar.f314944b.mo17662a(false);
    }
}
