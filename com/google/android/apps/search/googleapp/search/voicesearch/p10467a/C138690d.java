package com.google.android.apps.search.googleapp.search.voicesearch.p10467a;

import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69648ae;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.a.d */
/* compiled from: PG */
public final class C138690d extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C138692f f377213a;

    /* renamed from: b */
    final /* synthetic */ C69648ae f377214b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138690d(C138692f fVar, C69648ae aeVar) {
        super(1);
        this.f377213a = fVar;
        this.f377214b = aeVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0176, code lost:
        if (r2.getComponent() == null) goto L_0x0178;
     */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x019c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object mo5761a(java.lang.Object r10) {
        /*
            r9 = this;
            com.google.bb.a.jw r10 = (com.google.p4152bb.p4153a.C55208jw) r10
            java.lang.String r0 = "it"
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r0)
            com.google.android.apps.search.googleapp.search.voicesearch.a.f r0 = r9.f377213a
            h.f.b.ae r1 = r9.f377214b
            java.lang.Object r1 = r1.f186027a
            com.google.bb.a.ad r1 = (com.google.p4152bb.p4153a.C54946ad) r1
            boolean r2 = r10.f145329l
            if (r2 == 0) goto L_0x0027
            android.content.Context r2 = r0.f377220c
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            com.google.bb.a.he r3 = r10.f145322e
            if (r3 != 0) goto L_0x001f
            com.google.bb.a.he r3 = com.google.p4152bb.p4153a.C55136he.f145130j
        L_0x001f:
            java.lang.String r3 = r3.f145133b
            android.content.Intent r2 = r2.getLaunchIntentForPackage(r3)
            if (r2 != 0) goto L_0x019b
        L_0x0027:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            int r3 = r10.f145318a
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L_0x0037
            java.lang.String r3 = r10.f145319b
            r2.setAction(r3)
        L_0x0037:
            int r3 = r10.f145318a
            r3 = r3 & 16
            if (r3 == 0) goto L_0x004c
            com.google.bb.a.he r3 = r10.f145324g
            if (r3 != 0) goto L_0x0043
            com.google.bb.a.he r3 = com.google.p4152bb.p4153a.C55136he.f145130j
        L_0x0043:
            java.lang.String r3 = r3.f145133b
            android.net.Uri r3 = android.net.Uri.parse(r3)
            r2.setData(r3)
        L_0x004c:
            int r3 = r10.f145318a
            r3 = r3 & 8
            if (r3 == 0) goto L_0x005d
            com.google.bb.a.he r3 = r10.f145322e
            if (r3 != 0) goto L_0x0058
            com.google.bb.a.he r3 = com.google.p4152bb.p4153a.C55136he.f145130j
        L_0x0058:
            java.lang.String r3 = r3.f145133b
            r2.setPackage(r3)
        L_0x005d:
            int r3 = r10.f145318a
            r3 = r3 & 32
            if (r3 == 0) goto L_0x0072
            com.google.bb.a.he r3 = r10.f145325h
            if (r3 != 0) goto L_0x0069
            com.google.bb.a.he r3 = com.google.p4152bb.p4153a.C55136he.f145130j
        L_0x0069:
            java.lang.String r3 = r3.f145133b
            android.content.ComponentName r3 = android.content.ComponentName.unflattenFromString(r3)
            r2.setComponent(r3)
        L_0x0072:
            com.google.bb.a.af r3 = r1.f144536d
            if (r3 != 0) goto L_0x0078
            com.google.bb.a.af r3 = com.google.p4152bb.p4153a.C54948af.f144541h
        L_0x0078:
            int r3 = r3.f144544b
            com.google.bb.a.x r3 = com.google.p4152bb.p4153a.C55421x.m87686a(r3)
            if (r3 != 0) goto L_0x0082
            com.google.bb.a.x r3 = com.google.p4152bb.p4153a.C55421x.UNKNOWN_ACTION_TYPE
        L_0x0082:
            int r3 = r3.ordinal()
            r5 = 0
            r6 = 0
            if (r3 == r4) goto L_0x016c
            r4 = 5
            if (r3 == r4) goto L_0x016c
            r4 = 46
            if (r3 == r4) goto L_0x0122
            r4 = 105(0x69, float:1.47E-43)
            if (r3 == r4) goto L_0x0097
            goto L_0x017a
        L_0x0097:
            com.google.protobuf.cq r3 = r10.f145327j
            int r3 = r3.size()
            if (r3 == 0) goto L_0x017a
            com.google.protobuf.bt r3 = com.google.p4152bb.p4153a.C55265lz.f145556m
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)
            r1.mo58887l(r3)
            com.google.protobuf.bf r4 = r1.f169962ag
            com.google.protobuf.bs r7 = r3.f169971d
            java.lang.Object r4 = r4.mo58854l(r7)
            if (r4 != 0) goto L_0x00b5
            java.lang.Object r3 = r3.f169969b
            goto L_0x00b9
        L_0x00b5:
            java.lang.Object r3 = r3.mo58889c(r4)
        L_0x00b9:
            com.google.bb.a.lz r3 = (com.google.p4152bb.p4153a.C55265lz) r3
            com.google.protobuf.cq r3 = r3.f145559b
            int r3 = r3.size()
            if (r3 == 0) goto L_0x017a
            com.google.protobuf.bt r3 = com.google.p4152bb.p4153a.C55265lz.f145556m
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)
            r1.mo58887l(r3)
            com.google.protobuf.bf r1 = r1.f169962ag
            com.google.protobuf.bs r4 = r3.f169971d
            java.lang.Object r1 = r1.mo58854l(r4)
            if (r1 != 0) goto L_0x00d9
            java.lang.Object r1 = r3.f169969b
            goto L_0x00dd
        L_0x00d9:
            java.lang.Object r1 = r3.mo58889c(r1)
        L_0x00dd:
            com.google.bb.a.lz r1 = (com.google.p4152bb.p4153a.C55265lz) r1
            com.google.protobuf.cq r1 = r1.f145559b
            java.lang.Object r1 = r1.get(r6)
            com.google.bb.a.ka r1 = (com.google.p4152bb.p4153a.C55213ka) r1
            com.google.protobuf.bt r3 = com.google.p4152bb.p4153a.C55292mz.f145644f
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)
            r1.mo58887l(r3)
            com.google.protobuf.bf r1 = r1.f169962ag
            com.google.protobuf.bs r4 = r3.f169971d
            java.lang.Object r1 = r1.mo58854l(r4)
            if (r1 != 0) goto L_0x00fd
            java.lang.Object r1 = r3.f169969b
            goto L_0x0101
        L_0x00fd:
            java.lang.Object r1 = r3.mo58889c(r1)
        L_0x0101:
            com.google.bb.a.mz r1 = (com.google.p4152bb.p4153a.C55292mz) r1
            long r3 = r1.f145647b
            r7 = 0
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x017a
            com.google.protobuf.cq r10 = r10.f145327j
            java.lang.Object r10 = r10.get(r6)
            com.google.bb.a.f r10 = (com.google.p4152bb.p4153a.C55077f) r10
            java.lang.String r10 = r10.f144894b
            j$.time.Duration r1 = p3186j$.time.Duration.ofMillis(r3)
            long r3 = r1.getSeconds()
            int r1 = (int) r3
            r2.putExtra(r10, r1)
            goto L_0x017a
        L_0x0122:
            com.google.protobuf.cq r10 = r10.f145327j
            java.lang.String r1 = "androidIntentExecutionInfo.extraList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x0132:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x014e
            java.lang.Object r3 = r10.next()
            r4 = r3
            com.google.bb.a.f r4 = (com.google.p4152bb.p4153a.C55077f) r4
            int r4 = r4.f144895c
            int r4 = com.google.p4152bb.p4153a.C55050e.m87569a(r4)
            if (r4 == 0) goto L_0x0132
            r7 = 2
            if (r4 != r7) goto L_0x0132
            r1.add(r3)
            goto L_0x0132
        L_0x014e:
            java.util.Iterator r10 = r1.iterator()
        L_0x0152:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x017a
            java.lang.Object r1 = r10.next()
            com.google.bb.a.f r1 = (com.google.p4152bb.p4153a.C55077f) r1
            java.lang.String r3 = r1.f144894b
            com.google.bb.a.he r1 = r1.f144896d
            if (r1 != 0) goto L_0x0166
            com.google.bb.a.he r1 = com.google.p4152bb.p4153a.C55136he.f145130j
        L_0x0166:
            java.lang.String r1 = r1.f145133b
            r2.putExtra(r3, r1)
            goto L_0x0152
        L_0x016c:
            java.lang.String r10 = r2.getPackage()
            if (r10 != 0) goto L_0x017a
            android.content.ComponentName r10 = r2.getComponent()
            if (r10 != 0) goto L_0x017a
        L_0x0178:
            r2 = r5
            goto L_0x019b
        L_0x017a:
            android.content.Context r10 = r0.f377220c
            android.content.pm.PackageManager r10 = r10.getPackageManager()
            android.content.ComponentName r0 = r2.getComponent()
            if (r0 != 0) goto L_0x0189
            r6 = 65664(0x10080, float:9.2015E-41)
        L_0x0189:
            java.util.List r10 = r10.queryIntentActivities(r2, r6)
            java.lang.String r0 = "applicationContext\n     …      0\n        }\n      )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r0)
            java.lang.Object r10 = p5462h.p5463a.C69540x.m100821C(r10)
            android.content.pm.ResolveInfo r10 = (android.content.pm.ResolveInfo) r10
            if (r10 != 0) goto L_0x019c
            goto L_0x0178
        L_0x019b:
            return r2
        L_0x019c:
            android.content.ComponentName r0 = new android.content.ComponentName
            android.content.pm.ActivityInfo r1 = r10.activityInfo
            java.lang.String r1 = r1.packageName
            android.content.pm.ActivityInfo r10 = r10.activityInfo
            java.lang.String r10 = r10.name
            r0.<init>(r1, r10)
            android.content.Intent r10 = r2.setComponent(r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.voicesearch.p10467a.C138690d.mo5761a(java.lang.Object):java.lang.Object");
    }
}
