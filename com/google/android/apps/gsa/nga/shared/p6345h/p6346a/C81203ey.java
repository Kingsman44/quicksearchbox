package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.google.android.apps.gsa.nga.shared.p6345h.C81249an;
import com.google.android.apps.gsa.nga.shared.p6345h.C81252aq;
import com.google.android.apps.gsa.nga.shared.p6345h.C81262b;
import com.google.android.apps.gsa.nga.shared.p6345h.C81277bh;
import com.google.android.apps.gsa.nga.shared.p6345h.C81280bk;
import com.google.android.apps.gsa.nga.shared.p6345h.C81305ci;
import com.google.android.apps.gsa.shared.p7066m.C90022ca;
import com.google.android.apps.gsa.shared.p7066m.C90048d;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.assistant.p3861at.C49918dv;
import com.google.assistant.p3897e.p3917i.p3918a.C51300cp;
import com.google.knowledge.p4671b.C61826s;
import com.google.protobuf.C62995dn;
import dagger.C68214a;
import java.util.Locale;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.ey */
/* compiled from: PG */
public final class C81203ey implements C81252aq {

    /* renamed from: a */
    private final C91142g f222340a;

    /* renamed from: b */
    private final C68214a f222341b;

    /* renamed from: c */
    private final boolean f222342c;

    public C81203ey(C68214a aVar, C91142g gVar, boolean z) {
        this.f222341b = aVar;
        this.f222340a = gVar;
        this.f222342c = z;
    }

    /* renamed from: A */
    private final Optional m129163A(String str, Function function) {
        C81280bk c = ((C81174dw) this.f222341b.mo27525b()).mo74934c();
        str.getClass();
        if (!c.f222508k.containsKey(str)) {
            return Optional.empty();
        }
        str.getClass();
        C62995dn dnVar = c.f222508k;
        if (dnVar.containsKey(str)) {
            return Optional.m71637of(function.apply((C81305ci) dnVar.get(str)));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: B */
    private final Optional m129164B(Function function, Function function2) {
        C81277bh b = ((C81174dw) this.f222341b.mo27525b()).mo74933b();
        if (((Boolean) function.apply(b)).booleanValue()) {
            return Optional.m71637of((Boolean) function2.apply(b));
        }
        return Optional.empty();
    }

    /* renamed from: C */
    private final Optional m129165C(C90048d dVar, Function function, Function function2) {
        if (dVar == null || this.f222340a.mo85405j(dVar)) {
            return m129164B(function, function2);
        }
        return Optional.m71637of(false);
    }

    /* renamed from: a */
    public final C51300cp mo74940a() {
        C61826s sVar = C61826s.OPA_OPT_IN_STATUS_UNKNOWN;
        C61826s a = C61826s.m94481a(((C81174dw) this.f222341b.mo27525b()).mo74934c().f222504g);
        if (a == null) {
            a = C61826s.OPA_OPT_IN_STATUS_UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal == 0) {
            return C51300cp.UNSPECIFIED_ASSISTANT_ON_LOCKSCREEN;
        }
        if (ordinal == 1) {
            return C51300cp.ASSISTANT_ON_LOCKSCREEN_DISALLOWED;
        }
        if (ordinal == 2) {
            return C51300cp.ASSISTANT_ON_LOCKSCREEN_ALLOWED;
        }
        throw new AssertionError();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.android.apps.gsa.nga.shared.h.ao} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p3186j$.util.Optional mo74941b(java.lang.String r5) {
        /*
            r4 = this;
            dagger.a r0 = r4.f222341b
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.nga.shared.h.a.dw r0 = (com.google.android.apps.gsa.nga.shared.p6345h.p6346a.C81174dw) r0
            com.google.android.apps.gsa.nga.shared.h.bh r0 = r0.mo74933b()
            r5.getClass()
            com.google.protobuf.dn r1 = r0.f222494l
            boolean r1 = r1.containsKey(r5)
            if (r1 != 0) goto L_0x001c
            j$.util.Optional r5 = p3186j$.util.Optional.empty()
            return r5
        L_0x001c:
            com.google.android.apps.gsa.nga.shared.h.ao r1 = com.google.android.apps.gsa.nga.shared.p6345h.C81250ao.f222431i
            r5.getClass()
            com.google.protobuf.dn r0 = r0.f222494l
            boolean r2 = r0.containsKey(r5)
            if (r2 == 0) goto L_0x0030
            java.lang.Object r5 = r0.get(r5)
            r1 = r5
            com.google.android.apps.gsa.nga.shared.h.ao r1 = (com.google.android.apps.gsa.nga.shared.p6345h.C81250ao) r1
        L_0x0030:
            com.google.android.apps.gsa.nga.shared.h.f r5 = new com.google.android.apps.gsa.nga.shared.h.f
            r5.<init>()
            com.google.android.apps.gsa.nga.shared.h.an r0 = com.google.android.apps.gsa.nga.shared.p6345h.C81249an.NOT_SET
            r5.mo74844b(r0)
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89845m()
            r5.mo74843a(r0)
            com.google.android.apps.gsa.nga.shared.h.h r0 = new com.google.android.apps.gsa.nga.shared.h.h
            r0.<init>()
            com.google.android.apps.gsa.nga.shared.h.cg r0 = r0.mo74987a()
            r5.mo74845c(r0)
            com.google.protobuf.cq r0 = r1.f222437e
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r0)
            com.google.android.apps.gsa.nga.shared.h.a.ev r2 = com.google.android.apps.gsa.nga.shared.p6345h.p6346a.C81200ev.f222337a
            j$.util.stream.Stream r0 = r0.map(r2)
            j$.util.stream.Collector r2 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r0 = r0.collect(r2)
            com.google.common.b.gu r0 = (com.google.common.p4522b.C58485gu) r0
            r5.mo74843a(r0)
            int r0 = r1.f222433a
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0076
            java.lang.String r0 = r1.f222438f
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r0)
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            r5.f222573a = r0
        L_0x0076:
            com.google.android.apps.gsa.nga.shared.h.h r0 = new com.google.android.apps.gsa.nga.shared.h.h
            r0.<init>()
            int r2 = r1.f222433a
            r2 = r2 & 1
            if (r2 == 0) goto L_0x0089
            java.lang.String r2 = r1.f222434b
            j$.util.Optional r2 = p3186j$.util.Optional.m71637of(r2)
            r0.f222581a = r2
        L_0x0089:
            int r2 = r1.f222433a
            r2 = r2 & 2
            if (r2 == 0) goto L_0x009b
            com.google.protobuf.z r2 = r1.f222435c
            byte[] r2 = r2.mo59174N()
            j$.util.Optional r2 = p3186j$.util.Optional.m71637of(r2)
            r0.f222582b = r2
        L_0x009b:
            int r1 = r1.f222440h
            com.google.android.apps.gsa.nga.shared.h.an r1 = com.google.android.apps.gsa.nga.shared.p6345h.C81249an.m129216a(r1)
            if (r1 != 0) goto L_0x00a5
            com.google.android.apps.gsa.nga.shared.h.an r1 = com.google.android.apps.gsa.nga.shared.p6345h.C81249an.NOT_SET
        L_0x00a5:
            r5.mo74844b(r1)
            com.google.android.apps.gsa.nga.shared.h.cg r0 = r0.mo74987a()
            r5.mo74845c(r0)
            com.google.common.b.gu r0 = r5.f222574b
            if (r0 == 0) goto L_0x00c8
            com.google.android.apps.gsa.nga.shared.h.cg r1 = r5.f222575c
            if (r1 == 0) goto L_0x00c8
            com.google.android.apps.gsa.nga.shared.h.an r2 = r5.f222576d
            if (r2 != 0) goto L_0x00bc
            goto L_0x00c8
        L_0x00bc:
            com.google.android.apps.gsa.nga.shared.h.g r3 = new com.google.android.apps.gsa.nga.shared.h.g
            j$.util.Optional r5 = r5.f222573a
            r3.<init>(r5, r0, r1, r2)
            j$.util.Optional r5 = p3186j$.util.Optional.m71637of(r3)
            return r5
        L_0x00c8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.google.common.b.gu r1 = r5.f222574b
            if (r1 != 0) goto L_0x00d6
            java.lang.String r1 = " assistantLocales"
            r0.append(r1)
        L_0x00d6:
            com.google.android.apps.gsa.nga.shared.h.cg r1 = r5.f222575c
            if (r1 != 0) goto L_0x00df
            java.lang.String r1 = " speechPreferences"
            r0.append(r1)
        L_0x00df:
            com.google.android.apps.gsa.nga.shared.h.an r5 = r5.f222576d
            if (r5 != 0) goto L_0x00e8
            java.lang.String r5 = " assistantScreenContextOptInStatus"
            r0.append(r5)
        L_0x00e8:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r1 = "Missing required properties:"
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r1.concat(r0)
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.shared.p6345h.p6346a.C81203ey.mo74941b(java.lang.String):j$.util.Optional");
    }

    /* renamed from: c */
    public final Optional mo74942c(String str) {
        Optional b = mo74941b(str);
        if (b.isPresent()) {
            return ((C81262b) b.get()).mo74978d();
        }
        return Optional.empty();
    }

    /* renamed from: d */
    public final Optional mo74943d() {
        return m129165C((C90048d) null, C81196er.f222333a, C81197es.f222334a);
    }

    /* renamed from: e */
    public final Optional mo74944e() {
        if (this.f222342c) {
            return Optional.m71637of(false);
        }
        return m129165C(C90022ca.f248113o, C81198et.f222335a, C81199eu.f222336a);
    }

    /* renamed from: f */
    public final Optional mo74945f() {
        return m129165C((C90048d) null, C81187ei.f222324a, C81188ej.f222325a);
    }

    /* renamed from: g */
    public final Optional mo74946g(String str) {
        return m129164B(new C81192en(str), new C81193eo(str));
    }

    /* renamed from: m */
    public final Optional mo74952m(String str) {
        return m129164B(new C81184ef(str), new C81185eg(str));
    }

    /* renamed from: n */
    public final String mo74953n() {
        return ((C81174dw) this.f222341b.mo27525b()).mo74933b().f222486d;
    }

    /* renamed from: o */
    public final Locale mo74954o() {
        C81277bh b = ((C81174dw) this.f222341b.mo27525b()).mo74933b();
        if ((b.f222483a & 32) != 0) {
            return Locale.forLanguageTag(b.f222489g);
        }
        return Locale.getDefault();
    }

    /* renamed from: p */
    public final boolean mo74955p() {
        if (this.f222342c) {
            return false;
        }
        return ((Boolean) m129165C(C90126fx.f251094cN, C81190el.f222327a, C81191em.f222328a).orElse(Boolean.valueOf(this.f222340a.mo85405j(C90126fx.f251009ai)))).booleanValue();
    }

    /* renamed from: q */
    public final boolean mo74956q() {
        return ((C81174dw) this.f222341b.mo27525b()).mo74934c().f222503f;
    }

    /* renamed from: r */
    public final boolean mo74957r() {
        return ((C81174dw) this.f222341b.mo27525b()).mo74934c().f222502e;
    }

    /* renamed from: s */
    public final boolean mo74958s() {
        return ((C81174dw) this.f222341b.mo27525b()).mo74933b().f222490h.equals("voice");
    }

    @Deprecated
    /* renamed from: t */
    public final boolean mo74959t() {
        return false;
    }

    /* renamed from: u */
    public final boolean mo74960u(Optional optional) {
        if (this.f222340a.mo85405j(C90126fx.f250990aP)) {
            return false;
        }
        boolean z = ((C81174dw) this.f222341b.mo27525b()).mo74932a().f222399r;
        C81249an anVar = (C81249an) optional.map(new C81201ew(this)).orElse(C81249an.NOT_SET);
        return ((C81174dw) this.f222341b.mo27525b()).mo74934c().f222501d;
    }

    /* renamed from: v */
    public final boolean mo74961v() {
        return ((C81174dw) this.f222341b.mo27525b()).mo74934c().f222505h;
    }

    /* renamed from: w */
    public final boolean mo74962w() {
        return ((C81174dw) this.f222341b.mo27525b()).mo74934c().f222506i;
    }

    /* renamed from: x */
    public final boolean mo74963x() {
        return ((C81174dw) this.f222341b.mo27525b()).mo74934c().f222499b;
    }

    /* renamed from: y */
    public final boolean mo74964y() {
        return ((C81174dw) this.f222341b.mo27525b()).mo74934c().f222500c;
    }

    /* renamed from: z */
    public final int mo74965z() {
        int a = C49918dv.m85770a(((C81174dw) this.f222341b.mo27525b()).mo74933b().f222488f);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: h */
    public final Optional mo74947h(Optional optional) {
        optional.getClass();
        if (optional.isPresent()) {
            return m129163A((String) optional.get(), C81202ex.f222339a);
        }
        return Optional.empty();
    }

    /* renamed from: i */
    public final Optional mo74948i(Optional optional) {
        optional.getClass();
        if (optional.isPresent()) {
            return m129163A((String) optional.get(), C81195eq.f222332a);
        }
        return Optional.m71637of(true);
    }

    /* renamed from: j */
    public final Optional mo74949j(Optional optional) {
        optional.getClass();
        if (optional.isPresent()) {
            return m129163A((String) optional.get(), C81194ep.f222331a);
        }
        return Optional.m71637of(true);
    }

    /* renamed from: k */
    public final Optional mo74950k(Optional optional) {
        optional.getClass();
        if (optional.isPresent()) {
            return m129163A((String) optional.get(), C81189ek.f222326a);
        }
        return Optional.m71637of(true);
    }

    /* renamed from: l */
    public final Optional mo74951l(Optional optional) {
        optional.getClass();
        if (optional.isPresent()) {
            return m129163A((String) optional.get(), C81183ee.f222320a);
        }
        return Optional.m71637of(true);
    }
}
