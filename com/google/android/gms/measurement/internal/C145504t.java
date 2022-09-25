package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.p10848a.C145155d;

/* renamed from: com.google.android.gms.measurement.internal.t */
/* compiled from: PG */
final class C145504t extends C145505u {

    /* renamed from: a */
    final /* synthetic */ C145507w f393415a;

    /* renamed from: h */
    private final C145155d f393416h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C145504t(C145507w wVar, String str, int i, C145155d dVar) {
        super(str, i);
        this.f393415a = wVar;
        this.f393416h = dVar;
    }

    /* renamed from: a */
    public final int mo121304a() {
        return this.f393416h.f392336b;
    }

    /* renamed from: b */
    public final boolean mo121305b() {
        return (this.f393416h.f392335a & 8) != 0;
    }

    /* renamed from: c */
    public final boolean mo121306c() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x017c, code lost:
        if (r7.booleanValue() == false) goto L_0x03fa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0407  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x040f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0411  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo121307d(java.lang.Long r18, java.lang.Long r19, com.google.android.gms.measurement.p10848a.C145126ad r20, long r21, com.google.android.gms.measurement.internal.C145234an r23, boolean r24) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            boolean r2 = p5304e.p5305a.p5306a.p5390n.p5405h.p5406a.C68925s.m99952c()
            r3 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            r5 = 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            if (r2 == 0) goto L_0x0026
            com.google.android.gms.measurement.internal.w r2 = r0.f393415a
            com.google.android.gms.measurement.internal.ff r2 = r2.f393011w
            com.google.android.gms.measurement.internal.ab r2 = r2.f392937g
            java.lang.String r7 = r0.f393417b
            com.google.android.gms.measurement.internal.dk r8 = com.google.android.gms.measurement.internal.C145313dl.f392716W
            boolean r2 = r2.mo120776m(r7, r8)
            if (r2 == 0) goto L_0x0026
            r2 = 1
            goto L_0x0027
        L_0x0026:
            r2 = 0
        L_0x0027:
            com.google.android.gms.measurement.a.d r7 = r0.f393416h
            boolean r7 = r7.f392342h
            if (r7 == 0) goto L_0x0032
            r7 = r23
            long r7 = r7.f392600e
            goto L_0x0034
        L_0x0032:
            r7 = r21
        L_0x0034:
            com.google.android.gms.measurement.internal.w r9 = r0.f393415a
            com.google.android.gms.measurement.internal.ff r9 = r9.f393011w
            com.google.android.gms.measurement.internal.dx r9 = r9.mo120965ar()
            java.lang.String r9 = r9.mo120899f()
            r10 = 2
            boolean r9 = android.util.Log.isLoggable(r9, r10)
            java.lang.String r11 = "null"
            if (r9 == 0) goto L_0x0119
            com.google.android.gms.measurement.internal.w r9 = r0.f393415a
            com.google.android.gms.measurement.internal.ff r9 = r9.f393011w
            com.google.android.gms.measurement.internal.dx r9 = r9.mo120965ar()
            com.google.android.gms.measurement.internal.dv r9 = r9.f392803k
            int r13 = r0.f393418c
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            com.google.android.gms.measurement.a.d r14 = r0.f393416h
            int r15 = r14.f392335a
            r15 = r15 & r5
            if (r15 == 0) goto L_0x0067
            int r15 = r14.f392336b
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            goto L_0x0068
        L_0x0067:
            r15 = 0
        L_0x0068:
            com.google.android.gms.measurement.internal.w r12 = r0.f393415a
            com.google.android.gms.measurement.internal.ff r12 = r12.f393011w
            com.google.android.gms.measurement.internal.ds r12 = r12.f392942l
            java.lang.String r14 = r14.f392337c
            java.lang.String r12 = r12.mo120890c(r14)
            java.lang.String r14 = "Evaluating filter. audience, filter, event"
            r9.mo120897d(r14, r13, r15, r12)
            com.google.android.gms.measurement.internal.w r9 = r0.f393415a
            com.google.android.gms.measurement.internal.ff r9 = r9.f393011w
            com.google.android.gms.measurement.internal.dx r9 = r9.mo120965ar()
            com.google.android.gms.measurement.internal.dv r9 = r9.f392803k
            com.google.android.gms.measurement.internal.w r12 = r0.f393415a
            com.google.android.gms.measurement.internal.jy r12 = r12.f393327l
            com.google.android.gms.measurement.internal.ka r12 = r12.f393359g
            com.google.android.gms.measurement.internal.C145488jy.m236409I(r12)
            com.google.android.gms.measurement.a.d r13 = r0.f393416h
            if (r13 != 0) goto L_0x0093
            r5 = r11
            goto L_0x0114
        L_0x0093:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "\nevent_filter {\n"
            r14.append(r15)
            int r15 = r13.f392335a
            r15 = r15 & r5
            if (r15 == 0) goto L_0x00ad
            int r15 = r13.f392336b
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            java.lang.String r10 = "filter_id"
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r14, r3, r10, r15)
        L_0x00ad:
            com.google.android.gms.measurement.internal.ff r10 = r12.f393011w
            com.google.android.gms.measurement.internal.ds r10 = r10.f392942l
            java.lang.String r15 = r13.f392337c
            java.lang.String r10 = r10.mo120890c(r15)
            java.lang.String r15 = "event_name"
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r14, r3, r15, r10)
            boolean r10 = r13.f392340f
            boolean r15 = r13.f392341g
            boolean r5 = r13.f392342h
            java.lang.String r5 = com.google.android.gms.measurement.internal.C145491ka.m236452B(r10, r15, r5)
            boolean r10 = r5.isEmpty()
            if (r10 != 0) goto L_0x00d1
            java.lang.String r10 = "filter_type"
            com.google.android.gms.measurement.internal.C145491ka.m236454D(r14, r3, r10, r5)
        L_0x00d1:
            int r5 = r13.f392335a
            r5 = r5 & 8
            if (r5 == 0) goto L_0x00e3
            com.google.android.gms.measurement.a.j r5 = r13.f392339e
            if (r5 != 0) goto L_0x00dd
            com.google.android.gms.measurement.a.j r5 = com.google.android.gms.measurement.p10848a.C145161j.f392351g
        L_0x00dd:
            java.lang.String r10 = "event_count_filter"
            r15 = 1
            com.google.android.gms.measurement.internal.C145491ka.m236456F(r14, r15, r10, r5)
        L_0x00e3:
            com.google.protobuf.cq r5 = r13.f392338d
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x0107
            java.lang.String r5 = "  filters {\n"
            r14.append(r5)
            com.google.protobuf.cq r5 = r13.f392338d
            java.util.Iterator r5 = r5.iterator()
        L_0x00f6:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x0107
            java.lang.Object r10 = r5.next()
            com.google.android.gms.measurement.a.f r10 = (com.google.android.gms.measurement.p10848a.C145157f) r10
            r13 = 2
            r12.mo121240p(r14, r13, r10)
            goto L_0x00f6
        L_0x0107:
            r5 = 1
            com.google.android.gms.measurement.internal.C145491ka.m236463y(r14, r5)
            java.lang.String r5 = "}\n}\n"
            r14.append(r5)
            java.lang.String r5 = r14.toString()
        L_0x0114:
            java.lang.String r10 = "Filter definition"
            r9.mo120895b(r10, r5)
        L_0x0119:
            com.google.android.gms.measurement.a.d r5 = r0.f393416h
            int r9 = r5.f392335a
            r10 = r9 & 1
            if (r10 == 0) goto L_0x044d
            int r10 = r5.f392336b
            r12 = 256(0x100, float:3.59E-43)
            if (r10 <= r12) goto L_0x0129
            goto L_0x044d
        L_0x0129:
            boolean r10 = r5.f392340f
            boolean r12 = r5.f392341g
            boolean r13 = r5.f392342h
            if (r10 != 0) goto L_0x0138
            if (r12 != 0) goto L_0x0138
            if (r13 == 0) goto L_0x0136
            goto L_0x0138
        L_0x0136:
            r15 = 0
            goto L_0x0139
        L_0x0138:
            r15 = 1
        L_0x0139:
            if (r24 == 0) goto L_0x0163
            if (r15 != 0) goto L_0x0163
            com.google.android.gms.measurement.internal.w r1 = r0.f393415a
            com.google.android.gms.measurement.internal.ff r1 = r1.f393011w
            com.google.android.gms.measurement.internal.dx r1 = r1.mo120965ar()
            com.google.android.gms.measurement.internal.dv r1 = r1.f392803k
            int r2 = r0.f393418c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.google.android.gms.measurement.a.d r3 = r0.f393416h
            int r4 = r3.f392335a
            r5 = 1
            r4 = r4 & r5
            if (r4 == 0) goto L_0x015c
            int r3 = r3.f392336b
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            goto L_0x015d
        L_0x015c:
            r12 = 0
        L_0x015d:
            java.lang.String r3 = "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r1.mo120896c(r3, r2, r12)
            return r5
        L_0x0163:
            java.lang.String r10 = r1.f392215c
            r9 = r9 & 8
            if (r9 == 0) goto L_0x0180
            com.google.android.gms.measurement.a.j r9 = r5.f392339e
            if (r9 != 0) goto L_0x016f
            com.google.android.gms.measurement.a.j r9 = com.google.android.gms.measurement.p10848a.C145161j.f392351g
        L_0x016f:
            java.lang.Boolean r7 = m236557h(r7, r9)
            if (r7 != 0) goto L_0x0178
        L_0x0175:
            r4 = 0
            goto L_0x03fa
        L_0x0178:
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L_0x0180
            goto L_0x03fa
        L_0x0180:
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            com.google.protobuf.cq r8 = r5.f392338d
            java.util.Iterator r8 = r8.iterator()
        L_0x018b:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x01bf
            java.lang.Object r9 = r8.next()
            com.google.android.gms.measurement.a.f r9 = (com.google.android.gms.measurement.p10848a.C145157f) r9
            java.lang.String r12 = r9.f392349e
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x01b9
            com.google.android.gms.measurement.internal.w r4 = r0.f393415a
            com.google.android.gms.measurement.internal.ff r4 = r4.f393011w
            com.google.android.gms.measurement.internal.dx r4 = r4.mo120965ar()
            com.google.android.gms.measurement.internal.dv r4 = r4.f392798f
            com.google.android.gms.measurement.internal.w r5 = r0.f393415a
            com.google.android.gms.measurement.internal.ff r5 = r5.f393011w
            com.google.android.gms.measurement.internal.ds r5 = r5.f392942l
            java.lang.String r5 = r5.mo120890c(r10)
            java.lang.String r7 = "null or empty param name in filter. event"
            r4.mo120895b(r7, r5)
            goto L_0x0175
        L_0x01b9:
            java.lang.String r9 = r9.f392349e
            r7.add(r9)
            goto L_0x018b
        L_0x01bf:
            androidx.c.g r8 = new androidx.c.g
            r8.<init>()
            com.google.protobuf.cq r9 = r1.f392214b
            java.util.Iterator r9 = r9.iterator()
        L_0x01ca:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x0244
            java.lang.Object r12 = r9.next()
            com.google.android.gms.measurement.a.ah r12 = (com.google.android.gms.measurement.p10848a.C145130ah) r12
            java.lang.String r13 = r12.f392227b
            boolean r13 = r7.contains(r13)
            if (r13 == 0) goto L_0x01ca
            int r13 = r12.f392226a
            r14 = r13 & 4
            if (r14 == 0) goto L_0x01f8
            java.lang.String r13 = r12.f392227b
            if (r14 == 0) goto L_0x01f1
            r16 = r4
            long r3 = r12.f392229d
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x01f4
        L_0x01f1:
            r16 = r4
            r3 = 0
        L_0x01f4:
            r8.put(r13, r3)
            goto L_0x0219
        L_0x01f8:
            r16 = r4
            r3 = r13 & 16
            if (r3 == 0) goto L_0x020e
            java.lang.String r4 = r12.f392227b
            if (r3 == 0) goto L_0x0209
            double r12 = r12.f392231f
            java.lang.Double r3 = java.lang.Double.valueOf(r12)
            goto L_0x020a
        L_0x0209:
            r3 = 0
        L_0x020a:
            r8.put(r4, r3)
            goto L_0x0219
        L_0x020e:
            r3 = r13 & 2
            if (r3 == 0) goto L_0x021d
            java.lang.String r3 = r12.f392227b
            java.lang.String r4 = r12.f392228c
            r8.put(r3, r4)
        L_0x0219:
            r4 = r16
            r3 = 0
            goto L_0x01ca
        L_0x021d:
            com.google.android.gms.measurement.internal.w r3 = r0.f393415a
            com.google.android.gms.measurement.internal.ff r3 = r3.f393011w
            com.google.android.gms.measurement.internal.dx r3 = r3.mo120965ar()
            com.google.android.gms.measurement.internal.dv r3 = r3.f392798f
            com.google.android.gms.measurement.internal.w r4 = r0.f393415a
            com.google.android.gms.measurement.internal.ff r4 = r4.f393011w
            com.google.android.gms.measurement.internal.ds r4 = r4.f392942l
            java.lang.String r4 = r4.mo120890c(r10)
            com.google.android.gms.measurement.internal.w r5 = r0.f393415a
            com.google.android.gms.measurement.internal.ff r5 = r5.f393011w
            com.google.android.gms.measurement.internal.ds r5 = r5.f392942l
            java.lang.String r7 = r12.f392227b
            java.lang.String r5 = r5.mo120891d(r7)
            java.lang.String r7 = "Unknown value for param. event, param"
            r3.mo120896c(r7, r4, r5)
            goto L_0x0175
        L_0x0244:
            r16 = r4
            com.google.protobuf.cq r3 = r5.f392338d
            java.util.Iterator r3 = r3.iterator()
        L_0x024c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x03f9
            java.lang.Object r4 = r3.next()
            com.google.android.gms.measurement.a.f r4 = (com.google.android.gms.measurement.p10848a.C145157f) r4
            int r5 = r4.f392345a
            r5 = r5 & 4
            if (r5 == 0) goto L_0x0264
            boolean r5 = r4.f392348d
            if (r5 == 0) goto L_0x0264
            r5 = 1
            goto L_0x0265
        L_0x0264:
            r5 = 0
        L_0x0265:
            java.lang.String r7 = r4.f392349e
            boolean r9 = r7.isEmpty()
            if (r9 == 0) goto L_0x0288
            com.google.android.gms.measurement.internal.w r3 = r0.f393415a
            com.google.android.gms.measurement.internal.ff r3 = r3.f393011w
            com.google.android.gms.measurement.internal.dx r3 = r3.mo120965ar()
            com.google.android.gms.measurement.internal.dv r3 = r3.f392798f
            com.google.android.gms.measurement.internal.w r4 = r0.f393415a
            com.google.android.gms.measurement.internal.ff r4 = r4.f393011w
            com.google.android.gms.measurement.internal.ds r4 = r4.f392942l
            java.lang.String r4 = r4.mo120890c(r10)
            java.lang.String r5 = "Event has empty param name. event"
            r3.mo120895b(r5, r4)
            goto L_0x0175
        L_0x0288:
            java.lang.Object r9 = r8.get(r7)
            boolean r12 = r9 instanceof java.lang.Long
            if (r12 == 0) goto L_0x02d7
            int r12 = r4.f392345a
            r13 = 2
            r12 = r12 & r13
            if (r12 == 0) goto L_0x02b2
            java.lang.Long r9 = (java.lang.Long) r9
            long r12 = r9.longValue()
            com.google.android.gms.measurement.a.j r4 = r4.f392347c
            if (r4 != 0) goto L_0x02a2
            com.google.android.gms.measurement.a.j r4 = com.google.android.gms.measurement.p10848a.C145161j.f392351g
        L_0x02a2:
            java.lang.Boolean r4 = m236557h(r12, r4)
            if (r4 != 0) goto L_0x02aa
            goto L_0x0175
        L_0x02aa:
            boolean r4 = r4.booleanValue()
            if (r4 != r5) goto L_0x024c
        L_0x02b0:
            goto L_0x03d1
        L_0x02b2:
            com.google.android.gms.measurement.internal.w r3 = r0.f393415a
            com.google.android.gms.measurement.internal.ff r3 = r3.f393011w
            com.google.android.gms.measurement.internal.dx r3 = r3.mo120965ar()
            com.google.android.gms.measurement.internal.dv r3 = r3.f392798f
            com.google.android.gms.measurement.internal.w r4 = r0.f393415a
            com.google.android.gms.measurement.internal.ff r4 = r4.f393011w
            com.google.android.gms.measurement.internal.ds r4 = r4.f392942l
            java.lang.String r4 = r4.mo120890c(r10)
            com.google.android.gms.measurement.internal.w r5 = r0.f393415a
            com.google.android.gms.measurement.internal.ff r5 = r5.f393011w
            com.google.android.gms.measurement.internal.ds r5 = r5.f392942l
            java.lang.String r5 = r5.mo120891d(r7)
            java.lang.String r7 = "No number filter for long param. event, param"
            r3.mo120896c(r7, r4, r5)
            goto L_0x0175
        L_0x02d7:
            boolean r12 = r9 instanceof java.lang.Double
            if (r12 == 0) goto L_0x0321
            int r12 = r4.f392345a
            r13 = 2
            r12 = r12 & r13
            if (r12 == 0) goto L_0x02fc
            java.lang.Double r9 = (java.lang.Double) r9
            double r12 = r9.doubleValue()
            com.google.android.gms.measurement.a.j r4 = r4.f392347c
            if (r4 != 0) goto L_0x02ed
            com.google.android.gms.measurement.a.j r4 = com.google.android.gms.measurement.p10848a.C145161j.f392351g
        L_0x02ed:
            java.lang.Boolean r4 = m236556g(r12, r4)
            if (r4 != 0) goto L_0x02f5
            goto L_0x0175
        L_0x02f5:
            boolean r4 = r4.booleanValue()
            if (r4 != r5) goto L_0x024c
            goto L_0x02b0
        L_0x02fc:
            com.google.android.gms.measurement.internal.w r3 = r0.f393415a
            com.google.android.gms.measurement.internal.ff r3 = r3.f393011w
            com.google.android.gms.measurement.internal.dx r3 = r3.mo120965ar()
            com.google.android.gms.measurement.internal.dv r3 = r3.f392798f
            com.google.android.gms.measurement.internal.w r4 = r0.f393415a
            com.google.android.gms.measurement.internal.ff r4 = r4.f393011w
            com.google.android.gms.measurement.internal.ds r4 = r4.f392942l
            java.lang.String r4 = r4.mo120890c(r10)
            com.google.android.gms.measurement.internal.w r5 = r0.f393415a
            com.google.android.gms.measurement.internal.ff r5 = r5.f393011w
            com.google.android.gms.measurement.internal.ds r5 = r5.f392942l
            java.lang.String r5 = r5.mo120891d(r7)
            java.lang.String r7 = "No number filter for double param. event, param"
            r3.mo120896c(r7, r4, r5)
            goto L_0x0175
        L_0x0321:
            boolean r12 = r9 instanceof java.lang.String
            if (r12 == 0) goto L_0x03ac
            int r12 = r4.f392345a
            r13 = r12 & 1
            if (r13 == 0) goto L_0x0340
            java.lang.String r9 = (java.lang.String) r9
            com.google.android.gms.measurement.a.p r4 = r4.f392346b
            if (r4 != 0) goto L_0x0333
            com.google.android.gms.measurement.a.p r4 = com.google.android.gms.measurement.p10848a.C145167p.f392369f
        L_0x0333:
            com.google.android.gms.measurement.internal.w r7 = r0.f393415a
            com.google.android.gms.measurement.internal.ff r7 = r7.f393011w
            com.google.android.gms.measurement.internal.dx r7 = r7.mo120965ar()
            java.lang.Boolean r4 = m236555f(r9, r4, r7)
            goto L_0x0356
        L_0x0340:
            r12 = r12 & 2
            if (r12 == 0) goto L_0x0387
            java.lang.String r9 = (java.lang.String) r9
            boolean r12 = com.google.android.gms.measurement.internal.C145491ka.m236461v(r9)
            if (r12 == 0) goto L_0x0362
            com.google.android.gms.measurement.a.j r4 = r4.f392347c
            if (r4 != 0) goto L_0x0352
            com.google.android.gms.measurement.a.j r4 = com.google.android.gms.measurement.p10848a.C145161j.f392351g
        L_0x0352:
            java.lang.Boolean r4 = m236558i(r9, r4)
        L_0x0356:
            if (r4 != 0) goto L_0x035a
            goto L_0x0175
        L_0x035a:
            boolean r4 = r4.booleanValue()
            if (r4 != r5) goto L_0x024c
            goto L_0x02b0
        L_0x0362:
            com.google.android.gms.measurement.internal.w r3 = r0.f393415a
            com.google.android.gms.measurement.internal.ff r3 = r3.f393011w
            com.google.android.gms.measurement.internal.dx r3 = r3.mo120965ar()
            com.google.android.gms.measurement.internal.dv r3 = r3.f392798f
            com.google.android.gms.measurement.internal.w r4 = r0.f393415a
            com.google.android.gms.measurement.internal.ff r4 = r4.f393011w
            com.google.android.gms.measurement.internal.ds r4 = r4.f392942l
            java.lang.String r4 = r4.mo120890c(r10)
            com.google.android.gms.measurement.internal.w r5 = r0.f393415a
            com.google.android.gms.measurement.internal.ff r5 = r5.f393011w
            com.google.android.gms.measurement.internal.ds r5 = r5.f392942l
            java.lang.String r5 = r5.mo120891d(r7)
            java.lang.String r7 = "Invalid param value for number filter. event, param"
            r3.mo120896c(r7, r4, r5)
            goto L_0x0175
        L_0x0387:
            com.google.android.gms.measurement.internal.w r3 = r0.f393415a
            com.google.android.gms.measurement.internal.ff r3 = r3.f393011w
            com.google.android.gms.measurement.internal.dx r3 = r3.mo120965ar()
            com.google.android.gms.measurement.internal.dv r3 = r3.f392798f
            com.google.android.gms.measurement.internal.w r4 = r0.f393415a
            com.google.android.gms.measurement.internal.ff r4 = r4.f393011w
            com.google.android.gms.measurement.internal.ds r4 = r4.f392942l
            java.lang.String r4 = r4.mo120890c(r10)
            com.google.android.gms.measurement.internal.w r5 = r0.f393415a
            com.google.android.gms.measurement.internal.ff r5 = r5.f393011w
            com.google.android.gms.measurement.internal.ds r5 = r5.f392942l
            java.lang.String r5 = r5.mo120891d(r7)
            java.lang.String r7 = "No filter for String param. event, param"
            r3.mo120896c(r7, r4, r5)
            goto L_0x0175
        L_0x03ac:
            if (r9 != 0) goto L_0x03d4
            com.google.android.gms.measurement.internal.w r3 = r0.f393415a
            com.google.android.gms.measurement.internal.ff r3 = r3.f393011w
            com.google.android.gms.measurement.internal.dx r3 = r3.mo120965ar()
            com.google.android.gms.measurement.internal.dv r3 = r3.f392803k
            com.google.android.gms.measurement.internal.w r4 = r0.f393415a
            com.google.android.gms.measurement.internal.ff r4 = r4.f393011w
            com.google.android.gms.measurement.internal.ds r4 = r4.f392942l
            java.lang.String r4 = r4.mo120890c(r10)
            com.google.android.gms.measurement.internal.w r5 = r0.f393415a
            com.google.android.gms.measurement.internal.ff r5 = r5.f393011w
            com.google.android.gms.measurement.internal.ds r5 = r5.f392942l
            java.lang.String r5 = r5.mo120891d(r7)
            java.lang.String r7 = "Missing param for filter. event, param"
            r3.mo120896c(r7, r4, r5)
        L_0x03d1:
            r4 = r16
            goto L_0x03fa
        L_0x03d4:
            com.google.android.gms.measurement.internal.w r3 = r0.f393415a
            com.google.android.gms.measurement.internal.ff r3 = r3.f393011w
            com.google.android.gms.measurement.internal.dx r3 = r3.mo120965ar()
            com.google.android.gms.measurement.internal.dv r3 = r3.f392798f
            com.google.android.gms.measurement.internal.w r4 = r0.f393415a
            com.google.android.gms.measurement.internal.ff r4 = r4.f393011w
            com.google.android.gms.measurement.internal.ds r4 = r4.f392942l
            java.lang.String r4 = r4.mo120890c(r10)
            com.google.android.gms.measurement.internal.w r5 = r0.f393415a
            com.google.android.gms.measurement.internal.ff r5 = r5.f393011w
            com.google.android.gms.measurement.internal.ds r5 = r5.f392942l
            java.lang.String r5 = r5.mo120891d(r7)
            java.lang.String r7 = "Unknown param type. event, param"
            r3.mo120896c(r7, r4, r5)
            goto L_0x0175
        L_0x03f9:
            r4 = r6
        L_0x03fa:
            com.google.android.gms.measurement.internal.w r3 = r0.f393415a
            com.google.android.gms.measurement.internal.ff r3 = r3.f393011w
            com.google.android.gms.measurement.internal.dx r3 = r3.mo120965ar()
            com.google.android.gms.measurement.internal.dv r3 = r3.f392803k
            if (r4 != 0) goto L_0x0407
            goto L_0x0408
        L_0x0407:
            r11 = r4
        L_0x0408:
            java.lang.String r5 = "Event filter result"
            r3.mo120895b(r5, r11)
            if (r4 != 0) goto L_0x0411
            r3 = 0
            return r3
        L_0x0411:
            r0.f393419d = r6
            boolean r3 = r4.booleanValue()
            if (r3 != 0) goto L_0x041b
            r3 = 1
            return r3
        L_0x041b:
            r0.f393420e = r6
            if (r15 == 0) goto L_0x044b
            int r3 = r1.f392213a
            r4 = 2
            r3 = r3 & r4
            if (r3 == 0) goto L_0x044b
            long r3 = r1.f392216d
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            com.google.android.gms.measurement.a.d r3 = r0.f393416h
            boolean r4 = r3.f392341g
            if (r4 == 0) goto L_0x043f
            if (r2 == 0) goto L_0x043c
            int r2 = r3.f392335a
            r2 = r2 & 8
            if (r2 != 0) goto L_0x043a
            goto L_0x043c
        L_0x043a:
            r1 = r18
        L_0x043c:
            r0.f393422g = r1
            goto L_0x044b
        L_0x043f:
            if (r2 == 0) goto L_0x0449
            int r2 = r3.f392335a
            r2 = r2 & 8
            if (r2 == 0) goto L_0x0449
            r1 = r19
        L_0x0449:
            r0.f393421f = r1
        L_0x044b:
            r1 = 1
            return r1
        L_0x044d:
            r1 = 1
            com.google.android.gms.measurement.internal.w r2 = r0.f393415a
            com.google.android.gms.measurement.internal.ff r2 = r2.f393011w
            com.google.android.gms.measurement.internal.dx r2 = r2.mo120965ar()
            com.google.android.gms.measurement.internal.dv r2 = r2.f392798f
            java.lang.String r3 = r0.f393417b
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r3)
            com.google.android.gms.measurement.a.d r4 = r0.f393416h
            int r5 = r4.f392335a
            r1 = r1 & r5
            if (r1 == 0) goto L_0x046c
            int r1 = r4.f392336b
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            goto L_0x046d
        L_0x046c:
            r12 = 0
        L_0x046d:
            java.lang.String r1 = "Invalid event filter ID. appId, id"
            java.lang.String r4 = java.lang.String.valueOf(r12)
            r2.mo120896c(r1, r3, r4)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145504t.mo121307d(java.lang.Long, java.lang.Long, com.google.android.gms.measurement.a.ad, long, com.google.android.gms.measurement.internal.an, boolean):boolean");
    }
}
