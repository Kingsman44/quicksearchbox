package com.google.android.apps.search.googleapp.searchwidget.p10479c;

import android.content.Context;
import android.net.Uri;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.frameworks.client.data.android.C61362ad;
import com.google.frameworks.client.data.android.C61363ae;
import com.google.frameworks.client.data.android.C61365ag;
import com.google.frameworks.client.data.android.C61531o;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.c.z */
/* compiled from: PG */
public final class C138994z {

    /* renamed from: a */
    public static final C59071e f377996a = C59071e.m91332i("com.google.android.apps.search.googleapp.searchwidget.c.z");

    /* renamed from: b */
    public final C61531o f377997b;

    /* renamed from: c */
    public final C60887da f377998c;

    /* renamed from: d */
    public final String f377999d;

    /* renamed from: e */
    private final Context f378000e;

    public C138994z(Context context, C60887da daVar, C61531o oVar, String str) {
        this.f378000e = context;
        this.f377998c = daVar;
        this.f377999d = str;
        this.f377997b = oVar;
    }

    /* renamed from: a */
    public final C60870cx mo114649a(String str, C58817ah ahVar) {
        C61531o oVar = this.f377997b;
        Uri.Builder appendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("async", "_fmt:pb");
        appendQueryParameter.appendQueryParameter("client", "andwidget");
        if (this.f378000e.getResources().getConfiguration().getLayoutDirection() == 1) {
            appendQueryParameter.appendQueryParameter("rtl", "1");
        }
        C61363ae aeVar = new C61363ae();
        aeVar.mo57932a(C61362ad.m93870b("Accept"), "*/*");
        String builder = appendQueryParameter.toString();
        builder.getClass();
        aeVar.f165930a = builder;
        aeVar.mo57933b("GET");
        return C60922j.m93044g(oVar.mo42484a(new C61365ag(aeVar)), C47810es.m84963c(ahVar), this.f377998c);
    }
}
