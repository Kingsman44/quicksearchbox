package com.google.protos.p4985f.p5030q;

import com.google.android.libraries.assistant.gallium.framework.C18204ah;
import com.google.protobuf.MessageLite;
import com.google.protos.p5127o.C65682h;
import com.google.protos.p5127o.C65685k;
import com.google.protos.p5127o.C65686l;

/* renamed from: com.google.protos.f.q.by */
/* compiled from: PG */
final class C65104by implements C18204ah {

    /* renamed from: a */
    private static final C65686l f176262a;

    static {
        C65685k kVar = (C65685k) C65686l.f178470d.createBuilder();
        kVar.copyOnWrite();
        C65686l lVar = (C65686l) kVar.instance;
        lVar.f178472a |= 1;
        lVar.f178473b = "assistant.portable.ClockService";
        f176262a = (C65686l) kVar.build();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo23683a(com.google.android.libraries.assistant.gallium.framework.C18211ao r4, com.google.android.libraries.assistant.gallium.framework.C18231d r5, java.lang.String r6, com.google.protos.p5127o.C65693s r7) {
        /*
            r3 = this;
            com.google.protos.f.q.bt r4 = (com.google.protos.p4985f.p5030q.C65099bt) r4
            int r5 = r6.hashCode()
            r0 = 3
            r1 = 2
            r2 = 1
            switch(r5) {
                case -2010180840: goto L_0x002b;
                case -1468652380: goto L_0x0021;
                case 232593790: goto L_0x0017;
                case 1806447479: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0035
        L_0x000d:
            java.lang.String r5 = "GetStopwatch"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0035
            r5 = 2
            goto L_0x0036
        L_0x0017:
            java.lang.String r5 = "GetUserClockProvider"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0035
            r5 = 3
            goto L_0x0036
        L_0x0021:
            java.lang.String r5 = "GetTimers"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0035
            r5 = 1
            goto L_0x0036
        L_0x002b:
            java.lang.String r5 = "GetAlarms"
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
            com.google.protos.f.q.bq r5 = com.google.protos.p4985f.p5030q.C65096bq.f176249b
            com.google.protobuf.eb r5 = r5.getParserForType()
            com.google.protobuf.MessageLite r5 = com.google.android.libraries.assistant.gallium.framework.C18214ar.m35469b(r7, r5)
            com.google.protos.f.q.bq r5 = (com.google.protos.p4985f.p5030q.C65096bq) r5
            com.google.common.util.concurrent.cx r4 = r4.mo59341d(r5)
            com.google.protos.f.q.bx r5 = com.google.protos.p4985f.p5030q.C65103bx.f176261a
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
            com.google.protobuf.at r5 = com.google.protobuf.C62912at.f169862a
            com.google.protobuf.eb r5 = r5.getParserForType()
            com.google.protobuf.MessageLite r5 = com.google.android.libraries.assistant.gallium.framework.C18214ar.m35469b(r7, r5)
            com.google.protobuf.at r5 = (com.google.protobuf.C62912at) r5
            com.google.common.util.concurrent.cx r4 = r4.mo59339b()
            com.google.protos.f.q.bw r5 = com.google.protos.p4985f.p5030q.C65102bw.f176260a
            com.google.common.util.concurrent.cx r4 = com.google.android.libraries.assistant.gallium.framework.C18209am.m35463a(r4, r5, r6)
            return r4
        L_0x007c:
            com.google.protobuf.at r5 = com.google.protobuf.C62912at.f169862a
            com.google.protobuf.eb r5 = r5.getParserForType()
            com.google.protobuf.MessageLite r5 = com.google.android.libraries.assistant.gallium.framework.C18214ar.m35469b(r7, r5)
            com.google.protobuf.at r5 = (com.google.protobuf.C62912at) r5
            com.google.common.util.concurrent.cx r4 = r4.mo59340c()
            com.google.protos.f.q.bv r5 = com.google.protos.p4985f.p5030q.C65101bv.f176259a
            com.google.common.util.concurrent.cx r4 = com.google.android.libraries.assistant.gallium.framework.C18209am.m35463a(r4, r5, r6)
            return r4
        L_0x0093:
            com.google.protobuf.at r5 = com.google.protobuf.C62912at.f169862a
            com.google.protobuf.eb r5 = r5.getParserForType()
            com.google.protobuf.MessageLite r5 = com.google.android.libraries.assistant.gallium.framework.C18214ar.m35469b(r7, r5)
            com.google.protobuf.at r5 = (com.google.protobuf.C62912at) r5
            com.google.common.util.concurrent.cx r4 = r4.mo59338a()
            com.google.protos.f.q.bu r5 = com.google.protos.p4985f.p5030q.C65100bu.f176258a
            com.google.common.util.concurrent.cx r4 = com.google.android.libraries.assistant.gallium.framework.C18209am.m35463a(r4, r5, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protos.p4985f.p5030q.C65104by.mo23683a(com.google.android.libraries.assistant.gallium.framework.ao, com.google.android.libraries.assistant.gallium.framework.d, java.lang.String, com.google.protos.o.s):com.google.common.util.concurrent.cx");
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ MessageLite mo23684b(C65682h hVar) {
        C65085bf bfVar = (C65085bf) C65086bg.f176231c.createBuilder();
        bfVar.copyOnWrite();
        C65086bg bgVar = (C65086bg) bfVar.instance;
        hVar.getClass();
        bgVar.f176234b = hVar;
        bgVar.f176233a |= 1;
        return (C65086bg) bfVar.build();
    }

    /* renamed from: c */
    public final C65686l mo23685c() {
        return f176262a;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo23686d(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = r6.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            switch(r0) {
                case -2010180840: goto L_0x0029;
                case -1468652380: goto L_0x001f;
                case 232593790: goto L_0x0015;
                case 1806447479: goto L_0x000b;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0033
        L_0x000b:
            java.lang.String r0 = "GetStopwatch"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 2
            goto L_0x0034
        L_0x0015:
            java.lang.String r0 = "GetUserClockProvider"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 3
            goto L_0x0034
        L_0x001f:
            java.lang.String r0 = "GetTimers"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x0029:
            java.lang.String r0 = "GetAlarms"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 0
            goto L_0x0034
        L_0x0033:
            r0 = -1
        L_0x0034:
            java.lang.String r4 = "google.protobuf.Empty"
            if (r0 == 0) goto L_0x0051
            if (r0 == r3) goto L_0x0051
            if (r0 == r2) goto L_0x0051
            if (r0 != r1) goto L_0x0041
            java.lang.String r6 = "assistant.portable.GetUserClockProviderRequest"
            return r6
        L_0x0041:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown method"
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r6 = r1.concat(r6)
            r0.<init>(r6)
            throw r0
        L_0x0051:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protos.p4985f.p5030q.C65104by.mo23686d(java.lang.String):java.lang.String");
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
                case -2010180840: goto L_0x0029;
                case -1468652380: goto L_0x001f;
                case 232593790: goto L_0x0015;
                case 1806447479: goto L_0x000b;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0033
        L_0x000b:
            java.lang.String r0 = "GetStopwatch"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 2
            goto L_0x0034
        L_0x0015:
            java.lang.String r0 = "GetUserClockProvider"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 3
            goto L_0x0034
        L_0x001f:
            java.lang.String r0 = "GetTimers"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x0029:
            java.lang.String r0 = "GetAlarms"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 0
            goto L_0x0034
        L_0x0033:
            r0 = -1
        L_0x0034:
            if (r0 == 0) goto L_0x0055
            if (r0 == r3) goto L_0x0052
            if (r0 == r2) goto L_0x004f
            if (r0 != r1) goto L_0x003f
            java.lang.String r5 = "assistant.portable.GetUserClockProviderResponse"
            return r5
        L_0x003f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown method"
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = r1.concat(r5)
            r0.<init>(r5)
            throw r0
        L_0x004f:
            java.lang.String r5 = "assistant.portable.GetStopwatchResponse"
            return r5
        L_0x0052:
            java.lang.String r5 = "assistant.portable.GetTimersResponse"
            return r5
        L_0x0055:
            java.lang.String r5 = "assistant.portable.GetAlarmsResponse"
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protos.p4985f.p5030q.C65104by.mo23687e(java.lang.String):java.lang.String");
    }
}
