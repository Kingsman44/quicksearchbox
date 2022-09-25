package com.google.android.apps.gsa.staticplugins.p7920en;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import androidx.p128m.p129a.C2399d;
import com.google.android.apps.gsa.handsfree.C74559b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.p8889z.p8890a.C118843f;
import com.google.android.apps.gsa.search.core.p6519al.p6717do.C85403a;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.en.l */
/* compiled from: PG */
public final class C100570l extends C86734a implements BluetoothProfile.ServiceListener, C85403a {

    /* renamed from: a */
    public static final C59071e f281167a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.en.l");

    /* renamed from: b */
    public final Context f281168b;

    /* renamed from: c */
    public final C118843f f281169c;

    /* renamed from: f */
    public final C86338r f281170f;

    /* renamed from: g */
    public final Object f281171g = new Object();

    /* renamed from: h */
    BluetoothAdapter f281172h;

    /* renamed from: i */
    BluetoothHeadset f281173i;

    /* renamed from: j */
    BluetoothDevice f281174j;

    /* renamed from: k */
    C100560b f281175k;

    /* renamed from: l */
    String f281176l;

    /* renamed from: m */
    C100560b f281177m;

    /* renamed from: n */
    public int f281178n;

    /* renamed from: o */
    public boolean f281179o;

    /* renamed from: p */
    public boolean f281180p;

    /* renamed from: q */
    boolean f281181q;

    /* renamed from: r */
    public boolean f281182r = true;

    /* renamed from: s */
    final BroadcastReceiver f281183s = new C100568j(this);

    /* renamed from: t */
    private final C2399d f281184t;

    /* renamed from: u */
    private final C22871g f281185u;

    /* renamed from: v */
    private final AudioManager f281186v;

    /* renamed from: w */
    private final Deque f281187w;

    public C100570l(Context context, C22871g gVar, AudioManager audioManager, C118843f fVar, C86338r rVar) {
        super(C118575h.WORKER_VEHICLE_INTEGRATION, "vehicleintegration");
        this.f281168b = context;
        this.f281184t = C2399d.m6419a(context.getApplicationContext());
        this.f281185u = gVar;
        this.f281186v = audioManager;
        this.f281169c = fVar;
        this.f281170f = rVar;
        this.f281187w = new ArrayDeque();
        this.f281178n = 2;
        if (audioManager.isBluetoothScoAvailableOffCall()) {
            this.f281178n |= 4;
        }
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: k */
    private final void m166674k() {
        if (this.f281181q) {
            C58976aa aaVar = C58975e.f156826a;
            this.f281184t.mo5804c(this.f281183s);
            this.f281181q = false;
        }
        if (this.f281174j != null) {
            C59104x b = f281167a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "VehicleIntegrationWork");
            ((C59052c) ((C59052c) b).mo56372aa(33522)).mo56389s("Device [%s] disconnected.", this.f281174j);
            this.f281174j = null;
            this.f281175k = null;
            this.f281169c.mo71754o(150);
        }
        C100564f.m166671d(this.f281170f);
    }

    /* renamed from: a */
    public final C60870cx mo78922a(Intent intent) {
        mo91970c(intent);
        return C118826c.f331423b;
    }

    /* renamed from: b */
    public final C60870cx mo78923b(int i) {
        C58976aa aaVar = C58975e.f156826a;
        C100560b bVar = this.f281175k;
        if (!(bVar == null || (bVar.f281152g & 1) == 0)) {
            this.f281185u.mo28212l("Update voice dialog state", new C100565g(this, i));
        }
        return C118826c.f331423b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo91970c(Intent intent) {
        if (intent != null) {
            this.f281185u.mo28212l("Process Vehicle Integration Intents", new C100567i(this, intent));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0062, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo91971e() {
        /*
            r4 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0 = 0
            r4.f281182r = r0
            java.lang.Object r0 = r4.f281171g
            monitor-enter(r0)
            android.bluetooth.BluetoothAdapter r1 = r4.f281172h     // Catch:{ all -> 0x0063 }
            if (r1 != 0) goto L_0x0012
            android.bluetooth.BluetoothAdapter r1 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()     // Catch:{ all -> 0x0063 }
            r4.f281172h = r1     // Catch:{ all -> 0x0063 }
        L_0x0012:
            android.bluetooth.BluetoothAdapter r1 = r4.f281172h     // Catch:{ all -> 0x0063 }
            if (r1 != 0) goto L_0x0035
            com.google.common.f.e r1 = f281167a     // Catch:{ all -> 0x0063 }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ all -> 0x0063 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0063 }
            java.lang.String r3 = "VehicleIntegrationWork"
            r1.mo56378ag(r2, r3)     // Catch:{ all -> 0x0063 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0063 }
            r2 = 33539(0x8303, float:4.6998E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x0063 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0063 }
            java.lang.String r2 = "Bluetooth is not supported on this hardware platform."
            r1.mo56386p(r2)     // Catch:{ all -> 0x0063 }
            monitor-exit(r0)     // Catch:{ all -> 0x0063 }
            return
        L_0x0035:
            android.bluetooth.BluetoothHeadset r2 = r4.f281173i     // Catch:{ all -> 0x0063 }
            if (r2 != 0) goto L_0x0061
            android.content.Context r2 = r4.f281168b     // Catch:{ all -> 0x0063 }
            r3 = 1
            boolean r1 = r1.getProfileProxy(r2, r4, r3)     // Catch:{ all -> 0x0063 }
            if (r1 != 0) goto L_0x0061
            com.google.common.f.e r1 = f281167a     // Catch:{ all -> 0x0063 }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ all -> 0x0063 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0063 }
            java.lang.String r3 = "VehicleIntegrationWork"
            r1.mo56378ag(r2, r3)     // Catch:{ all -> 0x0063 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0063 }
            r2 = 33538(0x8302, float:4.6997E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x0063 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0063 }
            java.lang.String r2 = "BluetoothHeadset profile is not supported on this system."
            r1.mo56386p(r2)     // Catch:{ all -> 0x0063 }
            monitor-exit(r0)     // Catch:{ all -> 0x0063 }
            return
        L_0x0061:
            monitor-exit(r0)     // Catch:{ all -> 0x0063 }
            return
        L_0x0063:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0063 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7920en.C100570l.mo91971e():void");
    }

    /* renamed from: f */
    public final void mo91972f() {
        if (!this.f281180p && this.f281179o) {
            C58976aa aaVar = C58975e.f156826a;
            if (this.f281186v.isBluetoothA2dpOn()) {
                mo91975i("audiosource,a2dp");
            }
            this.f281179o = false;
        }
    }

    /* renamed from: g */
    public final void mo91973g() {
        synchronized (this.f281171g) {
            if (this.f281173i == null) {
                mo91971e();
                return;
            }
            synchronized (this.f281187w) {
                while (!this.f281187w.isEmpty() && this.f281174j != null) {
                    C100569k kVar = (C100569k) this.f281187w.pop();
                    String str = kVar.f281165a;
                    String str2 = kVar.f281166b;
                    BluetoothDevice bluetoothDevice = this.f281174j;
                    bluetoothDevice.getClass();
                    if (str.equals(bluetoothDevice.getAddress())) {
                        BluetoothHeadset bluetoothHeadset = this.f281173i;
                        bluetoothHeadset.getClass();
                        boolean sendVendorSpecificResultCode = bluetoothHeadset.sendVendorSpecificResultCode(this.f281174j, "+ANDROID", str2);
                        C58976aa aaVar = C58975e.f156826a;
                        if (!sendVendorSpecificResultCode) {
                            BluetoothHeadset bluetoothHeadset2 = this.f281173i;
                            bluetoothHeadset2.getClass();
                            if (bluetoothHeadset2.getConnectionState(this.f281174j) != 2) {
                                m166674k();
                            }
                        } else {
                            continue;
                        }
                    } else {
                        C58976aa aaVar2 = C58975e.f156826a;
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo91974h() {
        if (!this.f281181q) {
            C58976aa aaVar = C58975e.f156826a;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.apps.gsa.handsfree.ACTION_SCO_STATE_CHANGED");
            intentFilter.addAction("com.google.android.apps.gsa.handsfree.ACTION_SWITCH_TO_A2DP");
            this.f281184t.mo5803b(this.f281183s, intentFilter);
            this.f281181q = true;
        }
        this.f281180p = false;
        this.f281179o = false;
    }

    /* renamed from: j */
    public final boolean mo91976j() {
        if (C74559b.m120597a(this.f281168b)) {
            C58976aa aaVar = C58975e.f156826a;
            return true;
        }
        Context context = this.f281168b;
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VOICE_COMMAND"), 65536);
        ResolveInfo b = C74559b.m120598b(context);
        if (b != null) {
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                if (resolveInfo.activityInfo.name.equals(b.activityInfo.name)) {
                    C58976aa aaVar2 = C58975e.f156826a;
                    return false;
                }
            }
        }
        C58976aa aaVar3 = C58975e.f156826a;
        try {
            this.f281168b.startActivity(new Intent("android.intent.action.VOICE_COMMAND").addCategory("android.intent.category.DEFAULT").addFlags(268435456).putExtra("com.google.android.apps.gsa.handsfree.EXTRA_IGNORE_VOICE_COMMAND", true));
        } catch (ActivityNotFoundException e) {
            C59104x c = f281167a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "VehicleIntegrationWork");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(33554)).mo56386p("No default handler for android.intent.action.VOICE_COMMAND.");
        }
        return false;
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }

    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        List<BluetoothDevice> connectedDevices;
        if (i == 1) {
            C58976aa aaVar = C58975e.f156826a;
            synchronized (this.f281171g) {
                BluetoothHeadset bluetoothHeadset = (BluetoothHeadset) bluetoothProfile;
                this.f281173i = bluetoothHeadset;
                connectedDevices = bluetoothHeadset.getConnectedDevices();
            }
            if (this.f281176l != null) {
                Iterator<BluetoothDevice> it = connectedDevices.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    BluetoothDevice next = it.next();
                    if (next.getAddress().equals(this.f281176l)) {
                        synchronized (this.f281171g) {
                            this.f281174j = next;
                        }
                        C100560b bVar = this.f281177m;
                        bVar.getClass();
                        this.f281175k = bVar;
                        bVar.mo91965b();
                        break;
                    }
                }
                synchronized (this.f281171g) {
                    if (this.f281174j == null) {
                        m166674k();
                    }
                }
                this.f281176l = null;
                this.f281177m = null;
            }
            if (this.f281176l == null) {
                this.f281185u.mo28212l("Send AT command responses", new C100566h(this));
            }
        }
    }

    public final void onServiceDisconnected(int i) {
        if (i == 1) {
            C58976aa aaVar = C58975e.f156826a;
            synchronized (this.f281171g) {
                m166674k();
                this.f281173i = null;
            }
        }
    }

    /* renamed from: i */
    public final void mo91975i(String str) {
        synchronized (this.f281171g) {
            BluetoothDevice bluetoothDevice = this.f281174j;
            if (bluetoothDevice == null && this.f281176l == null) {
                C58976aa aaVar = C58975e.f156826a;
                return;
            }
            String address = bluetoothDevice == null ? this.f281176l : bluetoothDevice.getAddress();
            synchronized (this.f281187w) {
                this.f281187w.addLast(new C100569k(address, str));
            }
            mo91973g();
        }
    }
}
