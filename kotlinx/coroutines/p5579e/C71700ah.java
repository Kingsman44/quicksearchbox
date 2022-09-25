package kotlinx.coroutines.p5579e;

import kotlinx.coroutines.C71600ba;
import kotlinx.p5572a.C71338a;
import kotlinx.p5572a.C71341d;
import kotlinx.p5572a.C71342e;
import kotlinx.p5572a.C71343f;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.e.ah */
/* compiled from: PG */
public final class C71700ah {

    /* renamed from: a */
    public static final C71708ap f191164a = new C71708ap("REMOVE_FROZEN");

    /* renamed from: b */
    public final C71341d f191165b = new C71341d(0, C71343f.f190534a);

    /* renamed from: c */
    private final int f191166c;

    /* renamed from: d */
    private final boolean f191167d;

    /* renamed from: e */
    private final int f191168e;

    /* renamed from: f */
    private final C71342e f191169f = new C71342e((Object) null, C71343f.f190534a);

    /* renamed from: g */
    private final C71338a f191170g;

    public C71700ah(int i, boolean z) {
        this.f191166c = i;
        this.f191167d = z;
        int i2 = i - 1;
        this.f191168e = i2;
        this.f191170g = new C71338a(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        } else if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* renamed from: a */
    public final int mo62957a(Object obj) {
        C69664n.m101061g(obj, "element");
        C71341d dVar = this.f191165b;
        while (true) {
            long j = dVar.f190530c;
            if ((3458764513820540928L & j) != 0) {
                return (j & 2305843009213693952L) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f191168e;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            if (this.f191167d || this.f191170g.f190521a[i2 & i3].f190532a == null) {
                if (this.f191165b.mo62674a(j, (((long) ((i2 + 1) & 1073741823)) << 30) | (-1152921503533105153L & j))) {
                    this.f191170g.f190521a[i2 & i3].mo62678c(obj);
                    C71700ah ahVar = this;
                    while ((ahVar.f191165b.f190530c & 1152921504606846976L) != 0) {
                        ahVar = ahVar.mo62960d(ahVar.mo62958b());
                        Object obj2 = ahVar.f191170g.f190521a[ahVar.f191168e & i2].f190532a;
                        if (!(obj2 instanceof C71699ag) || ((C71699ag) obj2).f191163a != i2) {
                            ahVar = null;
                            continue;
                        } else {
                            ahVar.f191170g.f190521a[ahVar.f191168e & i2].mo62678c(obj);
                            continue;
                        }
                        if (ahVar == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i4 = this.f191166c;
                if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                    return 1;
                }
            }
        }
        return 1;
    }

    /* renamed from: b */
    public final long mo62958b() {
        long j;
        long j2;
        C71341d dVar = this.f191165b;
        do {
            j = dVar.f190530c;
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = 1152921504606846976L | j;
        } while (!dVar.mo62674a(j, j2));
        return j2;
    }

    /* renamed from: c */
    public final Object mo62959c() {
        C71341d dVar = this.f191165b;
        while (true) {
            long j = dVar.f190530c;
            long j2 = 1152921504606846976L;
            if ((j & 1152921504606846976L) != 0) {
                return f191164a;
            }
            int i = (int) (j & 1073741823);
            int i2 = this.f191168e;
            int i3 = i & i2;
            if ((i2 & ((int) ((1152921503533105152L & j) >> 30))) == i3) {
                return null;
            }
            Object obj = this.f191170g.f190521a[i3].f190532a;
            if (obj == null) {
                if (this.f191167d) {
                    return null;
                }
            } else if (obj instanceof C71699ag) {
                return null;
            } else {
                long j3 = (long) ((i + 1) & 1073741823);
                if (this.f191165b.mo62674a(j, (j & -1073741824) | j3)) {
                    this.f191170g.f190521a[this.f191168e & i].mo62678c((Object) null);
                    return obj;
                } else if (this.f191167d) {
                    C71700ah ahVar = this;
                    while (true) {
                        C71341d dVar2 = ahVar.f191165b;
                        while (true) {
                            long j4 = dVar2.f190530c;
                            int i4 = (int) (j4 & 1073741823);
                            boolean z = C71600ba.f191036a;
                            if ((j4 & j2) != 0) {
                                ahVar = ahVar.mo62960d(ahVar.mo62958b());
                                break;
                            } else if (ahVar.f191165b.mo62674a(j4, (j4 & -1073741824) | j3)) {
                                ahVar.f191170g.f190521a[i4 & ahVar.f191168e].mo62678c((Object) null);
                                ahVar = null;
                                break;
                            } else {
                                j2 = 1152921504606846976L;
                            }
                        }
                        if (ahVar == null) {
                            return obj;
                        }
                        j2 = 1152921504606846976L;
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final C71700ah mo62960d(long j) {
        C71342e eVar = this.f191169f;
        while (true) {
            C71700ah ahVar = (C71700ah) eVar.f190532a;
            if (ahVar != null) {
                return ahVar;
            }
            C71342e eVar2 = this.f191169f;
            int i = this.f191166c;
            C71700ah ahVar2 = new C71700ah(i + i, this.f191167d);
            int i2 = (int) (1073741823 & j);
            int i3 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i4 = this.f191168e;
                int i5 = i2 & i4;
                if (i5 == (i4 & i3)) {
                    break;
                }
                Object obj = this.f191170g.f190521a[i5].f190532a;
                if (obj == null) {
                    obj = new C71699ag(i2);
                }
                ahVar2.f191170g.f190521a[ahVar2.f191168e & i2].mo62678c(obj);
                i2++;
            }
            ahVar2.f191165b.f190530c = -1152921504606846977L & j;
            eVar2.mo62679d((Object) null, ahVar2);
        }
    }

    /* renamed from: e */
    public final boolean mo62961e() {
        long j;
        C71341d dVar = this.f191165b;
        do {
            j = dVar.f190530c;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!dVar.mo62674a(j, 2305843009213693952L | j));
        return true;
    }

    /* renamed from: f */
    public final boolean mo62962f() {
        long j = this.f191165b.f190530c;
        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
    }
}
