package com.google.android.libraries.search.p2904c.p2931i.p2932a;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.media.AudioManager;
import androidx.core.p094f.C1888a;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2168g;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.search.p2904c.C37459ch;
import com.google.android.libraries.search.p2904c.C37460ci;
import com.google.android.libraries.search.p2904c.C37463cl;
import com.google.android.libraries.search.p2904c.C37464cm;
import com.google.android.libraries.search.p2904c.C37466co;
import com.google.android.libraries.search.p2904c.C37467cp;
import com.google.android.libraries.search.p2904c.C37472cu;
import com.google.android.libraries.search.p2904c.C37476cy;
import com.google.android.libraries.search.p2904c.C37504dk;
import com.google.android.libraries.search.p2904c.p2931i.C37681a;
import com.google.android.libraries.search.p2904c.p2931i.C37697b;
import com.google.android.libraries.search.p2904c.p2942m.C37877c;
import com.google.android.libraries.search.p2904c.p2976v.C38120a;
import com.google.android.libraries.search.p2904c.p2977w.C38154f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.search.c.i.a.h */
/* compiled from: PG */
public final class C37689h implements C38154f, C37681a {

    /* renamed from: a */
    public static final C59071e f100084a = C59071e.m91332i("com.google.android.libraries.search.c.i.a.h");

    /* renamed from: j */
    private static final C37467cp f100085j;

    /* renamed from: b */
    public final C37695n f100086b;

    /* renamed from: c */
    public final C60870cx f100087c;

    /* renamed from: d */
    public C2164c f100088d;

    /* renamed from: e */
    public final C60870cx f100089e;

    /* renamed from: f */
    public C2164c f100090f;

    /* renamed from: g */
    public C37697b f100091g = C37697b.DISCONNECTED;

    /* renamed from: h */
    public C58833ax f100092h;

    /* renamed from: i */
    public C58833ax f100093i;

    /* renamed from: k */
    private final Executor f100094k;

    /* renamed from: l */
    private final Executor f100095l;

    /* renamed from: m */
    private final Context f100096m;

    /* renamed from: n */
    private final C60888db f100097n;

    /* renamed from: o */
    private final C60836bq f100098o = new C60836bq();

    /* renamed from: p */
    private final AudioManager f100099p;

    /* renamed from: q */
    private final BluetoothAdapter f100100q;

    /* renamed from: r */
    private C37476cy f100101r = C37476cy.DISCONNECT_REASON_AUDIO_ROUTE_LOST;

    static {
        C37466co coVar = (C37466co) C37467cp.f99458c.createBuilder();
        C37472cu cuVar = C37472cu.f99467a;
        coVar.copyOnWrite();
        C37467cp cpVar = (C37467cp) coVar.instance;
        cuVar.getClass();
        cpVar.f99461b = cuVar;
        cpVar.f99460a = 1;
        f100085j = (C37467cp) coVar.build();
    }

    public C37689h(C37695n nVar, Executor executor, C60888db dbVar, Context context, AudioManager audioManager, Executor executor2) {
        C58836b bVar = C58836b.f156633a;
        this.f100092h = bVar;
        this.f100093i = bVar;
        this.f100086b = nVar;
        this.f100094k = executor;
        this.f100095l = executor2;
        this.f100097n = dbVar;
        this.f100096m = context;
        this.f100099p = audioManager;
        BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth");
        if (bluetoothManager == null) {
            ((C59052c) ((C59052c) f100084a.mo56226d()).mo56372aa(52762)).mo56386p("#audio# Bluetooth manager is 'null'");
            this.f100100q = null;
        } else {
            this.f100100q = bluetoothManager.getAdapter();
        }
        this.f100089e = C2169h.m6027a(new C37686e(this));
        this.f100087c = C2169h.m6027a(new C37687f(this));
    }

    /* renamed from: j */
    private final synchronized void m66647j(BluetoothDevice bluetoothDevice, C37697b bVar) {
        if (bVar.equals(C37697b.CONNECTING)) {
            if (!this.f100092h.mo56113h()) {
                ((C59052c) ((C59052c) f100084a.mo56224b()).mo56372aa(52764)).mo56386p("#audio# Found a connecting device.");
                this.f100092h = C58833ax.m90833j(bluetoothDevice);
            }
            this.f100091g = C37697b.CONNECTED;
        } else if (this.f100091g.equals(C37697b.CONNECTED)) {
            ((C59052c) ((C59052c) f100084a.mo56224b()).mo56372aa(52763)).mo56386p("#audio# Updated to Bluetooth successfully");
            C2164c cVar = this.f100090f;
            C37463cl clVar = (C37463cl) C37464cm.f99446c.createBuilder();
            C37504dk dkVar = C37504dk.UPDATED;
            clVar.copyOnWrite();
            C37464cm cmVar = (C37464cm) clVar.instance;
            cmVar.f99449b = dkVar.f99586t;
            cmVar.f99448a |= 1;
            cVar.mo5437b((C37464cm) clVar.build());
        }
    }

    /* renamed from: k */
    private final synchronized void m66648k(BluetoothDevice bluetoothDevice, C37697b bVar, C37697b bVar2) {
        if (bVar.equals(C37697b.DISCONNECTED) && this.f100093i.mo56113h()) {
            ((BluetoothHeadset) this.f100093i.mo56107c()).stopVoiceRecognition(bluetoothDevice);
        }
        ((C59052c) ((C59052c) f100084a.mo56224b()).mo56372aa(52765)).mo56354G("#audio# Received unexpected state update, expected: %s, actual %s", bVar, bVar2);
    }

    /* renamed from: l */
    private final synchronized void m66649l() {
        this.f100086b.mo41078b(this);
        C2164c cVar = this.f100088d;
        C37459ch chVar = (C37459ch) C37460ci.f99438c.createBuilder();
        C37476cy cyVar = this.f100101r;
        chVar.copyOnWrite();
        C37460ci ciVar = (C37460ci) chVar.instance;
        ciVar.f99441b = cyVar.f99492t;
        ciVar.f99440a |= 1;
        cVar.mo5437b((C37460ci) chVar.build());
        if (!((C2168g) this.f100089e).f6144b.isDone()) {
            C2164c cVar2 = this.f100090f;
            C37463cl clVar = (C37463cl) C37464cm.f99446c.createBuilder();
            C37504dk dkVar = C37504dk.FAILED_ROUTING_DUE_TO_AUDIO_ROUTE_LOST;
            clVar.copyOnWrite();
            C37464cm cmVar = (C37464cm) clVar.instance;
            cmVar.f99449b = dkVar.f99586t;
            cmVar.f99448a |= 1;
            cVar2.mo5437b((C37464cm) clVar.build());
        }
    }

    /* renamed from: a */
    public final synchronized void mo41063a(BluetoothDevice bluetoothDevice, C37697b bVar) {
        String str;
        if (this.f100092h.mo56113h() && !this.f100092h.equals(C58833ax.m90833j(bluetoothDevice))) {
            C59052c cVar = (C59052c) ((C59052c) f100084a.mo56226d()).mo56372aa(52771);
            if (bluetoothDevice == null) {
                str = "NULL";
            } else {
                str = bluetoothDevice.getAddress();
            }
            cVar.mo56389s("#audio# Received event from a different Bluetooth device, we are ignoring it for the moment. This should never happen. BluetoothDevice: %s", str);
        } else if (bluetoothDevice == null) {
            ((C59052c) ((C59052c) f100084a.mo56226d()).mo56372aa(52770)).mo56386p("#audio# onScoStateChanged: passed BluetoothDevice is 'null'.");
        } else {
            if (this.f100091g.equals(bVar)) {
                m66647j(bluetoothDevice, bVar);
            } else {
                m66648k(bluetoothDevice, this.f100091g, bVar);
            }
            if (bVar.equals(C37697b.DISCONNECTED)) {
                m66649l();
            }
        }
    }

    /* renamed from: b */
    public final void mo41064b() {
        ((C59052c) ((C59052c) f100084a.mo56226d()).mo56372aa(52772)).mo56386p("#audio# Service disconnected unexpectedly.");
        m66649l();
    }

    /* renamed from: c */
    public final synchronized void mo41065c(BluetoothDevice bluetoothDevice, int i) {
        if (!this.f100092h.equals(C58833ax.m90833j(bluetoothDevice))) {
            ((C59052c) ((C59052c) f100084a.mo56226d()).mo56372aa(52769)).mo56386p("#audio# Received event from a different Bluetooth device, we are ignoring it for the moment.");
        } else if (i == 3) {
            ((C59052c) ((C59052c) f100084a.mo56226d()).mo56372aa(52768)).mo56386p("#audio# Device disconnected unexpectedly.");
            m66649l();
        }
    }

    /* renamed from: d */
    public final C37877c mo41068d() {
        return C37877c.m66848b(this.f100087c, f100085j, C58836b.f156633a);
    }

    /* renamed from: e */
    public final synchronized C60870cx mo41069e() {
        Context context = this.f100096m;
        if (C1888a.m5149c()) {
            if (!C38120a.m67298b(context, "android.permission.BLUETOOTH_SCAN") || !C38120a.m67298b(context, "android.permission.BLUETOOTH_CONNECT")) {
                mo41073i(C37504dk.FAILED_ROUTING_DUE_TO_BLUETOOTH_PERMISSION_DENIED, C37476cy.DISCONNECT_REASON_BLUETOOTH_PERMISSION_DENIED);
                return this.f100089e;
            }
        }
        BluetoothAdapter bluetoothAdapter = this.f100100q;
        if (bluetoothAdapter != null && bluetoothAdapter.isEnabled()) {
            if (this.f100099p.isBluetoothScoAvailableOffCall()) {
                this.f100097n.mo29164d(new C37682a(this), 2000, TimeUnit.MILLISECONDS);
                return this.f100098o.mo57305b(C47810es.m84965e(new C37683b(this)), this.f100095l);
            }
        }
        ((C59052c) ((C59052c) f100084a.mo56226d()).mo56372aa(52761)).mo56386p("#audio# Bluetooth is not available.");
        mo41073i(C37504dk.FAILED_ROUTING_DUE_TO_BLUETOOTH_NOT_AVAILABLE, C37476cy.DISCONNECT_REASON_BLUETOOTH_NOT_AVAILABLE);
        return this.f100089e;
    }

    /* renamed from: f */
    public final synchronized C60870cx mo41070f(C37476cy cyVar) {
        return this.f100098o.mo57305b(C47810es.m84965e(new C37684c(this, cyVar)), this.f100095l);
    }

    /* renamed from: g */
    public final synchronized C60870cx mo41071g() {
        C60870cx cxVar;
        C37694m mVar = this.f100086b.f100121d;
        if (mVar.f100116f.compareAndSet(false, true)) {
            mVar.f100113c.mo29165e(new C37692k(mVar), 500, TimeUnit.MILLISECONDS);
            BluetoothManager bluetoothManager = mVar.f100117g.f100122e;
            if (bluetoothManager == null) {
                mVar.f100112b.mo5437b((Object) null);
                ((C59052c) ((C59052c) C37695n.f100118a.mo56226d()).mo56372aa(52775)).mo56386p("#audio# Bluetooth is not supported by the system.");
                cxVar = mVar.f100111a;
                C60856cj.m92911t(C60922j.m93044g(cxVar, C47810es.m84963c(new C37691j(mVar)), mVar.f100117g.f100120c), C47810es.m84974n(new C37688g(this)), this.f100094k);
            } else {
                BluetoothAdapter adapter = bluetoothManager.getAdapter();
                if (adapter == null) {
                    mVar.f100112b.mo5437b((Object) null);
                    ((C59052c) ((C59052c) C37695n.f100118a.mo56226d()).mo56372aa(52774)).mo56386p("#audio# Unable to get BluetoothAdapter");
                } else if (!adapter.getProfileProxy(mVar.f100117g.f100119b, mVar, 1)) {
                    mVar.f100112b.mo5437b((Object) null);
                    ((C59052c) ((C59052c) C37695n.f100118a.mo56226d()).mo56372aa(52773)).mo56386p("#audio# Bluetooth not available: no headset profile.");
                }
            }
        }
        cxVar = mVar.f100111a;
        C60856cj.m92911t(C60922j.m93044g(cxVar, C47810es.m84963c(new C37691j(mVar)), mVar.f100117g.f100120c), C47810es.m84974n(new C37688g(this)), this.f100094k);
        return this.f100089e;
    }

    /* renamed from: h */
    public final synchronized C60870cx mo41072h(C37476cy cyVar) {
        this.f100101r = cyVar;
        this.f100091g = C37697b.DISCONNECTED;
        if (this.f100093i.mo56113h() && this.f100092h.mo56113h()) {
            ((BluetoothHeadset) this.f100093i.mo56107c()).stopVoiceRecognition((BluetoothDevice) this.f100092h.mo56107c());
        }
        this.f100097n.mo29164d(new C37685d(this, cyVar), 200, TimeUnit.MILLISECONDS);
        return this.f100087c;
    }

    /* renamed from: i */
    public final void mo41073i(C37504dk dkVar, C37476cy cyVar) {
        C2164c cVar = this.f100090f;
        C37463cl clVar = (C37463cl) C37464cm.f99446c.createBuilder();
        clVar.copyOnWrite();
        C37464cm cmVar = (C37464cm) clVar.instance;
        cmVar.f99449b = dkVar.f99586t;
        cmVar.f99448a |= 1;
        cVar.mo5437b((C37464cm) clVar.build());
        C2164c cVar2 = this.f100088d;
        C37459ch chVar = (C37459ch) C37460ci.f99438c.createBuilder();
        chVar.copyOnWrite();
        C37460ci ciVar = (C37460ci) chVar.instance;
        ciVar.f99441b = cyVar.f99492t;
        ciVar.f99440a |= 1;
        cVar2.mo5437b((C37460ci) chVar.build());
    }
}
