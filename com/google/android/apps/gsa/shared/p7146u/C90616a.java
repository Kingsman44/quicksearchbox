package com.google.android.apps.gsa.shared.p7146u;

import com.google.android.apps.gsa.shared.util.p7159c.C90908be;
import com.google.android.apps.gsa.shared.util.p7159c.C90940f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60829bj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* renamed from: com.google.android.apps.gsa.shared.u.a */
/* compiled from: PG */
public final class C90616a extends FutureTask implements C60870cx, C90908be {

    /* renamed from: a */
    final /* synthetic */ C90619c f253308a;

    /* renamed from: b */
    private final C60829bj f253309b = new C60829bj();

    /* renamed from: c */
    private final String f253310c;

    /* renamed from: d */
    private final String f253311d;

    /* renamed from: e */
    private String f253312e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C90616a(C90619c cVar, Callable callable, String str) {
        super(callable);
        this.f253308a = cVar;
        this.f253311d = str;
        this.f253310c = "getRecentContext";
    }

    /* renamed from: b */
    public final void mo4106b(Runnable runnable, Executor executor) {
        this.f253309b.mo57297a(runnable, executor);
    }

    /* access modifiers changed from: protected */
    public final void done() {
        int i = C90619c.f253313i;
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f253308a.f253321f) {
            this.f253308a.f253323h.remove(this);
        }
        this.f253309b.mo57298b();
    }

    /* renamed from: hh */
    public final int mo84768hh() {
        return 12;
    }

    /* renamed from: hi */
    public final int mo84769hi() {
        return 2;
    }

    public final void setException(Throwable th) {
        super.setException(th);
    }

    public final String toString() {
        if (this.f253312e == null) {
            this.f253312e = C90940f.m148552b(getClass(), this.f253311d, this.f253310c);
        }
        return this.f253312e;
    }
}
