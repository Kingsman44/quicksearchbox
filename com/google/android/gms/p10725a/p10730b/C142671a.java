package com.google.android.gms.p10725a.p10730b;

import android.net.Uri;
import java.util.Map;

/* renamed from: com.google.android.gms.a.b.a */
/* compiled from: PG */
final class C142671a extends Thread {

    /* renamed from: a */
    final /* synthetic */ Map f387152a;

    public C142671a(Map map) {
        this.f387152a = map;
    }

    public final void run() {
        Map map = this.f387152a;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        C142678e.m231502a(buildUpon.build().toString());
    }
}
