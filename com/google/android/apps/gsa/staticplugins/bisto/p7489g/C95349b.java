package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import com.google.android.apps.gsa.shared.util.permissions.C91076c;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9391a.C124539a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.b */
/* compiled from: PG */
public final class C95349b implements AutoCloseable {

    /* renamed from: b */
    private static final C59071e f266779b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.g.b");

    /* renamed from: a */
    public BluetoothA2dp f266780a;

    /* renamed from: c */
    private boolean f266781c = false;

    public C95349b(Context context, C95850a aVar) {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (!C91076c.m148792a(context)) {
            C59104x c = f266779b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "A2dpHelper");
            ((C59052c) ((C59052c) c).mo56372aa(14898)).mo56386p("Bluetooth permissions not granted for Android S.");
        } else if (defaultAdapter != null) {
            defaultAdapter.getProfileProxy(context, new C95322a(this), 2);
        }
        C58976aa aaVar = C58975e.f156826a;
        aVar.f268408a.add(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0028, code lost:
        if (r0.getConnectionState(r4) != 2) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
        return false;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean m157631d(android.bluetooth.BluetoothDevice r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f266781c     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r3)
            return r1
        L_0x0008:
            android.bluetooth.BluetoothA2dp r0 = r3.f266780a     // Catch:{ all -> 0x002d }
            if (r0 != 0) goto L_0x0022
            com.google.common.f.e r4 = f266779b     // Catch:{ all -> 0x002d }
            com.google.common.f.x r4 = r4.mo56225c()     // Catch:{ all -> 0x002d }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x002d }
            java.lang.String r2 = "A2dpHelper"
            r4.mo56378ag(r0, r2)     // Catch:{ all -> 0x002d }
            java.lang.String r0 = "a2dpProxy is null"
            r2 = 14899(0x3a33, float:2.0878E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r2)).mo56386p(r0)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r1
        L_0x0022:
            int r4 = r0.getConnectionState(r4)     // Catch:{ all -> 0x002d }
            r0 = 2
            monitor-exit(r3)
            if (r4 != r0) goto L_0x002c
            r4 = 1
            return r4
        L_0x002c:
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95349b.m157631d(android.bluetooth.BluetoothDevice):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized boolean mo89282a(C95419dp dpVar) {
        return m157631d(((C95425dv) dpVar).f266997h.f242736i.f343619a);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000b, code lost:
        if (r2.f266780a == null) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x000d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x000f, code lost:
        return false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo89283b() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f266781c     // Catch:{ all -> 0x0010 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r2)
            return r1
        L_0x0008:
            android.bluetooth.BluetoothA2dp r0 = r2.f266780a     // Catch:{ all -> 0x0010 }
            monitor-exit(r2)
            if (r0 == 0) goto L_0x000f
            r0 = 1
            return r0
        L_0x000f:
            return r1
        L_0x0010:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95349b.mo89283b():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized boolean mo89284c(C124539a aVar) {
        return m157631d(aVar.f343619a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void close() {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 1
            r3.f266781c = r0     // Catch:{ all -> 0x0016 }
            android.bluetooth.BluetoothA2dp r0 = r3.f266780a     // Catch:{ all -> 0x0016 }
            if (r0 == 0) goto L_0x0014
            android.bluetooth.BluetoothAdapter r1 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()     // Catch:{ all -> 0x0016 }
            if (r1 == 0) goto L_0x0014
            r2 = 2
            r1.closeProfileProxy(r2, r0)     // Catch:{ all -> 0x0016 }
            monitor-exit(r3)
            return
        L_0x0014:
            monitor-exit(r3)
            return
        L_0x0016:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95349b.close():void");
    }
}
