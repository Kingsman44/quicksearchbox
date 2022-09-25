package com.google.android.apps.gsa.staticplugins.bisto.p7481af;

import android.accounts.Account;
import android.app.ActivityManager;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.usb.UsbDevice;
import android.os.Bundle;
import android.os.UserManager;
import android.service.voice.VoiceInteractionService;
import com.google.android.apps.gsa.assist.p501a.C9325m;
import com.google.android.apps.gsa.assistant.settings.devices.p522c.p524b.C9684l;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6513aj.C84533ar;
import com.google.android.apps.gsa.search.core.p6513aj.C84535at;
import com.google.android.apps.gsa.search.core.p6519al.p6755r.C85558a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.bisto.C89646bc;
import com.google.android.apps.gsa.shared.bisto.C89647bd;
import com.google.android.apps.gsa.shared.bisto.C89651f;
import com.google.android.apps.gsa.shared.bisto.C89652g;
import com.google.android.apps.gsa.shared.bisto.C89680s;
import com.google.android.apps.gsa.shared.bisto.C89681t;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89636g;
import com.google.android.apps.gsa.shared.p7066m.C90071dw;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.gsa.shared.util.permissions.C91076c;
import com.google.android.apps.gsa.shared.util.permissions.ProxyPermissionsRequester;
import com.google.android.apps.gsa.staticplugins.bisto.p7464ab.C94804c;
import com.google.android.apps.gsa.staticplugins.bisto.p7464ab.C94805d;
import com.google.android.apps.gsa.staticplugins.bisto.p7464ab.C94809h;
import com.google.android.apps.gsa.staticplugins.bisto.p7495m.C95489f;
import com.google.android.apps.gsa.staticplugins.bisto.p7495m.C95490g;
import com.google.android.apps.gsa.staticplugins.bisto.p7495m.C95493j;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96476bg;
import com.google.android.apps.gsa.staticplugins.opa.p8363f.C109029a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124519a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124521b;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124527h;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9391a.C124539a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124551g;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.assistant.p3861at.C50144me;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60105ky;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.af.aj */
/* compiled from: PG */
public final class C95144aj extends C86734a implements C85558a {

    /* renamed from: a */
    public static final C59071e f266188a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.af.aj");

    /* renamed from: b */
    static final Duration f266189b = Duration.ofSeconds(10);

    /* renamed from: m */
    private static final int f266190m = ((int) TimeUnit.SECONDS.toMillis(5));

    /* renamed from: n */
    private static final long f266191n = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: A */
    private final C68214a f266192A;

    /* renamed from: B */
    private final C9684l f266193B;

    /* renamed from: C */
    private final ProxyPermissionsRequester f266194C;

    /* renamed from: D */
    private final C47632e f266195D = new C47632e();

    /* renamed from: E */
    private final C60888db f266196E;

    /* renamed from: c */
    public final Context f266197c;

    /* renamed from: f */
    public final SharedPreferences f266198f;

    /* renamed from: g */
    public final C22871g f266199g;

    /* renamed from: h */
    public final C68214a f266200h;

    /* renamed from: i */
    public final C68214a f266201i;

    /* renamed from: j */
    public final C68214a f266202j;

    /* renamed from: k */
    public final C68214a f266203k;

    /* renamed from: l */
    public final C89647bd f266204l;

    /* renamed from: o */
    private final C58833ax f266205o;

    /* renamed from: p */
    private final C86054o f266206p;

    /* renamed from: q */
    private final C86124t f266207q;

    /* renamed from: r */
    private final C90931ca f266208r;

    /* renamed from: s */
    private final C22871g f266209s;

    /* renamed from: t */
    private final C68214a f266210t;

    /* renamed from: u */
    private final C68214a f266211u;

    /* renamed from: v */
    private final C21370a f266212v;

    /* renamed from: w */
    private final C9325m f266213w;

    /* renamed from: x */
    private final C89646bc f266214x;

    /* renamed from: y */
    private final C84535at f266215y;

    /* renamed from: z */
    private final C94809h f266216z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95144aj(Context context, SharedPreferences sharedPreferences, C58833ax axVar, C86054o oVar, C86124t tVar, C90931ca caVar, C22871g gVar, C22871g gVar2, C21370a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C84535at atVar, C94809h hVar, C68214a aVar7, C68214a aVar8, C9684l lVar, C9325m mVar, C89647bd bdVar, ProxyPermissionsRequester proxyPermissionsRequester, C60888db dbVar) {
        super(C118575h.WORKER_BISTO, "bisto");
        this.f266197c = context;
        this.f266198f = sharedPreferences;
        this.f266205o = axVar;
        this.f266206p = oVar;
        this.f266207q = tVar;
        this.f266208r = caVar;
        this.f266199g = gVar;
        this.f266209s = gVar2;
        this.f266212v = aVar;
        this.f266210t = aVar2;
        this.f266211u = aVar3;
        this.f266200h = aVar4;
        this.f266201i = aVar5;
        this.f266202j = aVar6;
        this.f266215y = atVar;
        this.f266216z = hVar;
        this.f266192A = aVar7;
        this.f266203k = aVar8;
        this.f266193B = lVar;
        this.f266213w = mVar;
        this.f266204l = bdVar;
        this.f266194C = proxyPermissionsRequester;
        this.f266196E = dbVar;
        this.f266214x = new C89646bc(f266190m, 4, f266191n, 0);
    }

    /* renamed from: I */
    public static boolean m157262I(C124539a aVar) {
        C58976aa aaVar = C58975e.f156826a;
        aVar.f343619a.getAddress();
        aVar.f343619a.getType();
        C89681t.m146047m(aVar.f343619a.getUuids());
        C89681t.m146041g(aVar.f343619a.getUuids());
        if (aVar.f343619a.getType() == 2) {
            return true;
        }
        if (aVar.f343619a.getType() != 3 || C89681t.m146047m(aVar.f343619a.getUuids()) || C89681t.m146041g(aVar.f343619a.getUuids())) {
            return false;
        }
        return true;
    }

    /* renamed from: K */
    private final void m157263K(Intent intent) {
        this.f266195D.mo51511a(new C95156m(this, intent), this.f266196E);
    }

    /* renamed from: L */
    private final void m157264L(Runnable runnable) {
        C59104x b = f266188a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoWorker");
        ((C59052c) ((C59052c) b).mo56372aa(18222)).mo56386p("Request connect permission");
        this.f266194C.mo81047ju(new String[]{"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN"}, 18, new C95168y(runnable));
    }

    /* renamed from: M */
    private final void m157265M(C124539a aVar) {
        if (aVar.f343619a.getAddress() == null) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C22871g gVar = this.f266199g;
        long a = this.f266207q.mo79743a(C90071dw.f249756a) - TimeUnit.SECONDS.toMillis(1);
        C58838bb.m90868c(a > 0);
        gVar.mo28204d("check_pair", a, new C95152i(this, aVar));
    }

    /* renamed from: A */
    public final void mo89060A(String str, String str2, int i, Bundle bundle) {
        if (!C91076c.m148792a(this.f266197c)) {
            m157264L(new C95140af(this, str, str2, i, bundle));
            return;
        }
        Intent a = C89636g.m145895a(this.f266197c, str, str2, i, C60105ky.ANDROID_OOBE_COMPANION_APP_DEEP_LINK);
        if (bundle != null) {
            a.putExtra("deeplink_context", bundle);
        }
        this.f266197c.startActivity(a);
    }

    /* renamed from: B */
    public final void mo89061B(Intent intent, UsbDevice usbDevice, boolean z) {
        intent.putExtra("device", usbDevice);
        if (z) {
            mo89070v(intent);
        } else {
            m157263K(intent);
        }
    }

    /* renamed from: C */
    public final boolean mo89062C() {
        if (!C89681t.m146048n(this.f266198f)) {
            return false;
        }
        return this.f266204l.mo83538b();
    }

    /* renamed from: D */
    public final boolean mo89063D() {
        UserManager userManager;
        if ((this.f266205o.mo56113h() && !((C109029a) this.f266205o.mo56107c()).mo97397b()) || (userManager = (UserManager) this.f266197c.getSystemService("user")) == null) {
            return true;
        }
        if (userManager.isSystemUser()) {
            return false;
        }
        C59104x b = f266188a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoWorker");
        ((C59052c) ((C59052c) b).mo56372aa(18236)).mo56386p("Not owner");
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0267, code lost:
        r0 = r11.f343619a.getAddress();
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89064E(android.content.Intent r10, com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9391a.C124539a r11, boolean r12) {
        /*
            r9 = this;
            boolean r0 = com.google.android.apps.gsa.shared.bisto.C89651f.m145946g(r10)
            r1 = 0
            if (r0 == 0) goto L_0x0029
            if (r12 != 0) goto L_0x0029
            android.content.SharedPreferences r10 = r9.f266198f
            boolean r10 = com.google.android.apps.gsa.shared.bisto.C89681t.m146052r(r11, r1, r10)
            if (r10 == 0) goto L_0x0028
            dagger.a r10 = r9.f266202j
            java.lang.Object r10 = r10.mo27525b()
            com.google.android.apps.gsa.shared.util.v.g r10 = (com.google.android.apps.gsa.shared.util.p7188v.C91142g) r10
            com.google.android.libraries.f.a r12 = r9.f266212v
            boolean r10 = com.google.android.apps.gsa.staticplugins.bisto.util.C96461as.m159828e(r10, r12)
            if (r10 == 0) goto L_0x0025
            r9.m157265M(r11)
            return
        L_0x0025:
            r9.mo89065F(r11)
        L_0x0028:
            return
        L_0x0029:
            boolean r0 = com.google.android.apps.gsa.shared.bisto.C89651f.m145941b(r10)
            r2 = 1
            java.lang.String r3 = "BistoWorker"
            if (r0 == 0) goto L_0x0138
            com.google.common.f.e r0 = f266188a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r3)
            java.lang.String r4 = "refreshUuidForA2dpConnected"
            r5 = 18193(0x4711, float:2.5494E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r5)).mo56386p(r4)
            android.content.SharedPreferences r0 = r9.f266198f
            com.google.android.apps.gsa.shared.util.c.ca r4 = r9.f266208r
            boolean r0 = com.google.android.apps.gsa.shared.bisto.C89681t.m146053s(r0, r4, r11)
            if (r0 != 0) goto L_0x0138
            android.content.SharedPreferences r0 = r9.f266198f
            boolean r0 = com.google.android.apps.gsa.shared.bisto.C89681t.m146052r(r11, r1, r0)
            if (r0 != 0) goto L_0x0138
            android.bluetooth.BluetoothDevice r0 = r11.f343619a
            android.os.ParcelUuid[] r0 = r0.getUuids()
            boolean r0 = com.google.android.apps.gsa.shared.bisto.C89681t.m146047m(r0)
            if (r0 != 0) goto L_0x0064
            goto L_0x0138
        L_0x0064:
            android.bluetooth.BluetoothDevice r0 = r11.f343619a
            boolean r0 = com.google.android.apps.gsa.staticplugins.bisto.util.C96476bg.m159855c(r0)
            if (r0 == 0) goto L_0x0138
            dagger.a r0 = r9.f266211u
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.bisto.util.bg r0 = (com.google.android.apps.gsa.staticplugins.bisto.util.C96476bg) r0
            android.bluetooth.BluetoothDevice r4 = r11.f343619a
            java.util.concurrent.atomic.AtomicReference r5 = r0.f269920f
            java.lang.Object r5 = r5.get()
            android.bluetooth.BluetoothDevice r5 = (android.bluetooth.BluetoothDevice) r5
            java.util.concurrent.atomic.AtomicReference r6 = r0.f269919e
            java.lang.Object r6 = r6.get()
            java.lang.String r7 = "UpgradedDeviceScanner"
            if (r6 == 0) goto L_0x00af
            if (r5 == 0) goto L_0x00af
            java.lang.String r6 = r5.getAddress()
            java.lang.String r8 = r4.getAddress()
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x00ac
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.bisto.util.C96476bg.f269911a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r7)
            java.lang.String r4 = "Scan already in progress"
            r5 = 17229(0x434d, float:2.4143E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r5)).mo56386p(r4)
            goto L_0x0138
        L_0x00ac:
            r0.mo90170b(r5, r1)
        L_0x00af:
            android.content.Context r5 = r0.f269917c
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            java.lang.String r6 = "android.hardware.bluetooth_le"
            boolean r5 = r5.hasSystemFeature(r6)
            r6 = 0
            if (r5 == 0) goto L_0x00ce
            android.bluetooth.BluetoothAdapter r5 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()
            if (r5 == 0) goto L_0x00ce
            boolean r8 = r5.isEnabled()
            if (r8 == 0) goto L_0x00ce
            android.bluetooth.le.BluetoothLeScanner r6 = r5.getBluetoothLeScanner()
        L_0x00ce:
            if (r6 != 0) goto L_0x00e3
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.bisto.util.C96476bg.f269911a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r7)
            java.lang.String r4 = "BLE scanner not available"
            r5 = 17228(0x434c, float:2.4142E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r5)).mo56386p(r4)
            goto L_0x0138
        L_0x00e3:
            com.google.common.f.e r5 = com.google.android.apps.gsa.staticplugins.bisto.util.C96476bg.f269911a
            com.google.common.f.x r5 = r5.mo56224b()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r8, r7)
            java.lang.String r7 = "Starting scan"
            r8 = 17227(0x434b, float:2.414E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r8)).mo56386p(r7)
            java.util.concurrent.atomic.AtomicReference r5 = r0.f269920f
            r5.set(r4)
            java.util.concurrent.atomic.AtomicReference r5 = r0.f269919e
            r5.set(r6)
            android.bluetooth.le.ScanFilter$Builder r5 = new android.bluetooth.le.ScanFilter$Builder
            r5.<init>()
            java.lang.String r7 = r4.getAddress()
            android.bluetooth.le.ScanFilter$Builder r5 = r5.setDeviceAddress(r7)
            android.bluetooth.le.ScanFilter r5 = r5.build()
            java.util.List r5 = java.util.Collections.singletonList(r5)
            android.bluetooth.le.ScanSettings$Builder r7 = new android.bluetooth.le.ScanSettings$Builder
            r7.<init>()
            android.bluetooth.le.ScanSettings$Builder r7 = r7.setScanMode(r2)
            android.bluetooth.le.ScanSettings r7 = r7.build()
            r6.startScan(r5, r7, r0)
            com.google.android.apps.gsa.shared.util.c.ca r5 = r0.f269918d
            com.google.android.apps.gsa.staticplugins.bisto.util.bf r6 = new com.google.android.apps.gsa.staticplugins.bisto.util.bf
            r6.<init>(r0, r4)
            com.google.android.apps.gsa.shared.util.c.au r0 = new com.google.android.apps.gsa.shared.util.c.au
            java.lang.String r4 = "Bisto scan canceler"
            r7 = 2
            r0.<init>(r4, r7, r1, r6)
            long r6 = com.google.android.apps.gsa.staticplugins.bisto.util.C96476bg.f269912b
            r5.mo85137b(r0, r6)
        L_0x0138:
            java.lang.String r0 = "android.bluetooth.device.action.UUID"
            java.lang.String r4 = r10.getAction()
            boolean r0 = r0.equals(r4)
            android.bluetooth.BluetoothDevice r4 = r11.f343619a
            int r4 = r4.getBondState()
            java.lang.String r5 = "android.bluetooth.device.action.ACL_CONNECTED"
            java.lang.String r6 = r10.getAction()
            boolean r5 = r5.equals(r6)
            if (r0 != 0) goto L_0x0156
            if (r5 == 0) goto L_0x0182
        L_0x0156:
            r6 = 12
            if (r4 == r6) goto L_0x0182
            if (r12 == 0) goto L_0x015d
            goto L_0x0182
        L_0x015d:
            com.google.common.f.e r12 = f266188a
            com.google.common.f.x r12 = r12.mo56224b()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r12.mo56378ag(r0, r3)
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12
            r0 = 18192(0x4710, float:2.5492E-41)
            com.google.common.f.x r12 = r12.mo56372aa(r0)
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12
            java.lang.String r10 = r10.getAction()
            android.bluetooth.BluetoothDevice r11 = r11.f343619a
            java.lang.String r11 = r11.getAddress()
            java.lang.String r0 = "Ignoring non-bonded action %s for device %s"
            r12.mo56354G(r0, r10, r11)
            return
        L_0x0182:
            java.lang.String r4 = "android.bluetooth.device.action.ACL_DISCONNECTED"
            java.lang.String r6 = r10.getAction()
            boolean r4 = r4.equals(r6)
            boolean r6 = com.google.android.apps.gsa.shared.bisto.C89651f.m145944e(r10)
            boolean r7 = com.google.android.apps.gsa.shared.bisto.C89651f.m145946g(r10)
            if (r12 == 0) goto L_0x01ea
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            if (r5 != 0) goto L_0x01a0
            if (r4 != 0) goto L_0x01a0
            if (r6 != 0) goto L_0x01a0
            if (r7 == 0) goto L_0x01e9
        L_0x01a0:
            android.content.SharedPreferences r12 = r9.f266198f
            boolean r12 = com.google.android.apps.gsa.shared.bisto.C89681t.m146052r(r11, r1, r12)
            if (r12 == 0) goto L_0x01be
            com.google.common.f.e r12 = f266188a
            com.google.common.f.x r12 = r12.mo56224b()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r12.mo56378ag(r0, r3)
            java.lang.String r0 = "BLE Bisto device"
            r1 = 18195(0x4713, float:2.5497E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r1)).mo56386p(r0)
            r9.mo89066G(r10, r11)
            return
        L_0x01be:
            com.google.android.apps.gsa.search.core.i.t r12 = r9.f266207q
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90122ft.f250864c
            boolean r12 = r12.mo79746e(r0)
            if (r12 != 0) goto L_0x01e9
            com.google.apps.tiktok.tracing.contrib.b.e r12 = r9.f266195D
            com.google.android.apps.gsa.staticplugins.bisto.af.g r0 = new com.google.android.apps.gsa.staticplugins.bisto.af.g
            r0.<init>(r9, r11)
            com.google.common.util.concurrent.db r1 = r9.f266196E
            com.google.common.util.concurrent.cx r12 = r12.mo51512b(r0, r1)
            com.google.apps.tiktok.tracing.contrib.b.f r12 = com.google.apps.tiktok.tracing.contrib.p3700b.C47633f.m84733g(r12)
            com.google.android.apps.gsa.staticplugins.bisto.af.ai r0 = new com.google.android.apps.gsa.staticplugins.bisto.af.ai
            r0.<init>(r9, r11, r10)
            com.google.common.util.concurrent.db r10 = r9.f266196E
            com.google.common.util.concurrent.cx r11 = r12.f164926b
            com.google.common.util.concurrent.bz r12 = com.google.apps.tiktok.tracing.C47810es.m84974n(r0)
            com.google.common.util.concurrent.C60856cj.m92911t(r11, r12, r10)
        L_0x01e9:
            return
        L_0x01ea:
            if (r4 == 0) goto L_0x01ef
            r9.m157265M(r11)
        L_0x01ef:
            android.content.SharedPreferences r12 = r9.f266198f
            boolean r12 = com.google.android.apps.gsa.shared.bisto.C89681t.m146052r(r11, r5, r12)
            if (r12 != 0) goto L_0x024a
            com.google.common.f.e r12 = f266188a
            com.google.common.f.x r1 = r12.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r4, r3)
            java.lang.String r4 = "Not a bisto device: %s"
            r6 = 18189(0x470d, float:2.5488E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r6)).mo56389s(r4, r11)
            if (r0 == 0) goto L_0x0210
            android.content.SharedPreferences r0 = r9.f266198f
            com.google.android.apps.gsa.shared.bisto.C89681t.m146051q(r11, r0)
        L_0x0210:
            android.bluetooth.BluetoothDevice r0 = r11.f343619a
            android.os.ParcelUuid[] r0 = r0.getUuids()
            boolean r0 = com.google.android.apps.gsa.shared.bisto.C89681t.m146047m(r0)
            if (r0 == 0) goto L_0x0231
            if (r5 == 0) goto L_0x0231
            com.google.common.f.x r12 = r12.mo56224b()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r12.mo56378ag(r0, r3)
            java.lang.String r0 = "Reconnect Herbie with input only mode"
            r1 = 18190(0x470e, float:2.549E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r1)).mo56386p(r0)
            r9.mo89073y()
        L_0x0231:
            dagger.a r12 = r9.f266203k
            java.lang.Object r12 = r12.mo27525b()
            com.google.android.apps.gsa.shared.bisto.k r12 = (com.google.android.apps.gsa.shared.bisto.C89656k) r12
            r0 = 102(0x66, float:1.43E-43)
            boolean r12 = r12.mo83555j(r0)
            if (r12 == 0) goto L_0x0249
            java.lang.String r12 = "extra_bisto_simple_bt"
            r10.putExtra(r12, r2)
            r9.mo89066G(r10, r11)
        L_0x0249:
            return
        L_0x024a:
            com.google.common.f.e r12 = f266188a
            com.google.common.f.x r0 = r12.mo56224b()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r6, r3)
            java.lang.String r6 = "bluetoothConnectionStateChanged: starting service"
            r7 = 18188(0x470c, float:2.5487E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r7)).mo56386p(r6)
            if (r4 != 0) goto L_0x0265
            android.content.Context r0 = r9.f266197c
            android.content.SharedPreferences r4 = r9.f266198f
            com.google.android.apps.gsa.shared.bisto.C89681t.m146037c(r0, r4, r1)
        L_0x0265:
            if (r5 == 0) goto L_0x02d8
            android.bluetooth.BluetoothDevice r0 = r11.f343619a
            java.lang.String r0 = r0.getAddress()
            dagger.a r1 = r9.f266201i
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.shared.bisto.a.cd r1 = (com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd) r1
            com.google.android.apps.search.assistant.surfaces.bisto.c.b.d r1 = r1.mo83401b(r0)
            if (r1 == 0) goto L_0x02d8
            com.google.android.apps.search.assistant.surfaces.bisto.d.az r4 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az.OOBE_FINISHED
            com.google.android.apps.search.assistant.surfaces.bisto.d.az r1 = r1.mo106520r()
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0288
            goto L_0x02d8
        L_0x0288:
            java.lang.String r1 = "key_screen_locked-"
            java.lang.String r4 = java.lang.String.valueOf(r0)
            java.lang.String r1 = r1.concat(r4)
            dagger.a r4 = r9.f266202j
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.shared.util.v.g r4 = (com.google.android.apps.gsa.shared.util.p7188v.C91142g) r4
            boolean r4 = r4.mo85404i(r1)
            if (r4 == 0) goto L_0x02d8
            com.google.common.f.x r12 = r12.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r12.mo56378ag(r4, r3)
            java.lang.String r3 = "Migrated AllowResponsesLockedScreen for %s"
            r4 = 18227(0x4733, float:2.5541E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r4)).mo56389s(r3, r0)
            dagger.a r12 = r9.f266202j
            java.lang.Object r12 = r12.mo27525b()
            com.google.android.apps.gsa.shared.util.v.g r12 = (com.google.android.apps.gsa.shared.util.p7188v.C91142g) r12
            boolean r12 = r12.mo85406k(r1, r2)
            dagger.a r3 = r9.f266201i
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.shared.bisto.a.cd r3 = (com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd) r3
            r12 = r12 ^ r2
            r3.mo83371M(r0, r12)
            com.google.android.apps.gsa.search.core.aj.at r12 = r9.f266215y
            com.google.android.apps.gsa.search.core.aj.as r12 = r12.mo78243a()
            com.google.android.apps.gsa.search.core.aj.ar r12 = r12.mo78241a()
            r12.mo78240f(r1)
            r12.mo78236b()
        L_0x02d8:
            r9.mo89066G(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7481af.C95144aj.mo89064E(android.content.Intent, com.google.android.apps.search.assistant.surfaces.bisto.c.a.a, boolean):void");
    }

    /* renamed from: F */
    public final void mo89065F(C124539a aVar) {
        String address = aVar.f343619a.getAddress();
        C89681t.m146039e(address, this.f266198f);
        C96476bg.m159854a(address, this.f266198f);
        Intent intent = new Intent("com.google.android.apps.gsa.broadcastreceiver.SETTINGS_CHANGED");
        aVar.mo106453b(intent);
        mo89066G(intent, aVar);
        ((C89492cd) this.f266201i.mo27525b()).mo83361C(address);
    }

    /* renamed from: G */
    public final void mo89066G(Intent intent, C124539a aVar) {
        C90873ag agVar = new C90873ag(((C89492cd) this.f266201i.mo27525b()).mo83408n(aVar.f343619a.getAddress()), this.f266199g, "getDeviceInfo", new C95157n(this, intent, aVar));
        agVar.mo85224b(C124551g.class, new C95158o(this, aVar, intent));
        agVar.mo85223a(new C95159p(this, aVar, intent));
    }

    /* renamed from: H */
    public final void mo89067H(Intent intent, C124539a aVar, boolean z) {
        aVar.mo106452a(intent);
        if (z) {
            C89636g.m145897c(intent);
        }
        mo89070v(intent);
    }

    /* renamed from: J */
    public final void mo89068J(String str, int i) {
        UsbDevice usbDevice;
        if (C91076c.m148792a(this.f266197c)) {
            Intent intent = new Intent("bisto.QUERY_DEVICE_INFO");
            if (BluetoothAdapter.checkBluetoothAddress(str)) {
                if (!C89681t.m146045k(str, this.f266198f)) {
                    C59104x c = f266188a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "BistoWorker");
                    ((C59052c) ((C59052c) c).mo56372aa(18220)).mo56389s("BT device %s is not bonded!", str);
                } else {
                    C124539a c2 = C89652g.m145951a().mo83542c(str);
                    c2.mo106453b(intent);
                    mo89066G(intent, c2);
                }
            } else if (str.startsWith("simple-")) {
                C58485gu a = this.f266204l.mo83537a();
                int size = a.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        usbDevice = null;
                        break;
                    }
                    usbDevice = (UsbDevice) a.get(i2);
                    i2++;
                    if (str.equals(C124521b.m203980c(usbDevice))) {
                        break;
                    }
                }
                if (usbDevice == null) {
                    C59104x c3 = f266188a.mo56225c();
                    c3.mo56378ag(C58975e.f156826a, "BistoWorker");
                    ((C59052c) ((C59052c) c3).mo56372aa(18219)).mo56389s("Null usbDevice with id: %s", str);
                } else {
                    intent.putExtra("device", usbDevice);
                    mo89061B(intent, usbDevice, false);
                }
            } else {
                C59104x c4 = f266188a.mo56225c();
                c4.mo56378ag(C58975e.f156826a, "BistoWorker");
                ((C59052c) ((C59052c) c4).mo56372aa(18218)).mo56389s("Unrecognized device for id: %s", str);
            }
            C90873ag agVar = new C90873ag(((C89492cd) this.f266201i.mo27525b()).mo83410p(str, C95163t.f266260a, (this.f266212v.mo26870b() + f266189b.toMillis()) - this.f266212v.mo26870b()), this.f266199g, "start-oobe", new C95164u(this, str, i));
            agVar.mo85224b(TimeoutException.class, new C95165v(str));
            agVar.mo85223a(C95167x.f266267a);
            return;
        }
        m157264L(new C95162s(this, str, i));
    }

    /* renamed from: a */
    public final C60870cx mo79065a(String str) {
        if (mo89063D()) {
            C58976aa aaVar = C58975e.f156826a;
            return C118826c.f331423b;
        }
        C95493j jVar = (C95493j) this.f266210t.mo27525b();
        new C90873ag(jVar.f267224h.mo83407m(str), jVar.f267222f, "checkForUpdateAsync", new C95489f(jVar, str)).mo85223a(new C95490g(str));
        return C118826c.f331423b;
    }

    /* renamed from: b */
    public final C60870cx mo79066b(String str) {
        return this.f266199g.mo28207g("bisto-clear-device", new C95134a(this, str));
    }

    /* renamed from: c */
    public final C60870cx mo79067c(long j) {
        if (mo89063D()) {
            C58976aa aaVar = C58975e.f156826a;
            return C118826c.f331423b;
        }
        Intent intent = new Intent("android.intent.action.DOWNLOAD_COMPLETE");
        intent.putExtra("extra_download_id", j);
        return mo89069u(intent, false);
    }

    /* renamed from: e */
    public final C60870cx mo79068e() {
        return this.f266209s.mo28202b("onBootOrInstall", new C95149f(this));
    }

    /* renamed from: f */
    public final C60870cx mo79069f() {
        if (!mo89063D()) {
            return mo89069u(new Intent("com.google.android.apps.gsa.broadcastreceiver.SETTINGS_CHANGED"), false);
        }
        C59104x b = f266188a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoWorker");
        ((C59052c) ((C59052c) b).mo56372aa(18184)).mo56386p("Bisto not supported");
        return C118826c.f331423b;
    }

    /* renamed from: g */
    public final C60870cx mo79070g() {
        C59104x c = f266188a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BistoWorker");
        ((C59052c) ((C59052c) c).mo56372aa(18185)).mo56386p("requestClientFollowOn - should not be received; legacy query path removed");
        return C118826c.f331423b;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        String str;
        C58976aa aaVar = C58975e.f156826a;
        fVar.mo85291r("BistoWorker");
        List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) this.f266197c.getSystemService("activity")).getRunningServices(50);
        C9325m mVar = this.f266213w;
        String format = String.format("GSA is Active Assistant = %b, GSA is VIS = %b", new Object[]{Boolean.valueOf(this.f266213w.mo17534a()), Boolean.valueOf(VoiceInteractionService.isActiveService(mVar.f32350a, mVar.f32351b))});
        if (runningServices != null) {
            Iterator<ActivityManager.RunningServiceInfo> it = runningServices.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningServiceInfo next = it.next();
                if (next.service.equals(this.f266213w.f32351b)) {
                    str = format + ",# crashes = " + next.crashCount + ", is foreground = " + next.foreground + ", started = " + next.started + ", uid = " + next.uid + ", is restarting = " + next.restarting + ", process = " + next.process;
                    break;
                }
            }
            fVar.mo85292s(C90752i.m148229c(str));
        }
        str = String.valueOf(format).concat(", not running");
        fVar.mo85292s(C90752i.m148229c(str));
    }

    /* renamed from: h */
    public final void mo79071h(Intent intent) {
        UsbDevice usbDevice;
        if (mo89063D()) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        if (C89651f.m145945f(intent)) {
            C59071e eVar = f266188a;
            C59104x b = eVar.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoWorker");
            ((C59052c) ((C59052c) b).mo56372aa(18186)).mo56389s("bluetoothConnectionStateChanged. Action: %s", intent.getAction());
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (bluetoothDevice == null) {
                C59104x d = eVar.mo56226d();
                d.mo56378ag(C58975e.f156826a, "BistoWorker");
                ((C59052c) ((C59052c) d).mo56372aa(18187)).mo56386p("bluetoothConnectionStateChanged. No EXTRA_DEVICE");
                return;
            }
            C124539a aVar = new C124539a(bluetoothDevice);
            new C90873ag(((C89492cd) this.f266201i.mo27525b()).mo83408n(aVar.f343619a.getAddress()), this.f266199g, "getDeviceInfo", new C95160q(this, intent, aVar)).mo85223a(new C95161r(this, aVar, intent));
        } else if (C89651f.m145949j(intent)) {
            if (C124527h.m203996b(this.f266197c) && C124527h.m203995a(this.f266197c) && (usbDevice = (UsbDevice) intent.getParcelableExtra("device")) != null && this.f266204l.mo83539c(usbDevice)) {
                SharedPreferences sharedPreferences = this.f266198f;
                Set b2 = C89681t.m146036b(sharedPreferences);
                if (b2.add(new C89680s(C124521b.m203980c(usbDevice)))) {
                    C89681t.m146040f(b2, sharedPreferences);
                }
                m157263K(intent);
            }
        } else if (C89651f.m145947h(intent)) {
            if (C124527h.m203996b(this.f266197c)) {
                C90873ag agVar = new C90873ag(((C89492cd) this.f266201i.mo27525b()).mo83408n("wired"), this.f266199g, "get-device-info", new C95166w(this, intent));
                agVar.mo85224b(C124551g.class, new C95169z(this, intent));
                agVar.mo85223a(C95135aa.f266169a);
            }
        } else if (C89651f.m145950k(intent)) {
            this.f266209s.mo28212l("user-present", new C95155l(this));
        } else if (C89651f.m145948i(intent)) {
            mo89069u(intent, false);
        } else {
            C59104x d2 = f266188a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "BistoWorker");
            ((C59052c) ((C59052c) d2).mo56372aa(18197)).mo56389s("Wrong intent action: %s", intent.getAction());
        }
    }

    /* renamed from: i */
    public final void mo79072i(Intent intent) {
        if (!mo89062C()) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C90873ag agVar = new C90873ag(((C89492cd) this.f266201i.mo27525b()).mo83408n("wired"), this.f266199g, "get-device-info", new C95136ab(this, intent));
        agVar.mo85224b(C124551g.class, C95137ac.f266172a);
        agVar.mo85223a(C95138ad.f266173a);
    }

    /* renamed from: j */
    public final void mo79073j() {
        C59104x b = f266188a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoWorker");
        ((C59052c) ((C59052c) b).mo56372aa(18221)).mo56386p("refreshAssistantSettings");
        C94809h hVar = this.f266216z;
        C59104x b2 = C94809h.f265108a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "BistoSettingsListener");
        ((C59052c) ((C59052c) b2).mo56372aa(16920)).mo56386p("refreshAssistantSettings");
        String F = ((C86054o) hVar.f265113f.mo27525b()).mo79659F();
        String concat = "assistant_settings_preferred_voice:".concat(String.valueOf(F));
        l lVar = hVar.f265114g;
        Account a = ((C86054o) hVar.f265113f.mo27525b()).mo79668a();
        acu acu = (acu) acv.f128920X.createBuilder();
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        acv.f128945a |= 268435456;
        acv.f128968x = true;
        new C90873ag(lVar.j(a, (acv) acu.build(), C50144me.f130361d, 5, TimeUnit.SECONDS, hVar.getClass().getSimpleName()), hVar.f265111d, "refreshVoiceSettingFromServer", new C94804c(hVar, F, concat)).mo85223a(new C94805d(hVar, concat));
    }

    /* renamed from: k */
    public final void mo79074k(String str, List list) {
        Intent intent = new Intent("action_start_audio_testing");
        intent.putExtra("extra_device_id", str);
        intent.putIntegerArrayListExtra("extra_profiles_for_audio_testing", new ArrayList(list));
        m157263K(intent);
    }

    /* renamed from: l */
    public final void mo79075l(String str, String str2, Bundle bundle) {
        C89681t.m146050p(C89652g.m145951a().mo83542c(str), this.f266198f);
        C90873ag agVar = new C90873ag(((C89492cd) this.f266201i.mo27525b()).mo83408n(str), this.f266199g, "get-device-info", new C95146c(this, str, str2, bundle));
        agVar.mo85224b(C124551g.class, new C95147d(this, str, str2, bundle));
        agVar.mo85223a(C95148e.f266228a);
    }

    /* renamed from: m */
    public final void mo79076m(String str) {
        mo89068J(str, 2);
    }

    /* renamed from: n */
    public final void mo79077n(String str) {
        Intent intent = new Intent("action_stop_audio_testing");
        intent.putExtra("extra_device_id", str);
        m157263K(intent);
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }

    /* renamed from: p */
    public final void mo79078p(String str, boolean z) {
        m157263K(new Intent("action_set_hotword_setting_state").putExtra("key_device_id", str).putExtra("extra_hotword_setting_state", z));
    }

    /* renamed from: q */
    public final void mo79079q() {
        boolean z = ((C89994f) this.f266192A.mo27525b()).mo83840z();
        C84533ar a = this.f266215y.mo78243a().mo78241a();
        a.mo78237c("key_personal_results_headphones_enabled", z);
        a.mo78236b();
    }

    /* renamed from: r */
    public final void mo79080r() {
        Account a = this.f266206p.mo79668a();
        if (a == null) {
            C59104x c = f266188a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoWorker");
            ((C59052c) ((C59052c) c).mo56372aa(18226)).mo56386p("Couldn't get logged in Google account.");
            return;
        }
        boolean h = this.f266193B.mo17959h(a);
        C84533ar a2 = this.f266215y.mo78243a().mo78241a();
        a2.mo78237c("key_personal_results_enabled", h);
        a2.mo78236b();
    }

    /* renamed from: s */
    public final void mo79081s(String str) {
        C59104x b = f266188a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoWorker");
        ((C59052c) ((C59052c) b).mo56372aa(18225)).mo56389s("startOobeActivity(%s)", str);
        if (str != null) {
            mo89068J(str, 1);
            return;
        }
        Context context = this.f266197c;
        SharedPreferences sharedPreferences = this.f266198f;
        C91142g gVar = (C91142g) this.f266202j.mo27525b();
        C89681t.m146054t(context, sharedPreferences, this.f266204l, new C95141ag(this));
    }

    /* renamed from: u */
    public final C60870cx mo89069u(Intent intent, boolean z) {
        return this.f266195D.mo51512b(new C95145b(this, intent, z), this.f266196E);
    }

    /* renamed from: v */
    public final void mo89070v(Intent intent) {
        Context context = this.f266197c;
        if (this.f266205o.mo56113h()) {
            C109029a aVar = (C109029a) this.f266205o.mo56107c();
            boolean i = aVar.mo97404i(aVar.mo97402g(this.f266206p.mo79668a()));
            boolean b = ((C109029a) this.f266205o.mo56107c()).mo97397b();
            C58976aa aaVar = C58975e.f156826a;
            intent.putExtra("extra_opt_in_state", i).putExtra("extra_available_for_onboarding", b);
        }
        C124519a.m203974a(context, intent);
    }

    /* renamed from: w */
    public final void mo89071w(Intent intent) {
        String stringExtra = intent.getStringExtra("key_device_id");
        if (C58837ba.m90859h(stringExtra)) {
            C59104x d = f266188a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoWorker");
            ((C59052c) ((C59052c) d).mo56372aa(18200)).mo56386p("Missing device id");
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        mo79069f();
        C89636g.m145900f(this.f266197c, stringExtra, C124633az.OOBE_FINISHED);
    }

    /* renamed from: x */
    public final void mo89072x(C58833ax axVar) {
        C59104x b = f266188a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoWorker");
        ((C59052c) ((C59052c) b).mo56372aa(18216)).mo56386p("Performing LockscreenPersonalResponseSetting migration.");
        boolean z = false;
        if (axVar.mo56113h()) {
            boolean z2 = false;
            boolean z3 = true;
            for (C124548d dVar : (List) axVar.mo56107c()) {
                if (dVar.mo106520r().equals(C124633az.OOBE_FINISHED)) {
                    z3 &= !dVar.mo106483X();
                    z2 = true;
                }
            }
            if (z2 && z3) {
                z = true;
            }
        }
        EventForDump.m147676e(5, "Migrate bisto lockscreen personal response");
        ((C89994f) this.f266192A.mo27525b()).mo83836B(z);
        C84533ar a = this.f266215y.mo78243a().mo78241a();
        a.mo78237c("key_personal_results_settings_migration_complete", true);
        a.mo78236b();
    }

    /* renamed from: y */
    public final void mo89073y() {
        this.f266214x.mo83535b();
        mo89074z();
    }

    /* renamed from: z */
    public final void mo89074z() {
        C89646bc bcVar = this.f266214x;
        if (bcVar.mo83536c()) {
            C59104x c = f266188a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoWorker");
            ((C59052c) ((C59052c) c).mo56372aa(18223)).mo56386p("Max retry time exceeded!");
            return;
        }
        this.f266209s.mo28213m("connectInputOnlyMode", bcVar.mo83534a(), new C95139ae(this));
    }
}
