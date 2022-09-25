package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.ag */
/* compiled from: PG */
final class C114622ag implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ String f317978a;

    /* renamed from: b */
    final /* synthetic */ C114623ah f317979b;

    public C114622ag(C114623ah ahVar, String str) {
        this.f317979b = ahVar;
        this.f317978a = str;
    }

    public final void onClick(View view) {
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:".concat(String.valueOf(this.f317978a))));
        intent.setFlags(268435456);
        this.f317979b.f317985f.mo65089a(intent);
    }
}
