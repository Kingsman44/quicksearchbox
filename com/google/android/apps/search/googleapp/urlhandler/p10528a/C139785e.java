package com.google.android.apps.search.googleapp.urlhandler.p10528a;

import android.net.Uri;
import com.google.android.apps.gsa.p8867w.p8879i.C118803d;
import com.google.android.apps.search.googleapp.p10369o.C136832c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.googleapp.urlhandler.a.e */
/* compiled from: PG */
public final class C139785e {

    /* renamed from: c */
    private static final Pattern f379918c = Pattern.compile("[?&]adurl(=([^&]*))?(&|$)");

    /* renamed from: d */
    private static final C59071e f379919d = C59071e.m91332i("com.google.android.apps.search.googleapp.urlhandler.a.e");

    /* renamed from: a */
    public final Executor f379920a;

    /* renamed from: b */
    public final boolean f379921b;

    /* renamed from: e */
    private final C136832c f379922e;

    /* renamed from: f */
    private final C60950i f379923f;

    /* renamed from: g */
    private final C118803d f379924g;

    public C139785e(C136832c cVar, C118803d dVar, C60950i iVar, Executor executor, boolean z) {
        this.f379922e = cVar;
        this.f379924g = dVar;
        this.f379923f = iVar;
        this.f379920a = executor;
        this.f379921b = z;
    }

    /* renamed from: a */
    public final Uri mo115234a(Uri uri, Instant instant) {
        if (!this.f379922e.mo113400f(uri)) {
            return uri;
        }
        String uri2 = uri.toString();
        Matcher matcher = f379918c.matcher(uri2);
        if (!matcher.find()) {
            return uri;
        }
        String substring = uri2.substring(matcher.start() + 1);
        try {
            return Uri.parse(uri2.substring(0, matcher.start() + 1) + ("cst=" + instant.toEpochMilli()) + "&" + substring);
        } catch (ArithmeticException e) {
            ((C59052c) ((C59052c) ((C59052c) f379919d.mo56226d()).mo56382g(e)).mo56372aa(41421)).mo56386p("Parameter value overflow.");
            return uri;
        }
    }

    /* renamed from: b */
    public final C60870cx mo115235b(C60870cx cxVar) {
        Instant a = this.f379923f.mo57444a();
        C60870cx a2 = this.f379924g.mo103972a();
        C139783c cVar = new C139783c(this, cxVar, a);
        return C60922j.m93045h(a2, C47810es.m84966f(cVar), this.f379920a);
    }
}
