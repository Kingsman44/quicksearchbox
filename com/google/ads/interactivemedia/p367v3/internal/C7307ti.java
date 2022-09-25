package com.google.ads.interactivemedia.p367v3.internal;

import android.net.Uri;
import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ti */
/* compiled from: PG */
public final class C7307ti extends C7299ta {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C6873dg f23812a;

    /* renamed from: b */
    private final List f23813b;

    /* renamed from: c */
    private final Set f23814c;

    /* renamed from: d */
    private Handler f23815d;

    /* renamed from: e */
    private final List f23816e;

    /* renamed from: f */
    private final IdentityHashMap f23817f;

    /* renamed from: g */
    private final Map f23818g;

    /* renamed from: h */
    private final Set f23819h;

    /* renamed from: i */
    private boolean f23820i;

    /* renamed from: j */
    private Set f23821j;

    /* renamed from: k */
    private C7357ve f23822k;

    static {
        C6868db dbVar = new C6868db();
        dbVar.mo15656h(Uri.EMPTY);
        f23812a = dbVar.mo15649a();
    }

    public C7307ti(C7357ve veVar, C7323ty... tyVarArr) {
        this.f23822k = veVar.mo16638a() > 0 ? veVar.mo16645h() : veVar;
        this.f23817f = new IdentityHashMap();
        this.f23818g = new HashMap();
        this.f23813b = new ArrayList();
        this.f23816e = new ArrayList();
        this.f23821j = new HashSet();
        this.f23814c = new HashSet();
        this.f23819h = new HashSet();
        mo16528E(Arrays.asList(tyVarArr));
    }

    /* renamed from: J */
    private final void m21811J() {
        m21812K((C7304tf) null);
    }

    /* renamed from: K */
    private final void m21812K(C7304tf tfVar) {
        if (!this.f23820i) {
            m21814M().obtainMessage(4).sendToTarget();
            this.f23820i = true;
        }
    }

    /* renamed from: L */
    private final void m21813L() {
        this.f23820i = false;
        Set set = this.f23821j;
        this.f23821j = new HashSet();
        mo16470e(new C7302td(this.f23816e, this.f23822k));
        m21814M().obtainMessage(5, set).sendToTarget();
    }

    /* renamed from: M */
    private final Handler m21814M() {
        Handler handler = this.f23815d;
        ary.m19467t(handler);
        return handler;
    }

    /* renamed from: N */
    private final synchronized void m21815N(Set set) {
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            this.f23814c.removeAll(set);
        } else {
            C7304tf tfVar = (C7304tf) it.next();
            throw null;
        }
    }

    /* renamed from: O */
    private final void m21816O(int i, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C7305tg tgVar = (C7305tg) it.next();
            int i2 = i + 1;
            if (i > 0) {
                C7305tg tgVar2 = (C7305tg) this.f23816e.get(i - 1);
                tgVar.mo16525a(i, tgVar2.f23807e + tgVar2.f23803a.mo16539C().mo15780s());
            } else {
                tgVar.mo16525a(i, 0);
            }
            m21818Q(i, 1, tgVar.f23803a.mo16539C().mo15780s());
            this.f23816e.add(i, tgVar);
            this.f23818g.put(tgVar.f23804b, tgVar);
            mo16516v(tgVar, tgVar.f23803a);
            if (!mo16475j() || !this.f23817f.isEmpty()) {
                mo16518x(tgVar);
            } else {
                this.f23819h.add(tgVar);
            }
            i = i2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public final void mo16514B(C7305tg tgVar, C6912es esVar) {
        int s;
        if (tgVar.f23806d + 1 < this.f23816e.size() && (s = esVar.mo15780s() - (((C7305tg) this.f23816e.get(tgVar.f23806d + 1)).f23807e - tgVar.f23807e)) != 0) {
            m21818Q(tgVar.f23806d + 1, 0, s);
        }
        m21811J();
    }

    /* renamed from: Q */
    private final void m21818Q(int i, int i2, int i3) {
        while (i < this.f23816e.size()) {
            C7305tg tgVar = (C7305tg) this.f23816e.get(i);
            tgVar.f23806d += i2;
            tgVar.f23807e += i3;
            i++;
        }
    }

    /* renamed from: R */
    private final void m21819R(C7305tg tgVar) {
        if (tgVar.f23808f && tgVar.f23805c.isEmpty()) {
            this.f23819h.remove(tgVar);
            mo16519y(tgVar);
        }
    }

    /* renamed from: S */
    private final void m21820S() {
        Iterator it = this.f23819h.iterator();
        while (it.hasNext()) {
            C7305tg tgVar = (C7305tg) it.next();
            if (tgVar.f23805c.isEmpty()) {
                mo16518x(tgVar);
                it.remove();
            }
        }
    }

    /* renamed from: T */
    private final void m21821T(int i, Collection collection) {
        ary.m19462o(true);
        Handler handler = this.f23815d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ary.m19467t((C7323ty) it.next());
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C7305tg((C7323ty) it2.next()));
        }
        this.f23813b.addAll(i, arrayList);
        if (handler != null && !collection.isEmpty()) {
            handler.obtainMessage(0, new C7306th(i, arrayList, (C7304tf) null)).sendToTarget();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final /* bridge */ /* synthetic */ C7321tw mo16513A(Object obj, C7321tw twVar) {
        int i = 0;
        while (true) {
            C7305tg tgVar = (C7305tg) obj;
            if (i >= tgVar.f23805c.size()) {
                return null;
            }
            if (((C7321tw) tgVar.f23805c.get(i)).f23862d == twVar.f23862d) {
                return twVar.mo16541a(Pair.create(tgVar.f23804b, twVar.f23859a));
            }
            i++;
        }
    }

    /* renamed from: C */
    public final synchronized void mo16526C(C7323ty tyVar) {
        mo16527D(this.f23813b.size(), tyVar);
    }

    /* renamed from: D */
    public final synchronized void mo16527D(int i, C7323ty tyVar) {
        m21821T(i, Collections.singletonList(tyVar));
    }

    /* renamed from: E */
    public final synchronized void mo16528E(Collection collection) {
        m21821T(this.f23813b.size(), collection);
    }

    /* renamed from: F */
    public final synchronized C7323ty mo16529F(int i) {
        return ((C7305tg) this.f23813b.get(i)).f23803a;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00cd A[LOOP:1: B:27:0x00cb->B:28:0x00cd, LOOP_END] */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ boolean mo16530H(android.os.Message r9) {
        /*
            r8 = this;
            int r0 = r9.what
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00f2
            if (r0 == r2) goto L_0x009b
            r3 = 2
            if (r0 == r3) goto L_0x0038
            r3 = 3
            if (r0 == r3) goto L_0x002a
            r1 = 4
            if (r0 == r1) goto L_0x0025
            r1 = 5
            if (r0 != r1) goto L_0x001f
            java.lang.Object r9 = r9.obj
            int r0 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a
            java.util.Set r9 = (java.util.Set) r9
            r8.m21815N(r9)
            goto L_0x0118
        L_0x001f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>()
            throw r9
        L_0x0025:
            r8.m21813L()
            goto L_0x0118
        L_0x002a:
            java.lang.Object r9 = r9.obj
            int r0 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a
            com.google.ads.interactivemedia.v3.internal.th r9 = (com.google.ads.interactivemedia.p367v3.internal.C7306th) r9
            java.lang.Object r0 = r9.f23810b
            com.google.ads.interactivemedia.v3.internal.ve r0 = (com.google.ads.interactivemedia.p367v3.internal.C7357ve) r0
            r8.f23822k = r0
            goto L_0x0113
        L_0x0038:
            java.lang.Object r9 = r9.obj
            int r0 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a
            com.google.ads.interactivemedia.v3.internal.th r9 = (com.google.ads.interactivemedia.p367v3.internal.C7306th) r9
            com.google.ads.interactivemedia.v3.internal.ve r0 = r8.f23822k
            int r3 = r9.f23809a
            int r4 = r3 + 1
            com.google.ads.interactivemedia.v3.internal.ve r0 = r0.mo16644g(r3, r4)
            r8.f23822k = r0
            java.lang.Object r3 = r9.f23810b
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            com.google.ads.interactivemedia.v3.internal.ve r0 = r0.mo16643f(r3, r2)
            r8.f23822k = r0
            int r0 = r9.f23809a
            java.lang.Object r3 = r9.f23810b
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r4 = java.lang.Math.min(r0, r3)
            int r5 = java.lang.Math.max(r0, r3)
            java.util.List r6 = r8.f23816e
            java.lang.Object r6 = r6.get(r4)
            com.google.ads.interactivemedia.v3.internal.tg r6 = (com.google.ads.interactivemedia.p367v3.internal.C7305tg) r6
            int r6 = r6.f23807e
            java.util.List r7 = r8.f23816e
            java.lang.Object r0 = r7.remove(r0)
            com.google.ads.interactivemedia.v3.internal.tg r0 = (com.google.ads.interactivemedia.p367v3.internal.C7305tg) r0
            r7.add(r3, r0)
        L_0x007f:
            if (r4 > r5) goto L_0x0113
            java.util.List r0 = r8.f23816e
            java.lang.Object r0 = r0.get(r4)
            com.google.ads.interactivemedia.v3.internal.tg r0 = (com.google.ads.interactivemedia.p367v3.internal.C7305tg) r0
            r0.f23806d = r4
            r0.f23807e = r6
            com.google.ads.interactivemedia.v3.internal.ts r0 = r0.f23803a
            com.google.ads.interactivemedia.v3.internal.es r0 = r0.mo16539C()
            int r0 = r0.mo15780s()
            int r6 = r6 + r0
            int r4 = r4 + 1
            goto L_0x007f
        L_0x009b:
            java.lang.Object r9 = r9.obj
            int r0 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a
            com.google.ads.interactivemedia.v3.internal.th r9 = (com.google.ads.interactivemedia.p367v3.internal.C7306th) r9
            int r0 = r9.f23809a
            java.lang.Object r3 = r9.f23810b
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r0 != 0) goto L_0x00c0
            com.google.ads.interactivemedia.v3.internal.ve r0 = r8.f23822k
            int r0 = r0.mo16638a()
            r4 = 0
            if (r3 != r0) goto L_0x00bf
            com.google.ads.interactivemedia.v3.internal.ve r0 = r8.f23822k
            com.google.ads.interactivemedia.v3.internal.ve r0 = r0.mo16645h()
            r8.f23822k = r0
            goto L_0x00c9
        L_0x00bf:
            r0 = 0
        L_0x00c0:
            com.google.ads.interactivemedia.v3.internal.ve r4 = r8.f23822k
            com.google.ads.interactivemedia.v3.internal.ve r4 = r4.mo16644g(r0, r3)
            r8.f23822k = r4
            r4 = r0
        L_0x00c9:
            r0 = -1
            int r3 = r3 + r0
        L_0x00cb:
            if (r3 < r4) goto L_0x0113
            java.util.List r5 = r8.f23816e
            java.lang.Object r5 = r5.remove(r3)
            com.google.ads.interactivemedia.v3.internal.tg r5 = (com.google.ads.interactivemedia.p367v3.internal.C7305tg) r5
            java.util.Map r6 = r8.f23818g
            java.lang.Object r7 = r5.f23804b
            r6.remove(r7)
            com.google.ads.interactivemedia.v3.internal.ts r6 = r5.f23803a
            com.google.ads.interactivemedia.v3.internal.es r6 = r6.mo16539C()
            int r6 = r6.mo15780s()
            int r6 = -r6
            r8.m21818Q(r3, r0, r6)
            r5.f23808f = r2
            r8.m21819R(r5)
            int r3 = r3 + -1
            goto L_0x00cb
        L_0x00f2:
            java.lang.Object r9 = r9.obj
            int r0 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a
            com.google.ads.interactivemedia.v3.internal.th r9 = (com.google.ads.interactivemedia.p367v3.internal.C7306th) r9
            com.google.ads.interactivemedia.v3.internal.ve r0 = r8.f23822k
            int r3 = r9.f23809a
            java.lang.Object r4 = r9.f23810b
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            com.google.ads.interactivemedia.v3.internal.ve r0 = r0.mo16643f(r3, r4)
            r8.f23822k = r0
            int r0 = r9.f23809a
            java.lang.Object r3 = r9.f23810b
            java.util.Collection r3 = (java.util.Collection) r3
            r8.m21816O(r0, r3)
        L_0x0113:
            com.google.ads.interactivemedia.v3.internal.tf r9 = r9.f23811c
            r8.m21812K(r1)
        L_0x0118:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7307ti.mo16530H(android.os.Message):boolean");
    }

    /* renamed from: I */
    public final synchronized void mo16531I(int i) {
        mo16529F(i);
        int i2 = i + 1;
        ary.m19462o(true);
        Handler handler = this.f23815d;
        aeu.m18535e(this.f23813b, i, i2);
        if (handler != null) {
            handler.obtainMessage(1, new C7306th(i, Integer.valueOf(i2), (C7304tf) null)).sendToTarget();
        }
    }

    /* renamed from: U */
    public final C6873dg mo16522U() {
        return f23812a;
    }

    /* renamed from: V */
    public final void mo16523V(C7320tv tvVar) {
        C7305tg tgVar = (C7305tg) this.f23817f.remove(tvVar);
        ary.m19467t(tgVar);
        tgVar.f23803a.mo16523V(tvVar);
        tgVar.f23805c.remove(((C7314tp) tvVar).f23833b);
        if (!this.f23817f.isEmpty()) {
            m21820S();
        }
        m21819R(tgVar);
    }

    /* renamed from: W */
    public final C7320tv mo16524W(C7321tw twVar, acc acc, long j) {
        Object a = C7302td.m19689a(twVar.f23859a);
        C7321tw a2 = twVar.mo16541a(C7302td.m19690b(twVar.f23859a));
        C7305tg tgVar = (C7305tg) this.f23818g.get(a);
        if (tgVar == null) {
            tgVar = new C7305tg(new C7303te((byte[]) null));
            tgVar.f23808f = true;
            mo16516v(tgVar, tgVar.f23803a);
        }
        this.f23819h.add(tgVar);
        mo16517w(tgVar);
        tgVar.f23805c.add(a2);
        C7314tp D = tgVar.f23803a.mo16524W(a2, acc, j);
        this.f23817f.put(D, tgVar);
        m21820S();
        return D;
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public final void mo16466X() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo16467a(adh adh) {
        super.mo16467a(adh);
        this.f23815d = new Handler(new C7301tc(this));
        if (this.f23813b.isEmpty()) {
            m21813L();
            return;
        }
        this.f23822k = this.f23822k.mo16643f(0, this.f23813b.size());
        m21816O(0, this.f23813b);
        m21811J();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo16468c() {
        super.mo16468c();
        this.f23819h.clear();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final synchronized void mo16469d() {
        super.mo16469d();
        this.f23816e.clear();
        this.f23819h.clear();
        this.f23818g.clear();
        this.f23822k = this.f23822k.mo16645h();
        Handler handler = this.f23815d;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f23815d = null;
        }
        this.f23820i = false;
        this.f23821j.clear();
        m21815N(this.f23814c);
    }

    /* renamed from: r */
    public final synchronized C6912es mo16483r() {
        C7357ve veVar;
        if (this.f23822k.mo16638a() != this.f23813b.size()) {
            veVar = this.f23822k.mo16645h().mo16643f(0, this.f23813b.size());
        } else {
            veVar = this.f23822k;
        }
        return new C7302td(this.f23813b, veVar);
    }

    /* renamed from: s */
    public final boolean mo16484s() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final /* bridge */ /* synthetic */ int mo16520z(Object obj, int i) {
        return i + ((C7305tg) obj).f23807e;
    }
}
