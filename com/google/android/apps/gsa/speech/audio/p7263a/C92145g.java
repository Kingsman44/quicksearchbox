package com.google.android.apps.gsa.speech.audio.p7263a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import androidx.p060c.C0984n;
import androidx.p128m.p129a.C2399d;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.apps.gsa.shared.util.C90762bf;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.android.apps.gsa.shared.util.permissions.C91076c;
import com.google.android.apps.gsa.speech.audio.p7264b.C92159a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.search.p2904c.C37478d;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.speech.audio.a.g */
/* compiled from: PG */
public final class C92145g extends C92153o implements C92151m {

    /* renamed from: a */
    public static final C59071e f256897a = C59071e.m91332i("com.google.android.apps.gsa.speech.audio.a.g");

    /* renamed from: n */
    private static Map f256898n;

    /* renamed from: b */
    public final AudioManager f256899b;

    /* renamed from: c */
    public final Context f256900c;

    /* renamed from: d */
    public final C58881cr f256901d;

    /* renamed from: e */
    public final C68214a f256902e;

    /* renamed from: f */
    final Object f256903f = new Object();

    /* renamed from: g */
    C92148j f256904g;

    /* renamed from: h */
    final C0984n f256905h = new C0984n(3);

    /* renamed from: i */
    public C92150l f256906i;

    /* renamed from: j */
    C2399d f256907j;

    /* renamed from: k */
    public C37478d f256908k;

    /* renamed from: l */
    public long f256909l;

    /* renamed from: m */
    public final C91123v f256910m;

    /* renamed from: o */
    private final C22871g f256911o;

    /* renamed from: p */
    private boolean f256912p = false;

    /* renamed from: q */
    private int f256913q = 0;

    /* renamed from: r */
    private int f256914r = 10;

    /* renamed from: s */
    private C92149k f256915s;

    /* renamed from: t */
    private boolean f256916t = false;

    public C92145g(C91123v vVar, AudioManager audioManager, Context context, C22871g gVar, C118827a aVar, C68214a aVar2) {
        this.f256910m = vVar;
        this.f256899b = audioManager;
        this.f256900c = context;
        this.f256911o = gVar;
        this.f256902e = aVar2;
        this.f256901d = C58886cw.m90973a(new C92142d(aVar));
    }

    /* renamed from: e */
    public static synchronized String m151261e(int i) {
        synchronized (C92145g.class) {
            if (f256898n == null) {
                C58490gz gzVar = new C58490gz(4);
                gzVar.mo55429h(0, "DEVICE_STATE_UNKNOWN");
                gzVar.mo55429h(1, "DEVICE_STATE_CONNECTED");
                gzVar.mo55429h(2, "DEVICE_STATE_NONE");
                gzVar.mo55429h(10, "SCO_STATE_DISCONNECTED");
                gzVar.mo55429h(11, "SCO_STATE_CONNECTING");
                gzVar.mo55429h(12, "SCO_STATE_CONNECTED");
                f256898n = gzVar.mo55427f(false);
            }
            String str = (String) f256898n.get(Integer.valueOf(i));
            return str != null ? str : "[Illegal value]";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo71725a(Intent intent, C92149k kVar) {
        C22871g gVar = this.f256911o;
        String valueOf = String.valueOf(intent);
        String valueOf2 = String.valueOf(kVar);
        gVar.mo28212l("BluetoothController: onReceive[intent=" + valueOf + ", device=" + valueOf2 + "]", new C92143e(this, intent, kVar));
    }

    /* renamed from: b */
    public final int mo86800b() {
        int i;
        synchronized (this.f256903f) {
            i = this.f256913q;
        }
        return i;
    }

    /* renamed from: c */
    public final int mo86801c() {
        int i;
        synchronized (this.f256903f) {
            i = this.f256914r;
        }
        return i;
    }

    /* renamed from: d */
    public final C92149k mo86802d() {
        C92149k kVar;
        synchronized (this.f256903f) {
            kVar = this.f256913q == 1 ? this.f256915s : null;
        }
        return kVar;
    }

    /* renamed from: f */
    public final void mo86803f(C92146h hVar) {
        synchronized (this.f256903f) {
            this.f256905h.put(hVar, this.f256911o);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ac, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ae, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo86804g() {
        /*
            r7 = this;
            java.lang.Class<com.google.android.apps.gsa.speech.audio.b.a> r0 = com.google.android.apps.gsa.speech.audio.p7264b.C92159a.class
            com.google.android.libraries.gsa.p1876k.C22872h.m42742b(r0)
            java.lang.Object r0 = r7.f256903f
            monitor-enter(r0)
            com.google.android.apps.gsa.speech.audio.a.j r1 = r7.f256904g     // Catch:{ all -> 0x00af }
            if (r1 != 0) goto L_0x00ad
            int r1 = r7.f256913q     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x0012
            goto L_0x00ad
        L_0x0012:
            com.google.android.apps.gsa.shared.util.C90762bf.m148259b()     // Catch:{ all -> 0x00af }
            android.content.Context r1 = r7.f256900c     // Catch:{ all -> 0x00af }
            boolean r1 = com.google.android.apps.gsa.shared.util.permissions.C91076c.m148792a(r1)     // Catch:{ all -> 0x00af }
            if (r1 != 0) goto L_0x002c
            com.google.common.f.e r1 = f256897a     // Catch:{ all -> 0x00af }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "initializeLocked: no Bluetooth permissions on S+"
            r3 = 12098(0x2f42, float:1.6953E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)     // Catch:{ all -> 0x00af }
            goto L_0x00ab
        L_0x002c:
            com.google.android.apps.gsa.speech.audio.a.j r1 = com.google.android.apps.gsa.speech.audio.p7263a.C92154p.m151288a()     // Catch:{ all -> 0x00af }
            r7.f256904g = r1     // Catch:{ all -> 0x00af }
            androidx.m.a.d r1 = r7.f256907j     // Catch:{ all -> 0x00af }
            if (r1 != 0) goto L_0x003e
            android.content.Context r1 = r7.f256900c     // Catch:{ all -> 0x00af }
            androidx.m.a.d r1 = androidx.p128m.p129a.C2399d.m6419a(r1)     // Catch:{ all -> 0x00af }
            r7.f256907j = r1     // Catch:{ all -> 0x00af }
        L_0x003e:
            boolean r1 = r7.f256916t     // Catch:{ all -> 0x00af }
            r2 = 1
            if (r1 != 0) goto L_0x004d
            r7.f256916t = r2     // Catch:{ all -> 0x00af }
            com.google.android.apps.gsa.speech.audio.a.f r1 = new com.google.android.apps.gsa.speech.audio.a.f     // Catch:{ all -> 0x00af }
            r1.<init>(r7)     // Catch:{ all -> 0x00af }
            r7.mo86803f(r1)     // Catch:{ all -> 0x00af }
        L_0x004d:
            com.google.android.apps.gsa.speech.audio.a.j r1 = r7.f256904g     // Catch:{ all -> 0x00af }
            r3 = 2
            if (r1 == 0) goto L_0x009c
            android.media.AudioManager r1 = r7.f256899b     // Catch:{ all -> 0x00af }
            boolean r1 = r1.isBluetoothScoAvailableOffCall()     // Catch:{ all -> 0x00af }
            if (r1 != 0) goto L_0x005b
            goto L_0x009c
        L_0x005b:
            com.google.android.apps.gsa.speech.audio.a.j r1 = r7.f256904g     // Catch:{ all -> 0x00af }
            android.content.Context r4 = r7.f256900c     // Catch:{ all -> 0x00af }
            com.google.android.libraries.gsa.k.g r5 = r7.f256911o     // Catch:{ all -> 0x00af }
            java.lang.Class<com.google.android.apps.gsa.speech.audio.a.m> r6 = com.google.android.apps.gsa.speech.audio.p7263a.C92151m.class
            java.lang.Object r5 = com.google.android.apps.gsa.shared.util.C90768bl.m148268a(r5, r6, r7)     // Catch:{ all -> 0x00af }
            com.google.android.apps.gsa.speech.audio.a.m r5 = (com.google.android.apps.gsa.speech.audio.p7263a.C92151m) r5     // Catch:{ all -> 0x00af }
            boolean r1 = r1.mo86811a(r4, r5)     // Catch:{ all -> 0x00af }
            if (r1 != 0) goto L_0x007f
            com.google.common.f.e r1 = f256897a     // Catch:{ all -> 0x00af }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "BT not available: no headset profile"
            r4 = 12097(0x2f41, float:1.6952E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r4)).mo56386p(r2)     // Catch:{ all -> 0x00af }
            r7.f256913q = r3     // Catch:{ all -> 0x00af }
            goto L_0x00ab
        L_0x007f:
            com.google.android.apps.gsa.speech.audio.a.j r1 = r7.f256904g     // Catch:{ all -> 0x00af }
            android.bluetooth.BluetoothAdapter r1 = r1.f256918a     // Catch:{ all -> 0x00af }
            boolean r1 = r1.isEnabled()     // Catch:{ all -> 0x00af }
            if (r1 != 0) goto L_0x008c
            r7.f256913q = r3     // Catch:{ all -> 0x00af }
            goto L_0x00ab
        L_0x008c:
            com.google.android.apps.gsa.speech.audio.a.j r1 = r7.f256904g     // Catch:{ all -> 0x00af }
            android.bluetooth.BluetoothAdapter r1 = r1.f256918a     // Catch:{ all -> 0x00af }
            int r1 = r1.getProfileConnectionState(r2)     // Catch:{ all -> 0x00af }
            r2 = 3
            if (r1 == r2) goto L_0x0099
            if (r1 != 0) goto L_0x00ab
        L_0x0099:
            r7.f256913q = r3     // Catch:{ all -> 0x00af }
            goto L_0x00ab
        L_0x009c:
            com.google.common.f.e r1 = f256897a     // Catch:{ all -> 0x00af }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "BT not available: no off call adapter"
            r4 = 12094(0x2f3e, float:1.6947E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r4)).mo56386p(r2)     // Catch:{ all -> 0x00af }
            r7.f256913q = r3     // Catch:{ all -> 0x00af }
        L_0x00ab:
            monitor-exit(r0)     // Catch:{ all -> 0x00af }
            return
        L_0x00ad:
            monitor-exit(r0)     // Catch:{ all -> 0x00af }
            return
        L_0x00af:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00af }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.audio.p7263a.C92145g.mo86804g():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo86805h(C92149k kVar) {
        if (C91076c.m148792a(this.f256900c) || kVar == null) {
            ((C59052c) ((C59052c) f256897a.mo56224b()).mo56372aa(12112)).mo56389s("%s", kVar == null ? "No BT device" : "BT device connected");
            C22872h.m42742b(C92159a.class);
            synchronized (this.f256903f) {
                int i = this.f256914r;
                int i2 = this.f256913q;
                int i3 = 0;
                if (kVar == null) {
                    this.f256914r = 10;
                    this.f256913q = 2;
                    this.f256915s = null;
                } else {
                    this.f256915s = kVar;
                    this.f256913q = 1;
                    Intent intent = new Intent("com.google.android.apps.gsa.handsfree.ACTION_DEVICE_CONNECTED");
                    intent.setClassName(this.f256900c, "com.google.android.apps.gsa.broadcastreceiver.CommonBroadcastReceiver");
                    intent.putExtra("com.google.android.apps.gsa.handsfree.EXTRA_DEVICE_ADDRESS", kVar.f256919a.getAddress());
                    this.f256900c.sendBroadcast(intent);
                }
                while (true) {
                    C0984n nVar = this.f256905h;
                    if (i3 < nVar.f3122d) {
                        C92146h hVar = (C92146h) nVar.mo3702e(i3);
                        int i4 = this.f256914r;
                        if (i4 != i) {
                            ((C22871g) this.f256905h.mo3708h(i3)).mo28212l("BluetoothController.setDevice: onScoStateChanged", new C92140b(hVar, i, i4));
                        }
                        int i5 = this.f256913q;
                        if (i5 != i2) {
                            ((C22871g) this.f256905h.mo3708h(i3)).mo28212l("BluetoothController.setDevice: onDeviceStateChanged", new C92141c(hVar, i2, i5));
                        }
                        i3++;
                    }
                }
            }
            return;
        }
        ((C59052c) ((C59052c) f256897a.mo56224b()).mo56372aa(12115)).mo56386p("setDevice: no Bluetooth permissions on S+");
    }

    /* renamed from: i */
    public final void mo86806i(int i) {
        C22872h.m42742b(C92159a.class);
        synchronized (this.f256903f) {
            int i2 = this.f256914r;
            this.f256914r = i;
            if (i != i2) {
                int i3 = 0;
                while (true) {
                    C0984n nVar = this.f256905h;
                    if (i3 >= nVar.f3122d) {
                        break;
                    }
                    ((C22871g) this.f256905h.mo3708h(i3)).mo28212l("BluetoothController.setScoState: onScoStateChanged", new C92139a((C92146h) nVar.mo3702e(i3), i2, i));
                    i3++;
                }
            }
        }
    }

    /* renamed from: j */
    public final void mo86807j() {
        boolean z;
        if (!C91076c.m148792a(this.f256900c)) {
            ((C59052c) ((C59052c) f256897a.mo56224b()).mo56372aa(12129)).mo56386p("stopSco: no Bluetooth permissions on S+");
            return;
        }
        C22872h.m42742b(C92159a.class);
        if (this.f256908k == C37478d.CONNECTION_TYPE_NONE) {
            ((C59052c) ((C59052c) f256897a.mo56225c()).mo56372aa(12128)).mo56386p("stopSco: Invalid connection type, returning");
            return;
        }
        mo86804g();
        C90762bf.m148259b();
        if (mo86801c() != 10) {
            mo86806i(10);
            C59071e eVar = f256897a;
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(12138)).mo56386p("Stopping VR");
            if (!C91076c.m148792a(this.f256900c)) {
                ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(12144)).mo56386p("stopVoiceRecognition: no Bluetooth permissions on S+");
            } else if (this.f256906i == null) {
                ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(12143)).mo56386p("mBluetoothHeadset is null");
            } else if (!this.f256910m.mo85391c() || this.f256908k != C37478d.CONNECTION_TYPE_VIRTUAL_CALL_SCO) {
                if (!this.f256910m.mo85391c() || this.f256908k != C37478d.CONNECTION_TYPE_BVRA) {
                    C92149k d = mo86802d();
                    if (d != null) {
                        z = this.f256906i.mo86821f(d);
                    }
                } else {
                    C92149k d2 = mo86802d();
                    if (d2 != null) {
                        z = this.f256906i.mo86822g(d2);
                    }
                }
                if (z) {
                    return;
                }
            } else {
                this.f256899b.stopBluetoothSco();
                return;
            }
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(12126)).mo56386p("stopSco: stopVoiceRecognition failed");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo86808k(int i) {
        synchronized (this.f256903f) {
            if (i == 12 || i == 1) {
                if (this.f256914r == 11) {
                    ((C118831d) this.f256901d.mo6453a()).mo104025g(((C118831d) this.f256901d.mo6453a()).mo104019a() - this.f256909l);
                    mo86806i(12);
                }
            } else if (i == 10 || i == 0) {
                if (this.f256914r != 10 && i == 0) {
                    mo86807j();
                }
                mo86806i(10);
            } else if (this.f256914r != 11) {
                ((C59052c) ((C59052c) f256897a.mo56226d()).mo56372aa(12104)).mo56386p("Not expecting STATE_AUDIO_CONNECTING");
            }
        }
    }

    /* renamed from: l */
    public final void mo71738l(C92152n nVar) {
        C22872h.m42742b(C92159a.class);
        if (!this.f256912p) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
            intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
            this.f256900c.registerReceiver(this, intentFilter);
            this.f256912p = true;
        }
        if (!C91076c.m148792a(this.f256900c)) {
            ((C59052c) ((C59052c) f256897a.mo56224b()).mo56372aa(12110)).mo56386p("onServiceConnected: no Bluetooth permissions on S+");
            return;
        }
        C92150l lVar = (C92150l) nVar;
        this.f256906i = lVar;
        List b = lVar.mo86817b();
        if (b.isEmpty()) {
            mo86805h((C92149k) null);
            return;
        }
        C92149k kVar = (C92149k) b.get(0);
        if (this.f256906i.mo86816a(kVar) == 2) {
            mo86805h(kVar);
        } else {
            mo86805h((C92149k) null);
        }
    }

    /* renamed from: m */
    public final void mo71739m() {
        C22872h.m42742b(C92159a.class);
        if (this.f256912p) {
            this.f256900c.unregisterReceiver(this);
            this.f256912p = false;
        }
        this.f256906i = null;
        mo86805h((C92149k) null);
    }
}
