package com.google.android.apps.gsa.nga.engine.p6011e.p6013b.p6015b;

import android.media.AudioAttributes;
import android.media.AudioManager;
import com.google.android.apps.gsa.nga.engine.p6011e.p6013b.p6014a.C75380i;
import com.google.android.apps.gsa.p8889z.p8890a.C118843f;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.gsa.speech.audio.p7263a.C92146h;
import com.google.android.apps.gsa.speech.audio.p7264b.C92159a;
import com.google.android.apps.gsa.staticplugins.p8031m.C102687e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import com.google.android.libraries.search.p2904c.C37478d;
import com.google.android.libraries.search.p2904c.C37520e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.nga.engine.e.b.b.f */
/* compiled from: PG */
public final class C75628f implements C118843f, C92146h {

    /* renamed from: a */
    public static final C59071e f209930a = C59071e.m91332i("com.google.android.apps.gsa.nga.engine.e.b.b.f");

    /* renamed from: b */
    private final C21370a f209931b;

    /* renamed from: c */
    private final C75380i f209932c;

    /* renamed from: d */
    private final AudioManager f209933d;

    /* renamed from: e */
    private final C22871g f209934e;

    /* renamed from: f */
    private final AudioAttributes.Builder f209935f;

    /* renamed from: g */
    private final AudioAttributes.Builder f209936g;

    /* renamed from: h */
    private final Object f209937h = new Object();

    /* renamed from: i */
    private C37520e f209938i = C37520e.ROUTE_NO_AUDIO;

    /* renamed from: j */
    private C37478d f209939j = C37478d.CONNECTION_TYPE_NONE;

    /* renamed from: k */
    private int f209940k = -1;

    /* renamed from: l */
    private boolean f209941l = false;

    /* renamed from: m */
    private boolean f209942m = false;

    /* renamed from: n */
    private int f209943n = 12;

    /* renamed from: o */
    private String f209944o;

    /* renamed from: p */
    private long f209945p;

    /* renamed from: q */
    private int f209946q = 150;

    /* renamed from: r */
    private boolean f209947r;

    /* renamed from: s */
    private final C91142g f209948s;

    /* renamed from: t */
    private C102687e f209949t = null;

    public C75628f(C21370a aVar, AudioManager audioManager, C22871g gVar, C75380i iVar, C91142g gVar2) {
        this.f209931b = aVar;
        this.f209933d = audioManager;
        this.f209932c = iVar;
        this.f209934e = gVar;
        this.f209948s = gVar2;
        this.f209935f = new AudioAttributes.Builder().setContentType(1).setUsage(2);
        this.f209936g = new AudioAttributes.Builder().setContentType(2).setUsage(12);
        iVar.mo71731e(this);
    }

    /* renamed from: A */
    private static boolean m121836A(C37520e eVar) {
        return eVar == C37520e.ROUTE_BLUETOOTH_PREFERRED || eVar == C37520e.ROUTE_BLUETOOTH_REQUIRED;
    }

    /* renamed from: z */
    private final void m121837z() {
        if (this.f209932c.mo71729b() != 12) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        long f = ((long) (this.f209939j == C37478d.CONNECTION_TYPE_BVRA ? this.f209939j == C37478d.CONNECTION_TYPE_BVRA ? this.f209946q : SimpleSnackbar.LENGTH_SHORT : 0)) - (this.f209931b.mo26874f() - this.f209945p);
        C58976aa aaVar2 = C58975e.f156826a;
        if (f > 0) {
            long c = this.f209931b.mo26871c() + f;
            while (true) {
                try {
                    long c2 = c - this.f209931b.mo26871c();
                    if (c2 > 0) {
                        this.f209937h.wait(c2);
                    } else {
                        return;
                    }
                } catch (InterruptedException e) {
                    C59104x d = f209930a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "NgaAudioRouter");
                    ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(3013)).mo56386p("Thread was interrupted, aborting await");
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo71726a(int i, int i2) {
        C22872h.m42742b(C92159a.class);
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f209937h) {
            if (mo71760u()) {
                if (i2 == 10) {
                    if (!this.f209941l) {
                        this.f209941l = true;
                        if (i == 12) {
                            C59104x b = f209930a.mo56224b();
                            b.mo56378ag(C58975e.f156826a, "NgaAudioRouter");
                            ((C59052c) ((C59052c) b).mo56372aa(3018)).mo56386p("BT route lost");
                            C102687e eVar = this.f209949t;
                            if (eVar != null) {
                                C22871g gVar = this.f209934e;
                                Objects.requireNonNull(eVar);
                                gVar.mo28212l("onScoStateChanged: onRouteLost", new C75385b(eVar));
                            }
                        } else if (i == 11) {
                            C59104x b2 = f209930a.mo56224b();
                            b2.mo56378ag(C58975e.f156826a, "NgaAudioRouter");
                            ((C59052c) ((C59052c) b2).mo56372aa(3017)).mo56386p("BT connection failed");
                        }
                    }
                } else if (i2 == 12 && i == 11) {
                    this.f209945p = this.f209931b.mo26874f();
                }
            }
            mo71757r();
            this.f209937h.notify();
        }
    }

    /* renamed from: b */
    public final void mo71727b(int i, int i2) {
        C22872h.m42742b(C92159a.class);
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f209937h) {
            mo71757r();
            this.f209937h.notify();
        }
    }

    /* renamed from: c */
    public final int mo71742c() {
        if (this.f209940k != -1) {
            C58976aa aaVar = C58975e.f156826a;
            return this.f209940k;
        } else if (this.f209933d.isBluetoothScoOn()) {
            C58976aa aaVar2 = C58975e.f156826a;
            return 3;
        } else if (this.f209933d.isWiredHeadsetOn()) {
            C58976aa aaVar3 = C58975e.f156826a;
            return 2;
        } else {
            C58976aa aaVar4 = C58975e.f156826a;
            return 1;
        }
    }

    /* renamed from: d */
    public final int mo71743d() {
        return mo71763x();
    }

    /* renamed from: e */
    public final int mo71744e() {
        return this.f209933d.getStreamVolume(mo71763x());
    }

    /* renamed from: f */
    public final AudioAttributes mo71745f() {
        return mo71764y();
    }

    /* renamed from: g */
    public final C37520e mo71746g() {
        C37520e eVar;
        synchronized (this.f209937h) {
            eVar = this.f209938i;
        }
        return eVar;
    }

    /* renamed from: h */
    public final void mo71747h(String str) {
        String str2;
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f209937h) {
            if (this.f209943n == 10 && (str2 = this.f209944o) != null && str2.equals(str)) {
                this.f209943n = 11;
                this.f209937h.notify();
            }
        }
    }

    /* renamed from: i */
    public final void mo71748i(int i) {
        if (this.f209947r) {
            this.f209934e.mo28212l("Enhance audio session", new C75384a(i));
        }
    }

    /* renamed from: j */
    public final void mo71749j(boolean z) {
    }

    /* renamed from: k */
    public final void mo71750k() {
    }

    /* renamed from: l */
    public final void mo71751l(boolean z) {
    }

    /* renamed from: m */
    public final void mo71752m() {
    }

    /* renamed from: n */
    public final void mo71753n(boolean z) {
        this.f209947r = z;
    }

    /* renamed from: o */
    public final void mo71754o(int i) {
        C58976aa aaVar = C58975e.f156826a;
        this.f209946q = i;
    }

    /* renamed from: p */
    public final void mo71755p(int i) {
        this.f209940k = i;
    }

    /* renamed from: q */
    public final void mo71756q(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0172, code lost:
        return;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo71757r() {
        /*
            r8 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.Class<com.google.android.apps.gsa.speech.audio.b.a> r0 = com.google.android.apps.gsa.speech.audio.p7264b.C92159a.class
            com.google.android.libraries.gsa.p1876k.C22872h.m42742b(r0)
            java.lang.Object r0 = r8.f209937h
            monitor-enter(r0)
            boolean r1 = r8.f209942m     // Catch:{ all -> 0x0173 }
            r2 = 0
            if (r1 == 0) goto L_0x0016
            r8.f209942m = r2     // Catch:{ all -> 0x0173 }
            java.lang.Object r1 = r8.f209937h     // Catch:{ all -> 0x0173 }
            r1.notify()     // Catch:{ all -> 0x0173 }
        L_0x0016:
            boolean r1 = r8.mo71760u()     // Catch:{ all -> 0x0173 }
            r3 = 10
            if (r1 == 0) goto L_0x0148
            com.google.android.apps.gsa.nga.engine.e.b.a.i r1 = r8.f209932c     // Catch:{ all -> 0x0173 }
            r1.mo71732f()     // Catch:{ all -> 0x0173 }
            boolean r1 = r8.f209941l     // Catch:{ all -> 0x0173 }
            if (r1 == 0) goto L_0x0029
            monitor-exit(r0)     // Catch:{ all -> 0x0173 }
            return
        L_0x0029:
            com.google.android.apps.gsa.nga.engine.e.b.a.i r1 = r8.f209932c     // Catch:{ all -> 0x0173 }
            int r1 = r1.mo71729b()     // Catch:{ all -> 0x0173 }
            if (r1 != r3) goto L_0x0171
            com.google.android.apps.gsa.nga.engine.e.b.a.i r1 = r8.f209932c     // Catch:{ all -> 0x0173 }
            int r1 = r1.mo71728a()     // Catch:{ all -> 0x0173 }
            r4 = 1
            if (r1 != r4) goto L_0x0171
            com.google.common.f.e r1 = f209930a     // Catch:{ all -> 0x0173 }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x0173 }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0173 }
            java.lang.String r6 = "NgaAudioRouter"
            r1.mo56378ag(r5, r6)     // Catch:{ all -> 0x0173 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0173 }
            r5 = 3027(0xbd3, float:4.242E-42)
            com.google.common.f.x r1 = r1.mo56372aa(r5)     // Catch:{ all -> 0x0173 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0173 }
            java.lang.String r5 = "BT required, starting SCO"
            r1.mo56386p(r5)     // Catch:{ all -> 0x0173 }
            com.google.android.apps.gsa.nga.engine.e.b.a.i r1 = r8.f209932c     // Catch:{ all -> 0x0173 }
            com.google.android.libraries.search.c.d r5 = r8.f209939j     // Catch:{ all -> 0x0173 }
            android.content.Context r6 = r1.f209898b     // Catch:{ all -> 0x0173 }
            boolean r6 = com.google.android.apps.gsa.shared.util.permissions.C91076c.m148792a(r6)     // Catch:{ all -> 0x0173 }
            if (r6 != 0) goto L_0x0071
            com.google.common.f.e r1 = com.google.android.apps.gsa.nga.engine.p6011e.p6013b.p6014a.C75380i.f209896a     // Catch:{ all -> 0x0173 }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x0173 }
            java.lang.String r2 = "startSco: no Bluetooth permissions on S+"
            r3 = 2962(0xb92, float:4.15E-42)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)     // Catch:{ all -> 0x0173 }
            goto L_0x0171
        L_0x0071:
            java.lang.Class<com.google.android.apps.gsa.speech.audio.b.a> r6 = com.google.android.apps.gsa.speech.audio.p7264b.C92159a.class
            com.google.android.libraries.gsa.p1876k.C22872h.m42742b(r6)     // Catch:{ all -> 0x0173 }
            r1.f209909m = r5     // Catch:{ all -> 0x0173 }
            com.google.android.libraries.search.c.d r6 = com.google.android.libraries.search.p2904c.C37478d.CONNECTION_TYPE_NONE     // Catch:{ all -> 0x0173 }
            if (r5 != r6) goto L_0x008b
            com.google.common.f.e r1 = com.google.android.apps.gsa.nga.engine.p6011e.p6013b.p6014a.C75380i.f209896a     // Catch:{ all -> 0x0173 }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ all -> 0x0173 }
            java.lang.String r2 = "startSco: Invalid connection type, returning"
            r3 = 2961(0xb91, float:4.149E-42)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)     // Catch:{ all -> 0x0173 }
            goto L_0x0171
        L_0x008b:
            r1.mo71732f()     // Catch:{ all -> 0x0173 }
            com.google.android.apps.gsa.shared.util.C90762bf.m148259b()     // Catch:{ all -> 0x0173 }
            int r5 = r1.mo71729b()     // Catch:{ all -> 0x0173 }
            if (r5 != r3) goto L_0x0171
            r5 = 11
            r1.mo71734h(r5)     // Catch:{ all -> 0x0173 }
            com.google.common.f.e r5 = com.google.android.apps.gsa.nga.engine.p6011e.p6013b.p6014a.C75380i.f209896a     // Catch:{ all -> 0x0173 }
            com.google.common.f.x r5 = r5.mo56224b()     // Catch:{ all -> 0x0173 }
            java.lang.String r6 = "Starting VR"
            r7 = 2969(0xb99, float:4.16E-42)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r7)).mo56386p(r6)     // Catch:{ all -> 0x0173 }
            android.content.Context r5 = r1.f209898b     // Catch:{ all -> 0x0173 }
            boolean r5 = com.google.android.apps.gsa.shared.util.permissions.C91076c.m148792a(r5)     // Catch:{ all -> 0x0173 }
            if (r5 != 0) goto L_0x00bf
            com.google.common.f.e r4 = com.google.android.apps.gsa.nga.engine.p6011e.p6013b.p6014a.C75380i.f209896a     // Catch:{ all -> 0x0173 }
            com.google.common.f.x r4 = r4.mo56224b()     // Catch:{ all -> 0x0173 }
            java.lang.String r5 = "startVoiceRecognition: no Bluetooth permissions on S+"
            r6 = 2976(0xba0, float:4.17E-42)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r6)).mo56386p(r5)     // Catch:{ all -> 0x0173 }
            goto L_0x0124
        L_0x00bf:
            com.google.android.apps.gsa.speech.audio.a.l r5 = r1.f209908l     // Catch:{ all -> 0x0173 }
            if (r5 != 0) goto L_0x00d1
            com.google.common.f.e r4 = com.google.android.apps.gsa.nga.engine.p6011e.p6013b.p6014a.C75380i.f209896a     // Catch:{ all -> 0x0173 }
            com.google.common.f.x r4 = r4.mo56226d()     // Catch:{ all -> 0x0173 }
            java.lang.String r5 = "mBluetoothHeadset is null"
            r6 = 2975(0xb9f, float:4.169E-42)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r6)).mo56386p(r5)     // Catch:{ all -> 0x0173 }
            goto L_0x0124
        L_0x00d1:
            com.google.android.apps.gsa.shared.util.v r5 = r1.f209910n     // Catch:{ all -> 0x0173 }
            boolean r5 = r5.mo85391c()     // Catch:{ all -> 0x0173 }
            if (r5 == 0) goto L_0x00e8
            com.google.android.libraries.search.c.d r5 = r1.f209909m     // Catch:{ all -> 0x0173 }
            com.google.android.libraries.search.c.d r6 = com.google.android.libraries.search.p2904c.C37478d.CONNECTION_TYPE_VIRTUAL_CALL_SCO     // Catch:{ all -> 0x0173 }
            if (r5 != r6) goto L_0x00e8
            com.google.android.apps.gsa.nga.engine.e.b.a.j r2 = r1.f209900d     // Catch:{ all -> 0x0173 }
            android.media.AudioManager r2 = r2.f209916a     // Catch:{ all -> 0x0173 }
            r2.startBluetoothSco()     // Catch:{ all -> 0x0173 }
            r2 = 1
            goto L_0x0124
        L_0x00e8:
            com.google.android.apps.gsa.shared.util.v r4 = r1.f209910n     // Catch:{ all -> 0x0173 }
            boolean r4 = r4.mo85391c()     // Catch:{ all -> 0x0173 }
            if (r4 == 0) goto L_0x0117
            com.google.android.libraries.search.c.d r4 = r1.f209909m     // Catch:{ all -> 0x0173 }
            com.google.android.libraries.search.c.d r5 = com.google.android.libraries.search.p2904c.C37478d.CONNECTION_TYPE_BVRA     // Catch:{ all -> 0x0173 }
            if (r4 != r5) goto L_0x0117
            com.google.android.apps.gsa.speech.audio.a.k r4 = r1.mo71730c()     // Catch:{ all -> 0x0173 }
            if (r4 != 0) goto L_0x00fd
            goto L_0x0124
        L_0x00fd:
            com.google.android.apps.gsa.shared.util.v.g r5 = r1.f209901e     // Catch:{ all -> 0x0173 }
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251108cb     // Catch:{ all -> 0x0173 }
            boolean r5 = r5.mo85405j(r6)     // Catch:{ all -> 0x0173 }
            if (r5 == 0) goto L_0x0110
            com.google.android.apps.gsa.speech.audio.a.l r5 = r1.f209908l     // Catch:{ all -> 0x0173 }
            boolean r5 = r5.mo86818c(r4)     // Catch:{ all -> 0x0173 }
            if (r5 != 0) goto L_0x0110
            goto L_0x0124
        L_0x0110:
            com.google.android.apps.gsa.speech.audio.a.l r2 = r1.f209908l     // Catch:{ all -> 0x0173 }
            boolean r2 = r2.mo86820e(r4)     // Catch:{ all -> 0x0173 }
            goto L_0x0124
        L_0x0117:
            com.google.android.apps.gsa.speech.audio.a.k r4 = r1.mo71730c()     // Catch:{ all -> 0x0173 }
            if (r4 != 0) goto L_0x011e
            goto L_0x0124
        L_0x011e:
            com.google.android.apps.gsa.speech.audio.a.l r2 = r1.f209908l     // Catch:{ all -> 0x0173 }
            boolean r2 = r2.mo86819d(r4)     // Catch:{ all -> 0x0173 }
        L_0x0124:
            com.google.common.f.e r4 = com.google.android.apps.gsa.nga.engine.p6011e.p6013b.p6014a.C75380i.f209896a     // Catch:{ all -> 0x0173 }
            com.google.common.f.x r4 = r4.mo56224b()     // Catch:{ all -> 0x0173 }
            java.lang.String r5 = "startSco: startVoiceRecognition returned %b"
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0173 }
            r7 = 2957(0xb8d, float:4.144E-42)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r7)).mo56389s(r5, r6)     // Catch:{ all -> 0x0173 }
            if (r2 != 0) goto L_0x0171
            com.google.common.f.e r2 = com.google.android.apps.gsa.nga.engine.p6011e.p6013b.p6014a.C75380i.f209896a     // Catch:{ all -> 0x0173 }
            com.google.common.f.x r2 = r2.mo56224b()     // Catch:{ all -> 0x0173 }
            java.lang.String r4 = "startSco: startVoiceRecognition failed"
            r5 = 2959(0xb8f, float:4.146E-42)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56386p(r4)     // Catch:{ all -> 0x0173 }
            r1.mo71734h(r3)     // Catch:{ all -> 0x0173 }
            goto L_0x0171
        L_0x0148:
            com.google.android.apps.gsa.nga.engine.e.b.a.i r1 = r8.f209932c     // Catch:{ all -> 0x0173 }
            int r1 = r1.mo71729b()     // Catch:{ all -> 0x0173 }
            if (r1 == r3) goto L_0x0171
            com.google.common.f.e r1 = f209930a     // Catch:{ all -> 0x0173 }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x0173 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0173 }
            java.lang.String r3 = "NgaAudioRouter"
            r1.mo56378ag(r2, r3)     // Catch:{ all -> 0x0173 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0173 }
            r2 = 3024(0xbd0, float:4.238E-42)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x0173 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0173 }
            java.lang.String r2 = "BT not required, stopping SCO"
            r1.mo56386p(r2)     // Catch:{ all -> 0x0173 }
            com.google.android.apps.gsa.nga.engine.e.b.a.i r1 = r8.f209932c     // Catch:{ all -> 0x0173 }
            r1.mo71735i()     // Catch:{ all -> 0x0173 }
        L_0x0171:
            monitor-exit(r0)     // Catch:{ all -> 0x0173 }
            return
        L_0x0173:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0173 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6011e.p6013b.p6015b.C75628f.mo71757r():void");
    }

    /* renamed from: s */
    public final boolean mo71758s() {
        return this.f209947r;
    }

    /* renamed from: t */
    public final boolean mo71759t() {
        return (mo71760u() && this.f209932c.mo71729b() == 12) || this.f209933d.isBluetoothA2dpOn();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final boolean mo71760u() {
        boolean A;
        synchronized (this.f209937h) {
            A = m121836A(this.f209938i);
        }
        return A;
    }

    /* renamed from: v */
    public final void mo71761v(C37520e eVar, C37478d dVar, C102687e eVar2) {
        C58976aa aaVar = C58975e.f156826a;
        if (m121836A(eVar) && dVar == C37478d.CONNECTION_TYPE_NONE) {
            C59104x c = f209930a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "NgaAudioRouter");
            ((C59052c) ((C59052c) c).mo56372aa(3032)).mo56386p("CONNECTION_TYPE_NONE for BT route, forcing BT off.");
            eVar = C37520e.ROUTE_NO_BLUETOOTH;
        }
        synchronized (this.f209937h) {
            this.f209949t = eVar2;
            if (dVar == C37478d.CONNECTION_TYPE_ANY) {
                dVar = C37478d.CONNECTION_TYPE_NONE;
            }
            if (!(eVar == this.f209938i && dVar == this.f209939j)) {
                C59104x b = f209930a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "NgaAudioRouter");
                ((C59052c) ((C59052c) b).mo56372aa(3030)).mo56360M("Route changed: %s->%s,%s->%s", this.f209938i, eVar, this.f209939j, dVar);
                if (!m121836A(this.f209938i) && m121836A(eVar)) {
                    this.f209941l = false;
                }
                this.f209938i = eVar;
                this.f209939j = dVar;
                this.f209942m = true;
                this.f209934e.mo28212l("updateRoute: synchronizeBluetoothState", new C75387d(this));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x021f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01f0, code lost:
        return;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo71762w(java.lang.String r21) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.Class<com.google.android.apps.gsa.speech.audio.b.a> r2 = com.google.android.apps.gsa.speech.audio.p7264b.C92159a.class
            boolean r2 = com.google.android.libraries.gsa.p1876k.C22872h.m42744d(r2)
            r3 = 1
            r2 = r2 ^ r3
            com.google.common.base.C58838bb.m90883r(r2)
            java.lang.Class<androidx.annotation.b> r2 = androidx.annotation.C0826b.class
            boolean r2 = com.google.android.libraries.gsa.p1876k.C22872h.m42744d(r2)
            r2 = r2 ^ r3
            com.google.common.base.C58838bb.m90883r(r2)
            com.google.android.apps.gsa.shared.util.bf r2 = com.google.android.apps.gsa.shared.util.C90762bf.m148259b()
            java.lang.Object r4 = r1.f209937h
            monitor-enter(r4)
            r5 = 2000(0x7d0, double:9.88E-321)
            boolean r7 = r20.mo71760u()     // Catch:{ all -> 0x0222 }
            if (r7 == 0) goto L_0x01f7
            r7 = 0
            r8 = 12
            int r9 = r1.f209943n     // Catch:{ all -> 0x01f1 }
            r10 = 10
            r11 = 11
            if (r9 == r8) goto L_0x007b
            com.google.common.f.e r3 = f209930a     // Catch:{ all -> 0x01f1 }
            com.google.common.f.x r3 = r3.mo56224b()     // Catch:{ all -> 0x01f1 }
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01f1 }
            java.lang.String r12 = "NgaAudioRouter"
            r3.mo56378ag(r9, r12)     // Catch:{ all -> 0x01f1 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x01f1 }
            r9 = 3042(0xbe2, float:4.263E-42)
            com.google.common.f.x r3 = r3.mo56372aa(r9)     // Catch:{ all -> 0x01f1 }
            r12 = r3
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12     // Catch:{ all -> 0x01f1 }
            java.lang.String r13 = "awaitBluetoothRoutingLocked: mAwaitState=%d. Was expecting AWAIT_STATE_NONE(%d). Other states are AWAITING(%s) and CANCELLED(%d). mAwaitToken = %s, requested token = %s"
            int r3 = r1.f209943n     // Catch:{ all -> 0x01f1 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01f1 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x01f1 }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x01f1 }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x01f1 }
            java.lang.String r3 = r1.f209944o     // Catch:{ all -> 0x01f1 }
            if (r3 != 0) goto L_0x0067
            java.lang.String r3 = "(null)"
        L_0x0067:
            r18 = r3
            java.lang.String r3 = "(null)"
            if (r0 != 0) goto L_0x0070
            r19 = r3
            goto L_0x0072
        L_0x0070:
            r19 = r0
        L_0x0072:
            r12.mo56362O(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x01f1 }
            r1.f209943n = r8     // Catch:{ all -> 0x0222 }
            r1.f209944o = r7     // Catch:{ all -> 0x0222 }
            goto L_0x01c8
        L_0x007b:
            r1.f209943n = r10     // Catch:{ all -> 0x01f1 }
            r1.f209944o = r0     // Catch:{ all -> 0x01f1 }
            com.google.android.apps.gsa.nga.engine.e.b.a.i r0 = r1.f209932c     // Catch:{ all -> 0x01f1 }
            int r0 = r0.mo71729b()     // Catch:{ all -> 0x01f1 }
            if (r0 != r8) goto L_0x008d
            r1.f209943n = r8     // Catch:{ all -> 0x0222 }
            r1.f209944o = r7     // Catch:{ all -> 0x0222 }
            goto L_0x01c8
        L_0x008d:
            boolean r0 = r1.f209941l     // Catch:{ all -> 0x01f1 }
            if (r0 == 0) goto L_0x00b5
            com.google.common.f.e r0 = f209930a     // Catch:{ all -> 0x01f1 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x01f1 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01f1 }
            java.lang.String r9 = "NgaAudioRouter"
            r0.mo56378ag(r3, r9)     // Catch:{ all -> 0x01f1 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x01f1 }
            r3 = 3040(0xbe0, float:4.26E-42)
            com.google.common.f.x r0 = r0.mo56372aa(r3)     // Catch:{ all -> 0x01f1 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x01f1 }
            java.lang.String r3 = "SCO connection has failed"
            r0.mo56386p(r3)     // Catch:{ all -> 0x01f1 }
            com.google.android.libraries.search.c.e r0 = com.google.android.libraries.search.p2904c.C37520e.ROUTE_BLUETOOTH_REQUIRED     // Catch:{ all -> 0x01f1 }
            r1.f209943n = r8     // Catch:{ all -> 0x0222 }
            r1.f209944o = r7     // Catch:{ all -> 0x0222 }
            goto L_0x01c8
        L_0x00b5:
            com.google.android.libraries.search.c.e r0 = r1.f209938i     // Catch:{ all -> 0x01f1 }
            com.google.android.libraries.search.c.e r9 = com.google.android.libraries.search.p2904c.C37520e.ROUTE_BLUETOOTH_REQUIRED     // Catch:{ all -> 0x01f1 }
            if (r0 != r9) goto L_0x00be
            r12 = 1000(0x3e8, double:4.94E-321)
            goto L_0x00c0
        L_0x00be:
            r12 = 200(0xc8, double:9.9E-322)
        L_0x00c0:
            com.google.android.libraries.f.a r0 = r1.f209931b     // Catch:{ all -> 0x01f1 }
            long r14 = r0.mo26874f()     // Catch:{ all -> 0x01f1 }
            long r14 = r14 + r12
        L_0x00c7:
            com.google.android.apps.gsa.nga.engine.e.b.a.i r0 = r1.f209932c     // Catch:{ all -> 0x01f1 }
            int r0 = r0.mo71728a()     // Catch:{ all -> 0x01f1 }
            r16 = 0
            if (r0 != 0) goto L_0x00fe
            int r0 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00fe
            int r0 = r1.f209943n     // Catch:{ all -> 0x01f1 }
            if (r0 == r11) goto L_0x00fe
            java.lang.Object r0 = r1.f209937h     // Catch:{ InterruptedException -> 0x00e7 }
            r0.wait(r12)     // Catch:{ InterruptedException -> 0x00e7 }
            com.google.android.libraries.f.a r0 = r1.f209931b     // Catch:{ all -> 0x01f1 }
            long r12 = r0.mo26874f()     // Catch:{ all -> 0x01f1 }
            long r12 = r14 - r12
            goto L_0x00c7
        L_0x00e7:
            r0 = move-exception
            com.google.common.f.e r3 = f209930a     // Catch:{ all -> 0x01f1 }
            com.google.common.f.x r3 = r3.mo56226d()     // Catch:{ all -> 0x01f1 }
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01f1 }
            java.lang.String r10 = "NgaAudioRouter"
            r3.mo56378ag(r9, r10)     // Catch:{ all -> 0x01f1 }
            java.lang.String r9 = "Thread was interrupted, aborting await"
            r10 = 3038(0xbde, float:4.257E-42)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r0)).mo56372aa(r10)).mo56386p(r9)     // Catch:{ all -> 0x01f1 }
            goto L_0x01c4
        L_0x00fe:
            int r0 = r1.f209943n     // Catch:{ all -> 0x01f1 }
            if (r0 != r11) goto L_0x0104
            goto L_0x01c4
        L_0x0104:
            com.google.android.apps.gsa.nga.engine.e.b.a.i r0 = r1.f209932c     // Catch:{ all -> 0x01f1 }
            int r0 = r0.mo71728a()     // Catch:{ all -> 0x01f1 }
            com.google.android.apps.gsa.nga.engine.e.b.a.i r9 = r1.f209932c     // Catch:{ all -> 0x01f1 }
            com.google.android.apps.gsa.speech.audio.a.k r9 = r9.mo71730c()     // Catch:{ all -> 0x01f1 }
            if (r0 != 0) goto L_0x012a
            com.google.common.f.e r0 = f209930a     // Catch:{ all -> 0x01f1 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x01f1 }
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01f1 }
            java.lang.String r10 = "NgaAudioRouter"
            r0.mo56378ag(r9, r10)     // Catch:{ all -> 0x01f1 }
            java.lang.String r9 = "Timed out waiting for BT device state"
            r10 = 3035(0xbdb, float:4.253E-42)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r10)).mo56386p(r9)     // Catch:{ all -> 0x01f1 }
            r1.f209941l = r3     // Catch:{ all -> 0x01f1 }
            goto L_0x01c4
        L_0x012a:
            r12 = 2
            if (r0 == r12) goto L_0x01c4
            if (r9 == 0) goto L_0x01c4
            com.google.android.libraries.f.a r0 = r1.f209931b     // Catch:{ all -> 0x01f1 }
            long r12 = r0.mo26874f()     // Catch:{ all -> 0x01f1 }
            long r12 = r12 + r5
            r14 = r5
        L_0x0137:
            com.google.android.apps.gsa.nga.engine.e.b.a.i r0 = r1.f209932c     // Catch:{ all -> 0x01f1 }
            int r0 = r0.mo71729b()     // Catch:{ all -> 0x01f1 }
            if (r0 == r11) goto L_0x0143
            boolean r0 = r1.f209942m     // Catch:{ all -> 0x01f1 }
            if (r0 == 0) goto L_0x016f
        L_0x0143:
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x016f
            int r0 = r1.f209943n     // Catch:{ all -> 0x01f1 }
            if (r0 == r11) goto L_0x016f
            java.lang.Object r0 = r1.f209937h     // Catch:{ InterruptedException -> 0x0159 }
            r0.wait(r14)     // Catch:{ InterruptedException -> 0x0159 }
            com.google.android.libraries.f.a r0 = r1.f209931b     // Catch:{ all -> 0x01f1 }
            long r14 = r0.mo26874f()     // Catch:{ all -> 0x01f1 }
            long r14 = r12 - r14
            goto L_0x0137
        L_0x0159:
            r0 = move-exception
            com.google.common.f.e r3 = f209930a     // Catch:{ all -> 0x01f1 }
            com.google.common.f.x r3 = r3.mo56226d()     // Catch:{ all -> 0x01f1 }
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01f1 }
            java.lang.String r10 = "NgaAudioRouter"
            r3.mo56378ag(r9, r10)     // Catch:{ all -> 0x01f1 }
            java.lang.String r9 = "Thread was interrupted, aborting await"
            r10 = 3048(0xbe8, float:4.271E-42)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r0)).mo56372aa(r10)).mo56386p(r9)     // Catch:{ all -> 0x01f1 }
            goto L_0x01ba
        L_0x016f:
            int r0 = r1.f209943n     // Catch:{ all -> 0x01f1 }
            if (r0 != r11) goto L_0x0174
            goto L_0x01ba
        L_0x0174:
            com.google.android.apps.gsa.nga.engine.e.b.a.i r0 = r1.f209932c     // Catch:{ all -> 0x01f1 }
            int r0 = r0.mo71729b()     // Catch:{ all -> 0x01f1 }
            if (r0 != r11) goto L_0x01a4
            com.google.common.f.e r0 = f209930a     // Catch:{ all -> 0x01f1 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x01f1 }
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01f1 }
            java.lang.String r10 = "NgaAudioRouter"
            r0.mo56378ag(r9, r10)     // Catch:{ all -> 0x01f1 }
            java.lang.String r9 = "SCO connection timed out"
            r10 = 3045(0xbe5, float:4.267E-42)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r10)).mo56386p(r9)     // Catch:{ all -> 0x01f1 }
            r1.f209941l = r3     // Catch:{ all -> 0x01f1 }
            com.google.android.libraries.gsa.k.g r0 = r1.f209934e     // Catch:{ all -> 0x01f1 }
            com.google.android.apps.gsa.nga.engine.e.b.a.i r3 = r1.f209932c     // Catch:{ all -> 0x01f1 }
            p3186j$.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x01f1 }
            com.google.android.apps.gsa.nga.engine.e.b.b.c r9 = new com.google.android.apps.gsa.nga.engine.e.b.b.c     // Catch:{ all -> 0x01f1 }
            r9.<init>(r3)     // Catch:{ all -> 0x01f1 }
            java.lang.String r3 = "awaitBluetoothScoConnectionLocked: stopSco"
            r0.mo28212l(r3, r9)     // Catch:{ all -> 0x01f1 }
            goto L_0x01ba
        L_0x01a4:
            if (r0 != r10) goto L_0x01bf
            com.google.common.f.e r0 = f209930a     // Catch:{ all -> 0x01f1 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x01f1 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01f1 }
            java.lang.String r9 = "NgaAudioRouter"
            r0.mo56378ag(r3, r9)     // Catch:{ all -> 0x01f1 }
            java.lang.String r3 = "SCO connection attempt failed"
            r9 = 3044(0xbe4, float:4.266E-42)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r9)).mo56386p(r3)     // Catch:{ all -> 0x01f1 }
        L_0x01ba:
            r1.f209943n = r8     // Catch:{ all -> 0x0222 }
            r1.f209944o = r7     // Catch:{ all -> 0x0222 }
            goto L_0x01c8
        L_0x01bf:
            r1.f209943n = r8     // Catch:{ all -> 0x0222 }
            r1.f209944o = r7     // Catch:{ all -> 0x0222 }
            goto L_0x01c8
        L_0x01c4:
            r1.f209943n = r8     // Catch:{ all -> 0x0222 }
            r1.f209944o = r7     // Catch:{ all -> 0x0222 }
        L_0x01c8:
            r20.m121837z()     // Catch:{ all -> 0x0220 }
            long r2 = r2.mo85102a()     // Catch:{ all -> 0x0220 }
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ef
            com.google.common.f.e r0 = f209930a     // Catch:{ all -> 0x0220 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x0220 }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0220 }
            java.lang.String r6 = "NgaAudioRouter"
            r0.mo56378ag(r5, r6)     // Catch:{ all -> 0x0220 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0220 }
            r5 = 3051(0xbeb, float:4.275E-42)
            com.google.common.f.x r0 = r0.mo56372aa(r5)     // Catch:{ all -> 0x0220 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0220 }
            java.lang.String r5 = "awaitRouting took %dms"
            r0.mo56388r(r5, r2)     // Catch:{ all -> 0x0220 }
        L_0x01ef:
            monitor-exit(r4)     // Catch:{ all -> 0x0220 }
            return
        L_0x01f1:
            r0 = move-exception
            r1.f209943n = r8     // Catch:{ all -> 0x0222 }
            r1.f209944o = r7     // Catch:{ all -> 0x0222 }
            throw r0     // Catch:{ all -> 0x0222 }
        L_0x01f7:
            r20.m121837z()     // Catch:{ all -> 0x0220 }
            long r2 = r2.mo85102a()     // Catch:{ all -> 0x0220 }
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x021e
            com.google.common.f.e r0 = f209930a     // Catch:{ all -> 0x0220 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x0220 }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0220 }
            java.lang.String r6 = "NgaAudioRouter"
            r0.mo56378ag(r5, r6)     // Catch:{ all -> 0x0220 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0220 }
            r5 = 3055(0xbef, float:4.281E-42)
            com.google.common.f.x r0 = r0.mo56372aa(r5)     // Catch:{ all -> 0x0220 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0220 }
            java.lang.String r5 = "awaitRouting took %dms"
            r0.mo56388r(r5, r2)     // Catch:{ all -> 0x0220 }
        L_0x021e:
            monitor-exit(r4)     // Catch:{ all -> 0x0220 }
            return
        L_0x0220:
            r0 = move-exception
            goto L_0x024b
        L_0x0222:
            r0 = move-exception
            r20.m121837z()     // Catch:{ all -> 0x0220 }
            long r2 = r2.mo85102a()     // Catch:{ all -> 0x0220 }
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x024a
            com.google.common.f.e r5 = f209930a     // Catch:{ all -> 0x0220 }
            com.google.common.f.x r5 = r5.mo56226d()     // Catch:{ all -> 0x0220 }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0220 }
            java.lang.String r7 = "NgaAudioRouter"
            r5.mo56378ag(r6, r7)     // Catch:{ all -> 0x0220 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0220 }
            r6 = 3053(0xbed, float:4.278E-42)
            com.google.common.f.x r5 = r5.mo56372aa(r6)     // Catch:{ all -> 0x0220 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0220 }
            java.lang.String r6 = "awaitRouting took %dms"
            r5.mo56388r(r6, r2)     // Catch:{ all -> 0x0220 }
        L_0x024a:
            throw r0     // Catch:{ all -> 0x0220 }
        L_0x024b:
            monitor-exit(r4)     // Catch:{ all -> 0x0220 }
            goto L_0x024e
        L_0x024d:
            throw r0
        L_0x024e:
            goto L_0x024d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6011e.p6013b.p6015b.C75628f.mo71762w(java.lang.String):void");
    }

    /* renamed from: x */
    public final int mo71763x() {
        synchronized (this.f209937h) {
            if (this.f209932c.mo71729b() != 12) {
                if (!this.f209948s.mo85405j(C90126fx.f251043bP) || !this.f209933d.isBluetoothScoOn()) {
                    C59104x b = f209930a.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "NgaAudioRouter");
                    ((C59052c) ((C59052c) b).mo56372aa(3007)).mo56389s("getOutputStream: STREAM_MUSIC (SCO state was %s)", C75380i.m121818d(this.f209932c.mo71729b()));
                    return 3;
                }
            }
            C59104x b2 = f209930a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "NgaAudioRouter");
            ((C59052c) ((C59052c) b2).mo56372aa(3006)).mo56386p("getOutputStream: STREAM_VOICE_CALL");
            return 0;
        }
    }

    /* renamed from: y */
    public final AudioAttributes mo71764y() {
        if (mo71763x() == 0) {
            AudioAttributes.Builder builder = this.f209935f;
            if (builder != null) {
                return builder.build();
            }
            return null;
        }
        AudioAttributes.Builder builder2 = this.f209936g;
        if (builder2 != null) {
            return builder2.build();
        }
        return null;
    }
}
