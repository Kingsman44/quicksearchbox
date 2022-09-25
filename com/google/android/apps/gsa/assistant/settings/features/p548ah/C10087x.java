package com.google.android.apps.gsa.assistant.settings.features.p548ah;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.apps.gsa.assistant.settings.base.C9506h;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ah.x */
/* compiled from: PG */
final class C10087x implements C91096f {

    /* renamed from: a */
    final /* synthetic */ C10073j f34360a;

    /* renamed from: b */
    final /* synthetic */ C10064ab f34361b;

    public C10087x(C10064ab abVar, C10073j jVar) {
        this.f34361b = abVar;
        this.f34360a = jVar;
    }

    /* renamed from: hg */
    public final boolean mo17703hg(int i, Intent intent, Context context) {
        C58976aa aaVar = C58975e.f156826a;
        if (i == -1) {
            this.f34361b.mo18222M(this.f34360a, (Long) null, true, (C9506h) null);
        } else {
            C10064ab abVar = this.f34361b;
            C10073j jVar = this.f34360a;
            Activity fX = abVar.mo17794fX();
            if (fX != null) {
                new AlertDialog.Builder(fX).setTitle(abVar.mo17797h(R.string.link_failure_dialog_title, jVar.f12745q)).setMessage(abVar.mo17795g(R.string.failure_dialog_description)).setPositiveButton(abVar.mo17795g(R.string.failure_dialog_positive_button), (DialogInterface.OnClickListener) null).show();
            }
        }
        return true;
    }
}
