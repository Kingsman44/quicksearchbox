package com.google.android.apps.gsa.assistant.settings.features.p540ae;

import android.content.Intent;
import android.view.View;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C50256qi;
import com.google.assistant.p3861at.C50266qs;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.cm */
/* compiled from: PG */
public final /* synthetic */ class C9957cm implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C9958cn f34099a;

    /* renamed from: b */
    public final /* synthetic */ C50266qs f34100b;

    public /* synthetic */ C9957cm(C9958cn cnVar, C50266qs qsVar) {
        this.f34099a = cnVar;
        this.f34100b = qsVar;
    }

    public final void onClick(View view) {
        C50256qi qiVar;
        C9958cn cnVar = this.f34099a;
        C50266qs qsVar = this.f34100b;
        if (cnVar.f34102b.getActivity() != null) {
            if (qsVar.f130718a == 2) {
                qiVar = (C50256qi) qsVar.f130719b;
            } else {
                qiVar = C50256qi.f130687d;
            }
            C49875cf a = C49875cf.m85755a(qiVar.f130690b);
            if (a == null) {
                a = C49875cf.UNKNOWN;
            }
            C9943bz bzVar = cnVar.f34102b;
            String str = qiVar.f130691c;
            Intent a2 = cnVar.mo18153a("device_info");
            a2.putExtra("assistant_surface", a.f129621v);
            a2.putExtra("assistant_device_id", str);
            bzVar.startActivityForResult(a2, 0);
        }
    }
}
