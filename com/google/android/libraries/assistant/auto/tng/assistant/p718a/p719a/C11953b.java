package com.google.android.libraries.assistant.auto.tng.assistant.p718a.p719a;

import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.dataservice.C46691ai;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.local.C46851e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.a.a.b */
/* compiled from: PG */
public final class C11953b implements C46851e {

    /* renamed from: a */
    public final C46690ah f38400a;

    /* renamed from: b */
    private final Object f38401b;

    /* renamed from: c */
    private final AtomicReference f38402c;

    /* renamed from: d */
    private final C46778cv f38403d;

    public C11953b(C46690ah ahVar, Object obj, C46778cv cvVar) {
        this.f38400a = ahVar;
        this.f38401b = obj;
        this.f38402c = new AtomicReference(obj);
        this.f38403d = cvVar;
    }

    /* renamed from: a */
    public final C46691ai mo20330a() {
        return this.f38400a;
    }

    /* renamed from: b */
    public final C60870cx mo20331b() {
        return C60856cj.m92900i(this.f38402c.get());
    }

    /* renamed from: c */
    public final void mo20332c() {
        this.f38402c.set(this.f38401b);
        this.f38403d.mo50787a(C60866ct.f164955a, this.f38400a);
    }

    /* renamed from: d */
    public final void mo20333d(Object obj) {
        this.f38402c.set(obj);
        this.f38403d.mo50787a(C60866ct.f164955a, this.f38400a);
    }
}
