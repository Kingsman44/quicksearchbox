package com.google.android.apps.search.googleapp.collections.p10143b;

import android.net.Uri;
import android.support.p033v7.app.C0401v;
import com.google.android.apps.search.googleapp.p10165d.C133933a;
import com.google.android.apps.search.googleapp.p10369o.C136832c;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.collections.b.d */
/* compiled from: PG */
public final class C133503d {

    /* renamed from: a */
    private final C136832c f363764a;

    /* renamed from: b */
    private final C133933a f363765b;

    public C133503d(C136832c cVar, C133933a aVar) {
        this.f363764a = cVar;
        this.f363765b = aVar;
    }

    /* renamed from: a */
    public final Uri mo111205a(Uri uri) {
        if (!this.f363764a.mo113398d(uri)) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        if (!uri.getQueryParameterNames().contains("cs")) {
            C133933a aVar = this.f363765b;
            int i = C0401v.f1356b;
            if (C133933a.m217248a(aVar.f364779a)) {
                buildUpon.appendQueryParameter("cs", "1");
            }
        }
        if (!uri.getQueryParameterNames().contains("hl")) {
            buildUpon.appendQueryParameter("hl", Locale.getDefault().getLanguage());
        }
        return buildUpon.build();
    }
}
