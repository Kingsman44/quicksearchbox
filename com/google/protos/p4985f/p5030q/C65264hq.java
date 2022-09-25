package com.google.protos.p4985f.p5030q;

import com.google.android.libraries.assistant.gallium.framework.C18204ah;
import com.google.protobuf.MessageLite;
import com.google.protos.p5127o.C65682h;
import com.google.protos.p5127o.C65685k;
import com.google.protos.p5127o.C65686l;

/* renamed from: com.google.protos.f.q.hq */
/* compiled from: PG */
final class C65264hq implements C18204ah {

    /* renamed from: a */
    private static final C65686l f176570a;

    static {
        C65685k kVar = (C65685k) C65686l.f178470d.createBuilder();
        kVar.copyOnWrite();
        C65686l lVar = (C65686l) kVar.instance;
        lVar.f178472a |= 1;
        lVar.f178473b = "assistant.portable.PortableProviderCorpusInterface";
        f176570a = (C65686l) kVar.build();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo23683a(com.google.android.libraries.assistant.gallium.framework.C18211ao r6, com.google.android.libraries.assistant.gallium.framework.C18231d r7, java.lang.String r8, com.google.protos.p5127o.C65693s r9) {
        /*
            r5 = this;
            com.google.protos.f.q.hi r6 = (com.google.protos.p4985f.p5030q.C65256hi) r6
            int r7 = r8.hashCode()
            r0 = 4
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 5
            switch(r7) {
                case -2124103748: goto L_0x0041;
                case -2100731432: goto L_0x0037;
                case -1028607920: goto L_0x002d;
                case 258086621: goto L_0x0023;
                case 655091489: goto L_0x0019;
                case 1455736235: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x004b
        L_0x000f:
            java.lang.String r7 = "LookupProvider"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x004b
            r7 = 0
            goto L_0x004c
        L_0x0019:
            java.lang.String r7 = "GetAppControlProviderList"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x004b
            r7 = 4
            goto L_0x004c
        L_0x0023:
            java.lang.String r7 = "FindProviderByIntent"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x004b
            r7 = 2
            goto L_0x004c
        L_0x002d:
            java.lang.String r7 = "FindProviderByPackageName"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x004b
            r7 = 3
            goto L_0x004c
        L_0x0037:
            java.lang.String r7 = "MatchProviderByName"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x004b
            r7 = 1
            goto L_0x004c
        L_0x0041:
            java.lang.String r7 = "FindProviderByWebIdentifier"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x004b
            r7 = 5
            goto L_0x004c
        L_0x004b:
            r7 = -1
        L_0x004c:
            if (r7 == 0) goto L_0x00da
            if (r7 == r3) goto L_0x00c3
            if (r7 == r2) goto L_0x00ac
            if (r7 == r1) goto L_0x0095
            if (r7 == r0) goto L_0x007e
            if (r7 != r4) goto L_0x006f
            com.google.protos.f.q.ci r7 = com.google.protos.p4985f.p5030q.C65117ci.f176276a
            com.google.protobuf.eb r7 = r7.getParserForType()
            com.google.protobuf.MessageLite r7 = com.google.android.libraries.assistant.gallium.framework.C18214ar.m35469b(r9, r7)
            com.google.protos.f.q.ci r7 = (com.google.protos.p4985f.p5030q.C65117ci) r7
            com.google.common.util.concurrent.cx r6 = r6.mo59371c()
            com.google.protos.f.q.hp r7 = com.google.protos.p4985f.p5030q.C65263hp.f176569a
            com.google.common.util.concurrent.cx r6 = com.google.android.libraries.assistant.gallium.framework.C18209am.m35463a(r6, r7, r8)
            return r6
        L_0x006f:
            java.lang.String r6 = java.lang.String.valueOf(r8)
            java.lang.String r7 = " not found"
            java.lang.String r6 = r6.concat(r7)
            com.google.android.libraries.assistant.gallium.framework.av r6 = com.google.android.libraries.assistant.gallium.framework.C18218av.m35478a(r4, r6)
            throw r6
        L_0x007e:
            com.google.protos.f.q.dg r7 = com.google.protos.p4985f.p5030q.C65146dg.f176320a
            com.google.protobuf.eb r7 = r7.getParserForType()
            com.google.protobuf.MessageLite r7 = com.google.android.libraries.assistant.gallium.framework.C18214ar.m35469b(r9, r7)
            com.google.protos.f.q.dg r7 = (com.google.protos.p4985f.p5030q.C65146dg) r7
            com.google.common.util.concurrent.cx r6 = r6.mo59372d()
            com.google.protos.f.q.ho r7 = com.google.protos.p4985f.p5030q.C65262ho.f176568a
            com.google.common.util.concurrent.cx r6 = com.google.android.libraries.assistant.gallium.framework.C18209am.m35463a(r6, r7, r8)
            return r6
        L_0x0095:
            com.google.protos.f.q.ce r7 = com.google.protos.p4985f.p5030q.C65113ce.f176272a
            com.google.protobuf.eb r7 = r7.getParserForType()
            com.google.protobuf.MessageLite r7 = com.google.android.libraries.assistant.gallium.framework.C18214ar.m35469b(r9, r7)
            com.google.protos.f.q.ce r7 = (com.google.protos.p4985f.p5030q.C65113ce) r7
            com.google.common.util.concurrent.cx r6 = r6.mo59370b()
            com.google.protos.f.q.hn r7 = com.google.protos.p4985f.p5030q.C65261hn.f176567a
            com.google.common.util.concurrent.cx r6 = com.google.android.libraries.assistant.gallium.framework.C18209am.m35463a(r6, r7, r8)
            return r6
        L_0x00ac:
            com.google.protos.f.q.ca r7 = com.google.protos.p4985f.p5030q.C65109ca.f176268a
            com.google.protobuf.eb r7 = r7.getParserForType()
            com.google.protobuf.MessageLite r7 = com.google.android.libraries.assistant.gallium.framework.C18214ar.m35469b(r9, r7)
            com.google.protos.f.q.ca r7 = (com.google.protos.p4985f.p5030q.C65109ca) r7
            com.google.common.util.concurrent.cx r6 = r6.mo59369a()
            com.google.protos.f.q.hm r7 = com.google.protos.p4985f.p5030q.C65260hm.f176566a
            com.google.common.util.concurrent.cx r6 = com.google.android.libraries.assistant.gallium.framework.C18209am.m35463a(r6, r7, r8)
            return r6
        L_0x00c3:
            com.google.protos.f.q.ie r7 = com.google.protos.p4985f.p5030q.C65279ie.f176589a
            com.google.protobuf.eb r7 = r7.getParserForType()
            com.google.protobuf.MessageLite r7 = com.google.android.libraries.assistant.gallium.framework.C18214ar.m35469b(r9, r7)
            com.google.protos.f.q.ie r7 = (com.google.protos.p4985f.p5030q.C65279ie) r7
            com.google.common.util.concurrent.cx r6 = r6.mo59374f()
            com.google.protos.f.q.hl r7 = com.google.protos.p4985f.p5030q.C65259hl.f176565a
            com.google.common.util.concurrent.cx r6 = com.google.android.libraries.assistant.gallium.framework.C18209am.m35463a(r6, r7, r8)
            return r6
        L_0x00da:
            com.google.protos.f.q.ia r7 = com.google.protos.p4985f.p5030q.C65275ia.f176583b
            com.google.protobuf.eb r7 = r7.getParserForType()
            com.google.protobuf.MessageLite r7 = com.google.android.libraries.assistant.gallium.framework.C18214ar.m35469b(r9, r7)
            com.google.protos.f.q.ia r7 = (com.google.protos.p4985f.p5030q.C65275ia) r7
            com.google.common.util.concurrent.cx r6 = r6.mo59373e()
            com.google.protos.f.q.hk r7 = com.google.protos.p4985f.p5030q.C65258hk.f176564a
            com.google.common.util.concurrent.cx r6 = com.google.android.libraries.assistant.gallium.framework.C18209am.m35463a(r6, r7, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protos.p4985f.p5030q.C65264hq.mo23683a(com.google.android.libraries.assistant.gallium.framework.ao, com.google.android.libraries.assistant.gallium.framework.d, java.lang.String, com.google.protos.o.s):com.google.common.util.concurrent.cx");
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ MessageLite mo23684b(C65682h hVar) {
        C65265hr hrVar = (C65265hr) C65266hs.f176571c.createBuilder();
        hrVar.copyOnWrite();
        C65266hs hsVar = (C65266hs) hrVar.instance;
        hVar.getClass();
        hsVar.f176574b = hVar;
        hsVar.f176573a |= 1;
        return (C65266hs) hrVar.build();
    }

    /* renamed from: c */
    public final C65686l mo23685c() {
        return f176570a;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo23686d(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = r7.hashCode()
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r0) {
                case -2124103748: goto L_0x003f;
                case -2100731432: goto L_0x0035;
                case -1028607920: goto L_0x002b;
                case 258086621: goto L_0x0021;
                case 655091489: goto L_0x0017;
                case 1455736235: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0049
        L_0x000d:
            java.lang.String r0 = "LookupProvider"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 0
            goto L_0x004a
        L_0x0017:
            java.lang.String r0 = "GetAppControlProviderList"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 4
            goto L_0x004a
        L_0x0021:
            java.lang.String r0 = "FindProviderByIntent"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 2
            goto L_0x004a
        L_0x002b:
            java.lang.String r0 = "FindProviderByPackageName"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 3
            goto L_0x004a
        L_0x0035:
            java.lang.String r0 = "MatchProviderByName"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 1
            goto L_0x004a
        L_0x003f:
            java.lang.String r0 = "FindProviderByWebIdentifier"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 5
            goto L_0x004a
        L_0x0049:
            r0 = -1
        L_0x004a:
            if (r0 == 0) goto L_0x0075
            if (r0 == r5) goto L_0x0072
            if (r0 == r4) goto L_0x006f
            if (r0 == r3) goto L_0x006c
            if (r0 == r2) goto L_0x0069
            if (r0 != r1) goto L_0x0059
            java.lang.String r7 = "assistant.portable.FindProviderByWebIdentifierRequest"
            return r7
        L_0x0059:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown method"
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L_0x0069:
            java.lang.String r7 = "assistant.portable.GetAppControlProviderListRequest"
            return r7
        L_0x006c:
            java.lang.String r7 = "assistant.portable.FindProviderByPackageNameRequest"
            return r7
        L_0x006f:
            java.lang.String r7 = "assistant.portable.FindProviderByIntentRequest"
            return r7
        L_0x0072:
            java.lang.String r7 = "assistant.portable.ProviderNameRequest"
            return r7
        L_0x0075:
            java.lang.String r7 = "assistant.portable.ProviderLookupRequest"
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protos.p4985f.p5030q.C65264hq.mo23686d(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo23687e(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = r7.hashCode()
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r0) {
                case -2124103748: goto L_0x003f;
                case -2100731432: goto L_0x0035;
                case -1028607920: goto L_0x002b;
                case 258086621: goto L_0x0021;
                case 655091489: goto L_0x0017;
                case 1455736235: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0049
        L_0x000d:
            java.lang.String r0 = "LookupProvider"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 0
            goto L_0x004a
        L_0x0017:
            java.lang.String r0 = "GetAppControlProviderList"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 4
            goto L_0x004a
        L_0x0021:
            java.lang.String r0 = "FindProviderByIntent"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 2
            goto L_0x004a
        L_0x002b:
            java.lang.String r0 = "FindProviderByPackageName"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 3
            goto L_0x004a
        L_0x0035:
            java.lang.String r0 = "MatchProviderByName"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 1
            goto L_0x004a
        L_0x003f:
            java.lang.String r0 = "FindProviderByWebIdentifier"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 5
            goto L_0x004a
        L_0x0049:
            r0 = -1
        L_0x004a:
            if (r0 == 0) goto L_0x0075
            if (r0 == r5) goto L_0x0072
            if (r0 == r4) goto L_0x006f
            if (r0 == r3) goto L_0x006c
            if (r0 == r2) goto L_0x0069
            if (r0 != r1) goto L_0x0059
            java.lang.String r7 = "assistant.portable.FindProviderByWebIdentifierResponse"
            return r7
        L_0x0059:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown method"
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L_0x0069:
            java.lang.String r7 = "assistant.portable.GetAppControlProviderListResponse"
            return r7
        L_0x006c:
            java.lang.String r7 = "assistant.portable.FindProviderByPackageNameResponse"
            return r7
        L_0x006f:
            java.lang.String r7 = "assistant.portable.FindProviderByIntentResponse"
            return r7
        L_0x0072:
            java.lang.String r7 = "assistant.portable.ProviderNameResponse"
            return r7
        L_0x0075:
            java.lang.String r7 = "assistant.portable.ProviderLookupResponse"
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protos.p4985f.p5030q.C65264hq.mo23687e(java.lang.String):java.lang.String");
    }
}
