package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6092f;

import android.content.Context;
import com.google.android.apps.gsa.nga.engine.am.an;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.f.y */
/* compiled from: PG */
public final class C77305y implements C76591c {

    /* renamed from: a */
    private static final C58974d f213212a = C58974d.m91136j();

    /* renamed from: b */
    private final an f213213b;

    /* renamed from: c */
    private final Context f213214c;

    /* renamed from: d */
    private final C77301u f213215d;

    public C77305y(Context context, an anVar, C77301u uVar) {
        this.f213214c = context;
        this.f213213b = anVar;
        this.f213215d = uVar;
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72246e(Optional.m71637of(C82831ca.TOGGLE_SETTINGS));
        h.mo72277g("Toggle_device_setting", C90126fx.f251319ga);
        h.mo72244c(C58485gu.m89846n("Toggle_device_setting"));
        ((C76541a) h).f211766c = 10106;
        return h.mo72276f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
        if (r1 != 2) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0088, code lost:
        if (((android.bluetooth.BluetoothManager) r1).getAdapter().getState() == 12) goto L_0x008a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a9  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo71712b(com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg r8, com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n r9) {
        /*
            r7 = this;
            java.lang.String r0 = "setting"
            j$.util.Optional r8 = r8.mo72268j(r0)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x001c
            com.google.common.f.a.d r8 = f213212a
            com.google.common.f.x r8 = r8.mo56225c()
            java.lang.String r9 = "No device setting set"
            r0 = 3870(0xf1e, float:5.423E-42)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r8).mo56372aa(r0)).mo56386p(r9)
            com.google.common.util.concurrent.cx r8 = com.google.android.apps.gsa.nga.shared.p6358n.C81442m.f222851a
            return r8
        L_0x001c:
            com.google.android.apps.gsa.nga.shared.aa.e.n r0 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n.f220656k
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.gsa.nga.shared.aa.e.l r0 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l) r0
            java.lang.Object r8 = r8.get()
            com.google.protos.an.d.b.p r8 = (com.google.protos.p4850an.p4855d.p4857b.C63490p) r8
            com.google.protos.an.d.b.p r1 = com.google.protos.p4850an.p4855d.p4857b.C63490p.UNSPECIFIED
            int r1 = r8.ordinal()
            r2 = 31
            r3 = 0
            r4 = 1
            if (r1 == r2) goto L_0x0071
            r2 = 50
            if (r1 == r2) goto L_0x006c
            r2 = 103(0x67, float:1.44E-43)
            if (r1 == r2) goto L_0x0050
            com.google.common.f.a.d r1 = f213212a
            com.google.common.f.x r1 = r1.mo56225c()
            int r2 = r8.getNumber()
            r5 = 3871(0xf1f, float:5.424E-42)
            java.lang.String r6 = "Can't figure out whether %s setting is enabled or not"
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r5)).mo56387q(r6, r2)
            goto L_0x008b
        L_0x0050:
            android.content.Context r1 = r7.f213214c
            android.content.Context r1 = r1.getApplicationContext()
            java.lang.String r2 = "wifi"
            java.lang.Object r1 = r1.getSystemService(r2)
            r1.getClass()
            android.net.wifi.WifiManager r1 = (android.net.wifi.WifiManager) r1
            int r1 = r1.getWifiState()
            r2 = 3
            if (r1 == r2) goto L_0x008a
            r2 = 2
            if (r1 != r2) goto L_0x008b
            goto L_0x008a
        L_0x006c:
            com.google.android.apps.gsa.nga.engine.am.an r1 = r7.f213213b
            boolean r3 = r1.f
            goto L_0x008b
        L_0x0071:
            android.content.Context r1 = r7.f213214c
            java.lang.String r2 = "bluetooth"
            java.lang.Object r1 = r1.getSystemService(r2)
            r1.getClass()
            android.bluetooth.BluetoothManager r1 = (android.bluetooth.BluetoothManager) r1
            android.bluetooth.BluetoothAdapter r1 = r1.getAdapter()
            int r1 = r1.getState()
            r2 = 12
            if (r1 != r2) goto L_0x008b
        L_0x008a:
            r3 = 1
        L_0x008b:
            com.google.android.apps.gsa.nga.engine.o.e.f.u r1 = r7.f213215d
            boolean r1 = r1.mo72511o(r8)
            if (r1 == 0) goto L_0x00a9
            com.google.android.apps.gsa.nga.engine.o.e.f.u r1 = r7.f213215d
            java.util.Locale r9 = r9.mo71342q()
            r2 = r3 ^ 1
            r1.mo72502f(r0, r9, r8, r2)
            com.google.protobuf.bv r8 = r0.build()
            com.google.android.apps.gsa.nga.shared.aa.e.n r8 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n) r8
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92900i(r8)
            return r8
        L_0x00a9:
            r1 = r3 ^ 1
            com.google.android.apps.gsa.nga.engine.o.e.f.u r2 = r7.f213215d
            r2.mo72503g(r0, r8, r1)
            com.google.android.apps.gsa.nga.engine.o.e.f.u r2 = r7.f213215d
            java.util.Locale r3 = r9.mo71342q()
            r2.mo72505i(r8, r0, r3)
            com.google.android.apps.gsa.nga.engine.o.e.f.u r2 = r7.f213215d
            java.util.Locale r3 = r9.mo71342q()
            boolean r2 = r2.mo72508l(r0, r8, r3)
            if (r2 == 0) goto L_0x00d0
            com.google.protobuf.bv r8 = r0.build()
            com.google.android.apps.gsa.nga.shared.aa.e.n r8 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n) r8
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92900i(r8)
            return r8
        L_0x00d0:
            com.google.android.apps.gsa.nga.engine.o.e.f.u r2 = r7.f213215d
            java.util.Locale r3 = r9.mo71342q()
            boolean r2 = r2.mo72509m(r0, r8, r3)
            if (r2 == 0) goto L_0x00e7
            com.google.protobuf.bv r8 = r0.build()
            com.google.android.apps.gsa.nga.shared.aa.e.n r8 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n) r8
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92900i(r8)
            return r8
        L_0x00e7:
            com.google.protos.an.d.b.p r2 = com.google.protos.p4850an.p4855d.p4857b.C63490p.FLASHLIGHT
            if (r8 != r2) goto L_0x00f4
            com.google.android.apps.gsa.nga.engine.o.e.f.u r8 = r7.f213215d
            java.util.Locale r9 = r9.mo71342q()
            r8.mo72500d(r0, r9, r1)
        L_0x00f4:
            com.google.protobuf.bv r8 = r0.build()
            com.google.android.apps.gsa.nga.shared.aa.e.n r8 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n) r8
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92900i(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6092f.C77305y.mo71712b(com.google.android.apps.gsa.nga.engine.o.c.bg, com.google.android.apps.gsa.nga.engine.am.u.n):com.google.common.util.concurrent.cx");
    }
}
