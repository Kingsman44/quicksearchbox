package com.google.protos.p4985f.p5030q;

import com.google.android.libraries.assistant.gallium.framework.C18204ah;
import com.google.protobuf.MessageLite;
import com.google.protos.p5127o.C65682h;
import com.google.protos.p5127o.C65685k;
import com.google.protos.p5127o.C65686l;

/* renamed from: com.google.protos.f.q.gh */
/* compiled from: PG */
final class C65228gh implements C18204ah {

    /* renamed from: a */
    private static final C65686l f176513a;

    static {
        C65685k kVar = (C65685k) C65686l.f178470d.createBuilder();
        kVar.copyOnWrite();
        C65686l lVar = (C65686l) kVar.instance;
        lVar.f178472a |= 1;
        lVar.f178473b = "assistant.portable.PortableAssistantService";
        f176513a = (C65686l) kVar.build();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo23683a(com.google.android.libraries.assistant.gallium.framework.C18211ao r5, com.google.android.libraries.assistant.gallium.framework.C18231d r6, java.lang.String r7, com.google.protos.p5127o.C65693s r8) {
        /*
            r4 = this;
            com.google.protos.f.q.ga r5 = (com.google.protos.p4985f.p5030q.C65221ga) r5
            int r6 = r7.hashCode()
            r0 = 4
            r1 = 3
            r2 = 2
            r3 = 1
            switch(r6) {
                case -1711145952: goto L_0x0036;
                case -1430411344: goto L_0x002c;
                case 2141716: goto L_0x0022;
                case 1697049651: goto L_0x0018;
                case 1697572948: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0040
        L_0x000e:
            java.lang.String r6 = "UpdateUser"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x0040
            r6 = 2
            goto L_0x0041
        L_0x0018:
            java.lang.String r6 = "UpdateData"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x0040
            r6 = 1
            goto L_0x0041
        L_0x0022:
            java.lang.String r6 = "Dump"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x0040
            r6 = 3
            goto L_0x0041
        L_0x002c:
            java.lang.String r6 = "Initialize"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x0040
            r6 = 0
            goto L_0x0041
        L_0x0036:
            java.lang.String r6 = "WarmUp"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x0040
            r6 = 4
            goto L_0x0041
        L_0x0040:
            r6 = -1
        L_0x0041:
            if (r6 == 0) goto L_0x00b7
            if (r6 == r3) goto L_0x00a0
            if (r6 == r2) goto L_0x0089
            if (r6 == r1) goto L_0x0072
            if (r6 != r0) goto L_0x0062
            com.google.protobuf.at r6 = com.google.protobuf.C62912at.f169862a
            com.google.protobuf.eb r6 = r6.getParserForType()
            com.google.protobuf.MessageLite r6 = com.google.android.libraries.assistant.gallium.framework.C18214ar.m35469b(r8, r6)
            com.google.protobuf.at r6 = (com.google.protobuf.C62912at) r6
            com.google.common.util.concurrent.cx r5 = r5.mo59364e()
            com.google.protos.f.q.gg r6 = com.google.protos.p4985f.p5030q.C65227gg.f176512a
            com.google.common.util.concurrent.cx r5 = com.google.android.libraries.assistant.gallium.framework.C18209am.m35463a(r5, r6, r7)
            return r5
        L_0x0062:
            java.lang.String r5 = java.lang.String.valueOf(r7)
            java.lang.String r6 = " not found"
            java.lang.String r5 = r5.concat(r6)
            r6 = 5
            com.google.android.libraries.assistant.gallium.framework.av r5 = com.google.android.libraries.assistant.gallium.framework.C18218av.m35478a(r6, r5)
            throw r5
        L_0x0072:
            com.google.protos.f.q.gj r6 = com.google.protos.p4985f.p5030q.C65230gj.f176514c
            com.google.protobuf.eb r6 = r6.getParserForType()
            com.google.protobuf.MessageLite r6 = com.google.android.libraries.assistant.gallium.framework.C18214ar.m35469b(r8, r6)
            com.google.protos.f.q.gj r6 = (com.google.protos.p4985f.p5030q.C65230gj) r6
            com.google.common.util.concurrent.cx r5 = r5.mo59360a()
            com.google.protos.f.q.gf r6 = com.google.protos.p4985f.p5030q.C65226gf.f176511a
            com.google.common.util.concurrent.cx r5 = com.google.android.libraries.assistant.gallium.framework.C18209am.m35463a(r5, r6, r7)
            return r5
        L_0x0089:
            com.google.protos.f.q.gp r6 = com.google.protos.p4985f.p5030q.C65236gp.f176526c
            com.google.protobuf.eb r6 = r6.getParserForType()
            com.google.protobuf.MessageLite r6 = com.google.android.libraries.assistant.gallium.framework.C18214ar.m35469b(r8, r6)
            com.google.protos.f.q.gp r6 = (com.google.protos.p4985f.p5030q.C65236gp) r6
            com.google.common.util.concurrent.cx r5 = r5.mo59363d()
            com.google.protos.f.q.ge r6 = com.google.protos.p4985f.p5030q.C65225ge.f176510a
            com.google.common.util.concurrent.cx r5 = com.google.android.libraries.assistant.gallium.framework.C18209am.m35463a(r5, r6, r7)
            return r5
        L_0x00a0:
            com.google.protos.f.q.ej r6 = com.google.protos.p4985f.p5030q.C65176ej.f176380b
            com.google.protobuf.eb r6 = r6.getParserForType()
            com.google.protobuf.MessageLite r6 = com.google.android.libraries.assistant.gallium.framework.C18214ar.m35469b(r8, r6)
            com.google.protos.f.q.ej r6 = (com.google.protos.p4985f.p5030q.C65176ej) r6
            com.google.common.util.concurrent.cx r5 = r5.mo59362c()
            com.google.protos.f.q.gd r6 = com.google.protos.p4985f.p5030q.C65224gd.f176509a
            com.google.common.util.concurrent.cx r5 = com.google.android.libraries.assistant.gallium.framework.C18209am.m35463a(r5, r6, r7)
            return r5
        L_0x00b7:
            com.google.protobuf.at r6 = com.google.protobuf.C62912at.f169862a
            com.google.protobuf.eb r6 = r6.getParserForType()
            com.google.protobuf.MessageLite r6 = com.google.android.libraries.assistant.gallium.framework.C18214ar.m35469b(r8, r6)
            com.google.protobuf.at r6 = (com.google.protobuf.C62912at) r6
            com.google.common.util.concurrent.cx r5 = r5.mo59361b()
            com.google.protos.f.q.gc r6 = com.google.protos.p4985f.p5030q.C65223gc.f176508a
            com.google.common.util.concurrent.cx r5 = com.google.android.libraries.assistant.gallium.framework.C18209am.m35463a(r5, r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protos.p4985f.p5030q.C65228gh.mo23683a(com.google.android.libraries.assistant.gallium.framework.ao, com.google.android.libraries.assistant.gallium.framework.d, java.lang.String, com.google.protos.o.s):com.google.common.util.concurrent.cx");
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ MessageLite mo23684b(C65682h hVar) {
        C65233gm gmVar = (C65233gm) C65234gn.f176522c.createBuilder();
        gmVar.copyOnWrite();
        C65234gn gnVar = (C65234gn) gmVar.instance;
        hVar.getClass();
        gnVar.f176525b = hVar;
        gnVar.f176524a |= 1;
        return (C65234gn) gmVar.build();
    }

    /* renamed from: c */
    public final C65686l mo23685c() {
        return f176513a;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo23686d(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = r7.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1711145952: goto L_0x0034;
                case -1430411344: goto L_0x002a;
                case 2141716: goto L_0x0020;
                case 1697049651: goto L_0x0016;
                case 1697572948: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x003e
        L_0x000c:
            java.lang.String r0 = "UpdateUser"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x003e
            r0 = 2
            goto L_0x003f
        L_0x0016:
            java.lang.String r0 = "UpdateData"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x003e
            r0 = 1
            goto L_0x003f
        L_0x0020:
            java.lang.String r0 = "Dump"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x003e
            r0 = 3
            goto L_0x003f
        L_0x002a:
            java.lang.String r0 = "Initialize"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x003e
            r0 = 0
            goto L_0x003f
        L_0x0034:
            java.lang.String r0 = "WarmUp"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x003e
            r0 = 4
            goto L_0x003f
        L_0x003e:
            r0 = -1
        L_0x003f:
            java.lang.String r5 = "google.protobuf.Empty"
            if (r0 == 0) goto L_0x0065
            if (r0 == r4) goto L_0x0062
            if (r0 == r3) goto L_0x005f
            if (r0 == r2) goto L_0x005c
            if (r0 != r1) goto L_0x004c
            return r5
        L_0x004c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown method"
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L_0x005c:
            java.lang.String r7 = "assistant.portable.DebugDataRequest"
            return r7
        L_0x005f:
            java.lang.String r7 = "assistant.portable.UserUpdateRequest"
            return r7
        L_0x0062:
            java.lang.String r7 = "assistant.portable.DataUpdateRequest"
            return r7
        L_0x0065:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protos.p4985f.p5030q.C65228gh.mo23686d(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo23687e(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = r7.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1711145952: goto L_0x0034;
                case -1430411344: goto L_0x002a;
                case 2141716: goto L_0x0020;
                case 1697049651: goto L_0x0016;
                case 1697572948: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x003e
        L_0x000c:
            java.lang.String r0 = "UpdateUser"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x003e
            r0 = 2
            goto L_0x003f
        L_0x0016:
            java.lang.String r0 = "UpdateData"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x003e
            r0 = 1
            goto L_0x003f
        L_0x0020:
            java.lang.String r0 = "Dump"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x003e
            r0 = 3
            goto L_0x003f
        L_0x002a:
            java.lang.String r0 = "Initialize"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x003e
            r0 = 0
            goto L_0x003f
        L_0x0034:
            java.lang.String r0 = "WarmUp"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x003e
            r0 = 4
            goto L_0x003f
        L_0x003e:
            r0 = -1
        L_0x003f:
            java.lang.String r5 = "google.protobuf.Empty"
            if (r0 == 0) goto L_0x005f
            if (r0 == r4) goto L_0x005f
            if (r0 == r3) goto L_0x005f
            if (r0 == r2) goto L_0x005c
            if (r0 != r1) goto L_0x004c
            return r5
        L_0x004c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown method"
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L_0x005c:
            java.lang.String r7 = "assistant.portable.DebugDataResponse"
            return r7
        L_0x005f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protos.p4985f.p5030q.C65228gh.mo23687e(java.lang.String):java.lang.String");
    }
}
