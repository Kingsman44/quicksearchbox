package com.google.android.libraries.mdi.download.p2236d.p2241e;

import com.google.android.libraries.mdi.download.C29384eh;
import com.google.android.libraries.mdi.download.C29662ie;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58817ah;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.DesugarTimeZone;

/* renamed from: com.google.android.libraries.mdi.download.d.e.an */
/* compiled from: PG */
public final class C29025an implements C29046m {

    /* renamed from: e */
    public static final /* synthetic */ int f78785e = 0;

    /* renamed from: f */
    private static final TimeZone f78786f = DesugarTimeZone.getTimeZone("UTC");

    /* renamed from: a */
    public final C42876ab f78787a;

    /* renamed from: b */
    public final C29662ie f78788b;

    /* renamed from: c */
    public final Executor f78789c;

    /* renamed from: d */
    public final Random f78790d;

    public C29025an(C42876ab abVar, C29662ie ieVar, Executor executor, Random random) {
        this.f78787a = abVar;
        this.f78788b = ieVar;
        this.f78789c = executor;
        this.f78790d = random;
    }

    /* renamed from: f */
    public static long m53899f(long j) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(f78786f);
        gregorianCalendar.setTimeInMillis(j);
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    /* renamed from: a */
    public final C60870cx mo34549a() {
        return this.f78787a.mo46039a(C29019ah.f78780a, C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo34550b() {
        AtomicReference atomicReference = new AtomicReference(C58485gu.m89845m());
        C60870cx a = this.f78787a.mo46039a(new C29023al(atomicReference), this.f78789c);
        C58817ah c = C47810es.m84963c(new C29014ac(atomicReference));
        return C60922j.m93044g(a, C47810es.m84963c(c), this.f78789c);
    }

    /* renamed from: c */
    public final C60870cx mo34551c() {
        AtomicReference atomicReference = new AtomicReference(C58836b.f156633a);
        C60870cx a = this.f78787a.mo46039a(new C29015ad(this, atomicReference), C60826bg.f164896a);
        C29016ae aeVar = new C29016ae(atomicReference);
        return C60922j.m93044g(a, C47810es.m84963c(aeVar), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final C60870cx mo34552d() {
        C60870cx d = this.f78787a.mo46042d();
        C29017af afVar = new C29017af(this);
        return C60922j.m93045h(d, C47810es.m84966f(afVar), this.f78789c);
    }

    /* renamed from: e */
    public final C60870cx mo34553e(C29384eh ehVar) {
        return this.f78787a.mo46039a(new C29018ag(ehVar), this.f78789c);
    }
}
