package com.google.android.apps.gsa.assistant.settings.features.p540ae;

import android.accounts.Account;
import android.support.p031v4.app.C0167am;
import android.view.View;
import com.google.android.libraries.home.p1958f.p1960b.p1961a.C23813b;
import com.google.assistant.p3861at.C50258qk;
import com.google.assistant.p3861at.C50266qs;
import com.google.assistant.p3861at.C50275ra;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.cb */
/* compiled from: PG */
public final /* synthetic */ class C9946cb implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C9958cn f34082a;

    /* renamed from: b */
    public final /* synthetic */ C50266qs f34083b;

    public /* synthetic */ C9946cb(C9958cn cnVar, C50266qs qsVar) {
        this.f34082a = cnVar;
        this.f34083b = qsVar;
    }

    public final void onClick(View view) {
        C50258qk qkVar;
        C9958cn cnVar = this.f34082a;
        C50266qs qsVar = this.f34083b;
        C0167am activity = cnVar.f34102b.getActivity();
        if (activity != null) {
            if (qsVar.f130718a == 5) {
                qkVar = (C50258qk) qsVar.f130719b;
            } else {
                qkVar = C50258qk.f130692c;
            }
            Account a = cnVar.f34105e.a();
            a.getClass();
            String str = a.name;
            String str2 = qkVar.f130694a;
            C50275ra raVar = qkVar.f130695b;
            if (raVar == null) {
                raVar = C50275ra.f130736b;
            }
            cnVar.f34102b.startActivity(C23813b.m44344b(activity, str, str2, raVar.f130738a));
        }
    }
}
