package com.google.android.libraries.gsa.conversation.p1837a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.conversation.C22573f;
import com.google.android.libraries.gsa.conversation.p1852f.C22589p;
import com.google.android.libraries.gsa.conversation.p1852f.C22591r;
import com.google.android.libraries.gsa.conversation.p1852f.C22592s;
import com.google.android.libraries.gsa.conversation.p1852f.C22593t;
import com.google.common.util.concurrent.C60870cx;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.gsa.conversation.a.ad */
/* compiled from: PG */
public final class C22313ad extends C22334o {

    /* renamed from: a */
    private final Object f61620a = new Object();

    /* renamed from: b */
    private final C22591r f61621b;

    /* renamed from: c */
    private final C22593t f61622c;

    /* renamed from: d */
    private final C22589p f61623d;

    /* renamed from: e */
    private final C69464a f61624e;

    /* renamed from: f */
    private C22592s f61625f;

    /* renamed from: g */
    private final C22573f f61626g;

    public C22313ad(C22591r rVar, C22593t tVar, C22573f fVar, C22589p pVar, C69464a aVar) {
        this.f61621b = rVar;
        this.f61622c = tVar;
        this.f61626g = fVar;
        this.f61623d = pVar;
        this.f61624e = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C22333n mo27546a() {
        return C22333n.INPUT;
    }

    /* renamed from: b */
    public final C60870cx mo27547b() {
        C60870cx a;
        synchronized (this.f61620a) {
            if (this.f61625f == null) {
                C22592s a2 = this.f61622c.mo27696a((C60870cx) this.f61624e.mo17428b(), this.f61621b, this.f61623d);
                this.f61625f = a2;
                this.f61626g.mo27662a(a2);
                a = this.f61625f.mo27686a();
            } else {
                throw new IllegalStateException("Calling execute() multiple times is prohibited");
            }
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C60870cx mo27548c() {
        synchronized (this.f61620a) {
            C22592s sVar = this.f61625f;
            if (sVar == null) {
                return C118826c.f331423b;
            }
            this.f61626g.f62208b = true;
            C60870cx e = sVar.mo27695e();
            return e;
        }
    }
}
