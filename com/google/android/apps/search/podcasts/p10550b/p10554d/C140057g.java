package com.google.android.apps.search.podcasts.p10550b.p10554d;

import android.content.Context;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.MessageLite;
import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.podcasts.b.d.g */
/* compiled from: PG */
public final class C140057g {

    /* renamed from: a */
    public static final C59071e f380635a = C59071e.m91332i("com.google.android.apps.search.podcasts.b.d.g");

    /* renamed from: b */
    public final String f380636b;

    /* renamed from: c */
    public int f380637c;

    /* renamed from: d */
    C60870cx f380638d;

    /* renamed from: e */
    C60870cx f380639e = C60866ct.f164955a;

    /* renamed from: f */
    private final String f380640f;

    /* renamed from: g */
    private final Context f380641g;

    /* renamed from: h */
    private final Executor f380642h;

    /* renamed from: i */
    private final Executor f380643i;

    public C140057g(Context context, Executor executor, Executor executor2, String str, String str2) {
        this.f380636b = str;
        this.f380640f = str2;
        this.f380641g = context;
        this.f380642h = executor;
        this.f380643i = new C60904dr(executor2);
    }

    /* renamed from: a */
    public final C60870cx mo115421a(C58881cr crVar, C140056f fVar) {
        if (this.f380638d == null) {
            MessageLite messageLite = (MessageLite) crVar.mo6453a();
            C140054d dVar = new C140054d(this, messageLite);
            this.f380638d = C47633f.m84733g(C60856cj.m92904m(C47810es.m84978r(dVar), this.f380642h)).mo51515h(new C140052b(fVar), this.f380643i).mo51513e(Throwable.class, new C140053c(fVar, messageLite), this.f380643i);
        }
        C60870cx cxVar = this.f380638d;
        cxVar.getClass();
        return cxVar;
    }

    /* renamed from: b */
    public final C60870cx mo115422b(MessageLite messageLite) {
        C60870cx cxVar = this.f380639e;
        C140051a aVar = new C140051a(this, messageLite);
        C60870cx g = C60922j.m93044g(cxVar, C47810es.m84963c(aVar), this.f380642h);
        this.f380639e = g;
        C46459k.m82829b(g, "Non-IO error saving file %s", this.f380636b);
        return this.f380639e;
    }

    /* renamed from: c */
    public final File mo115423c(String str) {
        File filesDir = this.f380641g.getFilesDir();
        String str2 = this.f380640f;
        return new File(filesDir, str2 + "/" + str);
    }
}
