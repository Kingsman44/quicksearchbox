package com.google.android.apps.gsa.staticplugins.bisto.p7485c;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.media.AudioManager;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89495cg;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124613af;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124707e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import dagger.C68214a;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.c.x */
/* compiled from: PG */
public final class C95248x implements AutoCloseable, C95241q, C89495cg {

    /* renamed from: a */
    public static final C59071e f266475a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.c.x");

    /* renamed from: b */
    public final Context f266476b;

    /* renamed from: c */
    public final C68214a f266477c;

    /* renamed from: d */
    public final BroadcastReceiver f266478d = new C95244t(this);

    /* renamed from: e */
    public AudioManager f266479e;

    /* renamed from: f */
    volatile C95247w f266480f;

    /* renamed from: g */
    volatile BluetoothDevice f266481g;

    /* renamed from: h */
    public String f266482h;

    /* renamed from: i */
    public SettableFuture f266483i;

    /* renamed from: j */
    public SettableFuture f266484j;

    /* renamed from: k */
    public boolean f266485k;

    /* renamed from: l */
    public boolean f266486l;

    /* renamed from: m */
    public final C95355bf f266487m;

    /* renamed from: n */
    private final C22871g f266488n;

    /* renamed from: o */
    private int f266489o;

    public C95248x(C22871g gVar, Context context, C95850a aVar, C68214a aVar2, C95355bf bfVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f266488n = gVar;
        this.f266476b = context;
        this.f266477c = aVar2;
        this.f266487m = bfVar;
        aVar.f268408a.add(this);
    }

    /* renamed from: a */
    public final synchronized C58833ax mo89136a() {
        return C58836b.f156633a;
    }

    /* renamed from: b */
    public final synchronized C60870cx mo89137b() {
        if (this.f266489o != 1) {
            C59104x c = f266475a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BvraAudioRouteManager");
            ((C59052c) ((C59052c) c).mo56372aa(14745)).mo56387q("Current counter: %d. Forcing switching to default", this.f266489o);
            this.f266489o = 1;
        }
        return mo89140d();
    }

    /* renamed from: c */
    public final synchronized C60870cx mo89138c() {
        this.f266489o++;
        C59104x b = f266475a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BvraAudioRouteManager");
        ((C59052c) ((C59052c) b).mo56372aa(14746)).mo56387q("requestAnnouncementOutput. Counter: %d", this.f266489o);
        if (this.f266489o > 1) {
            SettableFuture settableFuture = this.f266483i;
            if (settableFuture != null) {
                return settableFuture;
            }
            return C118826c.f331423b;
        }
        SettableFuture settableFuture2 = this.f266483i;
        if (settableFuture2 != null) {
            return settableFuture2;
        }
        if (!this.f266486l) {
            return C118826c.f331423b;
        }
        SettableFuture settableFuture3 = this.f266484j;
        if (settableFuture3 == null) {
            if (this.f266485k) {
                return C118826c.f331423b;
            }
        }
        if (settableFuture3 != null) {
            settableFuture3.cancel(false);
            this.f266484j = null;
        }
        this.f266483i = new SettableFuture();
        this.f266488n.mo28212l("switchToSco", new C95243s(this));
        SettableFuture settableFuture4 = this.f266483i;
        settableFuture4.getClass();
        return settableFuture4;
    }

    public final void close() {
        try {
            ((C89492cd) this.f266477c.mo27525b()).mo83379U(this);
            this.f266476b.unregisterReceiver(this.f266478d);
            C95247w wVar = this.f266480f;
            if (wVar != null) {
                if (this.f266481g != null) {
                    wVar.f266474a.stopVoiceRecognition(this.f266481g);
                }
                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                if (defaultAdapter != null) {
                    defaultAdapter.closeProfileProxy(1, wVar.f266474a);
                }
                this.f266480f = null;
            }
            AudioManager audioManager = this.f266479e;
            if (audioManager != null) {
                audioManager.setBluetoothScoOn(false);
                this.f266479e.setMode(0);
            }
        } catch (IllegalArgumentException e) {
            C59104x c = f266475a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BvraAudioRouteManager");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(14750)).mo56386p("Failed to unregister");
        }
    }

    /* renamed from: d */
    public final synchronized C60870cx mo89140d() {
        this.f266489o--;
        C59071e eVar = f266475a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BvraAudioRouteManager");
        ((C59052c) ((C59052c) b).mo56372aa(14747)).mo56387q("requestDefaultOutput. Counter: %d", this.f266489o);
        int i = this.f266489o;
        if (i != 0) {
            if (i < 0) {
                C59104x c = eVar.mo56225c();
                c.mo56378ag(C58975e.f156826a, "BvraAudioRouteManager");
                ((C59052c) ((C59052c) c).mo56372aa(14748)).mo56386p("Counter < 0!");
                this.f266489o = 0;
            }
            SettableFuture settableFuture = this.f266484j;
            if (settableFuture != null) {
                return settableFuture;
            }
            return C118826c.f331423b;
        }
        SettableFuture settableFuture2 = this.f266484j;
        if (settableFuture2 != null) {
            return settableFuture2;
        }
        SettableFuture settableFuture3 = this.f266483i;
        if (settableFuture3 == null) {
            if (!this.f266485k) {
                return C118826c.f331423b;
            }
        }
        if (settableFuture3 != null) {
            settableFuture3.cancel(false);
            this.f266484j = null;
        }
        this.f266484j = new SettableFuture();
        this.f266488n.mo28212l("switchToDefault", new C95242r(this));
        SettableFuture settableFuture4 = this.f266484j;
        settableFuture4.getClass();
        return settableFuture4;
    }

    /* renamed from: e */
    public final synchronized boolean mo89141e() {
        return this.f266485k;
    }

    /* renamed from: fW */
    public final void mo17874fW(String str, Set set, long j, C124548d dVar) {
        if (str.equals(this.f266482h)) {
            synchronized (this) {
                boolean z = false;
                if (C124707e.INPUT_ONLY_MODE.equals(dVar.mo106508g()) && !C124613af.HFP_NOT_USED.equals(dVar.mo106515m())) {
                    z = true;
                }
                this.f266486l = z;
            }
        }
    }
}
