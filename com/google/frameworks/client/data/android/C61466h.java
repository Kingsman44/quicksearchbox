package com.google.frameworks.client.data.android;

import android.content.Context;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58881cr;
import com.google.common.base.C58885cv;
import com.google.frameworks.client.data.android.p4632a.C61343d;
import com.google.frameworks.client.data.android.p4636d.C61402a;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.frameworks.client.data.android.h */
/* compiled from: PG */
public abstract class C61466h {
    /* renamed from: s */
    public static C61425g m94139s() {
        C58885cv cvVar = new C58885cv(false);
        C61381b bVar = new C61381b();
        bVar.f165960e = cvVar;
        bVar.f165961f = cvVar;
        bVar.f165962g = cvVar;
        bVar.f165963h = new C58885cv(Long.valueOf(TimeUnit.MINUTES.toMillis(30)));
        bVar.f165964i = 4194304;
        bVar.f165965j = 1;
        return bVar;
    }

    /* renamed from: a */
    public abstract int mo57978a();

    /* renamed from: b */
    public abstract Context mo57979b();

    /* renamed from: c */
    public abstract C21370a mo57980c();

    /* renamed from: d */
    public abstract C58881cr mo57981d();

    /* renamed from: e */
    public abstract C58881cr mo57982e();

    /* renamed from: f */
    public abstract C58881cr mo57984f();

    /* renamed from: g */
    public abstract C58881cr mo57985g();

    /* renamed from: h */
    public abstract C61530n mo57986h();

    /* renamed from: i */
    public abstract C61371am mo57988i();

    /* renamed from: j */
    public abstract C61375aq mo57989j();

    /* renamed from: k */
    public abstract C61378at mo57990k();

    /* renamed from: l */
    public abstract C61343d mo57991l();

    /* renamed from: m */
    public abstract C61402a mo57992m();

    /* renamed from: n */
    public abstract String mo57993n();

    /* renamed from: o */
    public abstract Executor mo57994o();

    /* renamed from: p */
    public abstract Executor mo57995p();

    /* renamed from: q */
    public abstract Executor mo57996q();

    /* renamed from: r */
    public abstract ScheduledExecutorService mo57997r();
}
