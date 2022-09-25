package kotlinx.coroutines.p5573a;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71345a;
import kotlinx.coroutines.C71644cq;
import kotlinx.coroutines.p5583i.C71781g;
import kotlinx.coroutines.p5583i.C71782h;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.a.w */
/* compiled from: PG */
public class C71390w extends C71345a implements C71389v {

    /* renamed from: b */
    public final C71389v f190597b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71390w(C69585o oVar, C71389v vVar) {
        super(oVar, true, true);
        C69664n.m101061g(oVar, "parentContext");
        this.f190597b = vVar;
    }

    /* renamed from: B */
    public final C71782h mo62725B() {
        throw null;
    }

    /* renamed from: C */
    public final void mo62726C(C69626l lVar) {
        throw null;
    }

    /* renamed from: D */
    public final boolean mo62727D(Throwable th) {
        return this.f190597b.mo62727D(th);
    }

    /* renamed from: G */
    public final boolean mo62728G() {
        throw null;
    }

    /* renamed from: I */
    public final void mo62751I(Throwable th) {
        CancellationException mi = mo62914mi(th, (String) null);
        this.f190597b.mo62723u(mi);
        mo62907M(mi);
    }

    /* renamed from: c */
    public final Object mo62718c(C69577g gVar) {
        return this.f190597b.mo62718c(gVar);
    }

    /* renamed from: d */
    public final Object mo62719d(C69577g gVar) {
        Object d = this.f190597b.mo62719d(gVar);
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        return d;
    }

    /* renamed from: e */
    public final Object mo62720e() {
        throw null;
    }

    /* renamed from: g */
    public final C71391x mo62721g() {
        return this.f190597b.mo62721g();
    }

    /* renamed from: i */
    public final C71781g mo62722i() {
        throw null;
    }

    /* renamed from: u */
    public final void mo62723u(CancellationException cancellationException) {
        if (!mo62868mk()) {
            if (cancellationException == null) {
                cancellationException = new C71644cq(mo62686mc(), (Throwable) null, this);
            }
            mo62751I(cancellationException);
        }
    }

    /* renamed from: v */
    public final Object mo62729v(Object obj, C69577g gVar) {
        return this.f190597b.mo62729v(obj, gVar);
    }

    /* renamed from: w */
    public final Object mo62730w(Object obj) {
        return this.f190597b.mo62730w(obj);
    }
}
