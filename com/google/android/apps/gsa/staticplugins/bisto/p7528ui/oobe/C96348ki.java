package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.widget.Button;
import android.widget.ProgressBar;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89495cg;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95299e;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96462at;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124519a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124625ar;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124629av;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124640bf;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.p10712d.C142324bc;
import com.google.android.p10712d.C142340bs;
import com.google.android.p10712d.C142344bw;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60103kw;
import com.google.common.p4552o.C60106kz;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ki */
/* compiled from: PG */
public final class C96348ki extends C96098bb implements C89495cg {

    /* renamed from: m */
    public static final C59071e f269566m = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ki");

    /* renamed from: s */
    private static final long f269567s = TimeUnit.SECONDS.toMillis(30);

    /* renamed from: n */
    public C89492cd f269568n;

    /* renamed from: o */
    public C22871g f269569o;

    /* renamed from: p */
    public C96094ay f269570p;

    /* renamed from: q */
    public volatile C124629av f269571q = C124629av.f343812r;

    /* renamed from: r */
    public boolean f269572r;

    /* renamed from: t */
    private ProgressBar f269573t;

    /* renamed from: u */
    private String f269574u;

    /* renamed from: o */
    private final void m159660o() {
        C124625ar a = C124625ar.m204290a(this.f269571q.f343821h);
        if (a == null) {
            a = C124625ar.UNKNOWN_INTERNAL_OTA_STATE;
        }
        if (a.equals(C124625ar.DOWNLOAD_SCHEDULED)) {
            mo89944j(R.string.downloading_firmware);
            ProgressBar progressBar = this.f269573t;
            progressBar.getClass();
            progressBar.setIndeterminate(true);
            return;
        }
        C124625ar a2 = C124625ar.m204290a(this.f269571q.f343821h);
        if (a2 == null) {
            a2 = C124625ar.UNKNOWN_INTERNAL_OTA_STATE;
        }
        if (a2.equals(C124625ar.NON_FORCE_APPLY_SENT)) {
            mo89944j(R.string.applying_update);
            ProgressBar progressBar2 = this.f269573t;
            progressBar2.getClass();
            progressBar2.setIndeterminate(true);
            return;
        }
        C124625ar a3 = C124625ar.m204290a(this.f269571q.f343821h);
        if (a3 == null) {
            a3 = C124625ar.UNKNOWN_INTERNAL_OTA_STATE;
        }
        if (a3.equals(C124625ar.UPLOADING_DFU_TO_HEADSET)) {
            mo89944j(R.string.uploading_firmware_to_device);
            ProgressBar progressBar3 = this.f269573t;
            progressBar3.getClass();
            progressBar3.setIndeterminate(false);
            ProgressBar progressBar4 = this.f269573t;
            progressBar4.getClass();
            progressBar4.setMax((int) ((C124650bp) this.f269571q.f343828o.get(0)).f343902k);
            ProgressBar progressBar5 = this.f269573t;
            progressBar5.getClass();
            progressBar5.setProgress((int) ((C124650bp) this.f269571q.f343828o.get(0)).f343901j);
            return;
        }
        String str = this.f269574u;
        if (str != null) {
            mo89945k(str);
        }
        ProgressBar progressBar6 = this.f269573t;
        progressBar6.getClass();
        progressBar6.setIndeterminate(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: e */
    public final String mo89934e() {
        return "OtaZeroDayInProgress";
    }

    /* renamed from: fW */
    public final void mo17874fW(String str, Set set, long j, C124548d dVar) {
        String str2;
        C124625ar a = C124625ar.m204290a(this.f269571q.f343821h);
        if (a == null) {
            a = C124625ar.UNKNOWN_INTERNAL_OTA_STATE;
        }
        this.f269571q = dVar.mo106519q();
        m159660o();
        C124625ar a2 = C124625ar.m204290a(dVar.mo106519q().f343821h);
        if (a2 == null) {
            a2 = C124625ar.UNKNOWN_INTERNAL_OTA_STATE;
        }
        C59071e eVar = f269566m;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OtaZeroDayInProgress");
        ((C59052c) ((C59052c) b).mo56372aa(17085)).mo56354G("onDeviceInfoChanged. States: old - %s, new - %s", a, a2);
        if (C124625ar.UNKNOWN_INTERNAL_OTA_STATE.equals(a2) && C124625ar.CHECKING_IF_OTA_NEEDED.equals(a)) {
            C59104x b2 = eVar.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "OtaZeroDayInProgress");
            ((C59052c) ((C59052c) b2).mo56372aa(17087)).mo56386p("Ota not needed");
            this.f269032f = true;
            this.f269572r = true;
            mo77318iT().mo77312a();
        } else if (C124625ar.UNKNOWN_INTERNAL_OTA_STATE.equals(a2) && !C124625ar.UNKNOWN_INTERNAL_OTA_STATE.equals(a)) {
            C142324bc bcVar = this.f269049k.f269538a.f269047b;
            C142344bw bwVar = bcVar.f386121g;
            if (bwVar == null) {
                bwVar = C142344bw.f386209i;
            }
            boolean z = false;
            if ((bwVar.f386211a & 32) != 0) {
                C142344bw bwVar2 = bcVar.f386121g;
                if (bwVar2 == null) {
                    bwVar2 = C142344bw.f386209i;
                }
                str2 = C58837ba.m90856e(bwVar2.f386217g);
            } else if (bcVar.f386123i.size() > 0) {
                str2 = C58837ba.m90856e(((C142344bw) bcVar.f386123i.get(0)).f386217g);
            } else {
                C142340bs bsVar = bcVar.f386119e;
                if (bsVar == null) {
                    bsVar = C142340bs.f386174C;
                }
                if ((bsVar.f386178a & 1024) != 0) {
                    C142344bw bwVar3 = bsVar.f386188k;
                    if (bwVar3 == null) {
                        bwVar3 = C142344bw.f386209i;
                    }
                    str2 = C58837ba.m90856e(bwVar3.f386213c);
                } else {
                    str2 = bsVar.f386191n.size() > 0 ? C58837ba.m90856e(((C142344bw) bsVar.f386191n.get(0)).f386213c) : null;
                }
            }
            String e = C58837ba.m90856e(str2);
            String e2 = C58837ba.m90856e(dVar.mo106472M());
            if (!(e == null || e2 == null || C96462at.m159831a(e, e2, dVar.mo106514l()))) {
                z = true;
            }
            C59104x b3 = eVar.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "OtaZeroDayInProgress");
            Boolean valueOf = Boolean.valueOf(z);
            ((C59052c) ((C59052c) b3).mo56372aa(17086)).mo56389s("0-day OTA result: %b", valueOf);
            this.f269032f = valueOf;
            if (z) {
                C60103kw kwVar = ((C95299e) this.f269603D.mo27525b()).f266647b;
                kwVar.copyOnWrite();
                C60106kz kzVar = (C60106kz) kwVar.instance;
                C60106kz kzVar2 = C60106kz.f162531p;
                kzVar.f162533a |= 64;
                kzVar.f162537e = e;
                this.f269572r = true;
            }
            mo77318iT().mo77312a();
        }
    }

    /* renamed from: g */
    public final void mo89941g(OpaPageLayout opaPageLayout) {
        int a;
        super.mo89941g(opaPageLayout);
        String str = this.f269570p.f269039a;
        if (str == null) {
            C59104x c = f269566m.mo56225c();
            c.mo56378ag(C58975e.f156826a, "OtaZeroDayInProgress");
            ((C59052c) ((C59052c) c).mo56372aa(17084)).mo56386p("Null device ID. Unable to perform OTA");
            this.f269569o.mo28212l("exit", new C96346kg(this));
            return;
        }
        C96095az azVar = this.f269050l;
        if (azVar == null) {
            C59104x c2 = f269566m.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "OtaZeroDayInProgress");
            ((C59052c) ((C59052c) c2).mo56372aa(17083)).mo56386p("Null OobeScreen. Unable to perform OTA");
            this.f269569o.mo28212l("exit", new C96347kh(this));
            return;
        }
        ProgressBar progressBar = (ProgressBar) opaPageLayout.findViewById(R.id.loading_progress_bar);
        this.f269573t = progressBar;
        progressBar.setVisibility(0);
        Button button = this.f269033g;
        button.getClass();
        button.setVisibility(8);
        Button button2 = this.f269034h;
        button2.getClass();
        button2.setVisibility(8);
        String str2 = azVar.f269040a;
        this.f269574u = azVar.f269043d;
        String name = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str).getName();
        if (str2 != null) {
            mo89946l(String.format(str2, new Object[]{name}));
        }
        String str3 = this.f269570p.f269039a;
        C89492cd cdVar = this.f269568n;
        str3.getClass();
        C124548d b = cdVar.mo83401b(str3);
        if (b == null) {
            C59104x c3 = f269566m.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "OtaZeroDayInProgress");
            ((C59052c) ((C59052c) c3).mo56372aa(17088)).mo56386p("Failed to get device info");
            this.f269569o.mo28212l("exit", new C96343kd(this));
            return;
        }
        C95299e eVar = (C95299e) this.f269603D.mo27525b();
        String M = b.mo106472M();
        if (M != null) {
            C60103kw kwVar = eVar.f266647b;
            kwVar.copyOnWrite();
            C60106kz kzVar = (C60106kz) kwVar.instance;
            C60106kz kzVar2 = C60106kz.f162531p;
            kzVar.f162533a |= 32;
            kzVar.f162536d = M;
        }
        this.f269571q = b.mo106519q();
        m159660o();
        C124625ar a2 = C124625ar.m204290a(this.f269571q.f343821h);
        if (a2 == null) {
            a2 = C124625ar.UNKNOWN_INTERNAL_OTA_STATE;
        }
        if (a2.equals(C124625ar.UNKNOWN_INTERNAL_OTA_STATE) || (a = C124640bf.m204304a(b.mo106519q().f343818e)) == 0 || a != 2) {
            Intent intent = new Intent("action_ota");
            intent.putExtra("is_zero_day", true);
            intent.putExtra("key_device_id", str3);
            C124519a.m203974a(getContext(), intent);
        }
        this.f269568n.mo83360B(new C58759qy(8), this);
        C22871g gVar = this.f269569o;
        gVar.mo28209i(gVar.mo28203c("GetDeviceInfo", f269567s, new C96344ke(this, str3)), "CheckForOtaStart", new C96345kf(this));
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f269568n.mo83379U(this);
    }
}
