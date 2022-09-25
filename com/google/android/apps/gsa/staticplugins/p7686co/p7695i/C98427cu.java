package com.google.android.apps.gsa.staticplugins.p7686co.p7695i;

import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.i.cu */
/* compiled from: PG */
public final class C98427cu {

    /* renamed from: a */
    public long f274793a;

    /* renamed from: b */
    public final C118831d f274794b;

    /* renamed from: c */
    public final C118831d f274795c;

    /* renamed from: d */
    private final C118831d f274796d;

    public C98427cu(C118831d dVar, C118831d dVar2, C118831d dVar3) {
        this.f274796d = dVar;
        this.f274794b = dVar2;
        this.f274795c = dVar3;
    }

    /* renamed from: a */
    public final void mo91091a() {
        this.f274796d.mo104025g(TimeUnit.NANOSECONDS.toMillis(this.f274796d.mo104019a() - this.f274793a));
        this.f274793a = this.f274794b.mo104019a();
    }

    /* renamed from: b */
    public final void mo91092b() {
        this.f274795c.mo104025g(TimeUnit.NANOSECONDS.toMillis(this.f274795c.mo104019a() - this.f274793a));
        this.f274793a = this.f274796d.mo104019a();
    }
}
