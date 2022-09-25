package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7525b;

import android.content.Intent;
import android.hardware.usb.UsbDevice;
import androidx.annotation.C0826b;
import com.google.android.apps.gsa.binaries.satin.app.bam;
import com.google.android.apps.gsa.binaries.satin.app.bao;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.android.apps.gsa.shared.bisto.C89647bd;
import com.google.android.apps.gsa.shared.bisto.C89651f;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95358bi;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95447t;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.C96056f;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96019bo;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96020bp;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96021bq;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96022br;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import dagger.C68214a;
import dagger.p5294a.C68225k;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.b.d */
/* compiled from: PG */
public final class C96002d implements C96020bp, C96022br {

    /* renamed from: e */
    private static final C59071e f268783e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.u.b.b.d");

    /* renamed from: a */
    public final C95358bi f268784a;

    /* renamed from: b */
    public final Map f268785b = new HashMap();

    /* renamed from: c */
    public final Map f268786c = new HashMap();

    /* renamed from: d */
    C60870cx f268787d = C60866ct.f164955a;

    /* renamed from: f */
    private final C68214a f268788f;

    /* renamed from: g */
    private final C89492cd f268789g;

    /* renamed from: h */
    private final C68214a f268790h;

    /* renamed from: i */
    private final C96056f f268791i;

    /* renamed from: j */
    private final C88483e f268792j;

    /* renamed from: k */
    private final C89656k f268793k;

    /* renamed from: l */
    private final C84516aa f268794l;

    /* renamed from: m */
    private final C89647bd f268795m;

    /* renamed from: n */
    private final C60887da f268796n;

    /* renamed from: o */
    private final C60887da f268797o;

    /* renamed from: p */
    private boolean f268798p;

    /* renamed from: q */
    private final bam f268799q;

    public C96002d(C95358bi biVar, C89492cd cdVar, C68214a aVar, bam bam, C95850a aVar2, C68214a aVar3, C96056f fVar, C88483e eVar, C89656k kVar, C84516aa aaVar, C89647bd bdVar, C60887da daVar, C60887da daVar2) {
        C58976aa aaVar2 = C58975e.f156826a;
        this.f268784a = biVar;
        this.f268789g = cdVar;
        this.f268788f = aVar3;
        this.f268790h = aVar;
        this.f268799q = bam;
        this.f268791i = fVar;
        this.f268792j = eVar;
        this.f268793k = kVar;
        this.f268794l = aaVar;
        this.f268795m = bdVar;
        this.f268796n = daVar;
        this.f268797o = daVar2;
        aVar2.f268408a.add(this);
    }

    /* renamed from: d */
    private final void m159190d(Intent intent, String str) {
        C124548d b;
        if (str == null) {
            C59104x c = f268783e.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoWiredManager");
            ((C59052c) ((C59052c) c).mo56372aa(15951)).mo56389s("Null device ID in intent with action: %s", intent.getAction());
            return;
        }
        C59071e eVar = f268783e;
        C59104x b2 = eVar.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "BistoWiredManager");
        ((C59052c) ((C59052c) b2).mo56372aa(15947)).mo56354G("forwardIntentToDeviceManager %s %s", intent, str);
        if (this.f268785b.containsKey(str)) {
            C96004f fVar = (C96004f) this.f268785b.get(str);
            fVar.getClass();
            fVar.mo89892p(intent);
        } else if (this.f268786c.containsKey(str)) {
            C96004f fVar2 = (C96004f) this.f268786c.get(str);
            fVar2.getClass();
            this.f268785b.put(str, fVar2);
            fVar2.mo89892p(intent);
        } else {
            C95355bf a = this.f268784a.mo89297a(str);
            if (a == null) {
                C59104x c2 = eVar.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "BistoWiredManager");
                ((C59052c) ((C59052c) c2).mo56372aa(15950)).mo56389s("bistoDevice not found for %s", str);
            } else if (!a.mo89280y()) {
                C59104x b3 = eVar.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "BistoWiredManager");
                ((C59052c) ((C59052c) b3).mo56372aa(15949)).mo56386p("forwardIntentToDeviceManager: Not a BaseWiredDevice; ignoring");
            } else {
                if (!"ACTION_OOBE_STATUS_UPDATED".equals(intent.getAction()) && (b = this.f268789g.mo83401b(str)) != null && b.mo106520r().equals(C124633az.OOBE_IN_PROGRESS)) {
                    this.f268789g.mo83394aj(str, (C124636bb) null, C124633az.OOBE_NOT_FINISHED);
                }
                mo89874a((C95447t) a);
                C96004f fVar3 = (C96004f) this.f268785b.get(str);
                fVar3.getClass();
                fVar3.mo89892p(intent);
            }
        }
    }

    /* renamed from: e */
    private final void m159191e(UsbDevice usbDevice, Intent intent, String str) {
        if (str == null) {
            C59104x c = f268783e.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoWiredManager");
            ((C59052c) ((C59052c) c).mo56372aa(15953)).mo56389s("Null device ID in intent with action: %s", intent.getAction());
            return;
        }
        if (this.f268784a.mo89297a(str) == null) {
            C58976aa aaVar = C58975e.f156826a;
            this.f268784a.mo89299c(usbDevice, str);
        }
        m159190d(intent, str);
    }

    /* renamed from: f */
    private final void m159192f() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268785b.keySet();
        this.f268786c.keySet();
        ((C96019bo) this.f268788f.mo27525b()).mo88558f(this, !this.f268785b.isEmpty());
    }

    /* renamed from: a */
    public final void mo89874a(C95447t tVar) {
        if (!this.f268786c.containsKey(tVar.f267071c)) {
            C59104x b = f268783e.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoWiredManager");
            ((C59052c) ((C59052c) b).mo56372aa(15977)).mo56386p("Requesting up-to-date settings information");
            C89651f.m145940a(this.f268792j, new C88489j(C87739bu.BISTO_REFRESH_ASSISTANT_SETTINGS).mo82013a());
            bam bam = this.f268799q;
            tVar.getClass();
            bam.f204881d = tVar;
            bam.f204880c = this;
            C68225k.m98529a(bam.f204880c, C96022br.class);
            C68225k.m98529a(bam.f204881d, C95447t.class);
            C96004f fVar = (C96004f) new bao(bam.f204878a, bam.f204879b, bam.f204880c, bam.f204881d).f204897p.mo17428b();
            this.f268786c.put(tVar.f267071c, fVar);
            this.f268785b.put(tVar.f267071c, fVar);
            return;
        }
        C59104x d = f268783e.mo56226d();
        d.mo56378ag(C58975e.f156826a, "BistoWiredManager");
        ((C59052c) ((C59052c) d).mo56372aa(15944)).mo56386p("Manager already exists");
    }

    /* renamed from: b */
    public final void mo89859b(String str) {
        C59071e eVar = f268783e;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoWiredManager");
        ((C59052c) ((C59052c) b).mo56372aa(15972)).mo56389s("isInInactiveState %s", str);
        if (!this.f268798p) {
            C59104x b2 = eVar.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "BistoWiredManager");
            ((C59052c) ((C59052c) b2).mo56372aa(15973)).mo56389s("Moving deviceManager for %s into inactive", str);
            this.f268785b.remove(str);
            m159192f();
        }
    }

    /* renamed from: c */
    public final void mo89875c() {
        this.f268787d.cancel(true);
        C60887da daVar = this.f268797o;
        C89647bd bdVar = this.f268795m;
        Objects.requireNonNull(bdVar);
        C60870cx b = daVar.mo19399b(new C95979a(bdVar));
        C60887da daVar2 = this.f268797o;
        C89647bd bdVar2 = this.f268795m;
        Objects.requireNonNull(bdVar2);
        C60870cx b2 = daVar2.mo19399b(new C96000b(bdVar2));
        this.f268787d = C60856cj.m92895d(b, b2).mo57336c(new C96001c(this, b, b2), this.f268796n);
    }

    public final void close() {
        C22872h.m42742b(C0826b.class);
        C59071e eVar = f268783e;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoWiredManager");
        ((C59052c) ((C59052c) b).mo56372aa(15945)).mo56386p("close");
        if (this.f268798p) {
            C59104x d = eVar.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoWiredManager");
            ((C59052c) ((C59052c) d).mo56372aa(15946)).mo56386p("Already destroyed");
            return;
        }
        this.f268798p = true;
        this.f268787d.cancel(true);
        Iterator it = new HashSet(this.f268786c.values()).iterator();
        while (it.hasNext()) {
            ((C96021bq) it.next()).close();
        }
        this.f268785b.clear();
        this.f268786c.clear();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89864h(android.content.Intent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            com.google.common.f.e r2 = f268783e
            com.google.common.f.x r3 = r2.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r5 = "BistoWiredManager"
            r3.mo56378ag(r4, r5)
            java.lang.String r4 = r18.getAction()
            r6 = 15956(0x3e54, float:2.2359E-41)
            java.lang.String r7 = "handleIntent. Action: %s"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r6)).mo56389s(r7, r4)
            boolean r3 = r0.f268798p
            if (r3 == 0) goto L_0x0031
            com.google.common.f.x r1 = r2.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r5)
            java.lang.String r2 = "Already destroyed"
            r3 = 15970(0x3e62, float:2.2379E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x0031:
            boolean r3 = com.google.android.apps.gsa.shared.bisto.p7029b.C89636g.m145898d(r18)
            if (r3 == 0) goto L_0x0038
            return
        L_0x0038:
            java.lang.String r3 = r18.getAction()
            if (r3 != 0) goto L_0x004f
            com.google.common.f.x r1 = r2.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r5)
            java.lang.String r2 = "Null action"
            r3 = 15969(0x3e61, float:2.2377E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x004f:
            int r4 = r3.hashCode()
            r6 = 0
            r7 = 1
            switch(r4) {
                case -2114103349: goto L_0x00e5;
                case -1712754119: goto L_0x00db;
                case -1676458352: goto L_0x00d0;
                case -1608292967: goto L_0x00c5;
                case -1012176807: goto L_0x00bb;
                case -535726315: goto L_0x00b1;
                case 94921639: goto L_0x00a7;
                case 938251674: goto L_0x009d;
                case 1244161670: goto L_0x0092;
                case 1383482656: goto L_0x0088;
                case 1670942630: goto L_0x007c;
                case 1713924190: goto L_0x0070;
                case 1854535521: goto L_0x0065;
                case 1931599820: goto L_0x005a;
                default: goto L_0x0058;
            }
        L_0x0058:
            goto L_0x00f0
        L_0x005a:
            java.lang.String r4 = "com.google.android.apps.gsa.shared.bisto.ACTION_DEVICE_BOOT_OR_APP_INSTALL"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x00f0
            r4 = 4
            goto L_0x00f1
        L_0x0065:
            java.lang.String r4 = "ACTION_OOBE_STATUS_UPDATED"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x00f0
            r4 = 7
            goto L_0x00f1
        L_0x0070:
            java.lang.String r4 = "android.speech.action.WEB_SEARCH"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x00f0
            r4 = 12
            goto L_0x00f1
        L_0x007c:
            java.lang.String r4 = "android.speech.action.VOICE_SEARCH_HANDS_FREE"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x00f0
            r4 = 13
            goto L_0x00f1
        L_0x0088:
            java.lang.String r4 = "enable_mini_dump"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x00f0
            r4 = 0
            goto L_0x00f1
        L_0x0092:
            java.lang.String r4 = "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x00f0
            r4 = 11
            goto L_0x00f1
        L_0x009d:
            java.lang.String r4 = "bisto_set_headphones_enable_state"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x00f0
            r4 = 5
            goto L_0x00f1
        L_0x00a7:
            java.lang.String r4 = "crash"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x00f0
            r4 = 2
            goto L_0x00f1
        L_0x00b1:
            java.lang.String r4 = "trigger_mini_dump"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x00f0
            r4 = 1
            goto L_0x00f1
        L_0x00bb:
            java.lang.String r4 = "android.intent.action.VOICE_COMMAND"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x00f0
            r4 = 3
            goto L_0x00f1
        L_0x00c5:
            java.lang.String r4 = "android.hardware.usb.action.USB_DEVICE_DETACHED"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x00f0
            r4 = 9
            goto L_0x00f1
        L_0x00d0:
            java.lang.String r4 = "android.intent.action.HEADSET_PLUG"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x00f0
            r4 = 10
            goto L_0x00f1
        L_0x00db:
            java.lang.String r4 = "bisto.QUERY_DEVICE_INFO"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x00f0
            r4 = 6
            goto L_0x00f1
        L_0x00e5:
            java.lang.String r4 = "android.hardware.usb.action.USB_DEVICE_ATTACHED"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x00f0
            r4 = 8
            goto L_0x00f1
        L_0x00f0:
            r4 = -1
        L_0x00f1:
            java.lang.String r8 = "Null device"
            java.lang.String r9 = "device"
            java.lang.String r10 = "wired"
            switch(r4) {
                case 0: goto L_0x03a0;
                case 1: goto L_0x03a0;
                case 2: goto L_0x03a0;
                case 3: goto L_0x03a0;
                case 4: goto L_0x037d;
                case 5: goto L_0x0372;
                case 6: goto L_0x0350;
                case 7: goto L_0x0350;
                case 8: goto L_0x032e;
                case 9: goto L_0x02f1;
                case 10: goto L_0x023f;
                case 11: goto L_0x010f;
                case 12: goto L_0x00fc;
                case 13: goto L_0x00fc;
                default: goto L_0x00fa;
            }
        L_0x00fa:
            goto L_0x03c0
        L_0x00fc:
            com.google.android.apps.gsa.staticplugins.bisto.g.bi r1 = r0.f268784a
            com.google.android.apps.gsa.staticplugins.bisto.g.bf r1 = r1.mo89297a(r10)
            if (r1 == 0) goto L_0x03c0
            com.google.android.apps.gsa.staticplugins.bisto.g.bi r1 = r0.f268784a
            com.google.android.apps.gsa.staticplugins.bisto.g.bo r1 = r1.mo89298b()
            r1.mo89307s()
            goto L_0x03c0
        L_0x010f:
            com.google.android.apps.gsa.shared.bisto.k r4 = r0.f268793k
            r6 = 102(0x66, float:1.43E-43)
            boolean r4 = r4.mo83555j(r6)
            if (r4 == 0) goto L_0x03c0
            boolean r4 = com.google.android.apps.gsa.shared.bisto.p7029b.C89636g.m145899e(r18)
            if (r4 == 0) goto L_0x03c0
            com.google.common.f.x r4 = r2.mo56224b()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r6, r5)
            java.lang.String r6 = r18.getAction()
            r7 = 15966(0x3e5e, float:2.2373E-41)
            java.lang.String r8 = "Intent with Bluetooth Device: %s"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r7)).mo56389s(r8, r6)
            java.lang.String r4 = "extra_device"
            android.os.Parcelable r4 = r1.getParcelableExtra(r4)
            android.bluetooth.BluetoothDevice r4 = (android.bluetooth.BluetoothDevice) r4
            if (r4 != 0) goto L_0x014f
            com.google.common.f.x r1 = r2.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r5)
            java.lang.String r2 = "Null bluetooth device. Action: %s"
            r4 = 15967(0x3e5f, float:2.2375E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r4)).mo56389s(r2, r3)
            goto L_0x03c0
        L_0x014f:
            com.google.android.apps.search.assistant.surfaces.bisto.c.a.a r3 = new com.google.android.apps.search.assistant.surfaces.bisto.c.a.a
            r3.<init>(r4)
            com.google.android.apps.gsa.staticplugins.bisto.g.bi r4 = r0.f268784a
            android.bluetooth.BluetoothDevice r6 = r3.f343619a
            java.lang.String r6 = r6.getAddress()
            com.google.android.apps.gsa.staticplugins.bisto.g.bf r4 = r4.mo89297a(r6)
            if (r4 != 0) goto L_0x0232
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r4, r5)
            java.lang.String r4 = "Create BistoDevice for legacy BT device"
            r5 = 15954(0x3e52, float:2.2356E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56386p(r4)
            com.google.android.apps.gsa.staticplugins.bisto.g.bi r2 = r0.f268784a
            java.util.Map r4 = r2.f266791b
            android.bluetooth.BluetoothDevice r5 = r3.f343619a
            java.lang.String r5 = r5.getAddress()
            java.lang.Object r4 = r4.get(r5)
            com.google.android.apps.gsa.staticplugins.bisto.g.bf r4 = (com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf) r4
            if (r4 == 0) goto L_0x018c
            boolean r5 = r4 instanceof com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95361bl
            if (r5 == 0) goto L_0x018c
            com.google.android.apps.gsa.staticplugins.bisto.g.bl r4 = (com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95361bl) r4
            goto L_0x021b
        L_0x018c:
            com.google.android.apps.gsa.staticplugins.bisto.g.bm r4 = r2.f266790a
            com.google.android.apps.gsa.staticplugins.bisto.g.bl r15 = new com.google.android.apps.gsa.staticplugins.bisto.g.bl
            g.a.a r5 = r4.f266803a
            java.lang.Object r5 = r5.mo17428b()
            r6 = r5
            android.content.Context r6 = (android.content.Context) r6
            r6.getClass()
            g.a.a r5 = r4.f266804b
            java.lang.Object r5 = r5.mo17428b()
            r7 = r5
            com.google.android.libraries.gsa.k.g r7 = (com.google.android.libraries.gsa.p1876k.C22871g) r7
            r7.getClass()
            g.a.a r5 = r4.f266805c
            java.lang.Object r5 = r5.mo17428b()
            r8 = r5
            com.google.android.libraries.gsa.k.g r8 = (com.google.android.libraries.gsa.p1876k.C22871g) r8
            r8.getClass()
            g.a.a r5 = r4.f266806d
            java.lang.Object r5 = r5.mo17428b()
            r9 = r5
            com.google.android.apps.gsa.staticplugins.bisto.r.a r9 = (com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a) r9
            r9.getClass()
            g.a.a r5 = r4.f266807e
            dagger.a.l r5 = (dagger.p5294a.C68226l) r5
            g.a.a r5 = r5.f184585a
            dagger.a r10 = dagger.p5294a.C68219e.m98518a(r5)
            r10.getClass()
            g.a.a r5 = r4.f266808f
            java.lang.Object r5 = r5.mo17428b()
            r11 = r5
            com.google.android.apps.gsa.staticplugins.bisto.g.dd r11 = (com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95407dd) r11
            r11.getClass()
            g.a.a r5 = r4.f266809g
            java.lang.Object r5 = r5.mo17428b()
            r12 = r5
            com.google.android.apps.gsa.staticplugins.bisto.g.b r12 = (com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95349b) r12
            r12.getClass()
            g.a.a r5 = r4.f266810h
            java.lang.Object r5 = r5.mo17428b()
            r13 = r5
            com.google.android.apps.gsa.shared.bisto.k r13 = (com.google.android.apps.gsa.shared.bisto.C89656k) r13
            r13.getClass()
            g.a.a r5 = r4.f266811i
            java.lang.Object r5 = r5.mo17428b()
            r14 = r5
            com.google.android.apps.gsa.staticplugins.bisto.b.b.c r14 = (com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95188c) r14
            r14.getClass()
            g.a.a r4 = r4.f266812j
            java.lang.Object r4 = r4.mo17428b()
            com.google.android.apps.gsa.staticplugins.bisto.g.cu r4 = (com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95397cu) r4
            r4.getClass()
            r5 = r15
            r1 = r15
            r15 = r4
            r16 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.util.Map r2 = r2.f266791b
            android.bluetooth.BluetoothDevice r4 = r3.f343619a
            java.lang.String r4 = r4.getAddress()
            r2.put(r4, r1)
        L_0x021b:
            com.google.android.apps.gsa.shared.bisto.a.cd r5 = r0.f268789g
            android.bluetooth.BluetoothDevice r1 = r3.f343619a
            java.lang.String r6 = r1.getAddress()
            r7 = 0
            r8 = 0
            com.google.android.apps.search.assistant.surfaces.bisto.d.s r9 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124721s.WIRED
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r5.mo83383Y(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x0232:
            android.bluetooth.BluetoothDevice r1 = r3.f343619a
            java.lang.String r1 = r1.getAddress()
            r4 = r18
            r0.m159190d(r4, r1)
            goto L_0x03c0
        L_0x023f:
            r4 = r1
            java.lang.String r1 = "microphone"
            int r1 = r4.getIntExtra(r1, r6)
            if (r1 != 0) goto L_0x025a
            com.google.common.f.x r1 = r2.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r5)
            java.lang.String r2 = "Ignore headset that doesn't have microphone"
            r3 = 15965(0x3e5d, float:2.2372E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            goto L_0x03c0
        L_0x025a:
            com.google.android.apps.gsa.staticplugins.bisto.u.f r1 = r0.f268791i
            android.media.MediaRouter r3 = r1.f268944h
            if (r3 != 0) goto L_0x0275
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.bisto.p7520u.C96056f.f268937a
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r8 = "AudioRouteManagerImpl"
            r1.mo56378ag(r3, r8)
            java.lang.String r3 = "null mediarouter"
            r8 = 15519(0x3c9f, float:2.1747E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r8)).mo56386p(r3)
            goto L_0x0291
        L_0x0275:
            android.media.MediaRouter$RouteInfo r3 = r3.getSelectedRoute(r7)
            boolean r1 = r1.mo89921c(r3)
            if (r1 == 0) goto L_0x0291
            com.google.common.f.x r1 = r2.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r5)
            java.lang.String r2 = "PLUG ignored USB route"
            r3 = 15964(0x3e5c, float:2.237E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            goto L_0x03c0
        L_0x0291:
            java.lang.String r1 = "state"
            int r1 = r4.getIntExtra(r1, r6)
            if (r1 != r7) goto L_0x02b4
            com.google.android.apps.gsa.shared.bisto.bd r1 = r0.f268795m
            boolean r1 = r1.mo83538b()
            if (r1 != 0) goto L_0x02b3
            com.google.common.f.x r1 = r2.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r5)
            java.lang.String r2 = "Ignore non-connected legacy-wired on PLUG intent."
            r3 = 15963(0x3e5b, float:2.2369E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            goto L_0x03c0
        L_0x02b3:
            r1 = 1
        L_0x02b4:
            if (r1 != 0) goto L_0x02d0
            java.util.Map r1 = r0.f268785b
            boolean r1 = r1.containsKey(r10)
            if (r1 != 0) goto L_0x02df
            com.google.common.f.x r1 = r2.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r5)
            java.lang.String r2 = "Ignore legacy-wired UNPLUG w/o active manager"
            r3 = 15962(0x3e5a, float:2.2368E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            goto L_0x03c0
        L_0x02d0:
            if (r1 != r7) goto L_0x02df
            com.google.android.apps.gsa.shared.bisto.a.cd r1 = r0.f268789g
            com.google.android.apps.gsa.search.core.aj.aa r2 = r0.f268794l
            android.app.KeyguardManager r2 = r2.f230023b
            boolean r2 = r2.isDeviceLocked()
            r1.mo83398ao(r2)
        L_0x02df:
            com.google.android.apps.gsa.staticplugins.bisto.g.bi r1 = r0.f268784a
            com.google.android.apps.gsa.staticplugins.bisto.g.bf r1 = r1.mo89297a(r10)
            if (r1 != 0) goto L_0x02ec
            com.google.android.apps.gsa.staticplugins.bisto.g.bi r1 = r0.f268784a
            r1.mo89298b()
        L_0x02ec:
            r0.m159190d(r4, r10)
            goto L_0x03c0
        L_0x02f1:
            r4 = r1
            com.google.common.f.x r1 = r2.mo56224b()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r3, r5)
            java.lang.String r3 = "Cancel OOBE notification"
            r6 = 15960(0x3e58, float:2.2365E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r6)).mo56386p(r3)
            dagger.a r1 = r0.f268790h
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.staticplugins.bisto.v.d r1 = (com.google.android.apps.gsa.staticplugins.bisto.p7530v.C96511d) r1
            r1.mo90198a()
            android.os.Parcelable r1 = r4.getParcelableExtra(r9)
            android.hardware.usb.UsbDevice r1 = (android.hardware.usb.UsbDevice) r1
            if (r1 != 0) goto L_0x0325
            com.google.common.f.x r1 = r2.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r5)
            r2 = 15961(0x3e59, float:2.2366E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r2)).mo56386p(r8)
            goto L_0x03c0
        L_0x0325:
            java.lang.String r2 = com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124521b.m203980c(r1)
            r0.m159191e(r1, r4, r2)
            goto L_0x03c0
        L_0x032e:
            r4 = r1
            android.os.Parcelable r1 = r4.getParcelableExtra(r9)
            android.hardware.usb.UsbDevice r1 = (android.hardware.usb.UsbDevice) r1
            if (r1 != 0) goto L_0x0347
            com.google.common.f.x r1 = r2.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r5)
            r2 = 15959(0x3e57, float:2.2363E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r2)).mo56386p(r8)
            goto L_0x03c0
        L_0x0347:
            java.lang.String r2 = com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124521b.m203980c(r1)
            r0.m159191e(r1, r4, r2)
            goto L_0x03c0
        L_0x0350:
            r4 = r1
            android.os.Parcelable r1 = r4.getParcelableExtra(r9)
            android.hardware.usb.UsbDevice r1 = (android.hardware.usb.UsbDevice) r1
            if (r1 != 0) goto L_0x036a
            com.google.common.f.x r1 = r2.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r5)
            java.lang.String r2 = "Null USB device. Action: %s"
            r4 = 15958(0x3e56, float:2.2362E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r4)).mo56389s(r2, r3)
            goto L_0x03c0
        L_0x036a:
            java.lang.String r2 = com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124521b.m203980c(r1)
            r0.m159191e(r1, r4, r2)
            goto L_0x03c0
        L_0x0372:
            r4 = r1
            java.lang.String r1 = "key_device_id"
            java.lang.String r1 = r4.getStringExtra(r1)
            r0.m159190d(r4, r1)
            goto L_0x03c0
        L_0x037d:
            r4 = r1
            r17.mo89875c()
            java.util.HashSet r1 = new java.util.HashSet
            java.util.Map r2 = r0.f268786c
            java.util.Set r2 = r2.keySet()
            r1.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x0390:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x03c0
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r0.m159190d(r4, r2)
            goto L_0x0390
        L_0x03a0:
            r4 = r1
            java.util.HashSet r1 = new java.util.HashSet
            java.util.Map r2 = r0.f268785b
            java.util.Collection r2 = r2.values()
            r1.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x03b0:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x03c0
            java.lang.Object r2 = r1.next()
            com.google.android.apps.gsa.staticplugins.bisto.u.b.bq r2 = (com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96021bq) r2
            r2.mo89892p(r4)
            goto L_0x03b0
        L_0x03c0:
            r17.m159192f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7525b.C96002d.mo89864h(android.content.Intent):void");
    }

    /* renamed from: m */
    public final void mo89865m() {
        C59104x b = f268783e.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoWiredManager");
        ((C59052c) ((C59052c) b).mo56372aa(15975)).mo56386p("reInitAfterCrash");
        if (!this.f268798p) {
            mo89875c();
            Iterator it = new HashSet(this.f268786c.values()).iterator();
            while (it.hasNext()) {
                ((C96004f) it.next()).mo89895t();
            }
        }
    }
}
