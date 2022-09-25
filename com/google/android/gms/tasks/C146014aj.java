package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.C143919bh;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.aj */
/* compiled from: PG */
public final class C146014aj extends C146006ab {

    /* renamed from: a */
    public final Object f394702a = new Object();

    /* renamed from: b */
    public volatile boolean f394703b;

    /* renamed from: c */
    public Object f394704c;

    /* renamed from: d */
    public Exception f394705d;

    /* renamed from: e */
    private final C146008ad f394706e = new C146008ad();

    /* renamed from: f */
    private boolean f394707f;

    /* renamed from: A */
    private final void m237812A() {
        synchronized (this.f394702a) {
            if (this.f394707f) {
                this.f394706e.mo122502b(this);
            }
        }
    }

    /* renamed from: z */
    private final void m237813z() {
        Throwable th;
        if (this.f394707f) {
            if (mo122490i()) {
                Exception f = mo122487f();
                th = new C146030j("Complete with: ".concat(f == null ? !mo122491j() ? this.f394703b ? "cancellation" : "unknown issue" : "result ".concat(String.valueOf(String.valueOf(mo122488g()))) : "failure"), f);
            } else {
                th = new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final C146006ab mo122482a(Executor executor, C146025e eVar) {
        C146014aj ajVar = new C146014aj();
        this.f394706e.mo122501a(new C146027g(executor, eVar, ajVar));
        m237812A();
        return ajVar;
    }

    /* renamed from: b */
    public final C146006ab mo122483b(C146025e eVar) {
        return mo122484c(C146013ai.f394700a, eVar);
    }

    /* renamed from: c */
    public final C146006ab mo122484c(Executor executor, C146025e eVar) {
        C146014aj ajVar = new C146014aj();
        this.f394706e.mo122501a(new C146029i(executor, eVar, ajVar));
        m237812A();
        return ajVar;
    }

    /* renamed from: d */
    public final C146006ab mo122485d(C146005aa aaVar) {
        return mo122486e(C146013ai.f394700a, aaVar);
    }

    /* renamed from: e */
    public final C146006ab mo122486e(Executor executor, C146005aa aaVar) {
        C146014aj ajVar = new C146014aj();
        this.f394706e.mo122501a(new C146044x(executor, aaVar, ajVar));
        m237812A();
        return ajVar;
    }

    /* renamed from: f */
    public final Exception mo122487f() {
        Exception exc;
        synchronized (this.f394702a) {
            exc = this.f394705d;
        }
        return exc;
    }

    /* renamed from: g */
    public final Object mo122488g() {
        Object obj;
        synchronized (this.f394702a) {
            mo122505s();
            mo122506t();
            Exception exc = this.f394705d;
            if (exc == null) {
                obj = this.f394704c;
            } else {
                throw new C146046z(exc);
            }
        }
        return obj;
    }

    /* renamed from: h */
    public final boolean mo122489h() {
        return this.f394703b;
    }

    /* renamed from: i */
    public final boolean mo122490i() {
        boolean z;
        synchronized (this.f394702a) {
            z = this.f394707f;
        }
        return z;
    }

    /* renamed from: j */
    public final boolean mo122491j() {
        boolean z;
        synchronized (this.f394702a) {
            z = false;
            if (this.f394707f && !this.f394703b && this.f394705d == null) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: k */
    public final void mo122492k(Executor executor, C146033m mVar) {
        this.f394706e.mo122501a(new C146032l(executor, mVar));
        m237812A();
    }

    /* renamed from: l */
    public final void mo122493l(Executor executor, C146036p pVar) {
        this.f394706e.mo122501a(new C146035o(executor, pVar));
        m237812A();
    }

    /* renamed from: m */
    public final void mo122494m(Executor executor, C146039s sVar) {
        this.f394706e.mo122501a(new C146038r(executor, sVar));
        m237812A();
    }

    /* renamed from: n */
    public final void mo122495n(Executor executor, C146042v vVar) {
        this.f394706e.mo122501a(new C146041u(executor, vVar));
        m237812A();
    }

    /* renamed from: o */
    public final void mo122496o(C146033m mVar) {
        mo122492k(C146013ai.f394700a, mVar);
    }

    /* renamed from: p */
    public final void mo122497p(C146036p pVar) {
        mo122493l(C146013ai.f394700a, pVar);
    }

    /* renamed from: q */
    public final void mo122498q(C146039s sVar) {
        mo122494m(C146013ai.f394700a, sVar);
    }

    /* renamed from: r */
    public final void mo122499r(C146042v vVar) {
        mo122495n(C146013ai.f394700a, vVar);
    }

    /* renamed from: s */
    public final void mo122505s() {
        C143919bh.m233967j(this.f394707f, "Task is not yet complete");
    }

    /* renamed from: t */
    public final void mo122506t() {
        if (this.f394703b) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* renamed from: u */
    public final void mo122507u(Exception exc) {
        C143919bh.m233971n(exc, "Exception must not be null");
        synchronized (this.f394702a) {
            m237813z();
            this.f394707f = true;
            this.f394705d = exc;
        }
        this.f394706e.mo122502b(this);
    }

    /* renamed from: v */
    public final void mo122508v(Object obj) {
        synchronized (this.f394702a) {
            m237813z();
            this.f394707f = true;
            this.f394704c = obj;
        }
        this.f394706e.mo122502b(this);
    }

    /* renamed from: w */
    public final boolean mo122509w(Exception exc) {
        C143919bh.m233971n(exc, "Exception must not be null");
        synchronized (this.f394702a) {
            if (this.f394707f) {
                return false;
            }
            this.f394707f = true;
            this.f394705d = exc;
            this.f394706e.mo122502b(this);
            return true;
        }
    }

    /* renamed from: x */
    public final boolean mo122510x(Object obj) {
        synchronized (this.f394702a) {
            if (this.f394707f) {
                return false;
            }
            this.f394707f = true;
            this.f394704c = obj;
            this.f394706e.mo122502b(this);
            return true;
        }
    }

    /* renamed from: y */
    public final void mo122511y() {
        synchronized (this.f394702a) {
            if (!this.f394707f) {
                this.f394707f = true;
                this.f394703b = true;
                this.f394706e.mo122502b(this);
            }
        }
    }
}
