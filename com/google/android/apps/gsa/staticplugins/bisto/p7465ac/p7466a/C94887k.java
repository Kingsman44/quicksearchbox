package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a;

import android.app.NotificationManager;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Pair;
import androidx.core.app.C1839z;
import com.google.android.apps.gsa.binaries.satin.app.og;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7469c.C94929a;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7469c.C94931c;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7469c.C94932d;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94933a;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94934b;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94936d;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94937e;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94938f;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94939g;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7472f.C94963b;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7476j.C95010a;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7476j.C95012c;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7476j.C95013d;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7477k.C95022d;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95297c;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96460ar;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;
import com.google.android.gms.wearable.C146414i;
import com.google.android.libraries.assistant.accessory.gmutls.C11018a;
import com.google.android.libraries.assistant.accessory.gmutls.C11022e;
import com.google.android.libraries.assistant.accessory.p617a.C10990a;
import com.google.android.libraries.assistant.accessory.p617a.C10992c;
import com.google.android.libraries.assistant.accessory.p617a.C10993d;
import com.google.android.libraries.assistant.accessory.p617a.C10995f;
import com.google.android.libraries.assistant.accessory.p618b.C11011p;
import com.google.android.libraries.assistant.accessory.p618b.C11017v;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.p10712d.C142509hz;
import com.google.android.p10712d.C142512ib;
import com.google.android.p10712d.C142515ie;
import com.google.android.p10712d.C142517ig;
import com.google.assistant.p3739a.p3740a.C48091by;
import com.google.assistant.p3739a.p3740a.C48092bz;
import com.google.assistant.p3739a.p3740a.C48112i;
import com.google.assistant.p3739a.p3740a.C48113j;
import com.google.assistant.p3739a.p3740a.C48114k;
import com.google.assistant.p3739a.p3740a.C48115l;
import com.google.assistant.p3739a.p3740a.C48120q;
import com.google.assistant.p3739a.p3740a.C48123t;
import com.google.assistant.p3739a.p3740a.C48124u;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60062jk;
import com.google.common.p4552o.C60063jl;
import com.google.common.p4552o.C60064jm;
import com.google.common.p4552o.C60065jn;
import com.google.common.p4552o.C60066jo;
import com.google.common.p4552o.C60069jr;
import com.google.common.p4575r.C60747d;
import com.google.common.util.concurrent.C60904dr;
import com.google.protobuf.C63088z;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.Locale;
import java.util.Timer;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.ssl.SSLEngineResult;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.k */
/* compiled from: PG */
public final class C94887k implements C94870as, C94934b {

    /* renamed from: K */
    private static final Object f265365K = new Object();

    /* renamed from: L */
    private static long f265366L = -1;

    /* renamed from: a */
    public static final C59071e f265367a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ac.a.k");

    /* renamed from: A */
    final C11011p f265368A;

    /* renamed from: B */
    final C146414i f265369B;

    /* renamed from: C */
    boolean f265370C;

    /* renamed from: D */
    final AtomicBoolean f265371D;

    /* renamed from: E */
    final AtomicBoolean f265372E;

    /* renamed from: F */
    public final AtomicBoolean f265373F;

    /* renamed from: G */
    Timer f265374G;

    /* renamed from: H */
    public final C94873av f265375H;

    /* renamed from: I */
    public final ConcurrentLinkedDeque f265376I;

    /* renamed from: J */
    public final C94869ar f265377J;

    /* renamed from: M */
    private final Context f265378M;

    /* renamed from: N */
    private final C94933a f265379N;

    /* renamed from: O */
    private BluetoothGattCharacteristic f265380O;

    /* renamed from: P */
    private BluetoothGattCharacteristic f265381P;

    /* renamed from: Q */
    private final AtomicBoolean f265382Q;

    /* renamed from: R */
    private final AtomicBoolean f265383R;

    /* renamed from: S */
    private final og f265384S;

    /* renamed from: b */
    public final C95010a f265385b;

    /* renamed from: c */
    final C94929a f265386c;

    /* renamed from: d */
    public final C94939g f265387d = new C94939g();

    /* renamed from: e */
    public final C94939g f265388e = new C94939g();

    /* renamed from: f */
    public final C94939g f265389f = new C94939g();

    /* renamed from: g */
    final C89492cd f265390g;

    /* renamed from: h */
    public final C89656k f265391h;

    /* renamed from: i */
    public final C22871g f265392i;

    /* renamed from: j */
    public volatile int f265393j;

    /* renamed from: k */
    volatile C94963b f265394k;

    /* renamed from: l */
    BluetoothGattCharacteristic f265395l;

    /* renamed from: m */
    public BluetoothGattCharacteristic f265396m;

    /* renamed from: n */
    BluetoothGattCharacteristic f265397n;

    /* renamed from: o */
    public BluetoothGattCharacteristic f265398o;

    /* renamed from: p */
    volatile C10992c f265399p;

    /* renamed from: q */
    volatile C10992c f265400q;

    /* renamed from: r */
    volatile C10992c f265401r;

    /* renamed from: s */
    volatile C10992c f265402s;

    /* renamed from: t */
    final C94868aq f265403t;

    /* renamed from: u */
    final C95022d f265404u;

    /* renamed from: v */
    final C94931c f265405v;

    /* renamed from: w */
    final C11022e f265406w;

    /* renamed from: x */
    final ConcurrentLinkedQueue f265407x;

    /* renamed from: y */
    public final C95297c f265408y;

    /* renamed from: z */
    public final Object f265409z;

    public C94887k(Context context, C22871g gVar, Executor executor, C89492cd cdVar, C89656k kVar, C95297c cVar, C94873av avVar, C95010a aVar, byte[] bArr, C94933a aVar2, C11011p pVar, C146414i iVar, C90851k kVar2, og ogVar) {
        C95010a aVar3 = aVar;
        C94886j jVar = new C94886j(this);
        this.f265386c = jVar;
        C11022e eVar = new C11022e();
        this.f265406w = eVar;
        this.f265407x = new ConcurrentLinkedQueue();
        this.f265409z = new Object();
        this.f265370C = false;
        this.f265371D = new AtomicBoolean(false);
        this.f265382Q = new AtomicBoolean(false);
        this.f265372E = new AtomicBoolean(false);
        this.f265383R = new AtomicBoolean(true);
        this.f265373F = new AtomicBoolean(false);
        this.f265374G = new Timer();
        this.f265376I = new ConcurrentLinkedDeque();
        C94879c cVar2 = new C94879c(this);
        this.f265377J = cVar2;
        this.f265378M = context;
        this.f265385b = aVar3;
        this.f265390g = cdVar;
        C95297c cVar3 = cVar;
        this.f265408y = cVar3;
        Context context2 = context;
        this.f265403t = new C94868aq(context2, cVar2, new ReentrantLock(true), pVar, kVar2.mo85208a("bisto-gatt-helper"), new C60904dr(executor), kVar);
        this.f265391h = kVar;
        this.f265392i = gVar;
        this.f265375H = avVar;
        this.f265405v = new C94931c(eVar, jVar, bArr, cVar3, aVar2, aVar3.f265818a.getAddress(), context2);
        this.f265402s = new C10992c(608);
        this.f265404u = new C95022d();
        this.f265368A = pVar;
        this.f265369B = iVar;
        this.f265379N = aVar2;
        this.f265384S = ogVar;
    }

    /* renamed from: E */
    public static void m156572E(int i, int i2, byte[] bArr, C89656k kVar) {
        if (kVar != null && kVar.mo83553h("blackboxTestLogging")) {
            synchronized (f265365K) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = f265366L;
                long j2 = 0;
                if (j > 0) {
                    j2 = elapsedRealtime - j;
                }
                f265366L = elapsedRealtime;
                if (i == 2) {
                    bArr = Arrays.copyOfRange(bArr, 2, bArr.length);
                }
                C142509hz hzVar = (C142509hz) C142512ib.f386720f.createBuilder();
                hzVar.copyOnWrite();
                C142512ib ibVar = (C142512ib) hzVar.instance;
                ibVar.f386725d = i;
                ibVar.f386722a |= 1;
                hzVar.copyOnWrite();
                C142512ib ibVar2 = (C142512ib) hzVar.instance;
                ibVar2.f386722a |= 2;
                ibVar2.f386726e = j2;
                C142515ie ieVar = (C142515ie) C142517ig.f386734d.createBuilder();
                ieVar.copyOnWrite();
                C142517ig igVar = (C142517ig) ieVar.instance;
                igVar.f386737b = i2;
                igVar.f386736a |= 1;
                C63088z A = C63088z.m96139A(bArr);
                ieVar.copyOnWrite();
                C142517ig igVar2 = (C142517ig) ieVar.instance;
                igVar2.f386736a = 2 | igVar2.f386736a;
                igVar2.f386738c = A;
                hzVar.copyOnWrite();
                C142512ib ibVar3 = (C142512ib) hzVar.instance;
                C142517ig igVar3 = (C142517ig) ieVar.build();
                igVar3.getClass();
                ibVar3.f386724c = igVar3;
                ibVar3.f386723b = 4;
                C58976aa aaVar = C58975e.f156826a;
                C59104x b = f265367a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "BistoBleConnection");
                ((C59052c) ((C59052c) b).mo56372aa(17284)).mo56389s("BBLog|%s|", Base64.encodeToString(((C142512ib) hzVar.build()).toByteArray(), 0).trim());
            }
        }
    }

    /* renamed from: F */
    private final int m156573F(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if ((bluetoothGattCharacteristic.getProperties() & 1) == 0 && !this.f265383R.get()) {
            return 2;
        }
        return 1;
    }

    /* renamed from: G */
    private final Deque m156574G(byte[] bArr, C10992c cVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        if (!mo88761y()) {
            int i = this.f265403t.f265299l.get() - 3;
            int i2 = 0;
            while (true) {
                int length = bArr.length;
                if (i2 >= length) {
                    return arrayDeque;
                }
                int i3 = i2 + i;
                arrayDeque.add(Arrays.copyOfRange(bArr, i2, Math.min(length, i3)));
                i2 = i3;
            }
        } else if (cVar != null) {
            return cVar.mo19361a(bArr);
        } else {
            try {
                arrayDeque.add(bArr);
                return arrayDeque;
            } catch (IllegalArgumentException e) {
                C59104x c = f265367a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "BistoBleConnection");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(17269)).mo56389s("[%s] Framing error", C94876ay.m156554c(this.f265385b));
                C95297c cVar2 = this.f265408y;
                C60066jo joVar = (C60066jo) C60069jr.f162379n.createBuilder();
                joVar.copyOnWrite();
                C60069jr jrVar = (C60069jr) joVar.instance;
                jrVar.f162383c = 4;
                jrVar.f162381a |= 2;
                joVar.copyOnWrite();
                C60069jr jrVar2 = (C60069jr) joVar.instance;
                jrVar2.f162381a |= 512;
                jrVar2.f162390j = 256;
                cVar2.mo89225a(joVar);
                C94873av avVar = this.f265375H;
                avVar.f265332k.addAndGet(1);
                avVar.f265338q.set(true);
                return arrayDeque;
            }
        }
    }

    /* renamed from: H */
    private final void m156575H() {
        int i;
        while (!this.f265407x.isEmpty()) {
            this.f265407x.poll();
        }
        synchronized (this.f265409z) {
            i = 0;
            this.f265370C = false;
        }
        m156579L(2);
        this.f265375H.mo88727j();
        this.f265405v.mo88842e();
        if (this.f265375H.f265338q.get()) {
            C60064jm jmVar = (C60064jm) C60065jn.f162356t.createBuilder();
            int andSet = this.f265375H.f265332k.getAndSet(0);
            jmVar.copyOnWrite();
            C60065jn jnVar = (C60065jn) jmVar.instance;
            jnVar.f162358a |= 32;
            jnVar.f162364g = andSet;
            int andSet2 = this.f265375H.f265333l.getAndSet(0);
            jmVar.copyOnWrite();
            C60065jn jnVar2 = (C60065jn) jmVar.instance;
            jnVar2.f162358a |= 16;
            jnVar2.f162363f = andSet2;
            int andSet3 = this.f265375H.f265330i.getAndSet(0);
            jmVar.copyOnWrite();
            C60065jn jnVar3 = (C60065jn) jmVar.instance;
            jnVar3.f162358a |= 1;
            jnVar3.f162359b = andSet3;
            int andSet4 = this.f265375H.f265331j.getAndSet(0);
            jmVar.copyOnWrite();
            C60065jn jnVar4 = (C60065jn) jmVar.instance;
            jnVar4.f162358a |= 2;
            jnVar4.f162360c = andSet4;
            int andSet5 = this.f265375H.f265334m.getAndSet(0);
            jmVar.copyOnWrite();
            C60065jn jnVar5 = (C60065jn) jmVar.instance;
            jnVar5.f162358a |= 4;
            jnVar5.f162361d = andSet5;
            int andSet6 = this.f265375H.f265335n.getAndSet(0);
            jmVar.copyOnWrite();
            C60065jn jnVar6 = (C60065jn) jmVar.instance;
            jnVar6.f162358a |= 8;
            jnVar6.f162362e = andSet6;
            int andSet7 = this.f265375H.f265322a.getAndSet(0);
            jmVar.copyOnWrite();
            C60065jn jnVar7 = (C60065jn) jmVar.instance;
            jnVar7.f162358a |= 256;
            jnVar7.f162367j = andSet7;
            int andSet8 = this.f265375H.f265323b.getAndSet(0);
            jmVar.copyOnWrite();
            C60065jn jnVar8 = (C60065jn) jmVar.instance;
            jnVar8.f162358a |= 128;
            jnVar8.f162366i = andSet8;
            int andSet9 = this.f265375H.f265324c.getAndSet(0);
            jmVar.copyOnWrite();
            C60065jn jnVar9 = (C60065jn) jmVar.instance;
            jnVar9.f162358a |= 1024;
            jnVar9.f162369l = andSet9;
            int andSet10 = this.f265375H.f265325d.getAndSet(0);
            jmVar.copyOnWrite();
            C60065jn jnVar10 = (C60065jn) jmVar.instance;
            jnVar10.f162358a |= 512;
            jnVar10.f162368k = andSet10;
            int andSet11 = this.f265375H.f265326e.getAndSet(0);
            jmVar.copyOnWrite();
            C60065jn jnVar11 = (C60065jn) jmVar.instance;
            jnVar11.f162358a |= 4096;
            jnVar11.f162371n = andSet11;
            int andSet12 = this.f265375H.f265327f.getAndSet(0);
            jmVar.copyOnWrite();
            C60065jn jnVar12 = (C60065jn) jmVar.instance;
            jnVar12.f162358a |= 2048;
            jnVar12.f162370m = andSet12;
            int andSet13 = this.f265375H.f265328g.getAndSet(0);
            jmVar.copyOnWrite();
            C60065jn jnVar13 = (C60065jn) jmVar.instance;
            jnVar13.f162358a |= 65536;
            jnVar13.f162374q = andSet13;
            int andSet14 = this.f265375H.f265329h.getAndSet(0);
            jmVar.copyOnWrite();
            C60065jn jnVar14 = (C60065jn) jmVar.instance;
            jnVar14.f162358a |= 32768;
            jnVar14.f162373p = andSet14;
            int seconds = (int) this.f265375H.mo88720c().getSeconds();
            if (seconds != 0) {
                i = (int) this.f265375H.mo88721d().getSeconds();
            }
            jmVar.copyOnWrite();
            C60065jn jnVar15 = (C60065jn) jmVar.instance;
            jnVar15.f162358a |= 64;
            jnVar15.f162365h = i;
            jmVar.copyOnWrite();
            C60065jn jnVar16 = (C60065jn) jmVar.instance;
            jnVar16.f162358a |= 16384;
            jnVar16.f162372o = seconds;
            int b = this.f265375H.mo88719b();
            jmVar.copyOnWrite();
            C60065jn jnVar17 = (C60065jn) jmVar.instance;
            jnVar17.f162358a |= C89885b.S3REQUEST_VALUE;
            jnVar17.f162375r = b;
            int a = this.f265375H.mo88718a();
            jmVar.copyOnWrite();
            C60065jn jnVar18 = (C60065jn) jmVar.instance;
            jnVar18.f162358a |= C89885b.HTTP_VALUE;
            jnVar18.f162376s = a;
            C60065jn jnVar19 = (C60065jn) jmVar.build();
            C95297c cVar = this.f265408y;
            C60062jk jkVar = (C60062jk) C60063jl.f162349f.createBuilder();
            jkVar.copyOnWrite();
            C60063jl jlVar = (C60063jl) jkVar.instance;
            jnVar19.getClass();
            jlVar.f162353c = jnVar19;
            jlVar.f162351a = 2 | jlVar.f162351a;
            cVar.mo89227c(jkVar);
        }
        this.f265408y.mo89230f(Boolean.valueOf(!this.f265372E.get()));
        this.f265406w.mo19484i(new C11018a(608));
    }

    /* renamed from: I */
    private final void m156576I(int i) {
        C94963b bVar = this.f265394k;
        this.f265394k = null;
        if (bVar != null) {
            bVar.mo88871a().mo88802d();
        }
        this.f265371D.set(false);
        this.f265404u.f265851a = 1;
        this.f265382Q.set(false);
        this.f265374G.cancel();
        this.f265374G.purge();
        this.f265405v.mo88842e();
        if (!this.f265373F.get()) {
            C58976aa aaVar = C58975e.f156826a;
        } else {
            C48113j jVar = (C48113j) C48115l.f124522j.createBuilder();
            jVar.copyOnWrite();
            ((C48115l) jVar.instance).f124524a = C48112i.m85182a(7);
            C63088z E = C63088z.m96143E(this.f265368A.mo19414g());
            jVar.copyOnWrite();
            ((C48115l) jVar.instance).f124525b = E;
            jVar.copyOnWrite();
            ((C48115l) jVar.instance).f124531h = C48114k.m85184a(6);
            C11017v.m26077f(jVar, this.f265369B, this.f265368A, true);
        }
        C95297c cVar = this.f265408y;
        C60066jo joVar = (C60066jo) C60069jr.f162379n.createBuilder();
        joVar.copyOnWrite();
        C60069jr jrVar = (C60069jr) joVar.instance;
        jrVar.f162383c = 15;
        jrVar.f162381a |= 2;
        joVar.copyOnWrite();
        C60069jr jrVar2 = (C60069jr) joVar.instance;
        jrVar2.f162381a |= 2048;
        jrVar2.f162391k = i;
        cVar.mo89225a(joVar);
    }

    /* renamed from: J */
    private final void m156577J() {
        C94868aq aqVar = this.f265403t;
        if (aqVar != null) {
            aqVar.mo88700f();
        }
        m156575H();
    }

    /* renamed from: K */
    private final void m156578K(SSLEngineResult sSLEngineResult, C11018a aVar, boolean z, boolean z2) {
        if (!SSLEngineResult.Status.CLOSED.equals(sSLEngineResult.getStatus()) && !SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING.equals(sSLEngineResult.getHandshakeStatus())) {
            if (!z && aVar.isEmpty()) {
                z = false;
            } else {
                return;
            }
        }
        if (z2) {
            C95297c cVar = this.f265408y;
            C60066jo joVar = (C60066jo) C60069jr.f162379n.createBuilder();
            joVar.copyOnWrite();
            C60069jr jrVar = (C60069jr) joVar.instance;
            jrVar.f162383c = 8;
            jrVar.f162381a |= 2;
            joVar.copyOnWrite();
            C60069jr jrVar2 = (C60069jr) joVar.instance;
            jrVar2.f162381a |= 512;
            jrVar2.f162390j = 3;
            int size = aVar.size();
            joVar.copyOnWrite();
            C60069jr jrVar3 = (C60069jr) joVar.instance;
            jrVar3.f162381a |= 128;
            jrVar3.f162388h = size;
            cVar.mo89225a(joVar);
        } else {
            C95297c cVar2 = this.f265408y;
            C60066jo joVar2 = (C60066jo) C60069jr.f162379n.createBuilder();
            joVar2.copyOnWrite();
            C60069jr jrVar4 = (C60069jr) joVar2.instance;
            jrVar4.f162383c = 8;
            jrVar4.f162381a |= 2;
            joVar2.copyOnWrite();
            C60069jr jrVar5 = (C60069jr) joVar2.instance;
            jrVar5.f162381a |= 512;
            jrVar5.f162390j = 3;
            int size2 = aVar.size();
            joVar2.copyOnWrite();
            C60069jr jrVar6 = (C60069jr) joVar2.instance;
            jrVar6.f162381a |= 64;
            jrVar6.f162387g = size2;
            cVar2.mo89225a(joVar2);
        }
        if (SSLEngineResult.Status.CLOSED.equals(sSLEngineResult.getStatus()) || SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING.equals(sSLEngineResult.getHandshakeStatus()) || (!z && aVar.isEmpty())) {
            throw new C94932d(String.format(Locale.US, "[%s] Fatal handshake error", new Object[]{C94876ay.m156554c(this.f265385b)}));
        } else if (!SSLEngineResult.Status.OK.equals(sSLEngineResult.getStatus()) || aVar.isEmpty()) {
            mo88760x(C94931c.m156728h());
        }
    }

    /* renamed from: L */
    private final void m156579L(int i) {
        if (this.f265406w.f36213d.get() == 11) {
            C95297c cVar = this.f265408y;
            C60066jo joVar = (C60066jo) C60069jr.f162379n.createBuilder();
            joVar.copyOnWrite();
            C60069jr jrVar = (C60069jr) joVar.instance;
            jrVar.f162383c = 10;
            jrVar.f162381a |= 2;
            joVar.copyOnWrite();
            C60069jr jrVar2 = (C60069jr) joVar.instance;
            jrVar2.f162381a |= 256;
            jrVar2.f162389i = i;
            cVar.mo89225a(joVar);
        }
    }

    /* renamed from: M */
    private final void m156580M(String str) {
        NotificationManager notificationManager = (NotificationManager) this.f265378M.getSystemService("notification");
        if (notificationManager != null) {
            C1839z b = C96460ar.m159822b(this.f265378M, "Watch", str, C96460ar.f269856c, C58833ax.m90834k(C124719q.GACS_DEVICE));
            b.mo5015d(16, true);
            notificationManager.notify(55, b.mo5013a());
        }
    }

    /* renamed from: N */
    private final void m156581N(boolean z) {
        new C90873ag(this.f265390g.mo83408n(this.f265385b.f265818a.getAddress()), this.f265392i, true != z ? "update-info" : "update-info-and-log-ble-start", new C94811a(this, z)).mo85223a(new C94878b(this, z));
    }

    /* renamed from: O */
    private final void m156582O(BluetoothGattCharacteristic bluetoothGattCharacteristic, C10992c cVar, byte[] bArr, String str, int i) {
        int i2 = 0;
        if (!mo88761y()) {
            int i3 = this.f265403t.f265299l.get() - 3;
            while (true) {
                int length = bArr.length;
                if (i2 < length) {
                    int i4 = i2 + i3;
                    this.f265407x.add(new C94877az(bluetoothGattCharacteristic, Arrays.copyOfRange(bArr, i2, Math.min(length, i4)), m156573F(bluetoothGattCharacteristic)));
                    i2 = i4;
                } else {
                    return;
                }
            }
        } else if (cVar == null) {
            C59104x d = f265367a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoBleConnection");
            ((C59052c) ((C59052c) d).mo56372aa(17317)).mo56389s("[%s] Not ready to encrypt", C94876ay.m156554c(this.f265385b));
            C95297c cVar2 = this.f265408y;
            C60066jo joVar = (C60066jo) C60069jr.f162379n.createBuilder();
            joVar.copyOnWrite();
            C60069jr jrVar = (C60069jr) joVar.instance;
            jrVar.f162383c = 4;
            jrVar.f162381a |= 2;
            joVar.copyOnWrite();
            C60069jr jrVar2 = (C60069jr) joVar.instance;
            jrVar2.f162381a |= 512;
            jrVar2.f162390j = 17;
            cVar2.mo89225a(joVar);
        } else {
            ArrayDeque arrayDeque = new ArrayDeque();
            try {
                Deque R = m156585R(this.f265406w, bArr);
                while (!R.isEmpty()) {
                    arrayDeque.addAll(m156574G((byte[]) R.remove(), cVar));
                }
                while (!arrayDeque.isEmpty()) {
                    byte[] bArr2 = (byte[]) arrayDeque.remove();
                    C58976aa aaVar = C58975e.f156826a;
                    C94876ay.m156554c(this.f265385b);
                    Base64.encodeToString(bArr2, 0);
                    this.f265407x.add(new C94877az(bluetoothGattCharacteristic, bArr2, m156573F(bluetoothGattCharacteristic)));
                }
            } catch (C94932d e) {
                C59104x c = f265367a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "BistoBleConnection");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(17316)).mo56354G("[%s] Unable to write %s characteristic", C94876ay.m156554c(this.f265385b), str);
                if (str.equals("control")) {
                    C94873av avVar = this.f265375H;
                    avVar.f265330i.addAndGet(1);
                    avVar.f265338q.set(true);
                } else if (str.equals("proxy")) {
                    C94873av avVar2 = this.f265375H;
                    avVar2.f265336o.addAndGet(1);
                    avVar2.f265338q.set(true);
                }
                C95297c cVar3 = this.f265408y;
                C60066jo joVar2 = (C60066jo) C60069jr.f162379n.createBuilder();
                joVar2.copyOnWrite();
                C60069jr jrVar3 = (C60069jr) joVar2.instance;
                jrVar3.f162383c = 11;
                jrVar3.f162381a |= 2;
                joVar2.copyOnWrite();
                C60069jr jrVar4 = (C60069jr) joVar2.instance;
                jrVar4.f162381a |= 512;
                jrVar4.f162390j = i;
                cVar3.mo89225a(joVar2);
                mo88750i(false);
            }
        }
    }

    /* renamed from: P */
    private final void m156583P(Deque deque) {
        if (this.f265380O == null) {
            C59104x d = f265367a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoBleConnection");
            ((C59052c) ((C59052c) d).mo56372aa(17323)).mo56352E("[%s] Skipping %d TTS packet(s)", C94876ay.m156554c(this.f265385b), deque.size());
            C95297c cVar = this.f265408y;
            C60066jo joVar = (C60066jo) C60069jr.f162379n.createBuilder();
            joVar.copyOnWrite();
            C60069jr jrVar = (C60069jr) joVar.instance;
            jrVar.f162383c = 11;
            jrVar.f162381a |= 2;
            joVar.copyOnWrite();
            C60069jr jrVar2 = (C60069jr) joVar.instance;
            jrVar2.f162381a |= 512;
            jrVar2.f162390j = 15;
            cVar.mo89225a(joVar);
            return;
        }
        C59071e eVar = f265367a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoBleConnection");
        ((C59052c) ((C59052c) b).mo56372aa(17319)).mo56352E("[%s] Sending %d TTS packet(s)", C94876ay.m156554c(this.f265385b), deque.size());
        if (!mo88761y()) {
            int i = this.f265403t.f265299l.get() - 3;
            byte[] Q = m156584Q(deque, i);
            while (Q != null) {
                this.f265407x.add(new C94877az(this.f265380O, Q, 1));
                m156572E(2, 2, Q, this.f265391h);
                Q = m156584Q(deque, i);
            }
        } else if (this.f265400q == null) {
            C59104x d2 = eVar.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "BistoBleConnection");
            ((C59052c) ((C59052c) d2).mo56372aa(17322)).mo56389s("[%s] Not ready to encrypt", C94876ay.m156554c(this.f265385b));
            C95297c cVar2 = this.f265408y;
            C60066jo joVar2 = (C60066jo) C60069jr.f162379n.createBuilder();
            joVar2.copyOnWrite();
            C60069jr jrVar3 = (C60069jr) joVar2.instance;
            jrVar3.f162383c = 4;
            jrVar3.f162381a |= 2;
            joVar2.copyOnWrite();
            C60069jr jrVar4 = (C60069jr) joVar2.instance;
            jrVar4.f162381a |= 512;
            jrVar4.f162390j = 17;
            cVar2.mo89225a(joVar2);
            return;
        } else {
            int a = this.f265406w.mo19475a();
            byte[] Q2 = m156584Q(deque, a);
            while (Q2 != null) {
                m156572E(2, 2, Q2, this.f265391h);
                ArrayDeque arrayDeque = new ArrayDeque();
                try {
                    Deque R = m156585R(this.f265406w, Q2);
                    while (!R.isEmpty()) {
                        arrayDeque.addAll(m156574G((byte[]) R.remove(), this.f265400q));
                    }
                    while (!arrayDeque.isEmpty()) {
                        byte[] bArr = (byte[]) arrayDeque.remove();
                        C94876ay.m156554c(this.f265385b);
                        Base64.encodeToString(bArr, 0);
                        this.f265407x.add(new C94877az(this.f265380O, bArr, 1));
                    }
                    Q2 = m156584Q(deque, a);
                } catch (C94932d e) {
                    C59104x c = f265367a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "BistoBleConnection");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(17321)).mo56389s("[%s] Unable to write TTS characteristic", C94876ay.m156554c(this.f265385b));
                    C94873av avVar = this.f265375H;
                    avVar.f265334m.addAndGet(1);
                    avVar.f265338q.set(true);
                    C95297c cVar3 = this.f265408y;
                    C60066jo joVar3 = (C60066jo) C60069jr.f162379n.createBuilder();
                    joVar3.copyOnWrite();
                    C60069jr jrVar5 = (C60069jr) joVar3.instance;
                    jrVar5.f162383c = 11;
                    jrVar5.f162381a |= 2;
                    joVar3.copyOnWrite();
                    C60069jr jrVar6 = (C60069jr) joVar3.instance;
                    jrVar6.f162381a |= 512;
                    jrVar6.f162390j = 15;
                    cVar3.mo89225a(joVar3);
                    mo88750i(false);
                    return;
                }
            }
        }
        mo88753l();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        throw r6;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006b */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] m156584Q(java.util.Deque r6, int r7) {
        /*
            java.lang.Object r0 = r6.poll()
            byte[] r0 = (byte[]) r0
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            com.google.android.apps.gsa.staticplugins.bisto.ac.d.f r2 = new com.google.android.apps.gsa.staticplugins.bisto.ac.d.f
            r2.<init>(r0)
            byte[] r0 = r2.mo88844a()
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x006c }
            int r3 = r0.length     // Catch:{ IOException -> 0x006c }
            int r4 = java.lang.Math.min(r3, r7)     // Catch:{ IOException -> 0x006c }
            r2.<init>(r4)     // Catch:{ IOException -> 0x006c }
            r2.write(r0)     // Catch:{ all -> 0x004e }
            int r7 = r7 - r3
            java.lang.Object r0 = r6.peek()     // Catch:{ all -> 0x004e }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x004e }
        L_0x0027:
            if (r0 == 0) goto L_0x0046
            int r3 = r0.length     // Catch:{ all -> 0x004e }
            int r3 = r3 + 2
            if (r3 > r7) goto L_0x0046
            com.google.android.apps.gsa.staticplugins.bisto.ac.d.f r3 = new com.google.android.apps.gsa.staticplugins.bisto.ac.d.f     // Catch:{ all -> 0x004e }
            r3.<init>(r0)     // Catch:{ all -> 0x004e }
            byte[] r0 = r3.mo88844a()     // Catch:{ all -> 0x004e }
            r6.poll()     // Catch:{ all -> 0x004e }
            r2.write(r0)     // Catch:{ all -> 0x004e }
            int r0 = r0.length     // Catch:{ all -> 0x004e }
            int r7 = r7 - r0
            java.lang.Object r0 = r6.peek()     // Catch:{ all -> 0x004e }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x004e }
            goto L_0x0027
        L_0x0046:
            byte[] r6 = r2.toByteArray()     // Catch:{ all -> 0x004e }
            r2.close()     // Catch:{ IOException -> 0x006c }
            return r6
        L_0x004e:
            r6 = move-exception
            r2.close()     // Catch:{ all -> 0x0053 }
            goto L_0x006b
        L_0x0053:
            r7 = move-exception
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x006b }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            r4 = 0
            r2[r4] = r3     // Catch:{ Exception -> 0x006b }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            java.lang.String r5 = "addSuppressed"
            java.lang.reflect.Method r2 = r3.getDeclaredMethod(r5, r2)     // Catch:{ Exception -> 0x006b }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x006b }
            r0[r4] = r7     // Catch:{ Exception -> 0x006b }
            r2.invoke(r6, r0)     // Catch:{ Exception -> 0x006b }
        L_0x006b:
            throw r6     // Catch:{ IOException -> 0x006c }
        L_0x006c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94887k.m156584Q(java.util.Deque, int):byte[]");
    }

    /* renamed from: R */
    private final Deque m156585R(C11022e eVar, byte[] bArr) {
        ArrayDeque arrayDeque = new ArrayDeque();
        int a = eVar.mo19475a();
        int i = 0;
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return arrayDeque;
            }
            int i2 = i + a;
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i, Math.min(length, i2));
            C11018a aVar = new C11018a(this.f265393j);
            SSLEngineResult e = eVar.mo19480e(new C11018a(copyOfRange), aVar);
            C58976aa aaVar = C58975e.f156826a;
            C94876ay.m156554c(this.f265385b);
            int length2 = copyOfRange.length;
            aVar.size();
            m156578K(e, aVar, false, true);
            arrayDeque.add(aVar.mo19468d());
            i = i2;
        }
    }

    /* renamed from: A */
    public final boolean mo88653A() {
        return this.f265380O != null;
    }

    /* renamed from: B */
    public final byte[] mo88743B(C10992c cVar, byte[] bArr, String str) {
        C10995f fVar;
        int i;
        if (cVar == null) {
            C59104x b = f265367a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoBleConnection");
            ((C59052c) ((C59052c) b).mo56372aa(17326)).mo56389s("[%s] Framing not initialized", C94876ay.m156554c(this.f265385b));
            C95297c cVar2 = this.f265408y;
            C60066jo joVar = (C60066jo) C60069jr.f162379n.createBuilder();
            joVar.copyOnWrite();
            C60069jr jrVar = (C60069jr) joVar.instance;
            jrVar.f162383c = 7;
            jrVar.f162381a |= 2;
            joVar.copyOnWrite();
            C60069jr jrVar2 = (C60069jr) joVar.instance;
            jrVar2.f162381a |= 512;
            jrVar2.f162390j = 17;
            cVar2.mo89225a(joVar);
            return null;
        }
        int length = bArr.length;
        boolean z = false;
        if (length == 0) {
            C10990a aVar = new C10990a();
            aVar.f36134a = new C10993d();
            aVar.mo19355b(128);
            fVar = aVar.mo19354a();
        } else if (length == 1) {
            C10990a aVar2 = new C10990a();
            aVar2.f36134a = new C10993d(bArr[0]);
            aVar2.mo19355b(256);
            fVar = aVar2.mo19354a();
        } else {
            C10993d dVar = new C10993d(bArr[0]);
            C10993d dVar2 = cVar.f36139a;
            if (dVar2 == null) {
                int i2 = true != dVar.mo19365d() ? 0 : 8;
                i = dVar.mo19363b() == 0 ? i2 | 5 : i2 | 64;
            } else {
                int i3 = true != dVar.mo19365d() ? 0 : 8;
                if (dVar.mo19363b() == 0) {
                    int i4 = i3 | 5;
                    if (dVar2.mo19365d()) {
                        int c = dVar.mo19364c();
                        int c2 = dVar2.mo19364c();
                        if ((c2 == 3 ? 0 : c2 + 1) == c) {
                            i = i4;
                        }
                    }
                    i = i4 | 2;
                } else {
                    i = dVar.mo19364c() == dVar2.mo19364c() ? dVar.mo19363b() == ((dVar2.mo19363b() + 1) & 31) ? i3 | 1 : i3 | 64 : i3 | 96;
                }
            }
            if (C10995f.m25999c(i, 2) || C10995f.m25999c(i, 4)) {
                cVar.f36139a = null;
                cVar.f36140b = new ArrayDeque();
            }
            if (C10995f.m25999c(i, 1)) {
                for (int i5 = 1; i5 < bArr.length; i5++) {
                    cVar.f36140b.add(Byte.valueOf(bArr[i5]));
                }
                cVar.f36139a = dVar;
            }
            C10990a aVar3 = new C10990a();
            aVar3.f36134a = dVar;
            aVar3.mo19355b(i);
            fVar = aVar3.mo19354a();
        }
        C58976aa aaVar = C58975e.f156826a;
        C94876ay.m156554c(this.f265385b);
        fVar.mo19356a();
        if (C10995f.m25999c(fVar.mo19356a(), 8)) {
            try {
                if (cVar.f36139a != null && cVar.f36139a.mo19365d()) {
                    z = true;
                }
                C58838bb.m90884s(z, "Invalid RxRecord");
                return C60747d.m92722d(cVar.f36140b);
            } catch (IllegalStateException e) {
                C59104x c3 = f265367a.mo56225c();
                c3.mo56378ag(C58975e.f156826a, "BistoBleConnection");
                ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e)).mo56372aa(17325)).mo56389s("[%s] Framing error", C94876ay.m156554c(this.f265385b));
                if ("Audio".equals(str)) {
                    C94873av avVar = this.f265375H;
                    avVar.f265335n.addAndGet(1);
                    avVar.f265338q.set(true);
                } else if ("Control".equals(str)) {
                    C94873av avVar2 = this.f265375H;
                    avVar2.f265331j.addAndGet(1);
                    avVar2.f265338q.set(true);
                } else if ("Proxy".equals(str)) {
                    C94873av avVar3 = this.f265375H;
                    avVar3.f265337p.addAndGet(1);
                    avVar3.f265338q.set(true);
                } else {
                    C94873av avVar4 = this.f265375H;
                    avVar4.f265333l.addAndGet(1);
                    avVar4.f265338q.set(true);
                }
                C95297c cVar3 = this.f265408y;
                C60066jo joVar2 = (C60066jo) C60069jr.f162379n.createBuilder();
                joVar2.copyOnWrite();
                C60069jr jrVar3 = (C60069jr) joVar2.instance;
                jrVar3.f162383c = 4;
                jrVar3.f162381a |= 2;
                joVar2.copyOnWrite();
                C60069jr jrVar4 = (C60069jr) joVar2.instance;
                jrVar4.f162381a |= 512;
                jrVar4.f162390j = 1;
                cVar3.mo89225a(joVar2);
            }
        }
        return null;
    }

    /* renamed from: C */
    public final byte[] mo88744C(byte[] bArr, boolean z) {
        C11018a aVar = new C11018a(this.f265393j);
        m156578K(this.f265406w.mo19477c(new C11018a(bArr), aVar), aVar, z, false);
        return aVar.mo19468d();
    }

    /* renamed from: D */
    public final void mo88654D() {
        C59104x b = f265367a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoBleConnection");
        ((C59052c) ((C59052c) b).mo56372aa(17313)).mo56352E("[%s] shutdown immediately with reason: %d", C94876ay.m156554c(this.f265385b), 6);
        if (this.f265391h.mo83555j(166)) {
            m156580M("Disconnecting, reason: Bluetooth off");
        }
        this.f265375H.mo88726i();
        C94868aq aqVar = this.f265403t;
        if (aqVar != null) {
            C59104x b2 = C94868aq.f265285a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "BistoGattHelper");
            ((C59052c) ((C59052c) b2).mo56372aa(17411)).mo56389s("[%s] close immediately", C94876ay.m156555d(aqVar.f265313z));
            if (!aqVar.f265298k.getAndSet(true)) {
                aqVar.f265308u = new CountDownLatch(1);
                synchronized (aqVar.f265311x) {
                    aqVar.f265312y = false;
                }
                aqVar.f265297j.set(false);
                aqVar.f265296i.set(false);
                aqVar.f265289A = new C94877az(1);
                aqVar.mo88699e();
                aqVar.f265309v.execute(new C94896t(aqVar));
                aqVar.mo88703i();
            }
        }
        m156575H();
        m156576I(6);
    }

    /* renamed from: a */
    public final C94937e mo88655a() {
        C94963b bVar = this.f265394k;
        if (bVar == null) {
            return null;
        }
        return bVar.mo88871a();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo88745b() {
        C94868aq aqVar = this.f265403t;
        UUID uuid = C94872au.f265314a;
        aqVar.mo88698d();
        try {
            C95013d b = aqVar.mo88697b();
            C95012c b2 = b.mo88920b(uuid);
            if (b2 != null) {
                aqVar.f265294g.unlock();
                this.f265395l = this.f265403t.mo88696a(b2, C94872au.f265316c);
                this.f265396m = this.f265403t.mo88696a(b2, C94872au.f265317d);
                C58976aa aaVar = C58975e.f156826a;
                C94876ay.m156554c(this.f265385b);
                try {
                    this.f265398o = this.f265403t.mo88696a(b2, C94872au.f265320g);
                    this.f265381P = this.f265403t.mo88696a(b2, C94872au.f265321h);
                } catch (C94893q unused) {
                    C59104x b3 = f265367a.mo56224b();
                    b3.mo56378ag(C58975e.f156826a, "BistoBleConnection");
                    ((C59052c) ((C59052c) b3).mo56372aa(17278)).mo56389s("[%s] Proxy characteristics not available", C94876ay.m156554c(this.f265385b));
                }
                C94876ay.m156554c(this.f265385b);
                try {
                    this.f265380O = this.f265403t.mo88696a(b2, C94872au.f265319f);
                } catch (C94893q unused2) {
                    C59104x b4 = f265367a.mo56224b();
                    b4.mo56378ag(C58975e.f156826a, "BistoBleConnection");
                    ((C59052c) ((C59052c) b4).mo56372aa(17277)).mo56389s("[%s] TTS not available", C94876ay.m156554c(this.f265385b));
                    C95297c cVar = this.f265408y;
                    C60066jo joVar = (C60066jo) C60069jr.f162379n.createBuilder();
                    joVar.copyOnWrite();
                    C60069jr jrVar = (C60069jr) joVar.instance;
                    jrVar.f162383c = 11;
                    jrVar.f162381a |= 2;
                    joVar.copyOnWrite();
                    C60069jr jrVar2 = (C60069jr) joVar.instance;
                    jrVar2.f162381a |= 512;
                    jrVar2.f162390j = 15;
                    cVar.mo89225a(joVar);
                }
                C94876ay.m156554c(this.f265385b);
                if (!this.f265391h.mo83553h("disableEncryption")) {
                    C59104x b5 = f265367a.mo56224b();
                    b5.mo56378ag(C58975e.f156826a, "BistoBleConnection");
                    ((C59052c) ((C59052c) b5).mo56372aa(17274)).mo56389s("[%s] Looking for crypto", C94876ay.m156554c(this.f265385b));
                    try {
                        this.f265397n = this.f265403t.mo88696a(b2, C94872au.f265318e);
                    } catch (C94893q e) {
                        C59104x c = f265367a.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "BistoBleConnection");
                        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(17276)).mo56389s("[%s] Crypto not available", C94876ay.m156554c(this.f265385b));
                        C95297c cVar2 = this.f265408y;
                        C60066jo joVar2 = (C60066jo) C60069jr.f162379n.createBuilder();
                        joVar2.copyOnWrite();
                        C60069jr jrVar3 = (C60069jr) joVar2.instance;
                        jrVar3.f162383c = 11;
                        jrVar3.f162381a |= 2;
                        joVar2.copyOnWrite();
                        C60069jr jrVar4 = (C60069jr) joVar2.instance;
                        jrVar4.f162381a |= 512;
                        jrVar4.f162390j = 16;
                        cVar2.mo89225a(joVar2);
                    }
                    C59104x b6 = f265367a.mo56224b();
                    b6.mo56378ag(C58975e.f156826a, "BistoBleConnection");
                    ((C59052c) ((C59052c) b6).mo56372aa(17275)).mo56389s("[%s] found crypto characteristic.", C94876ay.m156554c(this.f265385b));
                    return;
                }
                return;
            }
            throw new C94893q(String.format(Locale.US, "[%s] Couldn't find service: %s", new Object[]{C94876ay.m156555d(b), uuid}), uuid);
        } catch (Throwable th) {
            aqVar.f265294g.unlock();
            throw th;
        }
    }

    /* renamed from: c */
    public final void mo88657c(C94936d dVar) {
        if (dVar == C94936d.AUDIO_INPUT) {
            this.f265388e.mo88848b();
            return;
        }
        C59104x d = f265367a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "BistoBleConnection");
        ((C59052c) ((C59052c) d).mo56372aa(17279)).mo56389s("Unsupported category: %s", dVar);
    }

    /* renamed from: d */
    public final void mo88658d(C94936d dVar) {
        if (dVar == C94936d.TTS_OUTPUT) {
            mo88746e();
            return;
        }
        C59104x d = f265367a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "BistoBleConnection");
        ((C59052c) ((C59052c) d).mo56372aa(17280)).mo56389s("Unsupported category: %s", dVar);
    }

    /* renamed from: e */
    public final void mo88746e() {
        Iterator it = this.f265407x.iterator();
        while (it.hasNext()) {
            C94877az azVar = (C94877az) it.next();
            if (azVar.f265354d == 5 && azVar.f265351a == this.f265380O) {
                it.remove();
            }
        }
    }

    /* renamed from: f */
    public final void mo88747f() {
        C59104x b = f265367a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoBleConnection");
        ((C59052c) ((C59052c) b).mo56372aa(17281)).mo56389s("[%s] Subscribing to control", C94876ay.m156554c(this.f265385b));
        mo88758v(this.f265395l);
        mo88758v(this.f265396m);
        mo88758v(this.f265398o);
        C94963b a = this.f265384S.a(this.f265385b.f265818a.getAddress(), this.f265379N, this, this.f265408y);
        this.f265394k = a;
        a.mo88871a().mo88801c();
        if (this.f265391h.mo83555j(166)) {
            m156580M("Connected");
        }
    }

    /* renamed from: g */
    public final void mo88748g() {
        C94868aq aqVar;
        this.f265375H.mo88722e();
        try {
            aqVar = this.f265403t;
            C95010a aVar = this.f265385b;
            boolean z = this.f265383R.get();
            boolean z2 = this.f265373F.get();
            try {
                if (!aqVar.f265308u.await(C94868aq.f265286b, TimeUnit.MILLISECONDS)) {
                    C59104x d = C94868aq.f265285a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "BistoGattHelper");
                    ((C59052c) ((C59052c) d).mo56372aa(17412)).mo56389s("[%s] Shutdown not finished in time, moving on.", C94876ay.m156555d(aqVar.f265313z));
                }
            } catch (InterruptedException e) {
                C59104x c = C94868aq.f265285a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "BistoGattHelper");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(17413)).mo56389s("[%s] GATT close wait interrupted", C94876ay.m156555d(aqVar.f265313z));
            }
            if (aqVar.f265305r == null && !aqVar.f265304q.mo83555j(162)) {
                aqVar.f265305r = C94875ax.m156548d(Looper.myLooper(), new C94867ap(aqVar));
            }
            C94875ax axVar = aqVar.f265305r;
            if (axVar != null) {
                axVar.mo88730c();
            }
            aqVar.mo88698d();
            C95013d a = aVar.mo88917a(aqVar.f265292e, aqVar.f265290B);
            if (a != null) {
                aqVar.f265313z = a;
                C94875ax axVar2 = aqVar.f265305r;
                if (axVar2 != null) {
                    axVar2.mo88729b();
                }
                aqVar.f265294g.unlock();
                aqVar.f265301n.set(0);
                aqVar.f265300m.set(0);
                aqVar.f265298k.set(false);
                aqVar.f265296i.set(false);
                aqVar.f265302o.set(z);
                aqVar.f265303p.set(z2);
                this.f265382Q.set(false);
                return;
            }
            String address = aVar.f265818a.getAddress();
            throw new C94893q("Failed to connect to device: " + address);
        } catch (C94893q e2) {
            C59104x c2 = f265367a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "BistoBleConnection");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(17282)).mo56354G("[%s] Failed to connect to device: %s", C94876ay.m156554c(this.f265385b), this.f265385b.f265818a.getAddress());
            this.f265382Q.set(false);
            mo88754m(Integer.valueOf(e2.f265431a));
            mo88755o();
        } catch (Throwable th) {
            aqVar.f265294g.unlock();
            throw th;
        }
    }

    /* renamed from: h */
    public final void mo88749h(C94877az azVar) {
        this.f265407x.add(azVar);
        mo88753l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo88750i(boolean z) {
        byte[] bArr;
        C59104x c = f265367a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BistoBleConnection");
        ((C59052c) ((C59052c) c).mo56372aa(17286)).mo56355H("[%s] Fatal crypto error: isTimeout? %b", C94876ay.m156554c(this.f265385b), z);
        m156579L(1);
        C11018a aVar = new C11018a(this.f265393j);
        if (z) {
            bArr = C94931c.m156728h();
        } else {
            this.f265406w.mo19484i(aVar);
            byte[] d = aVar.mo19468d();
            C48123t tVar = (C48123t) C48124u.f124543f.createBuilder();
            C48091by byVar = (C48091by) C48092bz.f124458d.createBuilder();
            byVar.copyOnWrite();
            ((C48092bz) byVar.instance).f124461b = 2;
            byVar.copyOnWrite();
            ((C48092bz) byVar.instance).f124460a = C48120q.m85186a(4);
            C63088z A = C63088z.m96139A(d);
            byVar.copyOnWrite();
            ((C48092bz) byVar.instance).f124462c = A;
            tVar.copyOnWrite();
            C48124u uVar = (C48124u) tVar.instance;
            C48092bz bzVar = (C48092bz) byVar.build();
            bzVar.getClass();
            uVar.f124547c = bzVar;
            uVar.f124546b = 3;
            bArr = ((C48124u) tVar.build()).toByteArray();
        }
        mo88760x(bArr);
        this.f265387d.mo88848b();
        this.f265388e.mo88848b();
        this.f265389f.mo88848b();
        this.f265399p = null;
        this.f265400q = null;
        this.f265401r = null;
        this.f265405v.mo88840a();
        mo88664t(4);
    }

    /* renamed from: j */
    public final void mo88751j(boolean z) {
        if (z) {
            C95297c cVar = this.f265408y;
            C60066jo joVar = (C60066jo) C60069jr.f162379n.createBuilder();
            joVar.copyOnWrite();
            C60069jr jrVar = (C60069jr) joVar.instance;
            jrVar.f162383c = 14;
            jrVar.f162381a |= 2;
            cVar.mo89225a(joVar);
        }
    }

    /* renamed from: k */
    public final void mo88752k(String str, byte[] bArr) {
        if (this.f265391h.mo83553h("logControlData")) {
            C59071e eVar = f265367a;
            C59104x b = eVar.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoBleConnection");
            ((C59052c) ((C59052c) b).mo56372aa(17302)).mo56359L("[%s] %s %s", C94876ay.m156554c(this.f265385b), str, Base64.encodeToString(bArr, 0));
            C59104x b2 = eVar.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "BistoBleConnection");
            ((C59052c) ((C59052c) b2).mo56372aa(17303)).mo56389s("[%s] *ENDMSG*", C94876ay.m156554c(this.f265385b));
        }
    }

    /* renamed from: l */
    public final void mo88753l() {
        synchronized (this.f265409z) {
            if (!this.f265407x.isEmpty() && !this.f265370C) {
                this.f265370C = true;
                C94877az azVar = (C94877az) this.f265407x.poll();
                if (azVar != null) {
                    this.f265403t.mo88702h(azVar);
                }
            }
        }
    }

    /* renamed from: m */
    public final void mo88754m(Integer num) {
        if (this.f265373F.get()) {
            C48113j jVar = (C48113j) C48115l.f124522j.createBuilder();
            jVar.copyOnWrite();
            ((C48115l) jVar.instance).f124524a = C48112i.m85182a(4);
            C63088z E = C63088z.m96143E(this.f265368A.mo19414g());
            jVar.copyOnWrite();
            ((C48115l) jVar.instance).f124525b = E;
            int intValue = num.intValue();
            jVar.copyOnWrite();
            ((C48115l) jVar.instance).f124530g = intValue;
            C48113j jVar2 = (C48113j) C48115l.f124522j.createBuilder();
            jVar2.copyOnWrite();
            ((C48115l) jVar2.instance).f124524a = C48112i.m85182a(7);
            C63088z E2 = C63088z.m96143E(this.f265368A.mo19414g());
            jVar2.copyOnWrite();
            ((C48115l) jVar2.instance).f124525b = E2;
            int intValue2 = num.intValue();
            jVar2.copyOnWrite();
            ((C48115l) jVar2.instance).f124530g = intValue2;
            jVar2.copyOnWrite();
            ((C48115l) jVar2.instance).f124531h = C48114k.m85184a(7);
            C11017v.m26077f(jVar, this.f265369B, this.f265368A, true);
            C11017v.m26077f(jVar2, this.f265369B, this.f265368A, true);
            Optional f = this.f265368A.mo19413f(this.f265385b.f265818a.getAddress());
            if (f.isEmpty()) {
                C59104x b = f265367a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "BistoBleConnection");
                ((C59052c) ((C59052c) b).mo56372aa(17304)).mo56386p("Device id is not available because the device is not registered with the communicator. Not updating its state in the communicator.");
                return;
            }
            this.f265368A.mo19411d(C11017v.m26072a((String) f.get(), 5, this.f265368A.mo19407a(), num));
        }
    }

    /* renamed from: n */
    public final void mo88661n() {
        if (this.f265371D.get() && this.f265372E.getAndSet(false)) {
            mo88747f();
        }
        this.f265408y.mo89229e(Boolean.valueOf(!this.f265372E.get()));
        m156581N(false);
        C95013d dVar = this.f265403t.f265313z;
        if (dVar != null) {
            BluetoothGatt bluetoothGatt = dVar.f265823b;
            if (bluetoothGatt != null) {
                bluetoothGatt.setPreferredPhy(2, 2, 0);
            } else {
                ((C59052c) ((C59052c) C95013d.f265822a.mo56225c()).mo56372aa(17862)).mo56386p("Unable to schedule onPhyUpdate. BluetoothGattCallback is null.");
            }
        }
        C94963b bVar = this.f265394k;
        if (bVar != null) {
            bVar.mo88871a().mo88803e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo88755o() {
        if (this.f265371D.get()) {
            int i = 1;
            if (!this.f265382Q.getAndSet(true)) {
                m156577J();
                if (this.f265373F.get()) {
                    C59104x b = f265367a.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "BistoBleConnection");
                    ((C59052c) ((C59052c) b).mo56372aa(17308)).mo56386p("Device is using connection sequencing, not trying to reconnect if shutdown.");
                    return;
                }
                C95022d dVar = this.f265404u;
                int i2 = dVar.f265851a;
                if (i2 <= 3) {
                    dVar.f265851a = i2 + 1;
                } else {
                    double pow = Math.pow(2.0d, (double) (i2 - 3));
                    dVar.f265851a++;
                    i = Math.min((int) pow, 300);
                }
                C58976aa aaVar = C58975e.f156826a;
                try {
                    this.f265374G.schedule(new C94880d(this), Duration.ofSeconds((long) i).toMillis());
                    return;
                } catch (IllegalStateException e) {
                    C59104x d = f265367a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "BistoBleConnection");
                    ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(17307)).mo56386p("Timer was already cancelled, re-scheduling with new timer");
                    Timer timer = new Timer();
                    this.f265374G = timer;
                    timer.schedule(new C94881e(this), Duration.ofSeconds((long) i).toMillis());
                    return;
                }
            }
        }
        C58976aa aaVar2 = C58975e.f156826a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo88756p() {
        mo88749h(new C94877az(8));
    }

    /* renamed from: q */
    public final void mo88662q(C94936d dVar, Deque deque) {
        if (dVar == C94936d.TTS_OUTPUT) {
            m156583P(deque);
            return;
        }
        Iterator it = deque.iterator();
        while (it.hasNext()) {
            mo88663s(dVar, (byte[]) it.next());
        }
    }

    /* renamed from: r */
    public final void mo88757r() {
        this.f265368A.mo19422o(this.f265385b.f265818a, 2);
        if (this.f265373F.get()) {
            C48113j jVar = (C48113j) C48115l.f124522j.createBuilder();
            jVar.copyOnWrite();
            ((C48115l) jVar.instance).f124524a = C48112i.m85182a(7);
            C63088z E = C63088z.m96143E(this.f265368A.mo19414g());
            jVar.copyOnWrite();
            ((C48115l) jVar.instance).f124525b = E;
            jVar.copyOnWrite();
            ((C48115l) jVar.instance).f124531h = C48114k.m85184a(4);
            C11017v.m26077f(jVar, this.f265369B, this.f265368A, true);
        }
    }

    /* renamed from: s */
    public final void mo88663s(C94936d dVar, byte[] bArr) {
        C94936d dVar2 = C94936d.CONTROL_INPUT;
        int ordinal = dVar.ordinal();
        if (ordinal == 1) {
            C94938f fVar = new C94938f(bArr);
            BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f265395l;
            if (bluetoothGattCharacteristic != null) {
                m156582O(bluetoothGattCharacteristic, this.f265399p, fVar.mo88844a(), "control", 19);
                mo88752k("Outgoing control:", fVar.f265572a);
                m156572E(2, 1, fVar.mo88844a(), this.f265391h);
                mo88753l();
            }
        } else if (ordinal == 3) {
            mo88760x(bArr);
        } else if (ordinal == 5) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(bArr);
            m156583P(arrayDeque);
        } else if (ordinal != 7) {
            C59104x d = f265367a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoBleConnection");
            ((C59052c) ((C59052c) d).mo56372aa(17309)).mo56389s("Can't write for category: %s", dVar);
        } else {
            C94938f fVar2 = new C94938f(bArr);
            BluetoothGattCharacteristic bluetoothGattCharacteristic2 = this.f265381P;
            if (bluetoothGattCharacteristic2 != null) {
                m156582O(bluetoothGattCharacteristic2, this.f265401r, fVar2.mo88844a(), "proxy", 21);
                m156572E(2, 4, fVar2.mo88844a(), this.f265391h);
                mo88753l();
            }
        }
    }

    /* renamed from: t */
    public final void mo88664t(int i) {
        String str;
        C59104x b = f265367a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoBleConnection");
        ((C59052c) ((C59052c) b).mo56372aa(17312)).mo56352E("[%s] shutdown with reason: %d", C94876ay.m156554c(this.f265385b), i);
        if (this.f265391h.mo83555j(166)) {
            switch (i) {
                case 1:
                    str = "Acl disconnected";
                    break;
                case 2:
                    str = "Assistant disabled";
                    break;
                case 3:
                    str = "Service ended";
                    break;
                case 4:
                    str = "Crypto error";
                    break;
                case 5:
                    str = "Stop for new psk";
                    break;
                case 6:
                    str = "Bluetooth off";
                    break;
                case 7:
                    str = "Disconnected data item";
                    break;
                case 8:
                    str = "Disconnected for reconnection";
                    break;
                default:
                    str = "Disconnected data item for reconnection";
                    break;
            }
            m156580M("Disconnecting, reason: ".concat(str));
        }
        this.f265375H.mo88726i();
        m156577J();
        m156576I(i);
        Iterator it = this.f265376I.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            C94876ay.m156554c(this.f265385b);
            Object obj = pair.first;
            Object obj2 = pair.second;
        }
        this.f265376I.clear();
    }

    /* renamed from: u */
    public final void mo88665u(boolean z, boolean z2, boolean z3) {
        C59104x b = f265367a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoBleConnection");
        String c = C94876ay.m156554c(this.f265385b);
        String name = this.f265385b.f265818a.getName();
        String address = this.f265385b.f265818a.getAddress();
        Boolean valueOf = Boolean.valueOf(z);
        Boolean valueOf2 = Boolean.valueOf(z3);
        ((C59052c) ((C59052c) b).mo56372aa(17314)).mo56361N("[%s] Start connection: %s, %s : oobeCompleted: %b, usingConnectionSequencing: %b", c, name, address, valueOf, valueOf2);
        if (this.f265391h.mo83555j(166)) {
            m156580M("Connecting");
        }
        this.f265408y.mo89230f(valueOf);
        this.f265408y.mo89229e(valueOf);
        this.f265408y.f266637a.set(valueOf2.booleanValue());
        this.f265375H.mo88724g();
        this.f265371D.set(true);
        if (!z) {
            this.f265372E.set(true);
        }
        this.f265383R.set(z2);
        this.f265373F.set(z3);
        mo88748g();
        m156581N(true);
    }

    /* renamed from: v */
    public final void mo88758v(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (bluetoothGattCharacteristic != null) {
            mo88749h(new C94877az(4, bluetoothGattCharacteristic));
        }
    }

    /* renamed from: w */
    public final void mo88759w(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (bluetoothGattCharacteristic != null) {
            mo88749h(new C94877az(7, bluetoothGattCharacteristic));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo88760x(byte[] bArr) {
        if (this.f265397n == null) {
            C95297c cVar = this.f265408y;
            C60066jo joVar = (C60066jo) C60069jr.f162379n.createBuilder();
            joVar.copyOnWrite();
            C60069jr jrVar = (C60069jr) joVar.instance;
            jrVar.f162383c = 11;
            jrVar.f162381a = 2 | jrVar.f162381a;
            joVar.copyOnWrite();
            C60069jr jrVar2 = (C60069jr) joVar.instance;
            jrVar2.f162381a |= 512;
            jrVar2.f162390j = 16;
            cVar.mo89225a(joVar);
            return;
        }
        m156572E(2, 3, bArr, this.f265391h);
        ArrayDeque arrayDeque = new ArrayDeque(m156574G(bArr, this.f265402s));
        while (!arrayDeque.isEmpty()) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            C58976aa aaVar = C58975e.f156826a;
            C94876ay.m156554c(this.f265385b);
            Base64.encodeToString(bArr2, 0);
            this.f265407x.add(new C94877az(this.f265397n, bArr2, 2));
            C94873av avVar = this.f265375H;
            avVar.f265322a.addAndGet(1);
            avVar.f265338q.set(true);
        }
        mo88753l();
    }

    /* renamed from: y */
    public final boolean mo88761y() {
        return this.f265397n != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        return false;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo88762z() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.apps.gsa.staticplugins.bisto.ac.a.aq r0 = r2.f265403t     // Catch:{ all -> 0x0025 }
            android.bluetooth.BluetoothGattCharacteristic r1 = r2.f265397n     // Catch:{ all -> 0x0025 }
            boolean r0 = r0.mo88710p(r1)     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0022
            com.google.android.apps.gsa.staticplugins.bisto.ac.a.aq r0 = r2.f265403t     // Catch:{ all -> 0x0025 }
            android.bluetooth.BluetoothGattCharacteristic r1 = r2.f265395l     // Catch:{ all -> 0x0025 }
            boolean r0 = r0.mo88710p(r1)     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0022
            com.google.android.apps.gsa.staticplugins.bisto.ac.a.aq r0 = r2.f265403t     // Catch:{ all -> 0x0025 }
            android.bluetooth.BluetoothGattCharacteristic r1 = r2.f265396m     // Catch:{ all -> 0x0025 }
            boolean r0 = r0.mo88710p(r1)     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0022
            monitor-exit(r2)
            r0 = 1
            return r0
        L_0x0022:
            monitor-exit(r2)
            r0 = 0
            return r0
        L_0x0025:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94887k.mo88762z():boolean");
    }
}
