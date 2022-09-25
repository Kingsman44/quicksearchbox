package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import com.airbnb.lottie.p245f.C4947d;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.airbnb.lottie.ak */
/* compiled from: PG */
public final class C4833ak {

    /* renamed from: a */
    public static Executor f15400a = Executors.newCachedThreadPool();

    /* renamed from: b */
    public volatile C4830ah f15401b = null;

    /* renamed from: c */
    private final Set f15402c = new LinkedHashSet(1);

    /* renamed from: d */
    private final Set f15403d = new LinkedHashSet(1);

    /* renamed from: e */
    private final Handler f15404e = new Handler(Looper.getMainLooper());

    public C4833ak(Callable callable, boolean z) {
        if (z) {
            try {
                mo9791c((C4830ah) callable.call());
            } catch (Throwable th) {
                mo9791c(new C4830ah(th));
            }
        } else {
            f15400a.execute(new C4832aj(this, callable));
        }
    }

    /* renamed from: a */
    public final synchronized void mo9789a(Throwable th) {
        ArrayList arrayList = new ArrayList(this.f15403d);
        if (arrayList.isEmpty()) {
            C4947d.m13696a("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C4827ae) arrayList.get(i)).mo9783a(th);
        }
    }

    /* renamed from: b */
    public final synchronized void mo9790b(Object obj) {
        ArrayList arrayList = new ArrayList(this.f15402c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C4827ae) arrayList.get(i)).mo9783a(obj);
        }
    }

    /* renamed from: c */
    public final void mo9791c(C4830ah ahVar) {
        if (this.f15401b == null) {
            this.f15401b = ahVar;
            this.f15404e.post(new C4831ai(this));
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    /* renamed from: d */
    public final synchronized void mo9792d(C4827ae aeVar) {
        if (!(this.f15401b == null || this.f15401b.f15397b == null)) {
            aeVar.mo9783a(this.f15401b.f15397b);
        }
        this.f15403d.add(aeVar);
    }

    /* renamed from: e */
    public final synchronized void mo9793e(C4827ae aeVar) {
        if (!(this.f15401b == null || this.f15401b.f15396a == null)) {
            aeVar.mo9783a(this.f15401b.f15396a);
        }
        this.f15402c.add(aeVar);
    }

    /* renamed from: f */
    public final synchronized void mo9794f(C4827ae aeVar) {
        this.f15403d.remove(aeVar);
    }

    /* renamed from: g */
    public final synchronized void mo9795g(C4827ae aeVar) {
        this.f15402c.remove(aeVar);
    }
}
