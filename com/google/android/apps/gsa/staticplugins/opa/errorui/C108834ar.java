package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.ar */
/* compiled from: PG */
final class C108834ar extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ String f302611a;

    /* renamed from: b */
    final /* synthetic */ Context f302612b;

    public C108834ar(String str, Context context) {
        this.f302611a = str;
        this.f302612b = context;
    }

    public final void onClick(View view) {
        this.f302612b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f302611a).buildUpon().appendQueryParameter("hl", Locale.getDefault().toLanguageTag()).build()));
    }
}
