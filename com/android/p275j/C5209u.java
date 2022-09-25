package com.android.p275j;

import android.os.Handler;
import android.os.Looper;
import com.android.p275j.p276a.C5172b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.android.j.u */
/* compiled from: PG */
public final class C5209u {

    /* renamed from: a */
    public final AtomicInteger f16526a = new AtomicInteger();

    /* renamed from: b */
    public final Set f16527b = new HashSet();

    /* renamed from: c */
    public final PriorityBlockingQueue f16528c = new PriorityBlockingQueue();

    /* renamed from: d */
    public final PriorityBlockingQueue f16529d = new PriorityBlockingQueue();

    /* renamed from: e */
    public final C5191c f16530e;

    /* renamed from: f */
    public final C5200l[] f16531f;

    /* renamed from: g */
    public C5193e f16532g;

    /* renamed from: h */
    public final List f16533h = new ArrayList();

    /* renamed from: i */
    public final C5198j f16534i;

    /* renamed from: j */
    public final C5172b f16535j;

    /* renamed from: k */
    private final List f16536k = new ArrayList();

    public C5209u(C5191c cVar, C5172b bVar) {
        C5198j jVar = new C5198j(new Handler(Looper.getMainLooper()));
        this.f16530e = cVar;
        this.f16535j = bVar;
        this.f16531f = new C5200l[4];
        this.f16534i = jVar;
    }

    /* renamed from: a */
    public final void mo10304a() {
        synchronized (this.f16536k) {
            for (C5207s a : this.f16536k) {
                a.mo10302a();
            }
        }
    }
}
