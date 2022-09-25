package com.google.android.apps.gsa.shared.bisto;

import android.os.SystemClock;
import android.util.Base64;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9391a.C124539a;
import com.google.android.p10712d.C142509hz;
import com.google.android.p10712d.C142512ib;
import com.google.android.p10712d.C142513ic;
import com.google.android.p10712d.C142514id;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.C63088z;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.shared.bisto.ba */
/* compiled from: PG */
public final class C89644ba implements C89625aw {

    /* renamed from: b */
    public static final C59071e f242727b = C59071e.m91332i("com.google.android.apps.gsa.shared.bisto.ba");

    /* renamed from: j */
    private static final Object f242728j = new Object();

    /* renamed from: k */
    private static long f242729k = -1;

    /* renamed from: c */
    protected final int f242730c;

    /* renamed from: d */
    protected final int f242731d;

    /* renamed from: e */
    protected final ScheduledExecutorService f242732e;

    /* renamed from: f */
    protected final UUID f242733f;

    /* renamed from: g */
    public final AtomicReference f242734g = new AtomicReference();

    /* renamed from: h */
    public final C89626ax f242735h;

    /* renamed from: i */
    public final C124539a f242736i;

    /* renamed from: l */
    private final Executor f242737l;

    /* renamed from: m */
    private final Object f242738m = new Object();

    /* renamed from: n */
    private final boolean f242739n;

    /* renamed from: o */
    private C60870cx f242740o;

    /* renamed from: p */
    private C60870cx f242741p = null;

    public C89644ba(C124539a aVar, UUID uuid, int i, int i2, C89626ax axVar, boolean z, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f242733f = uuid;
        this.f242736i = aVar;
        aVar.f343619a.getAddress();
        this.f242732e = scheduledExecutorService;
        this.f242737l = executor;
        this.f242730c = i;
        this.f242731d = i2;
        this.f242735h = axVar;
        this.f242739n = z;
    }

    /* renamed from: f */
    public static final void m145922f(C89653h hVar) {
        if (hVar != null) {
            C58976aa aaVar = C58975e.f156826a;
            try {
                hVar.f242763d.f343621b.close();
            } catch (IOException e) {
                C59104x d = f242727b.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ProtoExchangeSocketImpl");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(10306)).mo56386p("Failed to close socket");
            }
        }
    }

    /* renamed from: a */
    public final C60870cx mo83527a() {
        synchronized (this.f242738m) {
            C58976aa aaVar = C58975e.f156826a;
            C60870cx cxVar = this.f242741p;
            if (cxVar == null || cxVar.isDone()) {
                C60870cx cxVar2 = this.f242740o;
                if (cxVar2 != null) {
                    C59104x c = f242727b.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "ProtoExchangeSocketImpl");
                    ((C59052c) ((C59052c) c).mo56372aa(10293)).mo56386p("creating thread; connectFuture should be null");
                    cxVar2.cancel(false);
                    this.f242740o = null;
                }
                SettableFuture settableFuture = new SettableFuture();
                this.f242740o = settableFuture;
                this.f242741p = C60856cj.m92903l(new C89627ay(this, settableFuture), this.f242737l);
                return settableFuture;
            }
            C59104x d = f242727b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ProtoExchangeSocketImpl");
            ((C59052c) ((C59052c) d).mo56372aa(10294)).mo56386p("Server already started.");
            C60870cx cxVar3 = this.f242740o;
            if (cxVar3 != null) {
                return cxVar3;
            }
            C60870cx h = C60856cj.m92899h(new Exception("null connectFuture"));
            return h;
        }
    }

    /* renamed from: b */
    public final String mo83528b() {
        C124539a aVar = this.f242736i;
        return aVar == null ? "null" : aVar.f343619a.getName();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0012, code lost:
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0012, code lost:
        r9 = r9;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo83529c(com.google.android.apps.gsa.shared.bisto.C89653h r17) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            java.lang.String r3 = "ProtoExchangeSocketImpl"
            int r0 = r1.f242731d
            int r4 = r1.f242730c
            byte[] r4 = new byte[r4]
            r5 = 0
            r6 = 4
        L_0x000e:
            r7 = 4
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x0012:
            boolean r11 = java.lang.Thread.interrupted()
            r14 = 0
            r15 = 1
            if (r11 != 0) goto L_0x0116
            com.google.android.apps.search.assistant.surfaces.bisto.c.a.b r11 = r2.f242763d
            android.bluetooth.BluetoothSocket r11 = r11.f343621b
            boolean r11 = r11.isConnected()
            if (r11 == 0) goto L_0x0116
            int r11 = r7 - r8
            java.io.InputStream r14 = r2.f242761b     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            if (r14 != 0) goto L_0x0048
            com.google.common.f.e r14 = com.google.android.apps.gsa.shared.bisto.C89653h.f242760a     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            com.google.common.f.x r14 = r14.mo56224b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            java.lang.String r12 = "CachedBluetoothSocket"
            r14.mo56378ag(r13, r12)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            java.lang.String r12 = "Caching input stream"
            r13 = 10208(0x27e0, float:1.4304E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56372aa(r13)).mo56386p(r12)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            com.google.android.apps.search.assistant.surfaces.bisto.c.a.b r12 = r2.f242763d     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            android.bluetooth.BluetoothSocket r12 = r12.f343621b     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            java.io.InputStream r12 = r12.getInputStream()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            r2.f242761b = r12     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
        L_0x0048:
            java.io.InputStream r12 = r2.f242761b     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            if (r12 != 0) goto L_0x004e
            r11 = -1
            goto L_0x0052
        L_0x004e:
            int r11 = r12.read(r4, r8, r11)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
        L_0x0052:
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            if (r11 <= 0) goto L_0x0012
            int r8 = r8 + r11
            int r11 = r1.f242731d     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            if (r0 == r11) goto L_0x005f
            if (r9 <= 0) goto L_0x005f
            if (r10 > 0) goto L_0x00bb
        L_0x005f:
            if (r8 != r6) goto L_0x00bb
            byte r0 = r4[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            byte r9 = r4[r15]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            r7 = 2
            byte r8 = r4[r7]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            r7 = r8 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 8
            r8 = 3
            byte r10 = r4[r8]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            r8 = r10 & 255(0xff, float:3.57E-43)
            r7 = r7 | r8
            int r8 = r1.f242730c     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            if (r7 < r8) goto L_0x0094
            com.google.common.f.e r8 = f242727b     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            com.google.common.f.x r8 = r8.mo56225c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            r8.mo56378ag(r10, r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            r10 = 10304(0x2840, float:1.4439E-41)
            com.google.common.f.x r8 = r8.mo56372aa(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            java.lang.String r10 = "messageSize=%d! header=%s"
            java.lang.String r11 = java.util.Arrays.toString(r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            r8.mo56395y(r10, r7, r11)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
        L_0x0094:
            int r8 = r1.f242731d     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            if (r0 == r8) goto L_0x009d
            if (r9 <= 0) goto L_0x009d
            r10 = r7
            r8 = 0
            goto L_0x00bb
        L_0x009d:
            com.google.common.f.e r0 = f242727b     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            r0.mo56378ag(r7, r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            r7 = 10303(0x283f, float:1.4438E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r7)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            java.lang.String r7 = "Received invalid header"
            r0.mo56386p(r7)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            int r0 = r1.f242731d     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            goto L_0x000e
        L_0x00bb:
            int r11 = r1.f242731d     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            if (r0 == r11) goto L_0x0012
            if (r9 <= 0) goto L_0x0012
            if (r8 != r10) goto L_0x0012
            com.google.common.f.e r7 = f242727b     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            com.google.common.f.x r7 = r7.mo56224b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            r7.mo56378ag(r8, r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            r8 = 10299(0x283b, float:1.4432E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            java.lang.String r8 = "Received full message"
            r7.mo56386p(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            byte[] r7 = java.util.Arrays.copyOf(r4, r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            r1.mo83531e(r15, r0, r9, r7)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            com.google.android.apps.gsa.shared.bisto.ax r8 = r1.f242735h     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            r8.mo83497b(r0, r9, r7)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            int r0 = r1.f242731d     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0102, IOException -> 0x00ed }
            goto L_0x000e
        L_0x00ed:
            r0 = move-exception
            r14 = r0
            com.google.common.f.e r0 = f242727b
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r3)
            java.lang.String r3 = "Error reading stream, exiting loop"
            r4 = 10301(0x283d, float:1.4435E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r14)).mo56372aa(r4)).mo56386p(r3)
            goto L_0x0116
        L_0x0102:
            r0 = move-exception
            r14 = r0
            com.google.common.f.e r0 = f242727b
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r3)
            java.lang.String r3 = "Index out of bounds reading stream, exiting loop"
            r4 = 10300(0x283c, float:1.4433E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r14)).mo56372aa(r4)).mo56386p(r3)
        L_0x0116:
            r3 = 3
            java.lang.Object[] r0 = new java.lang.Object[r3]
            boolean r3 = java.lang.Thread.interrupted()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r0[r5] = r3
            com.google.android.apps.search.assistant.surfaces.bisto.c.a.b r2 = r2.f242763d
            android.bluetooth.BluetoothSocket r2 = r2.f343621b
            boolean r2 = r2.isConnected()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0[r15] = r2
            r2 = 2
            r0[r2] = r14
            java.lang.String r2 = "Exit loop, interrupt %b, connected %b, Exception %s"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.bisto.C89644ba.mo83529c(com.google.android.apps.gsa.shared.bisto.h):java.lang.String");
    }

    /* renamed from: d */
    public final boolean mo83530d() {
        C89653h hVar = (C89653h) this.f242734g.get();
        return hVar != null && hVar.f242763d.f343621b.isConnected();
    }

    /* renamed from: e */
    public final void mo83531e(int i, int i2, int i3, byte[] bArr) {
        if (this.f242739n) {
            synchronized (f242728j) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = f242729k;
                long j2 = 0;
                if (j > 0) {
                    j2 = elapsedRealtime - j;
                }
                f242729k = elapsedRealtime;
                C142509hz hzVar = (C142509hz) C142512ib.f386720f.createBuilder();
                hzVar.copyOnWrite();
                C142512ib ibVar = (C142512ib) hzVar.instance;
                ibVar.f386725d = i;
                ibVar.f386722a |= 1;
                hzVar.copyOnWrite();
                C142512ib ibVar2 = (C142512ib) hzVar.instance;
                ibVar2.f386722a |= 2;
                ibVar2.f386726e = j2;
                C142513ic icVar = (C142513ic) C142514id.f386727e.createBuilder();
                icVar.copyOnWrite();
                C142514id idVar = (C142514id) icVar.instance;
                idVar.f386729a |= 1;
                idVar.f386730b = i2;
                icVar.copyOnWrite();
                C142514id idVar2 = (C142514id) icVar.instance;
                idVar2.f386729a |= 2;
                idVar2.f386731c = i3;
                C63088z A = C63088z.m96139A(bArr);
                icVar.copyOnWrite();
                C142514id idVar3 = (C142514id) icVar.instance;
                idVar3.f386729a |= 4;
                idVar3.f386732d = A;
                hzVar.copyOnWrite();
                C142512ib ibVar3 = (C142512ib) hzVar.instance;
                C142514id idVar4 = (C142514id) icVar.build();
                idVar4.getClass();
                ibVar3.f386724c = idVar4;
                ibVar3.f386723b = 3;
                C58976aa aaVar = C58975e.f156826a;
                C59104x b = f242727b.mo56224b();
                b.mo56378ag(C58975e.f156826a, "ProtoExchangeSocketImpl");
                ((C59052c) ((C59052c) b).mo56372aa(10309)).mo56389s("BBLog|%s|", Base64.encodeToString(((C142512ib) hzVar.build()).toByteArray(), 0).trim());
            }
        }
    }

    /* renamed from: g */
    public final void mo83532g(C89653h hVar) {
        m145922f(hVar);
        C59104x b = f242727b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ProtoExchangeSocketImpl");
        ((C59052c) ((C59052c) b).mo56372aa(10307)).mo56386p("Disconnecting onConnectionChange");
        this.f242735h.mo83496a();
    }

    /* renamed from: h */
    public final C60870cx mo83533h() {
        synchronized (this.f242738m) {
            C58976aa aaVar = C58975e.f156826a;
            C60870cx cxVar = this.f242740o;
            if (cxVar != null) {
                if (!cxVar.isDone()) {
                    this.f242740o.cancel(false);
                }
                this.f242740o = null;
            }
            if (this.f242741p == null) {
                C59104x d = f242727b.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ProtoExchangeSocketImpl");
                ((C59052c) ((C59052c) d).mo56372aa(10296)).mo56386p("Client already stopped");
                C60870cx cxVar2 = C60866ct.f164955a;
                return cxVar2;
            }
            m145922f((C89653h) this.f242734g.getAndSet((Object) null));
            C60870cx cxVar3 = this.f242741p;
            if (cxVar3 != null && !cxVar3.isDone()) {
                this.f242741p.cancel(true);
            }
            this.f242741p = null;
            C60870cx cxVar4 = C60866ct.f164955a;
            return cxVar4;
        }
    }
}
