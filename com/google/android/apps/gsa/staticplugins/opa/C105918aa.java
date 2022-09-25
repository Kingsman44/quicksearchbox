package com.google.android.apps.gsa.staticplugins.opa;

import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.p8378m.C109459e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.aa */
/* compiled from: PG */
public final /* synthetic */ class C105918aa implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C109040fj f295727a;

    /* renamed from: b */
    public final /* synthetic */ String f295728b;

    public /* synthetic */ C105918aa(C109040fj fjVar, String str) {
        this.f295727a = fjVar;
        this.f295728b = str;
    }

    public final void onClick(View view) {
        C109040fj fjVar = this.f295727a;
        String str = this.f295728b;
        if (TextUtils.isEmpty(str)) {
            fjVar.mo97417E(true);
            fjVar.mo97485au();
            fjVar.f303225K.mo95252d().setOnClickListener(new C108112bx(fjVar));
            return;
        }
        fjVar.mo97441aC(C109459e.m182156a(str).toByteArray());
        if (fjVar.f303455t.mo79746e(C90014bt.f247784ng)) {
            fjVar.f303454s.mo96219b(new C88489j(C87739bu.STOP_SPEAKING).mo82013a());
            fjVar.mo97413A();
            return;
        }
        fjVar.mo97485au();
        fjVar.f303454s.mo96219b(new C88489j(C87739bu.STOP_SPEAKING).mo82013a());
    }
}
