package com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9735b;

import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.ui.b.f */
/* compiled from: PG */
final class C128575f extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ URLSpan f353536a;

    /* renamed from: b */
    final /* synthetic */ C128572e f353537b;

    public C128575f(C128572e eVar, URLSpan uRLSpan) {
        this.f353537b = eVar;
        this.f353536a = uRLSpan;
    }

    public final void onClick(View view) {
        Intent data = new Intent("android.intent.action.VIEW").addFlags(268435456).setData(Uri.parse(this.f353536a.getURL()));
        C128572e eVar = this.f353537b;
        eVar.f353532g.mo50445g(C46438d.m82810b(eVar.f353530e.mo20101f(data)), new C46436b(data), this.f353537b.f353533h);
    }
}
