package com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6948b;

import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p6970ab.C89078h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59071e;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.searchbox.c.b.b.a */
/* compiled from: PG */
public final class C88569a {

    /* renamed from: a */
    public static final C59071e f239377a = C59071e.m91332i("com.google.android.apps.gsa.searchbox.c.b.b.a");

    /* renamed from: b */
    public final C86338r f239378b;

    /* renamed from: c */
    public final C21370a f239379c;

    /* renamed from: d */
    public C89078h f239380d = null;

    /* renamed from: e */
    public Map f239381e = null;

    public C88569a(C86338r rVar, C21370a aVar) {
        this.f239378b = rVar;
        this.f239379c = aVar;
    }

    /* renamed from: c */
    public static final String m143112c(Integer num) {
        return String.format(Locale.US, "%d:*", new Object[]{num});
    }

    /* renamed from: a */
    public final String mo82243a(Integer num, Integer num2) {
        if (num2.intValue() < 0) {
            return m143112c(num);
        }
        return String.format(Locale.getDefault(), "%d:%d", new Object[]{num, num2});
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo82244b() {
        /*
            r6 = this;
            java.lang.String r0 = "hidden_ondevice_suggestions"
            java.util.Map r1 = r6.f239381e
            if (r1 != 0) goto L_0x0094
            com.google.android.apps.gsa.search.core.preferences.r r1 = r6.f239378b     // Catch:{ ct -> 0x007f }
            boolean r1 = r1.contains(r0)     // Catch:{ ct -> 0x007f }
            r2 = 0
            if (r1 != 0) goto L_0x0010
            goto L_0x0022
        L_0x0010:
            com.google.android.apps.gsa.search.core.preferences.r r1 = r6.f239378b     // Catch:{ ct -> 0x007f }
            byte[] r0 = r1.mo80079e(r0, r2)     // Catch:{ ct -> 0x007f }
            if (r0 != 0) goto L_0x0019
            goto L_0x0022
        L_0x0019:
            com.google.android.apps.gsa.shared.ab.h r1 = com.google.android.apps.gsa.shared.p6970ab.C89078h.f241405b     // Catch:{ ct -> 0x007f }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r1, (byte[]) r0)     // Catch:{ ct -> 0x007f }
            r2 = r0
            com.google.android.apps.gsa.shared.ab.h r2 = (com.google.android.apps.gsa.shared.p6970ab.C89078h) r2     // Catch:{ ct -> 0x007f }
        L_0x0022:
            r6.f239380d = r2     // Catch:{ ct -> 0x007f }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ ct -> 0x007f }
            r0.<init>()     // Catch:{ ct -> 0x007f }
            if (r2 != 0) goto L_0x002c
            goto L_0x007c
        L_0x002c:
            com.google.protobuf.cq r1 = r2.f241407a     // Catch:{ ct -> 0x007f }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ ct -> 0x007f }
        L_0x0032:
            boolean r2 = r1.hasNext()     // Catch:{ ct -> 0x007f }
            if (r2 == 0) goto L_0x007c
            java.lang.Object r2 = r1.next()     // Catch:{ ct -> 0x007f }
            com.google.android.apps.gsa.shared.ab.f r2 = (com.google.android.apps.gsa.shared.p6970ab.C89076f) r2     // Catch:{ ct -> 0x007f }
            int r3 = r2.f241403c     // Catch:{ ct -> 0x007f }
            if (r3 >= 0) goto L_0x004d
            int r3 = r2.f241402b     // Catch:{ ct -> 0x007f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ ct -> 0x007f }
            java.lang.String r3 = m143112c(r3)     // Catch:{ ct -> 0x007f }
            goto L_0x005b
        L_0x004d:
            int r4 = r2.f241402b     // Catch:{ ct -> 0x007f }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ ct -> 0x007f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ ct -> 0x007f }
            java.lang.String r3 = r6.mo82243a(r4, r3)     // Catch:{ ct -> 0x007f }
        L_0x005b:
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ ct -> 0x007f }
            r4.<init>()     // Catch:{ ct -> 0x007f }
            com.google.protobuf.cq r2 = r2.f241404d     // Catch:{ ct -> 0x007f }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ ct -> 0x007f }
        L_0x0066:
            boolean r5 = r2.hasNext()     // Catch:{ ct -> 0x007f }
            if (r5 == 0) goto L_0x0078
            java.lang.Object r5 = r2.next()     // Catch:{ ct -> 0x007f }
            com.google.android.apps.gsa.shared.ab.l r5 = (com.google.android.apps.gsa.shared.p6970ab.C89082l) r5     // Catch:{ ct -> 0x007f }
            java.lang.String r5 = r5.f241417b     // Catch:{ ct -> 0x007f }
            r4.add(r5)     // Catch:{ ct -> 0x007f }
            goto L_0x0066
        L_0x0078:
            r0.put(r3, r4)     // Catch:{ ct -> 0x007f }
            goto L_0x0032
        L_0x007c:
            r6.f239381e = r0     // Catch:{ ct -> 0x007f }
            return
        L_0x007f:
            r0 = move-exception
            com.google.common.f.e r1 = f239377a
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "OnDeviceSugHider"
            r1.mo56378ag(r2, r3)
            java.lang.String r2 = "Failed to parse SuggestionBlacklists proto"
            r3 = 9951(0x26df, float:1.3944E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56386p(r2)
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6948b.C88569a.mo82244b():void");
    }
}
