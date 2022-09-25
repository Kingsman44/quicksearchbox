package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.search.assistant.verticals.family.custodio.C132363y;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.tracing.C47810es;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.ac */
/* compiled from: PG */
public final /* synthetic */ class C132112ac implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C132363y.C132365a f360628a;

    public /* synthetic */ C132112ac(C132363y.C132365a aVar) {
        this.f360628a = aVar;
    }

    public final void onClick(View view) {
        C132363y.C132365a aVar = this.f360628a;
        C132363y.this.f361316j.mo19974a(C37176a.f97213hM);
        C47810es.m84979s(C132363y.this.f361308b.getContext(), new Intent("android.intent.action.VIEW", Uri.parse("https://madeby.google.com/home-app")));
    }
}
