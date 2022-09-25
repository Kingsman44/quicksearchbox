package androidx.p182p;

import androidx.p186q.p187a.C4057l;
import java.util.concurrent.atomic.AtomicBoolean;
import p5462h.C69613f;
import p5462h.C69747m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.p.ap */
/* compiled from: PG */
public abstract class C3933ap {

    /* renamed from: a */
    private final C3925ah f12586a;

    /* renamed from: b */
    private final AtomicBoolean f12587b = new AtomicBoolean(false);

    /* renamed from: c */
    private final C69613f f12588c = new C69747m(new C3932ao(this));

    public C3933ap(C3925ah ahVar) {
        this.f12586a = ahVar;
    }

    /* renamed from: a */
    private final C4057l m11280a() {
        return (C4057l) this.f12588c.mo5768a();
    }

    /* renamed from: d */
    public final C4057l mo8212d() {
        this.f12586a.mo8174R();
        if (this.f12587b.compareAndSet(false, true)) {
            return m11280a();
        }
        return mo8213e();
    }

    /* renamed from: e */
    public final C4057l mo8213e() {
        return this.f12586a.mo8168L(mo8214f());
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract String mo8214f();

    /* renamed from: g */
    public final void mo8215g(C4057l lVar) {
        C69664n.m101061g(lVar, "statement");
        if (lVar == m11280a()) {
            this.f12587b.set(false);
        }
    }
}
