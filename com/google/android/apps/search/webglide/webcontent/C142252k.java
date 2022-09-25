package com.google.android.apps.search.webglide.webcontent;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.apps.tiktok.tracing.C47810es;

/* renamed from: com.google.android.apps.search.webglide.webcontent.k */
/* compiled from: PG */
final class C142252k implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C142255n f385916a;

    /* renamed from: b */
    final /* synthetic */ View f385917b;

    public C142252k(C142255n nVar, View view) {
        this.f385916a = nVar;
        this.f385917b = view;
    }

    public final void onClick(View view) {
        this.f385916a.mo117094a(this.f385917b);
        C47810es.m84979s(this.f385916a.f385925c, Intent.createChooser(new Intent("android.intent.action.VIEW", Uri.parse(this.f385916a.f385924b.mo46468a().f113329b)), (CharSequence) null));
    }
}
