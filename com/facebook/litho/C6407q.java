package com.facebook.litho;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.facebook.litho.p325d.C6180a;
import com.facebook.litho.p332h.C6375a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.litho.q */
/* compiled from: PG */
public class C6407q extends C6091ab implements Cloneable, C6168cp, C6142bw {

    /* renamed from: a */
    private static final AtomicInteger f18981a = new AtomicInteger(1);

    /* renamed from: h */
    public static final C6138bs[] f18982h = new C6138bs[0];

    /* renamed from: b */
    private SparseArray f18983b;

    /* renamed from: c */
    private SparseIntArray f18984c;

    /* renamed from: d */
    private Map f18985d;

    /* renamed from: i */
    public final String f18986i;

    /* renamed from: j */
    public final boolean f18987j;

    /* renamed from: k */
    List f18988k;

    /* renamed from: l */
    public int f18989l;

    /* renamed from: m */
    public String f18990m;

    /* renamed from: n */
    public String f18991n;

    /* renamed from: o */
    public String f18992o;

    /* renamed from: p */
    public boolean f18993p;

    /* renamed from: q */
    public AtomicBoolean f18994q;

    /* renamed from: r */
    public C6411u f18995r;

    /* renamed from: s */
    public boolean f18996s;

    /* renamed from: t */
    public C6154cb f18997t;

    /* renamed from: u */
    public Context f18998u;

    /* renamed from: v */
    public C6279fv f18999v;

    /* renamed from: w */
    public C6176cx f19000w;

    /* renamed from: x */
    public C6402l f19001x;

    public C6407q() {
        throw null;
    }

    /* renamed from: A */
    public static boolean m17270A(C6407q qVar) {
        return qVar != null && qVar.mo12824ao() == 3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        r2 = r2.mo13468c();
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m17271B(com.facebook.litho.C6411u r2, com.facebook.litho.C6407q r3) {
        /*
            boolean r0 = m17280y(r3)
            r1 = 1
            if (r0 != 0) goto L_0x0023
            r0 = 0
            if (r3 == 0) goto L_0x0022
            if (r2 == 0) goto L_0x0021
            com.facebook.litho.dg r2 = r2.mo13468c()
            if (r2 == 0) goto L_0x0021
            java.util.Map r2 = r2.f18309n
            int r3 = r3.f18989l
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            return r0
        L_0x0022:
            r1 = 0
        L_0x0023:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.C6407q.m17271B(com.facebook.litho.u, com.facebook.litho.q):boolean");
    }

    /* renamed from: C */
    static void m17272C(C6181da daVar, C6407q qVar) {
        boolean z = qVar.f18987j;
        List list = qVar.f18988k;
        if (list != null && !list.isEmpty()) {
            daVar.mo12918aQ(qVar.f18988k);
        }
    }

    /* renamed from: E */
    static String m17273E(C6407q qVar) {
        boolean z = qVar.f18987j;
        return qVar.f18991n;
    }

    /* renamed from: F */
    static void m17274F(C6407q qVar) {
        boolean z = qVar.f18987j;
        qVar.mo13463s();
    }

    /* renamed from: aE */
    private final synchronized int m17275aE(String str) {
        int intValue;
        if (this.f18985d == null) {
            this.f18985d = new HashMap();
        }
        intValue = this.f18985d.containsKey(str) ? ((Integer) this.f18985d.get(str)).intValue() : 0;
        this.f18985d.put(str, Integer.valueOf(intValue + 1));
        return intValue;
    }

    /* renamed from: b */
    private final synchronized int m17276b(C6407q qVar) {
        int i;
        if (this.f18984c == null) {
            this.f18984c = new SparseIntArray();
        }
        int i2 = qVar.f17990y;
        i = this.f18984c.get(i2, 0);
        this.f18984c.put(i2, i + 1);
        return i;
    }

    /* renamed from: u */
    public static void m17277u(String str, C6388hm hmVar, C6407q qVar, String str2) {
        if (qVar.f18988k == null) {
            qVar.f18988k = new ArrayList();
        }
        qVar.f18988k.add(new C6390ho(str, hmVar, qVar, str2));
    }

    /* renamed from: w */
    static boolean m17278w(C6407q qVar) {
        return qVar instanceof C6170cr;
    }

    /* renamed from: x */
    static boolean m17279x(C6407q qVar) {
        return qVar != null && qVar.mo12824ao() == 1;
    }

    /* renamed from: y */
    static boolean m17280y(C6407q qVar) {
        return m17279x(qVar) && qVar.mo12815af();
    }

    /* renamed from: z */
    static boolean m17281z(C6407q qVar) {
        return (qVar == null || qVar.mo12824ao() == 1) ? false : true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final void mo13453D() {
        throw new RuntimeException("Components that have dynamic Props must override this method");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final C6407q mo13454G(C6411u uVar) {
        C6407q j = mo13318j();
        C6188dh dhVar = uVar.f19018k;
        j.f18991n = this.f18991n;
        j.mo13462r(j.f19000w, this.f19000w);
        j.mo13455I(uVar).f19016i = mo12826aq(uVar.f19016i);
        return j;
    }

    /* renamed from: H */
    public void mo13317H(C6158cf cfVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final C6411u mo13455I(C6411u uVar) {
        C6279fv fvVar;
        ArrayList arrayList;
        List<C6278fu> list;
        Object obj;
        int i;
        String str = this.f18991n;
        if ((C6180a.f18234a || C6180a.f18237d) && str == null) {
            C6407q qVar = uVar.f19012e;
            String p = mo13460p();
            if (qVar == null) {
                str = p;
            } else {
                String str2 = qVar.f18991n;
                if (str2 == null) {
                    C6106aq.m15891b(2, "ComponentKeyUtils:NullParentKey", "Trying to generate parent-based key for component " + mo13461q() + " , but parent " + qVar.mo13461q() + " has a null global key \". This is most likely a configuration mistake, check the value of ComponentsConfiguration.useGlobalKeys.");
                    str = "null".concat(String.valueOf(p));
                } else {
                    StringBuilder sb = new StringBuilder(str2.length() + p.length() + 1);
                    sb.append(str2);
                    sb.append(",");
                    sb.append(p);
                    String sb2 = sb.toString();
                    if (this.f18993p) {
                        i = qVar.m17275aE(sb2);
                        if (i != 0) {
                            C6106aq.m15891b(1, "ComponentKeyUtils:DuplicateManualKey", "The manual key " + p + " you are setting on this " + mo13461q() + " is a duplicate and will be changed into a unique one. This will result in unexpected behavior if you don't change it.");
                        }
                    } else {
                        i = qVar.m17276b(this);
                    }
                    if (i == 0) {
                        str = sb2;
                    } else {
                        StringBuilder sb3 = new StringBuilder(sb2.length() + 4);
                        sb3.append(sb2);
                        sb3.append('!');
                        sb3.append(i);
                        str = sb3.toString();
                    }
                }
            }
            this.f18991n = str;
        }
        C6411u uVar2 = new C6411u(uVar);
        uVar2.f19012e = this;
        uVar2.f19017j = uVar.f19017j;
        this.f18995r = uVar2;
        mo12811ab(uVar2.f19016i);
        if (mo12818ai()) {
            C6280fw fwVar = uVar.f19010c;
            C6188dh dhVar = uVar.f19018k;
            fwVar.mo13286k();
            fwVar.mo13284i();
            if (mo12818ai()) {
                C6411u uVar3 = this.f18995r;
                synchronized (fwVar) {
                    fvVar = (C6279fv) fwVar.f18543e.get(str);
                    fwVar.f18544f.add(str);
                }
                if (fvVar != null) {
                    mo12812ac(fvVar, this.f18999v);
                } else {
                    ComponentTree componentTree = uVar3.f19017j;
                    if (componentTree != null) {
                        C6175cw cwVar = componentTree.f17902e;
                        synchronized (cwVar) {
                            obj = cwVar.f18221b.get(this.f18991n);
                            if (obj == null) {
                                obj = new Object();
                                cwVar.f18221b.put(this.f18991n, obj);
                            }
                        }
                        synchronized (obj) {
                            C6279fv fvVar2 = (C6279fv) cwVar.f18220a.get(this.f18991n);
                            if (fvVar2 == null) {
                                mo12799R(uVar3);
                                cwVar.f18220a.put(this.f18991n, this.f18999v);
                            } else {
                                mo12812ac(fvVar2, this.f18999v);
                            }
                        }
                    } else {
                        mo12799R(uVar3);
                    }
                }
                synchronized (fwVar) {
                    Map map = fwVar.f18539a;
                    arrayList = null;
                    if (map == null) {
                        list = null;
                    } else {
                        list = (List) map.get(str);
                    }
                }
                if (list != null) {
                    ArrayList arrayList2 = null;
                    for (C6278fu a : list) {
                        C6279fv fvVar3 = this.f18999v;
                        fvVar3.mo13275a(a);
                        C6365gr a2 = fvVar3 instanceof C6090aa ? ((C6090aa) fvVar3).mo12792a() : null;
                        if (a2 != null) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(a2);
                        }
                    }
                    C6375a.f18850a.addAndGet((long) list.size());
                    synchronized (fwVar) {
                        fwVar.f18539a.remove(str);
                        Map map2 = fwVar.f18540b;
                        if (map2 != null) {
                            map2.remove(str);
                        }
                        fwVar.f18542d.put(str, list);
                    }
                    arrayList = arrayList2;
                }
                synchronized (fwVar) {
                    fwVar.f18543e.put(str, this.f18999v);
                    if (arrayList != null && !arrayList.isEmpty()) {
                        fwVar.mo13285j();
                        fwVar.f18541c.put(str, arrayList);
                    }
                }
            }
        }
        this.f18997t = uVar.mo13467b();
        AtomicBoolean atomicBoolean = this.f18994q;
        if (atomicBoolean != null) {
            atomicBoolean.set(true);
        }
        return uVar2;
    }

    /* renamed from: J */
    public final C6402l mo13456J() {
        if (this.f19001x == null) {
            this.f19001x = new C6402l();
        }
        return this.f19001x;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo13269e() {
        return false;
    }

    /* renamed from: f */
    public boolean mo13057a(C6407q qVar) {
        if (this == qVar) {
            return true;
        }
        if (qVar == null || getClass() != qVar.getClass()) {
            return false;
        }
        if (this.f18989l == qVar.f18989l) {
            return true;
        }
        return C6103an.m15879f(this, qVar);
    }

    /* renamed from: g */
    public SparseArray mo13144g() {
        return this.f18983b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final SparseArray mo13457h() {
        if (this.f18983b == null) {
            this.f18983b = new SparseArray();
        }
        return this.f18983b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C6407q mo13406i() {
        return null;
    }

    /* renamed from: j */
    public C6407q mo13318j() {
        try {
            C6407q qVar = (C6407q) super.clone();
            qVar.f18994q = new AtomicBoolean();
            qVar.f18991n = null;
            qVar.f18996s = false;
            qVar.f18995r = null;
            qVar.f18984c = null;
            qVar.f18985d = null;
            return qVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final C6407q mo13458k() {
        C6407q j = mo13318j();
        j.f18989l = f18981a.incrementAndGet();
        return j;
    }

    @Deprecated
    /* renamed from: l */
    public final C6145bz mo13127l() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final C6154cb mo12837m() {
        return this.f18997t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C6176cx mo13459n() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C6279fv mo13319o() {
        return null;
    }

    /* renamed from: p */
    public final String mo13460p() {
        if (this.f18992o == null && !this.f18993p) {
            this.f18992o = Integer.toString(this.f17990y);
        }
        return this.f18992o;
    }

    /* renamed from: q */
    public final String mo13461q() {
        C6407q i = mo13406i();
        if (i == null) {
            return this.f18986i;
        }
        String str = this.f18986i;
        while (i.mo13406i() != null) {
            i = i.mo13406i();
        }
        String q = i.mo13461q();
        return str + "(" + q + ")";
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo13462r(C6176cx cxVar, C6176cx cxVar2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final synchronized void mo13463s() {
        if (!this.f18996s) {
            this.f18996s = true;
        } else {
            throw new IllegalStateException("Duplicate layout of a component: ".concat(toString()));
        }
    }

    /* renamed from: t */
    public final void mo13464t(C6411u uVar, int i, int i2, C6276fs fsVar) {
        int i3 = i;
        int i4 = i2;
        C6276fs fsVar2 = fsVar;
        C6187dg c = uVar.mo13468c();
        if (c != null) {
            C6181da g = c.mo13157g(this);
            if (g == null || !C6235ei.m16506a(g.mo12897W(), i3, g.mo12882H()) || !C6235ei.m16506a(g.mo12896V(), i4, g.mo12901a())) {
                c.mo13158m(this);
                g = C6184dd.m16306e(c.f18302g, uVar, this, (String) null, i, i2, (C6181da) null, (C6188dh) null, (C6122bc) null, (C6261fd) null);
                c.f18309n.put(Integer.valueOf(this.f18989l), g);
                if (m17279x(this)) {
                    g.mo12981bb(i3);
                    g.mo12926aY(i4);
                    g.mo12980ba((float) g.mo12882H());
                    g.mo12927aZ((float) g.mo12901a());
                }
            }
            fsVar2.f18535a = g.mo12882H();
            fsVar2.f18536b = g.mo12901a();
            return;
        }
        throw new IllegalStateException(mo13461q().concat(": Trying to measure a component outside of a LayoutState calculation. If that is what you must do, see Component#measureMightNotCacheInternalNode."));
    }

    public final String toString() {
        return mo13461q();
    }

    /* renamed from: v */
    public boolean mo13145v() {
        SparseArray sparseArray = this.f18983b;
        return sparseArray != null && sparseArray.size() > 0;
    }

    protected C6407q(String str) {
        this.f18989l = f18981a.getAndIncrement();
        this.f18994q = new AtomicBoolean();
        this.f18996s = false;
        this.f18986i = str;
        boolean z = C6180a.f18234a;
        this.f18987j = false;
        this.f18999v = mo13319o();
        this.f19000w = mo13459n();
    }
}
