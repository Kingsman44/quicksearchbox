package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.af */
/* compiled from: PG */
final class C114621af implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ String f317976a;

    /* renamed from: b */
    final /* synthetic */ C114623ah f317977b;

    public C114621af(C114623ah ahVar, String str) {
        this.f317977b = ahVar;
        this.f317976a = str;
    }

    public final void onClick(View view) {
        Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:".concat(String.valueOf(this.f317976a))));
        intent.setFlags(268435456);
        this.f317977b.f317985f.mo65089a(intent);
    }
}
