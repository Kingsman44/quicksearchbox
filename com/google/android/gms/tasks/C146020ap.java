package com.google.android.gms.tasks;

import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.tasks.ap */
/* compiled from: PG */
public final class C146020ap implements C146019ao {

    /* renamed from: a */
    private final Object f394715a = new Object();

    /* renamed from: b */
    private final int f394716b;

    /* renamed from: c */
    private final C146014aj f394717c;

    /* renamed from: d */
    private int f394718d;

    /* renamed from: e */
    private int f394719e;

    /* renamed from: f */
    private int f394720f;

    /* renamed from: g */
    private Exception f394721g;

    /* renamed from: h */
    private boolean f394722h;

    public C146020ap(int i, C146014aj ajVar) {
        this.f394716b = i;
        this.f394717c = ajVar;
    }

    /* renamed from: b */
    private final void m237843b() {
        if (this.f394718d + this.f394719e + this.f394720f != this.f394716b) {
            return;
        }
        if (this.f394721g != null) {
            C146014aj ajVar = this.f394717c;
            int i = this.f394719e;
            int i2 = this.f394716b;
            ajVar.mo122507u(new ExecutionException(i + " out of " + i2 + " underlying tasks failed", this.f394721g));
        } else if (this.f394722h) {
            this.f394717c.mo122511y();
        } else {
            this.f394717c.mo122508v((Object) null);
        }
    }

    /* renamed from: a */
    public final void mo119879a() {
        synchronized (this.f394715a) {
            this.f394720f++;
            this.f394722h = true;
            m237843b();
        }
    }

    /* renamed from: d */
    public final void mo18633d(Exception exc) {
        synchronized (this.f394715a) {
            this.f394719e++;
            this.f394721g = exc;
            m237843b();
        }
    }

    /* renamed from: e */
    public final void mo18632e(Object obj) {
        synchronized (this.f394715a) {
            this.f394718d++;
            m237843b();
        }
    }
}
