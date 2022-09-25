package com.google.android.libraries.search.p2904c.p2931i.p2932a;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.libraries.search.p2904c.p2931i.C37681a;
import com.google.android.libraries.search.p2904c.p2931i.C37697b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60888db;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.search.c.i.a.n */
/* compiled from: PG */
public final class C37695n extends BroadcastReceiver {

    /* renamed from: a */
    public static final C59071e f100118a = C59071e.m91332i("com.google.android.libraries.search.c.i.a.n");

    /* renamed from: b */
    public final Context f100119b;

    /* renamed from: c */
    public final Executor f100120c;

    /* renamed from: d */
    public final C37694m f100121d;

    /* renamed from: e */
    public final BluetoothManager f100122e;

    /* renamed from: f */
    public final Set f100123f = new HashSet();

    /* renamed from: g */
    private final AtomicBoolean f100124g = new AtomicBoolean(false);

    public C37695n(Context context, Executor executor, C60888db dbVar) {
        this.f100120c = executor;
        this.f100119b = context;
        this.f100121d = new C37694m(this, dbVar);
        this.f100122e = (BluetoothManager) context.getSystemService("bluetooth");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m66660c() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.Set r0 = r3.f100123f     // Catch:{ all -> 0x001c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x001a
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f100124g     // Catch:{ all -> 0x001c }
            r1 = 1
            r2 = 0
            boolean r0 = r0.compareAndSet(r1, r2)     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x001a
            android.content.Context r0 = r3.f100119b     // Catch:{ all -> 0x001c }
            r0.unregisterReceiver(r3)     // Catch:{ all -> 0x001c }
            monitor-exit(r3)
            return
        L_0x001a:
            monitor-exit(r3)
            return
        L_0x001c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.p2904c.p2931i.p2932a.C37695n.m66660c():void");
    }

    /* renamed from: d */
    private final synchronized void m66661d(BluetoothDevice bluetoothDevice, int i) {
        C59071e eVar = f100118a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(52782)).mo56387q("#audio# onConnectionStateChanged: state=%d", i);
        int i2 = 3;
        if (i != 0) {
            i2 = i != 1 ? i != 2 ? i != 3 ? 5 : 4 : 1 : 2;
        }
        if (i2 == 5) {
            ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(52783)).mo56387q("#audio# Invalid Bluetooth Connection State Change %d, this value will not be propagated to BluetoothStatusListener.", i);
        }
        for (C37681a c : this.f100123f) {
            c.mo41065c(bluetoothDevice, i2);
        }
    }

    /* renamed from: e */
    private final synchronized void m66662e(BluetoothDevice bluetoothDevice, int i) {
        C59071e eVar = f100118a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(52787)).mo56387q("#audio# onScoStateChanged: state=%d", i);
        C37697b a = C37697b.m66667a(i);
        if (a.equals(C37697b.INVALID)) {
            ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(52788)).mo56387q("#audio# Invalid Sco Connection State: %d, this value will not be propagated to BluetoothStatusListener.", i);
            return;
        }
        for (C37681a a2 : this.f100123f) {
            a2.mo41063a(bluetoothDevice, a);
        }
    }

    /* renamed from: a */
    public final synchronized void mo41077a(C37681a aVar) {
        if (this.f100124g.compareAndSet(false, true)) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
            this.f100119b.registerReceiver(this, intentFilter);
        }
        this.f100123f.add(aVar);
    }

    /* renamed from: b */
    public final synchronized void mo41078b(C37681a aVar) {
        this.f100123f.remove(aVar);
        m66660c();
    }

    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            ((C59052c) ((C59052c) f100118a.mo56226d()).mo56372aa(52786)).mo56386p("#audio# onReceive Action must not be null.");
            return;
        }
        char c = 65535;
        int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
        intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -1);
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        int hashCode = action.hashCode();
        if (hashCode != -1435586571) {
            if (hashCode == 545516589 && action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                c = 0;
            }
        } else if (action.equals("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED")) {
            c = 1;
        }
        if (c == 0) {
            m66661d(bluetoothDevice, intExtra);
        } else if (c != 1) {
            ((C59052c) ((C59052c) f100118a.mo56225c()).mo56372aa(52784)).mo56389s("#audio# onReceive Unexpected action %s", action);
        } else {
            m66662e(bluetoothDevice, intExtra);
        }
    }
}
