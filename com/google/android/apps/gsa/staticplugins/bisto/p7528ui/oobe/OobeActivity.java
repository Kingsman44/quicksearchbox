package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.app.NotificationManager;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.p033v7.app.C0401v;
import androidx.core.content.C1882h;
import androidx.lifecycle.C2368bp;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6513aj.C84533ar;
import com.google.android.apps.gsa.search.core.p6513aj.C84535at;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.android.apps.gsa.shared.bisto.C89652g;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.permissions.C91078e;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95299e;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95300f;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95302h;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96461as;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9391a.C124539a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124715m;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.p10712d.C142390do;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60105ky;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.net.URISyntaxException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.OobeActivity */
/* compiled from: PG */
public class OobeActivity extends C96299in {

    /* renamed from: B */
    private static final long f268954B = (C96461as.f269857a / 2);

    /* renamed from: k */
    public static final C59071e f268955k = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.OobeActivity");

    /* renamed from: A */
    C91078e f268956A;

    /* renamed from: C */
    private String f268957C;

    /* renamed from: D */
    private final AtomicBoolean f268958D = new AtomicBoolean(false);

    /* renamed from: E */
    private C96323jk f268959E;

    /* renamed from: F */
    private Future f268960F;

    /* renamed from: l */
    public String f268961l;

    /* renamed from: m */
    public int f268962m = 0;

    /* renamed from: n */
    public C21370a f268963n;

    /* renamed from: o */
    public C88483e f268964o;

    /* renamed from: p */
    public C22871g f268965p;

    /* renamed from: q */
    public C22871g f268966q;

    /* renamed from: r */
    public C68214a f268967r;

    /* renamed from: s */
    public C58833ax f268968s;

    /* renamed from: t */
    public C86054o f268969t;

    /* renamed from: u */
    public C84535at f268970u;

    /* renamed from: v */
    public C68214a f268971v;

    /* renamed from: w */
    public C95300f f268972w;

    /* renamed from: x */
    public C96094ay f268973x;

    /* renamed from: y */
    public C96410mq f268974y;

    /* renamed from: z */
    public C90021c f268975z;

    /* renamed from: D */
    private final C60105ky m159320D(int i) {
        if (i == 6) {
            return C60105ky.ANDROID_GACS_OOBE_RECONNECT;
        }
        if (!getIntent().hasExtra("oobe_trigger")) {
            return C60105ky.UNKNOWN;
        }
        C60105ky a = C60105ky.m92528a(getIntent().getIntExtra("oobe_trigger", C60105ky.UNKNOWN.f162530s));
        a.getClass();
        return a;
    }

    /* renamed from: E */
    private final void m159321E(Intent intent, String str) {
        this.f268962m = intent.getIntExtra("mode", 0);
        Bundle bundle = new Bundle();
        C60870cx n = ((C89492cd) this.f268967r.mo27525b()).mo83408n(this.f268961l);
        bundle.putBundle("deeplink_context", intent.getBundleExtra("deeplink_context"));
        new C90873ag(n, this.f268965p, "runOobeOrSkip", new C96315jc(this, str, bundle)).mo85223a(new C96316jd(this, str, bundle));
    }

    /* renamed from: F */
    private final void m159322F(boolean z) {
        C124633az azVar;
        C58976aa aaVar = C58975e.f156826a;
        if (this.f268958D.getAndSet(z) != z) {
            Future future = this.f268960F;
            if (future != null) {
                future.cancel(false);
            }
            int i = this.f268962m;
            if (i != 5 && i != 6) {
                mo89927B();
                this.f268961l.getClass();
                C124539a G = m159323G();
                if (G != null) {
                    C124548d b = ((C89492cd) this.f268967r.mo27525b()).mo83401b(this.f268961l);
                    if (b == null) {
                        C59104x c = f268955k.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "OobeActivity");
                        ((C59052c) ((C59052c) c).mo56372aa(17073)).mo56389s("Null bistoDeviceInfo for %s", this.f268961l);
                    } else if (!b.mo106520r().equals(C124633az.OOBE_FINISHED)) {
                        if (z || !b.mo106520r().equals(C124633az.OOBE_EXTERNAL)) {
                            if (z && m159320D(this.f268962m) == C60105ky.ANDROID_OOBE_COMPANION_POST_GESTURE_CONFIG && !b.mo106512j().equals(C124715m.FULLY_CONNECTED) && b.mo106526x().f386154g) {
                                String str = this.f268961l;
                                str.getClass();
                                ((C89492cd) this.f268967r.mo27525b()).mo83381W(str, C142390do.ASSISTANT_GESTURE_AVAILABILITY_UNSPECIFIED);
                            }
                            Context applicationContext = getApplicationContext();
                            String str2 = this.f268961l;
                            C89492cd cdVar = (C89492cd) this.f268967r.mo27525b();
                            BluetoothDevice bluetoothDevice = G.f343619a;
                            if (z) {
                                azVar = C124633az.OOBE_IN_PROGRESS;
                            } else {
                                azVar = C124633az.OOBE_NOT_FINISHED;
                            }
                            C96461as.m159826c(applicationContext, str2, cdVar, bluetoothDevice, azVar);
                        }
                    }
                } else if (BluetoothAdapter.checkBluetoothAddress(this.f268961l)) {
                    C59104x c2 = f268955k.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "OobeActivity");
                    ((C59052c) ((C59052c) c2).mo56372aa(17074)).mo56389s("Unable to find BluetoothDevice for %s", this.f268961l);
                }
            }
        }
    }

    /* renamed from: G */
    private final C124539a m159323G() {
        String str = this.f268961l;
        if (str == null || !BluetoothAdapter.checkBluetoothAddress(str)) {
            return null;
        }
        return C89652g.m145951a().mo83542c(this.f268961l);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0145  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89926A(java.lang.String r9, com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d r10, android.os.Bundle r11) {
        /*
            r8 = this;
            if (r9 != 0) goto L_0x0016
            com.google.common.f.e r0 = f268955k
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "OobeActivity"
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "No model Id"
            r2 = 17070(0x42ae, float:2.392E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
        L_0x0016:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            int r0 = r8.f268962m
            com.google.common.o.ky r0 = r8.m159320D(r0)
            com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.jk r1 = r8.f268959E
            dagger.a r2 = r1.f269536a
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.staticplugins.bisto.f.h r2 = (com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95302h) r2
            com.google.android.apps.gsa.staticplugins.bisto.f.f r3 = r2.f266668b
            com.google.android.apps.gsa.staticplugins.bisto.f.e r3 = r3.mo89238a()
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95299e.f266645a
            com.google.common.f.x r4 = r4.mo56224b()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r6 = "BistoOobeLogger"
            r4.mo56378ag(r5, r6)
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            r5 = 14850(0x3a02, float:2.0809E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            java.lang.String r5 = "startNewSession from source %d"
            int r6 = r0.f162530s
            r4.mo56387q(r5, r6)
            r3.mo89233c(r9, r10, r0)
            java.lang.String r4 = r3.f266648c
            com.google.common.f.e r5 = com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95302h.f266667a
            com.google.common.f.x r5 = r5.mo56224b()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r7 = "BistoOobeLogSessionImpl"
            r5.mo56378ag(r6, r7)
            java.lang.String r6 = "Start OOBE Session %s"
            r7 = 14862(0x3a0e, float:2.0826E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r7)).mo56389s(r6, r4)
            java.util.Map r2 = r2.f266669c
            r2.put(r4, r3)
            java.lang.String r2 = r3.f266648c
            r1.f269537b = r2
            java.lang.String r1 = r1.f269537b
            r8.f268957C = r2
            if (r10 == 0) goto L_0x008b
            int r1 = r10.mo106504d()
            com.google.common.o.kw r2 = r3.f266647b
            r2.copyOnWrite()
            com.google.protobuf.bv r2 = r2.instance
            com.google.common.o.kz r2 = (com.google.common.p4552o.C60106kz) r2
            com.google.common.o.kz r3 = com.google.common.p4552o.C60106kz.f162531p
            int r3 = r2.f162533a
            r3 = r3 | 512(0x200, float:7.175E-43)
            r2.f162533a = r3
            r2.f162540h = r1
        L_0x008b:
            java.lang.String r1 = "key_device_id"
            java.lang.String r2 = r8.f268961l
            r11.putString(r1, r2)
            java.lang.String r1 = "model_id"
            r11.putString(r1, r9)
            java.lang.String r9 = "oobe_trigger"
            int r0 = r0.f162530s
            r11.putInt(r9, r0)
            java.lang.String r9 = r8.f268957C
            r9.getClass()
            java.lang.String r0 = "oobe_id"
            r11.putString(r0, r9)
            com.google.android.apps.gsa.opaonboarding.am r9 = com.google.android.apps.gsa.opaonboarding.C83880an.m133553o()
            com.google.android.apps.gsa.opaonboarding.e r0 = new com.google.android.apps.gsa.opaonboarding.e
            r1 = 0
            r2 = 0
            r0.<init>(r1, r2, r2)
            r1 = r9
            com.google.android.apps.gsa.opaonboarding.g r1 = (com.google.android.apps.gsa.opaonboarding.C83940g) r1
            r1.f228607c = r0
            r1.f228606b = r11
            if (r10 != 0) goto L_0x00bd
            goto L_0x00c1
        L_0x00bd:
            java.lang.String r2 = r10.mo106481V()
        L_0x00c1:
            boolean r0 = com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124521b.m203982e(r2)
            if (r0 == 0) goto L_0x00ca
            com.google.common.base.b r10 = com.google.common.base.C58836b.f156633a
            goto L_0x00db
        L_0x00ca:
            if (r10 != 0) goto L_0x00cf
            com.google.android.apps.search.assistant.surfaces.bisto.d.q r10 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q.UNKNOWN_DEVICE_CATEGORY
            goto L_0x00d3
        L_0x00cf:
            com.google.android.apps.search.assistant.surfaces.bisto.d.q r10 = r10.mo106513k()
        L_0x00d3:
            com.google.android.apps.gsa.opaonboarding.d.b r10 = com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe.C96331js.m159639a(r10)
            com.google.common.base.ax r10 = com.google.common.base.C58833ax.m90834k(r10)
        L_0x00db:
            r1.f228610f = r10
            r10 = 2
            r9.mo77224d(r10)
            com.google.common.o.a.w r0 = com.google.common.p4552o.p4553a.C59567w.f158058g
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.common.o.a.v r0 = (com.google.common.p4552o.p4553a.C59566v) r0
            com.google.android.apps.gsa.assistant.b.a.b r2 = com.google.android.apps.gsa.assistant.p510b.p511a.C9439b.BISTO_ONBOARDING
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.common.o.a.w r3 = (com.google.common.p4552o.p4553a.C59567w) r3
            int r2 = r2.f32835aq
            r3.f158062c = r2
            int r2 = r3.f158060a
            r10 = r10 | r2
            r3.f158060a = r10
            com.google.protobuf.bv r10 = r0.build()
            com.google.common.o.a.w r10 = (com.google.common.p4552o.p4553a.C59567w) r10
            r9.mo77222b(r10)
            int r10 = r8.f268962m
            r0 = 5
            if (r10 != r0) goto L_0x011a
            java.lang.String r10 = "BistoGacsOnboarding"
            r1.f228605a = r10
            com.google.android.apps.search.assistant.surfaces.bisto.d.q r10 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q.GACS_DEVICE
            com.google.android.apps.gsa.opaonboarding.d.b r10 = com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe.C96331js.m159639a(r10)
            com.google.common.base.ax r10 = com.google.common.base.C58833ax.m90834k(r10)
        L_0x0117:
            r1.f228610f = r10
            goto L_0x0130
        L_0x011a:
            r0 = 6
            if (r10 != r0) goto L_0x012c
            java.lang.String r10 = "BistoGacsReconnect"
            r1.f228605a = r10
            com.google.android.apps.search.assistant.surfaces.bisto.d.q r10 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q.GACS_DEVICE
            com.google.android.apps.gsa.opaonboarding.d.b r10 = com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe.C96331js.m159639a(r10)
            com.google.common.base.ax r10 = com.google.common.base.C58833ax.m90834k(r10)
            goto L_0x0117
        L_0x012c:
            java.lang.String r10 = "BistoOnboarding"
            r1.f228605a = r10
        L_0x0130:
            java.lang.String r10 = "deeplink_context"
            android.os.Bundle r10 = r11.getBundle(r10)
            if (r10 == 0) goto L_0x0145
            java.lang.String r11 = "dark_theme"
            boolean r10 = r10.getBoolean(r11)
            if (r10 == 0) goto L_0x0145
            r10 = 7
            r9.mo77226f(r10)
            goto L_0x0153
        L_0x0145:
            com.google.android.apps.gsa.shared.m.c r10 = r8.f268975z
            com.google.android.apps.gsa.shared.m.d r11 = com.google.android.apps.gsa.shared.p7066m.C90122ft.f250870i
            boolean r10 = r10.mo79746e(r11)
            if (r10 == 0) goto L_0x0153
            r10 = 1
            r9.mo77224d(r10)
        L_0x0153:
            com.google.android.apps.gsa.opaonboarding.an r9 = r9.mo77221a()
            android.content.Intent r9 = r9.mo77240n()
            r10 = 3
            r8.startActivityForResult(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe.OobeActivity.mo89926A(java.lang.String, com.google.android.apps.search.assistant.surfaces.bisto.c.b.d, android.os.Bundle):void");
    }

    /* renamed from: B */
    public final void mo89927B() {
        C84533ar a = this.f268970u.mo78243a().mo78241a();
        if (this.f268958D.get()) {
            a.mo78238d("key_oobe_timestamp_ms", this.f268963n.mo26870b());
            this.f268960F = this.f268966q.mo28208h("oobe-timestamp", f268954B, new C96320jh(this));
        } else {
            a.mo78240f("key_oobe_timestamp_ms");
            a.mo78238d("key_oobe_inactive_since_timestamp_ms", this.f268963n.mo26870b());
        }
        a.mo78236b();
        C96461as.m159824a(this.f268964o);
    }

    /* renamed from: C */
    public final boolean mo89928C() {
        return this.f268962m == 2;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C58976aa aaVar = C58975e.f156826a;
        if (i == 3) {
            if (this.f268957C != null) {
                C95299e eVar = (C95299e) ((C95302h) this.f268971v.mo27525b()).f266669c.get(this.f268957C);
                if (eVar != null) {
                    eVar.f266651f.set(false);
                }
            }
            setResult(i2);
            if (intent != null) {
                finishAndRemoveTask();
                startActivity(intent);
            } else if (i2 == -1) {
                mo89931y();
            } else {
                finishAndRemoveTask();
            }
        } else if (i == 1) {
            finish();
        } else if (i == 5) {
            Intent intent2 = getIntent();
            String stringExtra = intent2.getStringExtra("model_id");
            if (this.f268961l == null) {
                C59104x c = f268955k.mo56225c();
                c.mo56378ag(C58975e.f156826a, "OobeActivity");
                ((C59052c) ((C59052c) c).mo56372aa(17060)).mo56386p("deviceId missing");
                return;
            }
            m159321E(intent2, stringExtra);
        }
    }

    public final void onCreate(Bundle bundle) {
        C74504a.m120462a(f.R);
        C58976aa aaVar = C58975e.f156826a;
        super.onCreate(bundle);
        C96323jk jkVar = (C96323jk) new C2368bp(this).mo5770a(C96323jk.class);
        this.f268959E = jkVar;
        jkVar.f269536a = this.f268971v;
        C0401v.m1321C();
        requestWindowFeature(1);
        ((NotificationManager) getSystemService("notification")).cancel(20);
        Intent intent = getIntent();
        this.f268962m = intent.getIntExtra("mode", 0);
        if (bundle != null) {
            String string = bundle.getString("key_device_id");
            if (string == null) {
                C59104x c = f268955k.mo56225c();
                c.mo56378ag(C58975e.f156826a, "OobeActivity");
                ((C59052c) ((C59052c) c).mo56372aa(17064)).mo56386p("Cannot continue without a device id");
                setResult(1);
                finish();
                return;
            }
            this.f268973x.f269039a = string;
            this.f268961l = string;
            if (bundle.containsKey("oobe_id")) {
                String string2 = bundle.getString("oobe_id");
                string2.getClass();
                this.f268957C = string2;
                return;
            }
            return;
        }
        String stringExtra = intent.getStringExtra("key_device_id");
        if (stringExtra != null) {
            this.f268961l = stringExtra;
        }
        this.f268973x.f269039a = this.f268961l;
        if (this.f268961l == null) {
            C59104x c2 = f268955k.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "OobeActivity");
            ((C59052c) ((C59052c) c2).mo56372aa(17063)).mo56386p("Cannot continue without a device id");
            setResult(1);
            finish();
            return;
        }
        C59071e eVar = f268955k;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OobeActivity");
        ((C59052c) ((C59052c) b).mo56372aa(17062)).mo56389s("deviceId: %s", this.f268961l);
        String stringExtra2 = intent.getStringExtra("model_id");
        String str = this.f268961l;
        if (intent.getBooleanExtra("dont_ask_again", false)) {
            C124548d b2 = ((C89492cd) this.f268967r.mo27525b()).mo83401b(str);
            C59104x b3 = eVar.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "OobeActivity");
            ((C59052c) ((C59052c) b3).mo56372aa(17075)).mo56389s("Silence OOBE notifications for %s", str);
            ((C89492cd) this.f268967r.mo27525b()).mo83375Q(str);
            this.f268972w.mo89238a().mo89235e(stringExtra2, b2, true);
        } else if (intent.getBooleanExtra("dismiss_notification", false)) {
            this.f268972w.mo89238a().mo89235e(stringExtra2, ((C89492cd) this.f268967r.mo27525b()).mo83401b(str), false);
        } else if (Build.VERSION.SDK_INT < 31 || (C1882h.m5137c(getApplicationContext(), "android.permission.BLUETOOTH_CONNECT") == 0 && C1882h.m5137c(getApplicationContext(), "android.permission.BLUETOOTH_SCAN") == 0)) {
            mo89929w(intent, stringExtra2);
            return;
        } else {
            this.f268956A = new C96317je(this, intent, stringExtra2);
            requestPermissions(new String[]{"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN"}, 6);
            return;
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        C58976aa aaVar = C58975e.f156826a;
        super.onDestroy();
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 6) {
            C91078e eVar = this.f268956A;
            eVar.getClass();
            eVar.mo18206a(strArr, iArr);
            return;
        }
        C59104x d = f268955k.mo56226d();
        d.mo56378ag(C58975e.f156826a, "OobeActivity");
        ((C59052c) ((C59052c) d).mo56372aa(17066)).mo56387q("Bad Perm Req %d", i);
        setResult(1);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("key_device_id", this.f268961l);
        String str = this.f268957C;
        if (str != null) {
            bundle.putString("oobe_id", str);
        }
    }

    public final void onStart() {
        C58976aa aaVar = C58975e.f156826a;
        C0401v.m1321C();
        m159322F(true);
        super.onStart();
    }

    public final void onStop() {
        C58976aa aaVar = C58975e.f156826a;
        m159322F(false);
        super.onStop();
    }

    /* renamed from: w */
    public final void mo89929w(Intent intent, String str) {
        if ("wired".equals(this.f268961l) || this.f268961l.startsWith("simple-") || C89652g.m145951a().f242759a.isEnabled()) {
            m159321E(intent, str);
        } else {
            startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 5);
        }
    }

    /* renamed from: x */
    public final void mo89930x(String str) {
        try {
            Intent parseUri = Intent.parseUri(str, 0);
            String str2 = this.f268961l;
            if (str2 == null || !BluetoothAdapter.checkBluetoothAddress(str2)) {
                parseUri.putExtra("key_device_id", this.f268961l);
            } else {
                C124539a G = m159323G();
                if (G != null) {
                    G.mo106453b(parseUri);
                }
            }
            startActivity(parseUri);
            finishAndRemoveTask();
        } catch (ActivityNotFoundException | URISyntaxException e) {
            C59104x c = f268955k.mo56225c();
            c.mo56378ag(C58975e.f156826a, "OobeActivity");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(17054)).mo56386p("Finish OOBE actvity.");
            finish();
        }
    }

    /* renamed from: y */
    public final void mo89931y() {
        int i;
        C60105ky D;
        if (this.f268961l != null && mo89928C()) {
            new C90873ag(((C89492cd) this.f268967r.mo27525b()).mo83405k(this.f268961l), this.f268965p, "final-screen", new C96318jf(this)).mo85223a(new C96319jg(this));
        } else if (m159320D(this.f268962m) == C60105ky.ANDROID_OOBE_NOTIFICATION_TRADITIONAL || (i = this.f268962m) == 5 || i == 6 || (D = m159320D(i)) == C60105ky.ANDROID_OOBE_COMPANION_VOICE_MATCH_ONLY || D == C60105ky.ANDROID_OOBE_COMPANION_POST_GESTURE_CONFIG) {
            finishAndRemoveTask();
        } else {
            mo89932z();
        }
    }

    /* renamed from: z */
    public final void mo89932z() {
        String str = this.f268961l;
        if (str != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("assistant_surface", 8);
            bundle.putString("assistant_device_id", str);
            C18509a c = C18522b.m35986c();
            C18523c cVar = (C18523c) c;
            cVar.f52492a = "device_info";
            cVar.f52493b = bundle;
            startActivityForResult(c.mo24020b().mo24031a(), 1);
        }
        finish();
    }
}
