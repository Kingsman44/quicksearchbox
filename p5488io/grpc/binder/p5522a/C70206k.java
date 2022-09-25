package p5488io.grpc.binder.p5522a;

import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.common.base.C58838bb;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p5488io.grpc.C70163b;
import p5488io.grpc.C70248bs;
import p5488io.grpc.C70256c;
import p5488io.grpc.Status;
import p5488io.grpc.p5525e.C70567hu;

/* renamed from: io.grpc.binder.a.k */
/* compiled from: PG */
public abstract class C70206k implements IBinder.DeathRecipient, C70220y {

    /* renamed from: e */
    public static final Logger f187116e = Logger.getLogger(C70206k.class.getName());

    /* renamed from: f */
    public static final C70163b f187117f = new C70163b("internal:remote-uid");

    /* renamed from: g */
    public static final C70163b f187118g = new C70163b("internal:server-authority");

    /* renamed from: h */
    public static final C70163b f187119h = new C70163b("internal:inbound-parcelable-policy");

    /* renamed from: a */
    private final C70567hu f187120a;

    /* renamed from: b */
    private final C70248bs f187121b;

    /* renamed from: c */
    private final C70221z f187122c;

    /* renamed from: d */
    private final LinkedHashSet f187123d = new LinkedHashSet();

    /* renamed from: i */
    public final ScheduledExecutorService f187124i;

    /* renamed from: j */
    protected final ConcurrentHashMap f187125j;

    /* renamed from: k */
    protected C70256c f187126k;

    /* renamed from: l */
    protected Status f187127l;

    /* renamed from: m */
    public C70184ah f187128m;

    /* renamed from: n */
    private final C70214s f187129n;

    /* renamed from: o */
    private final AtomicLong f187130o;

    /* renamed from: p */
    private long f187131p;

    /* renamed from: q */
    private int f187132q = 1;

    public C70206k(C70567hu huVar, C70256c cVar, C70248bs bsVar) {
        this.f187120a = huVar;
        this.f187126k = cVar;
        this.f187121b = bsVar;
        this.f187124i = (ScheduledExecutorService) huVar.mo62162a();
        this.f187122c = new C70221z(this);
        this.f187125j = new ConcurrentHashMap();
        this.f187129n = new C70214s();
        this.f187130o = new AtomicLong();
    }

    /* renamed from: a */
    private static Status m102310a(RemoteException remoteException) {
        if ((remoteException instanceof DeadObjectException) || (remoteException instanceof TransactionTooLargeException)) {
            return Status.f186916n.mo61678e(remoteException);
        }
        return Status.f186915m.mo61678e(remoteException);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:2|3|4|5|6|7|8|9|10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        p5488io.grpc.binder.p5522a.C70199d.m102289a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000a */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m102311e() {
        /*
            r3 = this;
            io.grpc.binder.a.ah r0 = r3.f187128m
            if (r0 == 0) goto L_0x0029
            r1 = 0
            android.os.IBinder r0 = r0.f187043b     // Catch:{ NoSuchElementException -> 0x000a }
            r0.unlinkToDeath(r3, r1)     // Catch:{ NoSuchElementException -> 0x000a }
        L_0x000a:
            io.grpc.binder.a.al r0 = p5488io.grpc.binder.p5522a.C70188al.m102242b()     // Catch:{ RemoteException -> 0x0029 }
            android.os.Parcel r2 = r0.mo61791a()     // Catch:{ all -> 0x001f }
            r2.writeInt(r1)     // Catch:{ all -> 0x001f }
            io.grpc.binder.a.ah r1 = r3.f187128m     // Catch:{ all -> 0x001f }
            r2 = 2
            r1.mo61782a(r2, r0)     // Catch:{ all -> 0x001f }
            r0.close()     // Catch:{ RemoteException -> 0x0029 }
            return
        L_0x001f:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0024 }
            goto L_0x0028
        L_0x0024:
            r0 = move-exception
            p5488io.grpc.binder.p5522a.C70199d.m102289a(r1, r0)     // Catch:{ RemoteException -> 0x0029 }
        L_0x0028:
            throw r1     // Catch:{ RemoteException -> 0x0029 }
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.binder.p5522a.C70206k.m102311e():void");
    }

    public final synchronized void binderDied() {
        mo61845s(Status.f186916n.withDescription("binderDied"), true);
    }

    /* renamed from: c */
    public final C70248bs mo61840c() {
        return this.f187121b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo61826g(Parcel parcel) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo61827h(Parcel parcel) {
    }

    /* renamed from: i */
    public abstract void mo61828i(Status status);

    /* renamed from: j */
    public abstract void mo61829j();

    /* renamed from: k */
    public void mo61830k() {
        this.f187120a.mo62163b(this.f187124i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: lI */
    public C70219x mo61836lI(int i) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo61833n(C70219x xVar) {
        mo61846t(xVar.f187167d);
    }

    /* renamed from: o */
    public final synchronized C70256c mo61841o() {
        return this.f187126k;
    }

    /* renamed from: p */
    public final ScheduledExecutorService mo61842p() {
        return this.f187124i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo61843q(C70184ah ahVar) {
        C70188al b;
        try {
            b = C70188al.m102242b();
            b.mo61791a().writeInt(1);
            b.mo61791a().writeStrongBinder(this.f187122c);
            ahVar.mo61782a(1, b);
            b.close();
            return;
        } catch (RemoteException e) {
            mo61845s(m102310a(e), true);
            return;
        } catch (Throwable th) {
            C70199d.m102289a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo61844r(int i, C70188al alVar) {
        int dataSize = alVar.mo61791a().dataSize();
        try {
            this.f187128m.mo61782a(i, alVar);
            if (this.f187129n.mo61860b((long) dataSize)) {
                f187116e.logp(Level.FINE, "io.grpc.binder.internal.BinderTransport", "sendTransaction", "transmit window now full ".concat(toString()));
            }
        } catch (RemoteException e) {
            throw m102310a(e).asException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo61845s(Status status, boolean z) {
        if (!mo61848v()) {
            this.f187127l = status;
            mo61850x(4);
            mo61828i(status);
        }
        if (mo61851y(5)) {
            return;
        }
        if (z || this.f187125j.isEmpty()) {
            this.f187122c.f187183a = null;
            mo61850x(5);
            m102311e();
            ArrayList arrayList = new ArrayList(this.f187125j.values());
            this.f187125j.clear();
            this.f187124i.execute(new C70200e(this, arrayList, status));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final void mo61846t(int i) {
        if (this.f187125j.remove(Integer.valueOf(i)) != null && this.f187125j.isEmpty()) {
            this.f187124i.execute(new C70201f(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final boolean mo61847u() {
        return !this.f187129n.f187146a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final boolean mo61848v() {
        return mo61851y(4) || mo61851y(5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final boolean mo61849w(C70184ah ahVar) {
        this.f187128m = ahVar;
        try {
            ahVar.f187043b.linkToDeath(this, 0);
            return true;
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo61850x(int i) {
        int i2 = this.f187132q;
        int i3 = i - 1;
        boolean z = false;
        if (i3 == 1) {
            if (i2 == 1) {
                z = true;
            }
            C58838bb.m90883r(z);
        } else if (i3 == 2) {
            if (i2 == 1 || i2 == 2) {
                z = true;
            }
            C58838bb.m90883r(z);
        } else if (i3 != 3) {
            if (i2 == 4) {
                z = true;
            }
            C58838bb.m90883r(z);
        } else {
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                z = true;
            }
            C58838bb.m90883r(z);
        }
        this.f187132q = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final boolean mo61851y(int i) {
        return this.f187132q == i;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: d */
    public final boolean mo61818d(int r7, android.os.Parcel r8) {
        /*
            r6 = this;
            r0 = 1001(0x3e9, float:1.403E-42)
            r1 = 3
            r2 = 1
            if (r7 >= r0) goto L_0x00cb
            monitor-enter(r6)
            if (r7 == r2) goto L_0x00c3
            r0 = 2
            if (r7 == r0) goto L_0x00b7
            r0 = 0
            if (r7 == r1) goto L_0x0043
            r3 = 4
            r4 = 5
            if (r7 == r3) goto L_0x001c
            if (r7 == r4) goto L_0x0017
            monitor-exit(r6)     // Catch:{ all -> 0x00c8 }
            return r0
        L_0x0017:
            r6.mo61826g(r8)     // Catch:{ all -> 0x00c8 }
            goto L_0x00c6
        L_0x001c:
            int r7 = r8.readInt()     // Catch:{ all -> 0x00c8 }
            int r8 = r6.f187132q     // Catch:{ all -> 0x00c8 }
            if (r8 != r1) goto L_0x00c6
            io.grpc.binder.a.al r8 = p5488io.grpc.binder.p5522a.C70188al.m102242b()     // Catch:{ RemoteException -> 0x00c6 }
            android.os.Parcel r0 = r8.mo61791a()     // Catch:{ all -> 0x0039 }
            r0.writeInt(r7)     // Catch:{ all -> 0x0039 }
            io.grpc.binder.a.ah r7 = r6.f187128m     // Catch:{ all -> 0x0039 }
            r7.mo61782a(r4, r8)     // Catch:{ all -> 0x0039 }
            r8.close()     // Catch:{ RemoteException -> 0x00c6 }
            goto L_0x00c6
        L_0x0039:
            r7 = move-exception
            r8.close()     // Catch:{ all -> 0x003e }
            goto L_0x0042
        L_0x003e:
            r8 = move-exception
            p5488io.grpc.binder.p5522a.C70199d.m102289a(r7, r8)     // Catch:{ RemoteException -> 0x00c6 }
        L_0x0042:
            throw r7     // Catch:{ RemoteException -> 0x00c6 }
        L_0x0043:
            long r7 = r8.readLong()     // Catch:{ all -> 0x00c8 }
            io.grpc.binder.a.s r1 = r6.f187129n     // Catch:{ all -> 0x00c8 }
            boolean r7 = r1.mo61859a(r7)     // Catch:{ all -> 0x00c8 }
            if (r7 == 0) goto L_0x00c6
            java.util.logging.Logger r7 = f187116e     // Catch:{ all -> 0x00c8 }
            java.util.logging.Level r8 = java.util.logging.Level.FINE     // Catch:{ all -> 0x00c8 }
            java.lang.String r1 = "io.grpc.binder.internal.BinderTransport"
            java.lang.String r3 = "handleAcknowledgedBytes"
            java.lang.String r4 = "handleAcknowledgedBytes: Transmit Window No-Longer Full. Unblock calls: "
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x00c8 }
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x00c8 }
            r7.logp(r8, r1, r3, r4)     // Catch:{ all -> 0x00c8 }
            java.util.LinkedHashSet r7 = r6.f187123d     // Catch:{ all -> 0x00c8 }
            j$.util.concurrent.ConcurrentHashMap r8 = r6.f187125j     // Catch:{ all -> 0x00c8 }
            java.util.Set r8 = r8.keySet()     // Catch:{ all -> 0x00c8 }
            r7.addAll(r8)     // Catch:{ all -> 0x00c8 }
            java.util.LinkedHashSet r7 = r6.f187123d     // Catch:{ all -> 0x00c8 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x00c8 }
        L_0x0075:
            boolean r8 = r6.mo61847u()     // Catch:{ all -> 0x00c8 }
            if (r8 == 0) goto L_0x00c6
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x00c8 }
            if (r8 == 0) goto L_0x00c6
            j$.util.concurrent.ConcurrentHashMap r8 = r6.f187125j     // Catch:{ all -> 0x00c8 }
            java.lang.Object r1 = r7.next()     // Catch:{ all -> 0x00c8 }
            java.lang.Object r8 = r8.get(r1)     // Catch:{ all -> 0x00c8 }
            io.grpc.binder.a.x r8 = (p5488io.grpc.binder.p5522a.C70219x) r8     // Catch:{ all -> 0x00c8 }
            r7.remove()     // Catch:{ all -> 0x00c8 }
            if (r8 == 0) goto L_0x0075
            monitor-enter(r8)     // Catch:{ all -> 0x00c8 }
            io.grpc.binder.a.ak r1 = r8.f187168e     // Catch:{ all -> 0x00b4 }
            io.grpc.e.ls r3 = r8.f187170g     // Catch:{ all -> 0x00b4 }
            monitor-exit(r8)     // Catch:{ all -> 0x00b4 }
            if (r3 == 0) goto L_0x009d
            r3.mo62084e()     // Catch:{ all -> 0x00c8 }
        L_0x009d:
            if (r1 == 0) goto L_0x0075
            monitor-enter(r1)     // Catch:{ StatusException -> 0x00a8 }
            r1.mo61788e()     // Catch:{ all -> 0x00a5 }
            monitor-exit(r1)     // Catch:{ all -> 0x00a5 }
            goto L_0x0075
        L_0x00a5:
            r3 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00a5 }
            throw r3     // Catch:{ StatusException -> 0x00a8 }
        L_0x00a8:
            r1 = move-exception
            monitor-enter(r8)     // Catch:{ all -> 0x00c8 }
            io.grpc.Status r1 = r1.f186943a     // Catch:{ all -> 0x00b1 }
            r8.mo61869h(r1, r1, r0)     // Catch:{ all -> 0x00b1 }
            monitor-exit(r8)     // Catch:{ all -> 0x00b1 }
            goto L_0x0075
        L_0x00b1:
            r7 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00b1 }
            throw r7     // Catch:{ all -> 0x00c8 }
        L_0x00b4:
            r7 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00b4 }
            throw r7     // Catch:{ all -> 0x00c8 }
        L_0x00b7:
            io.grpc.Status r7 = p5488io.grpc.Status.f186916n     // Catch:{ all -> 0x00c8 }
            java.lang.String r8 = "transport shutdown by peer"
            io.grpc.Status r7 = r7.withDescription(r8)     // Catch:{ all -> 0x00c8 }
            r6.mo61845s(r7, r2)     // Catch:{ all -> 0x00c8 }
            goto L_0x00c6
        L_0x00c3:
            r6.mo61827h(r8)     // Catch:{ all -> 0x00c8 }
        L_0x00c6:
            monitor-exit(r6)     // Catch:{ all -> 0x00c8 }
            return r2
        L_0x00c8:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00c8 }
            throw r7
        L_0x00cb:
            int r0 = r8.dataSize()
            j$.util.concurrent.ConcurrentHashMap r3 = r6.f187125j
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            java.lang.Object r3 = r3.get(r4)
            io.grpc.binder.a.x r3 = (p5488io.grpc.binder.p5522a.C70219x) r3
            if (r3 != 0) goto L_0x00fb
            monitor-enter(r6)
            boolean r5 = r6.mo61848v()     // Catch:{ all -> 0x00f8 }
            if (r5 != 0) goto L_0x00f6
            io.grpc.binder.a.x r7 = r6.mo61836lI(r7)     // Catch:{ all -> 0x00f8 }
            if (r7 == 0) goto L_0x00f5
            j$.util.concurrent.ConcurrentHashMap r3 = r6.f187125j     // Catch:{ all -> 0x00f8 }
            java.lang.Object r3 = r3.putIfAbsent(r4, r7)     // Catch:{ all -> 0x00f8 }
            io.grpc.binder.a.x r3 = (p5488io.grpc.binder.p5522a.C70219x) r3     // Catch:{ all -> 0x00f8 }
            if (r3 == 0) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r3 = r7
        L_0x00f6:
            monitor-exit(r6)     // Catch:{ all -> 0x00f8 }
            goto L_0x00fb
        L_0x00f8:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00f8 }
            throw r7
        L_0x00fb:
            if (r3 == 0) goto L_0x0100
            r3.mo61872k(r8)
        L_0x0100:
            java.util.concurrent.atomic.AtomicLong r7 = r6.f187130o
            long r3 = (long) r0
            long r7 = r7.addAndGet(r3)
            long r3 = r6.f187131p
            long r7 = r7 - r3
            r3 = 16384(0x4000, double:8.0948E-320)
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0147
            monitor-enter(r6)
            io.grpc.binder.a.ah r7 = r6.f187128m     // Catch:{ all -> 0x0144 }
            r7.getClass()
            java.util.concurrent.atomic.AtomicLong r8 = r6.f187130o     // Catch:{ all -> 0x0144 }
            long r3 = r8.get()     // Catch:{ all -> 0x0144 }
            r6.f187131p = r3     // Catch:{ all -> 0x0144 }
            io.grpc.binder.a.al r8 = p5488io.grpc.binder.p5522a.C70188al.m102242b()     // Catch:{ RemoteException -> 0x013a }
            android.os.Parcel r0 = r8.mo61791a()     // Catch:{ all -> 0x0130 }
            r0.writeLong(r3)     // Catch:{ all -> 0x0130 }
            r7.mo61782a(r1, r8)     // Catch:{ all -> 0x0130 }
            r8.close()     // Catch:{ RemoteException -> 0x013a }
            goto L_0x0142
        L_0x0130:
            r7 = move-exception
            r8.close()     // Catch:{ all -> 0x0135 }
            goto L_0x0139
        L_0x0135:
            r8 = move-exception
            p5488io.grpc.binder.p5522a.C70199d.m102289a(r7, r8)     // Catch:{ RemoteException -> 0x013a }
        L_0x0139:
            throw r7     // Catch:{ RemoteException -> 0x013a }
        L_0x013a:
            r7 = move-exception
            io.grpc.Status r7 = m102310a(r7)     // Catch:{ all -> 0x0144 }
            r6.mo61845s(r7, r2)     // Catch:{ all -> 0x0144 }
        L_0x0142:
            monitor-exit(r6)     // Catch:{ all -> 0x0144 }
            goto L_0x0147
        L_0x0144:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0144 }
            throw r7
        L_0x0147:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.binder.p5522a.C70206k.mo61818d(int, android.os.Parcel):boolean");
    }
}
