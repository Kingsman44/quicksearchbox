package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.p7467a;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94870as;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94934b;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94936d;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94937e;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7476j.C95013d;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.j */
/* compiled from: PG */
public final class C94835j implements C94838m, C94870as, C94934b {

    /* renamed from: a */
    public static final C59071e f265183a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.j");

    /* renamed from: b */
    public static final long f265184b = Duration.ofSeconds(5).toMillis();

    /* renamed from: c */
    final AtomicBoolean f265185c = new AtomicBoolean(false);

    /* renamed from: d */
    public final C94828c f265186d;

    /* renamed from: e */
    public final C94821ai f265187e;

    /* renamed from: f */
    public final C94846u f265188f;

    /* renamed from: g */
    public final C60888db f265189g;

    /* renamed from: h */
    public final C89492cd f265190h;

    /* renamed from: i */
    public final C94815ac f265191i;

    /* renamed from: j */
    public volatile C60870cx f265192j;

    /* renamed from: k */
    private final C58495hd f265193k;

    /* renamed from: l */
    private final C94813aa f265194l;

    /* renamed from: m */
    private C94840o f265195m = new C94834i(this);

    public C94835j(C94828c cVar, C60888db dbVar, C94846u uVar, C89492cd cdVar, C94815ac acVar, C94813aa aaVar) {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(1, new C94834i(this));
        gzVar.mo55429h(2, new C94830e(this));
        gzVar.mo55429h(3, new C94831f(this));
        gzVar.mo55429h(4, new C94829d(this));
        gzVar.mo55429h(5, new C94833h(this));
        this.f265193k = gzVar.mo55427f(false);
        this.f265186d = cVar;
        this.f265187e = cVar.f265165f;
        this.f265189g = dbVar;
        this.f265188f = uVar;
        this.f265190h = cdVar;
        this.f265191i = acVar;
        this.f265194l = aaVar;
        this.f265195m.mo88649b();
    }

    /* renamed from: A */
    public final boolean mo88653A() {
        return this.f265186d.mo88645a("d9f83634-adf5-4cf6-a3c9-cdb149f6469c").mo56113h();
    }

    /* renamed from: D */
    public final void mo88654D() {
        C59104x b = f265183a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsBleConnHandler");
        ((C59052c) ((C59052c) b).mo56372aa(17480)).mo56387q("Shutdown immediately with reason: %d", 6);
        this.f265187e.mo88638g();
        this.f265187e.mo88635d(new C94814ab(this.f265186d));
    }

    /* renamed from: a */
    public final C94937e mo88655a() {
        return null;
    }

    /* renamed from: b */
    public final void mo88656b() {
        String str = (String) C58833ax.m90833j((String) this.f265186d.f265173n.poll()).mo56107c();
        if (str != null) {
            C94828c cVar = this.f265186d;
            C95013d dVar = (C95013d) cVar.f265162c.mo56111f();
            if (dVar == null) {
                C59104x c = C94828c.f265160a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "GacsBleConnection");
                ((C59052c) ((C59052c) c).mo56372aa(17448)).mo56386p("gatt instance is null");
            } else {
                BluetoothManager bluetoothManager = (BluetoothManager) cVar.f265163d.getSystemService("bluetooth");
                BluetoothDevice bluetoothDevice = dVar.mo88919a().f265818a;
                if (bluetoothManager != null && bluetoothManager.getConnectionState(bluetoothDevice, 7) == 2) {
                    this.f265187e.mo88635d(new C94825am(this.f265186d, str, false));
                    return;
                }
            }
        }
        if (this.f265192j != null) {
            this.f265192j.cancel(false);
        }
        this.f265187e.mo88635d(new C94814ab(this.f265186d));
    }

    /* renamed from: c */
    public final void mo88657c(C94936d dVar) {
        C94815ac acVar = this.f265191i;
        C94936d dVar2 = C94936d.CONTROL_INPUT;
        int ordinal = dVar.ordinal();
        if (ordinal == 0) {
            acVar.f265126a.mo88848b();
        } else if (ordinal == 4) {
            acVar.f265127b.mo88848b();
        } else if (ordinal == 6) {
            acVar.f265128c.mo88848b();
        }
    }

    /* renamed from: d */
    public final void mo88658d(C94936d dVar) {
        this.f265194l.f265120b.mo88633b(dVar);
    }

    /* renamed from: e */
    public final void mo88659e(int i) {
        if (!this.f265195m.mo88650c(i)) {
            C59104x b = f265183a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GacsBleConnHandler");
            ((C59052c) ((C59052c) b).mo56372aa(17475)).mo56387q("unable to move to %s", i);
            return;
        }
        C94840o oVar = (C94840o) this.f265193k.get(Integer.valueOf(i));
        oVar.getClass();
        this.f265195m = oVar;
        oVar.mo88649b();
    }

    /* renamed from: f */
    public final void mo88660f(C94851z zVar) {
        if (zVar.f265247a != C94841p.ON_MTU_CHANGED) {
            this.f265195m.mo88651d(zVar);
        }
    }

    /* renamed from: n */
    public final void mo88661n() {
        C59104x b = f265183a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsBleConnHandler");
        ((C59052c) ((C59052c) b).mo56372aa(17476)).mo56386p("Opa enabled");
        this.f265185c.set(true);
        mo88659e(4);
    }

    /* renamed from: q */
    public final void mo88662q(C94936d dVar, Deque deque) {
        int i;
        if (this.f265195m.mo88648a() != 4) {
            C59104x b = f265183a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GacsBleConnHandler");
            ((C59052c) ((C59052c) b).mo56372aa(17477)).mo56386p("Not connected, ignoring write");
            return;
        }
        C94813aa aaVar = this.f265194l;
        if (dVar == C94936d.TTS_OUTPUT) {
            C59104x b2 = C94813aa.f265119a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "GacsGattOutputProcessor");
            ((C59052c) ((C59052c) b2).mo56372aa(17518)).mo56387q("Sending %d TTS packet(s)", deque.size());
            if (aaVar.f265121c.mo88647c()) {
                i = aaVar.f265121c.f265166g.mo19475a();
            } else {
                i = aaVar.f265121c.f265171l.get() - 3;
            }
            byte[] d = C94813aa.m156382d(deque, i);
            while (d.length != 0) {
                if (aaVar.f265121c.mo88647c()) {
                    aaVar.mo88625b(C94936d.TTS_OUTPUT, d);
                } else {
                    aaVar.mo88626c(C94936d.TTS_OUTPUT, d);
                }
                d = C94813aa.m156382d(deque, i);
            }
            return;
        }
        Iterator it = deque.iterator();
        while (it.hasNext()) {
            aaVar.mo88624a(dVar, (byte[]) it.next());
        }
    }

    /* renamed from: s */
    public final void mo88663s(C94936d dVar, byte[] bArr) {
        if (this.f265195m.mo88648a() != 4) {
            C59104x b = f265183a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GacsBleConnHandler");
            ((C59052c) ((C59052c) b).mo56372aa(17478)).mo56386p("Not connected, ignoring write");
            return;
        }
        this.f265194l.mo88624a(dVar, bArr);
    }

    /* renamed from: t */
    public final void mo88664t(int i) {
        C59104x b = f265183a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsBleConnHandler");
        ((C59052c) ((C59052c) b).mo56372aa(17479)).mo56387q("Shutdown with reason: %d", i);
        mo88659e(5);
    }

    /* renamed from: u */
    public final void mo88665u(boolean z, boolean z2, boolean z3) {
        C59104x b = f265183a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsBleConnHandler");
        ((C59052c) ((C59052c) b).mo56372aa(17481)).mo56386p("Start connection");
        this.f265187e.mo88637f(this);
        this.f265186d.f265174o.set(z2);
        this.f265185c.set(z);
        this.f265187e.mo88635d(new C94839n(this.f265186d));
    }
}
