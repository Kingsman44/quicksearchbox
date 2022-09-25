package com.google.ads.interactivemedia.p367v3.internal;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;

/* renamed from: com.google.ads.interactivemedia.v3.internal.amy */
/* compiled from: PG */
final class amy extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ String f21005a;

    /* renamed from: b */
    final /* synthetic */ ane f21006b;

    public amy(ane ane, String str) {
        this.f21006b = ane;
        this.f21005a = str;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f21005a));
        if (!(this.f21006b.f21019g instanceof Activity)) {
            intent.setFlags(268435456);
        }
        this.f21006b.f21019g.startActivity(intent);
        return null;
    }
}
