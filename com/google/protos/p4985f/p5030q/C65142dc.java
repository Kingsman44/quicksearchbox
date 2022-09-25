package com.google.protos.p4985f.p5030q;

import com.google.android.libraries.assistant.gallium.framework.C18204ah;
import com.google.protobuf.MessageLite;
import com.google.protos.p5127o.C65682h;
import com.google.protos.p5127o.C65685k;
import com.google.protos.p5127o.C65686l;

/* renamed from: com.google.protos.f.q.dc */
/* compiled from: PG */
final class C65142dc implements C18204ah {

    /* renamed from: a */
    private static final C65686l f176315a;

    static {
        C65685k kVar = (C65685k) C65686l.f178470d.createBuilder();
        kVar.copyOnWrite();
        C65686l lVar = (C65686l) kVar.instance;
        lVar.f178472a |= 1;
        lVar.f178473b = "assistant.portable.GellerService";
        f176315a = (C65686l) kVar.build();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo23683a(com.google.android.libraries.assistant.gallium.framework.C18211ao r4, com.google.android.libraries.assistant.gallium.framework.C18231d r5, java.lang.String r6, com.google.protos.p5127o.C65693s r7) {
        /*
            r3 = this;
            com.google.protos.f.q.cx r4 = (com.google.protos.p4985f.p5030q.C65132cx) r4
            int r5 = r6.hashCode()
            r0 = 3
            r1 = 2
            r2 = 1
            switch(r5) {
                case -1608566309: goto L_0x002b;
                case -1485415562: goto L_0x0021;
                case -556893734: goto L_0x0017;
                case 1776583868: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0035
        L_0x000d:
            java.lang.String r5 = "ReadKeysFromGellerStorage"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0035
            r5 = 2
            goto L_0x0036
        L_0x0017:
            java.lang.String r5 = "ReadGellerStorage"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0035
            r5 = 1
            goto L_0x0036
        L_0x0021:
            java.lang.String r5 = "WriteToGellerStorage"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0035
            r5 = 0
            goto L_0x0036
        L_0x002b:
            java.lang.String r5 = "DeleteFromGellerStorage"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0035
            r5 = 3
            goto L_0x0036
        L_0x0035:
            r5 = -1
        L_0x0036:
            if (r5 == 0) goto L_0x0093
            if (r5 == r2) goto L_0x007c
            if (r5 == r1) goto L_0x0065
            if (r5 != r0) goto L_0x0055
            com.google.protos.p.a.g r5 = com.google.protos.p5129p.p5130a.C65722g.f178562a
            com.google.protobuf.eb r5 = r5.getParserForType()
            com.google.protobuf.MessageLite r5 = com.google.android.libraries.assistant.gallium.framework.C18214ar.m35469b(r7, r5)
            com.google.protos.p.a.g r5 = (com.google.protos.p5129p.p5130a.C65722g) r5
            com.google.common.util.concurrent.cx r4 = r4.mo59342a()
            com.google.protos.f.q.db r5 = com.google.protos.p4985f.p5030q.C65141db.f176314a
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
            com.google.protos.p.a.y r5 = com.google.protos.p5129p.p5130a.C65740y.f178592d
            com.google.protobuf.eb r5 = r5.getParserForType()
            com.google.protobuf.MessageLite r5 = com.google.android.libraries.assistant.gallium.framework.C18214ar.m35469b(r7, r5)
            com.google.protos.p.a.y r5 = (com.google.protos.p5129p.p5130a.C65740y) r5
            com.google.common.util.concurrent.cx r4 = r4.mo59344c(r5)
            com.google.protos.f.q.da r5 = com.google.protos.p4985f.p5030q.C65140da.f176313a
            com.google.common.util.concurrent.cx r4 = com.google.android.libraries.assistant.gallium.framework.C18209am.m35463a(r4, r5, r6)
            return r4
        L_0x007c:
            com.google.protos.p.a.r r5 = com.google.protos.p5129p.p5130a.C65733r.f178575c
            com.google.protobuf.eb r5 = r5.getParserForType()
            com.google.protobuf.MessageLite r5 = com.google.android.libraries.assistant.gallium.framework.C18214ar.m35469b(r7, r5)
            com.google.protos.p.a.r r5 = (com.google.protos.p5129p.p5130a.C65733r) r5
            com.google.common.util.concurrent.cx r4 = r4.mo59343b(r5)
            com.google.protos.f.q.cz r5 = com.google.protos.p4985f.p5030q.C65134cz.f176300a
            com.google.common.util.concurrent.cx r4 = com.google.android.libraries.assistant.gallium.framework.C18209am.m35463a(r4, r5, r6)
            return r4
        L_0x0093:
            com.google.protos.p.a.ag r5 = com.google.protos.p5129p.p5130a.C65708ag.f178520d
            com.google.protobuf.eb r5 = r5.getParserForType()
            com.google.protobuf.MessageLite r5 = com.google.android.libraries.assistant.gallium.framework.C18214ar.m35469b(r7, r5)
            com.google.protos.p.a.ag r5 = (com.google.protos.p5129p.p5130a.C65708ag) r5
            com.google.common.util.concurrent.cx r4 = r4.mo59345d()
            com.google.protos.f.q.cy r5 = com.google.protos.p4985f.p5030q.C65133cy.f176299a
            com.google.common.util.concurrent.cx r4 = com.google.android.libraries.assistant.gallium.framework.C18209am.m35463a(r4, r5, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protos.p4985f.p5030q.C65142dc.mo23683a(com.google.android.libraries.assistant.gallium.framework.ao, com.google.android.libraries.assistant.gallium.framework.d, java.lang.String, com.google.protos.o.s):com.google.common.util.concurrent.cx");
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ MessageLite mo23684b(C65682h hVar) {
        C65143dd ddVar = (C65143dd) C65144de.f176316c.createBuilder();
        ddVar.copyOnWrite();
        C65144de deVar = (C65144de) ddVar.instance;
        hVar.getClass();
        deVar.f176319b = hVar;
        deVar.f176318a |= 1;
        return (C65144de) ddVar.build();
    }

    /* renamed from: c */
    public final C65686l mo23685c() {
        return f176315a;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo23686d(java.lang.String r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            switch(r0) {
                case -1608566309: goto L_0x0029;
                case -1485415562: goto L_0x001f;
                case -556893734: goto L_0x0015;
                case 1776583868: goto L_0x000b;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0033
        L_0x000b:
            java.lang.String r0 = "ReadKeysFromGellerStorage"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 2
            goto L_0x0034
        L_0x0015:
            java.lang.String r0 = "ReadGellerStorage"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x001f:
            java.lang.String r0 = "WriteToGellerStorage"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 0
            goto L_0x0034
        L_0x0029:
            java.lang.String r0 = "DeleteFromGellerStorage"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 3
            goto L_0x0034
        L_0x0033:
            r0 = -1
        L_0x0034:
            if (r0 == 0) goto L_0x0055
            if (r0 == r3) goto L_0x0052
            if (r0 == r2) goto L_0x004f
            if (r0 != r1) goto L_0x003f
            java.lang.String r5 = "geller.client.DeleteFromGellerStorageRequest"
            return r5
        L_0x003f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown method"
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = r1.concat(r5)
            r0.<init>(r5)
            throw r0
        L_0x004f:
            java.lang.String r5 = "geller.client.ReadKeysFromGellerStorageRequest"
            return r5
        L_0x0052:
            java.lang.String r5 = "geller.client.ReadGellerStorageRequest"
            return r5
        L_0x0055:
            java.lang.String r5 = "geller.client.WriteToGellerStorageRequest"
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protos.p4985f.p5030q.C65142dc.mo23686d(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo23687e(java.lang.String r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            switch(r0) {
                case -1608566309: goto L_0x0029;
                case -1485415562: goto L_0x001f;
                case -556893734: goto L_0x0015;
                case 1776583868: goto L_0x000b;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0033
        L_0x000b:
            java.lang.String r0 = "ReadKeysFromGellerStorage"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 2
            goto L_0x0034
        L_0x0015:
            java.lang.String r0 = "ReadGellerStorage"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x001f:
            java.lang.String r0 = "WriteToGellerStorage"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 0
            goto L_0x0034
        L_0x0029:
            java.lang.String r0 = "DeleteFromGellerStorage"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 3
            goto L_0x0034
        L_0x0033:
            r0 = -1
        L_0x0034:
            if (r0 == 0) goto L_0x0055
            if (r0 == r3) goto L_0x0052
            if (r0 == r2) goto L_0x004f
            if (r0 != r1) goto L_0x003f
            java.lang.String r5 = "geller.client.DeleteFromGellerStorageResponse"
            return r5
        L_0x003f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown method"
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = r1.concat(r5)
            r0.<init>(r5)
            throw r0
        L_0x004f:
            java.lang.String r5 = "geller.client.ReadKeysFromGellerStorageResponse"
            return r5
        L_0x0052:
            java.lang.String r5 = "geller.client.ReadGellerStorageResponse"
            return r5
        L_0x0055:
            java.lang.String r5 = "geller.client.WriteToGellerStorageResponse"
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protos.p4985f.p5030q.C65142dc.mo23687e(java.lang.String):java.lang.String");
    }
}
