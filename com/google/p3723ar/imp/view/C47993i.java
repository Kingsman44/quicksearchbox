package com.google.p3723ar.imp.view;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.ar.imp.view.i */
/* compiled from: PG */
public final class C47993i {

    /* renamed from: a */
    public final C47990f f124205a;

    /* renamed from: b */
    public final C47989e f124206b = new C47989e(this);

    /* renamed from: c */
    public final C47992h f124207c = new C47992h(this);

    /* renamed from: d */
    public long f124208d = 0;

    /* renamed from: e */
    public C48011u f124209e;

    public C47993i(int i) {
        if (i - 1 != 0) {
            this.f124205a = new C47988d();
        } else {
            this.f124205a = new C47991g();
        }
    }

    /* renamed from: a */
    public final Executor mo53095a() {
        Handler a = this.f124205a.mo53092a();
        Objects.requireNonNull(a);
        return new C47980a(a);
    }

    /* renamed from: b */
    public final void mo53096b() {
        if (!mo53099e()) {
            throw new IllegalStateException("Not on frame scheduler thread.");
        }
    }

    /* renamed from: c */
    public final void mo53097c(Runnable runnable) {
        if (mo53099e()) {
            runnable.run();
        } else {
            this.f124205a.mo53092a().post(runnable);
        }
    }

    /* renamed from: d */
    public final void mo53098d() {
        mo53097c(new C47987c(this));
    }

    /* renamed from: e */
    public final boolean mo53099e() {
        return Looper.myLooper() == this.f124205a.mo53092a().getLooper();
    }
}
