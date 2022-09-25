package kotlinx.coroutines.p5573a;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71600ba;
import kotlinx.coroutines.C71601bb;
import kotlinx.coroutines.C71807q;
import kotlinx.coroutines.C71808r;
import kotlinx.coroutines.C71810t;
import kotlinx.coroutines.p5579e.C71693aa;
import kotlinx.coroutines.p5579e.C71696ad;
import kotlinx.coroutines.p5579e.C71738t;
import kotlinx.coroutines.p5579e.C71740v;
import kotlinx.coroutines.p5579e.C71741w;
import kotlinx.coroutines.p5583i.C71781g;
import kotlinx.coroutines.p5583i.C71783i;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5467a.C69555b;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.a.j */
/* compiled from: PG */
public abstract class C71377j extends C71385r implements C71389v {
    /* renamed from: J */
    private final Object m104075J(int i, C69577g gVar) {
        C71808r a = C71810t.m105091a(C69555b.m100961b(gVar));
        C71369b bVar = new C71369b(a, i);
        while (true) {
            if (!mo62742l(bVar)) {
                Object a2 = mo62707a();
                if (!(a2 instanceof C71352af)) {
                    if (a2 != C71378k.f190571d) {
                        a.mo63036i(bVar.mo62731a(a2), (C69626l) null);
                        break;
                    }
                } else {
                    bVar.mo62717d((C71352af) a2);
                    break;
                }
            } else {
                m104076q(a, bVar);
                break;
            }
        }
        Object n = a.mo63043n();
        if (n == C69554a.COROUTINE_SUSPENDED) {
            C69664n.m101061g(gVar, "frame");
        }
        return n;
    }

    /* renamed from: q */
    public static final void m104076q(C71807q qVar, C71362ap apVar) {
        qVar.mo63035f(new C71372e(apVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo62707a() {
        while (true) {
            C71366at A = mo62745A();
            if (A == null) {
                return C71378k.f190571d;
            }
            if (A.mo62702mm((C71693aa) null) != null) {
                boolean z = C71600ba.f191036a;
                A.mo62703mn();
                return A.mo62695a();
            }
            A.mo62724e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo62708b(C71783i iVar) {
        C71373f f = mo62740f();
        Object t = iVar.mo63017t(f);
        if (t != null) {
            return t;
        }
        C71696ad h = f.mo62934h();
        C69664n.m101058d(h);
        ((C71366at) h).mo62703mn();
        C71696ad h2 = f.mo62934h();
        C69664n.m101058d(h2);
        return ((C71366at) h2).mo62695a();
    }

    /* renamed from: c */
    public final Object mo62718c(C69577g gVar) {
        Object a = mo62707a();
        if (a == C71378k.f190571d || (a instanceof C71352af)) {
            return m104075J(0, gVar);
        }
        return a;
    }

    /* renamed from: e */
    public final Object mo62720e() {
        Object a = mo62707a();
        if (a == C71378k.f190571d) {
            return C71348ab.f190539a;
        }
        return a instanceof C71352af ? new C71393z(((C71352af) a).f190545a) : a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C71373f mo62740f() {
        return new C71373f(this.f190583b);
    }

    /* renamed from: g */
    public final C71391x mo62721g() {
        return new C71346a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C71364ar mo62741h() {
        C71696ad adVar;
        C71696ad m;
        C71740v vVar = this.f190583b;
        while (true) {
            Object j = vVar.mo62941j();
            C69664n.m101059e(j, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            adVar = (C71696ad) j;
            if (adVar != vVar && (adVar instanceof C71364ar)) {
                if (((((C71364ar) adVar) instanceof C71352af) && !adVar.mo62945lX()) || (m = adVar.mo62946m()) == null) {
                    break;
                }
                m.mo62951r();
            }
        }
        adVar = null;
        C71364ar arVar = (C71364ar) adVar;
        if (arVar != null) {
            boolean z = arVar instanceof C71352af;
        }
        return arVar;
    }

    /* renamed from: i */
    public final C71781g mo62722i() {
        return new C71375h(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo62709j(boolean z) {
        C71352af z2 = mo62750z();
        if (z2 != null) {
            Object obj = null;
            while (true) {
                C71696ad l = z2.mo62943l();
                if (l instanceof C71740v) {
                    mo62716k(obj, z2);
                    return;
                }
                boolean z3 = C71600ba.f191036a;
                if (!l.mo62944lV()) {
                    l.mo62950q();
                } else {
                    C69664n.m101059e(l, "null cannot be cast to non-null type kotlinx.coroutines.channels.Send");
                    obj = C71738t.m104899a(obj, (C71366at) l);
                }
            }
        } else {
            throw new IllegalStateException("Cannot happen");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo62716k(Object obj, C71352af afVar) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            ((C71366at) obj).mo62698d(afVar);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C71366at) arrayList.get(size)).mo62698d(afVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: l */
    public final boolean mo62742l(C71362ap apVar) {
        return mo62710m(apVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract boolean mo62711n();

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract boolean mo62712o();

    /* renamed from: p */
    public boolean mo62743p() {
        C71696ad a = C71741w.m104908a(this.f190583b.mo62941j());
        C71352af afVar = null;
        C71352af afVar2 = a instanceof C71352af ? (C71352af) a : null;
        if (afVar2 != null) {
            C71385r.m104109I(afVar2);
            afVar = afVar2;
        }
        return afVar != null && mo62712o();
    }

    /* renamed from: u */
    public final void mo62723u(CancellationException cancellationException) {
        if (!mo62743p()) {
            if (cancellationException == null) {
                cancellationException = new CancellationException(String.valueOf(C71601bb.m104526a(this)).concat(" was cancelled"));
            }
            mo62709j(mo62727D(cancellationException));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo62719d(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.p5573a.C71376i
            if (r0 == 0) goto L_0x0013
            r0 = r5
            kotlinx.coroutines.a.i r0 = (kotlinx.coroutines.p5573a.C71376i) r0
            int r1 = r0.f190567c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f190567c = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.a.i r0 = new kotlinx.coroutines.a.i
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f190565a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f190567c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r5)
            goto L_0x0052
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x002f:
            p5462h.C69714l.m101134b(r5)
            java.lang.Object r5 = r4.mo62707a()
            kotlinx.coroutines.e.ap r2 = kotlinx.coroutines.p5573a.C71378k.f190571d
            if (r5 == r2) goto L_0x0049
            boolean r0 = r5 instanceof kotlinx.coroutines.p5573a.C71352af
            if (r0 == 0) goto L_0x0048
            kotlinx.coroutines.a.af r5 = (kotlinx.coroutines.p5573a.C71352af) r5
            java.lang.Throwable r5 = r5.f190545a
            kotlinx.coroutines.a.z r0 = new kotlinx.coroutines.a.z
            r0.<init>(r5)
            return r0
        L_0x0048:
            return r5
        L_0x0049:
            r0.f190567c = r3
            java.lang.Object r5 = r4.m104075J(r3, r0)
            if (r5 != r1) goto L_0x0052
            return r1
        L_0x0052:
            kotlinx.coroutines.a.ab r5 = (kotlinx.coroutines.p5573a.C71348ab) r5
            java.lang.Object r5 = r5.f190540b
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p5573a.C71377j.mo62719d(h.c.g):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public boolean mo62710m(C71362ap apVar) {
        int i;
        C71696ad l;
        if (mo62711n()) {
            C71740v vVar = this.f190583b;
            do {
                l = vVar.mo62943l();
                if (!(l instanceof C71366at)) {
                }
            } while (!l.mo62952s(apVar, vVar));
            return true;
        }
        C71740v vVar2 = this.f190583b;
        C71374g gVar = new C71374g(apVar, this);
        do {
            C71696ad l2 = vVar2.mo62943l();
            if (!(l2 instanceof C71366at)) {
                i = l2.mo62940i(apVar, vVar2, gVar);
                if (i == 1) {
                    return true;
                }
            }
        } while (i != 2);
        return false;
        return false;
    }
}
