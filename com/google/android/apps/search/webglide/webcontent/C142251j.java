package com.google.android.apps.search.webglide.webcontent;

import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import com.google.apps.tiktok.tracing.C47810es;

/* renamed from: com.google.android.apps.search.webglide.webcontent.j */
/* compiled from: PG */
final class C142251j implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C142255n f385914a;

    /* renamed from: b */
    final /* synthetic */ ImageButton f385915b;

    public C142251j(C142255n nVar, ImageButton imageButton) {
        this.f385914a = nVar;
        this.f385915b = imageButton;
    }

    public final void onClick(View view) {
        this.f385914a.mo117094a(this.f385915b);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", this.f385914a.f385924b.mo46468a().f113329b);
        intent.setType("text/plain");
        C47810es.m84979s(this.f385914a.f385925c, Intent.createChooser(intent, (CharSequence) null));
    }
}
