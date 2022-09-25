package com.google.common.p4520a;

import com.google.common.base.C58815af;
import com.google.common.base.C58831av;
import com.google.common.base.C58889cz;
import com.google.common.p4522b.C58570jy;
import com.google.common.p4575r.C60757n;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60917ed;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.logging.Logger;
import p3186j$.util.concurrent.ConcurrentMap;
import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.common.a.bn */
/* compiled from: PG */
public final class C58234bn extends AbstractMap implements ConcurrentMap, p3186j$.util.concurrent.ConcurrentMap {

    /* renamed from: a */
    static final Logger f155731a = Logger.getLogger(C58234bn.class.getName());

    /* renamed from: b */
    static final C58219az f155732b = new C58260o();

    /* renamed from: c */
    static final Queue f155733c = new C58261p();

    /* renamed from: y */
    public static final /* synthetic */ int f155734y = 0;

    /* renamed from: d */
    final int f155735d;

    /* renamed from: e */
    final int f155736e;

    /* renamed from: f */
    final C58210aq[] f155737f;

    /* renamed from: g */
    final int f155738g;

    /* renamed from: h */
    final C58815af f155739h;

    /* renamed from: i */
    final C58815af f155740i;

    /* renamed from: j */
    final C58212as f155741j;

    /* renamed from: k */
    final C58212as f155742k;

    /* renamed from: l */
    final long f155743l;

    /* renamed from: m */
    final C58248ca f155744m;

    /* renamed from: n */
    final long f155745n;

    /* renamed from: o */
    final long f155746o;

    /* renamed from: p */
    final Queue f155747p;

    /* renamed from: q */
    final C58242bv f155748q;

    /* renamed from: r */
    final C58889cz f155749r;

    /* renamed from: s */
    final C58195ab f155750s;

    /* renamed from: t */
    final C58220b f155751t;

    /* renamed from: u */
    public final C58257l f155752u;

    /* renamed from: v */
    Set f155753v;

    /* renamed from: w */
    Collection f155754w;

    /* renamed from: x */
    Set f155755x;

    public C58234bn(C58254i iVar, C58257l lVar) {
        Queue queue;
        C58254i iVar2 = iVar;
        int i = iVar2.f155789f;
        this.f155738g = Math.min(i == -1 ? 4 : i, 65536);
        C58212as c = iVar.mo54819c();
        this.f155741j = c;
        this.f155742k = iVar.mo54820d();
        this.f155739h = (C58815af) C58831av.m90830c(iVar2.f155797n, iVar.mo54819c().mo54763a());
        this.f155740i = (C58815af) C58831av.m90830c(iVar2.f155798o, iVar.mo54820d().mo54763a());
        long j = 0;
        long j2 = (iVar2.f155795l == 0 || iVar2.f155796m == 0) ? 0 : iVar2.f155792i == null ? iVar2.f155790g : iVar2.f155791h;
        this.f155743l = j2;
        this.f155744m = (C58248ca) C58831av.m90830c(iVar2.f155792i, C58253h.f155781a);
        long j3 = iVar2.f155796m;
        this.f155745n = j3 == -1 ? 0 : j3;
        long j4 = iVar2.f155795l;
        this.f155746o = j4 != -1 ? j4 : j;
        C58242bv bvVar = (C58242bv) C58831av.m90830c(iVar2.f155799p, C58252g.f155779a);
        this.f155748q = bvVar;
        if (bvVar == C58252g.f155779a) {
            queue = f155733c;
        } else {
            queue = new ConcurrentLinkedQueue();
        }
        this.f155747p = queue;
        int i2 = 1;
        boolean z = mo54799r() || mo54796o();
        C58889cz czVar = iVar2.f155800q;
        this.f155749r = czVar == null ? z ? C58889cz.f156731b : C58254i.f155785c : czVar;
        this.f155750s = C58195ab.m88937b(c, mo54800s() || mo54796o(), mo54797p() || mo54799r());
        this.f155751t = (C58220b) iVar2.f155801r.mo6453a();
        this.f155752u = lVar;
        int i3 = iVar2.f155788e;
        int min = Math.min(i3 == -1 ? 16 : i3, 1073741824);
        if (mo54795n() && !mo54794m()) {
            min = (int) Math.min((long) min, j2);
        }
        int i4 = 1;
        int i5 = 0;
        while (i4 < this.f155738g && (!mo54795n() || ((long) (i4 * 20)) <= this.f155743l)) {
            i5++;
            i4 += i4;
        }
        this.f155736e = 32 - i5;
        this.f155735d = i4 - 1;
        this.f155737f = new C58210aq[i4];
        int i6 = min / i4;
        while (i2 < (i6 * i4 < min ? i6 + 1 : i6)) {
            i2 += i2;
        }
        if (mo54795n()) {
            long j5 = this.f155743l;
            long j6 = (long) i4;
            long j7 = (j5 / j6) + 1;
            long j8 = j5 % j6;
            int i7 = 0;
            while (true) {
                C58210aq[] aqVarArr = this.f155737f;
                if (i7 < aqVarArr.length) {
                    if (((long) i7) == j8) {
                        j7--;
                    }
                    aqVarArr[i7] = new C58210aq(this, i2, j7, (C58220b) iVar2.f155801r.mo6453a());
                    i7++;
                } else {
                    return;
                }
            }
        } else {
            int i8 = 0;
            while (true) {
                C58210aq[] aqVarArr2 = this.f155737f;
                if (i8 < aqVarArr2.length) {
                    aqVarArr2[i8] = new C58210aq(this, i2, -1, (C58220b) iVar2.f155801r.mo6453a());
                    i8++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    static C58241bu m89127d() {
        return C58208ao.f155661a;
    }

    /* renamed from: g */
    public static ArrayList m89128g(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        C58570jy.m90163o(arrayList, collection.iterator());
        return arrayList;
    }

    /* renamed from: h */
    static void m89129h(C58241bu buVar, C58241bu buVar2) {
        buVar.mo54728l(buVar2);
        buVar2.mo54730n(buVar);
    }

    /* renamed from: i */
    static void m89130i(C58241bu buVar, C58241bu buVar2) {
        buVar.mo54729m(buVar2);
        buVar2.mo54731o(buVar);
    }

    /* renamed from: j */
    static void m89131j(C58241bu buVar) {
        C58208ao aoVar = C58208ao.f155661a;
        buVar.mo54728l(aoVar);
        buVar.mo54730n(aoVar);
    }

    /* renamed from: k */
    static void m89132k(C58241bu buVar) {
        C58208ao aoVar = C58208ao.f155661a;
        buVar.mo54729m(aoVar);
        buVar.mo54731o(aoVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo54788a(Object obj) {
        int c = this.f155739h.mo56076c(obj);
        int i = c + ((c << 15) ^ -12931);
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        return i5 ^ (i5 >>> 16);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final long mo54789b() {
        long j = 0;
        for (C58210aq aqVar : this.f155737f) {
            j += (long) Math.max(0, aqVar.f155669b);
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C58210aq mo54790c(int i) {
        return this.f155737f[(i >>> this.f155736e) & this.f155735d];
    }

    public final void clear() {
        C58210aq[] aqVarArr = this.f155737f;
        int length = aqVarArr.length;
        for (int i = 0; i < length; i++) {
            C58210aq aqVar = aqVarArr[i];
            if (aqVar.f155669b != 0) {
                aqVar.lock();
                try {
                    aqVar.mo54757u(aqVar.f155668a.f155749r.mo26884a());
                    AtomicReferenceArray atomicReferenceArray = aqVar.f155673f;
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        for (C58241bu buVar = (C58241bu) atomicReferenceArray.get(i2); buVar != null; buVar = buVar.mo54721e()) {
                            if (buVar.mo54720d().mo54705f()) {
                                Object j = buVar.mo54726j();
                                Object obj = buVar.mo54720d().get();
                                int i3 = 3;
                                if (j != null) {
                                    if (obj != null) {
                                        i3 = 1;
                                    }
                                }
                                buVar.mo54717a();
                                aqVar.mo54762z(j, obj, buVar.mo54720d().mo54700a(), i3);
                            }
                        }
                    }
                    for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                        atomicReferenceArray.set(i4, (Object) null);
                    }
                    if (aqVar.f155668a.mo54801t()) {
                        do {
                        } while (aqVar.f155675h.poll() != null);
                    }
                    if (aqVar.f155668a.mo54802u()) {
                        while (aqVar.f155676i.poll() != null) {
                        }
                    }
                    aqVar.f155679l.clear();
                    aqVar.f155680m.clear();
                    aqVar.f155678k.set(0);
                    aqVar.f155671d++;
                    aqVar.f155669b = 0;
                } finally {
                    aqVar.unlock();
                    aqVar.mo54758v();
                }
            }
        }
    }

    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$compute(this, obj, biFunction);
    }

    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return ConcurrentMap.CC.$default$computeIfAbsent(this, obj, function);
    }

    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    public final boolean containsKey(Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        int a = mo54788a(obj);
        C58210aq c = mo54790c(a);
        try {
            if (c.f155669b != 0) {
                C58241bu c2 = c.mo54739c(obj, a, c.f155668a.f155749r.mo26884a());
                if (c2 != null) {
                    if (c2.mo54720d().get() != null) {
                        z = true;
                    }
                }
            }
            return z;
        } finally {
            c.mo54753q();
        }
    }

    public final boolean containsValue(Object obj) {
        Object obj2 = obj;
        if (obj2 == null) {
            return false;
        }
        long a = this.f155749r.mo26884a();
        C58210aq[] aqVarArr = this.f155737f;
        long j = -1;
        int i = 0;
        while (i < 3) {
            int length = aqVarArr.length;
            long j2 = 0;
            int i2 = 0;
            while (i2 < length) {
                C58210aq aqVar = aqVarArr[i2];
                int i3 = aqVar.f155669b;
                AtomicReferenceArray atomicReferenceArray = aqVar.f155673f;
                for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                    C58241bu buVar = (C58241bu) atomicReferenceArray.get(i4);
                    while (buVar != null) {
                        C58210aq[] aqVarArr2 = aqVarArr;
                        Object h = aqVar.mo54744h(buVar, a);
                        long j3 = a;
                        if (h != null && this.f155740i.mo56077d(obj2, h)) {
                            return true;
                        }
                        buVar = buVar.mo54721e();
                        aqVarArr = aqVarArr2;
                        a = j3;
                    }
                    long j4 = a;
                    C58210aq[] aqVarArr3 = aqVarArr;
                }
                C58210aq[] aqVarArr4 = aqVarArr;
                j2 += (long) aqVar.f155671d;
                i2++;
                a = a;
            }
            long j5 = a;
            C58210aq[] aqVarArr5 = aqVarArr;
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
            aqVarArr = aqVarArr5;
            a = j5;
        }
        return false;
    }

    public final Set entrySet() {
        Set set = this.f155755x;
        if (set != null) {
            return set;
        }
        C58197ad adVar = new C58197ad(this);
        this.f155755x = adVar;
        return adVar;
    }

    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        ConcurrentMap.CC.$default$forEach(this, biConsumer);
    }

    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        int a = mo54788a(obj);
        return mo54790c(a).mo54742f(obj, a);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public final boolean isEmpty() {
        C58210aq[] aqVarArr = this.f155737f;
        long j = 0;
        for (C58210aq aqVar : aqVarArr) {
            if (aqVar.f155669b != 0) {
                return false;
            }
            j += (long) aqVar.f155671d;
        }
        if (j == 0) {
            return true;
        }
        for (C58210aq aqVar2 : aqVarArr) {
            if (aqVar2.f155669b != 0) {
                return false;
            }
            j -= (long) aqVar2.f155671d;
        }
        if (j == 0) {
            return true;
        }
        return false;
    }

    public final Set keySet() {
        Set set = this.f155753v;
        if (set != null) {
            return set;
        }
        C58200ag agVar = new C58200ag(this);
        this.f155753v = agVar;
        return agVar;
    }

    /* renamed from: l */
    public final void mo54793l(Object obj) {
        C58203aj ajVar;
        int a = mo54788a(obj);
        C58210aq c = mo54790c(a);
        C58257l lVar = this.f155752u;
        c.lock();
        try {
            c.mo54757u(c.f155668a.f155749r.mo26884a());
            AtomicReferenceArray atomicReferenceArray = c.f155673f;
            int length = (atomicReferenceArray.length() - 1) & a;
            C58241bu buVar = (C58241bu) atomicReferenceArray.get(length);
            C58241bu buVar2 = buVar;
            while (true) {
                if (buVar2 == null) {
                    c.f155671d++;
                    C58203aj ajVar2 = new C58203aj(f155732b);
                    C58241bu d = c.mo54740d(obj, a, buVar);
                    d.mo54732p(ajVar2);
                    atomicReferenceArray.set(length, d);
                    c.unlock();
                    c.mo54758v();
                    ajVar = ajVar2;
                    break;
                }
                Object j = buVar2.mo54726j();
                if (buVar2.mo54717a() != a || j == null || !c.f155668a.f155739h.mo56077d(obj, j)) {
                    buVar2 = buVar2.mo54721e();
                } else {
                    C58219az d2 = buVar2.mo54720d();
                    if (!d2.mo54706g()) {
                        c.f155671d++;
                        ajVar = new C58203aj(d2);
                        buVar2.mo54732p(ajVar);
                    } else {
                        c.unlock();
                        c.mo54758v();
                        ajVar = null;
                    }
                }
            }
            if (ajVar != null) {
                C60870cx i = ajVar.mo54709i(obj, lVar);
                i.mo4106b(new C58209ap(c, obj, a, ajVar, i), C60826bg.f164896a);
                if (i.isDone()) {
                    try {
                        C60917ed.m93034a(i);
                    } catch (Throwable unused) {
                    }
                }
            }
        } finally {
            c.unlock();
            c.mo54758v();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo54794m() {
        return this.f155744m != C58253h.f155781a;
    }

    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$merge(this, obj, obj2, biFunction);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final boolean mo54795n() {
        return this.f155743l >= 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final boolean mo54796o() {
        return this.f155745n > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final boolean mo54797p() {
        return this.f155746o > 0;
    }

    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final boolean mo54799r() {
        return mo54797p();
    }

    /* JADX INFO: finally extract failed */
    public final Object remove(Object obj) {
        int i;
        if (obj == null) {
            return null;
        }
        int a = mo54788a(obj);
        C58210aq c = mo54790c(a);
        c.lock();
        try {
            c.mo54757u(c.f155668a.f155749r.mo26884a());
            int i2 = c.f155669b;
            AtomicReferenceArray atomicReferenceArray = c.f155673f;
            int length = a & (atomicReferenceArray.length() - 1);
            C58241bu buVar = (C58241bu) atomicReferenceArray.get(length);
            C58241bu buVar2 = buVar;
            while (true) {
                if (buVar2 == null) {
                    break;
                }
                Object j = buVar2.mo54726j();
                if (buVar2.mo54717a() != a || j == null || !c.f155668a.f155739h.mo56077d(obj, j)) {
                    buVar2 = buVar2.mo54721e();
                } else {
                    C58219az d = buVar2.mo54720d();
                    Object obj2 = d.get();
                    if (obj2 != null) {
                        i = 1;
                    } else if (d.mo54705f()) {
                        i = 3;
                    }
                    c.f155671d++;
                    atomicReferenceArray.set(length, c.mo54735A(buVar, buVar2, j, obj2, d, i));
                    c.f155669b--;
                    c.unlock();
                    c.mo54758v();
                    return obj2;
                }
            }
            c.unlock();
            c.mo54758v();
            return null;
        } catch (Throwable th) {
            c.unlock();
            c.mo54758v();
            throw th;
        }
    }

    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        ConcurrentMap.CC.$default$replaceAll(this, biFunction);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final boolean mo54800s() {
        return mo54796o() || mo54795n();
    }

    public final int size() {
        return C60757n.m92748i(mo54789b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final boolean mo54801t() {
        return this.f155741j != C58212as.STRONG;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final boolean mo54802u() {
        return this.f155742k != C58212as.STRONG;
    }

    public final Collection values() {
        Collection collection = this.f155754w;
        if (collection != null) {
            return collection;
        }
        C58221ba baVar = new C58221ba(this);
        this.f155754w = baVar;
        return baVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final boolean mo54798q(C58241bu buVar, long j) {
        buVar.getClass();
        if (mo54796o() && j - buVar.mo54718b() >= this.f155745n) {
            return true;
        }
        if (!mo54797p() || j - buVar.mo54719c() < this.f155746o) {
            return false;
        }
        return true;
    }

    public final Object put(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int a = mo54788a(obj);
        return mo54790c(a).mo54745i(obj, a, obj2, false);
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int a = mo54788a(obj);
        return mo54790c(a).mo54745i(obj, a, obj2, true);
    }

    /* renamed from: f */
    public final Object mo54792f(Object obj) {
        obj.getClass();
        int a = mo54788a(obj);
        Object f = mo54790c(a).mo54742f(obj, a);
        if (f == null) {
            this.f155751t.mo54685e();
        } else {
            this.f155751t.mo54684d();
        }
        return f;
    }

    public final boolean remove(Object obj, Object obj2) {
        int i;
        Object obj3;
        boolean z = false;
        if (obj == null || obj2 == null) {
            return false;
        }
        int a = mo54788a(obj);
        C58210aq c = mo54790c(a);
        c.lock();
        try {
            c.mo54757u(c.f155668a.f155749r.mo26884a());
            int i2 = c.f155669b;
            AtomicReferenceArray atomicReferenceArray = c.f155673f;
            int length = a & (atomicReferenceArray.length() - 1);
            C58241bu buVar = (C58241bu) atomicReferenceArray.get(length);
            C58241bu buVar2 = buVar;
            while (true) {
                if (buVar2 == null) {
                    break;
                }
                Object j = buVar2.mo54726j();
                if (buVar2.mo54717a() != a || j == null || !c.f155668a.f155739h.mo56077d(obj, j)) {
                    buVar2 = buVar2.mo54721e();
                } else {
                    C58219az d = buVar2.mo54720d();
                    Object obj4 = d.get();
                    if (c.f155668a.f155740i.mo56077d(obj2, obj4)) {
                        obj3 = obj4;
                        i = 1;
                    } else if (obj4 == null && d.mo54705f()) {
                        i = 3;
                        obj3 = null;
                    }
                    c.f155671d++;
                    atomicReferenceArray.set(length, c.mo54735A(buVar, buVar2, j, obj3, d, i));
                    c.f155669b--;
                    if (i == 1) {
                        z = true;
                    }
                }
            }
            return z;
        } finally {
            c.unlock();
            c.mo54758v();
        }
    }

    public final Object replace(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int a = mo54788a(obj);
        C58210aq c = mo54790c(a);
        c.lock();
        try {
            long a2 = c.f155668a.f155749r.mo26884a();
            c.mo54757u(a2);
            AtomicReferenceArray atomicReferenceArray = c.f155673f;
            int length = a & (atomicReferenceArray.length() - 1);
            C58241bu buVar = (C58241bu) atomicReferenceArray.get(length);
            C58241bu buVar2 = buVar;
            while (true) {
                if (buVar2 == null) {
                    break;
                }
                Object j = buVar2.mo54726j();
                if (buVar2.mo54717a() != a || j == null || !c.f155668a.f155739h.mo56077d(obj, j)) {
                    buVar2 = buVar2.mo54721e();
                } else {
                    C58219az d = buVar2.mo54720d();
                    Object obj3 = d.get();
                    if (obj3 != null) {
                        c.f155671d++;
                        c.mo54762z(obj, obj3, d.mo54700a(), 2);
                        c.mo54736B(buVar2, obj2, a2);
                        c.mo54750n(buVar2);
                        c.unlock();
                        c.mo54758v();
                        return obj3;
                    } else if (d.mo54705f()) {
                        int i = c.f155669b;
                        c.f155671d++;
                        atomicReferenceArray.set(length, c.mo54735A(buVar, buVar2, j, (Object) null, d, 3));
                        c.f155669b--;
                    }
                }
            }
            return null;
        } finally {
            c.unlock();
            c.mo54758v();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0049, code lost:
        r7 = r5.mo54720d();
        r1 = r7.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0052, code lost:
        if (r1 != null) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        if (r7.mo54705f() == false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
        r13 = r9.f155669b;
        r9.f155671d++;
        r10.set(r11, r9.mo54735A(r4, r5, r6, (java.lang.Object) null, r7, 3));
        r9.f155669b--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (r9.f155668a.f155740i.mo56077d(r14, r1) == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0080, code lost:
        r9.f155671d++;
        r9.mo54762z(r13, r1, r7.mo54700a(), 2);
        r9.mo54736B(r5, r15, r2);
        r9.mo54750n(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0093, code lost:
        r9.unlock();
        r9.mo54758v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r9.mo54754r(r5, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean replace(java.lang.Object r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            r12 = this;
            r13.getClass()
            r15.getClass()
            r0 = 0
            if (r14 != 0) goto L_0x000a
            return r0
        L_0x000a:
            int r1 = r12.mo54788a(r13)
            com.google.common.a.aq r9 = r12.mo54790c(r1)
            r9.lock()
            com.google.common.a.bn r2 = r9.f155668a     // Catch:{ all -> 0x00ab }
            com.google.common.base.cz r2 = r2.f155749r     // Catch:{ all -> 0x00ab }
            long r2 = r2.mo26884a()     // Catch:{ all -> 0x00ab }
            r9.mo54757u(r2)     // Catch:{ all -> 0x00ab }
            java.util.concurrent.atomic.AtomicReferenceArray r10 = r9.f155673f     // Catch:{ all -> 0x00ab }
            int r4 = r10.length()     // Catch:{ all -> 0x00ab }
            int r4 = r4 + -1
            r11 = r1 & r4
            java.lang.Object r4 = r10.get(r11)     // Catch:{ all -> 0x00ab }
            com.google.common.a.bu r4 = (com.google.common.p4520a.C58241bu) r4     // Catch:{ all -> 0x00ab }
            r5 = r4
        L_0x0031:
            if (r5 == 0) goto L_0x00a4
            java.lang.Object r6 = r5.mo54726j()     // Catch:{ all -> 0x00ab }
            int r7 = r5.mo54717a()     // Catch:{ all -> 0x00ab }
            if (r7 != r1) goto L_0x009f
            if (r6 == 0) goto L_0x009f
            com.google.common.a.bn r7 = r9.f155668a     // Catch:{ all -> 0x00ab }
            com.google.common.base.af r7 = r7.f155739h     // Catch:{ all -> 0x00ab }
            boolean r7 = r7.mo56077d(r13, r6)     // Catch:{ all -> 0x00ab }
            if (r7 == 0) goto L_0x009f
            com.google.common.a.az r7 = r5.mo54720d()     // Catch:{ all -> 0x00ab }
            java.lang.Object r1 = r7.get()     // Catch:{ all -> 0x00ab }
            r8 = 1
            if (r1 != 0) goto L_0x0076
            boolean r13 = r7.mo54705f()     // Catch:{ all -> 0x00ab }
            if (r13 == 0) goto L_0x00a4
            int r13 = r9.f155669b     // Catch:{ all -> 0x00ab }
            int r13 = r9.f155671d     // Catch:{ all -> 0x00ab }
            int r13 = r13 + r8
            r9.f155671d = r13     // Catch:{ all -> 0x00ab }
            r13 = 0
            r8 = 3
            r2 = r9
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r13
            com.google.common.a.bu r13 = r2.mo54735A(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00ab }
            int r14 = r9.f155669b     // Catch:{ all -> 0x00ab }
            int r14 = r14 + -1
            r10.set(r11, r13)     // Catch:{ all -> 0x00ab }
            r9.f155669b = r14     // Catch:{ all -> 0x00ab }
            goto L_0x00a4
        L_0x0076:
            com.google.common.a.bn r4 = r9.f155668a     // Catch:{ all -> 0x00ab }
            com.google.common.base.af r4 = r4.f155740i     // Catch:{ all -> 0x00ab }
            boolean r14 = r4.mo56077d(r14, r1)     // Catch:{ all -> 0x00ab }
            if (r14 == 0) goto L_0x009b
            int r14 = r9.f155671d     // Catch:{ all -> 0x00ab }
            int r14 = r14 + r8
            r9.f155671d = r14     // Catch:{ all -> 0x00ab }
            int r14 = r7.mo54700a()     // Catch:{ all -> 0x00ab }
            r0 = 2
            r9.mo54762z(r13, r1, r14, r0)     // Catch:{ all -> 0x00ab }
            r9.mo54736B(r5, r15, r2)     // Catch:{ all -> 0x00ab }
            r9.mo54750n(r5)     // Catch:{ all -> 0x00ab }
            r9.unlock()
            r9.mo54758v()
            r0 = 1
            goto L_0x00aa
        L_0x009b:
            r9.mo54754r(r5, r2)     // Catch:{ all -> 0x00ab }
            goto L_0x00a4
        L_0x009f:
            com.google.common.a.bu r5 = r5.mo54721e()     // Catch:{ all -> 0x00ab }
            goto L_0x0031
        L_0x00a4:
            r9.unlock()
            r9.mo54758v()
        L_0x00aa:
            return r0
        L_0x00ab:
            r13 = move-exception
            r9.unlock()
            r9.mo54758v()
            goto L_0x00b4
        L_0x00b3:
            throw r13
        L_0x00b4:
            goto L_0x00b3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4520a.C58234bn.replace(java.lang.Object, java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0081, code lost:
        r14 = r10.mo54720d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0089, code lost:
        if (r14.mo54706g() == false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008b, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008d, code lost:
        r15 = r14.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0091, code lost:
        if (r15 != null) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0093, code lost:
        r3.mo54762z(r13, (java.lang.Object) null, r14.mo54700a(), 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a2, code lost:
        if (r3.f155668a.mo54798q(r10, r4) == false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a4, code lost:
        r3.mo54762z(r13, r15, r14.mo54700a(), 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ac, code lost:
        r3.f155679l.remove(r10);
        r3.f155680m.remove(r10);
        r3.f155669b = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b9, code lost:
        r3.mo54754r(r10, r4);
        r3.f155681n.mo54684d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r3.unlock();
        r3.mo54758v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c7, code lost:
        r7 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d0, code lost:
        r11 = true;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo54791e(java.lang.Object r17, com.google.common.p4520a.C58257l r18) {
        /*
            r16 = this;
            r0 = r17
            r17.getClass()
            int r1 = r16.mo54788a(r17)
            r2 = r16
            com.google.common.a.aq r3 = r2.mo54790c(r1)
            r18.getClass()
            int r4 = r3.f155669b     // Catch:{ ExecutionException -> 0x0120 }
            if (r4 == 0) goto L_0x0046
            com.google.common.a.bu r4 = r3.mo54738b(r0, r1)     // Catch:{ ExecutionException -> 0x0120 }
            if (r4 == 0) goto L_0x0046
            com.google.common.a.bn r5 = r3.f155668a     // Catch:{ ExecutionException -> 0x0120 }
            com.google.common.base.cz r5 = r5.f155749r     // Catch:{ ExecutionException -> 0x0120 }
            long r5 = r5.mo26884a()     // Catch:{ ExecutionException -> 0x0120 }
            java.lang.Object r7 = r3.mo54744h(r4, r5)     // Catch:{ ExecutionException -> 0x0120 }
            if (r7 == 0) goto L_0x0037
            r3.mo54755s(r4, r5)     // Catch:{ ExecutionException -> 0x0120 }
            com.google.common.a.b r0 = r3.f155681n     // Catch:{ ExecutionException -> 0x0120 }
            r0.mo54684d()     // Catch:{ ExecutionException -> 0x0120 }
        L_0x0032:
            r3.mo54753q()
            goto L_0x0115
        L_0x0037:
            com.google.common.a.az r5 = r4.mo54720d()     // Catch:{ ExecutionException -> 0x0120 }
            boolean r6 = r5.mo54706g()     // Catch:{ ExecutionException -> 0x0120 }
            if (r6 == 0) goto L_0x0046
            java.lang.Object r7 = r3.mo54746j(r4, r0, r5)     // Catch:{ ExecutionException -> 0x0120 }
            goto L_0x0032
        L_0x0046:
            r3.lock()     // Catch:{ ExecutionException -> 0x0120 }
            com.google.common.a.bn r4 = r3.f155668a     // Catch:{ all -> 0x0116 }
            com.google.common.base.cz r4 = r4.f155749r     // Catch:{ all -> 0x0116 }
            long r4 = r4.mo26884a()     // Catch:{ all -> 0x0116 }
            r3.mo54757u(r4)     // Catch:{ all -> 0x0116 }
            int r6 = r3.f155669b     // Catch:{ all -> 0x0116 }
            int r6 = r6 + -1
            java.util.concurrent.atomic.AtomicReferenceArray r7 = r3.f155673f     // Catch:{ all -> 0x0116 }
            int r8 = r7.length()     // Catch:{ all -> 0x0116 }
            int r8 = r8 + -1
            r8 = r8 & r1
            java.lang.Object r9 = r7.get(r8)     // Catch:{ all -> 0x0116 }
            com.google.common.a.bu r9 = (com.google.common.p4520a.C58241bu) r9     // Catch:{ all -> 0x0116 }
            r10 = r9
        L_0x0068:
            r12 = 0
            if (r10 == 0) goto L_0x00cf
            java.lang.Object r13 = r10.mo54726j()     // Catch:{ all -> 0x0116 }
            int r14 = r10.mo54717a()     // Catch:{ all -> 0x0116 }
            if (r14 != r1) goto L_0x00ca
            if (r13 == 0) goto L_0x00ca
            com.google.common.a.bn r14 = r3.f155668a     // Catch:{ all -> 0x0116 }
            com.google.common.base.af r14 = r14.f155739h     // Catch:{ all -> 0x0116 }
            boolean r14 = r14.mo56077d(r0, r13)     // Catch:{ all -> 0x0116 }
            if (r14 == 0) goto L_0x00ca
            com.google.common.a.az r14 = r10.mo54720d()     // Catch:{ all -> 0x0116 }
            boolean r15 = r14.mo54706g()     // Catch:{ all -> 0x0116 }
            if (r15 == 0) goto L_0x008d
            r11 = 0
            goto L_0x00d1
        L_0x008d:
            java.lang.Object r15 = r14.get()     // Catch:{ all -> 0x0116 }
            if (r15 != 0) goto L_0x009c
            int r4 = r14.mo54700a()     // Catch:{ all -> 0x0116 }
            r5 = 3
            r3.mo54762z(r13, r12, r4, r5)     // Catch:{ all -> 0x0116 }
            goto L_0x00ac
        L_0x009c:
            com.google.common.a.bn r11 = r3.f155668a     // Catch:{ all -> 0x0116 }
            boolean r11 = r11.mo54798q(r10, r4)     // Catch:{ all -> 0x0116 }
            if (r11 == 0) goto L_0x00b9
            int r4 = r14.mo54700a()     // Catch:{ all -> 0x0116 }
            r5 = 4
            r3.mo54762z(r13, r15, r4, r5)     // Catch:{ all -> 0x0116 }
        L_0x00ac:
            java.util.Queue r4 = r3.f155679l     // Catch:{ all -> 0x0116 }
            r4.remove(r10)     // Catch:{ all -> 0x0116 }
            java.util.Queue r4 = r3.f155680m     // Catch:{ all -> 0x0116 }
            r4.remove(r10)     // Catch:{ all -> 0x0116 }
            r3.f155669b = r6     // Catch:{ all -> 0x0116 }
            goto L_0x00d0
        L_0x00b9:
            r3.mo54754r(r10, r4)     // Catch:{ all -> 0x0116 }
            com.google.common.a.b r0 = r3.f155681n     // Catch:{ all -> 0x0116 }
            r0.mo54684d()     // Catch:{ all -> 0x0116 }
            r3.unlock()     // Catch:{ ExecutionException -> 0x0120 }
            r3.mo54758v()     // Catch:{ ExecutionException -> 0x0120 }
            r7 = r15
            goto L_0x0032
        L_0x00ca:
            com.google.common.a.bu r10 = r10.mo54721e()     // Catch:{ all -> 0x0116 }
            goto L_0x0068
        L_0x00cf:
            r14 = r12
        L_0x00d0:
            r11 = 1
        L_0x00d1:
            if (r11 == 0) goto L_0x00ea
            com.google.common.a.aj r12 = new com.google.common.a.aj     // Catch:{ all -> 0x0116 }
            com.google.common.a.az r4 = f155732b     // Catch:{ all -> 0x0116 }
            r12.<init>(r4)     // Catch:{ all -> 0x0116 }
            if (r10 != 0) goto L_0x00e7
            com.google.common.a.bu r10 = r3.mo54740d(r0, r1, r9)     // Catch:{ all -> 0x0116 }
            r10.mo54732p(r12)     // Catch:{ all -> 0x0116 }
            r7.set(r8, r10)     // Catch:{ all -> 0x0116 }
            goto L_0x00ea
        L_0x00e7:
            r10.mo54732p(r12)     // Catch:{ all -> 0x0116 }
        L_0x00ea:
            r3.unlock()     // Catch:{ ExecutionException -> 0x0120 }
            r3.mo54758v()     // Catch:{ ExecutionException -> 0x0120 }
            if (r11 == 0) goto L_0x010e
            monitor-enter(r10)     // Catch:{ all -> 0x0107 }
            r4 = r18
            com.google.common.util.concurrent.cx r4 = r12.mo54709i(r0, r4)     // Catch:{ all -> 0x0104 }
            java.lang.Object r0 = r3.mo54743g(r0, r1, r12, r4)     // Catch:{ all -> 0x0104 }
            monitor-exit(r10)     // Catch:{ all -> 0x0104 }
            com.google.common.a.b r1 = r3.f155681n     // Catch:{ ExecutionException -> 0x0120 }
            r1.mo54685e()     // Catch:{ ExecutionException -> 0x0120 }
            goto L_0x0112
        L_0x0104:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0104 }
            throw r0     // Catch:{ all -> 0x0107 }
        L_0x0107:
            r0 = move-exception
            com.google.common.a.b r1 = r3.f155681n     // Catch:{ ExecutionException -> 0x0120 }
            r1.mo54685e()     // Catch:{ ExecutionException -> 0x0120 }
            throw r0     // Catch:{ ExecutionException -> 0x0120 }
        L_0x010e:
            java.lang.Object r0 = r3.mo54746j(r10, r0, r14)     // Catch:{ ExecutionException -> 0x0120 }
        L_0x0112:
            r7 = r0
            goto L_0x0032
        L_0x0115:
            return r7
        L_0x0116:
            r0 = move-exception
            r3.unlock()     // Catch:{ ExecutionException -> 0x0120 }
            r3.mo54758v()     // Catch:{ ExecutionException -> 0x0120 }
            throw r0     // Catch:{ ExecutionException -> 0x0120 }
        L_0x011e:
            r0 = move-exception
            goto L_0x013c
        L_0x0120:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch:{ all -> 0x011e }
            boolean r4 = r1 instanceof java.lang.Error     // Catch:{ all -> 0x011e }
            if (r4 != 0) goto L_0x0134
            boolean r4 = r1 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x011e }
            if (r4 == 0) goto L_0x0133
            com.google.common.util.concurrent.ec r0 = new com.google.common.util.concurrent.ec     // Catch:{ all -> 0x011e }
            r0.<init>(r1)     // Catch:{ all -> 0x011e }
            throw r0     // Catch:{ all -> 0x011e }
        L_0x0133:
            throw r0     // Catch:{ all -> 0x011e }
        L_0x0134:
            com.google.common.util.concurrent.bh r0 = new com.google.common.util.concurrent.bh     // Catch:{ all -> 0x011e }
            java.lang.Error r1 = (java.lang.Error) r1     // Catch:{ all -> 0x011e }
            r0.<init>(r1)     // Catch:{ all -> 0x011e }
            throw r0     // Catch:{ all -> 0x011e }
        L_0x013c:
            r3.mo54753q()
            goto L_0x0141
        L_0x0140:
            throw r0
        L_0x0141:
            goto L_0x0140
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4520a.C58234bn.mo54791e(java.lang.Object, com.google.common.a.l):java.lang.Object");
    }
}
