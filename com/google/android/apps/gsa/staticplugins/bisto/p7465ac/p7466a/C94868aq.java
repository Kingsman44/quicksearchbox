package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7476j.C95012c;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7476j.C95013d;
import com.google.android.libraries.assistant.accessory.p618b.C11011p;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.aq */
/* compiled from: PG */
public final class C94868aq {

    /* renamed from: C */
    private static final long f265283C = Duration.ofSeconds(1).toMillis();

    /* renamed from: D */
    private static final long f265284D = Duration.ofSeconds(35).toMillis();

    /* renamed from: a */
    public static final C59071e f265285a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ac.a.aq");

    /* renamed from: b */
    public static final long f265286b = Duration.ofSeconds(5).toMillis();

    /* renamed from: c */
    public static final long f265287c = Duration.ofSeconds(3).toMillis();

    /* renamed from: d */
    static final long f265288d = Duration.ofSeconds(30).toMillis();

    /* renamed from: A */
    public C94877az f265289A = new C94877az(1);

    /* renamed from: B */
    final BluetoothGattCallback f265290B = new C94866ao(this);

    /* renamed from: E */
    private C60870cx f265291E;

    /* renamed from: e */
    public final Context f265292e;

    /* renamed from: f */
    public final C94869ar f265293f;

    /* renamed from: g */
    public final ReentrantLock f265294g;

    /* renamed from: h */
    public final C11011p f265295h;

    /* renamed from: i */
    public final AtomicBoolean f265296i = new AtomicBoolean(false);

    /* renamed from: j */
    public final AtomicBoolean f265297j = new AtomicBoolean(false);

    /* renamed from: k */
    public final AtomicBoolean f265298k = new AtomicBoolean(false);

    /* renamed from: l */
    final AtomicInteger f265299l = new AtomicInteger(20);

    /* renamed from: m */
    final AtomicInteger f265300m = new AtomicInteger(0);

    /* renamed from: n */
    public final AtomicInteger f265301n = new AtomicInteger(0);

    /* renamed from: o */
    public final AtomicBoolean f265302o = new AtomicBoolean(true);

    /* renamed from: p */
    public final AtomicBoolean f265303p = new AtomicBoolean(false);

    /* renamed from: q */
    public final C89656k f265304q;

    /* renamed from: r */
    C94875ax f265305r;

    /* renamed from: s */
    final ConcurrentLinkedQueue f265306s = new ConcurrentLinkedQueue();

    /* renamed from: t */
    final ConcurrentLinkedQueue f265307t = new ConcurrentLinkedQueue();

    /* renamed from: u */
    public CountDownLatch f265308u = new CountDownLatch(0);

    /* renamed from: v */
    public final C60888db f265309v;

    /* renamed from: w */
    public final Executor f265310w;

    /* renamed from: x */
    public final Object f265311x = new Object();

    /* renamed from: y */
    public boolean f265312y = false;

    /* renamed from: z */
    volatile C95013d f265313z;

    public C94868aq(Context context, C94869ar arVar, ReentrantLock reentrantLock, C11011p pVar, C60888db dbVar, Executor executor, C89656k kVar) {
        this.f265292e = context;
        this.f265293f = arVar;
        this.f265294g = reentrantLock;
        this.f265295h = pVar;
        this.f265309v = dbVar;
        this.f265310w = executor;
        this.f265304q = kVar;
    }

    /* renamed from: c */
    static String m156500c(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? i != 7 ? i != 13 ? i != 15 ? i != 129 ? i != 133 ? i != 257 ? "Unknown error code" : "GATT_FAILURE" : "GATT_ERROR" : "GATT_INTERNAL_ERROR" : "GATT_INSUFFICIENT_ENCRYPTION" : "GATT_INVALID_ATTRIBUTE_LENGTH" : "GATT_INVALID_OFFSET" : "GATT_REQUEST_NOT_SUPPORTED" : "GATT_INSUFFICIENT_AUTHENTICATION" : "GATT_WRITE_NOT_PERMITTED" : "GATT_READ_NOT_PERMITTED" : "GATT_INVALID_HANDLE" : "GATT_SUCCESS";
    }

    /* renamed from: q */
    private final void m156501q() {
        mo88698d();
        try {
            C95013d b = mo88697b();
            if (!b.mo88923e()) {
                throw new C94893q(String.format(Locale.US, "[%s] Cannot start remote service discovery.", new Object[]{C94876ay.m156555d(b)}));
            }
        } finally {
            this.f265294g.unlock();
        }
    }

    /* renamed from: r */
    private final void m156502r() {
        if (this.f265301n.getAndIncrement() >= 3) {
            this.f265293f.mo88713c(new C94893q(String.format(Locale.US, "[%s] Maximum gatt refresh attempts reached.", new Object[]{C94876ay.m156555d(this.f265313z)})));
        } else if (this.f265297j.getAndSet(true)) {
            C59104x d = f265285a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoGattHelper");
            ((C59052c) ((C59052c) d).mo56372aa(17425)).mo56389s("[%s] Already refreshing, giving up.", C94876ay.m156555d(this.f265313z));
        } else {
            C58976aa aaVar = C58975e.f156826a;
            C94876ay.m156555d(this.f265313z);
            try {
                mo88706l();
                m156501q();
            } catch (C94893q e) {
                C59104x c = f265285a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "BistoGattHelper");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(17424)).mo56389s("[%s] Refresh failed", C94876ay.m156555d(this.f265313z));
                this.f265297j.set(false);
                m156502r();
            }
        }
    }

    /* renamed from: s */
    private final void m156503s(C95013d dVar, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) {
        C59071e eVar = f265285a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoGattHelper");
        ((C59052c) ((C59052c) b).mo56372aa(17433)).mo56389s("[%s] unsubscribe", C94876ay.m156555d(this.f265313z));
        synchronized (this.f265311x) {
            try {
                mo88698d();
                boolean z2 = false;
                dVar.mo88924f(bluetoothGattCharacteristic, false);
                BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(C94872au.f265315b);
                if (descriptor == null) {
                    C59104x d = eVar.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "BistoGattHelper");
                    ((C59052c) ((C59052c) d).mo56372aa(17434)).mo56389s("[%s] Missing descriptor", C94876ay.m156555d(this.f265313z));
                } else {
                    descriptor.setValue(BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
                    if (dVar.mo88926h(descriptor)) {
                        z2 = true;
                        this.f265312y = true;
                    }
                }
                this.f265294g.unlock();
                if (!z2 && z) {
                    mo88703i();
                }
            } catch (C94893q unused) {
                C59104x d2 = f265285a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "BistoGattHelper");
                ((C59052c) ((C59052c) d2).mo56372aa(17435)).mo56389s("[%s] Unable to acquire lock", C94876ay.m156555d(this.f265313z));
                if (z) {
                    mo88703i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0033 A[DONT_GENERATE] */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m156504t(int r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.mo88699e()     // Catch:{ all -> 0x0035 }
            int r0 = r6 + -1
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L_0x001c
            r1 = 2
            if (r0 == r1) goto L_0x001c
            r1 = 3
            if (r0 == r1) goto L_0x001c
            r1 = 4
            if (r0 == r1) goto L_0x0019
            r1 = 6
            if (r0 == r1) goto L_0x001c
            r0 = r2
            goto L_0x001e
        L_0x0019:
            long r0 = f265284D     // Catch:{ all -> 0x0035 }
            goto L_0x001e
        L_0x001c:
            long r0 = f265288d     // Catch:{ all -> 0x0035 }
        L_0x001e:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0033
            com.google.common.util.concurrent.db r2 = r5.f265309v     // Catch:{ all -> 0x0035 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.a.u r3 = new com.google.android.apps.gsa.staticplugins.bisto.ac.a.u     // Catch:{ all -> 0x0035 }
            r3.<init>(r5, r6)     // Catch:{ all -> 0x0035 }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0035 }
            com.google.common.util.concurrent.cz r6 = r2.mo29164d(r3, r0, r6)     // Catch:{ all -> 0x0035 }
            r5.f265291E = r6     // Catch:{ all -> 0x0035 }
            monitor-exit(r5)
            return
        L_0x0033:
            monitor-exit(r5)
            return
        L_0x0035:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94868aq.m156504t(int):void");
    }

    /* renamed from: a */
    public final BluetoothGattCharacteristic mo88696a(C95012c cVar, UUID uuid) {
        BluetoothGattCharacteristic characteristic = cVar.f265821a.getCharacteristic(uuid);
        if (characteristic != null) {
            return characteristic;
        }
        throw new C94893q(String.format(Locale.ENGLISH, "[%s] Failed to get characteristic - characteristic not present", new Object[]{C94876ay.m156555d(this.f265313z)}), uuid);
    }

    /* renamed from: b */
    public final C95013d mo88697b() {
        C95013d dVar = this.f265313z;
        if (dVar != null && !this.f265298k.get()) {
            return dVar;
        }
        throw new C94893q(String.format(Locale.US, "[%s] BluetoothGattHelper not connected", new Object[]{C94876ay.m156555d(dVar)}));
    }

    /* renamed from: d */
    public final void mo88698d() {
        try {
            if (!this.f265294g.tryLock(f265283C, TimeUnit.MILLISECONDS)) {
                throw new C94893q(String.format(Locale.US, "[%s] Failed to acquire Bluetooth operation lock", new Object[]{C94876ay.m156555d(this.f265313z)}));
            }
        } catch (InterruptedException unused) {
            throw new C94893q(String.format(Locale.US, "[%s] Got interrupted while acquiring lock", new Object[]{C94876ay.m156555d(this.f265313z)}));
        }
    }

    /* renamed from: e */
    public final synchronized void mo88699e() {
        if (this.f265291E != null) {
            C58976aa aaVar = C58975e.f156826a;
            this.f265291E.cancel(false);
        }
    }

    /* renamed from: f */
    public final void mo88700f() {
        C59104x b = f265285a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoGattHelper");
        ((C59052c) ((C59052c) b).mo56372aa(17410)).mo56389s("[%s] close", C94876ay.m156555d(this.f265313z));
        if (!this.f265298k.getAndSet(true)) {
            this.f265308u = new CountDownLatch(1);
            synchronized (this.f265311x) {
                this.f265312y = false;
            }
            this.f265297j.set(false);
            this.f265296i.set(false);
            this.f265289A = new C94877az(1);
            mo88699e();
            this.f265309v.mo29164d(new C94896t(this), f265286b, TimeUnit.MILLISECONDS);
            mo88703i();
        }
    }

    /* renamed from: g */
    public final void mo88701g() {
        mo88699e();
        this.f265300m.set(0);
        this.f265289A = new C94877az(1);
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:114:0x0232=Splitter:B:114:0x0232, B:30:0x008f=Splitter:B:30:0x008f} */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo88702h(com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94877az r12) {
        /*
            r11 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.f265298k
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x0031
            com.google.common.f.e r0 = f265285a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "BistoGattHelper"
            r0.mo56378ag(r1, r2)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r1 = 17415(0x4407, float:2.4404E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            java.lang.String r1 = "[%s] Operation %s not executed during shutdown"
            com.google.android.apps.gsa.staticplugins.bisto.ac.j.d r2 = r11.f265313z
            java.lang.String r2 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94876ay.m156555d(r2)
            int r12 = r12.f265354d
            java.lang.String r12 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94871at.m156532a(r12)
            r0.mo56354G(r1, r2, r12)
            return
        L_0x0031:
            r11.f265289A = r12
            android.bluetooth.BluetoothGattCharacteristic r0 = r12.f265351a
            byte[] r1 = r12.f265352b
            int r2 = r12.f265354d     // Catch:{ q -> 0x0248 }
            int r2 = r2 + -1
            r3 = 1
            if (r2 == r3) goto L_0x023f
            r4 = 2
            if (r2 == r4) goto L_0x0214
            r5 = 3
            r6 = 0
            if (r2 == r5) goto L_0x0162
            r7 = 4
            if (r2 == r7) goto L_0x00a8
            r1 = 6
            if (r2 == r1) goto L_0x009d
            r0 = 7
            if (r2 == r0) goto L_0x0050
            goto L_0x0242
        L_0x0050:
            com.google.android.apps.gsa.staticplugins.bisto.ac.j.d r0 = r11.f265313z     // Catch:{ q -> 0x0248 }
            if (r0 == 0) goto L_0x0242
            r11.mo88698d()     // Catch:{ q -> 0x0248 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.j.d r0 = r11.mo88697b()     // Catch:{ all -> 0x0096 }
            android.bluetooth.BluetoothGatt r0 = r0.f265823b     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x0066
            boolean r0 = r0.readRemoteRssi()     // Catch:{ all -> 0x0096 }
            if (r0 != 0) goto L_0x008f
            goto L_0x0073
        L_0x0066:
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7476j.C95013d.f265822a     // Catch:{ all -> 0x0096 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = "Unable to schedule remote RSSI read. BluetoothGattCallback is null."
            r2 = 17865(0x45c9, float:2.5034E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)     // Catch:{ all -> 0x0096 }
        L_0x0073:
            com.google.common.f.e r0 = f265285a     // Catch:{ all -> 0x0096 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x0096 }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0096 }
            java.lang.String r2 = "BistoGattHelper"
            r0.mo56378ag(r1, r2)     // Catch:{ all -> 0x0096 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0096 }
            r1 = 17429(0x4415, float:2.4423E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ all -> 0x0096 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = "Could not request remote RSSI"
            r0.mo56386p(r1)     // Catch:{ all -> 0x0096 }
        L_0x008f:
            java.util.concurrent.locks.ReentrantLock r0 = r11.f265294g     // Catch:{ q -> 0x0248 }
            r0.unlock()     // Catch:{ q -> 0x0248 }
            goto L_0x0242
        L_0x0096:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantLock r1 = r11.f265294g     // Catch:{ q -> 0x0248 }
            r1.unlock()     // Catch:{ q -> 0x0248 }
            throw r0     // Catch:{ q -> 0x0248 }
        L_0x009d:
            com.google.android.apps.gsa.staticplugins.bisto.ac.j.d r1 = r11.f265313z     // Catch:{ q -> 0x0248 }
            if (r1 == 0) goto L_0x0242
            if (r0 == 0) goto L_0x0242
            r11.m156503s(r1, r0, r6)     // Catch:{ q -> 0x0248 }
            goto L_0x0242
        L_0x00a8:
            if (r0 == 0) goto L_0x0242
            if (r1 == 0) goto L_0x0242
            int r2 = r12.f265353c     // Catch:{ q -> 0x0248 }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ q -> 0x0248 }
            java.lang.Object r9 = r11.f265311x     // Catch:{ q -> 0x0248 }
            monitor-enter(r9)     // Catch:{ q -> 0x0248 }
            r11.mo88698d()     // Catch:{ all -> 0x015f }
            boolean r10 = r11.f265312y     // Catch:{ all -> 0x015f }
            if (r10 != 0) goto L_0x0142
            com.google.android.apps.gsa.staticplugins.bisto.ac.j.d r10 = r11.mo88697b()     // Catch:{ all -> 0x013b }
            boolean r1 = r0.setValue(r1)     // Catch:{ all -> 0x013b }
            com.google.common.base.C58838bb.m90883r(r1)     // Catch:{ all -> 0x013b }
            r0.setWriteType(r2)     // Catch:{ all -> 0x013b }
            boolean r1 = r10.mo88925g(r0)     // Catch:{ all -> 0x013b }
            if (r1 == 0) goto L_0x0117
            r11.f265312y = r3     // Catch:{ all -> 0x013b }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x013b }
            com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94876ay.m156555d(r10)     // Catch:{ all -> 0x013b }
            r0.getUuid()     // Catch:{ all -> 0x013b }
            java.util.concurrent.locks.ReentrantLock r1 = r11.f265294g     // Catch:{ all -> 0x015f }
            r1.unlock()     // Catch:{ all -> 0x015f }
            monitor-exit(r9)     // Catch:{ all -> 0x015f }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ q -> 0x0248 }
            long r1 = r1 - r7
            r3 = 1000(0x3e8, double:4.94E-321)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0242
            com.google.common.f.e r3 = f265285a     // Catch:{ q -> 0x0248 }
            com.google.common.f.x r3 = r3.mo56226d()     // Catch:{ q -> 0x0248 }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ q -> 0x0248 }
            java.lang.String r5 = "BistoGattHelper"
            r3.mo56378ag(r4, r5)     // Catch:{ q -> 0x0248 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ q -> 0x0248 }
            r4 = 17437(0x441d, float:2.4434E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)     // Catch:{ q -> 0x0248 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ q -> 0x0248 }
            java.lang.String r4 = "[%s] BLE write on characteristic %s took %s ms"
            com.google.android.apps.gsa.staticplugins.bisto.ac.j.d r5 = r11.f265313z     // Catch:{ q -> 0x0248 }
            java.lang.String r5 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94876ay.m156555d(r5)     // Catch:{ q -> 0x0248 }
            java.util.UUID r0 = r0.getUuid()     // Catch:{ q -> 0x0248 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ q -> 0x0248 }
            r3.mo56359L(r4, r5, r0, r1)     // Catch:{ q -> 0x0248 }
            goto L_0x0242
        L_0x0117:
            com.google.android.apps.gsa.staticplugins.bisto.ac.a.q r1 = new com.google.android.apps.gsa.staticplugins.bisto.ac.a.q     // Catch:{ all -> 0x013b }
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x013b }
            java.lang.String r7 = "[%s] Cannot write characteristic %s on device %s"
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x013b }
            java.lang.String r8 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94876ay.m156555d(r10)     // Catch:{ all -> 0x013b }
            r5[r6] = r8     // Catch:{ all -> 0x013b }
            r5[r3] = r0     // Catch:{ all -> 0x013b }
            com.google.android.apps.gsa.staticplugins.bisto.ac.j.a r0 = r10.mo88919a()     // Catch:{ all -> 0x013b }
            android.bluetooth.BluetoothDevice r0 = r0.f265818a     // Catch:{ all -> 0x013b }
            java.lang.String r0 = r0.getAddress()     // Catch:{ all -> 0x013b }
            r5[r4] = r0     // Catch:{ all -> 0x013b }
            java.lang.String r0 = java.lang.String.format(r2, r7, r5)     // Catch:{ all -> 0x013b }
            r1.<init>(r0)     // Catch:{ all -> 0x013b }
            throw r1     // Catch:{ all -> 0x013b }
        L_0x013b:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantLock r1 = r11.f265294g     // Catch:{ all -> 0x015f }
            r1.unlock()     // Catch:{ all -> 0x015f }
            throw r0     // Catch:{ all -> 0x015f }
        L_0x0142:
            java.util.concurrent.locks.ReentrantLock r0 = r11.f265294g     // Catch:{ all -> 0x015f }
            r0.unlock()     // Catch:{ all -> 0x015f }
            com.google.android.apps.gsa.staticplugins.bisto.ac.a.q r0 = new com.google.android.apps.gsa.staticplugins.bisto.ac.a.q     // Catch:{ all -> 0x015f }
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ all -> 0x015f }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ all -> 0x015f }
            com.google.android.apps.gsa.staticplugins.bisto.ac.j.d r3 = r11.f265313z     // Catch:{ all -> 0x015f }
            java.lang.String r3 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94876ay.m156555d(r3)     // Catch:{ all -> 0x015f }
            r2[r6] = r3     // Catch:{ all -> 0x015f }
            java.lang.String r3 = "[%s] Already writing - caller should handle this"
            java.lang.String r1 = java.lang.String.format(r1, r3, r2)     // Catch:{ all -> 0x015f }
            r0.<init>(r1)     // Catch:{ all -> 0x015f }
            throw r0     // Catch:{ all -> 0x015f }
        L_0x015f:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x015f }
            throw r0     // Catch:{ q -> 0x0248 }
        L_0x0162:
            if (r0 == 0) goto L_0x0242
            java.lang.Object r1 = r11.f265311x     // Catch:{ q -> 0x0248 }
            monitor-enter(r1)     // Catch:{ q -> 0x0248 }
            r11.mo88698d()     // Catch:{ all -> 0x0211 }
            boolean r2 = r11.f265312y     // Catch:{ all -> 0x0211 }
            if (r2 != 0) goto L_0x01f4
            com.google.android.apps.gsa.staticplugins.bisto.ac.j.d r2 = r11.mo88697b()     // Catch:{ all -> 0x01ed }
            java.util.UUID r5 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94872au.f265315b     // Catch:{ all -> 0x01ed }
            android.bluetooth.BluetoothGattDescriptor r5 = r0.getDescriptor(r5)     // Catch:{ all -> 0x01ed }
            if (r5 != 0) goto L_0x019c
            com.google.android.apps.gsa.staticplugins.bisto.ac.a.ar r0 = r11.f265293f     // Catch:{ all -> 0x01ed }
            com.google.android.apps.gsa.staticplugins.bisto.ac.a.q r4 = new com.google.android.apps.gsa.staticplugins.bisto.ac.a.q     // Catch:{ all -> 0x01ed }
            java.util.Locale r5 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x01ed }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x01ed }
            java.lang.String r2 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94876ay.m156555d(r2)     // Catch:{ all -> 0x01ed }
            r3[r6] = r2     // Catch:{ all -> 0x01ed }
            java.lang.String r2 = "[%s] Failed to get client characteristic config descriptor."
            java.lang.String r2 = java.lang.String.format(r5, r2, r3)     // Catch:{ all -> 0x01ed }
            r4.<init>(r2)     // Catch:{ all -> 0x01ed }
            r0.mo88713c(r4)     // Catch:{ all -> 0x01ed }
            java.util.concurrent.locks.ReentrantLock r0 = r11.f265294g     // Catch:{ all -> 0x0211 }
            r0.unlock()     // Catch:{ all -> 0x0211 }
        L_0x0199:
            monitor-exit(r1)     // Catch:{ all -> 0x0211 }
            goto L_0x0242
        L_0x019c:
            int r7 = r0.getProperties()     // Catch:{ all -> 0x01ed }
            r7 = r7 & 32
            if (r7 == 0) goto L_0x01a7
            byte[] r7 = android.bluetooth.BluetoothGattDescriptor.ENABLE_INDICATION_VALUE     // Catch:{ all -> 0x01ed }
            goto L_0x01a9
        L_0x01a7:
            byte[] r7 = android.bluetooth.BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE     // Catch:{ all -> 0x01ed }
        L_0x01a9:
            r5.setValue(r7)     // Catch:{ all -> 0x01ed }
            boolean r7 = r2.mo88926h(r5)     // Catch:{ all -> 0x01ed }
            if (r7 != 0) goto L_0x01d4
            com.google.android.apps.gsa.staticplugins.bisto.ac.a.ar r5 = r11.f265293f     // Catch:{ all -> 0x01ed }
            com.google.android.apps.gsa.staticplugins.bisto.ac.a.q r7 = new com.google.android.apps.gsa.staticplugins.bisto.ac.a.q     // Catch:{ all -> 0x01ed }
            java.util.Locale r8 = java.util.Locale.US     // Catch:{ all -> 0x01ed }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x01ed }
            java.lang.String r2 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94876ay.m156555d(r2)     // Catch:{ all -> 0x01ed }
            r4[r6] = r2     // Catch:{ all -> 0x01ed }
            r4[r3] = r0     // Catch:{ all -> 0x01ed }
            java.lang.String r0 = "[%s] Failed to initiate descriptor write on %s"
            java.lang.String r0 = java.lang.String.format(r8, r0, r4)     // Catch:{ all -> 0x01ed }
            r7.<init>(r0)     // Catch:{ all -> 0x01ed }
            r5.mo88713c(r7)     // Catch:{ all -> 0x01ed }
            java.util.concurrent.locks.ReentrantLock r0 = r11.f265294g     // Catch:{ all -> 0x0211 }
            r0.unlock()     // Catch:{ all -> 0x0211 }
            goto L_0x0199
        L_0x01d4:
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01ed }
            com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94876ay.m156555d(r2)     // Catch:{ all -> 0x01ed }
            r5.getUuid()     // Catch:{ all -> 0x01ed }
            r2.mo88924f(r0, r3)     // Catch:{ all -> 0x01ed }
            r11.f265312y = r3     // Catch:{ all -> 0x01ed }
            java.util.concurrent.ConcurrentLinkedQueue r2 = r11.f265306s     // Catch:{ all -> 0x01ed }
            r2.add(r0)     // Catch:{ all -> 0x01ed }
            java.util.concurrent.locks.ReentrantLock r0 = r11.f265294g     // Catch:{ all -> 0x0211 }
            r0.unlock()     // Catch:{ all -> 0x0211 }
            monitor-exit(r1)     // Catch:{ all -> 0x0211 }
            goto L_0x0242
        L_0x01ed:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantLock r2 = r11.f265294g     // Catch:{ all -> 0x0211 }
            r2.unlock()     // Catch:{ all -> 0x0211 }
            throw r0     // Catch:{ all -> 0x0211 }
        L_0x01f4:
            java.util.concurrent.locks.ReentrantLock r0 = r11.f265294g     // Catch:{ all -> 0x0211 }
            r0.unlock()     // Catch:{ all -> 0x0211 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.a.q r0 = new com.google.android.apps.gsa.staticplugins.bisto.ac.a.q     // Catch:{ all -> 0x0211 }
            java.util.Locale r2 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x0211 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0211 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.j.d r4 = r11.f265313z     // Catch:{ all -> 0x0211 }
            java.lang.String r4 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94876ay.m156555d(r4)     // Catch:{ all -> 0x0211 }
            r3[r6] = r4     // Catch:{ all -> 0x0211 }
            java.lang.String r4 = "[%s] Already subscribing - caller should handle this"
            java.lang.String r2 = java.lang.String.format(r2, r4, r3)     // Catch:{ all -> 0x0211 }
            r0.<init>(r2)     // Catch:{ all -> 0x0211 }
            throw r0     // Catch:{ all -> 0x0211 }
        L_0x0211:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0211 }
            throw r0     // Catch:{ q -> 0x0248 }
        L_0x0214:
            r11.mo88698d()     // Catch:{ q -> 0x0248 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.j.d r0 = r11.mo88697b()     // Catch:{ all -> 0x0238 }
            android.bluetooth.BluetoothGatt r0 = r0.f265823b     // Catch:{ all -> 0x0238 }
            if (r0 == 0) goto L_0x0225
            r1 = 247(0xf7, float:3.46E-43)
            r0.requestMtu(r1)     // Catch:{ all -> 0x0238 }
            goto L_0x0232
        L_0x0225:
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7476j.C95013d.f265822a     // Catch:{ all -> 0x0238 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x0238 }
            java.lang.String r1 = "Unable to schedule onMtuChanged. BluetoothGattCallback is null."
            r2 = 17864(0x45c8, float:2.5033E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)     // Catch:{ all -> 0x0238 }
        L_0x0232:
            java.util.concurrent.locks.ReentrantLock r0 = r11.f265294g     // Catch:{ q -> 0x0248 }
            r0.unlock()     // Catch:{ q -> 0x0248 }
            goto L_0x0242
        L_0x0238:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantLock r1 = r11.f265294g     // Catch:{ q -> 0x0248 }
            r1.unlock()     // Catch:{ q -> 0x0248 }
            throw r0     // Catch:{ q -> 0x0248 }
        L_0x023f:
            r11.m156501q()     // Catch:{ q -> 0x0248 }
        L_0x0242:
            int r0 = r12.f265354d     // Catch:{ q -> 0x0248 }
            r11.m156504t(r0)     // Catch:{ q -> 0x0248 }
            return
        L_0x0248:
            r0 = move-exception
            com.google.common.f.e r1 = f265285a
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "BistoGattHelper"
            r1.mo56378ag(r2, r3)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.common.f.x r1 = r1.mo56382g(r0)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            r2 = 17414(0x4406, float:2.4402E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            java.lang.String r2 = "[%s] Operation %s failed: %s"
            com.google.android.apps.gsa.staticplugins.bisto.ac.j.d r3 = r11.f265313z
            java.lang.String r3 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94876ay.m156555d(r3)
            int r12 = r12.f265354d
            java.lang.String r12 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94871at.m156532a(r12)
            java.lang.String r0 = r0.getMessage()
            r1.mo56359L(r2, r3, r12, r0)
            r11.mo88708n()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94868aq.mo88702h(com.google.android.apps.gsa.staticplugins.bisto.ac.a.az):void");
    }

    /* renamed from: i */
    public final void mo88703i() {
        C59104x b = f265285a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoGattHelper");
        ((C59052c) ((C59052c) b).mo56372aa(17416)).mo56389s("[%s] executeNextShutdownOperation", C94876ay.m156555d(this.f265313z));
        C95013d dVar = this.f265313z;
        if (dVar != null) {
            BluetoothManager bluetoothManager = (BluetoothManager) this.f265292e.getSystemService("bluetooth");
            BluetoothGattCharacteristic bluetoothGattCharacteristic = (BluetoothGattCharacteristic) this.f265306s.poll();
            BluetoothDevice bluetoothDevice = dVar.mo88919a().f265818a;
            if (bluetoothGattCharacteristic == null || bluetoothManager == null || bluetoothManager.getConnectionState(bluetoothDevice, 7) != 2) {
                mo88707m();
            } else {
                m156503s(dVar, bluetoothGattCharacteristic, true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo88705k(int i) {
        this.f265309v.execute(new C94895s(this, i));
    }

    /* renamed from: l */
    public final void mo88706l() {
        if (!this.f265302o.get()) {
            C58976aa aaVar = C58975e.f156826a;
            C94876ay.m156555d(this.f265313z);
            return;
        }
        mo88698d();
        try {
            mo88697b().mo88922d();
            new CountDownLatch(1).await(f265287c, TimeUnit.MILLISECONDS);
            this.f265294g.unlock();
        } catch (NoSuchMethodException e) {
            throw new C94893q(String.format(Locale.US, "[%s] Couldn't find refresh method.", new Object[]{C94876ay.m156555d(this.f265313z)}), (Throwable) e);
        } catch (IllegalAccessException e2) {
            throw new C94893q(String.format(Locale.US, "[%s] Invocation target exception", new Object[]{C94876ay.m156555d(this.f265313z)}), (Throwable) e2);
        } catch (InvocationTargetException e3) {
            throw new C94893q(String.format(Locale.US, "[%s] Illegal access exception", new Object[]{C94876ay.m156555d(this.f265313z)}), (Throwable) e3);
        } catch (SecurityException e4) {
            throw new C94893q(String.format(Locale.US, "[%s] Security exception", new Object[]{C94876ay.m156555d(this.f265313z)}), (Throwable) e4);
        } catch (InterruptedException e5) {
            throw new C94893q(String.format(Locale.US, "[%s] Thread interrupted exception", new Object[]{C94876ay.m156555d(this.f265313z)}), (Throwable) e5);
        } catch (Throwable th) {
            this.f265294g.unlock();
            throw th;
        }
    }

    /* renamed from: m */
    public final synchronized void mo88707m() {
        C58976aa aaVar = C58975e.f156826a;
        this.f265307t.size();
        Iterator it = this.f265307t.iterator();
        while (it.hasNext()) {
            ((C60870cx) it.next()).cancel(false);
        }
        this.f265307t.clear();
        if (this.f265308u.getCount() == 0) {
            C59104x d = f265285a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoGattHelper");
            ((C59052c) ((C59052c) d).mo56372aa(17427)).mo56389s("[%s] GATT already released after un-subscribing, doing nothing.", C94876ay.m156555d(this.f265313z));
            return;
        }
        C95013d dVar = this.f265313z;
        this.f265313z = null;
        if (dVar != null) {
            dVar.mo88921c();
            C59104x b = f265285a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoGattHelper");
            ((C59052c) ((C59052c) b).mo56372aa(17426)).mo56389s("[%s] GATT released", C94876ay.m156555d(dVar));
        }
        this.f265298k.set(false);
        this.f265308u.countDown();
        C94875ax axVar = this.f265305r;
        if (axVar != null) {
            axVar.mo88730c();
        }
    }

    /* renamed from: n */
    public final void mo88708n() {
        if (this.f265300m.getAndIncrement() >= 5) {
            this.f265293f.mo88713c(new C94893q(String.format(Locale.US, "[%s] Operation %s failed and retry count exceeded.", new Object[]{C94876ay.m156555d(this.f265313z), C94871at.m156532a(this.f265289A.f265354d)})));
            return;
        }
        synchronized (this.f265311x) {
            this.f265312y = false;
        }
        mo88702h(this.f265289A);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo88709o(boolean z) {
        synchronized (this.f265311x) {
            this.f265312y = true;
            C95013d dVar = this.f265313z;
            if (dVar != null) {
                Iterator it = this.f265306s.iterator();
                while (it.hasNext()) {
                    BluetoothGattCharacteristic bluetoothGattCharacteristic = (BluetoothGattCharacteristic) it.next();
                    if (z) {
                        C58976aa aaVar = C58975e.f156826a;
                        bluetoothGattCharacteristic.getUuid();
                    } else {
                        C58976aa aaVar2 = C58975e.f156826a;
                        bluetoothGattCharacteristic.getUuid();
                    }
                    dVar.mo88924f(bluetoothGattCharacteristic, z);
                }
            }
            this.f265312y = false;
        }
    }

    /* renamed from: p */
    public final boolean mo88710p(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        byte[] value;
        if (bluetoothGattCharacteristic == null || (value = bluetoothGattCharacteristic.getDescriptor(C94872au.f265315b).getValue()) == null || value.length == 0 || Arrays.equals(value, BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final void mo88704j(int i) {
        if (this.f265313z != null) {
            if (i == 1 || i == 2 || i == 3) {
                m156502r();
            } else {
                mo88708n();
            }
        }
    }
}
