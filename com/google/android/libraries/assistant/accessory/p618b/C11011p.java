package com.google.android.libraries.assistant.accessory.p618b;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.wearable.C146414i;
import com.google.android.gms.wearable.C146532o;
import com.google.assistant.p3739a.p3740a.C48113j;
import com.google.common.base.C58837ba;
import com.google.common.base.C58879cp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60895di;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.assistant.accessory.b.p */
/* compiled from: PG */
public final class C11011p implements AutoCloseable {

    /* renamed from: a */
    public static final C59071e f36175a = C59071e.m91332i("com.google.android.libraries.assistant.accessory.b.p");

    /* renamed from: b */
    public static volatile C11011p f36176b;

    /* renamed from: c */
    public final AtomicInteger f36177c = new AtomicInteger(0);

    /* renamed from: d */
    public final List f36178d;

    /* renamed from: e */
    public final ConcurrentHashMap f36179e;

    /* renamed from: f */
    protected final ScheduledExecutorService f36180f;

    /* renamed from: g */
    protected ScheduledFuture f36181g;

    /* renamed from: h */
    private final ConcurrentHashMap f36182h;

    /* renamed from: i */
    private int f36183i;

    /* renamed from: j */
    private String f36184j;

    /* renamed from: k */
    private final Context f36185k;

    /* renamed from: l */
    private final AtomicInteger f36186l;

    /* renamed from: m */
    private final C60887da f36187m;

    public C11011p(Context context) {
        this.f36185k = context.getApplicationContext();
        this.f36178d = new ArrayList();
        this.f36179e = new ConcurrentHashMap();
        this.f36182h = new ConcurrentHashMap();
        this.f36186l = new AtomicInteger(0);
        this.f36187m = C60895di.m92995a(new C11007l(TimeUnit.MILLISECONDS));
        this.f36183i = 0;
        this.f36180f = new ScheduledThreadPoolExecutor(1);
    }

    /* renamed from: a */
    public final int mo19407a() {
        int incrementAndGet;
        synchronized (this.f36186l) {
            if (this.f36186l.get() >= 100) {
                this.f36186l.set(0);
            }
            incrementAndGet = this.f36186l.incrementAndGet();
        }
        return incrementAndGet;
    }

    /* renamed from: b */
    public final synchronized int mo19408b() {
        return this.f36183i;
    }

    /* renamed from: c */
    public final int mo19409c(String str) {
        if (str == null || !this.f36179e.containsKey(str) || ((C11001f) this.f36179e.get(str)).mo19374c() == null) {
            return 0;
        }
        return ((C11001f) this.f36179e.get(str)).mo19374c().intValue();
    }

    public final void close() {
        C59104x b = f36175a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "RemotePeerStateCommunicator");
        ((C59052c) ((C59052c) b).mo56372aa(42541)).mo56386p("clear communicator");
        this.f36179e.clear();
        this.f36182h.clear();
        this.f36186l.set(0);
        this.f36177c.set(0);
        synchronized (this.f36178d) {
            this.f36178d.clear();
        }
    }

    /* renamed from: d */
    public final C60870cx mo19411d(C11003h hVar) {
        C11004i iVar = new C11004i(hVar, this);
        C59104x b = f36175a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "RemotePeerStateCommunicator");
        ((C59052c) ((C59052c) b).mo56372aa(42540)).mo56359L("RemotePeerStateCommunicator scheduling message : %d, action: %s, device id : %s", hVar.mo19385c(), C11017v.m26075d(hVar.mo19386d().intValue()), hVar.mo19391h());
        return this.f36187m.mo19398a(new C11006k((Callable) iVar, hVar.mo19385c()));
    }

    /* renamed from: e */
    public final Optional mo19412e(String str) {
        if (!this.f36179e.containsKey(str) || ((C11001f) this.f36179e.get(str)).mo19372a() == null) {
            return Optional.empty();
        }
        return Optional.m71637of(((C11001f) this.f36179e.get(str)).mo19372a());
    }

    /* renamed from: f */
    public final Optional mo19413f(String str) {
        if (this.f36182h.containsKey(str)) {
            return Optional.m71637of((String) this.f36182h.get(str));
        }
        return Optional.empty();
    }

    /* renamed from: g */
    public final synchronized String mo19414g() {
        if (C58837ba.m90859h(this.f36184j)) {
            return BuildConfig.FLAVOR;
        }
        return this.f36184j;
    }

    /* renamed from: h */
    public final void mo19415h() {
        for (String i : this.f36179e.keySet()) {
            mo19416i(i);
        }
    }

    /* renamed from: i */
    public final void mo19416i(String str) {
        C60856cj.m92911t(mo19411d(C11017v.m26072a(str, 4, mo19407a(), (Integer) null)), new C11010o(), C60826bg.f164896a);
    }

    /* renamed from: j */
    public final void mo19417j(BluetoothDevice bluetoothDevice, String str) {
        C59104x b = f36175a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "RemotePeerStateCommunicator");
        ((C59052c) ((C59052c) b).mo56372aa(42543)).mo56354G("Register device id : %s, name : %s", str, (bluetoothDevice == null || bluetoothDevice.getName() == null) ? "Unknown Name" : bluetoothDevice.getName());
        if (!this.f36179e.containsKey(str)) {
            ConcurrentHashMap concurrentHashMap = this.f36179e;
            C10996a aVar = new C10996a();
            if (bluetoothDevice != null) {
                aVar.f36145a = bluetoothDevice;
                aVar.f36146b = 0;
                concurrentHashMap.put(str, aVar.mo19370a());
                this.f36182h.put(bluetoothDevice.getAddress(), str);
                return;
            }
            throw new NullPointerException("Null device");
        }
    }

    /* renamed from: k */
    public final void mo19418k() {
        this.f36177c.set(0);
        ScheduledFuture scheduledFuture = this.f36181g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f36181g = null;
        }
    }

    /* renamed from: l */
    public final synchronized void mo19419l(String str) {
        if (!str.equals(this.f36184j)) {
            C59104x b = f36175a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "RemotePeerStateCommunicator");
            ((C59052c) ((C59052c) b).mo56372aa(42544)).mo56386p("Local device ID updated.");
            this.f36184j = str;
        }
    }

    /* renamed from: m */
    public final void mo19420m(C146532o oVar) {
        if (C58837ba.m90859h(this.f36184j)) {
            oVar.mo123263a().mo122499r(new C11009n(this));
        }
    }

    /* renamed from: n */
    public final synchronized void mo19421n(int i) {
        if (this.f36183i != i) {
            this.f36183i = i;
            C59104x b = f36175a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "RemotePeerStateCommunicator");
            ((C59052c) ((C59052c) b).mo56372aa(42545)).mo56389s("Local device state is updated to : %s", C11017v.m26076e(i));
        }
    }

    /* renamed from: o */
    public final void mo19422o(BluetoothDevice bluetoothDevice, int i) {
        C59104x b = f36175a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "RemotePeerStateCommunicator");
        ((C59052c) ((C59052c) b).mo56372aa(42546)).mo56354G("Device [%s] state is updated to : %s", bluetoothDevice.getName(), C11017v.m26076e(i));
        Optional f = mo19413f(bluetoothDevice.getAddress());
        if (f.isPresent()) {
            String str = (String) f.get();
            C11000e b2 = ((C11001f) this.f36179e.get(str)).mo19373b();
            b2.mo19371b(Integer.valueOf(i));
            this.f36179e.put(str, b2.mo19370a());
        }
    }

    /* renamed from: p */
    public final synchronized void mo19423p(int i, C146414i iVar) {
        BluetoothAdapter defaultAdapter;
        C10998c cVar = new C10998c();
        cVar.f36149a = 5;
        cVar.mo19379b(f36176b.mo19414g());
        cVar.f36154f = Integer.valueOf(i);
        cVar.f36155g = Integer.valueOf(f36176b.mo19407a());
        C11003h a = cVar.mo19378a();
        String str = "DEVICE_NAME_UNSPECIFIED";
        if (this.f36185k.checkSelfPermission("android.permission.BLUETOOTH_CONNECT") == 0 && (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) != null && !C58879cp.m90962d(defaultAdapter.getName())) {
            str = defaultAdapter.getName();
        }
        C11017v.m26077f((C48113j) C11017v.m26073b(a, str).toBuilder(), iVar, f36176b, true);
        mo19421n(i);
    }
}
