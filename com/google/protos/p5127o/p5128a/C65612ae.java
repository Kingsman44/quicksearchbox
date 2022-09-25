package com.google.protos.p5127o.p5128a;

import com.google.android.libraries.assistant.gallium.framework.C18204ah;
import com.google.protobuf.MessageLite;
import com.google.protos.p5127o.C65682h;
import com.google.protos.p5127o.C65685k;
import com.google.protos.p5127o.C65686l;

/* renamed from: com.google.protos.o.a.ae */
/* compiled from: PG */
final class C65612ae implements C18204ah {

    /* renamed from: a */
    private static final C65686l f178316a;

    static {
        C65685k kVar = (C65685k) C65686l.f178470d.createBuilder();
        kVar.copyOnWrite();
        C65686l lVar = (C65686l) kVar.instance;
        lVar.f178472a |= 1;
        lVar.f178473b = "gallium.api.GenXInterface";
        f178316a = (C65686l) kVar.build();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo23683a(com.google.android.libraries.assistant.gallium.framework.C18211ao r4, com.google.android.libraries.assistant.gallium.framework.C18231d r5, java.lang.String r6, com.google.protos.p5127o.C65693s r7) {
        /*
            r3 = this;
            com.google.protos.o.a.y r4 = (com.google.protos.p5127o.p5128a.C65644y) r4
            int r5 = r6.hashCode()
            r0 = 3
            r1 = 2
            r2 = 1
            switch(r5) {
                case -1549661482: goto L_0x002b;
                case -1301838411: goto L_0x0021;
                case 479510744: goto L_0x0017;
                case 1780444206: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0035
        L_0x000d:
            java.lang.String r5 = "RealizeWithExperimentFlags"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0035
            r5 = 1
            goto L_0x0036
        L_0x0017:
            java.lang.String r5 = "RealizeWithExperimentFlagsAndDebugInfo"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0035
            r5 = 3
            goto L_0x0036
        L_0x0021:
            java.lang.String r5 = "RealizeWithDebugInformation"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0035
            r5 = 2
            goto L_0x0036
        L_0x002b:
            java.lang.String r5 = "Realize"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0035
            r5 = 0
            goto L_0x0036
        L_0x0035:
            r5 = -1
        L_0x0036:
            if (r5 == 0) goto L_0x0093
            if (r5 == r2) goto L_0x007c
            if (r5 == r1) goto L_0x0065
            if (r5 != r0) goto L_0x0055
            com.google.protos.o.a.v r5 = com.google.protos.p5127o.p5128a.C65641v.f178364a
            com.google.protobuf.eb r5 = r5.getParserForType()
            com.google.protobuf.MessageLite r5 = com.google.android.libraries.assistant.gallium.framework.C18214ar.m35469b(r7, r5)
            com.google.protos.o.a.v r5 = (com.google.protos.p5127o.p5128a.C65641v) r5
            com.google.common.util.concurrent.cx r4 = r4.mo59415d()
            com.google.protos.o.a.ad r5 = com.google.protos.p5127o.p5128a.C65611ad.f178315a
            com.google.common.util.concurrent.cx r4 = com.google.android.libraries.assistant.gallium.framework.C18209am.m35463a(r4, r5, r6)
            return r4
        L_0x0055:
            java.lang.String r4 = java.lang.String.valueOf(r6)
            java.lang.String r5 = " not found"
            java.lang.String r4 = r4.concat(r5)
            r5 = 5
            com.google.android.libraries.assistant.gallium.framework.av r4 = com.google.android.libraries.assistant.gallium.framework.C18218av.m35478a(r5, r4)
            throw r4
        L_0x0065:
            com.google.nlp.a.s r5 = com.google.nlp.p4730a.C62799s.f169588g
            com.google.protobuf.eb r5 = r5.getParserForType()
            com.google.protobuf.MessageLite r5 = com.google.android.libraries.assistant.gallium.framework.C18214ar.m35469b(r7, r5)
            com.google.nlp.a.s r5 = (com.google.nlp.p4730a.C62799s) r5
            com.google.common.util.concurrent.cx r4 = r4.mo59413b()
            com.google.protos.o.a.ac r5 = com.google.protos.p5127o.p5128a.C65610ac.f178314a
            com.google.common.util.concurrent.cx r4 = com.google.android.libraries.assistant.gallium.framework.C18209am.m35463a(r4, r5, r6)
            return r4
        L_0x007c:
            com.google.protos.o.a.v r5 = com.google.protos.p5127o.p5128a.C65641v.f178364a
            com.google.protobuf.eb r5 = r5.getParserForType()
            com.google.protobuf.MessageLite r5 = com.google.android.libraries.assistant.gallium.framework.C18214ar.m35469b(r7, r5)
            com.google.protos.o.a.v r5 = (com.google.protos.p5127o.p5128a.C65641v) r5
            com.google.common.util.concurrent.cx r4 = r4.mo59414c()
            com.google.protos.o.a.ab r5 = com.google.protos.p5127o.p5128a.C65609ab.f178313a
            com.google.common.util.concurrent.cx r4 = com.google.android.libraries.assistant.gallium.framework.C18209am.m35463a(r4, r5, r6)
            return r4
        L_0x0093:
            com.google.nlp.a.s r5 = com.google.nlp.p4730a.C62799s.f169588g
            com.google.protobuf.eb r5 = r5.getParserForType()
            com.google.protobuf.MessageLite r5 = com.google.android.libraries.assistant.gallium.framework.C18214ar.m35469b(r7, r5)
            com.google.nlp.a.s r5 = (com.google.nlp.p4730a.C62799s) r5
            com.google.common.util.concurrent.cx r4 = r4.mo59412a()
            com.google.protos.o.a.aa r5 = com.google.protos.p5127o.p5128a.C65608aa.f178312a
            com.google.common.util.concurrent.cx r4 = com.google.android.libraries.assistant.gallium.framework.C18209am.m35463a(r4, r5, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protos.p5127o.p5128a.C65612ae.mo23683a(com.google.android.libraries.assistant.gallium.framework.ao, com.google.android.libraries.assistant.gallium.framework.d, java.lang.String, com.google.protos.o.s):com.google.common.util.concurrent.cx");
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ MessageLite mo23684b(C65682h hVar) {
        C65638s sVar = (C65638s) C65639t.f178360c.createBuilder();
        sVar.copyOnWrite();
        C65639t tVar = (C65639t) sVar.instance;
        hVar.getClass();
        tVar.f178363b = hVar;
        tVar.f178362a |= 1;
        return (C65639t) sVar.build();
    }

    /* renamed from: c */
    public final C65686l mo23685c() {
        return f178316a;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo23686d(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = r7.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            switch(r0) {
                case -1549661482: goto L_0x0029;
                case -1301838411: goto L_0x001f;
                case 479510744: goto L_0x0015;
                case 1780444206: goto L_0x000b;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0033
        L_0x000b:
            java.lang.String r0 = "RealizeWithExperimentFlags"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x0015:
            java.lang.String r0 = "RealizeWithExperimentFlagsAndDebugInfo"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 3
            goto L_0x0034
        L_0x001f:
            java.lang.String r0 = "RealizeWithDebugInformation"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 2
            goto L_0x0034
        L_0x0029:
            java.lang.String r0 = "Realize"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 0
            goto L_0x0034
        L_0x0033:
            r0 = -1
        L_0x0034:
            java.lang.String r4 = "nlp_generation.RealizationRequest"
            if (r0 == 0) goto L_0x0053
            java.lang.String r5 = "gallium.api.RealizationRequestWithExperimentFlags"
            if (r0 == r3) goto L_0x0052
            if (r0 == r2) goto L_0x0051
            if (r0 != r1) goto L_0x0041
            return r5
        L_0x0041:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown method"
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L_0x0051:
            return r4
        L_0x0052:
            return r5
        L_0x0053:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protos.p5127o.p5128a.C65612ae.mo23686d(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo23687e(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = r6.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            switch(r0) {
                case -1549661482: goto L_0x0029;
                case -1301838411: goto L_0x001f;
                case 479510744: goto L_0x0015;
                case 1780444206: goto L_0x000b;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0033
        L_0x000b:
            java.lang.String r0 = "RealizeWithExperimentFlags"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x0015:
            java.lang.String r0 = "RealizeWithExperimentFlagsAndDebugInfo"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 3
            goto L_0x0034
        L_0x001f:
            java.lang.String r0 = "RealizeWithDebugInformation"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 2
            goto L_0x0034
        L_0x0029:
            java.lang.String r0 = "Realize"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 0
            goto L_0x0034
        L_0x0033:
            r0 = -1
        L_0x0034:
            java.lang.String r4 = "nlp_generation.RealizationResponse"
            if (r0 == 0) goto L_0x0052
            if (r0 == r3) goto L_0x0052
            java.lang.String r3 = "gallium.api.RealizedResponseWithDebugInfo"
            if (r0 == r2) goto L_0x0051
            if (r0 != r1) goto L_0x0041
            return r3
        L_0x0041:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown method"
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r6 = r1.concat(r6)
            r0.<init>(r6)
            throw r0
        L_0x0051:
            return r3
        L_0x0052:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protos.p5127o.p5128a.C65612ae.mo23687e(java.lang.String):java.lang.String");
    }
}
