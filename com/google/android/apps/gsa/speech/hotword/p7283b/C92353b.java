package com.google.android.apps.gsa.speech.hotword.p7283b;

import com.google.android.apps.gsa.shared.p7066m.C89986ay;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.libraries.search.p3055n.C39811o;
import com.google.android.libraries.search.p3055n.C39813q;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.speech.hotword.b.b */
/* compiled from: PG */
public final class C92353b {

    /* renamed from: b */
    private static final C59071e f257483b = C59071e.m91332i("com.google.android.apps.gsa.speech.hotword.b.b");

    /* renamed from: a */
    C39813q f257484a = null;

    /* renamed from: c */
    private final C90021c f257485c;

    /* renamed from: d */
    private final C58833ax f257486d;

    public C92353b(C90021c cVar, C58833ax axVar) {
        this.f257485c = cVar;
        this.f257486d = axVar;
    }

    /* renamed from: a */
    public static C90584f m151652a(C39811o oVar) {
        C39811o oVar2 = C39811o.PHRASE_UNKNOWN;
        int ordinal = oVar.ordinal();
        if (ordinal == 1) {
            return C90584f.OK_GOOGLE;
        }
        if (ordinal != 2) {
            return C90584f.UNKNOWN;
        }
        return C90584f.OK_HEY_GOOGLE;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [com.google.protobuf.MessageLite] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.libraries.search.p3055n.C39813q m151653c() {
        /*
            r7 = this;
            com.google.android.apps.gsa.shared.m.c r0 = r7.f257485c
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C89986ay.f246744a
            boolean r0 = r0.mo79746e(r1)
            r1 = 0
            if (r0 == 0) goto L_0x009f
            com.google.common.base.ax r2 = r7.f257486d
            boolean r2 = r2.mo56113h()
            if (r2 == 0) goto L_0x009f
            com.google.common.f.e r2 = f257483b
            com.google.common.f.x r2 = r2.mo56224b()
            java.lang.String r3 = "Fetching latest config from MDD..."
            r4 = 12486(0x30c6, float:1.7497E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)
            com.google.common.base.ax r2 = r7.f257486d
            java.lang.Object r2 = r2.mo56107c()
            com.google.android.apps.gsa.shared.speech.hotword.g r2 = (com.google.android.apps.gsa.shared.speech.hotword.C90590g) r2
            com.google.common.f.e r3 = com.google.android.apps.gsa.shared.speech.hotword.C90590g.f253263a
            com.google.common.f.x r3 = r3.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r5 = "HotwordModelConfigFetcher"
            r3.mo56378ag(r4, r5)
            java.lang.String r4 = "fetching config from MDD"
            r5 = 11125(0x2b75, float:1.559E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r5)).mo56386p(r4)
            com.google.android.libraries.assistant.c.b.f.h r3 = r2.f253266d
            if (r3 != 0) goto L_0x0049
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
            com.google.common.util.concurrent.cx r3 = com.google.common.util.concurrent.C60856cj.m92900i(r3)
            goto L_0x0078
        L_0x0049:
            com.google.android.libraries.assistant.c.b.a.a.l r4 = r2.f253265c
            java.lang.String r5 = "*"
            com.google.common.util.concurrent.cx r3 = r3.mo23209a(r4, r5)
            com.google.android.apps.gsa.shared.speech.hotword.f r4 = new com.google.android.apps.gsa.shared.speech.hotword.f
            r4.<init>(r2)
            com.google.android.apps.gsa.shared.util.c.a.k r5 = r2.f253267e
            java.lang.String r6 = "[APA] HotwordModelConfigFetcher: reading config from device storage with caching"
            com.google.common.util.concurrent.db r5 = r5.mo85208a(r6)
            com.google.common.base.ah r4 = com.google.apps.tiktok.tracing.C47810es.m84963c(r4)
            com.google.common.util.concurrent.cx r3 = com.google.common.util.concurrent.C60922j.m93044g(r3, r4, r5)
            com.google.android.apps.gsa.shared.speech.hotword.e r4 = com.google.android.apps.gsa.shared.speech.hotword.C90588e.f253260a
            com.google.android.apps.gsa.shared.util.c.a.k r5 = r2.f253267e
            com.google.common.util.concurrent.db r5 = r5.mo85208a(r6)
            java.lang.Class<java.lang.Exception> r6 = java.lang.Exception.class
            com.google.common.base.ah r4 = com.google.apps.tiktok.tracing.C47810es.m84963c(r4)
            com.google.common.util.concurrent.cx r3 = com.google.common.util.concurrent.C60846c.m92878g(r3, r6, r4, r5)
        L_0x0078:
            com.google.android.apps.gsa.shared.speech.hotword.d r4 = com.google.android.apps.gsa.shared.speech.hotword.C90587d.f253259a
            com.google.android.apps.gsa.shared.util.c.a.k r2 = r2.f253267e
            java.lang.String r5 = "Updating hotword config"
            com.google.common.util.concurrent.db r2 = r2.mo85209b(r5)
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60922j.m93044g(r3, r4, r2)
            java.lang.Object r2 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148472f(r2)     // Catch:{ InterruptedException | ExecutionException -> 0x009a }
            j$.util.Optional r2 = (p3186j$.util.Optional) r2     // Catch:{ InterruptedException | ExecutionException -> 0x009a }
            boolean r3 = r2.isPresent()     // Catch:{ InterruptedException | ExecutionException -> 0x009a }
            if (r3 == 0) goto L_0x009b
            java.lang.Object r2 = r2.get()     // Catch:{ InterruptedException | ExecutionException -> 0x009a }
            com.google.android.libraries.search.n.q r2 = (com.google.android.libraries.search.p3055n.C39813q) r2     // Catch:{ InterruptedException | ExecutionException -> 0x009a }
            r1 = r2
            goto L_0x009b
        L_0x009a:
        L_0x009b:
            if (r1 == 0) goto L_0x009f
            r7.f257484a = r1
        L_0x009f:
            r2 = 1
            if (r0 == 0) goto L_0x00a6
            if (r1 != 0) goto L_0x00a5
            goto L_0x00a6
        L_0x00a5:
            r2 = 0
        L_0x00a6:
            if (r1 == 0) goto L_0x00b5
            com.google.protobuf.dn r0 = r1.f104700a
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00b5
            goto L_0x00b8
        L_0x00b5:
            if (r2 != 0) goto L_0x00b8
            goto L_0x00d6
        L_0x00b8:
            com.google.common.f.e r0 = f257483b
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r1 = "Using proto config with mendel"
            r2 = 12484(0x30c4, float:1.7494E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.android.apps.gsa.shared.m.c r0 = r7.f257485c
            com.google.android.apps.gsa.shared.m.g r1 = com.google.android.apps.gsa.shared.p7066m.C89986ay.f246746c
            com.google.android.libraries.search.n.q r2 = com.google.android.libraries.search.p3055n.C39813q.f104698b
            com.google.protobuf.eb r2 = r2.getParserForType()
            com.google.protobuf.MessageLite r0 = r0.mo79754t(r1, r2)
            r1 = r0
            com.google.android.libraries.search.n.q r1 = (com.google.android.libraries.search.p3055n.C39813q) r1
        L_0x00d6:
            if (r1 != 0) goto L_0x00db
            com.google.android.libraries.search.n.q r0 = com.google.android.libraries.search.p3055n.C39813q.f104698b
            return r0
        L_0x00db:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.hotword.p7283b.C92353b.m151653c():com.google.android.libraries.search.n.q");
    }

    /* renamed from: b */
    public final Map mo87002b(C58833ax axVar) {
        C39813q qVar;
        C59071e eVar = f257483b;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(12487)).mo56386p("getLocaleToModelSpecsMap");
        if (!this.f257485c.mo79746e(C89986ay.f246747d)) {
            return Collections.unmodifiableMap(m151653c().f104700a);
        }
        if (this.f257484a == null) {
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(12488)).mo56386p("Last known config is null");
            axVar = C58833ax.m90834k(true);
        }
        if (((Boolean) ((C58847bk) axVar).f156646a).booleanValue()) {
            qVar = m151653c();
        } else {
            qVar = this.f257484a;
        }
        if (qVar != null) {
            return Collections.unmodifiableMap(qVar.f104700a);
        }
        return Collections.unmodifiableMap(C39813q.f104698b.f104700a);
    }
}
