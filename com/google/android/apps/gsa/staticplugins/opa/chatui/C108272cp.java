package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.cp */
/* compiled from: PG */
final class C108272cp implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C108273cq f301221a;

    public C108272cp(C108273cq cqVar) {
        this.f301221a = cqVar;
    }

    public final void onClick(View view) {
        C108273cq cqVar = this.f301221a;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://myactivity.google.com/product/assistant/embed").buildUpon().appendQueryParameter("max", String.valueOf(TimeUnit.MILLISECONDS.toMicros(cqVar.f301035q))).build());
        intent.putExtra("use_webview", true);
        intent.setFlags(268566528);
        C91097g gVar = this.f301221a.f301223a;
        gVar.getClass();
        gVar.mo65089a(intent);
        intent.getDataString();
    }
}
