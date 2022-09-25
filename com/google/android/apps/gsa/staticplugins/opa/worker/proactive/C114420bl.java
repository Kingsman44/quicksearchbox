package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.assistant.p3897e.p3921j.aas;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.bl */
/* compiled from: PG */
public final /* synthetic */ class C114420bl implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C114421bm f317266a;

    /* renamed from: b */
    public final /* synthetic */ aas f317267b;

    public /* synthetic */ C114420bl(C114421bm bmVar, aas aas) {
        this.f317266a = bmVar;
        this.f317267b = aas;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a1, code lost:
        r5 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r11) {
        /*
            r10 = this;
            com.google.android.apps.gsa.staticplugins.opa.worker.proactive.bm r0 = r10.f317266a
            com.google.assistant.e.j.aas r1 = r10.f317267b
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            com.google.protobuf.bt r2 = com.google.assistant.p3897e.p3921j.abc.f134692p
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r1.mo58887l(r2)
            com.google.protobuf.bf r3 = r1.f169962ag
            com.google.protobuf.bs r4 = r2.f169971d
            java.lang.Object r3 = r3.mo58854l(r4)
            if (r3 != 0) goto L_0x001c
            java.lang.Object r2 = r2.f169969b
            goto L_0x0020
        L_0x001c:
            java.lang.Object r2 = r2.mo58889c(r3)
        L_0x0020:
            com.google.assistant.e.j.abc r2 = (com.google.assistant.p3897e.p3921j.abc) r2
            int r2 = r2.f134699f
            int r2 = com.google.assistant.p3897e.p3921j.abb.m86273a(r2)
            r3 = 2
            if (r2 != 0) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            if (r2 != r3) goto L_0x003a
        L_0x002e:
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L_0x003a
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.assistant.e.j.e.fo r11 = com.google.assistant.p3897e.p3921j.p3926e.C51962fo.ASSISTANT_DISABLED
            goto L_0x0147
        L_0x003a:
            boolean r11 = r0.mo101321a(r1)
            if (r11 != 0) goto L_0x0046
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.assistant.e.j.e.fo r11 = com.google.assistant.p3897e.p3921j.p3926e.C51962fo.NOT_TARGETING_THIS_DEVICE
            goto L_0x0147
        L_0x0046:
            com.google.protobuf.cq r11 = r1.f134673k
            java.util.Iterator r11 = r11.iterator()
        L_0x004c:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0145
            java.lang.Object r1 = r11.next()
            com.google.assistant.ag.c.hw r1 = (com.google.assistant.p3803ag.p3809c.C49138hw) r1
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
            int r4 = r1.f127070a
            r5 = 0
            r6 = 1
            if (r4 != r6) goto L_0x00c5
            java.lang.Object r2 = r1.f127071b
            com.google.assistant.ag.c.hr r2 = (com.google.assistant.p3803ag.p3809c.C49133hr) r2
            int r4 = r2.f127060a
            r4 = r4 & r6
            if (r4 == 0) goto L_0x00c2
            dagger.a r4 = r0.f317270c     // Catch:{ IllegalArgumentException -> 0x00ac }
            java.lang.Object r4 = r4.mo27525b()     // Catch:{ IllegalArgumentException -> 0x00ac }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IllegalArgumentException -> 0x00ac }
            java.lang.String r2 = r2.f127061b     // Catch:{ IllegalArgumentException -> 0x00ac }
            android.text.TextUtils$SimpleStringSplitter r7 = new android.text.TextUtils$SimpleStringSplitter     // Catch:{ IllegalArgumentException -> 0x00ac }
            r8 = 46
            r7.<init>(r8)     // Catch:{ IllegalArgumentException -> 0x00ac }
            java.lang.Integer[] r4 = com.google.android.apps.gsa.shared.util.p7173k.C91047b.m148722a(r7, r4)     // Catch:{ IllegalArgumentException -> 0x00ac }
            java.lang.Integer[] r2 = com.google.android.apps.gsa.shared.util.p7173k.C91047b.m148722a(r7, r2)     // Catch:{ IllegalArgumentException -> 0x00ac }
            r7 = 0
        L_0x0083:
            r8 = 4
            if (r7 >= r8) goto L_0x00a1
            r8 = r4[r7]     // Catch:{ IllegalArgumentException -> 0x00ac }
            if (r8 == 0) goto L_0x009a
            r9 = r2[r7]     // Catch:{ IllegalArgumentException -> 0x00ac }
            if (r9 == 0) goto L_0x009a
            int r8 = r8.compareTo(r9)     // Catch:{ IllegalArgumentException -> 0x00ac }
            if (r8 == 0) goto L_0x0097
            if (r8 < 0) goto L_0x00a2
            goto L_0x00a1
        L_0x0097:
            int r7 = r7 + 1
            goto L_0x0083
        L_0x009a:
            if (r8 != 0) goto L_0x00a1
            r2 = r2[r7]     // Catch:{ IllegalArgumentException -> 0x00ac }
            if (r2 == 0) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            r5 = 1
        L_0x00a2:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)     // Catch:{ IllegalArgumentException -> 0x00ac }
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)     // Catch:{ IllegalArgumentException -> 0x00ac }
            goto L_0x0127
        L_0x00ac:
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114421bm.f317268a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r5 = "ProactiveNotifications"
            r2.mo56378ag(r4, r5)
            java.lang.String r4 = "Unable to parse AGSA version"
            r5 = 29016(0x7158, float:4.066E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56386p(r4)
            int r2 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
        L_0x00c2:
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
            goto L_0x0127
        L_0x00c5:
            r7 = 3
            if (r4 != r7) goto L_0x011b
            java.lang.Object r4 = r1.f127071b
            com.google.assistant.ag.c.hv r4 = (com.google.assistant.p3803ag.p3809c.C49137hv) r4
            int r7 = r4.f127065a
            r7 = r7 & r6
            if (r7 == 0) goto L_0x0127
            android.content.Context r2 = r0.f317269b
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            java.util.List r2 = r2.getInstalledPackages(r5)
            java.util.Iterator r2 = r2.iterator()
        L_0x00df:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x00f5
            java.lang.Object r7 = r2.next()
            android.content.pm.PackageInfo r7 = (android.content.pm.PackageInfo) r7
            java.lang.String r7 = r7.packageName
            java.lang.String r8 = r4.f127066b
            boolean r7 = r7.equals(r8)
            r5 = r5 | r7
            goto L_0x00df
        L_0x00f5:
            int r2 = r4.f127067c
            int r2 = com.google.assistant.p3803ag.p3809c.C49136hu.m85367a(r2)
            if (r2 != 0) goto L_0x00fe
            r2 = 1
        L_0x00fe:
            int r2 = r2 + -1
            if (r2 == r6) goto L_0x0112
            if (r2 == r3) goto L_0x0107
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
            goto L_0x0127
        L_0x0107:
            r2 = r5 ^ 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
            goto L_0x0127
        L_0x0112:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
            goto L_0x0127
        L_0x011b:
            r5 = 8
            if (r4 != r5) goto L_0x0127
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
        L_0x0127:
            boolean r4 = r2.mo56113h()
            if (r4 == 0) goto L_0x013a
            java.lang.Object r1 = r2.mo56107c()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x004c
            goto L_0x0140
        L_0x013a:
            boolean r1 = r1.f127072c
            if (r1 != 0) goto L_0x0140
            goto L_0x004c
        L_0x0140:
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.assistant.e.j.e.fo r11 = com.google.assistant.p3897e.p3921j.p3926e.C51962fo.TRIGGERING_CONDITIONS_NOT_SATISFIED
            goto L_0x0147
        L_0x0145:
            com.google.assistant.e.j.e.fo r11 = com.google.assistant.p3897e.p3921j.p3926e.C51962fo.DISPLAYED
        L_0x0147:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114420bl.apply(java.lang.Object):java.lang.Object");
    }
}
