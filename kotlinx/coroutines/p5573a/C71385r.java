package kotlinx.coroutines.p5573a;

import com.evernote.android.state.BuildConfig;
import java.util.ArrayList;
import kotlinx.coroutines.C71600ba;
import kotlinx.coroutines.C71601bb;
import kotlinx.coroutines.C71808r;
import kotlinx.coroutines.C71810t;
import kotlinx.coroutines.p5579e.C71693aa;
import kotlinx.coroutines.p5579e.C71696ad;
import kotlinx.coroutines.p5579e.C71708ap;
import kotlinx.coroutines.p5579e.C71738t;
import kotlinx.coroutines.p5579e.C71740v;
import kotlinx.coroutines.p5579e.C71741w;
import kotlinx.coroutines.p5583i.C71782h;
import kotlinx.coroutines.p5583i.C71783i;
import kotlinx.p5572a.C71342e;
import kotlinx.p5572a.C71343f;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5467a.C69555b;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69651ah;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.a.r */
/* compiled from: PG */
public abstract class C71385r implements C71367au {

    /* renamed from: a */
    protected final C69626l f190582a = null;

    /* renamed from: b */
    public final C71740v f190583b = new C71740v();

    /* renamed from: c */
    private final C71342e f190584c = new C71342e((Object) null, C71343f.f190534a);

    /* renamed from: I */
    public static final void m104109I(C71352af afVar) {
        Object obj = null;
        while (true) {
            C71696ad l = afVar.mo62943l();
            C71362ap apVar = l instanceof C71362ap ? (C71362ap) l : null;
            if (apVar == null) {
                break;
            } else if (!apVar.mo62944lV()) {
                apVar.mo62950q();
            } else {
                obj = C71738t.m104899a(obj, apVar);
            }
        }
        if (obj != null) {
            if (obj instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((C71362ap) arrayList.get(size)).mo62717d(afVar);
                }
            } else {
                ((C71362ap) obj).mo62717d(afVar);
            }
        }
        C69664n.m101061g(afVar, "closed");
    }

    /* renamed from: a */
    private static final void m104110a(C69577g gVar, C71352af afVar) {
        m104109I(afVar);
        gVar.mo61338mb(C69714l.m101133a(afVar.mo62701h()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final C71366at mo62745A() {
        C71696ad adVar;
        C71696ad m;
        C71740v vVar = this.f190583b;
        while (true) {
            Object j = vVar.mo62941j();
            C69664n.m101059e(j, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            adVar = (C71696ad) j;
            if (adVar != vVar && (adVar instanceof C71366at)) {
                if (((((C71366at) adVar) instanceof C71352af) && !adVar.mo62945lX()) || (m = adVar.mo62946m()) == null) {
                    break;
                }
                m.mo62951r();
            }
        }
        adVar = null;
        return (C71366at) adVar;
    }

    /* renamed from: B */
    public final C71782h mo62725B() {
        return new C71384q(this);
    }

    /* renamed from: C */
    public final void mo62726C(C69626l lVar) {
        if (!this.f190584c.mo62679d((Object) null, lVar)) {
            Object obj = this.f190584c.f190532a;
            if (obj == C71378k.f190573f) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            }
            new StringBuilder("Another handler was already registered: ").append(obj);
            throw new IllegalStateException("Another handler was already registered: ".concat(String.valueOf(obj)));
        }
        C71352af z = mo62750z();
        if (z != null && this.f190584c.mo62679d(lVar, C71378k.f190573f)) {
            lVar.mo5761a(z.f190545a);
        }
    }

    /* renamed from: D */
    public final boolean mo62727D(Throwable th) {
        boolean z;
        Object obj;
        C71708ap apVar;
        C71352af afVar = new C71352af(th);
        C71740v vVar = this.f190583b;
        while (true) {
            C71696ad l = vVar.mo62943l();
            if (!(l instanceof C71352af)) {
                if (l.mo62952s(afVar, vVar)) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            C71696ad l2 = this.f190583b.mo62943l();
            C69664n.m101059e(l2, "null cannot be cast to non-null type kotlinx.coroutines.channels.Closed<*>");
            afVar = (C71352af) l2;
        }
        m104109I(afVar);
        if (z && (obj = this.f190584c.f190532a) != null && obj != (apVar = C71378k.f190573f) && this.f190584c.mo62679d(obj, apVar)) {
            C69651ah.m101037b(obj, 1);
            ((C69626l) obj).mo5761a(th);
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public abstract boolean mo62705E();

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public abstract boolean mo62706F();

    /* renamed from: G */
    public final boolean mo62728G() {
        return mo62750z() != null;
    }

    /* renamed from: H */
    public final boolean mo62746H() {
        return !(C71741w.m104908a(this.f190583b.mo62941j()) instanceof C71364ar) && mo62706F();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C71364ar mo62741h() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public Object mo62747r(C71366at atVar) {
        int i;
        C71696ad l;
        if (mo62705E()) {
            C71740v vVar = this.f190583b;
            do {
                l = vVar.mo62943l();
                if (l instanceof C71364ar) {
                    return l;
                }
            } while (!l.mo62952s(atVar, vVar));
            return null;
        }
        C71740v vVar2 = this.f190583b;
        C71383p pVar = new C71383p(atVar, this);
        do {
            C71696ad l2 = vVar2.mo62943l();
            if (l2 instanceof C71364ar) {
                return l2;
            }
            i = l2.mo62940i(atVar, vVar2, pVar);
            if (i == 1) {
                return null;
            }
        } while (i != 2);
        return C71378k.f190572e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public Object mo62713s(Object obj) {
        C71364ar h;
        do {
            h = mo62741h();
            if (h == null) {
                return C71378k.f190570c;
            }
        } while (h.mo62696b(obj, (C71693aa) null) == null);
        boolean z = C71600ba.f191036a;
        h.mo62697c(obj);
        return h.mo62699f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public Object mo62714t(Object obj, C71783i iVar) {
        C71382o y = mo62749y(obj);
        Object t = iVar.mo63017t(y);
        if (t != null) {
            return t;
        }
        C71696ad h = y.mo62934h();
        C69664n.m101058d(h);
        C71364ar arVar = (C71364ar) h;
        arVar.mo62697c(obj);
        return arVar.mo62699f();
    }

    public final String toString() {
        String str;
        String str2;
        String a = C71601bb.m104526a(this);
        String b = C71601bb.m104527b(this);
        C71696ad a2 = C71741w.m104908a(this.f190583b.mo62941j());
        if (a2 == this.f190583b) {
            str = "EmptyQueue";
        } else {
            if (a2 instanceof C71352af) {
                str2 = a2.toString();
            } else if (a2 instanceof C71362ap) {
                str2 = "ReceiveQueued";
            } else if (a2 instanceof C71366at) {
                str2 = "SendQueued";
            } else {
                new StringBuilder("UNEXPECTED:").append(a2);
                str2 = "UNEXPECTED:".concat(String.valueOf(a2));
            }
            C71696ad l = this.f190583b.mo62943l();
            if (l != a2) {
                C71740v vVar = this.f190583b;
                Object j = vVar.mo62941j();
                C69664n.m101059e(j, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                int i = 0;
                for (C71696ad adVar = (C71696ad) j; !C69664n.m101066l(adVar, vVar); adVar = C71741w.m104908a(adVar.mo62941j())) {
                    if (adVar instanceof C71696ad) {
                        i++;
                    }
                }
                str = str2 + ",queueSize=" + i;
                if (l instanceof C71352af) {
                    str = str + ",closedForSend=" + l;
                }
            } else {
                str = str2;
            }
        }
        return a + "@" + b + "{" + str + "}" + mo62715x();
    }

    /* renamed from: v */
    public final Object mo62729v(Object obj, C69577g gVar) {
        if (mo62713s(obj) == C71378k.f190569b) {
            return C69788q.f186170a;
        }
        C71808r a = C71810t.m105091a(C69555b.m100961b(gVar));
        while (true) {
            if (mo62746H()) {
                C71368av avVar = new C71368av(obj, a);
                Object r = mo62747r(avVar);
                if (r == null) {
                    C71810t.m105093c(a, avVar);
                    break;
                } else if (r instanceof C71352af) {
                    m104110a(a, (C71352af) r);
                    break;
                } else if (r != C71378k.f190572e && !(r instanceof C71362ap)) {
                    new StringBuilder("enqueueSend returned ").append(r);
                    throw new IllegalStateException("enqueueSend returned ".concat(r.toString()));
                }
            }
            Object s = mo62713s(obj);
            if (s == C71378k.f190569b) {
                a.mo61338mb(C69788q.f186170a);
                break;
            } else if (s != C71378k.f190570c) {
                if (s instanceof C71352af) {
                    m104110a(a, (C71352af) s);
                } else {
                    new StringBuilder("offerInternal returned ").append(s);
                    throw new IllegalStateException("offerInternal returned ".concat(String.valueOf(s)));
                }
            }
        }
        Object n = a.mo63043n();
        if (n == C69554a.COROUTINE_SUSPENDED) {
            C69664n.m101061g(gVar, "frame");
        }
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (n != aVar) {
            n = C69788q.f186170a;
        }
        return n == aVar ? n : C69788q.f186170a;
    }

    /* renamed from: w */
    public final Object mo62730w(Object obj) {
        C71393z zVar;
        Object s = mo62713s(obj);
        if (s == C71378k.f190569b) {
            return C69788q.f186170a;
        }
        if (s == C71378k.f190570c) {
            C71352af z = mo62750z();
            if (z == null) {
                return C71348ab.f190539a;
            }
            m104109I(z);
            zVar = new C71393z(z.mo62701h());
        } else if (s instanceof C71352af) {
            C71352af afVar = (C71352af) s;
            m104109I(afVar);
            zVar = new C71393z(afVar.mo62701h());
        } else {
            new StringBuilder("trySend returned ").append(s);
            throw new IllegalStateException("trySend returned ".concat(String.valueOf(s)));
        }
        return zVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public String mo62715x() {
        return BuildConfig.FLAVOR;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final C71382o mo62749y(Object obj) {
        return new C71382o(obj, this.f190583b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final C71352af mo62750z() {
        C71696ad l = this.f190583b.mo62943l();
        C71352af afVar = l instanceof C71352af ? (C71352af) l : null;
        if (afVar == null) {
            return null;
        }
        m104109I(afVar);
        return afVar;
    }
}
