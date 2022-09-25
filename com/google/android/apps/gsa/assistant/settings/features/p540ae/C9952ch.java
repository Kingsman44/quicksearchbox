package com.google.android.apps.gsa.assistant.settings.features.p540ae;

import android.accounts.Account;
import android.support.p031v4.app.C0167am;
import android.view.View;
import com.google.android.libraries.home.p1958f.p1960b.p1961a.C23812a;
import com.google.android.libraries.home.p1958f.p1960b.p1961a.C23813b;
import com.google.assistant.p3861at.C50275ra;
import com.google.assistant.p3861at.C50279re;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.ch */
/* compiled from: PG */
public final /* synthetic */ class C9952ch implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C9958cn f34090a;

    /* renamed from: b */
    public final /* synthetic */ C50279re f34091b;

    public /* synthetic */ C9952ch(C9958cn cnVar, C50279re reVar) {
        this.f34090a = cnVar;
        this.f34091b = reVar;
    }

    public final void onClick(View view) {
        C9958cn cnVar = this.f34090a;
        C50279re reVar = this.f34091b;
        C0167am activity = cnVar.f34102b.getActivity();
        if (activity != null) {
            Account a = cnVar.f34105e.a();
            a.getClass();
            String str = a.name;
            String str2 = reVar.f130754a;
            String str3 = reVar.f130755b;
            C50275ra raVar = reVar.f130756c;
            if (raVar == null) {
                raVar = C50275ra.f130736b;
            }
            cnVar.f34102b.startActivity(C23813b.m44343a(activity, C23812a.f65229b.buildUpon().appendPath("roomSettings").appendQueryParameter("userEmail", str).appendQueryParameter("homeId", str2).appendQueryParameter("roomId", str3).build(), raVar.f130738a));
        }
    }
}
