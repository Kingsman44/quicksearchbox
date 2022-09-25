package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0826b;
import androidx.p060c.C0983m;
import com.google.android.apps.gsa.assistant.shared.g.a;
import com.google.android.apps.gsa.assistant.shared.g.b;
import com.google.android.apps.gsa.assistant.shared.g.c;
import com.google.android.apps.gsa.assistant.shared.g.f;
import com.google.android.apps.gsa.assistant.shared.l.i;
import com.google.android.apps.gsa.assistant.shared.l.m;
import com.google.android.apps.gsa.assistant.shared.p5816g.C73867g;
import com.google.android.apps.gsa.opa.C83581al;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90886at;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105922ac;
import com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105923ad;
import com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak;
import com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105932am;
import com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105933an;
import com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105935ap;
import com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105952bf;
import com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105954d;
import com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105955e;
import com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105958h;
import com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105969s;
import com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105970t;
import com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105975y;
import com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105976z;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p.C113050ay;
import com.google.android.apps.gsa.staticplugins.opa.util.C113863cr;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3897e.p3910e.p3911a.C51205t;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60320od;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.aqm;
import com.google.common.p4552o.aqp;
import com.google.common.p4552o.aqs;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p4017at.p4060h.p4068b.p4069a.C54201r;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.dt */
/* compiled from: PG */
public final class C108303dt implements C90991b {

    /* renamed from: a */
    public static final C59071e f301260a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.chatui.dt");

    /* renamed from: A */
    private final C113863cr f301261A;

    /* renamed from: B */
    private final C28292j f301262B;

    /* renamed from: C */
    private final Set f301263C;

    /* renamed from: D */
    private final List f301264D;

    /* renamed from: E */
    private int f301265E;

    /* renamed from: F */
    private C60870cx f301266F;

    /* renamed from: G */
    private long f301267G;

    /* renamed from: H */
    private boolean f301268H;

    /* renamed from: I */
    private final C83581al f301269I;

    /* renamed from: J */
    private final C58833ax f301270J;

    /* renamed from: b */
    public final C68214a f301271b;

    /* renamed from: c */
    public final C22871g f301272c;

    /* renamed from: d */
    public final C86338r f301273d;

    /* renamed from: e */
    public final Context f301274e;

    /* renamed from: f */
    public final C21370a f301275f;

    /* renamed from: g */
    public final C86124t f301276g;

    /* renamed from: h */
    public final SparseArray f301277h;

    /* renamed from: i */
    public final C108268cl f301278i;

    /* renamed from: j */
    public final Set f301279j = new HashSet();

    /* renamed from: k */
    public final C0983m f301280k;

    /* renamed from: l */
    public final HashMap f301281l = new HashMap();

    /* renamed from: m */
    public List f301282m;

    /* renamed from: n */
    public ViewGroup f301283n;

    /* renamed from: o */
    public C108297dn f301284o;

    /* renamed from: p */
    public C108298do f301285p;

    /* renamed from: q */
    public final SettableFuture f301286q = new SettableFuture();

    /* renamed from: r */
    int f301287r = 0;

    /* renamed from: s */
    public boolean f301288s = false;

    /* renamed from: t */
    public C108296dm f301289t;

    /* renamed from: u */
    String f301290u;

    /* renamed from: v */
    public int f301291v;

    /* renamed from: w */
    public C108267ck f301292w;

    /* renamed from: x */
    final C108291dh f301293x = new C108291dh(this);

    /* renamed from: y */
    private final C90931ca f301294y;

    /* renamed from: z */
    private final C22871g f301295z;

    public C108303dt(C68214a aVar, C90931ca caVar, C22871g gVar, C22871g gVar2, C86338r rVar, Context context, C21370a aVar2, C86054o oVar, C86124t tVar, C113863cr crVar, C108268cl clVar, C83581al alVar, C58833ax axVar) {
        this.f301271b = aVar;
        this.f301294y = caVar;
        this.f301272c = gVar;
        this.f301295z = gVar2;
        this.f301273d = rVar;
        this.f301274e = context;
        this.f301275f = aVar2;
        this.f301276g = tVar;
        this.f301261A = crVar;
        this.f301262B = new C28292j(33258);
        this.f301277h = new SparseArray();
        this.f301263C = new HashSet();
        this.f301264D = new ArrayList();
        this.f301278i = clVar;
        this.f301269I = alVar;
        this.f301270J = axVar;
        this.f301280k = new C108292di(this);
        if (oVar.mo79668a() != null) {
            Account a = oVar.mo79668a();
            a.getClass();
            this.f301290u = a.name;
        } else {
            C59104x d = f301260a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "HistoryManager");
            ((C59052c) ((C59052c) d).mo56372aa(23971)).mo56386p("No signed-in account!");
        }
        this.f301267G = aVar2.mo26870b();
    }

    /* renamed from: g */
    public static C60870cx m180009g(C108300dq dqVar) {
        C58485gu a = dqVar.mo96735a();
        C58485gu b = dqVar.mo96736b();
        C58976aa aaVar = C58975e.f156826a;
        a.size();
        b.size();
        return C60856cj.m92892a(b).mo57334a(new C108294dk(a, b), C60826bg.f164896a);
    }

    /* renamed from: v */
    private final String m180010v() {
        return "opa_hold_timeout_timestamp_millis_".concat(String.valueOf(this.f301290u));
    }

    /* renamed from: w */
    private final void m180011w(int i, C108232bc bcVar) {
        Set set = this.f301263C;
        Integer valueOf = Integer.valueOf(i);
        if (!set.contains(valueOf)) {
            this.f301263C.add(valueOf);
            C28293k i2 = bcVar.mo95831i();
            if (i2 != null) {
                synchronized (this.f301264D) {
                    this.f301264D.add(i2);
                }
                synchronized (this.f301264D) {
                    C60870cx cxVar = this.f301266F;
                    if (cxVar != null && !cxVar.isDone()) {
                        this.f301266F.cancel(false);
                    }
                    this.f301266F = this.f301294y.mo85137b(new C108295dl(this), 800);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized int mo96740a() {
        if (!this.f301288s) {
            return 0;
        }
        return this.f301287r;
    }

    /* renamed from: b */
    public final int mo96741b() {
        if (!this.f301288s) {
            return 0;
        }
        int a = mo96740a();
        List list = this.f301282m;
        if (list != null) {
            a += list.size();
        }
        if (!this.f301276g.mo79746e(C90014bt.f247760nI) && a <= 0) {
            return 0;
        }
        return a + 1;
    }

    /* renamed from: c */
    public final long mo96742c() {
        return this.f301273d.getLong(m180010v(), 0) - this.f301275f.mo26870b();
    }

    /* renamed from: e */
    public final C108232bc mo96743e(int i) {
        C108296dm dmVar;
        C108232bc bcVar;
        if (this.f301292w == null) {
            C59104x d = f301260a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "HistoryManager");
            ((C59052c) ((C59052c) d).mo56372aa(23966)).mo56387q("#getItemAt(%d) cannot be called until HistoryManager is initialized.", i);
            return null;
        } else if (i < 0 || i >= mo96741b()) {
            C59104x d2 = f301260a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "HistoryManager");
            ((C59052c) ((C59052c) d2).mo56372aa(23962)).mo56387q("#getItemAt(%d) is out of range.", i);
            return null;
        } else if (i == mo96741b() - 1) {
            C108267ck ckVar = this.f301292w;
            ckVar.getClass();
            C91097g gVar = ckVar.f301188c;
            gVar.getClass();
            C108273cq cqVar = new C108273cq(gVar);
            cqVar.f301035q = this.f301267G;
            if (this.f301277h.get(i) == null) {
                C28292j jVar = new C28292j(33260);
                aqp aqp = jVar.f76974b;
                aqp.copyOnWrite();
                aqs aqs = (aqs) aqp.instance;
                aqs aqs2 = aqs.f159780k;
                aqs.f159782a |= 2;
                aqs.f159784c = i;
                this.f301277h.put(i, jVar);
            }
            cqVar.f301030l = (C28292j) this.f301277h.get(i);
            m180011w(i, cqVar);
            return cqVar;
        } else {
            List list = this.f301282m;
            if (list != null && !list.isEmpty()) {
                if (i < this.f301282m.size()) {
                    return (C108232bc) this.f301282m.get(i);
                }
                i -= this.f301282m.size();
            }
            HashMap hashMap = this.f301281l;
            Integer valueOf = Integer.valueOf(i);
            if (hashMap.containsKey(valueOf)) {
                dmVar = (C108296dm) this.f301281l.get(valueOf);
                dmVar.getClass();
            } else {
                dmVar = C108296dm.NOT_CACHED;
            }
            if (dmVar == C108296dm.READY) {
                C58976aa aaVar = C58975e.f156826a;
                C108265ci ciVar = (C108265ci) this.f301280k.mo3690d(valueOf);
                ciVar.getClass();
                bcVar = ciVar.mo96720a();
                m180011w(i, bcVar);
                long j = this.f301267G;
                long j2 = bcVar.f301035q;
                if (j > j2) {
                    this.f301267G = j2;
                }
            } else if (dmVar == C108296dm.LOADING) {
                C58976aa aaVar2 = C58975e.f156826a;
                bcVar = new C108273cq((C91097g) null);
            } else {
                C58976aa aaVar3 = C58975e.f156826a;
                if (this.f301265E <= i) {
                    mo96752o(i, i + 11);
                } else {
                    mo96752o(i - 9, i + 2);
                }
                bcVar = new C108273cq((C91097g) null);
            }
            this.f301265E = i;
            return bcVar;
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("HistoryManager");
        fVar.mo85279c("isShown").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f301288s)));
        Map f = this.f301280k.mo3692f();
        fVar.mo85279c("cachedCount").mo85276a(C90752i.m148230d(Integer.valueOf(f.size())));
        if (!f.isEmpty()) {
            fVar.mo85279c("cachedMinIndex").mo85276a(C90752i.m148230d((Number) Collections.min(f.keySet())));
            fVar.mo85279c("cachedMaxIndex").mo85276a(C90752i.m148230d((Number) Collections.max(f.keySet())));
        }
        fVar.mo85286m((C90991b) this.f301271b.mo27525b());
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [com.google.protobuf.bn] */
    /* JADX WARNING: type inference failed for: r2v15, types: [com.google.protobuf.bn] */
    /* JADX WARNING: type inference failed for: r1v16, types: [com.google.protobuf.bn] */
    /* JADX WARNING: type inference failed for: r1v24, types: [com.google.protobuf.bn] */
    /* JADX WARNING: type inference failed for: r1v35, types: [com.google.protobuf.bn] */
    /* JADX WARNING: type inference failed for: r1v50, types: [com.google.protobuf.bn] */
    /* JADX WARNING: type inference failed for: r1v61, types: [com.google.protobuf.bn] */
    /* JADX WARNING: type inference failed for: r0v76, types: [com.google.protobuf.bn] */
    /* JADX WARNING: type inference failed for: r1v71, types: [com.google.protobuf.bn] */
    /* JADX WARNING: type inference failed for: r0v91, types: [com.google.protobuf.bn] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x05a7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x05a8  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x057b  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo96745h(com.google.android.apps.gsa.staticplugins.opa.chatui.C108232bc r13) {
        /*
            r12 = this;
            java.lang.Class r0 = r13.getClass()
            java.lang.Class<com.google.android.apps.gsa.staticplugins.opa.chatui.aj> r1 = com.google.android.apps.gsa.staticplugins.opa.chatui.C108212aj.class
            if (r0 != r1) goto L_0x000f
            com.google.android.apps.gsa.staticplugins.opa.chatui.aj r13 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108212aj) r13
            com.google.common.util.concurrent.cx r13 = r12.mo96744f(r13)
            return r13
        L_0x000f:
            java.lang.Class r0 = r13.getClass()
            java.lang.Class<com.google.android.apps.gsa.staticplugins.opa.chatui.je> r1 = com.google.android.apps.gsa.staticplugins.opa.chatui.C108451je.class
            r2 = 2
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L_0x006a
            r0 = r13
            com.google.android.apps.gsa.staticplugins.opa.chatui.je r0 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108451je) r0
            java.lang.String r1 = r0.mo96890c()
            if (r1 != 0) goto L_0x0026
        L_0x0023:
            r5 = r3
            goto L_0x0579
        L_0x0026:
            com.google.android.apps.gsa.staticplugins.opa.aa.ak r5 = com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak.f295754i
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.apps.gsa.staticplugins.opa.aa.h r5 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105958h) r5
            com.google.android.apps.gsa.staticplugins.opa.aa.ab r6 = com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105921ab.f295731d
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.apps.gsa.staticplugins.opa.aa.aa r6 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105920aa) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.ab r7 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105921ab) r7
            int r8 = r7.f295733a
            r8 = r8 | r4
            r7.f295733a = r8
            r7.f295734b = r1
            boolean r0 = r0.f301665g
            r6.copyOnWrite()
            com.google.protobuf.bv r1 = r6.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.ab r1 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105921ab) r1
            int r7 = r1.f295733a
            r2 = r2 | r7
            r1.f295733a = r2
            r1.f295735c = r0
            r5.copyOnWrite()
            com.google.protobuf.bv r0 = r5.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.ak r0 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak) r0
            com.google.protobuf.bv r1 = r6.build()
            com.google.android.apps.gsa.staticplugins.opa.aa.ab r1 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105921ab) r1
            r1.getClass()
            r0.f295758c = r1
            r0.f295757b = r4
            goto L_0x0579
        L_0x006a:
            java.lang.Class r0 = r13.getClass()
            java.lang.Class<com.google.android.apps.gsa.staticplugins.opa.chatui.cf> r1 = com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf.class
            r5 = 16
            r6 = 8
            if (r0 != r1) goto L_0x0116
            r0 = r13
            com.google.android.apps.gsa.staticplugins.opa.chatui.cf r0 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf) r0
            boolean r1 = r0.mo96710A()
            if (r1 != 0) goto L_0x0023
            java.lang.CharSequence r1 = r0.f301174d
            if (r1 != 0) goto L_0x0084
            goto L_0x0023
        L_0x0084:
            com.google.android.apps.gsa.staticplugins.opa.aa.j r1 = com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105960j.f295835h
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.gsa.staticplugins.opa.aa.i r1 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105959i) r1
            java.lang.CharSequence r7 = r0.f301174d
            r7.getClass()
            java.lang.String r7 = r7.toString()
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.j r8 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105960j) r8
            r7.getClass()
            int r9 = r8.f295837a
            r9 = r9 | r4
            r8.f295837a = r9
            r8.f295838b = r7
            int r7 = r0.f301047c
            r8 = 3
            if (r7 == r8) goto L_0x00ac
            goto L_0x00ad
        L_0x00ac:
            r4 = 0
        L_0x00ad:
            r1.copyOnWrite()
            com.google.protobuf.bv r7 = r1.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.j r7 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105960j) r7
            int r8 = r7.f295837a
            r8 = r8 | r2
            r7.f295837a = r8
            r7.f295839c = r4
            boolean r4 = r0.f301175e
            r1.copyOnWrite()
            com.google.protobuf.bv r7 = r1.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.j r7 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105960j) r7
            int r8 = r7.f295837a
            r5 = r5 | r8
            r7.f295837a = r5
            r7.f295842f = r4
            boolean r4 = r0.f301176f
            r1.copyOnWrite()
            com.google.protobuf.bv r5 = r1.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.j r5 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105960j) r5
            int r7 = r5.f295837a
            r7 = r7 | 32
            r5.f295837a = r7
            r5.f295843g = r4
            java.lang.String r4 = r0.f301045a
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x00f7
            java.lang.String r0 = r0.f301045a
            r0.getClass()
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.j r4 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105960j) r4
            int r5 = r4.f295837a
            r5 = r5 | r6
            r4.f295837a = r5
            r4.f295841e = r0
        L_0x00f7:
            com.google.android.apps.gsa.staticplugins.opa.aa.ak r0 = com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak.f295754i
            com.google.protobuf.bn r0 = r0.createBuilder()
            r5 = r0
            com.google.android.apps.gsa.staticplugins.opa.aa.h r5 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105958h) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r0 = r5.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.ak r0 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak) r0
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.apps.gsa.staticplugins.opa.aa.j r1 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105960j) r1
            r1.getClass()
            r0.f295758c = r1
            r0.f295757b = r2
            goto L_0x0579
        L_0x0116:
            java.lang.Class r0 = r13.getClass()
            java.lang.Class<com.google.android.apps.gsa.staticplugins.opa.chatui.hs> r1 = com.google.android.apps.gsa.staticplugins.opa.chatui.C108411hs.class
            if (r0 != r1) goto L_0x015c
            r0 = r13
            com.google.android.apps.gsa.staticplugins.opa.chatui.hs r0 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108411hs) r0
            com.google.android.apps.gsa.staticplugins.opa.aa.ak r1 = com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak.f295754i
            com.google.protobuf.bn r1 = r1.createBuilder()
            r5 = r1
            com.google.android.apps.gsa.staticplugins.opa.aa.h r5 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105958h) r5
            com.google.android.apps.gsa.staticplugins.opa.aa.v r1 = com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105972v.f295868c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.gsa.staticplugins.opa.aa.u r1 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105971u) r1
            java.lang.String r0 = r0.f301527d
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.v r2 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105972v) r2
            r0.getClass()
            int r6 = r2.f295870a
            r4 = r4 | r6
            r2.f295870a = r4
            r2.f295871b = r0
            r5.copyOnWrite()
            com.google.protobuf.bv r0 = r5.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.ak r0 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak) r0
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.apps.gsa.staticplugins.opa.aa.v r1 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105972v) r1
            r1.getClass()
            r0.f295758c = r1
            r1 = 5
            r0.f295757b = r1
            goto L_0x0579
        L_0x015c:
            java.lang.Class r0 = r13.getClass()
            java.lang.Class<com.google.android.apps.gsa.staticplugins.opa.chatui.ht> r1 = com.google.android.apps.gsa.staticplugins.opa.chatui.C108412ht.class
            if (r0 != r1) goto L_0x025c
            r0 = r13
            com.google.android.apps.gsa.staticplugins.opa.chatui.ht r0 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108412ht) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.google.android.apps.gsa.staticplugins.opa.chatui.id r0 = r0.f301530b
            java.util.List r0 = r0.f301554a
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x0178:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x021a
            java.lang.Object r5 = r0.next()
            com.google.android.apps.gsa.staticplugins.opa.chatui.ik r5 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108430ik) r5
            com.google.android.apps.gsa.staticplugins.opa.aa.y r7 = com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105975y.f295872f
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.apps.gsa.staticplugins.opa.aa.x r7 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105974x) r7
            boolean r8 = r5 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108249bt
            if (r8 != 0) goto L_0x0178
            boolean r8 = r5 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108229b
            if (r8 == 0) goto L_0x01e2
            r8 = r5
            com.google.android.apps.gsa.staticplugins.opa.chatui.b r8 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108229b) r8
            java.lang.String r9 = r8.mo96708f()
            r7.copyOnWrite()
            com.google.protobuf.bv r10 = r7.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.y r10 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105975y) r10
            r9.getClass()
            int r11 = r10.f295874a
            r11 = r11 | r4
            r10.f295874a = r11
            r10.f295875b = r9
            android.content.Intent r9 = r8.mo96600a()
            java.lang.String r9 = r9.toUri(r4)
            r7.copyOnWrite()
            com.google.protobuf.bv r10 = r7.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.y r10 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105975y) r10
            r9.getClass()
            int r11 = r10.f295874a
            r11 = r11 | 4
            r10.f295874a = r11
            r10.f295877d = r9
            java.lang.String r9 = r8.mo96697b()
            if (r9 == 0) goto L_0x01f7
            java.lang.String r8 = r8.mo96697b()
            r8.getClass()
            r7.copyOnWrite()
            com.google.protobuf.bv r9 = r7.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.y r9 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105975y) r9
            int r10 = r9.f295874a
            r10 = r10 | r2
            r9.f295874a = r10
            r9.f295876c = r8
            goto L_0x01f7
        L_0x01e2:
            java.lang.String r8 = r5.mo96708f()
            r7.copyOnWrite()
            com.google.protobuf.bv r9 = r7.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.y r9 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105975y) r9
            r8.getClass()
            int r10 = r9.f295874a
            r10 = r10 | r4
            r9.f295874a = r10
            r9.f295875b = r8
        L_0x01f7:
            com.google.android.libraries.logging.j r5 = r5.f301597d
            com.google.common.o.l.m r5 = r5.f76973a
            com.google.protobuf.bv r5 = r5.instance
            com.google.common.o.l.n r5 = (com.google.common.p4552o.p4566l.C60214n) r5
            int r5 = r5.f162918c
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.y r8 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105975y) r8
            int r9 = r8.f295874a
            r9 = r9 | r6
            r8.f295874a = r9
            r8.f295878e = r5
            com.google.protobuf.bv r5 = r7.build()
            com.google.android.apps.gsa.staticplugins.opa.aa.y r5 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105975y) r5
            r1.add(r5)
            goto L_0x0178
        L_0x021a:
            com.google.android.apps.gsa.staticplugins.opa.aa.ak r0 = com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak.f295754i
            com.google.protobuf.bn r0 = r0.createBuilder()
            r5 = r0
            com.google.android.apps.gsa.staticplugins.opa.aa.h r5 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105958h) r5
            com.google.android.apps.gsa.staticplugins.opa.aa.z r0 = com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105976z.f295879b
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.gsa.staticplugins.opa.aa.w r0 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105973w) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.z r2 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105976z) r2
            com.google.protobuf.cq r4 = r2.f295881a
            boolean r6 = r4.mo58948c()
            if (r6 != 0) goto L_0x0240
            com.google.protobuf.cq r4 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r4)
            r2.f295881a = r4
        L_0x0240:
            com.google.protobuf.cq r2 = r2.f295881a
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r1, (java.util.List) r2)
            r5.copyOnWrite()
            com.google.protobuf.bv r1 = r5.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.ak r1 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak) r1
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.apps.gsa.staticplugins.opa.aa.z r0 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105976z) r0
            r0.getClass()
            r1.f295758c = r0
            r0 = 7
            r1.f295757b = r0
            goto L_0x0579
        L_0x025c:
            java.lang.Class r0 = r13.getClass()
            java.lang.Class<com.google.android.apps.gsa.staticplugins.opa.chatui.ab> r1 = com.google.android.apps.gsa.staticplugins.opa.chatui.C108204ab.class
            if (r0 != r1) goto L_0x02b8
            r0 = r13
            com.google.android.apps.gsa.staticplugins.opa.chatui.ab r0 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108204ab) r0
            java.lang.CharSequence r1 = r0.f300964b
            if (r1 == 0) goto L_0x0023
            java.lang.String r1 = r1.toString()
            boolean r1 = com.google.common.base.C58837ba.m90859h(r1)
            if (r1 == 0) goto L_0x0277
            goto L_0x0023
        L_0x0277:
            com.google.android.apps.gsa.staticplugins.opa.aa.ak r1 = com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak.f295754i
            com.google.protobuf.bn r1 = r1.createBuilder()
            r5 = r1
            com.google.android.apps.gsa.staticplugins.opa.aa.h r5 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105958h) r5
            com.google.android.apps.gsa.staticplugins.opa.aa.g r1 = com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105957g.f295831c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.gsa.staticplugins.opa.aa.f r1 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105956f) r1
            java.lang.CharSequence r0 = r0.f300964b
            r0.getClass()
            java.lang.String r0 = r0.toString()
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.g r2 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105957g) r2
            r0.getClass()
            int r7 = r2.f295833a
            r4 = r4 | r7
            r2.f295833a = r4
            r2.f295834b = r0
            r5.copyOnWrite()
            com.google.protobuf.bv r0 = r5.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.ak r0 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak) r0
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.apps.gsa.staticplugins.opa.aa.g r1 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105957g) r1
            r1.getClass()
            r0.f295758c = r1
            r0.f295757b = r6
            goto L_0x0579
        L_0x02b8:
            java.lang.Class r0 = r13.getClass()
            java.lang.Class<com.google.android.apps.gsa.staticplugins.opa.chatui.dx> r1 = com.google.android.apps.gsa.staticplugins.opa.chatui.C108307dx.class
            if (r0 != r1) goto L_0x0307
            r0 = r13
            com.google.android.apps.gsa.staticplugins.opa.chatui.dx r0 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108307dx) r0
            java.lang.String r0 = r0.f301299b
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x02cd
            goto L_0x0023
        L_0x02cd:
            com.google.android.apps.gsa.staticplugins.opa.aa.ak r1 = com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak.f295754i
            com.google.protobuf.bn r1 = r1.createBuilder()
            r5 = r1
            com.google.android.apps.gsa.staticplugins.opa.aa.h r5 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105958h) r5
            com.google.android.apps.gsa.staticplugins.opa.aa.n r1 = com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105964n.f295849c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.gsa.staticplugins.opa.aa.m r1 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105963m) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.n r2 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105964n) r2
            r0.getClass()
            int r6 = r2.f295851a
            r4 = r4 | r6
            r2.f295851a = r4
            r2.f295852b = r0
            r5.copyOnWrite()
            com.google.protobuf.bv r0 = r5.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.ak r0 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak) r0
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.apps.gsa.staticplugins.opa.aa.n r1 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105964n) r1
            r1.getClass()
            r0.f295758c = r1
            r1 = 13
            r0.f295757b = r1
            goto L_0x0579
        L_0x0307:
            java.lang.Class r0 = r13.getClass()
            java.lang.Class<com.google.android.apps.gsa.staticplugins.opa.chatui.co> r1 = com.google.android.apps.gsa.staticplugins.opa.chatui.C108271co.class
            if (r0 != r1) goto L_0x0368
            r0 = r13
            com.google.android.apps.gsa.staticplugins.opa.chatui.co r0 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108271co) r0
            java.lang.String r1 = r0.f301218a
            java.lang.String r0 = r0.f301219b
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 == 0) goto L_0x031e
            goto L_0x0023
        L_0x031e:
            com.google.android.apps.gsa.staticplugins.opa.aa.ak r5 = com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak.f295754i
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.apps.gsa.staticplugins.opa.aa.h r5 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105958h) r5
            com.google.android.apps.gsa.staticplugins.opa.aa.l r6 = com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105962l.f295844d
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.apps.gsa.staticplugins.opa.aa.k r6 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105961k) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.l r7 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105962l) r7
            r1.getClass()
            int r8 = r7.f295846a
            r4 = r4 | r8
            r7.f295846a = r4
            r7.f295847b = r1
            r6.copyOnWrite()
            com.google.protobuf.bv r1 = r6.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.l r1 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105962l) r1
            r0.getClass()
            int r4 = r1.f295846a
            r2 = r2 | r4
            r1.f295846a = r2
            r1.f295848c = r0
            r5.copyOnWrite()
            com.google.protobuf.bv r0 = r5.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.ak r0 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak) r0
            com.google.protobuf.bv r1 = r6.build()
            com.google.android.apps.gsa.staticplugins.opa.aa.l r1 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105962l) r1
            r1.getClass()
            r0.f295758c = r1
            r1 = 15
            r0.f295757b = r1
            goto L_0x0579
        L_0x0368:
            java.lang.Class r0 = r13.getClass()
            java.lang.Class<com.google.android.apps.gsa.staticplugins.opa.chatui.jk> r1 = com.google.android.apps.gsa.staticplugins.opa.chatui.C108457jk.class
            if (r0 != r1) goto L_0x03af
            r0 = r13
            com.google.android.apps.gsa.staticplugins.opa.chatui.jk r0 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108457jk) r0
            com.google.android.apps.gsa.staticplugins.opa.aa.ak r1 = com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak.f295754i
            com.google.protobuf.bn r1 = r1.createBuilder()
            r5 = r1
            com.google.android.apps.gsa.staticplugins.opa.aa.h r5 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105958h) r5
            com.google.android.apps.gsa.staticplugins.opa.aa.af r1 = com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105925af.f295741c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.gsa.staticplugins.opa.aa.ae r1 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105924ae) r1
            com.google.android.apps.gsa.assistant.shared.l.g r0 = r0.f301683a
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.af r2 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105925af) r2
            r0.getClass()
            r2.f295744b = r0
            int r0 = r2.f295743a
            r0 = r0 | r4
            r2.f295743a = r0
            r5.copyOnWrite()
            com.google.protobuf.bv r0 = r5.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.ak r0 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak) r0
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.apps.gsa.staticplugins.opa.aa.af r1 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105925af) r1
            r1.getClass()
            r0.f295758c = r1
            r1 = 18
            r0.f295757b = r1
            goto L_0x0579
        L_0x03af:
            boolean r0 = r13 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108341fc
            if (r0 == 0) goto L_0x0417
            r0 = r13
            com.google.android.apps.gsa.staticplugins.opa.chatui.fc r0 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108341fc) r0
            com.google.android.apps.gsa.staticplugins.opa.aa.ak r1 = com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak.f295754i
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.gsa.staticplugins.opa.aa.h r1 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105958h) r1
            com.google.android.apps.gsa.staticplugins.opa.aa.p r6 = com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105966p.f295853e
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.apps.gsa.staticplugins.opa.aa.o r6 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105965o) r6
            java.lang.String r7 = r0.f301369a
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.p r8 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105966p) r8
            r7.getClass()
            int r9 = r8.f295855a
            r4 = r4 | r9
            r8.f295855a = r4
            r8.f295856b = r7
            java.lang.String r4 = r0.f301370b
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.p r7 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105966p) r7
            r4.getClass()
            int r8 = r7.f295855a
            r2 = r2 | r8
            r7.f295855a = r2
            r7.f295857c = r4
            java.lang.String r0 = r0.f301371c
            r6.copyOnWrite()
            com.google.protobuf.bv r2 = r6.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.p r2 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105966p) r2
            r0.getClass()
            int r4 = r2.f295855a
            r4 = r4 | 4
            r2.f295855a = r4
            r2.f295858d = r0
            r1.copyOnWrite()
            com.google.protobuf.bv r0 = r1.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.ak r0 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak) r0
            com.google.protobuf.bv r2 = r6.build()
            com.google.android.apps.gsa.staticplugins.opa.aa.p r2 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105966p) r2
            r2.getClass()
            r0.f295758c = r2
            r0.f295757b = r5
            r5 = r1
            goto L_0x0579
        L_0x0417:
            boolean r0 = r13 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108343fe
            if (r0 == 0) goto L_0x0457
            r0 = r13
            com.google.android.apps.gsa.staticplugins.opa.chatui.fe r0 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108343fe) r0
            boolean r0 = r0.f301376a
            com.google.android.apps.gsa.staticplugins.opa.aa.ak r1 = com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak.f295754i
            com.google.protobuf.bn r1 = r1.createBuilder()
            r5 = r1
            com.google.android.apps.gsa.staticplugins.opa.aa.h r5 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105958h) r5
            com.google.android.apps.gsa.staticplugins.opa.aa.r r1 = com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105968r.f295859c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.gsa.staticplugins.opa.aa.q r1 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105967q) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.r r2 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105968r) r2
            int r6 = r2.f295861a
            r4 = r4 | r6
            r2.f295861a = r4
            r2.f295862b = r0
            r5.copyOnWrite()
            com.google.protobuf.bv r0 = r5.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.ak r0 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak) r0
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.apps.gsa.staticplugins.opa.aa.r r1 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105968r) r1
            r1.getClass()
            r0.f295758c = r1
            r1 = 17
            r0.f295757b = r1
            goto L_0x0579
        L_0x0457:
            boolean r0 = r13 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108474ka
            r1 = 21
            if (r0 == 0) goto L_0x053a
            r0 = r13
            com.google.android.apps.gsa.staticplugins.opa.chatui.ka r0 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108474ka) r0
            com.google.android.apps.gsa.staticplugins.opa.s.b.c r2 = r0.f301719c
            if (r2 == 0) goto L_0x04f0
            com.google.at.h.b.a.r r2 = r0.f301718b
            com.google.protobuf.bt r5 = com.google.p4017at.p4060h.p4068b.p4069a.C54192i.f142222b
            com.google.protobuf.bt r5 = com.google.protobuf.C62942bv.checkIsLite(r5)
            r2.mo58887l(r5)
            com.google.protobuf.bf r2 = r2.f169962ag
            com.google.protobuf.bs r6 = r5.f169971d
            java.lang.Object r2 = r2.mo58854l(r6)
            if (r2 != 0) goto L_0x047c
            java.lang.Object r2 = r5.f169969b
            goto L_0x0480
        L_0x047c:
            java.lang.Object r2 = r5.mo58889c(r2)
        L_0x0480:
            com.google.bv.j.b.a.p r2 = (com.google.p4283bv.p4380j.p4385b.p4386a.C57784p) r2
            com.google.bv.j.b.a.h r2 = r2.f154387d
            if (r2 != 0) goto L_0x0488
            com.google.bv.j.b.a.h r2 = com.google.p4283bv.p4380j.p4385b.p4386a.C57776h.f154365b
        L_0x0488:
            com.google.protobuf.cq r2 = r2.f154367a
            java.util.Iterator r2 = r2.iterator()
        L_0x048e:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x04b4
            java.lang.Object r5 = r2.next()
            com.google.bv.j.b.a.j r5 = (com.google.p4283bv.p4380j.p4385b.p4386a.C57778j) r5
            com.google.bv.j.b.a.l r5 = r5.f154373c
            if (r5 != 0) goto L_0x04a0
            com.google.bv.j.b.a.l r5 = com.google.p4283bv.p4380j.p4385b.p4386a.C57780l.f154376c
        L_0x04a0:
            com.google.protobuf.bt r6 = com.google.p4283bv.p4380j.p4385b.p4386a.p4410d.C57772o.f154360b
            com.google.protobuf.bt r6 = com.google.protobuf.C62942bv.checkIsLite(r6)
            r5.mo58887l(r6)
            com.google.protobuf.bf r5 = r5.f169962ag
            com.google.protobuf.bs r6 = r6.f169971d
            boolean r5 = r5.mo58857o(r6)
            if (r5 != 0) goto L_0x048e
            goto L_0x04f0
        L_0x04b4:
            com.google.android.apps.gsa.staticplugins.opa.aa.ak r1 = com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak.f295754i
            com.google.protobuf.bn r1 = r1.createBuilder()
            r5 = r1
            com.google.android.apps.gsa.staticplugins.opa.aa.h r5 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105958h) r5
            com.google.android.apps.gsa.staticplugins.opa.aa.ah r1 = com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105927ah.f295745c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.gsa.staticplugins.opa.aa.ag r1 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105926ag) r1
            com.google.at.h.b.a.r r0 = r0.f301718b
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.ah r2 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105927ah) r2
            r0.getClass()
            r2.f295748b = r0
            int r0 = r2.f295747a
            r0 = r0 | r4
            r2.f295747a = r0
            r5.copyOnWrite()
            com.google.protobuf.bv r0 = r5.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.ak r0 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak) r0
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.apps.gsa.staticplugins.opa.aa.ah r1 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105927ah) r1
            r1.getClass()
            r0.f295758c = r1
            r1 = 19
            r0.f295757b = r1
            goto L_0x0579
        L_0x04f0:
            com.google.common.base.ax r0 = r0.f301717a
            boolean r2 = r0.mo56113h()
            if (r2 == 0) goto L_0x0501
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.shared.search.Query r0 = (com.google.android.apps.gsa.shared.search.Query) r0
            java.lang.String r0 = r0.f252770i
            goto L_0x0503
        L_0x0501:
            java.lang.String r0 = ""
        L_0x0503:
            com.google.android.apps.gsa.staticplugins.opa.aa.ak r2 = com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak.f295754i
            com.google.protobuf.bn r2 = r2.createBuilder()
            r5 = r2
            com.google.android.apps.gsa.staticplugins.opa.aa.h r5 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105958h) r5
            com.google.android.apps.gsa.staticplugins.opa.aa.aj r2 = com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105929aj.f295750c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.apps.gsa.staticplugins.opa.aa.ai r2 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105928ai) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.aj r6 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105929aj) r6
            r0.getClass()
            int r7 = r6.f295752a
            r4 = r4 | r7
            r6.f295752a = r4
            r6.f295753b = r0
            r5.copyOnWrite()
            com.google.protobuf.bv r0 = r5.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.ak r0 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak) r0
            com.google.protobuf.bv r2 = r2.build()
            com.google.android.apps.gsa.staticplugins.opa.aa.aj r2 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105929aj) r2
            r2.getClass()
            r0.f295758c = r2
            r0.f295757b = r1
            goto L_0x0579
        L_0x053a:
            boolean r0 = r13 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108476kc
            if (r0 == 0) goto L_0x0023
            r0 = r13
            com.google.android.apps.gsa.staticplugins.opa.chatui.kc r0 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108476kc) r0
            com.google.android.apps.gsa.staticplugins.opa.aa.ak r2 = com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak.f295754i
            com.google.protobuf.bn r2 = r2.createBuilder()
            r5 = r2
            com.google.android.apps.gsa.staticplugins.opa.aa.h r5 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105958h) r5
            com.google.android.apps.gsa.staticplugins.opa.aa.aj r2 = com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105929aj.f295750c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.apps.gsa.staticplugins.opa.aa.ai r2 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105928ai) r2
            java.lang.String r0 = r0.f301728c
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.aj r6 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105929aj) r6
            r0.getClass()
            int r7 = r6.f295752a
            r4 = r4 | r7
            r6.f295752a = r4
            r6.f295753b = r0
            r5.copyOnWrite()
            com.google.protobuf.bv r0 = r5.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.ak r0 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak) r0
            com.google.protobuf.bv r2 = r2.build()
            com.google.android.apps.gsa.staticplugins.opa.aa.aj r2 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105929aj) r2
            r2.getClass()
            r0.f295758c = r2
            r0.f295757b = r1
        L_0x0579:
            if (r5 == 0) goto L_0x05a5
            java.lang.String r0 = r13.f301028j
            if (r0 == 0) goto L_0x0591
            r5.copyOnWrite()
            com.google.protobuf.bv r1 = r5.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.ak r1 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak) r1
            com.google.android.apps.gsa.staticplugins.opa.aa.ak r2 = com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak.f295754i
            int r2 = r1.f295756a
            r4 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 | r4
            r1.f295756a = r2
            r1.f295762g = r0
        L_0x0591:
            boolean r13 = r13.f301032n
            r5.copyOnWrite()
            com.google.protobuf.bv r0 = r5.instance
            com.google.android.apps.gsa.staticplugins.opa.aa.ak r0 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak) r0
            com.google.android.apps.gsa.staticplugins.opa.aa.ak r1 = com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak.f295754i
            int r1 = r0.f295756a
            r2 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 | r2
            r0.f295756a = r1
            r0.f295763h = r13
        L_0x05a5:
            if (r5 != 0) goto L_0x05a8
            return r3
        L_0x05a8:
            com.google.common.util.concurrent.cx r13 = com.google.common.util.concurrent.C60856cj.m92900i(r5)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.chatui.C108303dt.mo96745h(com.google.android.apps.gsa.staticplugins.opa.chatui.bc):com.google.common.util.concurrent.cx");
    }

    /* renamed from: i */
    public final String mo96746i() {
        return "opa_last_history_item_event_id_".concat(String.valueOf(this.f301290u));
    }

    /* renamed from: j */
    public final String mo96747j() {
        return "opa_last_history_item_timestamp_".concat(String.valueOf(this.f301290u));
    }

    /* renamed from: k */
    public final void mo96748k(C108212aj ajVar, C108204ab abVar) {
        C22872h.m42743c(C0826b.class);
        mo96741b();
        if (ajVar == null) {
            this.f301282m = null;
        } else {
            ArrayList arrayList = new ArrayList(2);
            this.f301282m = arrayList;
            arrayList.add(ajVar);
            this.f301282m.add(abVar);
        }
        C108297dn dnVar = this.f301284o;
        if (dnVar != null) {
            mo96741b();
            dnVar.mo96729b();
        }
        if (ajVar == null || ajVar.f300979e == null) {
            ((C105952bf) this.f301271b.mo27525b()).mo95196j((C105930ak) null);
            return;
        }
        C105958h hVar = (C105958h) C105930ak.f295754i.createBuilder();
        C105922ac acVar = (C105922ac) C105923ad.f295736c.createBuilder();
        C54201r rVar = ajVar.f300979e;
        rVar.getClass();
        acVar.copyOnWrite();
        C105923ad adVar = (C105923ad) acVar.instance;
        adVar.f295739b = rVar;
        adVar.f295738a |= 1;
        hVar.copyOnWrite();
        C105930ak akVar = (C105930ak) hVar.instance;
        C105923ad adVar2 = (C105923ad) acVar.build();
        adVar2.getClass();
        akVar.f295758c = adVar2;
        akVar.f295757b = 14;
        ((C105952bf) this.f301271b.mo27525b()).mo95196j((C105930ak) hVar.build());
    }

    /* renamed from: l */
    public final void mo96749l() {
        if (this.f301291v == 0) {
            this.f301280k.mo3694h(-1);
            C105952bf bfVar = (C105952bf) this.f301271b.mo27525b();
            bfVar.f295807c.mo28212l("HistoryStore:Close", new C105932am(bfVar));
            this.f301268H = false;
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        this.f301268H = true;
    }

    /* renamed from: m */
    public final void mo96750m(List list, boolean z) {
        if (this.f301276g.mo79746e(C90063do.f249375cO)) {
            C90875ai.m148465b(C108282cz.f301235a, this.f301269I.mo76939n(i.b), this.f301295z, "TapasModels purge has finished").mo85223a(C108284da.f301237a);
            C90875ai.m148465b(C108285db.f301238a, this.f301269I.mo76941p(m.b), this.f301295z, "TapasTrainingBuffers purge has finished").mo85223a(C108286dc.f301239a);
        }
        if (this.f301270J.mo56113h()) {
            C86124t tVar = this.f301276g;
            if (tVar.mo79746e(C90063do.f249600gb) && tVar.mo79746e(C90063do.f249463dx)) {
                ((C113050ay) ((C68214a) this.f301270J.mo56107c()).mo27525b()).mo99827d();
            }
        }
        this.f301279j.addAll(list);
        C105952bf bfVar = (C105952bf) this.f301271b.mo27525b();
        bfVar.f295807c.mo28209i(bfVar.mo95190c(), "HistoryStore:Delete", new C105933an(bfVar, list, z));
        if (list.contains(this.f301273d.getString(mo96746i(), (String) null))) {
            C86337q b = this.f301273d.mo80076b();
            b.mo80075j(mo96746i());
            b.mo80075j(mo96747j());
            b.apply();
        }
    }

    /* renamed from: n */
    public final void mo96751n() {
        if (this.f301289t == C108296dm.LOADING) {
            this.f301289t = C108296dm.READY;
            mo96755r();
        }
    }

    /* renamed from: o */
    public final void mo96752o(int i, int i2) {
        int max = Math.max(0, i);
        int min = Math.min(i2, ((C105952bf) this.f301271b.mo27525b()).f295816l);
        if (max >= min) {
            C58976aa aaVar = C58975e.f156826a;
            mo96751n();
            return;
        }
        this.f301275f.mo26870b();
        for (int i3 = max; i3 < min; i3++) {
            this.f301281l.put(Integer.valueOf(i3), C108296dm.LOADING);
        }
        C105952bf bfVar = (C105952bf) this.f301271b.mo27525b();
        new C90873ag(bfVar.f295807c.mo28201a("HistoryStore:BatchRead", new C105935ap(bfVar, max, min)), this.f301272c, "HistoryManager:BatchLoad", new C108288de(this, max, min)).mo85223a(new C108289df(this, max, min));
    }

    /* renamed from: p */
    public final void mo96753p() {
        synchronized (this.f301264D) {
            if (this.f301264D.isEmpty()) {
                C58976aa aaVar = C58975e.f156826a;
                return;
            }
            C60321oe i = C28285c.m52882i(this.f301283n, 1, (Integer) null);
            if (i == null) {
                C58976aa aaVar2 = C58975e.f156826a;
                return;
            }
            C60321oe b = C28285c.m52875b(C28293k.m52907d(this.f301262B, this.f301264D), 472);
            if (b == null) {
                C58976aa aaVar3 = C58975e.f156826a;
                return;
            }
            C58976aa aaVar4 = C58975e.f156826a;
            this.f301264D.size();
            this.f301264D.clear();
            C113863cr crVar = this.f301261A;
            C60320od odVar = (C60320od) b.toBuilder();
            odVar.copyOnWrite();
            C60321oe oeVar = (C60321oe) odVar.instance;
            oeVar.f163231f = 3;
            oeVar.f163226a |= 32;
            C60218r rVar = i.f163229d;
            if (rVar == null) {
                rVar = C60218r.f162925d;
            }
            odVar.copyOnWrite();
            C60321oe oeVar2 = (C60321oe) odVar.instance;
            rVar.getClass();
            oeVar2.f163229d = rVar;
            oeVar2.f163226a |= 2;
            aqm aqm = i.f163230e;
            if (aqm == null) {
                aqm = aqm.f159760n;
            }
            odVar.copyOnWrite();
            C60321oe oeVar3 = (C60321oe) odVar.instance;
            aqm.getClass();
            oeVar3.f163230e = aqm;
            oeVar3.f163226a |= 16;
            crVar.mo100721a(0, 0, (C60321oe) odVar.build());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        return;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo96754q(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f301287r     // Catch:{ all -> 0x002d }
            if (r0 <= 0) goto L_0x002b
            if (r0 == r3) goto L_0x002b
            androidx.c.m r0 = r2.f301280k     // Catch:{ all -> 0x002d }
            r1 = -1
            r0.mo3694h(r1)     // Catch:{ all -> 0x002d }
            r2.mo96741b()     // Catch:{ all -> 0x002d }
            r2.f301287r = r3     // Catch:{ all -> 0x002d }
            r2.mo96741b()     // Catch:{ all -> 0x002d }
            com.google.android.apps.gsa.staticplugins.opa.chatui.dn r3 = r2.f301284o     // Catch:{ all -> 0x002d }
            if (r3 == 0) goto L_0x002b
            com.google.android.libraries.f.a r3 = r2.f301275f     // Catch:{ all -> 0x002d }
            long r0 = r3.mo26870b()     // Catch:{ all -> 0x002d }
            r2.f301267G = r0     // Catch:{ all -> 0x002d }
            com.google.android.apps.gsa.staticplugins.opa.chatui.dn r3 = r2.f301284o     // Catch:{ all -> 0x002d }
            r3.getClass()
            r3.mo96729b()     // Catch:{ all -> 0x002d }
            monitor-exit(r2)
            return
        L_0x002b:
            monitor-exit(r2)
            return
        L_0x002d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.chatui.C108303dt.mo96754q(int):void");
    }

    /* renamed from: r */
    public final void mo96755r() {
        C108298do doVar;
        C108302ds dsVar;
        C108267ck ckVar;
        ArrayList arrayList;
        C108430ik ikVar;
        if (this.f301289t == C108296dm.READY && (doVar = this.f301285p) != null) {
            this.f301288s = true;
            C105930ak akVar = ((C105952bf) this.f301271b.mo27525b()).f295817m;
            if (akVar == null || akVar.f295757b != 7 || (ckVar = this.f301292w) == null) {
                dsVar = new C108486u().mo96737a();
            } else {
                C105976z zVar = (C105976z) akVar.f295758c;
                if (zVar.f295881a.size() == 0) {
                    arrayList = new ArrayList();
                } else {
                    ArrayList arrayList2 = new ArrayList(zVar.f295881a.size());
                    for (C105975y yVar : zVar.f295881a) {
                        if ((yVar.f295874a & 4) != 0) {
                            Intent x = C87566i.m142325x(yVar.f295877d);
                            ikVar = new C108243bn(yVar.f295878e, yVar.f295875b, yVar.f295876c, x);
                        } else {
                            ikVar = new C108390gy(yVar.f295878e, yVar.f295875b, (String) null);
                        }
                        ckVar.f301190e.mo96874d(ikVar);
                        arrayList2.add(ikVar);
                    }
                    arrayList = arrayList2;
                }
                C108486u uVar = new C108486u();
                uVar.f301851a = C58485gu.m89842j(arrayList);
                uVar.f301852b = akVar.f295760e;
                dsVar = uVar.mo96737a();
            }
            doVar.mo96730a(dsVar);
            this.f301285p = null;
        }
    }

    /* renamed from: s */
    public final void mo96756s() {
        int i = this.f301291v - 1;
        this.f301291v = i;
        if (i == 0 && this.f301268H) {
            C58976aa aaVar = C58975e.f156826a;
            mo96749l();
        }
    }

    /* renamed from: t */
    public final void mo96757t(long j) {
        C86337q b = this.f301273d.mo80076b();
        b.mo80072g(m180010v(), this.f301275f.mo26870b() + j);
        b.apply();
    }

    /* renamed from: u */
    public final void mo96758u(String[] strArr) {
        mo96750m(Arrays.asList(strArr), true);
    }

    /* renamed from: f */
    public final C60870cx mo96744f(C108212aj ajVar) {
        C60870cx cxVar;
        C54201r rVar = ajVar.f300979e;
        if (rVar != null) {
            C105954d dVar = (C105954d) C105955e.f295825d.createBuilder();
            dVar.copyOnWrite();
            C105955e eVar = (C105955e) dVar.instance;
            eVar.f295828b = rVar;
            eVar.f295827a |= 1;
            C51205t tVar = ajVar.f300981g;
            if (tVar != null) {
                dVar.copyOnWrite();
                C105955e eVar2 = (C105955e) dVar.instance;
                eVar2.f295829c = tVar;
                eVar2.f295827a |= 2;
            }
            C105958h hVar = (C105958h) C105930ak.f295754i.createBuilder();
            hVar.copyOnWrite();
            C105930ak akVar = (C105930ak) hVar.instance;
            C105955e eVar3 = (C105955e) dVar.build();
            eVar3.getClass();
            akVar.f295758c = eVar3;
            akVar.f295757b = 3;
            String str = ajVar.f301028j;
            if (str != null) {
                hVar.copyOnWrite();
                C105930ak akVar2 = (C105930ak) hVar.instance;
                akVar2.f295756a |= 524288;
                akVar2.f295762g = str;
            }
            return C60856cj.m92900i(hVar);
        }
        int i = ajVar.f300977c;
        C60870cx cxVar2 = null;
        if (i == 1) {
            String string = this.f301274e.getResources().getString(R.string.history_action_card_title_default);
            c createBuilder = f.d.createBuilder();
            a createBuilder2 = b.f.createBuilder();
            createBuilder2.copyOnWrite();
            b bVar = createBuilder2.instance;
            string.getClass();
            bVar.a |= 1;
            bVar.b = string;
            createBuilder.copyOnWrite();
            f fVar = createBuilder.instance;
            b build = createBuilder2.build();
            build.getClass();
            fVar.b = build;
            fVar.a = 1 | fVar.a;
            f build2 = createBuilder.build();
            View view = ajVar.f300976b;
            if (view instanceof C73867g) {
                try {
                    cxVar2 = ((C73867g) view).mo65343a(this.f301294y);
                } catch (RuntimeException e) {
                    C59104x c = f301260a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "HistoryManager");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(23970)).mo56386p("RuntimeException in ActionCardView#getActionCardHistoryProto");
                }
                if (cxVar2 != null) {
                    C90886at.m148485b(cxVar2, (long) ((int) this.f301276g.mo79743a(C90014bt.f247347fT)), this.f301294y);
                    cxVar = C60846c.m92878g(cxVar2, Exception.class, new C108275cs(build2), C60826bg.f164896a);
                    return this.f301295z.mo28209i(cxVar, "Add ActionCard to HistoryEntry", new C108281cy(ajVar));
                }
            }
            cxVar = C60856cj.m92900i(build2);
            return this.f301295z.mo28209i(cxVar, "Add ActionCard to HistoryEntry", new C108281cy(ajVar));
        }
        if (i == 8) {
            C58976aa aaVar = C58975e.f156826a;
            C51953ff ffVar = ajVar.f300980f;
            if (ffVar != null && ffVar.f136322f) {
                C105958h hVar2 = (C105958h) C105930ak.f295754i.createBuilder();
                C105969s sVar = (C105969s) C105970t.f295863c.createBuilder();
                sVar.copyOnWrite();
                C105970t tVar2 = (C105970t) sVar.instance;
                tVar2.f295866b = ffVar;
                tVar2.f295865a |= 1;
                hVar2.copyOnWrite();
                C105930ak akVar3 = (C105930ak) hVar2.instance;
                C105970t tVar3 = (C105970t) sVar.build();
                tVar3.getClass();
                akVar3.f295758c = tVar3;
                akVar3.f295757b = 20;
                return C60856cj.m92900i(hVar2);
            }
        }
        return null;
    }
}
