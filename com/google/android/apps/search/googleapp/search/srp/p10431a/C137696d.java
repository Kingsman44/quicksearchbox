package com.google.android.apps.search.googleapp.search.srp.p10431a;

import android.content.Context;
import android.net.Uri;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.a.d */
/* compiled from: PG */
public final class C137696d {

    /* renamed from: a */
    public static final C59071e f374522a = C59071e.m91332i("com.google.android.apps.search.googleapp.search.srp.a.d");

    /* renamed from: b */
    public final Context f374523b;

    /* renamed from: c */
    public final Object f374524c = new Object();

    /* renamed from: d */
    public final String f374525d;

    /* renamed from: e */
    public C137697e f374526e;

    /* renamed from: f */
    private final C60887da f374527f;

    /* renamed from: g */
    private final C60888db f374528g;

    public C137696d(C60887da daVar, Context context, C60888db dbVar, String str) {
        this.f374527f = daVar;
        this.f374523b = context;
        this.f374528g = dbVar;
        this.f374525d = "gsa.a.".concat(String.valueOf(str));
    }

    /* renamed from: a */
    public final C60870cx mo113910a(Uri uri) {
        C60870cx cxVar;
        if (uri.isOpaque() || uri.getQueryParameter("ai") == null) {
            return C60856cj.m92900i(uri);
        }
        synchronized (this.f374524c) {
            C137697e eVar = this.f374526e;
            if (eVar == null) {
                cxVar = this.f374527f.mo19399b(C47810es.m84978r(new C137693a(this)));
            } else {
                cxVar = C60856cj.m92900i(eVar);
            }
        }
        return C47633f.m84733g(cxVar).mo51515h(new C137694b(this, uri), this.f374528g).mo51513e(Exception.class, new C137695c(uri), this.f374528g);
    }
}
