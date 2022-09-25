package com.google.android.libraries.storage.protostore;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import com.google.common.base.C58881cr;
import com.google.common.base.C58885cv;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58585km;
import com.google.common.p4522b.C58673nt;
import com.google.common.p4522b.C58677nx;
import com.google.common.p4522b.C58701ou;
import com.google.common.p4522b.C58724pq;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.storage.protostore.u */
/* compiled from: PG */
public final class C43018u implements C42940ch {

    /* renamed from: a */
    public static final TimeUnit f112495a = TimeUnit.MILLISECONDS;

    /* renamed from: b */
    public final Context f112496b;

    /* renamed from: c */
    public final String f112497c;

    /* renamed from: d */
    public final Handler f112498d;

    /* renamed from: e */
    public final TimeUnit f112499e;

    /* renamed from: f */
    public final C58585km f112500f = new C58677nx(new C58673nt(C58701ou.f156429a)).mo55746a();

    /* renamed from: g */
    public final Object f112501g = new Object();

    /* renamed from: h */
    private final C60931s f112502h;

    /* renamed from: i */
    private final C58881cr f112503i;

    public C43018u(C43015r rVar) {
        this.f112496b = rVar.f112484a;
        this.f112502h = rVar.f112485b;
        this.f112497c = rVar.f112486c;
        this.f112498d = rVar.f112487d;
        this.f112503i = rVar.f112488e;
        this.f112499e = rVar.f112489f;
    }

    /* renamed from: a */
    public final C60870cx mo46013a(C60870cx cxVar, String str) {
        Integer num = (Integer) ((C58885cv) this.f112503i).f156729a;
        if (num.intValue() < 0) {
            return C60866ct.f164955a;
        }
        C60870cx h = C60922j.m93045h(cxVar, this.f112502h, C60826bg.f164896a);
        return C60856cj.m92895d(cxVar, h).mo57335b(new C43012o(this, cxVar, h, num), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo46014b(C60870cx cxVar, Runnable runnable, String str) {
        return C60922j.m93044g(cxVar, new C43013p(this, runnable), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final void mo46047c(Uri uri) {
        C58480gp e = C58485gu.m89837e();
        synchronized (this.f112501g) {
            e.mo55396h(this.f112500f.mo55277g(uri));
        }
        C58485gu f = e.mo55394f();
        int i = ((C58724pq) f).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            ((Runnable) f.get(i2)).run();
        }
    }
}
