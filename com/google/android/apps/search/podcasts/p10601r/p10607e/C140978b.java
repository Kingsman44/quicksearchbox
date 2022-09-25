package com.google.android.apps.search.podcasts.p10601r.p10607e;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: com.google.android.apps.search.podcasts.r.e.b */
/* compiled from: PG */
public final class C140978b {

    /* renamed from: a */
    private final Context f382761a;

    public C140978b(Context context) {
        this.f382761a = context;
    }

    /* renamed from: a */
    public final void mo116055a(Uri uri) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", uri.toString());
        intent.setType("text/plain");
        intent.addFlags(268435456);
        this.f382761a.startActivity(Intent.createChooser(intent, (CharSequence) null));
    }
}
