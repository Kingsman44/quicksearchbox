package com.google.android.libraries.assistant.contexttrigger.p1460d;

import com.google.android.libraries.assistant.contexttrigger.p1461e.C17692f;
import com.google.common.p4522b.C58480gp;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.d.j */
/* compiled from: PG */
public final /* synthetic */ class C17669j implements Function {

    /* renamed from: a */
    public final /* synthetic */ C17692f f50814a;

    /* renamed from: b */
    public final /* synthetic */ C58480gp f50815b;

    public /* synthetic */ C17669j(C17692f fVar, C58480gp gpVar) {
        this.f50814a = fVar;
        this.f50815b = gpVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0083, code lost:
        if (r4 == com.google.android.libraries.assistant.contexttrigger.p1461e.C17691e.WIRED) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0092, code lost:
        if (r4 == com.google.android.libraries.assistant.contexttrigger.p1461e.C17689c.DISCONNECTED) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d7, code lost:
        if (r4 == com.google.android.libraries.assistant.contexttrigger.p1461e.C17691e.CAR_BLUETOOTH) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e6, code lost:
        if (r4 == com.google.android.libraries.assistant.contexttrigger.p1461e.C17689c.DISCONNECTED) goto L_0x00e8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0026 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r9) {
        /*
            r8 = this;
            com.google.android.libraries.assistant.contexttrigger.e.f r0 = r8.f50814a
            com.google.common.b.gp r1 = r8.f50815b
            com.google.assistant.ag.b.a.ag r9 = (com.google.assistant.p3803ag.p3807b.p3808a.C48892ag) r9
            com.google.protobuf.dn r2 = r9.f126521b
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r2)
            java.util.Collection r2 = r2.values()
            j$.util.stream.Stream r2 = p3186j$.util.Collection.EL.stream(r2)
            com.google.android.libraries.assistant.contexttrigger.d.l r3 = com.google.android.libraries.assistant.contexttrigger.p1460d.C17671l.f50818a
            j$.util.stream.Stream r2 = r2.filter(r3)
            j$.util.stream.Collector r3 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r2 = r2.collect(r3)
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0026:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x013f
            java.lang.Object r3 = r2.next()
            com.google.assistant.ag.b.a.ac r3 = (com.google.assistant.p3803ag.p3807b.p3808a.C48888ac) r3
            com.google.assistant.ag.c.az r4 = r3.f126512d
            if (r4 != 0) goto L_0x0038
            com.google.assistant.ag.c.az r4 = com.google.assistant.p3803ag.p3809c.C48952az.f126657c
        L_0x0038:
            int r5 = r4.f126659a
            r6 = 1
            if (r5 != r6) goto L_0x0042
            java.lang.Object r4 = r4.f126660b
            com.google.assistant.ag.c.br r4 = (com.google.assistant.p3803ag.p3809c.C48971br) r4
            goto L_0x0044
        L_0x0042:
            com.google.assistant.ag.c.br r4 = com.google.assistant.p3803ag.p3809c.C48971br.f126689d
        L_0x0044:
            int r5 = r4.f126691a
            r7 = 13
            if (r5 != r7) goto L_0x004f
            java.lang.Object r4 = r4.f126692b
            com.google.assistant.ag.c.am r4 = (com.google.assistant.p3803ag.p3809c.C48939am) r4
            goto L_0x0051
        L_0x004f:
            com.google.assistant.ag.c.am r4 = com.google.assistant.p3803ag.p3809c.C48939am.f126628c
        L_0x0051:
            int r5 = r4.f126630a
            if (r5 != r6) goto L_0x0095
            java.lang.Object r4 = r4.f126631b
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            com.google.assistant.ag.c.al r4 = com.google.assistant.p3803ag.p3809c.C48938al.m85313a(r4)
            if (r4 != 0) goto L_0x0065
            com.google.assistant.ag.c.al r4 = com.google.assistant.p3803ag.p3809c.C48938al.UNKNOWN_WIRED_HEADPHONE_STATUS
        L_0x0065:
            com.google.assistant.ag.c.al r5 = com.google.assistant.p3803ag.p3809c.C48938al.PLUGGED
            if (r4 != r5) goto L_0x0086
            int r4 = r0.f50861b
            com.google.android.libraries.assistant.contexttrigger.e.c r4 = com.google.android.libraries.assistant.contexttrigger.p1461e.C17689c.m34968a(r4)
            if (r4 != 0) goto L_0x0073
            com.google.android.libraries.assistant.contexttrigger.e.c r4 = com.google.android.libraries.assistant.contexttrigger.p1461e.C17689c.UNSPECIFIED
        L_0x0073:
            com.google.android.libraries.assistant.contexttrigger.e.c r5 = com.google.android.libraries.assistant.contexttrigger.p1461e.C17689c.CONNECTED
            if (r4 != r5) goto L_0x00eb
            int r4 = r0.f50862c
            com.google.android.libraries.assistant.contexttrigger.e.e r4 = com.google.android.libraries.assistant.contexttrigger.p1461e.C17691e.m34970a(r4)
            if (r4 != 0) goto L_0x0081
            com.google.android.libraries.assistant.contexttrigger.e.e r4 = com.google.android.libraries.assistant.contexttrigger.p1461e.C17691e.UNKNOWN
        L_0x0081:
            com.google.android.libraries.assistant.contexttrigger.e.e r5 = com.google.android.libraries.assistant.contexttrigger.p1461e.C17691e.WIRED
            if (r4 != r5) goto L_0x00eb
            goto L_0x00e8
        L_0x0086:
            int r4 = r0.f50861b
            com.google.android.libraries.assistant.contexttrigger.e.c r4 = com.google.android.libraries.assistant.contexttrigger.p1461e.C17689c.m34968a(r4)
            if (r4 != 0) goto L_0x0090
            com.google.android.libraries.assistant.contexttrigger.e.c r4 = com.google.android.libraries.assistant.contexttrigger.p1461e.C17689c.UNSPECIFIED
        L_0x0090:
            com.google.android.libraries.assistant.contexttrigger.e.c r5 = com.google.android.libraries.assistant.contexttrigger.p1461e.C17689c.DISCONNECTED
            if (r4 != r5) goto L_0x00eb
            goto L_0x00e8
        L_0x0095:
            r6 = 2
            if (r5 != r6) goto L_0x00a9
            java.lang.Object r4 = r4.f126631b
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            com.google.assistant.ag.c.ai r4 = com.google.assistant.p3803ag.p3809c.C48935ai.m85311a(r4)
            if (r4 != 0) goto L_0x00ab
            com.google.assistant.ag.c.ai r4 = com.google.assistant.p3803ag.p3809c.C48935ai.UNKNOWN_BLUETOOTH_A2DP_STATUS
            goto L_0x00ab
        L_0x00a9:
            com.google.assistant.ag.c.ai r4 = com.google.assistant.p3803ag.p3809c.C48935ai.UNKNOWN_BLUETOOTH_A2DP_STATUS
        L_0x00ab:
            com.google.assistant.ag.c.ai r5 = com.google.assistant.p3803ag.p3809c.C48935ai.BLUETOOTH_A2DP_ON
            if (r4 != r5) goto L_0x00da
            int r4 = r0.f50861b
            com.google.android.libraries.assistant.contexttrigger.e.c r4 = com.google.android.libraries.assistant.contexttrigger.p1461e.C17689c.m34968a(r4)
            if (r4 != 0) goto L_0x00b9
            com.google.android.libraries.assistant.contexttrigger.e.c r4 = com.google.android.libraries.assistant.contexttrigger.p1461e.C17689c.UNSPECIFIED
        L_0x00b9:
            com.google.android.libraries.assistant.contexttrigger.e.c r5 = com.google.android.libraries.assistant.contexttrigger.p1461e.C17689c.CONNECTED
            if (r4 != r5) goto L_0x00eb
            int r4 = r0.f50862c
            com.google.android.libraries.assistant.contexttrigger.e.e r4 = com.google.android.libraries.assistant.contexttrigger.p1461e.C17691e.m34970a(r4)
            if (r4 != 0) goto L_0x00c7
            com.google.android.libraries.assistant.contexttrigger.e.e r4 = com.google.android.libraries.assistant.contexttrigger.p1461e.C17691e.UNKNOWN
        L_0x00c7:
            com.google.android.libraries.assistant.contexttrigger.e.e r5 = com.google.android.libraries.assistant.contexttrigger.p1461e.C17691e.GENERIC_BLUETOOTH
            if (r4 == r5) goto L_0x00e8
            int r4 = r0.f50862c
            com.google.android.libraries.assistant.contexttrigger.e.e r4 = com.google.android.libraries.assistant.contexttrigger.p1461e.C17691e.m34970a(r4)
            if (r4 != 0) goto L_0x00d5
            com.google.android.libraries.assistant.contexttrigger.e.e r4 = com.google.android.libraries.assistant.contexttrigger.p1461e.C17691e.UNKNOWN
        L_0x00d5:
            com.google.android.libraries.assistant.contexttrigger.e.e r5 = com.google.android.libraries.assistant.contexttrigger.p1461e.C17691e.CAR_BLUETOOTH
            if (r4 != r5) goto L_0x00eb
            goto L_0x00e8
        L_0x00da:
            int r4 = r0.f50861b
            com.google.android.libraries.assistant.contexttrigger.e.c r4 = com.google.android.libraries.assistant.contexttrigger.p1461e.C17689c.m34968a(r4)
            if (r4 != 0) goto L_0x00e4
            com.google.android.libraries.assistant.contexttrigger.e.c r4 = com.google.android.libraries.assistant.contexttrigger.p1461e.C17689c.UNSPECIFIED
        L_0x00e4:
            com.google.android.libraries.assistant.contexttrigger.e.c r5 = com.google.android.libraries.assistant.contexttrigger.p1461e.C17689c.DISCONNECTED
            if (r4 != r5) goto L_0x00eb
        L_0x00e8:
            com.google.assistant.ag.b.a.x r4 = com.google.assistant.p3803ag.p3807b.p3808a.C48922x.ACTIVE
            goto L_0x00ed
        L_0x00eb:
            com.google.assistant.ag.b.a.x r4 = com.google.assistant.p3803ag.p3807b.p3808a.C48922x.NOT_ACTIVE
        L_0x00ed:
            int r5 = r3.f126513e
            com.google.assistant.ag.b.a.x r5 = com.google.assistant.p3803ag.p3807b.p3808a.C48922x.m85306a(r5)
            if (r5 != 0) goto L_0x00f7
            com.google.assistant.ag.b.a.x r5 = com.google.assistant.p3803ag.p3807b.p3808a.C48922x.UNKNOWN
        L_0x00f7:
            if (r4 == r5) goto L_0x0026
            com.google.protobuf.bn r3 = r3.toBuilder()
            com.google.assistant.ag.b.a.z r3 = (com.google.assistant.p3803ag.p3807b.p3808a.C48924z) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.assistant.ag.b.a.ac r6 = (com.google.assistant.p3803ag.p3807b.p3808a.C48888ac) r6
            int r4 = r4.f126599d
            r6.f126513e = r4
            int r4 = r6.f126509a
            r4 = r4 | 8
            r6.f126509a = r4
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.assistant.ag.b.a.ac r4 = (com.google.assistant.p3803ag.p3807b.p3808a.C48888ac) r4
            int r5 = r5.f126599d
            r4.f126514f = r5
            int r5 = r4.f126509a
            r5 = r5 | 16
            r4.f126509a = r5
            com.google.protobuf.bv r3 = r3.build()
            com.google.assistant.ag.b.a.ac r3 = (com.google.assistant.p3803ag.p3807b.p3808a.C48888ac) r3
            com.google.protobuf.bn r9 = r9.toBuilder()
            com.google.assistant.ag.b.a.ad r9 = (com.google.assistant.p3803ag.p3807b.p3808a.C48889ad) r9
            java.lang.String r4 = r3.f126510b
            r9.mo53186a(r4, r3)
            com.google.protobuf.bv r9 = r9.build()
            com.google.assistant.ag.b.a.ag r9 = (com.google.assistant.p3803ag.p3807b.p3808a.C48892ag) r9
            java.lang.String r3 = r3.f126510b
            r1.mo55395g(r3)
            goto L_0x0026
        L_0x013f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.contexttrigger.p1460d.C17669j.apply(java.lang.Object):java.lang.Object");
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
