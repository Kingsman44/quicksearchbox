package com.google.android.apps.gsa.shared.p7144t;

import com.google.android.apps.gsa.shared.util.p7159c.C90940f;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60829bj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* renamed from: com.google.android.apps.gsa.shared.t.d */
/* compiled from: PG */
final class C90613d extends FutureTask implements C60870cx, C22869e {

    /* renamed from: a */
    public final String f253288a;

    /* renamed from: b */
    final /* synthetic */ C90615f f253289b;

    /* renamed from: c */
    private final C60829bj f253290c = new C60829bj();

    /* renamed from: d */
    private final String f253291d;

    /* renamed from: e */
    private String f253292e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C90613d(C90615f fVar, Callable callable, String str, String str2) {
        super(callable);
        this.f253289b = fVar;
        this.f253291d = str;
        this.f253288a = str2;
    }

    /* renamed from: b */
    public final void mo4106b(Runnable runnable, Executor executor) {
        this.f253290c.mo57297a(runnable, executor);
    }

    /* access modifiers changed from: protected */
    public final void done() {
        int i = C90615f.f253295o;
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f253289b.f253305l) {
            this.f253289b.f253306m.remove(this);
        }
        this.f253290c.mo57298b();
    }

    public final void setException(Throwable th) {
        super.setException(th);
    }

    public final String toString() {
        if (this.f253292e == null) {
            this.f253292e = C90940f.m148552b(getClass(), this.f253291d, this.f253288a);
        }
        return this.f253292e;
    }
}
