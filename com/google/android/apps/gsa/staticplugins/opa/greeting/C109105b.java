package com.google.android.apps.gsa.staticplugins.opa.greeting;

import android.animation.Animator;
import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.C108779dm;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108230ba;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108423id;
import com.google.android.apps.gsa.staticplugins.opa.p8205am.C106391p;
import com.google.android.apps.gsa.staticplugins.opa.p8375l.C109399b;
import com.google.android.apps.gsa.staticplugins.opa.p8375l.C109405d;
import com.google.android.apps.gsa.staticplugins.opa.p8375l.C109406e;
import com.google.android.apps.gsa.staticplugins.opa.p8375l.C109407f;
import com.google.android.apps.gsa.staticplugins.opa.p8375l.C109422u;
import com.google.android.apps.gsa.staticplugins.opa.p8375l.C109425x;
import com.google.android.apps.gsa.staticplugins.opa.util.C113805bu;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8599d.C114034q;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.greeting.b */
/* compiled from: PG */
public final class C109105b {

    /* renamed from: a */
    public final C108230ba f303824a;

    /* renamed from: b */
    public final Context f303825b;

    /* renamed from: c */
    public final C22871g f303826c;

    /* renamed from: d */
    public final C86124t f303827d;

    /* renamed from: e */
    public final C68214a f303828e;

    /* renamed from: f */
    public C60870cx f303829f;

    /* renamed from: g */
    public C109100ar f303830g;

    /* renamed from: h */
    public C22869e f303831h;

    /* renamed from: i */
    final Optional f303832i;

    /* renamed from: j */
    public C113984c f303833j = C113984c.UNKNOWN;

    /* renamed from: k */
    public boolean f303834k = false;

    /* renamed from: l */
    public boolean f303835l = false;

    /* renamed from: m */
    public int f303836m = 1;

    /* renamed from: n */
    private final C91097g f303837n;

    /* renamed from: o */
    private final C68214a f303838o;

    /* renamed from: p */
    private final C108423id f303839p;

    /* renamed from: q */
    private final C109101as f303840q;

    /* renamed from: r */
    private final C68214a f303841r;

    /* renamed from: s */
    private final C108779dm f303842s;

    public C109105b(C108779dm dmVar, C91097g gVar, C108230ba baVar, String str, C68214a aVar, C109399b bVar, Context context, C22871g gVar2, C86124t tVar, C68214a aVar2, C109101as asVar, C68214a aVar3, C68214a aVar4, C68214a aVar5) {
        this.f303842s = dmVar;
        this.f303837n = gVar;
        this.f303824a = baVar;
        this.f303825b = context;
        this.f303826c = gVar2;
        this.f303827d = tVar;
        this.f303838o = aVar2;
        this.f303839p = baVar.mo95424m();
        this.f303840q = asVar;
        this.f303828e = aVar3;
        this.f303841r = aVar4;
        Optional ofNullable = Optional.ofNullable(str);
        this.f303832i = ofNullable;
        if (tVar.mo79746e(C90037cp.f248401I) && tVar.mo79746e(C90037cp.f248556ce)) {
            C109422u uVar = bVar.f304692b;
            C90875ai.m148465b(C109406e.f304703a, uVar.f304737c.mo28210j(uVar.mo97817b(), "getChalkboardPrefetchResponse", C109405d.f304702a), uVar.f304737c, "prewarmChalkboardPrefetchDataStore").mo85223a(C109407f.f304704a);
        }
        if (tVar.mo79746e(C90037cp.f248420aA) || tVar.mo79746e(C90037cp.f248421aB)) {
            ((C106391p) aVar.mo27525b()).mo95496e();
            if (ofNullable.isPresent()) {
                ((C109425x) aVar5.mo27525b()).mo97822b((String) ofNullable.get());
                C113805bu buVar = (C113805bu) aVar4.mo27525b();
                buVar.f315189j = C58833ax.m90834k(buVar.mo100653d((String) ofNullable.get()));
            }
        }
        if (tVar.mo79746e(C90037cp.f248535cJ)) {
            C113805bu buVar2 = (C113805bu) aVar4.mo27525b();
            buVar2.f315191l = C58833ax.m90834k(buVar2.mo100652c());
            buVar2.f315192m = C58833ax.m90834k(buVar2.mo100651b());
            buVar2.f315190k = buVar2.mo100650a();
        }
    }

    /* renamed from: a */
    public final void mo97609a(boolean z) {
        C22869e eVar;
        if ((this.f303833j.equals(C113984c.TRY_BEFORE_YOU_BUY_VIDEO) && z) || this.f303836m != 3 || (eVar = this.f303831h) == null) {
            return;
        }
        if (this.f303833j.equals(C113984c.TRY_BEFORE_YOU_BUY_VIDEO)) {
            eVar.run();
        } else if (!this.f303827d.mo79746e(C90014bt.f247257dj) || (this.f303834k && this.f303835l)) {
            eVar.run();
            mo97611c();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b4, code lost:
        if (r5 < ((int) r1.f315183d.mo79743a(com.google.android.apps.gsa.shared.p7066m.C90037cp.f248501bc))) goto L_0x00b6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x03ae  */
    /* JADX WARNING: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo97610b(android.os.Bundle r34) {
        /*
            r33 = this;
            r0 = r33
            com.google.android.apps.gsa.search.core.i.t r1 = r0.f303827d
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247760nI
            boolean r1 = r1.mo79746e(r2)
            if (r1 == 0) goto L_0x050c
            int r1 = r0.f303836m
            r2 = 1
            if (r1 == r2) goto L_0x0013
            goto L_0x050c
        L_0x0013:
            dagger.a r1 = r0.f303841r
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.util.bu r1 = (com.google.android.apps.gsa.staticplugins.opa.util.C113805bu) r1
            boolean r1 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142296at(r34)
            r3 = 2
            r4 = 0
            if (r1 != 0) goto L_0x04d5
            boolean r1 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142302az(r34)
            if (r1 == 0) goto L_0x002b
            goto L_0x04d5
        L_0x002b:
            com.google.android.apps.gsa.assistant.shared.l.e r1 = com.google.android.apps.gsa.search.shared.p6930h.C87564g.m142223a(r34)
            com.google.android.apps.gsa.assistant.shared.l.e r5 = com.google.android.apps.gsa.assistant.shared.l.e.bQ
            if (r1 != r5) goto L_0x0034
            return
        L_0x0034:
            dagger.a r1 = r0.f303841r
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.util.bu r1 = (com.google.android.apps.gsa.staticplugins.opa.util.C113805bu) r1
            com.google.android.apps.gsa.search.core.i.t r5 = r1.f315183d
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248535cJ
            boolean r5 = r5.mo79746e(r6)
            r6 = 0
            if (r5 == 0) goto L_0x0140
            com.google.android.apps.gsa.staticplugins.opa.util.k r5 = r1.f315184e
            boolean r5 = r5.mo100741g()
            if (r5 == 0) goto L_0x0051
            goto L_0x0140
        L_0x0051:
            com.google.android.apps.gsa.search.core.i.t r5 = r1.f315183d
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248538cM
            boolean r5 = r5.mo79746e(r7)
            if (r5 != 0) goto L_0x005c
            goto L_0x00b6
        L_0x005c:
            com.google.common.base.ax r5 = r1.f315190k
            boolean r5 = r5.mo56113h()
            if (r5 != 0) goto L_0x006a
            com.google.common.base.ax r5 = r1.mo100650a()
            r1.f315190k = r5
        L_0x006a:
            com.google.common.base.ax r5 = r1.f315190k
            java.lang.Object r5 = r5.mo56107c()
            java.util.concurrent.Future r5 = (java.util.concurrent.Future) r5
            boolean r5 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148480n(r5)
            if (r5 == 0) goto L_0x0140
            com.google.common.base.ax r5 = r1.f315190k
            java.lang.Object r5 = r5.mo56107c()
            java.util.concurrent.Future r5 = (java.util.concurrent.Future) r5
            java.lang.Object r5 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148475i(r5, r6)
            java.util.Map r5 = (java.util.Map) r5
            if (r5 == 0) goto L_0x0140
            boolean r7 = r5.isEmpty()
            if (r7 != 0) goto L_0x0140
            java.lang.String r7 = "yesterday"
            boolean r8 = r5.containsKey(r7)
            if (r8 == 0) goto L_0x0140
            java.lang.Object r5 = r5.get(r7)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            com.google.android.apps.gsa.search.core.i.t r7 = r1.f315183d
            com.google.android.apps.gsa.shared.m.f r8 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248506bh
            long r7 = r7.mo79743a(r8)
            int r8 = (int) r7
            if (r8 >= r5) goto L_0x0140
            com.google.android.apps.gsa.search.core.i.t r7 = r1.f315183d
            com.google.android.apps.gsa.shared.m.f r8 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248501bc
            long r7 = r7.mo79743a(r8)
            int r8 = (int) r7
            if (r5 >= r8) goto L_0x0140
        L_0x00b6:
            com.google.common.base.ax r5 = r1.f315191l
            boolean r5 = r5.mo56113h()
            if (r5 != 0) goto L_0x00c8
            com.google.common.util.concurrent.cx r5 = r1.mo100652c()
            com.google.common.base.ax r5 = com.google.common.base.C58833ax.m90834k(r5)
            r1.f315191l = r5
        L_0x00c8:
            com.google.common.base.ax r5 = r1.f315192m
            boolean r5 = r5.mo56113h()
            if (r5 != 0) goto L_0x00da
            com.google.common.util.concurrent.cx r5 = r1.mo100651b()
            com.google.common.base.ax r5 = com.google.common.base.C58833ax.m90834k(r5)
            r1.f315192m = r5
        L_0x00da:
            com.google.common.base.ax r5 = r1.f315191l
            java.lang.Object r5 = r5.mo56107c()
            java.util.concurrent.Future r5 = (java.util.concurrent.Future) r5
            boolean r5 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148480n(r5)
            if (r5 == 0) goto L_0x0140
            com.google.common.base.ax r5 = r1.f315192m
            java.lang.Object r5 = r5.mo56107c()
            java.util.concurrent.Future r5 = (java.util.concurrent.Future) r5
            boolean r5 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148480n(r5)
            if (r5 == 0) goto L_0x0140
            com.google.common.base.ax r5 = r1.f315191l
            java.lang.Object r5 = r5.mo56107c()
            java.util.concurrent.Future r5 = (java.util.concurrent.Future) r5
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            java.lang.Object r5 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148475i(r5, r7)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            long r7 = (long) r5
            com.google.android.apps.gsa.search.core.i.t r5 = r1.f315183d
            com.google.android.apps.gsa.shared.m.f r9 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248537cL
            long r9 = r5.mo79743a(r9)
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 >= 0) goto L_0x0140
            com.google.common.base.ax r5 = r1.f315192m
            java.lang.Object r5 = r5.mo56107c()
            java.util.concurrent.Future r5 = (java.util.concurrent.Future) r5
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            java.lang.Object r5 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148475i(r5, r7)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            long r7 = (long) r5
            com.google.android.apps.gsa.search.core.i.t r5 = r1.f315183d
            com.google.android.apps.gsa.shared.m.f r9 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248536cK
            long r9 = r5.mo79743a(r9)
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 >= 0) goto L_0x0140
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r1 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.NEST_PROMO_SUGGESTION
            goto L_0x03aa
        L_0x0140:
            com.google.android.apps.gsa.assistant.shared.l.e r5 = com.google.android.apps.gsa.search.shared.p6930h.C87564g.m142223a(r34)
            com.google.android.apps.gsa.assistant.shared.l.e r7 = com.google.android.apps.gsa.assistant.shared.l.e.bg
            com.google.common.base.cr r8 = r1.f315185f
            java.lang.Object r8 = r8.mo6453a()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x015e
            if (r5 != r7) goto L_0x015a
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r1 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.TRY_BEFORE_YOU_BUY_SUGGESTION
            goto L_0x03aa
        L_0x015a:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r1 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.UNKNOWN
            goto L_0x03aa
        L_0x015e:
            int r8 = com.google.android.apps.gsa.search.shared.p6930h.C87567j.m142328a(r34)
            com.google.android.apps.gsa.search.core.i.t r9 = r1.f315183d
            com.google.android.apps.gsa.shared.m.d r10 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248600dr
            boolean r9 = r9.mo79746e(r10)
            if (r9 == 0) goto L_0x0175
            if (r8 == r2) goto L_0x0171
            r2 = 4
            if (r8 != r2) goto L_0x0175
        L_0x0171:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r1 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.UNKNOWN
            goto L_0x03aa
        L_0x0175:
            boolean r2 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142299aw(r34)
            if (r2 != 0) goto L_0x03a8
            boolean r2 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142293aq(r34)
            if (r2 != 0) goto L_0x03a8
            boolean r2 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142298av(r34)
            if (r2 != 0) goto L_0x03a8
            boolean r2 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142265aM(r34)
            if (r2 != 0) goto L_0x03a8
            com.google.android.apps.gsa.shared.search.Query r2 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142231F(r34)
            if (r2 != 0) goto L_0x03a8
            java.lang.String r2 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142240O(r34)
            if (r2 != 0) goto L_0x03a8
            byte[] r2 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142274aV(r34)
            if (r2 == 0) goto L_0x01a1
            goto L_0x03a8
        L_0x01a1:
            com.google.android.apps.gsa.search.core.i.t r2 = r1.f315183d
            com.google.android.apps.gsa.shared.m.h r8 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247415gi
            com.google.common.b.gu r2 = r2.mo79749o(r8)
            com.google.android.apps.gsa.assistant.shared.l.e r8 = com.google.android.apps.gsa.search.shared.p6930h.C87564g.m142223a(r34)
            int r8 = r8.ca
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            boolean r2 = r2.contains(r8)
            if (r2 == 0) goto L_0x01bd
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r1 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.UNKNOWN
            goto L_0x03aa
        L_0x01bd:
            com.google.android.apps.gsa.staticplugins.opa.tapas.q.cv r2 = r1.f315186g
            com.google.android.apps.gsa.assistant.shared.l.e r8 = com.google.android.apps.gsa.search.shared.p6930h.C87564g.m142223a(r34)
            boolean r2 = r2.mo99908d(r8)
            if (r2 == 0) goto L_0x01cd
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r1 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.UNKNOWN
            goto L_0x03aa
        L_0x01cd:
            if (r5 != r7) goto L_0x01d3
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r1 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.TRY_BEFORE_YOU_BUY_SUGGESTION
            goto L_0x03aa
        L_0x01d3:
            boolean r2 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142301ay(r34)
            if (r2 == 0) goto L_0x01e3
            java.lang.String r2 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142243R(r34)
            if (r2 == 0) goto L_0x01e3
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r1 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.TRY_BEFORE_YOU_BUY_QUERY_SUGGESTION_FOR_NEW_USERS
            goto L_0x03aa
        L_0x01e3:
            java.lang.String r2 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142238M(r34)
            if (r2 == 0) goto L_0x01fd
            com.google.android.apps.gsa.search.core.i.t r5 = r1.f315183d
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248609e
            boolean r5 = r5.mo79746e(r7)
            if (r5 != 0) goto L_0x01fd
            boolean r5 = r1.mo100654e(r2)
            if (r5 == 0) goto L_0x01fd
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r1 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.OVERAPP_DISCOVERY_QUERY_SUGGESTION
            goto L_0x03aa
        L_0x01fd:
            boolean r5 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142278ab(r34)
            if (r5 == 0) goto L_0x0207
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r1 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.APP_ACTIONS_SUGGESTION
            goto L_0x03aa
        L_0x0207:
            com.google.android.apps.gsa.staticplugins.opa.util.k r5 = r1.f315184e
            boolean r5 = r5.mo100741g()
            if (r5 == 0) goto L_0x0268
            dagger.a r5 = r1.f315181b
            java.lang.Object r5 = r5.mo27525b()
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            java.lang.String r8 = "watched_nbu_onboarding_video_url_set"
            java.util.Set r5 = r5.getStringSet(r8, r7)
            com.google.android.apps.gsa.search.core.i.t r7 = r1.f315183d
            com.google.android.apps.gsa.shared.m.h r8 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247440hG
            com.google.common.b.gu r7 = r7.mo79745c(r8)
            j$.util.stream.Stream r7 = p3186j$.util.Collection.EL.stream(r7)
            com.google.android.apps.gsa.staticplugins.opa.util.bp r8 = new com.google.android.apps.gsa.staticplugins.opa.util.bp
            r8.<init>(r5)
            boolean r5 = r7.anyMatch(r8)
            if (r5 == 0) goto L_0x0268
            com.google.common.o.uf r5 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.common.o.tz r5 = (com.google.common.p4552o.C60548tz) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.common.o.uf r7 = (com.google.common.p4552o.C60555uf) r7
            int r8 = r7.f164093a
            r8 = r8 | r3
            r7.f164093a = r8
            r8 = 1479(0x5c7, float:2.073E-42)
            r7.f164258m = r8
            com.google.protobuf.bv r5 = r5.build()
            com.google.common.o.uf r5 = (com.google.common.p4552o.C60555uf) r5
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r5, r6, r6, r6)
            com.google.android.apps.gsa.search.core.i.t r5 = r1.f315183d
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247439hF
            boolean r5 = r5.mo79746e(r7)
            if (r5 == 0) goto L_0x0268
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r1 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.TRY_BEFORE_YOU_BUY_VIDEO
            goto L_0x03aa
        L_0x0268:
            com.google.android.apps.gsa.search.core.i.t r5 = r1.f315183d
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247679lh
            boolean r5 = r5.mo79746e(r7)
            if (r5 == 0) goto L_0x028e
            com.google.android.apps.gsa.staticplugins.opa.util.k r5 = r1.f315184e
            boolean r5 = r5.mo100741g()
            if (r5 != 0) goto L_0x028a
            com.google.android.apps.gsa.search.core.i.t r5 = r1.f315183d
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90044cw.f248738m
            boolean r5 = r5.mo79746e(r7)
            if (r5 == 0) goto L_0x028e
            boolean r5 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142280ad(r34)
            if (r5 == 0) goto L_0x028e
        L_0x028a:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r1 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.TRY_BEFORE_YOU_BUY_QUERY_SUGGESTION_FOR_NEW_USERS
            goto L_0x03aa
        L_0x028e:
            com.google.android.apps.gsa.staticplugins.opa.util.k r5 = r1.f315184e
            com.google.android.apps.gsa.search.core.i.t r7 = r1.f315183d
            com.google.android.apps.gsa.shared.m.f r8 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248549cX
            long r7 = r7.mo79743a(r8)
            com.google.android.libraries.f.a r9 = r5.f315309d
            long r9 = r9.mo26870b()
            android.content.SharedPreferences r5 = r5.f315307b
            java.lang.String r11 = "assistant_latest_interaction_timestamp_millis"
            r12 = -1
            long r11 = r5.getLong(r11, r12)
            long r9 = r9 - r11
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.DAYS
            int r8 = (int) r7
            long r7 = (long) r8
            long r7 = r5.toMillis(r7)
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x02b6
            goto L_0x02e5
        L_0x02b6:
            com.google.common.o.uf r5 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.common.o.tz r5 = (com.google.common.p4552o.C60548tz) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.common.o.uf r7 = (com.google.common.p4552o.C60555uf) r7
            int r8 = r7.f164093a
            r8 = r8 | r3
            r7.f164093a = r8
            r8 = 1467(0x5bb, float:2.056E-42)
            r7.f164258m = r8
            com.google.protobuf.bv r5 = r5.build()
            com.google.common.o.uf r5 = (com.google.common.p4552o.C60555uf) r5
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r5, r6, r6, r6)
            com.google.android.apps.gsa.search.core.i.t r5 = r1.f315183d
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248548cW
            boolean r5 = r5.mo79746e(r7)
            if (r5 == 0) goto L_0x02e5
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r1 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.TRY_BEFORE_YOU_BUY_QUERY_SUGGESTION_FOR_ACTIVATED_USERS
            goto L_0x03aa
        L_0x02e5:
            com.google.android.apps.gsa.search.core.i.t r5 = r1.f315183d
            com.google.android.apps.gsa.shared.m.f r7 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248530cE
            long r7 = r5.mo79743a(r7)
            java.lang.String r5 = "opa_input_plate_impression_count"
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x0328
            dagger.a r11 = r1.f315181b
            java.lang.Object r11 = r11.mo27525b()
            android.content.SharedPreferences r11 = (android.content.SharedPreferences) r11
            int r11 = r11.getInt(r5, r4)
            long r11 = (long) r11
            long r11 = r11 % r7
            int r7 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x0328
            com.google.common.o.uf r7 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.common.o.tz r7 = (com.google.common.p4552o.C60548tz) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.common.o.uf r8 = (com.google.common.p4552o.C60555uf) r8
            int r11 = r8.f164093a
            r11 = r11 | r3
            r8.f164093a = r11
            r11 = 1504(0x5e0, float:2.108E-42)
            r8.f164258m = r11
            com.google.protobuf.bv r7 = r7.build()
            com.google.common.o.uf r7 = (com.google.common.p4552o.C60555uf) r7
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r7, r6, r6, r6)
        L_0x0328:
            com.google.android.apps.gsa.search.core.i.t r7 = r1.f315183d
            com.google.android.apps.gsa.shared.m.f r8 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248550cY
            long r7 = r7.mo79743a(r8)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x0349
            dagger.a r11 = r1.f315181b
            java.lang.Object r11 = r11.mo27525b()
            android.content.SharedPreferences r11 = (android.content.SharedPreferences) r11
            int r4 = r11.getInt(r5, r4)
            long r4 = (long) r4
            long r4 = r4 % r7
            int r7 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x0349
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r1 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.TRY_BEFORE_YOU_BUY_QUERY_SUGGESTION_FOR_ACTIVATED_USERS
            goto L_0x03aa
        L_0x0349:
            if (r2 == 0) goto L_0x035e
            com.google.android.apps.gsa.search.core.i.t r4 = r1.f315183d
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248609e
            boolean r4 = r4.mo79746e(r5)
            if (r4 == 0) goto L_0x035e
            boolean r2 = r1.mo100654e(r2)
            if (r2 == 0) goto L_0x035e
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r1 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.OVERAPP_DISCOVERY_QUERY_SUGGESTION
            goto L_0x03aa
        L_0x035e:
            com.google.android.apps.gsa.staticplugins.opa.util.bc r2 = r1.f315182c
            boolean r2 = r2.mo100632l()
            if (r2 != 0) goto L_0x0376
            com.google.android.apps.gsa.search.core.i.t r1 = r1.f315183d
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248601ds
            boolean r1 = r1.mo79746e(r2)
            if (r1 == 0) goto L_0x0373
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r1 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.UPGRADED_USER_WITH_TIMEOUT_TO_QUERY_SUGGESTION
            goto L_0x03aa
        L_0x0373:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r1 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.UNKNOWN
            goto L_0x03aa
        L_0x0376:
            com.google.android.apps.gsa.search.core.i.t r2 = r1.f315183d
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248395C
            boolean r2 = r2.mo79746e(r4)
            if (r2 == 0) goto L_0x0383
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r1 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.UNKNOWN
            goto L_0x03aa
        L_0x0383:
            com.google.android.apps.gsa.search.core.i.t r2 = r1.f315183d
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247680li
            boolean r2 = r2.mo79746e(r4)
            if (r2 == 0) goto L_0x0390
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r1 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.TRY_BEFORE_YOU_BUY_SUGGESTION
            goto L_0x03aa
        L_0x0390:
            com.google.android.apps.gsa.search.core.i.t r2 = r1.f315183d
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247681lj
            boolean r2 = r2.mo79746e(r4)
            if (r2 == 0) goto L_0x03a5
            com.google.android.apps.gsa.staticplugins.opa.util.k r1 = r1.f315184e
            boolean r1 = r1.mo100740f()
            if (r1 != 0) goto L_0x03a5
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r1 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.TRY_BEFORE_YOU_BUY_VIDEO
            goto L_0x03aa
        L_0x03a5:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r1 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.UNKNOWN
            goto L_0x03aa
        L_0x03a8:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r1 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.UNKNOWN
        L_0x03aa:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r2 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.UNKNOWN
            if (r1 == r2) goto L_0x04d4
            r0.f303833j = r1
            r0.f303836m = r3
            java.lang.String r13 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142243R(r34)
            java.lang.String r14 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142236K(r34)
            com.google.android.apps.gsa.staticplugins.opa.greeting.as r1 = r0.f303840q
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r2 = r0.f303833j
            r8 = r2
            com.google.android.apps.gsa.staticplugins.opa.dm r9 = r0.f303842s
            com.google.android.apps.gsa.shared.util.t.g r10 = r0.f303837n
            com.google.android.apps.gsa.staticplugins.opa.chatui.id r3 = r0.f303839p
            r11 = r3
            j$.util.Optional r4 = r0.f303832i
            java.lang.Object r4 = r4.orElse(r6)
            r12 = r4
            java.lang.String r12 = (java.lang.String) r12
            com.google.android.apps.gsa.staticplugins.opa.greeting.ar r4 = new com.google.android.apps.gsa.staticplugins.opa.greeting.ar
            r7 = r4
            r2.getClass()
            r3.getClass()
            g.a.a r2 = r1.f303794a
            dagger.a.l r2 = (dagger.p5294a.C68226l) r2
            g.a.a r2 = r2.f184585a
            dagger.a r2 = dagger.p5294a.C68219e.m98518a(r2)
            r15 = r2
            r2.getClass()
            g.a.a r2 = r1.f303795b
            java.lang.Object r2 = r2.mo17428b()
            android.content.Context r2 = (android.content.Context) r2
            r16 = r2
            r2.getClass()
            g.a.a r2 = r1.f303796c
            java.lang.Object r2 = r2.mo17428b()
            com.google.android.apps.gsa.search.core.i.t r2 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r2
            r17 = r2
            r2.getClass()
            g.a.a r2 = r1.f303797d
            dagger.a.l r2 = (dagger.p5294a.C68226l) r2
            g.a.a r2 = r2.f184585a
            dagger.a r2 = dagger.p5294a.C68219e.m98518a(r2)
            r18 = r2
            r2.getClass()
            g.a.a r2 = r1.f303798e
            java.lang.Object r2 = r2.mo17428b()
            com.google.android.apps.gsa.staticplugins.opa.greeting.av r2 = (com.google.android.apps.gsa.staticplugins.opa.greeting.C109104av) r2
            r19 = r2
            r2.getClass()
            g.a.a r2 = r1.f303799f
            java.lang.Object r2 = r2.mo17428b()
            com.google.android.libraries.gsa.k.g r2 = (com.google.android.libraries.gsa.p1876k.C22871g) r2
            r20 = r2
            r2.getClass()
            g.a.a r2 = r1.f303800g
            java.lang.Object r2 = r2.mo17428b()
            com.google.android.libraries.gsa.k.g r2 = (com.google.android.libraries.gsa.p1876k.C22871g) r2
            r21 = r2
            r2.getClass()
            g.a.a r2 = r1.f303801h
            java.lang.Object r2 = r2.mo17428b()
            com.google.android.libraries.gsa.k.g r2 = (com.google.android.libraries.gsa.p1876k.C22871g) r2
            r22 = r2
            r2.getClass()
            g.a.a r2 = r1.f303802i
            dagger.a.l r2 = (dagger.p5294a.C68226l) r2
            g.a.a r2 = r2.f184585a
            dagger.a r2 = dagger.p5294a.C68219e.m98518a(r2)
            r23 = r2
            r2.getClass()
            g.a.a r2 = r1.f303803j
            dagger.a.l r2 = (dagger.p5294a.C68226l) r2
            g.a.a r2 = r2.f184585a
            dagger.a r2 = dagger.p5294a.C68219e.m98518a(r2)
            r24 = r2
            r2.getClass()
            g.a.a r2 = r1.f303804k
            dagger.a.l r2 = (dagger.p5294a.C68226l) r2
            g.a.a r2 = r2.f184585a
            dagger.a r2 = dagger.p5294a.C68219e.m98518a(r2)
            r25 = r2
            r2.getClass()
            g.a.a r2 = r1.f303805l
            java.lang.Object r2 = r2.mo17428b()
            com.google.android.apps.gsa.staticplugins.opa.util.cw r2 = (com.google.android.apps.gsa.staticplugins.opa.util.C113868cw) r2
            r26 = r2
            r2.getClass()
            g.a.a r2 = r1.f303806m
            dagger.a.l r2 = (dagger.p5294a.C68226l) r2
            g.a.a r2 = r2.f184585a
            dagger.a r2 = dagger.p5294a.C68219e.m98518a(r2)
            r27 = r2
            r2.getClass()
            g.a.a r2 = r1.f303807n
            java.lang.Object r2 = r2.mo17428b()
            com.google.android.apps.gsa.staticplugins.opa.z.a.i r2 = (com.google.android.apps.gsa.staticplugins.opa.p8625z.p8626a.C114540i) r2
            r28 = r2
            r2.getClass()
            g.a.a r2 = r1.f303808o
            java.lang.Object r2 = r2.mo17428b()
            com.google.android.apps.gsa.search.shared.h.k r2 = (com.google.android.apps.gsa.search.shared.p6930h.C87568k) r2
            r29 = r2
            r2.getClass()
            g.a.a r2 = r1.f303809p
            java.lang.Object r2 = r2.mo17428b()
            com.google.android.apps.gsa.shared.m.b.f r2 = (com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f) r2
            r30 = r2
            r2.getClass()
            g.a.a r2 = r1.f303810q
            java.lang.Object r2 = r2.mo17428b()
            com.google.android.apps.gsa.staticplugins.opa.widget.impl.c r2 = (com.google.android.apps.gsa.staticplugins.opa.widget.impl.C114250c) r2
            r31 = r2
            r2.getClass()
            g.a.a r1 = r1.f303811r
            dagger.a.l r1 = (dagger.p5294a.C68226l) r1
            g.a.a r1 = r1.f184585a
            dagger.a r1 = dagger.p5294a.C68219e.m98518a(r1)
            r32 = r1
            r1.getClass()
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r0.f303830g = r4
        L_0x04d4:
            return
        L_0x04d5:
            com.google.android.apps.gsa.search.core.i.t r1 = r0.f303827d
            dagger.a r2 = r0.f303838o
            java.lang.Object r2 = r2.mo27525b()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            boolean r5 = com.google.android.apps.gsa.staticplugins.opa.util.C113765ah.m188332a(r1)
            if (r5 == 0) goto L_0x050c
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247760nI
            boolean r5 = r1.mo79746e(r5)
            if (r5 == 0) goto L_0x050c
            java.lang.String r5 = "opa_has_seen_greeting_for_lockhart"
            boolean r5 = r2.getBoolean(r5, r4)
            if (r5 == 0) goto L_0x0506
            java.lang.String r5 = "opa_lockhart_greeting_count"
            int r2 = r2.getInt(r5, r4)
            long r4 = (long) r2
            com.google.android.apps.gsa.shared.m.f r2 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247673lb
            long r1 = r1.mo79743a(r2)
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 >= 0) goto L_0x050c
        L_0x0506:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r1 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.LOCKHART
            r0.f303833j = r1
            r0.f303836m = r3
        L_0x050c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.greeting.C109105b.mo97610b(android.os.Bundle):void");
    }

    /* renamed from: c */
    public final void mo97611c() {
        this.f303836m = 5;
        C60870cx cxVar = this.f303829f;
        if (cxVar != null) {
            cxVar.cancel(false);
            this.f303829f = null;
        }
        this.f303834k = false;
        this.f303835l = false;
        C109100ar arVar = this.f303830g;
        if (arVar != null) {
            arVar.mo97605v();
        }
    }

    /* renamed from: d */
    public final boolean mo97612d() {
        return this.f303836m == 2;
    }

    /* renamed from: e */
    public final boolean mo97613e() {
        int i = this.f303836m;
        return (i == 1 || i == 5) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r0 = r4.f303836m;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo97614f() {
        /*
            r4 = this;
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r0 = r4.f303833j
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r1 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.LOCKHART
            r2 = 0
            if (r0 == r1) goto L_0x0008
            return r2
        L_0x0008:
            int r0 = r4.f303836m
            r1 = 1
            if (r0 == r1) goto L_0x0011
            r3 = 5
            if (r0 == r3) goto L_0x0011
            return r1
        L_0x0011:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.greeting.C109105b.mo97614f():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r0 = r4.f303836m;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo97615g() {
        /*
            r4 = this;
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r0 = r4.f303833j
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r1 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.TRY_BEFORE_YOU_BUY_SUGGESTION
            r2 = 0
            if (r0 == r1) goto L_0x0008
            return r2
        L_0x0008:
            int r0 = r4.f303836m
            r1 = 1
            if (r0 == r1) goto L_0x0016
            r3 = 5
            if (r0 != r3) goto L_0x0011
            goto L_0x0016
        L_0x0011:
            com.google.android.apps.gsa.staticplugins.opa.greeting.ar r0 = r4.f303830g
            if (r0 == 0) goto L_0x0016
            return r1
        L_0x0016:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.greeting.C109105b.mo97615g():boolean");
    }

    /* renamed from: h */
    public final boolean mo97616h() {
        int i;
        if (!this.f303827d.mo79746e(C90037cp.f248531cF)) {
            return false;
        }
        if ((this.f303833j != C113984c.TRY_BEFORE_YOU_BUY_QUERY_SUGGESTION_FOR_NEW_USERS && this.f303833j != C113984c.TRY_BEFORE_YOU_BUY_QUERY_SUGGESTION_FOR_ACTIVATED_USERS) || (i = this.f303836m) == 1 || i == 5) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final void mo97617i(boolean z, int i) {
        Animator animator;
        Animator animator2;
        if (mo97615g()) {
            ((LinearLayoutManager) this.f303830g.f303771d.mLayout).setStackFromEnd(i != 2);
            this.f303830g.f303771d.mLayout.scrollToPosition(0);
            if (z) {
                C109100ar arVar = this.f303830g;
                C58976aa aaVar = C58975e.f156826a;
                if (!(arVar.f303788u != C113984c.TRY_BEFORE_YOU_BUY_SUGGESTION || (animator = arVar.f303740E) == null || (animator2 = arVar.f303741F) == null)) {
                    C114034q.m188817m(arVar.f303771d, animator, animator2);
                }
                C109100ar arVar2 = this.f303830g;
                C114034q.m188812h(arVar2.f303738C);
                if (!arVar2.f303770c.isShown()) {
                    C114034q.m188812h(arVar2.f303737B);
                    arVar2.f303770c.setVisibility(0);
                }
                arVar2.f303747L = true;
            }
        }
    }
}
