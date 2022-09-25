package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import android.os.Bundle;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.C90735as;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8508f.C111519a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8508f.C111520b;
import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8508f.C111521c;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8533a.C111806n;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c.C111948ap;
import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112982q;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8564h.C112600b;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8567o.p8570c.C113016o;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113167by;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113409et;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.assistant.p1594s.p1597b.C19167ba;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.assistant.p3897e.p3921j.alf;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62963cj;
import com.google.protobuf.C62974ct;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.ap */
/* compiled from: PG */
public final class C111825ap implements C112002j {

    /* renamed from: a */
    public static final C121537f f310762a = C121537f.m200840b("Tapas/TapasEngine", C121511c.f337208a);

    /* renamed from: b */
    public static final C59071e f310763b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.framework.ap");

    /* renamed from: A */
    private final C68214a f310764A;

    /* renamed from: B */
    private final C22871g f310765B;

    /* renamed from: C */
    private final C112600b f310766C;

    /* renamed from: D */
    private final C68214a f310767D;

    /* renamed from: E */
    private final C68214a f310768E;

    /* renamed from: c */
    public final C86124t f310769c;

    /* renamed from: d */
    public final C68214a f310770d;

    /* renamed from: e */
    public final C68214a f310771e;

    /* renamed from: f */
    public final C68214a f310772f;

    /* renamed from: g */
    public final C22871g f310773g;

    /* renamed from: h */
    public final C21370a f310774h;

    /* renamed from: i */
    public final AtomicReference f310775i = new AtomicReference();

    /* renamed from: j */
    public final C68214a f310776j;

    /* renamed from: k */
    public final C68214a f310777k;

    /* renamed from: l */
    public final C68214a f310778l;

    /* renamed from: m */
    public final C112000h f310779m;

    /* renamed from: n */
    public final C68214a f310780n;

    /* renamed from: o */
    public final C68214a f310781o;

    /* renamed from: p */
    public final C68214a f310782p;

    /* renamed from: q */
    public final C68214a f310783q;

    /* renamed from: r */
    public final C68214a f310784r;

    /* renamed from: s */
    public final C68214a f310785s;

    /* renamed from: t */
    public final C111792a f310786t;

    /* renamed from: u */
    public final C112982q f310787u;

    /* renamed from: v */
    public final C113167by f310788v;

    /* renamed from: w */
    public final C111997e f310789w;

    /* renamed from: x */
    public final C68214a f310790x;

    /* renamed from: y */
    public final C68214a f310791y;

    /* renamed from: z */
    public final Executor f310792z;

    public C111825ap(C86124t tVar, C68214a aVar, C68214a aVar2, C22871g gVar, C22871g gVar2, C21370a aVar3, C68214a aVar4, C68214a aVar5, C112600b bVar, C68214a aVar6, C68214a aVar7, C112001i iVar, int i, C68214a aVar8, C68214a aVar9, C68214a aVar10, C68214a aVar11, C68214a aVar12, C68214a aVar13, C68214a aVar14, C68214a aVar15, C111792a aVar16, C112982q qVar, C113167by byVar, C111997e eVar, C68214a aVar17, C68214a aVar18, C68214a aVar19, Executor executor) {
        C112001i iVar2 = iVar;
        this.f310769c = tVar;
        this.f310764A = aVar;
        this.f310772f = aVar2;
        this.f310765B = gVar2;
        this.f310773g = gVar;
        this.f310774h = aVar3;
        this.f310771e = aVar4;
        this.f310776j = aVar5;
        this.f310766C = bVar;
        this.f310777k = aVar6;
        this.f310778l = aVar7;
        C21370a aVar20 = (C21370a) iVar2.f311154a.mo17428b();
        aVar20.getClass();
        C22871g gVar3 = (C22871g) iVar2.f311155b.mo17428b();
        gVar3.getClass();
        this.f310779m = new C112000h((long) i, aVar20, gVar3);
        this.f310770d = aVar8;
        this.f310780n = aVar9;
        this.f310781o = aVar10;
        this.f310782p = aVar11;
        this.f310783q = aVar12;
        this.f310767D = aVar13;
        this.f310784r = aVar14;
        this.f310785s = aVar15;
        this.f310786t = aVar16;
        this.f310787u = qVar;
        this.f310788v = byVar;
        this.f310789w = eVar;
        this.f310790x = aVar17;
        this.f310768E = aVar19;
        this.f310791y = aVar18;
        this.f310792z = executor;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo99257a(com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep r10) {
        /*
            r9 = this;
            com.google.android.apps.search.assistant.platform.i.e.a.f r0 = f310762a
            java.lang.String r1 = r10.mo100186s()
            com.google.android.apps.gsa.staticplugins.opa.tapas.framework.o r2 = new com.google.android.apps.gsa.staticplugins.opa.tapas.framework.o
            r2.<init>(r9, r10)
            java.lang.String r3 = "fetchTapasSuggestions"
            java.lang.String r1 = r3.concat(r1)
            com.google.common.util.concurrent.cx r0 = r0.mo105234c(r1, r2)
            com.google.android.apps.gsa.search.core.i.t r1 = r9.f310769c
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249451dl
            boolean r1 = r1.mo79746e(r2)
            if (r1 == 0) goto L_0x0092
            dagger.a r1 = r9.f310767D
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.tapas.framework.a.h r1 = (com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8533a.C111800h) r1
            com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p r2 = new com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p
            r2.<init>(r9)
            java.lang.String r3 = r10.mo100033p()
            com.google.android.libraries.assistant.s.b.ba r10 = r10.mo100022f()
            int r4 = r3.hashCode()
            r5 = 3327206(0x32c4e6, float:4.662409E-39)
            r6 = 0
            r7 = 1
            r8 = 2
            if (r4 == r5) goto L_0x005f
            r5 = 93622832(0x5949230, float:1.3971554E-35)
            if (r4 == r5) goto L_0x0055
            r5 = 1232341385(0x49740989, float:999576.56)
            if (r4 == r5) goto L_0x004b
            goto L_0x0069
        L_0x004b:
            java.lang.String r4 = "smallbench"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0069
            r3 = 1
            goto L_0x006a
        L_0x0055:
            java.lang.String r4 = "bench"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0069
            r3 = 0
            goto L_0x006a
        L_0x005f:
            java.lang.String r4 = "load"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0069
            r3 = 2
            goto L_0x006a
        L_0x0069:
            r3 = -1
        L_0x006a:
            if (r3 == 0) goto L_0x008d
            if (r3 == r7) goto L_0x0080
            if (r3 == r8) goto L_0x0071
            goto L_0x0092
        L_0x0071:
            com.google.android.libraries.gsa.k.g r3 = r1.f310723c
            com.google.android.apps.gsa.staticplugins.opa.tapas.framework.a.c r4 = new com.google.android.apps.gsa.staticplugins.opa.tapas.framework.a.c
            r4.<init>(r1, r2, r10)
            java.lang.String r10 = "[Tapas] on device load test"
            r1 = 2000(0x7d0, double:9.88E-321)
            r3.mo28213m(r10, r1, r4)
            goto L_0x0092
        L_0x0080:
            com.google.common.b.gu r3 = com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8533a.C111800h.f310722b
            r4 = r3
            com.google.common.b.pq r4 = (com.google.common.p4522b.C58724pq) r4
            int r4 = r4.f156474d
            int r4 = r4 / r8
            com.google.common.b.gu r3 = r3.subList(r6, r4)
            goto L_0x008f
        L_0x008d:
            com.google.common.b.gu r3 = com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8533a.C111800h.f310722b
        L_0x008f:
            r1.mo99249a(r2, r10, r3)
        L_0x0092:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.C111825ap.mo99257a(com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ep):com.google.common.util.concurrent.cx");
    }

    /* renamed from: b */
    public final C60870cx mo99258b(C113405ep epVar, Bundle bundle) {
        List list;
        Optional optional;
        Optional optional2;
        C111521c cVar = (C111521c) this.f310764A.mo27525b();
        String string = bundle.getString("prefix");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("corrections");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("htmlCorrections");
        try {
            list = ProtoParsers.m95528k(bundle, "styledTextCorrections", alf.f135314d, C62921ba.m95368a());
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) C111520b.f310194a.mo56225c()).mo56382g(e)).mo56372aa(27218)).mo56386p("failed to parse styledText Corrections ");
            list = null;
        }
        if (string == null || stringArrayList == null || stringArrayList2 == null || list == null) {
            C59052c cVar2 = (C59052c) ((C59052c) C111520b.f310194a.mo56226d()).mo56372aa(27217);
            boolean z = true;
            Boolean valueOf = Boolean.valueOf(string != null);
            Boolean valueOf2 = Boolean.valueOf(stringArrayList != null);
            Boolean valueOf3 = Boolean.valueOf(stringArrayList2 != null);
            if (list == null) {
                z = false;
            }
            cVar2.mo56360M("Bundle missing info, hasPrefix=%b, hasCorrections=%b, hasHtmlCorrections=%b, hasStyledTextCorrections=%b", valueOf, valueOf2, valueOf3, Boolean.valueOf(z));
            optional = Optional.empty();
        } else {
            optional = Optional.m71637of(new C111519a(string, C58485gu.m89842j(stringArrayList), C58485gu.m89842j(stringArrayList2), C58485gu.m89842j(list)));
        }
        cVar.f310195a = optional;
        int i = bundle.getInt("highlightStart", -1);
        int i2 = bundle.getInt("highlightEnd", -1);
        if (i == -1 || i2 == -1 || i >= i2) {
            optional2 = Optional.empty();
        } else {
            optional2 = Optional.m71637of(new C90735as(i, i2));
        }
        cVar.f310196b = optional2;
        return ((C111521c) this.f310764A.mo27525b()).mo99103c(epVar, C58729pv.f156485a);
    }

    /* renamed from: c */
    public final void mo99259c(C19167ba baVar) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(new C62963cj(baVar.f53676b, C19167ba.f53671c));
        hashSet.addAll(new C62963cj(baVar.f53677d, C19167ba.f53672e));
        Stream stream = Collection.EL.stream(hashSet);
        Map map = ((C111884bv) this.f310770d.mo27525b()).f310885a;
        Objects.requireNonNull(map);
        stream.map(new C111879bq(map)).filter(C111880br.f310881a).map(C111881bs.f310882a).forEach(C111882bt.f310883a);
    }

    /* renamed from: e */
    public final void mo99260e(C19167ba baVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f310765B.mo28213m("warmup mix adjusters", this.f310769c.mo79743a(C90063do.f249590gR), new C112006n(this, baVar));
        C60870cx a = ((C113016o) this.f310768E.mo27525b()).mo99818a(baVar);
        C111812ac acVar = new C111812ac();
        C60856cj.m92911t(a, C47810es.m84974n(acVar), C60826bg.f164896a);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("TapasEngine");
        ((C111806n) this.f310778l.mo27525b()).mo17602gS(fVar.mo85281e((Object) null));
        ((C111948ap) this.f310783q.mo27525b()).mo17602gS(fVar.mo85281e((Object) null));
        fVar.mo85286m(this.f310766C);
        if (this.f310769c.mo79746e(C90063do.f249395ci)) {
            C58485gu o = C58485gu.m89847o(C48672ag.APP_ACTIONS, C48672ag.APP_ACTIONS_SHORTCUT);
            int i = ((C58724pq) o).f156474d;
            for (int i2 = 0; i2 < i; i2++) {
                C69464a b = ((C111884bv) this.f310770d.mo27525b()).mo99272b((C48672ag) o.get(i2));
                if (b != null) {
                    C113409et etVar = (C113409et) b.mo17428b();
                    if (etVar instanceof C90991b) {
                        fVar.mo85286m((C90991b) etVar);
                    }
                }
            }
        }
    }
}
