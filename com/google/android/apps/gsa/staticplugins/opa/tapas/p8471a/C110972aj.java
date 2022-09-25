package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C89988b;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.C90726aj;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8552k.C112127m;
import com.google.assistant.p3781ad.p3789d.C48582b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import p3186j$.util.Collection;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.aj */
/* compiled from: PG */
public final class C110972aj implements C90991b {

    /* renamed from: a */
    public static final C59071e f309144a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.a.aj");

    /* renamed from: b */
    public static final C90726aj f309145b = new C90726aj(";", ":");

    /* renamed from: c */
    public final C86124t f309146c;

    /* renamed from: d */
    public C60870cx f309147d = C60856cj.m92900i(C58729pv.f156485a);

    /* renamed from: e */
    public C60870cx f309148e = C60856cj.m92900i(C58729pv.f156485a);

    /* renamed from: f */
    private final C112127m f309149f;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x007c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C110972aj(com.google.android.libraries.gsa.p1876k.C22871g r6, com.google.android.apps.gsa.search.core.p6805i.C86124t r7, com.google.android.apps.gsa.staticplugins.opa.tapas.p8552k.C112127m r8, dagger.C68214a r9) {
        /*
            r5 = this;
            r5.<init>()
            com.google.common.b.hd r0 = com.google.common.p4522b.C58729pv.f156485a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            r5.f309147d = r0
            com.google.common.b.hd r0 = com.google.common.p4522b.C58729pv.f156485a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            r5.f309148e = r0
            r5.f309146c = r7
            r5.f309149f = r8
            java.lang.Object r7 = r9.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.tapas.k.q r7 = (com.google.android.apps.gsa.staticplugins.opa.tapas.p8552k.C112131q) r7
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.search.core.i.t r9 = r7.f311377b
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249315bH
            boolean r9 = r9.mo79746e(r0)
            r0 = 1
            r1 = 0
            if (r9 == 0) goto L_0x005f
            com.google.android.apps.gsa.search.core.i.t r9 = r7.f311377b
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249316bI
            boolean r9 = r9.mo79746e(r2)
            if (r9 != 0) goto L_0x0036
            goto L_0x005f
        L_0x0036:
            java.lang.String r9 = "tapas_setting_first_run_mdd"
            boolean r2 = r7.mo99413e(r9)
            if (r2 != 0) goto L_0x003f
            goto L_0x005f
        L_0x003f:
            boolean r2 = r7.mo99411c()
            if (r2 != 0) goto L_0x0049
            r7.mo99410b(r9)
            goto L_0x005f
        L_0x0049:
            com.google.common.f.e r7 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8552k.C112131q.f311376a
            com.google.common.f.x r7 = r7.mo56224b()
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "TapasSync"
            r7.mo56378ag(r9, r2)
            java.lang.String r9 = "#setInitialDownloadRunForMdd: MDD sync required."
            r2 = 27594(0x6bca, float:3.8667E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r2)).mo56386p(r9)
            r7 = 1
            goto L_0x0060
        L_0x005f:
            r7 = 0
        L_0x0060:
            com.google.android.apps.gsa.staticplugins.opa.tapas.k.b.a r9 = r8.f311357b
            com.google.android.libraries.assistant.s.a.c r9 = r9.mo99400a()
            com.google.android.apps.gsa.staticplugins.opa.tapas.k.b.a r2 = r8.f311357b
            com.google.android.libraries.assistant.s.a.c r2 = r2.mo99400a()
            if (r2 != 0) goto L_0x007c
            java.lang.String r7 = "#readFileGroup: can't get AppIntegrationEngines"
            java.lang.Object[] r9 = new java.lang.Object[r1]
            r8.mo99407h(r0, r7, r9)
            com.google.common.b.hd r7 = com.google.common.p4522b.C58729pv.f156485a
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60856cj.m92900i(r7)
            goto L_0x00dc
        L_0x007c:
            com.google.android.libraries.assistant.s.c.b r1 = com.google.android.libraries.assistant.p1594s.p1599c.C19200b.f53754f
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.libraries.assistant.s.c.a r1 = (com.google.android.libraries.assistant.p1594s.p1599c.C19199a) r1
            com.google.android.libraries.assistant.s.c.j r2 = com.google.android.libraries.assistant.p1594s.p1599c.C19208j.f53782h
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.assistant.s.c.i r2 = (com.google.android.libraries.assistant.p1594s.p1599c.C19207i) r2
            java.lang.String r3 = "assistant_appintegration_appactions_config"
            r2.mo24316a(r3)
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.libraries.assistant.s.c.j r3 = (com.google.android.libraries.assistant.p1594s.p1599c.C19208j) r3
            int r4 = r3.f53784a
            r4 = r4 | 2
            r3.f53784a = r4
            r3.f53789f = r0
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.android.libraries.assistant.s.c.j r0 = (com.google.android.libraries.assistant.p1594s.p1599c.C19208j) r0
            int r3 = r0.f53784a
            r3 = r3 | 4
            r0.f53784a = r3
            r0.f53790g = r7
            r1.copyOnWrite()
            com.google.protobuf.bv r7 = r1.instance
            com.google.android.libraries.assistant.s.c.b r7 = (com.google.android.libraries.assistant.p1594s.p1599c.C19200b) r7
            com.google.protobuf.bv r0 = r2.build()
            com.google.android.libraries.assistant.s.c.j r0 = (com.google.android.libraries.assistant.p1594s.p1599c.C19208j) r0
            r0.getClass()
            r7.f53760e = r0
            int r0 = r7.f53756a
            r0 = r0 | 256(0x100, float:3.59E-43)
            r7.f53756a = r0
            com.google.protobuf.bv r7 = r1.build()
            com.google.android.libraries.assistant.s.c.b r7 = (com.google.android.libraries.assistant.p1594s.p1599c.C19200b) r7
            com.google.common.util.concurrent.cx r7 = r9.mo24295b(r7)
            com.google.android.apps.gsa.staticplugins.opa.tapas.k.l r9 = new com.google.android.apps.gsa.staticplugins.opa.tapas.k.l
            r9.<init>(r8)
            com.google.common.util.concurrent.bg r0 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60922j.m93044g(r7, r9, r0)
        L_0x00dc:
            com.google.android.apps.gsa.staticplugins.opa.tapas.a.ah r9 = new com.google.android.apps.gsa.staticplugins.opa.tapas.a.ah
            r9.<init>(r8)
            com.google.common.util.concurrent.bg r8 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60922j.m93044g(r7, r9, r8)
            r5.f309147d = r8
            java.lang.String r8 = "generate EntityTypeToAA Map"
            com.google.android.apps.gsa.staticplugins.opa.tapas.a.ai r9 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C110971ai.f309143a
            com.google.common.util.concurrent.cx r6 = r6.mo28209i(r7, r8, r9)
            r5.f309148e = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C110972aj.<init>(com.google.android.libraries.gsa.k.g, com.google.android.apps.gsa.search.core.i.t, com.google.android.apps.gsa.staticplugins.opa.tapas.k.m, dagger.a):void");
    }

    /* renamed from: i */
    private final C58485gu m184765i(int i) {
        C58495hd a = f309145b.mo85085a(this.f309146c.mo79758x(C90063do.f249637m));
        int i2 = i - 1;
        C58485gu m = C58485gu.m89845m();
        if (i != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            if (a.containsKey(sb.toString())) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i2);
                String str = (String) a.get(sb2.toString());
                if (str != null) {
                    return C89988b.m146551d(str);
                }
            }
            return m;
        }
        throw null;
    }

    /* renamed from: a */
    public final C48582b mo98996a(String str) {
        for (C48582b bVar : C48582b.values()) {
            if (mo99002h(bVar).equals(str)) {
                return bVar;
            }
        }
        return C48582b.UNKNOWN_ACTION;
    }

    /* renamed from: c */
    public final C60870cx mo98998c(String str) {
        return C60856cj.m92895d(mo99001g(str), this.f309148e).mo57334a(new C110966ad(this, str), C60826bg.f164896a);
    }

    /* renamed from: e */
    public final C60870cx mo98999e(C48582b bVar) {
        return mo99000f(mo99002h(bVar), C58729pv.f156485a);
    }

    /* renamed from: f */
    public final C60870cx mo99000f(String str, Map map) {
        return C60922j.m93044g(this.f309147d, new C110968af(str, map), C60826bg.f164896a);
    }

    /* renamed from: g */
    public final C60870cx mo99001g(String str) {
        return C60922j.m93044g(this.f309148e, new C110969ag(str), C60826bg.f164896a);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        if (this.f309146c.mo79746e(C90063do.f249395ci)) {
            fVar.mo85291r(getClass().getSimpleName());
            if (C90877ak.m148480n(this.f309147d)) {
                try {
                    fVar.mo85279c("biiMap entry count").mo85276a(C90752i.m148230d(Integer.valueOf(((Map) C60856cj.m92909r(this.f309147d)).size())));
                } catch (ExecutionException unused) {
                    fVar.mo85279c("biiMap entry count").mo85276a(C90752i.m148229c("biiMapFuture failed to unwrap even when MoreFutures.isSucceeded() is true."));
                }
            } else if (C90877ak.m148479m(this.f309147d, Throwable.class)) {
                fVar.mo85279c("biiMap entry count").mo85276a(C90752i.m148229c("biiMapFuture failed."));
            } else {
                fVar.mo85279c("biiMap entry count").mo85276a(C90752i.m148229c("biiMapFuture not completed yet."));
            }
            this.f309149f.mo17602gS(fVar.mo85281e((Object) null));
        }
    }

    /* renamed from: h */
    public final String mo99002h(C48582b bVar) {
        return "actions.intent.".concat(String.valueOf(bVar.name()));
    }

    /* renamed from: b */
    public final C58485gu mo98997b(C111062l lVar, boolean z, boolean z2) {
        if (z && z2) {
            return (C58485gu) Stream.CC.concat(Collection.EL.stream(m184765i(lVar.mo99015h())), Collection.EL.stream(lVar.mo99011e())).distinct().collect(C58370cn.f155946a);
        }
        if (z) {
            return (C58485gu) Collection.EL.stream(m184765i(lVar.mo99015h())).distinct().collect(C58370cn.f155946a);
        }
        if (z2) {
            return (C58485gu) Collection.EL.stream(lVar.mo99011e()).distinct().collect(C58370cn.f155946a);
        }
        return C58485gu.m89845m();
    }
}
