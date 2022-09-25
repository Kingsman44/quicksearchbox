package com.google.android.apps.gsa.staticplugins.opa;

import android.content.Intent;
import android.view.View;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.om */
/* compiled from: PG */
final class C109767om implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ZeroStateActivity f305844a;

    public C109767om(ZeroStateActivity zeroStateActivity) {
        this.f305844a = zeroStateActivity;
    }

    public final void onClick(View view) {
        Intent intent = new Intent();
        intent.setPackage(this.f305844a.getPackageName());
        C87565h hVar = new C87565h();
        hVar.f236499C = true;
        hVar.f236519W = true;
        hVar.f236556b = e.aC;
        intent.putExtras(hVar.mo81685a());
        intent.putExtra("opa_exit_signed_out_mode_and_relaunch", true);
        this.f305844a.f295685J.mo65089a(intent);
        this.f305844a.finish();
    }
}
