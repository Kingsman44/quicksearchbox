package kotlinx.coroutines.p5573a;

import java.util.ArrayList;
import kotlinx.coroutines.p5579e.C71696ad;
import kotlinx.coroutines.p5579e.C71708ap;
import kotlinx.coroutines.p5579e.C71721c;
import kotlinx.coroutines.p5579e.C71740v;
import kotlinx.coroutines.p5579e.C71741w;
import kotlinx.coroutines.p5583i.C71783i;
import kotlinx.coroutines.p5583i.C71784j;

/* renamed from: kotlinx.coroutines.a.aj */
/* compiled from: PG */
public final class C71356aj extends C71377j {
    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final boolean mo62705E() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final boolean mo62706F() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo62716k(Object obj, C71352af afVar) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            C71366at atVar = (C71366at) obj;
            if (!(atVar instanceof C71379l)) {
                atVar.mo62698d(afVar);
                return;
            }
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                C71366at atVar2 = (C71366at) arrayList.get(size);
                if (!(atVar2 instanceof C71379l)) {
                    atVar2.mo62698d(afVar);
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo62711n() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final boolean mo62712o() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final Object mo62713s(Object obj) {
        C71364ar arVar;
        do {
            Object s = super.mo62713s(obj);
            C71708ap apVar = C71378k.f190569b;
            if (s == apVar) {
                return apVar;
            }
            if (s == C71378k.f190570c) {
                C71740v vVar = this.f190583b;
                C71379l lVar = new C71379l(obj);
                while (true) {
                    C71696ad l = vVar.mo62943l();
                    if (!(l instanceof C71364ar)) {
                        if (l.mo62952s(lVar, vVar)) {
                            arVar = null;
                            break;
                        }
                    } else {
                        arVar = (C71364ar) l;
                        break;
                    }
                }
                if (arVar == null) {
                    return C71378k.f190569b;
                }
            } else if (s instanceof C71352af) {
                return s;
            } else {
                new StringBuilder("Invalid offerInternal result ").append(s);
                throw new IllegalStateException("Invalid offerInternal result ".concat(String.valueOf(s)));
            }
        } while (!(arVar instanceof C71352af));
        return arVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final Object mo62714t(Object obj, C71783i iVar) {
        Object obj2;
        while (true) {
            if (C71741w.m104908a(this.f190583b.mo62941j()) instanceof C71364ar) {
                obj2 = super.mo62714t(obj, iVar);
            } else {
                obj2 = iVar.mo63017t(new C71380m(this.f190583b, obj));
                if (obj2 == null) {
                    obj2 = C71378k.f190569b;
                }
            }
            if (obj2 == C71784j.f191303b) {
                return C71784j.f191303b;
            }
            C71708ap apVar = C71378k.f190569b;
            if (obj2 == apVar) {
                return apVar;
            }
            if (obj2 != C71378k.f190570c && obj2 != C71721c.f191196b) {
                if (obj2 instanceof C71352af) {
                    return obj2;
                }
                new StringBuilder("Invalid result ").append(obj2);
                throw new IllegalStateException("Invalid result ".concat(String.valueOf(obj2)));
            }
        }
    }
}
