package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import androidx.p104d.p105a.C2169h;
import com.google.android.apps.gsa.binaries.satin.app.C74036ga;
import com.google.android.apps.gsa.binaries.satin.app.C74037gc;
import com.google.android.apps.gsa.binaries.satin.app.fz;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.bisto.C89651f;
import com.google.android.apps.gsa.shared.bisto.C89655j;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89636g;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94876ay;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94892p;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94933a;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7472f.C94962a;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7476j.C95010a;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7476j.C95011b;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7476j.C95018i;
import com.google.android.apps.gsa.staticplugins.bisto.p7491i.C95465g;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95857h;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9401e.C124604a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124669ch;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124680cs;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124681ct;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124721s;
import com.google.android.gms.wearable.C146408c;
import com.google.android.gms.wearable.C146409d;
import com.google.android.gms.wearable.C146410e;
import com.google.android.gms.wearable.C146414i;
import com.google.android.gms.wearable.C146532o;
import com.google.android.libraries.assistant.accessory.p618b.C11001f;
import com.google.android.libraries.assistant.accessory.p618b.C11008m;
import com.google.android.libraries.assistant.accessory.p618b.C11011p;
import com.google.android.libraries.assistant.accessory.p618b.C11012q;
import com.google.android.libraries.assistant.accessory.p618b.C11017v;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3739a.p3740a.C48088bv;
import com.google.assistant.p3739a.p3740a.C48089bw;
import com.google.assistant.p3739a.p3740a.C48090bx;
import com.google.assistant.p3739a.p3740a.C48112i;
import com.google.assistant.p3739a.p3740a.C48113j;
import com.google.assistant.p3739a.p3740a.C48115l;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.amo;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import dagger.C68214a;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.bm */
/* compiled from: PG */
public final class C96017bm implements C96020bp, C11008m, C146408c {

    /* renamed from: a */
    public static final C59071e f268828a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.u.b.bm");

    /* renamed from: b */
    public static final Duration f268829b = Duration.ofMinutes(10);

    /* renamed from: s */
    private static final Duration f268830s = Duration.ofMinutes(5);

    /* renamed from: A */
    private volatile ScheduledFuture f268831A = null;

    /* renamed from: B */
    private final C74036ga f268832B;

    /* renamed from: c */
    public final C68214a f268833c;

    /* renamed from: d */
    public final C89492cd f268834d;

    /* renamed from: e */
    public final C124604a f268835e;

    /* renamed from: f */
    public final C22871g f268836f;

    /* renamed from: g */
    public final C22871g f268837g;

    /* renamed from: h */
    public final C11011p f268838h;

    /* renamed from: i */
    public final C95011b f268839i;

    /* renamed from: j */
    public final C146409d f268840j;

    /* renamed from: k */
    public final C146532o f268841k;

    /* renamed from: l */
    public final C95465g f268842l;

    /* renamed from: m */
    public final Context f268843m;

    /* renamed from: n */
    final AtomicBoolean f268844n = new AtomicBoolean(false);

    /* renamed from: o */
    public C60870cx f268845o;

    /* renamed from: p */
    final C94933a f268846p = new C96016bl(this);

    /* renamed from: q */
    public volatile C94892p f268847q;

    /* renamed from: r */
    protected ScheduledFuture f268848r = null;

    /* renamed from: t */
    private final C95857h f268849t;

    /* renamed from: u */
    private final C89656k f268850u;

    /* renamed from: v */
    private final C146414i f268851v;

    /* renamed from: w */
    private final ScheduledExecutorService f268852w;

    /* renamed from: x */
    private final C68214a f268853x;

    /* renamed from: y */
    private final AtomicBoolean f268854y = new AtomicBoolean(false);

    /* renamed from: z */
    private C94962a f268855z;

    public C96017bm(C89656k kVar, C95850a aVar, C74036ga gaVar, C68214a aVar2, C22871g gVar, C22871g gVar2, C89492cd cdVar, C124604a aVar3, C95857h hVar, C11011p pVar, C95011b bVar, C146409d dVar, C146532o oVar, C146414i iVar, C68214a aVar4, ScheduledExecutorService scheduledExecutorService, C95465g gVar3, Context context) {
        C58976aa aaVar = C58975e.f156826a;
        this.f268832B = gaVar;
        this.f268833c = aVar2;
        this.f268836f = gVar;
        this.f268837g = gVar2;
        this.f268834d = cdVar;
        this.f268835e = aVar3;
        this.f268849t = hVar;
        this.f268850u = kVar;
        this.f268839i = bVar;
        this.f268838h = pVar;
        this.f268840j = dVar;
        this.f268841k = oVar;
        this.f268851v = iVar;
        this.f268853x = aVar4;
        this.f268852w = scheduledExecutorService;
        this.f268842l = gVar3;
        this.f268843m = context;
        aVar.f268408a.add(this);
    }

    /* renamed from: q */
    public static boolean m159214q(Intent intent) {
        return C89651f.m145942c(intent) || C89651f.m145943d(intent);
    }

    /* renamed from: r */
    private final void m159215r() {
        ScheduledFuture scheduledFuture = this.f268831A;
        this.f268831A = null;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    /* renamed from: s */
    private final void m159216s() {
        C94962a aVar = this.f268855z;
        if (aVar != null) {
            C58976aa aaVar = C58975e.f156826a;
            aVar.mo69410b().close();
            this.f268847q = null;
            this.f268855z = null;
        }
    }

    /* renamed from: a */
    public final synchronized C94892p mo89877a() {
        if (this.f268847q == null) {
            C58976aa aaVar = C58975e.f156826a;
            C74036ga gaVar = this.f268832B;
            C74037gc gcVar = new C74037gc(gaVar.f206185a, gaVar.f206186b);
            this.f268855z = gcVar;
            C74037gc gcVar2 = gcVar;
            this.f268847q = (C94892p) gcVar.f206193g.mo17428b();
        }
        return this.f268847q;
    }

    /* renamed from: b */
    public final C60870cx mo89878b(BluetoothDevice bluetoothDevice) {
        return this.f268834d.mo83408n(bluetoothDevice.getAddress());
    }

    /* renamed from: c */
    public final C60870cx mo89879c(BluetoothDevice bluetoothDevice, C124548d dVar) {
        if (dVar == null) {
            C59104x d = f268828a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoGacsManager");
            ((C59052c) ((C59052c) d).mo56372aa(15627)).mo56386p("Connection sequencing is not used because deviceInfo is null.");
            return C60856cj.m92900i(false);
        } else if (!C124633az.OOBE_FINISHED.equals(dVar.mo106520r())) {
            C59104x b = f268828a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoGacsManager");
            ((C59052c) ((C59052c) b).mo56372aa(15626)).mo56386p("Connection sequencing is not used because OOBE is not finished.");
            return C60856cj.m92900i(false);
        } else if (!C94892p.m156617g(dVar)) {
            return C60856cj.m92900i(false);
        } else {
            if (!this.f268850u.mo83555j(144)) {
                return C60856cj.m92900i(false);
            }
            Optional f = this.f268838h.mo19413f(bluetoothDevice.getAddress());
            if (f.isEmpty()) {
                return C60856cj.m92900i(false);
            }
            return C2169h.m6027a(new C95965an(this, f));
        }
    }

    public final void close() {
        C58976aa aaVar = C58975e.f156826a;
        m159216s();
        C11011p pVar = this.f268838h;
        synchronized (pVar.f36178d) {
            pVar.f36178d.remove(this);
        }
        this.f268840j.mo123087d(this);
        ScheduledFuture scheduledFuture = this.f268848r;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f268848r = null;
        }
    }

    /* renamed from: d */
    public final void mo89881d() {
        this.f268844n.set(false);
        C60870cx cxVar = this.f268845o;
        if (cxVar != null) {
            C58976aa aaVar = C58975e.f156826a;
            cxVar.cancel(false);
            this.f268845o = null;
        }
    }

    /* renamed from: e */
    public final void mo89882e(String str) {
        C59104x b = f268828a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoGacsManager");
        ((C59052c) ((C59052c) b).mo56372aa(15632)).mo56386p("About to remove local capability");
        this.f268840j.mo123088e(String.format("%s_%s", new Object[]{"/assistant/disabled_by_host_capability", str}));
    }

    /* renamed from: f */
    public final void mo89883f(BluetoothDevice bluetoothDevice, C124548d dVar, boolean z) {
        if (C124636bb.OPA_ENABLED.equals(dVar.mo106521s()) || C124633az.OOBE_IN_PROGRESS.equals(dVar.mo106520r())) {
            this.f268836f.mo28212l("start-ble-connection", new C96038p(this, bluetoothDevice, dVar, z));
            return;
        }
        C59104x b = f268828a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoGacsManager");
        ((C59052c) ((C59052c) b).mo56372aa(15639)).mo56354G("[%s] OPA disabled: %s", C94876ay.m156552a(bluetoothDevice), bluetoothDevice.getAddress());
    }

    /* renamed from: g */
    public final void mo89884g(BluetoothDevice bluetoothDevice, int i) {
        C94892p pVar;
        if (!(bluetoothDevice == null || (pVar = this.f268847q) == null)) {
            pVar.mo88769e(bluetoothDevice.getAddress(), i);
            if (!pVar.mo88770f()) {
                m159216s();
            }
        }
        if (i == 1) {
            m159215r();
        }
    }

    /* renamed from: h */
    public final void mo89864h(Intent intent) {
        int intExtra;
        Intent intent2 = intent;
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent2.getParcelableExtra("extra_device");
        if (bluetoothDevice != null) {
            C11011p pVar = this.f268838h;
            C146532o oVar = this.f268841k;
            String address = bluetoothDevice.getAddress();
            if (address != null) {
                Iterator it = pVar.f36179e.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C11001f) it.next()).mo19372a().getAddress().equals(address)) {
                            break;
                        }
                    } else if (address.equals("02:00:00:00:00:00")) {
                        C59104x d = C11017v.f36196a.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "RemotePeerStateCommunicatorUtils");
                        ((C59052c) ((C59052c) d).mo56372aa(42554)).mo56389s("Ignore registering device with default mac address %s.", "02:00:00:00:00:00");
                    } else {
                        C59104x b = C11017v.f36196a.mo56224b();
                        b.mo56378ag(C58975e.f156826a, "RemotePeerStateCommunicatorUtils");
                        ((C59052c) ((C59052c) b).mo56372aa(42553)).mo56386p("Register the companion device.");
                        oVar.mo123264b(address).mo122499r(new C11012q(pVar, bluetoothDevice));
                    }
                }
            }
        }
        String action = intent.getAction();
        if (action == null) {
            C59104x c = f268828a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoGacsManager");
            ((C59052c) ((C59052c) c).mo56372aa(15646)).mo56386p("Null action");
            return;
        }
        C59071e eVar = f268828a;
        C59104x b2 = eVar.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "BistoGacsManager");
        ((C59052c) ((C59052c) b2).mo56372aa(15643)).mo56389s("handleIntent. Action: %s", action);
        int i = 3;
        if ("local_conn".equals(intent.getAction())) {
            C94892p a = mo89877a();
            if (a.f265424i == null) {
                a.f265424i = (C95018i) a.f265423h.mo17428b();
            }
            boolean booleanExtra = intent2.getBooleanExtra("transcription", false);
            String stringExtra = intent2.getStringExtra("query");
            boolean booleanExtra2 = intent2.getBooleanExtra("textquery", false);
            boolean booleanExtra3 = intent2.getBooleanExtra("fitness", false);
            if (C58837ba.m90859h(stringExtra)) {
                C95018i iVar = a.f265424i;
                iVar.getClass();
                iVar.mo88928b(booleanExtra, booleanExtra3);
            } else if (booleanExtra2) {
                C95018i iVar2 = a.f265424i;
                iVar2.getClass();
                C48088bv bvVar = (C48088bv) C48090bx.f124451f.createBuilder();
                bvVar.copyOnWrite();
                ((C48090bx) bvVar.instance).f124453a = 16000;
                bvVar.copyOnWrite();
                ((C48090bx) bvVar.instance).f124454b = C48089bw.m85180a(3);
                bvVar.copyOnWrite();
                ((C48090bx) bvVar.instance).f124456d = Integer.MAX_VALUE;
                iVar2.mo88927a(bvVar, booleanExtra3);
                iVar2.f265834d.mo88855a(stringExtra, iVar2.f265835e, (C48090bx) bvVar.build());
            } else {
                C95018i iVar3 = a.f265424i;
                iVar3.getClass();
                iVar3.f265837g = stringExtra;
                if (true == booleanExtra) {
                    i = 4;
                }
                iVar3.f265839i = i;
                iVar3.f265838h = booleanExtra3;
                iVar3.f265836f = new TextToSpeech(iVar3.f265832b, iVar3);
            }
        } else if (C89636g.m145898d(intent) && (C89651f.m145942c(intent) || C89651f.m145944e(intent) || ("com.google.android.apps.gsa.shared.bisto.ACTION_DEVICE_BOOT_OR_APP_INSTALL".equals(intent.getAction()) && intent2.hasExtra("extra_device")))) {
            BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent2.getParcelableExtra("extra_device");
            if (bluetoothDevice2 == null) {
                C59104x c2 = eVar.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "BistoGacsManager");
                ((C59052c) ((C59052c) c2).mo56372aa(15640)).mo56386p("No BT device to handle connected intent");
            } else {
                new C90873ag(mo89878b(bluetoothDevice2), this.f268837g, "getDeviceInfo", new C96028f(this, intent2, bluetoothDevice2)).mo85223a(new C96039q(bluetoothDevice2));
            }
            if (this.f268848r == null) {
                ScheduledExecutorService scheduledExecutorService = this.f268852w;
                C95970as asVar = new C95970as(this);
                Duration duration = f268830s;
                this.f268848r = scheduledExecutorService.scheduleAtFixedRate(asVar, duration.toMinutes(), duration.toMinutes(), TimeUnit.MINUTES);
            }
        } else if (C89636g.m145898d(intent) && "action_perform_initial_gacs_connection".equals(intent.getAction()) && intent2.hasExtra("extra_device")) {
            BluetoothDevice bluetoothDevice3 = (BluetoothDevice) intent2.getParcelableExtra("extra_device");
            if (bluetoothDevice3 == null) {
                C59104x c3 = eVar.mo56225c();
                c3.mo56378ag(C58975e.f156826a, "BistoGacsManager");
                ((C59052c) ((C59052c) c3).mo56372aa(15642)).mo56386p("No BT device");
            } else {
                this.f268854y.set(true);
                mo89884g(bluetoothDevice3, 8);
                String stringExtra2 = intent2.getStringExtra("device_model_id");
                String stringExtra3 = intent2.getStringExtra("build_label");
                byte[] byteArrayExtra = intent2.getByteArrayExtra("gacs_device_encryption_key");
                this.f268838h.mo19420m(this.f268841k);
                this.f268834d.mo83383Y(bluetoothDevice3.getAddress(), stringExtra3, (String) null, C124721s.GENERIC_SCALED, C124719q.GACS_DEVICE, (String) null, (Integer) null, (Boolean) null, (Integer) null, stringExtra2, (Integer) null);
                new C90873ag(mo89878b(bluetoothDevice3), this.f268837g, "getDeviceInfo", new C96005ba(this, intent2, bluetoothDevice3, byteArrayExtra)).mo85223a(new C96006bb(this, bluetoothDevice3, byteArrayExtra));
                C48113j jVar = (C48113j) C48115l.f124522j.createBuilder();
                jVar.copyOnWrite();
                ((C48115l) jVar.instance).f124524a = C48112i.m85182a(8);
                C63088z E = C63088z.m96143E(this.f268838h.mo19414g());
                jVar.copyOnWrite();
                ((C48115l) jVar.instance).f124525b = E;
                C11017v.m26077f(jVar, this.f268851v, this.f268838h, true);
            }
        } else if (!C89636g.m145898d(intent) || !C89651f.m145943d(intent)) {
            C124633az azVar = null;
            if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction()) && ((intExtra = intent2.getIntExtra("android.bluetooth.adapter.extra.STATE", 2)) == 10 || intExtra == 13)) {
                this.f268838h.mo19423p(7, this.f268851v);
                C94962a aVar = this.f268855z;
                if (aVar != null) {
                    C59104x b3 = eVar.mo56224b();
                    b3.mo56378ag(C58975e.f156826a, "BistoGacsManager");
                    ((C59052c) ((C59052c) b3).mo56372aa(15631)).mo56389s("[%s] Destroyed bleConnectionManager immediately because Bluetooth was disabled", BluetoothAdapter.getDefaultAdapter().getName());
                    C94892p pVar2 = this.f268847q;
                    if (pVar2 != null) {
                        C59104x b4 = C94892p.f265416a.mo56224b();
                        b4.mo56378ag(C58975e.f156826a, "BistoBleConnManager");
                        ((C59052c) ((C59052c) b4).mo56372aa(17338)).mo56386p("close immediately");
                        pVar2.f265420e.mo37976d(pVar2.f265421f);
                        for (fz fzVar : pVar2.f265422g.values()) {
                            if (fzVar != null) {
                                fzVar.b().mo88654D();
                            }
                        }
                        pVar2.mo88764a();
                        aVar.mo69410b().f268408a.remove(pVar2);
                    }
                    this.f268847q = null;
                    this.f268855z = null;
                }
                this.f268838h.mo19415h();
                mo89881d();
            } else if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction()) && intent2.getIntExtra("android.bluetooth.adapter.extra.STATE", -1) == 12) {
                ((C96019bo) this.f268833c.mo27525b()).mo88558f(this, true);
                this.f268838h.mo19423p(6, this.f268851v);
                mo89881d();
                for (BluetoothDevice next : BluetoothAdapter.getDefaultAdapter().getBondedDevices()) {
                    if (next.getType() == 3) {
                        new C90873ag(mo89878b(next), this.f268837g, "getDeviceInfo", new C95953ab(this, next)).mo85223a(new C95964am(next));
                    }
                }
                return;
            } else if (!C89636g.m145898d(intent) || !"bisto_set_gacs_opa_enable_state".equals(intent.getAction())) {
                if ("action_set_hotword_setting_state".equals(intent.getAction())) {
                    String stringExtra4 = intent2.getStringExtra("key_device_id");
                    if (stringExtra4 != null && intent2.getBooleanExtra("extra_hotword_setting_state", false)) {
                        new C90873ag(this.f268834d.mo83408n(stringExtra4), this.f268837g, "hotword-enabled", new C96043u(this, stringExtra4)).mo85223a(C96044v.f268920a);
                    }
                } else if (C89651f.m145946g(intent)) {
                    BluetoothDevice bluetoothDevice4 = (BluetoothDevice) intent2.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    if (bluetoothDevice4 == null) {
                        C59104x c4 = eVar.mo56225c();
                        c4.mo56378ag(C58975e.f156826a, "BistoGacsManager");
                        ((C59052c) ((C59052c) c4).mo56372aa(15648)).mo56386p("No BT device to handle bond state change");
                    } else if (bluetoothDevice4.getType() == 3 && bluetoothDevice4.getBondState() == 10) {
                        new C90873ag(mo89878b(bluetoothDevice4), this.f268837g, "getDeviceInfo", new C96036n(this, bluetoothDevice4)).mo85223a(new C96037o(bluetoothDevice4));
                    }
                } else if ("action_perform_fake_gacs_connection".equals(intent.getAction())) {
                    C94892p a2 = mo89877a();
                    C59104x b5 = C94892p.f265416a.mo56224b();
                    b5.mo56378ag(C58975e.f156826a, "BistoBleConnManager");
                    ((C59052c) ((C59052c) b5).mo56372aa(17349)).mo56386p("startFakeGacsConnection");
                    C95010a aVar2 = a2.f265426k;
                    C59104x d2 = C94892p.f265416a.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "BistoBleConnManager");
                    ((C59052c) ((C59052c) d2).mo56372aa(17350)).mo56386p("Unable to start fake connection with uninitialized fake device");
                }
            } else if (!intent2.hasExtra("extra_enable_state")) {
                C89655j.m145957a("Enable state missing extras");
            } else {
                String stringExtra5 = intent2.getStringExtra("key_device_id");
                if (C58837ba.m90859h(stringExtra5)) {
                    C59104x c5 = eVar.mo56225c();
                    c5.mo56378ag(C58975e.f156826a, "BistoGacsManager");
                    ((C59052c) ((C59052c) c5).mo56372aa(15647)).mo56386p("No device to enable");
                } else {
                    if (intent2.getBooleanExtra("extra_enable_state", false)) {
                        new C90873ag(this.f268834d.mo83408n(stringExtra5), this.f268837g, "opa-enabled", new C96007bc(this, stringExtra5, intent2.getBooleanExtra("acct_sync_on", false), intent2)).mo85223a(C96008bd.f268813a);
                    } else {
                        new C90873ag(this.f268834d.mo83408n(stringExtra5), this.f268837g, "add-local-capability", new C95956ae(this)).mo85223a(C95957af.f268677a);
                        C59104x b6 = eVar.mo56224b();
                        b6.mo56378ag(C58975e.f156826a, "BistoGacsManager");
                        ((C59052c) ((C59052c) b6).mo56372aa(15636)).mo56389s("About to disable assistant on %s", stringExtra5);
                        C89492cd cdVar = this.f268834d;
                        C124636bb bbVar = C124636bb.OPA_DISABLED;
                        if (this.f268850u.mo83555j(175)) {
                            azVar = C124633az.OOBE_NOT_FINISHED;
                        }
                        cdVar.mo83394aj(stringExtra5, bbVar, azVar);
                        C94892p pVar3 = this.f268847q;
                        this.f268835e.mo106556d(stringExtra5);
                        if (pVar3 != null) {
                            C59104x b7 = eVar.mo56224b();
                            b7.mo56378ag(C58975e.f156826a, "BistoGacsManager");
                            ((C59052c) ((C59052c) b7).mo56372aa(15637)).mo56386p("Disconnecting");
                            pVar3.mo88769e(stringExtra5, 2);
                        }
                        Bundle bundle = new Bundle();
                        bundle.putString("extra_device_id", stringExtra5);
                        this.f268849t.mo89824a(amo.BISTO_WORK_REQUEST, C87739bu.BISTO_CLEANUP_DEVICE, bundle);
                    }
                    mo89881d();
                    this.f268854y.set(false);
                }
            }
        } else {
            BluetoothDevice bluetoothDevice5 = (BluetoothDevice) intent2.getParcelableExtra("extra_device");
            if (bluetoothDevice5 == null) {
                C59104x c6 = eVar.mo56225c();
                c6.mo56378ag(C58975e.f156826a, "BistoGacsManager");
                ((C59052c) ((C59052c) c6).mo56372aa(15641)).mo56386p("No BT device to handle disconnect intent");
            } else {
                new C90873ag(mo89878b(bluetoothDevice5), this.f268837g, "getDeviceInfo", new C95973av(this, bluetoothDevice5, intent2)).mo85223a(new C95974aw(bluetoothDevice5));
            }
        }
        mo89889o();
    }

    /* renamed from: i */
    public final void mo89885i(String str) {
        C59104x b = f268828a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoGacsManager");
        ((C59052c) ((C59052c) b).mo56372aa(15699)).mo56386p("About to disable assistant due to capability change");
        C124680cs csVar = (C124680cs) C124681ct.f343972c.createBuilder();
        csVar.copyOnWrite();
        C124681ct ctVar = (C124681ct) csVar.instance;
        str.getClass();
        ctVar.f343974a |= 1;
        ctVar.f343975b = str;
        ((C124669ch) this.f268853x.mo27525b()).mo106580b((C124681ct) csVar.build());
    }

    /* renamed from: j */
    public final void mo89886j(C146410e eVar) {
        Set a = eVar.mo123089a();
        if (!a.isEmpty()) {
            if (!this.f268850u.mo83555j(178) || !this.f268854y.get()) {
                new C90873ag(this.f268834d.mo83402i(), this.f268837g, "disable-assistant", new C96011bg(this, a)).mo85223a(C96012bh.f268821a);
                return;
            }
            C59104x b = f268828a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoGacsManager");
            ((C59052c) ((C59052c) b).mo56372aa(15700)).mo56386p("Ignore disable assistant due to capability change since OOBE in progress");
        }
    }

    /* renamed from: k */
    public final void mo89887k(BluetoothDevice bluetoothDevice, C124548d dVar, int i) {
        new C90873ag(mo89879c(bluetoothDevice, dVar), this.f268837g, "getIsUsingConnectionSequencing", new C96009be(this, i, bluetoothDevice, dVar)).mo85223a(C96010bf.f268818a);
    }

    /* renamed from: l */
    public final void mo19406l(String str, int i) {
        Optional e = this.f268838h.mo19412e(str);
        if (e.isEmpty()) {
            C59104x b = f268828a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoGacsManager");
            ((C59052c) ((C59052c) b).mo56372aa(15704)).mo56386p("Not registered with communicator, checking BDD.");
            new C90873ag(this.f268834d.mo83404j(), this.f268837g, "getAllDeviceInfo", new C96015bk(this, str, i)).mo85223a(C96029g.f268890a);
            return;
        }
        new C90873ag(mo89878b((BluetoothDevice) e.get()), this.f268837g, "getDeviceInfo", new C96030h(this, e, i)).mo85223a(C96031i.f268894a);
    }

    /* renamed from: m */
    public final void mo89865m() {
        this.f268838h.mo19415h();
    }

    /* renamed from: n */
    public final void mo89888n(Intent intent, BluetoothDevice bluetoothDevice, C124548d dVar, byte[] bArr, boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        m159215r();
        this.f268831A = this.f268852w.schedule(new C96041s(this, dVar, bluetoothDevice, z, intent, bArr), 5000, TimeUnit.MILLISECONDS);
    }

    /* renamed from: o */
    public final void mo89889o() {
        if (this.f268844n.get()) {
            C59104x b = f268828a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoGacsManager");
            ((C59052c) ((C59052c) b).mo56372aa(15713)).mo56386p("Active status is on hold, not updating actual active status");
            return;
        }
        C94892p pVar = this.f268847q;
        boolean z = false;
        if (pVar != null && pVar.mo88770f()) {
            z = true;
        }
        C58976aa aaVar = C58975e.f156826a;
        ((C96019bo) this.f268833c.mo27525b()).mo88558f(this, z);
    }

    /* renamed from: p */
    public final void mo89890p(String str) {
        this.f268841k.mo123264b(str).mo122499r(new C96045w(this, str));
    }
}
