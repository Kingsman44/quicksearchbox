package com.google.android.apps.gsa.assistant.settings.features.calls;

import android.app.Dialog;
import android.view.View;
import com.google.android.apps.gsa.assistant.settings.shared.phone.C73761c;
import com.google.assistant.p3861at.C50058j;
import com.google.assistant.p3861at.C50464ya;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.calls.by */
/* compiled from: PG */
public final /* synthetic */ class C73025by implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ cr f193668a;

    /* renamed from: b */
    public final /* synthetic */ Dialog f193669b;

    /* renamed from: c */
    public final /* synthetic */ C73042o f193670c;

    public /* synthetic */ C73025by(cr crVar, Dialog dialog, C73042o oVar) {
        this.f193668a = crVar;
        this.f193669b = dialog;
        this.f193670c = oVar;
    }

    public final void onClick(View view) {
        C50058j jVar;
        cr crVar = this.f193668a;
        Dialog dialog = this.f193669b;
        C73042o oVar = this.f193670c;
        dialog.cancel();
        C73761c cVar = crVar.l;
        C50464ya yaVar = crVar.t;
        if ((yaVar.f131334a & 2) != 0) {
            jVar = yaVar.f131337d;
            if (jVar == null) {
                jVar = C50058j.f130146f;
            }
        } else {
            jVar = null;
        }
        z.a(oVar, cVar, jVar, crVar);
    }
}
