package com.google.android.libraries.lens.view.p2151m;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.browser.p059a.C0962j;
import com.google.common.p4522b.C58485gu;
import java.util.Set;

/* renamed from: com.google.android.libraries.lens.view.m.h */
/* compiled from: PG */
public final class C27281h {

    /* renamed from: a */
    public static final Intent f74619a = new Intent("android.intent.action.VIEW", Uri.parse("https://www.google.com/search"));

    /* renamed from: b */
    public static final Intent f74620b = new Intent("android.intent.action.VIEW", Uri.parse("http://shopping.google.com"));

    /* renamed from: c */
    public static final C58485gu f74621c = C58485gu.m89850r("com.android.chrome", "com.chrome.beta", "com.chrome.canary", "com.chrome.dev", "com.google.android.apps.chrome");

    /* renamed from: d */
    public final Context f74622d;

    /* renamed from: e */
    public Set f74623e;

    /* renamed from: f */
    public Set f74624f;

    /* renamed from: g */
    private String f74625g;

    public C27281h(Context context) {
        this.f74622d = context;
    }

    /* renamed from: a */
    public final String mo32811a() {
        if (this.f74625g == null) {
            this.f74625g = C0962j.m2897c(this.f74622d, f74621c, false);
        }
        return this.f74625g;
    }
}
