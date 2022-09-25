package com.google.android.apps.gsa.speech.audio.p7267d;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import com.google.android.apps.gsa.nga.api.C74720bx;
import com.google.android.apps.gsa.p8889z.p8890a.C118843f;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.speech.audio.p7263a.C92145g;
import com.google.android.apps.gsa.speech.audio.p7263a.C92146h;
import com.google.android.apps.gsa.speech.audio.p7264b.C92159a;
import com.google.android.apps.gsa.staticplugins.p8031m.C102687e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import com.google.android.libraries.search.p2904c.C37478d;
import com.google.android.libraries.search.p2904c.C37520e;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.speech.audio.d.j */
/* compiled from: PG */
public final class C92183j implements C118843f, C92146h {

    /* renamed from: a */
    public static final C59071e f256984a = C59071e.m91332i("com.google.android.apps.gsa.speech.audio.d.j");

    /* renamed from: b */
    final AudioManager.OnAudioFocusChangeListener f256985b;

    /* renamed from: c */
    public final AudioManager f256986c;

    /* renamed from: d */
    public final C22871g f256987d;

    /* renamed from: e */
    public final C68214a f256988e;

    /* renamed from: f */
    public final AudioFocusRequest.Builder f256989f;

    /* renamed from: g */
    public final Object f256990g = new Object();

    /* renamed from: h */
    boolean f256991h = false;

    /* renamed from: i */
    public C102687e f256992i = null;

    /* renamed from: j */
    private final C21370a f256993j;

    /* renamed from: k */
    private final C68214a f256994k;

    /* renamed from: l */
    private final C92145g f256995l;

    /* renamed from: m */
    private final AudioAttributes.Builder f256996m;

    /* renamed from: n */
    private final AudioAttributes.Builder f256997n;

    /* renamed from: o */
    private C37520e f256998o = C37520e.ROUTE_NO_AUDIO;

    /* renamed from: p */
    private C37478d f256999p = C37478d.CONNECTION_TYPE_NONE;

    /* renamed from: q */
    private int f257000q = -1;

    /* renamed from: r */
    private boolean f257001r = false;

    /* renamed from: s */
    private boolean f257002s = false;

    /* renamed from: t */
    private int f257003t = 12;

    /* renamed from: u */
    private String f257004u;

    /* renamed from: v */
    private long f257005v;

    /* renamed from: w */
    private int f257006w = 150;

    /* renamed from: x */
    private boolean f257007x;

    /* renamed from: y */
    private boolean f257008y;

    /* renamed from: z */
    private final C58833ax f257009z;

    public C92183j(Context context, C21370a aVar, C68214a aVar2, AudioManager audioManager, C22871g gVar, C68214a aVar3, C92145g gVar2, C58833ax axVar) {
        C92181h hVar = new C92181h(this);
        this.f256985b = hVar;
        context.getApplicationContext();
        this.f256993j = aVar;
        this.f256994k = aVar2;
        this.f256986c = audioManager;
        this.f256995l = gVar2;
        this.f256987d = gVar;
        this.f256988e = aVar3;
        gVar2.mo86803f(this);
        this.f257009z = axVar;
        this.f256996m = new AudioAttributes.Builder().setContentType(1).setUsage(2);
        this.f256997n = new AudioAttributes.Builder().setContentType(2);
        this.f256989f = new AudioFocusRequest.Builder(4).setOnAudioFocusChangeListener(hVar);
    }

    /* renamed from: B */
    private final void m151317B() {
        C58976aa aaVar = C58975e.f156826a;
        this.f256987d.mo28212l("maybeAbandonAudioFocus", new C92179f(this));
    }

    /* renamed from: C */
    private final void m151318C() {
        C58976aa aaVar = C58975e.f156826a;
        this.f256987d.mo28212l("maybeRequestAudioFocus", new C92178e(this));
    }

    /* renamed from: D */
    private final void m151319D() {
        if (this.f256995l.mo86801c() != 12) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        long f = ((long) (this.f256999p == C37478d.CONNECTION_TYPE_BVRA ? this.f256999p == C37478d.CONNECTION_TYPE_BVRA ? this.f257006w : SimpleSnackbar.LENGTH_SHORT : 0)) - (this.f256993j.mo26874f() - this.f257005v);
        C58976aa aaVar2 = C58975e.f156826a;
        if (f > 0) {
            long c = this.f256993j.mo26871c() + f;
            while (true) {
                try {
                    long c2 = c - this.f256993j.mo26871c();
                    if (c2 > 0) {
                        this.f256990g.wait(c2);
                    } else {
                        return;
                    }
                } catch (InterruptedException e) {
                    C59104x d = f256984a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "AudioRouter");
                    ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(12184)).mo56386p("Thread was interrupted, aborting await");
                    return;
                }
            }
        }
    }

    /* renamed from: E */
    private static boolean m151320E(C37520e eVar) {
        return eVar == C37520e.ROUTE_BLUETOOTH_PREFERRED || eVar == C37520e.ROUTE_BLUETOOTH_REQUIRED;
    }

    /* renamed from: F */
    private final boolean m151321F() {
        return m151322G(this.f256998o, this.f256999p);
    }

    /* renamed from: G */
    private final boolean m151322G(C37520e eVar, C37478d dVar) {
        if (eVar == C37520e.ROUTE_NO_AUDIO) {
            return false;
        }
        if (!((C90021c) this.f256988e.mo27525b()).mo79746e(C90086ek.f250290aO) || eVar != C37520e.ROUTE_NO_BLUETOOTH || dVar != C37478d.CONNECTION_TYPE_NONE || !this.f257009z.mo56113h() || !((C74720bx) ((C68214a) this.f257009z.mo56107c()).mo27525b()).mo71089f().a() || ((C90021c) this.f256988e.mo27525b()).mo79746e(C90086ek.f250291aP)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final boolean mo86838A() {
        boolean E;
        synchronized (this.f256990g) {
            E = m151320E(this.f256998o);
        }
        return E;
    }

    /* renamed from: a */
    public final void mo71726a(int i, int i2) {
        C22872h.m42742b(C92159a.class);
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f256990g) {
            if (mo86838A()) {
                if (i2 == 10) {
                    if (!this.f257001r) {
                        this.f257001r = true;
                        if (i == 12) {
                            C59104x b = f256984a.mo56224b();
                            b.mo56378ag(C58975e.f156826a, "AudioRouter");
                            ((C59052c) ((C59052c) b).mo56372aa(12189)).mo56386p("BT route lost");
                            C102687e eVar = this.f256992i;
                            if (eVar != null) {
                                C22871g gVar = this.f256987d;
                                Objects.requireNonNull(eVar);
                                gVar.mo28212l("onScoStateChanged: onRouteLost", new C92176c(eVar));
                            }
                        } else if (i == 11) {
                            C59104x b2 = f256984a.mo56224b();
                            b2.mo56378ag(C58975e.f156826a, "AudioRouter");
                            ((C59052c) ((C59052c) b2).mo56372aa(12188)).mo56386p("BT connection failed");
                        }
                    }
                } else if (i2 == 12 && i == 11) {
                    this.f257005v = this.f256993j.mo26874f();
                }
            }
            mo86841z();
            this.f256990g.notify();
        }
    }

    /* renamed from: b */
    public final void mo71727b(int i, int i2) {
        C22872h.m42742b(C92159a.class);
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f256990g) {
            mo86841z();
            this.f256990g.notify();
        }
    }

    /* renamed from: c */
    public final int mo71742c() {
        if (this.f257000q != -1) {
            C58976aa aaVar = C58975e.f156826a;
            return this.f257000q;
        } else if (this.f256986c.isBluetoothScoOn()) {
            C58976aa aaVar2 = C58975e.f156826a;
            return 3;
        } else if (this.f256986c.isWiredHeadsetOn()) {
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
        return this.f256986c.getStreamVolume(mo71763x());
    }

    /* renamed from: f */
    public final AudioAttributes mo71745f() {
        return mo71764y();
    }

    /* renamed from: g */
    public final C37520e mo71746g() {
        C37520e eVar;
        synchronized (this.f256990g) {
            eVar = this.f256998o;
        }
        return eVar;
    }

    /* renamed from: h */
    public final void mo71747h(String str) {
        String str2;
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f256990g) {
            if (this.f257003t == 10 && (str2 = this.f257004u) != null && str2.equals(str)) {
                this.f257003t = 11;
                this.f256990g.notify();
            }
        }
    }

    /* renamed from: i */
    public final void mo71748i(int i) {
        if (this.f257007x) {
            this.f256987d.mo28212l("Enhance audio session", new C92177d(i));
        }
    }

    /* renamed from: j */
    public final void mo71749j(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f256990g) {
            if (z) {
                if (!m151321F()) {
                    m151318C();
                }
            }
        }
    }

    /* renamed from: k */
    public final void mo71750k() {
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f256990g) {
            if (!m151321F()) {
                m151318C();
            }
        }
    }

    /* renamed from: l */
    public final void mo71751l(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f256990g) {
            if (z) {
                if (!m151321F()) {
                    m151317B();
                }
            }
        }
    }

    /* renamed from: m */
    public final void mo71752m() {
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f256990g) {
            C92182i.m151314a().mo86836b();
            if (!m151321F()) {
                m151317B();
            }
        }
    }

    /* renamed from: n */
    public final void mo71753n(boolean z) {
        this.f257007x = z;
    }

    /* renamed from: o */
    public final void mo71754o(int i) {
        C58976aa aaVar = C58975e.f156826a;
        this.f257006w = i;
    }

    /* renamed from: p */
    public final void mo71755p(int i) {
        this.f257000q = i;
    }

    /* renamed from: q */
    public final void mo71756q(boolean z) {
        this.f257008y = z;
    }

    /* renamed from: r */
    public final AudioAttributes mo86839r(boolean z) {
        if (z) {
            AudioAttributes.Builder builder = this.f256996m;
            if (builder != null) {
                return builder.build();
            }
            return null;
        }
        AudioAttributes.Builder builder2 = this.f256997n;
        if (builder2 == null) {
            return null;
        }
        builder2.setUsage(true != ((C90021c) this.f256988e.mo27525b()).mo79746e(C90086ek.f250428cu) ? 12 : 16);
        return this.f256997n.build();
    }

    /* renamed from: s */
    public final boolean mo71758s() {
        return this.f257007x;
    }

    /* renamed from: t */
    public final boolean mo71759t() {
        return (mo86838A() && this.f256995l.mo86801c() == 12) || this.f256986c.isBluetoothA2dpOn();
    }

    /* renamed from: u */
    public final void mo86840u() {
        int i;
        synchronized (this.f256990g) {
            if (this.f256991h) {
                C58976aa aaVar = C58975e.f156826a;
                AudioFocusRequest.Builder builder = this.f256989f;
                if (builder != null) {
                    i = this.f256986c.abandonAudioFocusRequest(builder.build());
                } else {
                    i = this.f256986c.abandonAudioFocus(this.f256985b);
                }
                if (i == 1) {
                    C59104x b = f256984a.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "AudioRouter");
                    ((C59052c) ((C59052c) b).mo56372aa(12180)).mo56386p("Audio focus abandoned");
                    this.f256991h = false;
                } else {
                    C59104x d = f256984a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "AudioRouter");
                    ((C59052c) ((C59052c) d).mo56372aa(12179)).mo56386p("Unable to release audio focus");
                }
            }
        }
    }

    /* renamed from: v */
    public final void mo71761v(C37520e eVar, C37478d dVar, C102687e eVar2) {
        C58976aa aaVar = C58975e.f156826a;
        if (m151320E(eVar) && dVar == C37478d.CONNECTION_TYPE_NONE) {
            C59104x c = f256984a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AudioRouter");
            ((C59052c) ((C59052c) c).mo56372aa(12207)).mo56386p("CONNECTION_TYPE_NONE for BT route, forcing BT off.");
            eVar = C37520e.ROUTE_NO_BLUETOOTH;
        }
        synchronized (this.f256990g) {
            if (!m151322G(eVar, dVar)) {
                C92182i.m151314a().mo86836b();
                if (this.f256991h) {
                    m151317B();
                }
            } else if (this.f257008y) {
                m151318C();
            } else if (this.f256991h) {
                m151317B();
            }
            this.f256992i = eVar2;
            if (dVar == C37478d.CONNECTION_TYPE_ANY) {
                dVar = C37478d.CONNECTION_TYPE_NONE;
            }
            if (!(eVar == this.f256998o && dVar == this.f256999p)) {
                C59104x b = f256984a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "AudioRouter");
                ((C59052c) ((C59052c) b).mo56372aa(12205)).mo56360M("Route changed: %s->%s,%s->%s", this.f256998o, eVar, this.f256999p, dVar);
                if (!m151320E(this.f256998o) && m151320E(eVar)) {
                    this.f257001r = false;
                }
                this.f256998o = eVar;
                this.f256999p = dVar;
                this.f257002s = true;
                this.f256987d.mo28212l("updateRoute: synchronizeBluetoothState", new C92175b(this));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0234, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0205, code lost:
        return;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo71762w(java.lang.String r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
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
            java.lang.Object r4 = r1.f256990g
            monitor-enter(r4)
            r5 = 2000(0x7d0, double:9.88E-321)
            boolean r7 = r18.mo86838A()     // Catch:{ all -> 0x0237 }
            if (r7 == 0) goto L_0x020c
            r7 = 0
            r8 = 12
            int r9 = r1.f257003t     // Catch:{ all -> 0x0206 }
            r10 = 11
            if (r9 == r8) goto L_0x007a
            com.google.common.f.e r3 = f256984a     // Catch:{ all -> 0x0206 }
            com.google.common.f.x r3 = r3.mo56224b()     // Catch:{ all -> 0x0206 }
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0206 }
            java.lang.String r11 = "AudioRouter"
            r3.mo56378ag(r9, r11)     // Catch:{ all -> 0x0206 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x0206 }
            com.google.common.f.ad r9 = com.google.common.p4526f.C58979ad.FULL     // Catch:{ all -> 0x0206 }
            r3.mo56380ai(r9)     // Catch:{ all -> 0x0206 }
            r9 = 12217(0x2fb9, float:1.712E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r9)     // Catch:{ all -> 0x0206 }
            r11 = r3
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11     // Catch:{ all -> 0x0206 }
            java.lang.String r12 = "awaitBluetoothRoutingLocked: mAwaitState=%d. Was expecting AWAIT_STATE_NONE(%d). Other states are AWAITING() and CANCELLED(%d). mAwaitToken = %s, requested token = %s"
            int r3 = r1.f257003t     // Catch:{ all -> 0x0206 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0206 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0206 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0206 }
            java.lang.String r3 = r1.f257004u     // Catch:{ all -> 0x0206 }
            if (r3 != 0) goto L_0x0066
            java.lang.String r3 = "(null)"
        L_0x0066:
            r16 = r3
            java.lang.String r3 = "(null)"
            if (r0 != 0) goto L_0x006f
            r17 = r3
            goto L_0x0071
        L_0x006f:
            r17 = r0
        L_0x0071:
            r11.mo56361N(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0206 }
            r1.f257003t = r8     // Catch:{ all -> 0x0237 }
            r1.f257004u = r7     // Catch:{ all -> 0x0237 }
            goto L_0x01dd
        L_0x007a:
            r9 = 10
            r1.f257003t = r9     // Catch:{ all -> 0x0206 }
            r1.f257004u = r0     // Catch:{ all -> 0x0206 }
            com.google.android.apps.gsa.speech.audio.a.g r0 = r1.f256995l     // Catch:{ all -> 0x0206 }
            int r0 = r0.mo86801c()     // Catch:{ all -> 0x0206 }
            if (r0 != r8) goto L_0x008e
            r1.f257003t = r8     // Catch:{ all -> 0x0237 }
            r1.f257004u = r7     // Catch:{ all -> 0x0237 }
            goto L_0x01dd
        L_0x008e:
            boolean r0 = r1.f257001r     // Catch:{ all -> 0x0206 }
            if (r0 == 0) goto L_0x00b6
            com.google.common.f.e r0 = f256984a     // Catch:{ all -> 0x0206 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x0206 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0206 }
            java.lang.String r9 = "AudioRouter"
            r0.mo56378ag(r3, r9)     // Catch:{ all -> 0x0206 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0206 }
            r3 = 12215(0x2fb7, float:1.7117E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r3)     // Catch:{ all -> 0x0206 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0206 }
            java.lang.String r3 = "SCO connection has failed"
            r0.mo56386p(r3)     // Catch:{ all -> 0x0206 }
            com.google.android.libraries.search.c.e r0 = com.google.android.libraries.search.p2904c.C37520e.ROUTE_BLUETOOTH_REQUIRED     // Catch:{ all -> 0x0206 }
            r1.f257003t = r8     // Catch:{ all -> 0x0237 }
            r1.f257004u = r7     // Catch:{ all -> 0x0237 }
            goto L_0x01dd
        L_0x00b6:
            com.google.android.libraries.search.c.e r0 = r1.f256998o     // Catch:{ all -> 0x0206 }
            com.google.android.libraries.search.c.e r11 = com.google.android.libraries.search.p2904c.C37520e.ROUTE_BLUETOOTH_REQUIRED     // Catch:{ all -> 0x0206 }
            if (r0 != r11) goto L_0x00bf
            r11 = 1000(0x3e8, double:4.94E-321)
            goto L_0x00c1
        L_0x00bf:
            r11 = 200(0xc8, double:9.9E-322)
        L_0x00c1:
            com.google.android.libraries.f.a r0 = r1.f256993j     // Catch:{ all -> 0x0206 }
            long r13 = r0.mo26874f()     // Catch:{ all -> 0x0206 }
            long r13 = r13 + r11
        L_0x00c8:
            com.google.android.apps.gsa.speech.audio.a.g r0 = r1.f256995l     // Catch:{ all -> 0x0206 }
            int r0 = r0.mo86800b()     // Catch:{ all -> 0x0206 }
            r15 = 0
            if (r0 != 0) goto L_0x00ff
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ff
            int r0 = r1.f257003t     // Catch:{ all -> 0x0206 }
            if (r0 == r10) goto L_0x00ff
            java.lang.Object r0 = r1.f256990g     // Catch:{ InterruptedException -> 0x00e8 }
            r0.wait(r11)     // Catch:{ InterruptedException -> 0x00e8 }
            com.google.android.libraries.f.a r0 = r1.f256993j     // Catch:{ all -> 0x0206 }
            long r11 = r0.mo26874f()     // Catch:{ all -> 0x0206 }
            long r11 = r13 - r11
            goto L_0x00c8
        L_0x00e8:
            r0 = move-exception
            com.google.common.f.e r3 = f256984a     // Catch:{ all -> 0x0206 }
            com.google.common.f.x r3 = r3.mo56226d()     // Catch:{ all -> 0x0206 }
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0206 }
            java.lang.String r10 = "AudioRouter"
            r3.mo56378ag(r9, r10)     // Catch:{ all -> 0x0206 }
            java.lang.String r9 = "Thread was interrupted, aborting await"
            r10 = 12213(0x2fb5, float:1.7114E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r0)).mo56372aa(r10)).mo56386p(r9)     // Catch:{ all -> 0x0206 }
            goto L_0x01d9
        L_0x00ff:
            int r0 = r1.f257003t     // Catch:{ all -> 0x0206 }
            if (r0 != r10) goto L_0x0105
            goto L_0x01d9
        L_0x0105:
            com.google.android.apps.gsa.speech.audio.a.g r0 = r1.f256995l     // Catch:{ all -> 0x0206 }
            int r0 = r0.mo86800b()     // Catch:{ all -> 0x0206 }
            com.google.android.apps.gsa.speech.audio.a.g r11 = r1.f256995l     // Catch:{ all -> 0x0206 }
            com.google.android.apps.gsa.speech.audio.a.k r11 = r11.mo86802d()     // Catch:{ all -> 0x0206 }
            if (r0 != 0) goto L_0x012b
            com.google.common.f.e r0 = f256984a     // Catch:{ all -> 0x0206 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x0206 }
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0206 }
            java.lang.String r10 = "AudioRouter"
            r0.mo56378ag(r9, r10)     // Catch:{ all -> 0x0206 }
            java.lang.String r9 = "Timed out waiting for BT device state"
            r10 = 12210(0x2fb2, float:1.711E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r10)).mo56386p(r9)     // Catch:{ all -> 0x0206 }
            r1.f257001r = r3     // Catch:{ all -> 0x0206 }
            goto L_0x01d9
        L_0x012b:
            r12 = 2
            if (r0 == r12) goto L_0x01d9
            if (r11 == 0) goto L_0x01d9
            dagger.a r0 = r1.f256994k     // Catch:{ all -> 0x0206 }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ all -> 0x0206 }
            com.google.android.apps.gsa.speech.n.i r0 = (com.google.android.apps.gsa.speech.p7311n.C92541i) r0     // Catch:{ all -> 0x0206 }
            com.google.al.c.c.b.w r0 = r0.mo87316a()     // Catch:{ all -> 0x0206 }
            com.google.al.c.c.b.u r0 = r0.f29543m     // Catch:{ all -> 0x0206 }
            if (r0 != 0) goto L_0x0142
            com.google.al.c.c.b.u r0 = com.google.p395al.p408c.p414c.p416b.C8511u.f29525b     // Catch:{ all -> 0x0206 }
        L_0x0142:
            int r0 = r0.f29527a     // Catch:{ all -> 0x0206 }
            long r11 = (long) r0     // Catch:{ all -> 0x0206 }
            com.google.android.libraries.f.a r0 = r1.f256993j     // Catch:{ all -> 0x0206 }
            long r13 = r0.mo26874f()     // Catch:{ all -> 0x0206 }
            long r13 = r13 + r11
        L_0x014c:
            com.google.android.apps.gsa.speech.audio.a.g r0 = r1.f256995l     // Catch:{ all -> 0x0206 }
            int r0 = r0.mo86801c()     // Catch:{ all -> 0x0206 }
            if (r0 == r10) goto L_0x0158
            boolean r0 = r1.f257002s     // Catch:{ all -> 0x0206 }
            if (r0 == 0) goto L_0x0184
        L_0x0158:
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x0184
            int r0 = r1.f257003t     // Catch:{ all -> 0x0206 }
            if (r0 == r10) goto L_0x0184
            java.lang.Object r0 = r1.f256990g     // Catch:{ InterruptedException -> 0x016e }
            r0.wait(r11)     // Catch:{ InterruptedException -> 0x016e }
            com.google.android.libraries.f.a r0 = r1.f256993j     // Catch:{ all -> 0x0206 }
            long r11 = r0.mo26874f()     // Catch:{ all -> 0x0206 }
            long r11 = r13 - r11
            goto L_0x014c
        L_0x016e:
            r0 = move-exception
            com.google.common.f.e r3 = f256984a     // Catch:{ all -> 0x0206 }
            com.google.common.f.x r3 = r3.mo56226d()     // Catch:{ all -> 0x0206 }
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0206 }
            java.lang.String r10 = "AudioRouter"
            r3.mo56378ag(r9, r10)     // Catch:{ all -> 0x0206 }
            java.lang.String r9 = "Thread was interrupted, aborting await"
            r10 = 12223(0x2fbf, float:1.7128E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r0)).mo56372aa(r10)).mo56386p(r9)     // Catch:{ all -> 0x0206 }
            goto L_0x01cf
        L_0x0184:
            int r0 = r1.f257003t     // Catch:{ all -> 0x0206 }
            if (r0 != r10) goto L_0x0189
            goto L_0x01cf
        L_0x0189:
            com.google.android.apps.gsa.speech.audio.a.g r0 = r1.f256995l     // Catch:{ all -> 0x0206 }
            int r0 = r0.mo86801c()     // Catch:{ all -> 0x0206 }
            if (r0 != r10) goto L_0x01b9
            com.google.common.f.e r0 = f256984a     // Catch:{ all -> 0x0206 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x0206 }
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0206 }
            java.lang.String r10 = "AudioRouter"
            r0.mo56378ag(r9, r10)     // Catch:{ all -> 0x0206 }
            java.lang.String r9 = "SCO connection timed out"
            r10 = 12220(0x2fbc, float:1.7124E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r10)).mo56386p(r9)     // Catch:{ all -> 0x0206 }
            r1.f257001r = r3     // Catch:{ all -> 0x0206 }
            com.google.android.libraries.gsa.k.g r0 = r1.f256987d     // Catch:{ all -> 0x0206 }
            com.google.android.apps.gsa.speech.audio.a.g r3 = r1.f256995l     // Catch:{ all -> 0x0206 }
            p3186j$.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x0206 }
            com.google.android.apps.gsa.speech.audio.d.a r9 = new com.google.android.apps.gsa.speech.audio.d.a     // Catch:{ all -> 0x0206 }
            r9.<init>(r3)     // Catch:{ all -> 0x0206 }
            java.lang.String r3 = "awaitBluetoothScoConnectionLocked: stopSco"
            r0.mo28212l(r3, r9)     // Catch:{ all -> 0x0206 }
            goto L_0x01cf
        L_0x01b9:
            if (r0 != r9) goto L_0x01d4
            com.google.common.f.e r0 = f256984a     // Catch:{ all -> 0x0206 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x0206 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0206 }
            java.lang.String r9 = "AudioRouter"
            r0.mo56378ag(r3, r9)     // Catch:{ all -> 0x0206 }
            java.lang.String r3 = "SCO connection attempt failed"
            r9 = 12219(0x2fbb, float:1.7122E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r9)).mo56386p(r3)     // Catch:{ all -> 0x0206 }
        L_0x01cf:
            r1.f257003t = r8     // Catch:{ all -> 0x0237 }
            r1.f257004u = r7     // Catch:{ all -> 0x0237 }
            goto L_0x01dd
        L_0x01d4:
            r1.f257003t = r8     // Catch:{ all -> 0x0237 }
            r1.f257004u = r7     // Catch:{ all -> 0x0237 }
            goto L_0x01dd
        L_0x01d9:
            r1.f257003t = r8     // Catch:{ all -> 0x0237 }
            r1.f257004u = r7     // Catch:{ all -> 0x0237 }
        L_0x01dd:
            r18.m151319D()     // Catch:{ all -> 0x0235 }
            long r2 = r2.mo85102a()     // Catch:{ all -> 0x0235 }
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0204
            com.google.common.f.e r0 = f256984a     // Catch:{ all -> 0x0235 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x0235 }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0235 }
            java.lang.String r6 = "AudioRouter"
            r0.mo56378ag(r5, r6)     // Catch:{ all -> 0x0235 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0235 }
            r5 = 12226(0x2fc2, float:1.7132E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r5)     // Catch:{ all -> 0x0235 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0235 }
            java.lang.String r5 = "awaitRouting took %dms"
            r0.mo56388r(r5, r2)     // Catch:{ all -> 0x0235 }
        L_0x0204:
            monitor-exit(r4)     // Catch:{ all -> 0x0235 }
            return
        L_0x0206:
            r0 = move-exception
            r1.f257003t = r8     // Catch:{ all -> 0x0237 }
            r1.f257004u = r7     // Catch:{ all -> 0x0237 }
            throw r0     // Catch:{ all -> 0x0237 }
        L_0x020c:
            r18.m151319D()     // Catch:{ all -> 0x0235 }
            long r2 = r2.mo85102a()     // Catch:{ all -> 0x0235 }
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0233
            com.google.common.f.e r0 = f256984a     // Catch:{ all -> 0x0235 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x0235 }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0235 }
            java.lang.String r6 = "AudioRouter"
            r0.mo56378ag(r5, r6)     // Catch:{ all -> 0x0235 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0235 }
            r5 = 12230(0x2fc6, float:1.7138E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r5)     // Catch:{ all -> 0x0235 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0235 }
            java.lang.String r5 = "awaitRouting took %dms"
            r0.mo56388r(r5, r2)     // Catch:{ all -> 0x0235 }
        L_0x0233:
            monitor-exit(r4)     // Catch:{ all -> 0x0235 }
            return
        L_0x0235:
            r0 = move-exception
            goto L_0x0260
        L_0x0237:
            r0 = move-exception
            r18.m151319D()     // Catch:{ all -> 0x0235 }
            long r2 = r2.mo85102a()     // Catch:{ all -> 0x0235 }
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x025f
            com.google.common.f.e r5 = f256984a     // Catch:{ all -> 0x0235 }
            com.google.common.f.x r5 = r5.mo56226d()     // Catch:{ all -> 0x0235 }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0235 }
            java.lang.String r7 = "AudioRouter"
            r5.mo56378ag(r6, r7)     // Catch:{ all -> 0x0235 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0235 }
            r6 = 12228(0x2fc4, float:1.7135E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r6)     // Catch:{ all -> 0x0235 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0235 }
            java.lang.String r6 = "awaitRouting took %dms"
            r5.mo56388r(r6, r2)     // Catch:{ all -> 0x0235 }
        L_0x025f:
            throw r0     // Catch:{ all -> 0x0235 }
        L_0x0260:
            monitor-exit(r4)     // Catch:{ all -> 0x0235 }
            goto L_0x0263
        L_0x0262:
            throw r0
        L_0x0263:
            goto L_0x0262
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.audio.p7267d.C92183j.mo71762w(java.lang.String):void");
    }

    /* renamed from: x */
    public final int mo71763x() {
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f256990g) {
            if (this.f256995l.mo86801c() != 12) {
                if (!((C90021c) this.f256988e.mo27525b()).mo79746e(C90126fx.f251043bP) || !this.f256986c.isBluetoothScoOn()) {
                    C59104x b = f256984a.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "AudioRouter");
                    ((C59052c) ((C59052c) b).mo56372aa(12169)).mo56389s("getOutputStream: STREAM_MUSIC (SCO state was %s)", C92145g.m151261e(this.f256995l.mo86801c()));
                    return 3;
                }
            }
            C59104x b2 = f256984a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "AudioRouter");
            ((C59052c) ((C59052c) b2).mo56372aa(12168)).mo56386p("getOutputStream: STREAM_VOICE_CALL");
            return 0;
        }
    }

    /* renamed from: y */
    public final AudioAttributes mo71764y() {
        return mo86839r(mo71763x() == 0);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0185, code lost:
        return;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo86841z() {
        /*
            r8 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.Class<com.google.android.apps.gsa.speech.audio.b.a> r0 = com.google.android.apps.gsa.speech.audio.p7264b.C92159a.class
            com.google.android.libraries.gsa.p1876k.C22872h.m42742b(r0)
            java.lang.Object r0 = r8.f256990g
            monitor-enter(r0)
            boolean r1 = r8.f257002s     // Catch:{ all -> 0x0186 }
            r2 = 0
            if (r1 == 0) goto L_0x0016
            r8.f257002s = r2     // Catch:{ all -> 0x0186 }
            java.lang.Object r1 = r8.f256990g     // Catch:{ all -> 0x0186 }
            r1.notify()     // Catch:{ all -> 0x0186 }
        L_0x0016:
            boolean r1 = r8.mo86838A()     // Catch:{ all -> 0x0186 }
            r3 = 10
            if (r1 == 0) goto L_0x015b
            com.google.android.apps.gsa.speech.audio.a.g r1 = r8.f256995l     // Catch:{ all -> 0x0186 }
            r1.mo86804g()     // Catch:{ all -> 0x0186 }
            boolean r1 = r8.f257001r     // Catch:{ all -> 0x0186 }
            if (r1 == 0) goto L_0x0029
            monitor-exit(r0)     // Catch:{ all -> 0x0186 }
            return
        L_0x0029:
            com.google.android.apps.gsa.speech.audio.a.g r1 = r8.f256995l     // Catch:{ all -> 0x0186 }
            int r1 = r1.mo86801c()     // Catch:{ all -> 0x0186 }
            if (r1 != r3) goto L_0x0184
            com.google.android.apps.gsa.speech.audio.a.g r1 = r8.f256995l     // Catch:{ all -> 0x0186 }
            int r1 = r1.mo86800b()     // Catch:{ all -> 0x0186 }
            r4 = 1
            if (r1 != r4) goto L_0x0184
            com.google.common.f.e r1 = f256984a     // Catch:{ all -> 0x0186 }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x0186 }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0186 }
            java.lang.String r6 = "AudioRouter"
            r1.mo56378ag(r5, r6)     // Catch:{ all -> 0x0186 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0186 }
            r5 = 12202(0x2faa, float:1.7099E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r5)     // Catch:{ all -> 0x0186 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0186 }
            java.lang.String r5 = "BT required, starting SCO"
            r1.mo56386p(r5)     // Catch:{ all -> 0x0186 }
            com.google.android.apps.gsa.speech.audio.a.g r1 = r8.f256995l     // Catch:{ all -> 0x0186 }
            com.google.android.libraries.search.c.d r5 = r8.f256999p     // Catch:{ all -> 0x0186 }
            android.content.Context r6 = r1.f256900c     // Catch:{ all -> 0x0186 }
            boolean r6 = com.google.android.apps.gsa.shared.util.permissions.C91076c.m148792a(r6)     // Catch:{ all -> 0x0186 }
            if (r6 != 0) goto L_0x0071
            com.google.common.f.e r1 = com.google.android.apps.gsa.speech.audio.p7263a.C92145g.f256897a     // Catch:{ all -> 0x0186 }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x0186 }
            java.lang.String r2 = "startSco: no Bluetooth permissions on S+"
            r3 = 12123(0x2f5b, float:1.6988E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)     // Catch:{ all -> 0x0186 }
            goto L_0x0184
        L_0x0071:
            java.lang.Class<com.google.android.apps.gsa.speech.audio.b.a> r6 = com.google.android.apps.gsa.speech.audio.p7264b.C92159a.class
            com.google.android.libraries.gsa.p1876k.C22872h.m42742b(r6)     // Catch:{ all -> 0x0186 }
            r1.f256908k = r5     // Catch:{ all -> 0x0186 }
            com.google.android.libraries.search.c.d r6 = com.google.android.libraries.search.p2904c.C37478d.CONNECTION_TYPE_NONE     // Catch:{ all -> 0x0186 }
            if (r5 != r6) goto L_0x008b
            com.google.common.f.e r1 = com.google.android.apps.gsa.speech.audio.p7263a.C92145g.f256897a     // Catch:{ all -> 0x0186 }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ all -> 0x0186 }
            java.lang.String r2 = "startSco: Invalid connection type, returning"
            r3 = 12122(0x2f5a, float:1.6987E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)     // Catch:{ all -> 0x0186 }
            goto L_0x0184
        L_0x008b:
            r1.mo86804g()     // Catch:{ all -> 0x0186 }
            com.google.android.apps.gsa.shared.util.C90762bf.m148259b()     // Catch:{ all -> 0x0186 }
            int r5 = r1.mo86801c()     // Catch:{ all -> 0x0186 }
            if (r5 != r3) goto L_0x0184
            r5 = 11
            r1.mo86806i(r5)     // Catch:{ all -> 0x0186 }
            com.google.common.f.e r5 = com.google.android.apps.gsa.speech.audio.p7263a.C92145g.f256897a     // Catch:{ all -> 0x0186 }
            com.google.common.f.x r5 = r5.mo56224b()     // Catch:{ all -> 0x0186 }
            java.lang.String r6 = "Starting VR"
            r7 = 12130(0x2f62, float:1.6998E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r7)).mo56386p(r6)     // Catch:{ all -> 0x0186 }
            android.content.Context r5 = r1.f256900c     // Catch:{ all -> 0x0186 }
            boolean r5 = com.google.android.apps.gsa.shared.util.permissions.C91076c.m148792a(r5)     // Catch:{ all -> 0x0186 }
            if (r5 != 0) goto L_0x00c0
            com.google.common.f.e r4 = com.google.android.apps.gsa.speech.audio.p7263a.C92145g.f256897a     // Catch:{ all -> 0x0186 }
            com.google.common.f.x r4 = r4.mo56224b()     // Catch:{ all -> 0x0186 }
            java.lang.String r5 = "startVoiceRecognition: no Bluetooth permissions on S+"
            r6 = 12137(0x2f69, float:1.7008E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r6)).mo56386p(r5)     // Catch:{ all -> 0x0186 }
            goto L_0x0137
        L_0x00c0:
            com.google.android.apps.gsa.speech.audio.a.l r5 = r1.f256906i     // Catch:{ all -> 0x0186 }
            if (r5 != 0) goto L_0x00d2
            com.google.common.f.e r4 = com.google.android.apps.gsa.speech.audio.p7263a.C92145g.f256897a     // Catch:{ all -> 0x0186 }
            com.google.common.f.x r4 = r4.mo56226d()     // Catch:{ all -> 0x0186 }
            java.lang.String r5 = "mBluetoothHeadset is null"
            r6 = 12136(0x2f68, float:1.7006E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r6)).mo56386p(r5)     // Catch:{ all -> 0x0186 }
            goto L_0x0137
        L_0x00d2:
            com.google.common.base.cr r5 = r1.f256901d     // Catch:{ all -> 0x0186 }
            java.lang.Object r5 = r5.mo6453a()     // Catch:{ all -> 0x0186 }
            com.google.android.apps.gsa.y.a.d r5 = (com.google.android.apps.gsa.p8885y.p8886a.C118831d) r5     // Catch:{ all -> 0x0186 }
            long r5 = r5.mo104019a()     // Catch:{ all -> 0x0186 }
            r1.f256909l = r5     // Catch:{ all -> 0x0186 }
            com.google.android.apps.gsa.shared.util.v r5 = r1.f256910m     // Catch:{ all -> 0x0186 }
            boolean r5 = r5.mo85391c()     // Catch:{ all -> 0x0186 }
            if (r5 == 0) goto L_0x00f5
            com.google.android.libraries.search.c.d r5 = r1.f256908k     // Catch:{ all -> 0x0186 }
            com.google.android.libraries.search.c.d r6 = com.google.android.libraries.search.p2904c.C37478d.CONNECTION_TYPE_VIRTUAL_CALL_SCO     // Catch:{ all -> 0x0186 }
            if (r5 != r6) goto L_0x00f5
            android.media.AudioManager r2 = r1.f256899b     // Catch:{ all -> 0x0186 }
            r2.startBluetoothSco()     // Catch:{ all -> 0x0186 }
            r2 = 1
            goto L_0x0137
        L_0x00f5:
            com.google.android.apps.gsa.shared.util.v r4 = r1.f256910m     // Catch:{ all -> 0x0186 }
            boolean r4 = r4.mo85391c()     // Catch:{ all -> 0x0186 }
            if (r4 == 0) goto L_0x012a
            com.google.android.libraries.search.c.d r4 = r1.f256908k     // Catch:{ all -> 0x0186 }
            com.google.android.libraries.search.c.d r5 = com.google.android.libraries.search.p2904c.C37478d.CONNECTION_TYPE_BVRA     // Catch:{ all -> 0x0186 }
            if (r4 != r5) goto L_0x012a
            com.google.android.apps.gsa.speech.audio.a.k r4 = r1.mo86802d()     // Catch:{ all -> 0x0186 }
            if (r4 != 0) goto L_0x010a
            goto L_0x0137
        L_0x010a:
            dagger.a r5 = r1.f256902e     // Catch:{ all -> 0x0186 }
            java.lang.Object r5 = r5.mo27525b()     // Catch:{ all -> 0x0186 }
            com.google.android.apps.gsa.search.core.i.t r5 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r5     // Catch:{ all -> 0x0186 }
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251108cb     // Catch:{ all -> 0x0186 }
            boolean r5 = r5.mo79746e(r6)     // Catch:{ all -> 0x0186 }
            if (r5 == 0) goto L_0x0123
            com.google.android.apps.gsa.speech.audio.a.l r5 = r1.f256906i     // Catch:{ all -> 0x0186 }
            boolean r5 = r5.mo86818c(r4)     // Catch:{ all -> 0x0186 }
            if (r5 != 0) goto L_0x0123
            goto L_0x0137
        L_0x0123:
            com.google.android.apps.gsa.speech.audio.a.l r2 = r1.f256906i     // Catch:{ all -> 0x0186 }
            boolean r2 = r2.mo86820e(r4)     // Catch:{ all -> 0x0186 }
            goto L_0x0137
        L_0x012a:
            com.google.android.apps.gsa.speech.audio.a.k r4 = r1.mo86802d()     // Catch:{ all -> 0x0186 }
            if (r4 != 0) goto L_0x0131
            goto L_0x0137
        L_0x0131:
            com.google.android.apps.gsa.speech.audio.a.l r2 = r1.f256906i     // Catch:{ all -> 0x0186 }
            boolean r2 = r2.mo86819d(r4)     // Catch:{ all -> 0x0186 }
        L_0x0137:
            com.google.common.f.e r4 = com.google.android.apps.gsa.speech.audio.p7263a.C92145g.f256897a     // Catch:{ all -> 0x0186 }
            com.google.common.f.x r4 = r4.mo56224b()     // Catch:{ all -> 0x0186 }
            java.lang.String r5 = "startSco: startVoiceRecognition returned %b"
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0186 }
            r7 = 12118(0x2f56, float:1.6981E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r7)).mo56389s(r5, r6)     // Catch:{ all -> 0x0186 }
            if (r2 != 0) goto L_0x0184
            com.google.common.f.e r2 = com.google.android.apps.gsa.speech.audio.p7263a.C92145g.f256897a     // Catch:{ all -> 0x0186 }
            com.google.common.f.x r2 = r2.mo56224b()     // Catch:{ all -> 0x0186 }
            java.lang.String r4 = "startSco: startVoiceRecognition failed"
            r5 = 12120(0x2f58, float:1.6984E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56386p(r4)     // Catch:{ all -> 0x0186 }
            r1.mo86806i(r3)     // Catch:{ all -> 0x0186 }
            goto L_0x0184
        L_0x015b:
            com.google.android.apps.gsa.speech.audio.a.g r1 = r8.f256995l     // Catch:{ all -> 0x0186 }
            int r1 = r1.mo86801c()     // Catch:{ all -> 0x0186 }
            if (r1 == r3) goto L_0x0184
            com.google.common.f.e r1 = f256984a     // Catch:{ all -> 0x0186 }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x0186 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0186 }
            java.lang.String r3 = "AudioRouter"
            r1.mo56378ag(r2, r3)     // Catch:{ all -> 0x0186 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0186 }
            r2 = 12199(0x2fa7, float:1.7094E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x0186 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0186 }
            java.lang.String r2 = "BT not required, stopping SCO"
            r1.mo56386p(r2)     // Catch:{ all -> 0x0186 }
            com.google.android.apps.gsa.speech.audio.a.g r1 = r8.f256995l     // Catch:{ all -> 0x0186 }
            r1.mo86807j()     // Catch:{ all -> 0x0186 }
        L_0x0184:
            monitor-exit(r0)     // Catch:{ all -> 0x0186 }
            return
        L_0x0186:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0186 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.audio.p7267d.C92183j.mo86841z():void");
    }
}
