package com.google.android.apps.gsa.nga.engine.p6243v;

import android.os.Trace;
import com.google.android.apps.gsa.nga.engine.p6029g.C76088d;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.engine.v.o */
/* compiled from: PG */
public abstract class C79365o implements C76088d {

    /* renamed from: Zj */
    private final Object f217906Zj = new Object();

    /* renamed from: b */
    private final C79359i f217907b;

    /* renamed from: c */
    private final C58528ij f217908c;

    /* renamed from: d */
    private C60870cx f217909d = null;

    /* renamed from: e */
    private boolean f217910e = false;

    /* renamed from: f */
    private boolean f217911f = false;

    protected C79365o(C79359i iVar, C58528ij ijVar) {
        this.f217907b = iVar;
        this.f217908c = ijVar;
    }

    /* renamed from: Q */
    public /* synthetic */ void mo71863Q() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public abstract C60870cx mo73915S();

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public abstract boolean mo73916T();

    /* renamed from: V */
    public final C60870cx mo73918V(C60870cx cxVar) {
        synchronized (this.f217906Zj) {
            if (this.f217910e) {
                mo71204l();
                C60870cx W = mo73919W();
                return W;
            }
            this.f217911f = false;
            mo71204l();
            return cxVar;
        }
    }

    /* renamed from: W */
    public final C60870cx mo73919W() {
        C60870cx h;
        synchronized (this.f217906Zj) {
            this.f217910e = false;
            Trace.beginAsyncSection(mo73921Y(), 0);
            h = C60922j.m93045h(C60846c.m92879h(C60838bs.m92859i(mo73915S()), Throwable.class, new C79363m(this), C60826bg.f164896a), new C79364n(this), C60826bg.f164896a);
        }
        return h;
    }

    /* renamed from: X */
    public final C60870cx mo73920X() {
        C60870cx cxVar;
        mo71204l();
        synchronized (this.f217906Zj) {
            if (!this.f217911f && !mo73916T()) {
                mo71204l();
                cxVar = C118826c.f331423b;
            } else if (!this.f217911f || (cxVar = this.f217909d) == null) {
                this.f217911f = true;
                cxVar = this.f217907b.mo73910b(this, new C79361k(this));
                this.f217909d = cxVar;
            } else {
                this.f217910e = true;
            }
        }
        return cxVar;
    }

    /* renamed from: Y */
    public final String mo73921Y() {
        return String.valueOf(mo71204l()).concat("#lifecycle");
    }

    /* renamed from: gE */
    public void mo72033gE(C58528ij ijVar) {
        Stream stream = Collection.EL.stream(this.f217908c);
        Objects.requireNonNull(ijVar);
        if (stream.anyMatch(new C79362l(ijVar))) {
            mo73920X();
        }
    }
}
