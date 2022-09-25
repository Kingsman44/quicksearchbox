package com.google.android.apps.gsa.staticplugins.chime;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.staticplugins.chime.p7661f.C97716f;
import com.google.android.libraries.notifications.p2293h.C30010c;
import com.google.android.libraries.p1730f.C21370a;
import dagger.C68214a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.h */
/* compiled from: PG */
public final class C97726h implements C30010c {

    /* renamed from: a */
    private final C68214a f272857a;

    /* renamed from: b */
    private final C68214a f272858b;

    /* renamed from: c */
    private final C68214a f272859c;

    /* renamed from: d */
    private final C68214a f272860d;

    /* renamed from: e */
    private final Context f272861e;

    /* renamed from: f */
    private final C90021c f272862f;

    /* renamed from: g */
    private final C86124t f272863g;

    /* renamed from: h */
    private final C86054o f272864h;

    /* renamed from: i */
    private final C85651bb f272865i;

    /* renamed from: j */
    private final PackageManager f272866j;

    /* renamed from: k */
    private final C21370a f272867k;

    /* renamed from: l */
    private final C97716f f272868l;

    public C97726h(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, Context context, C90021c cVar, C86124t tVar, C86054o oVar, C97716f fVar, C85651bb bbVar, PackageManager packageManager, C21370a aVar5) {
        this.f272858b = aVar2;
        this.f272857a = aVar;
        this.f272859c = aVar3;
        this.f272860d = aVar4;
        this.f272861e = context;
        this.f272862f = cVar;
        this.f272863g = tVar;
        this.f272864h = oVar;
        this.f272868l = fVar;
        this.f272865i = bbVar;
        this.f272866j = packageManager;
        this.f272867k = aVar5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01ff  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.protobuf.C63070h mo35324a(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String r0 = "DeviceTagExtractorImpl"
            dagger.a r1 = r10.f272859c
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.ag.b.a r1 = (com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a) r1
            boolean r1 = r1.mo78205l()
            com.google.bv.d.b.a.f r2 = com.google.p4283bv.p4345d.p4350b.p4351a.C56970f.f152060o
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.bv.d.b.a.e r2 = (com.google.p4283bv.p4345d.p4350b.p4351a.C56969e) r2
            com.google.android.apps.gsa.staticplugins.chime.f.f r3 = r10.f272868l
            com.google.android.apps.gsa.search.core.bd r3 = r3.f272840c
            boolean r3 = r3.mo79170h(r11)
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.bv.d.b.a.f r4 = (com.google.p4283bv.p4345d.p4350b.p4351a.C56970f) r4
            int r5 = r4.f152062a
            r5 = r5 | 32
            r4.f152062a = r5
            r4.f152068g = r3
            android.content.Context r3 = r10.f272861e
            boolean r3 = android.text.format.DateFormat.is24HourFormat(r3)
            r4 = 2
            r5 = 1
            if (r5 == r3) goto L_0x0039
            r3 = 2
            goto L_0x003a
        L_0x0039:
            r3 = 3
        L_0x003a:
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            com.google.bv.d.b.a.f r6 = (com.google.p4283bv.p4345d.p4350b.p4351a.C56970f) r6
            int r3 = r3 + -1
            r6.f152067f = r3
            int r3 = r6.f152062a
            r3 = r3 | 16
            r6.f152062a = r3
            com.google.android.apps.gsa.staticplugins.chime.f.f r3 = r10.f272868l
            dagger.a r3 = r3.f272841d
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.smartspace.r r3 = (com.google.android.apps.gsa.smartspace.C92122r) r3
            com.google.android.apps.gsa.smartspace.o r3 = r3.f256848d
            boolean r3 = r3.mo86755k()
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            com.google.bv.d.b.a.f r6 = (com.google.p4283bv.p4345d.p4350b.p4351a.C56970f) r6
            int r7 = r6.f152062a
            r7 = r7 | 64
            r6.f152062a = r7
            r6.f152069h = r3
            com.google.android.apps.gsa.search.core.bb r3 = r10.f272865i
            boolean r3 = com.google.android.apps.gsa.staticplugins.chime.C97735q.m162008e(r3, r1)
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            com.google.bv.d.b.a.f r6 = (com.google.p4283bv.p4345d.p4350b.p4351a.C56970f) r6
            int r7 = r6.f152062a
            r7 = r7 | 1024(0x400, float:1.435E-42)
            r6.f152062a = r7
            r6.f152072k = r3
            com.google.android.apps.gsa.search.core.google.gaia.o r3 = r10.f272864h
            java.lang.String r3 = r3.mo79659F()
            if (r3 == 0) goto L_0x009b
            boolean r3 = r3.equals(r11)
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            com.google.bv.d.b.a.f r6 = (com.google.p4283bv.p4345d.p4350b.p4351a.C56970f) r6
            int r7 = r6.f152062a
            r7 = r7 | 8192(0x2000, float:1.14794E-41)
            r6.f152062a = r7
            r3 = r3 ^ r5
            r6.f152075n = r3
        L_0x009b:
            com.google.android.libraries.f.a r3 = r10.f272867k
            long r6 = r3.mo26870b()
            j$.time.Instant r3 = p3186j$.time.Instant.ofEpochMilli(r6)
            j$.time.temporal.ChronoUnit r6 = p3186j$.time.temporal.ChronoUnit.DAYS
            j$.time.Instant r3 = r3.truncatedTo(r6)
            com.google.android.apps.gsa.search.core.i.t r6 = r10.f272863g
            dagger.a r7 = r10.f272860d
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.libraries.storage.protostore.ab r7 = (com.google.android.libraries.storage.protostore.C42876ab) r7
            com.google.common.util.concurrent.cx r3 = com.google.android.apps.gsa.shared.p7192v.C91165r.m148930e(r3, r6, r7)
            com.google.android.apps.gsa.staticplugins.chime.f r6 = new com.google.android.apps.gsa.staticplugins.chime.f
            r6.<init>(r2)
            com.google.common.util.concurrent.bg r7 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r3 = com.google.common.util.concurrent.C60922j.m93044g(r3, r6, r7)
            com.google.android.apps.gsa.shared.s.a.a r6 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a
            com.google.common.util.concurrent.cx[] r6 = new com.google.common.util.concurrent.C60870cx[r5]
            r7 = 0
            r6[r7] = r3
            com.google.apps.tiktok.tracing.contrib.b.j r3 = com.google.apps.tiktok.tracing.contrib.p3700b.C47638k.m84751b(r6)
            com.google.android.apps.gsa.staticplugins.chime.g r6 = com.google.android.apps.gsa.staticplugins.chime.C97717g.f272842a
            com.google.common.util.concurrent.bg r8 = com.google.common.util.concurrent.C60826bg.f164896a
            r3.mo51520a(r6, r8)
            com.google.android.apps.gsa.search.core.google.gaia.o r3 = r10.f272864h
            android.accounts.Account r11 = r3.mo79689w(r11)
            r3 = 0
            if (r11 == 0) goto L_0x0156
            com.google.android.apps.gsa.staticplugins.chime.f.f r6 = r10.f272868l
            com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.m148680c()
            dagger.a r6 = r6.f272839b     // Catch:{ e -> 0x012f, IllegalStateException -> 0x010d }
            java.lang.Object r6 = r6.mo27525b()     // Catch:{ e -> 0x012f, IllegalStateException -> 0x010d }
            com.google.android.apps.gsa.sidekick.main.b.f r6 = (com.google.android.apps.gsa.sidekick.main.p7199b.C91266f) r6     // Catch:{ e -> 0x012f, IllegalStateException -> 0x010d }
            com.google.android.libraries.gcoreclient.q.b.b r6 = r6.mo85539b(r11)     // Catch:{ e -> 0x012f, IllegalStateException -> 0x010d }
            if (r6 == 0) goto L_0x0105
            com.google.android.libraries.gcoreclient.h.a.h r8 = r6.mo26997c()     // Catch:{ e -> 0x012f, IllegalStateException -> 0x010d }
            boolean r8 = r8.mo27003f()     // Catch:{ e -> 0x012f, IllegalStateException -> 0x010d }
            if (r8 == 0) goto L_0x0105
            int r6 = r6.mo27023a()     // Catch:{ e -> 0x012f, IllegalStateException -> 0x010d }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ e -> 0x012f, IllegalStateException -> 0x010d }
            goto L_0x0106
        L_0x0105:
            r6 = r3
        L_0x0106:
            j$.util.Optional r0 = p3186j$.util.Optional.ofNullable(r6)     // Catch:{ e -> 0x012f, IllegalStateException -> 0x010d }
            goto L_0x015a
        L_0x010b:
            r11 = move-exception
            goto L_0x0155
        L_0x010d:
            r6 = move-exception
            com.google.common.f.e r8 = com.google.android.apps.gsa.staticplugins.chime.p7661f.C97716f.f272838a     // Catch:{ all -> 0x010b }
            com.google.common.f.x r8 = r8.mo56226d()     // Catch:{ all -> 0x010b }
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x010b }
            r8.mo56378ag(r9, r0)     // Catch:{ all -> 0x010b }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ all -> 0x010b }
            com.google.common.f.x r0 = r8.mo56382g(r6)     // Catch:{ all -> 0x010b }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x010b }
            r6 = 18986(0x4a2a, float:2.6605E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r6)     // Catch:{ all -> 0x010b }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x010b }
            java.lang.String r6 = "Could not read device tag."
            r0.mo56386p(r6)     // Catch:{ all -> 0x010b }
            goto L_0x0150
        L_0x012f:
            r6 = move-exception
            com.google.common.f.e r8 = com.google.android.apps.gsa.staticplugins.chime.p7661f.C97716f.f272838a     // Catch:{ all -> 0x010b }
            com.google.common.f.x r8 = r8.mo56225c()     // Catch:{ all -> 0x010b }
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x010b }
            r8.mo56378ag(r9, r0)     // Catch:{ all -> 0x010b }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ all -> 0x010b }
            com.google.common.f.x r0 = r8.mo56382g(r6)     // Catch:{ all -> 0x010b }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x010b }
            r6 = 18985(0x4a29, float:2.6604E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r6)     // Catch:{ all -> 0x010b }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x010b }
            java.lang.String r6 = "Error getting device tag."
            r0.mo56386p(r6)     // Catch:{ all -> 0x010b }
        L_0x0150:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            goto L_0x015a
        L_0x0155:
            throw r11
        L_0x0156:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
        L_0x015a:
            boolean r6 = r0.isPresent()
            if (r6 == 0) goto L_0x0178
            java.lang.Object r0 = r0.get()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            com.google.bv.d.b.a.f r6 = (com.google.p4283bv.p4345d.p4350b.p4351a.C56970f) r6
            int r8 = r6.f152062a
            r4 = r4 | r8
            r6.f152062a = r4
            r6.f152064c = r0
        L_0x0178:
            if (r11 == 0) goto L_0x0190
            java.lang.String r0 = com.google.android.apps.gsa.sidekick.main.p7201d.C91284a.m149219a(r11)
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.bv.d.b.a.f r4 = (com.google.p4283bv.p4345d.p4350b.p4351a.C56970f) r4
            r0.getClass()
            int r6 = r4.f152062a
            r6 = r6 | 4
            r4.f152062a = r6
            r4.f152065d = r0
        L_0x0190:
            dagger.a r0 = r10.f272858b
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.i.b r0 = (com.google.android.apps.gsa.search.core.p6805i.C86106b) r0
            if (r11 == 0) goto L_0x019c
            java.lang.String r3 = r11.name
        L_0x019c:
            java.lang.String r11 = r0.mo79728c(r3)
            if (r11 == 0) goto L_0x01b0
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.bv.d.b.a.f r0 = (com.google.p4283bv.p4345d.p4350b.p4351a.C56970f) r0
            int r3 = r0.f152062a
            r3 = r3 | r5
            r0.f152062a = r3
            r0.f152063b = r11
        L_0x01b0:
            com.google.android.apps.gsa.shared.m.c r11 = r10.f272862f
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90081ef.f249851t
            boolean r11 = r11.mo79746e(r0)
            if (r11 == 0) goto L_0x01dc
            dagger.a r11 = r10.f272857a
            java.lang.Object r11 = r11.mo27525b()
            com.google.android.apps.gsa.search.core.google.p r11 = (com.google.android.apps.gsa.search.core.google.C86074p) r11
            java.util.Collection r0 = r11.mo79714b()
            com.google.cl.b.a.a.b r11 = r11.mo79713a(r7, r0)
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.bv.d.b.a.f r0 = (com.google.p4283bv.p4345d.p4350b.p4351a.C56970f) r0
            r11.getClass()
            r0.f152071j = r11
            int r11 = r0.f152062a
            r11 = r11 | 512(0x200, float:7.175E-43)
            r0.f152062a = r11
        L_0x01dc:
            com.google.android.apps.gsa.shared.m.c r11 = r10.f272862f
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90081ef.f249832a
            boolean r11 = r11.mo79746e(r0)
            if (r11 == 0) goto L_0x01f5
            r2.copyOnWrite()
            com.google.protobuf.bv r11 = r2.instance
            com.google.bv.d.b.a.f r11 = (com.google.p4283bv.p4345d.p4350b.p4351a.C56970f) r11
            int r0 = r11.f152062a
            r0 = r0 | 256(0x100, float:3.59E-43)
            r11.f152062a = r0
            r11.f152070i = r1
        L_0x01f5:
            com.google.android.apps.gsa.shared.m.c r11 = r10.f272862f
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90081ef.f249833b
            boolean r11 = r11.mo79746e(r0)
            if (r11 == 0) goto L_0x0218
            android.content.Context r11 = r10.f272861e
            com.google.android.apps.gsa.shared.util.UserHandleCompat r0 = com.google.android.apps.gsa.shared.util.UserHandleCompat.m148154a()
            boolean r11 = com.google.android.apps.gsa.shared.util.C90771bo.m148273b(r11, r0)
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.bv.d.b.a.f r0 = (com.google.p4283bv.p4345d.p4350b.p4351a.C56970f) r0
            int r1 = r0.f152062a
            r1 = r1 | 8
            r0.f152062a = r1
            r0.f152066e = r11
        L_0x0218:
            android.content.pm.PackageManager r11 = r10.f272866j     // Catch:{ NameNotFoundException -> 0x0232 }
            java.lang.String r0 = "com.google.android.apps.magazines"
            android.content.pm.ApplicationInfo r11 = r11.getApplicationInfo(r0, r7)     // Catch:{ NameNotFoundException -> 0x0232 }
            boolean r11 = r11.enabled     // Catch:{ NameNotFoundException -> 0x0232 }
            r2.copyOnWrite()     // Catch:{ NameNotFoundException -> 0x0232 }
            com.google.protobuf.bv r0 = r2.instance     // Catch:{ NameNotFoundException -> 0x0232 }
            com.google.bv.d.b.a.f r0 = (com.google.p4283bv.p4345d.p4350b.p4351a.C56970f) r0     // Catch:{ NameNotFoundException -> 0x0232 }
            int r1 = r0.f152062a     // Catch:{ NameNotFoundException -> 0x0232 }
            r1 = r1 | 4096(0x1000, float:5.74E-42)
            r0.f152062a = r1     // Catch:{ NameNotFoundException -> 0x0232 }
            r0.f152074m = r11     // Catch:{ NameNotFoundException -> 0x0232 }
            goto L_0x0241
        L_0x0232:
            r2.copyOnWrite()
            com.google.protobuf.bv r11 = r2.instance
            com.google.bv.d.b.a.f r11 = (com.google.p4283bv.p4345d.p4350b.p4351a.C56970f) r11
            int r0 = r11.f152062a
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r11.f152062a = r0
            r11.f152074m = r7
        L_0x0241:
            com.google.protobuf.h r11 = com.google.protobuf.C63070h.f170215c
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.protobuf.g r11 = (com.google.protobuf.C63062g) r11
            r11.copyOnWrite()
            com.google.protobuf.bv r0 = r11.instance
            com.google.protobuf.h r0 = (com.google.protobuf.C63070h) r0
            java.lang.String r1 = "type.googleapis.com/search.now.push.proto.chimepayloads.AgsaChimeRegistrationPayload"
            r0.f170217a = r1
            com.google.protobuf.bv r0 = r2.build()
            com.google.bv.d.b.a.f r0 = (com.google.p4283bv.p4345d.p4350b.p4351a.C56970f) r0
            com.google.protobuf.z r0 = r0.toByteString()
            r11.copyOnWrite()
            com.google.protobuf.bv r1 = r11.instance
            com.google.protobuf.h r1 = (com.google.protobuf.C63070h) r1
            r0.getClass()
            r1.f170218b = r0
            com.google.protobuf.bv r11 = r11.build()
            com.google.protobuf.h r11 = (com.google.protobuf.C63070h) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.chime.C97726h.mo35324a(java.lang.String):com.google.protobuf.h");
    }

    /* renamed from: b */
    public final /* synthetic */ String mo35325b() {
        return null;
    }

    /* renamed from: c */
    public final /* synthetic */ List mo35326c() {
        return null;
    }
}
