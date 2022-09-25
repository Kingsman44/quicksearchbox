package p5488io.grpc.binder.p5522a;

import android.os.Parcel;
import com.google.common.base.C58838bb;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import p5488io.grpc.C70256c;
import p5488io.grpc.Status;
import p5488io.grpc.StatusException;
import p5488io.grpc.p5525e.C70670lp;
import p5488io.grpc.p5525e.C70672lr;
import p5488io.grpc.p5525e.C70673ls;

/* renamed from: io.grpc.binder.a.x */
/* compiled from: PG */
abstract class C70219x implements C70672lr {

    /* renamed from: a */
    private InputStream f187164a;

    /* renamed from: b */
    protected final C70206k f187165b;

    /* renamed from: c */
    protected final C70256c f187166c;

    /* renamed from: d */
    final int f187167d;

    /* renamed from: e */
    protected C70187ak f187168e;

    /* renamed from: f */
    protected C70670lp f187169f;

    /* renamed from: g */
    protected C70673ls f187170g;

    /* renamed from: h */
    private int f187171h;

    /* renamed from: i */
    private int f187172i;

    /* renamed from: j */
    private ArrayList f187173j;

    /* renamed from: k */
    private boolean f187174k;

    /* renamed from: l */
    private int f187175l;

    /* renamed from: m */
    private int f187176m;

    /* renamed from: n */
    private C70217v f187177n = C70217v.UNINITIALIZED;

    /* renamed from: o */
    private int f187178o;

    /* renamed from: p */
    private int f187179p;

    /* renamed from: q */
    private boolean f187180q;

    /* renamed from: r */
    private boolean f187181r;

    public C70219x(C70206k kVar, C70256c cVar, int i) {
        this.f187165b = kVar;
        this.f187166c = cVar;
        this.f187167d = i;
    }

    /* renamed from: f */
    private final void mo61866f() {
        C70218w wVar;
        if (this.f187172i == 0) {
            int i = 0;
            while (i < this.f187173j.size() && (wVar = (C70218w) this.f187173j.get(i)) != null) {
                if (wVar.f187163d) {
                    this.f187172i = i + 1;
                    m102352r();
                    return;
                }
                i++;
            }
        }
    }

    /* renamed from: p */
    private final boolean m102350p() {
        return this.f187164a != null || this.f187172i > 0;
    }

    /* renamed from: q */
    private final boolean m102351q() {
        return this.f187174k && this.f187171h >= this.f187175l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo61861a(Status status);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo61862b();

    /* renamed from: c */
    public abstract void mo61863c(int i, Parcel parcel);

    /* renamed from: d */
    public abstract void mo61864d(int i, Parcel parcel);

    /* renamed from: e */
    public boolean mo61865e() {
        return false;
    }

    /* renamed from: h */
    public final void mo61869h(Status status, Status status2, boolean z) {
        C70188al b;
        if (!mo61876o()) {
            boolean z2 = this.f187177n != C70217v.UNINITIALIZED;
            mo61874m(C70217v.CLOSED);
            if (z2) {
                this.f187169f.mo62423n();
            }
            if (!z) {
                C70206k kVar = this.f187165b;
                int i = this.f187167d;
                try {
                    b = C70188al.m102242b();
                    b.mo61791a().writeInt(0);
                    C70196at.m102282c(b.mo61791a(), C70196at.m102280a(b.mo61791a(), status) | 8);
                    kVar.mo61844r(i, b);
                    b.close();
                } catch (StatusException e) {
                    C70206k.f187116e.logp(Level.WARNING, "io.grpc.binder.internal.BinderTransport", "sendOutOfBandClose", "Failed sending oob close transaction", e);
                } catch (Throwable th) {
                    C70199d.m102289a(th, th);
                }
            }
            if (z2) {
                mo61861a(status2);
            }
            this.f187165b.mo61833n(this);
            return;
        }
        return;
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo61870i(Status status) {
        mo61869h(Status.f186904b, status, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo61871j() {
        if (!this.f187180q) {
            this.f187180q = true;
            while (true) {
                C70217v vVar = C70217v.UNINITIALIZED;
                int ordinal = this.f187177n.ordinal();
                if (ordinal == 2) {
                    if (this.f187170g != null && !this.f187181r) {
                        if (!m102350p()) {
                            if (!m102351q()) {
                                break;
                            }
                        } else if (this.f187179p == 0) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else if (ordinal == 3) {
                    if (this.f187170g != null) {
                        if (!this.f187174k) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                int ordinal2 = this.f187177n.ordinal();
                if (ordinal2 != 2) {
                    if (ordinal2 != 3) {
                        throw new AssertionError();
                    }
                } else if (!this.f187181r) {
                    if (m102350p()) {
                        this.f187181r = true;
                        this.f187170g.mo62083d(this);
                    } else if (this.f187174k) {
                        mo61874m(C70217v.ALL_MESSAGES_DELIVERED);
                    }
                }
                if (this.f187174k) {
                    mo61874m(C70217v.SUFFIX_DELIVERED);
                    mo61862b();
                }
            }
            this.f187180q = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009a A[Catch:{ StatusException -> 0x0141 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d5 A[Catch:{ StatusException -> 0x0141 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00de A[Catch:{ StatusException -> 0x0141 }] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo61872k(android.os.Parcel r14) {
        /*
            r13 = this;
            monitor-enter(r13)
            boolean r0 = r13.mo61876o()     // Catch:{ all -> 0x0149 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r13)
            return
        L_0x0009:
            r0 = 0
            int r1 = r14.readInt()     // Catch:{ StatusException -> 0x0141 }
            r2 = 8
            boolean r2 = p5488io.grpc.binder.p5522a.C70196at.m102283d(r1, r2)     // Catch:{ StatusException -> 0x0141 }
            r3 = 1
            if (r2 == 0) goto L_0x0020
            io.grpc.Status r14 = p5488io.grpc.binder.p5522a.C70196at.m102281b(r1, r14)     // Catch:{ StatusException -> 0x0141 }
            r13.mo61869h(r14, r14, r3)     // Catch:{ StatusException -> 0x0141 }
            monitor-exit(r13)
            return
        L_0x0020:
            int r2 = r14.readInt()     // Catch:{ StatusException -> 0x0141 }
            boolean r4 = p5488io.grpc.binder.p5522a.C70196at.m102283d(r1, r3)     // Catch:{ StatusException -> 0x0141 }
            r5 = 2
            boolean r5 = p5488io.grpc.binder.p5522a.C70196at.m102283d(r1, r5)     // Catch:{ StatusException -> 0x0141 }
            r6 = 4
            boolean r6 = p5488io.grpc.binder.p5522a.C70196at.m102283d(r1, r6)     // Catch:{ StatusException -> 0x0141 }
            if (r4 == 0) goto L_0x003c
            r13.mo61863c(r1, r14)     // Catch:{ StatusException -> 0x0141 }
            io.grpc.binder.a.v r4 = p5488io.grpc.binder.p5522a.C70217v.PREFIX_DELIVERED     // Catch:{ StatusException -> 0x0141 }
            r13.mo61874m(r4)     // Catch:{ StatusException -> 0x0141 }
        L_0x003c:
            if (r5 == 0) goto L_0x0101
            r4 = r1 & 64
            r7 = 0
            if (r4 == 0) goto L_0x0080
            io.grpc.c r4 = r13.f187166c     // Catch:{ StatusException -> 0x0141 }
            io.grpc.b r8 = p5488io.grpc.binder.p5522a.C70206k.f187119h     // Catch:{ StatusException -> 0x0141 }
            java.util.IdentityHashMap r4 = r4.f187256b     // Catch:{ StatusException -> 0x0141 }
            java.lang.Object r4 = r4.get(r8)     // Catch:{ StatusException -> 0x0141 }
            io.grpc.binder.i r4 = (p5488io.grpc.binder.C70229i) r4     // Catch:{ StatusException -> 0x0141 }
            if (r4 == 0) goto L_0x0073
            boolean r4 = r4.f187213c     // Catch:{ StatusException -> 0x0141 }
            if (r4 == 0) goto L_0x0073
            int r4 = r14.dataPosition()     // Catch:{ StatusException -> 0x0141 }
            java.lang.Class r8 = r13.getClass()     // Catch:{ StatusException -> 0x0141 }
            java.lang.ClassLoader r8 = r8.getClassLoader()     // Catch:{ StatusException -> 0x0141 }
            int r9 = p5488io.grpc.binder.p5522a.C70189am.f187062f     // Catch:{ StatusException -> 0x0141 }
            android.os.Parcelable r8 = r14.readParcelable(r8)     // Catch:{ StatusException -> 0x0141 }
            io.grpc.binder.a.am r9 = new io.grpc.binder.a.am     // Catch:{ StatusException -> 0x0141 }
            r9.<init>(r7, r8, r3)     // Catch:{ StatusException -> 0x0141 }
            int r8 = r14.dataPosition()     // Catch:{ StatusException -> 0x0141 }
            int r8 = r8 - r4
            r4 = r7
            goto L_0x0095
        L_0x0073:
            io.grpc.Status r14 = p5488io.grpc.Status.f186909g     // Catch:{ StatusException -> 0x0141 }
            java.lang.String r1 = "Parcelable messages not allowed"
            io.grpc.Status r14 = r14.withDescription(r1)     // Catch:{ StatusException -> 0x0141 }
            io.grpc.StatusException r14 = r14.asException()     // Catch:{ StatusException -> 0x0141 }
            throw r14     // Catch:{ StatusException -> 0x0141 }
        L_0x0080:
            int r8 = r14.readInt()     // Catch:{ StatusException -> 0x0141 }
            byte[] r4 = p5488io.grpc.binder.p5522a.C70212q.m102336b(r8)     // Catch:{ StatusException -> 0x0141 }
            if (r8 <= 0) goto L_0x008d
            r14.readByteArray(r4)     // Catch:{ StatusException -> 0x0141 }
        L_0x008d:
            r9 = r1 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0094
            r9 = r7
            r10 = 0
            goto L_0x0096
        L_0x0094:
            r9 = r7
        L_0x0095:
            r10 = 1
        L_0x0096:
            java.util.ArrayList r11 = r13.f187173j     // Catch:{ StatusException -> 0x0141 }
            if (r11 != 0) goto L_0x00c4
            int r11 = r13.f187178o     // Catch:{ StatusException -> 0x0141 }
            if (r11 != 0) goto L_0x00bb
            if (r10 == 0) goto L_0x00bb
            int r11 = r13.f187171h     // Catch:{ StatusException -> 0x0141 }
            if (r2 != r11) goto L_0x00bb
            java.io.InputStream r7 = r13.f187164a     // Catch:{ StatusException -> 0x0141 }
            if (r7 != 0) goto L_0x00aa
            r7 = 1
            goto L_0x00ab
        L_0x00aa:
            r7 = 0
        L_0x00ab:
            com.google.common.base.C58838bb.m90883r(r7)     // Catch:{ StatusException -> 0x0141 }
            if (r9 != 0) goto L_0x00b5
            io.grpc.binder.a.p r9 = new io.grpc.binder.a.p     // Catch:{ StatusException -> 0x0141 }
            r9.<init>(r4)     // Catch:{ StatusException -> 0x0141 }
        L_0x00b5:
            r13.f187164a = r9     // Catch:{ StatusException -> 0x0141 }
            r13.m102352r()     // Catch:{ StatusException -> 0x0141 }
            goto L_0x0101
        L_0x00bb:
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ StatusException -> 0x0141 }
            r12 = 16
            r11.<init>(r12)     // Catch:{ StatusException -> 0x0141 }
            r13.f187173j = r11     // Catch:{ StatusException -> 0x0141 }
        L_0x00c4:
            io.grpc.binder.a.w r11 = new io.grpc.binder.a.w     // Catch:{ StatusException -> 0x0141 }
            r11.<init>(r9, r4, r8, r10)     // Catch:{ StatusException -> 0x0141 }
            int r4 = r13.f187171h     // Catch:{ StatusException -> 0x0141 }
            int r4 = r2 - r4
            java.util.ArrayList r8 = r13.f187173j     // Catch:{ StatusException -> 0x0141 }
            int r8 = r8.size()     // Catch:{ StatusException -> 0x0141 }
            if (r4 >= r8) goto L_0x00de
            java.util.ArrayList r7 = r13.f187173j     // Catch:{ StatusException -> 0x0141 }
            r7.set(r4, r11)     // Catch:{ StatusException -> 0x0141 }
            r13.mo61866f()     // Catch:{ StatusException -> 0x0141 }
            goto L_0x0101
        L_0x00de:
            java.util.ArrayList r8 = r13.f187173j     // Catch:{ StatusException -> 0x0141 }
            int r8 = r8.size()     // Catch:{ StatusException -> 0x0141 }
            if (r4 <= r8) goto L_0x00f9
        L_0x00e6:
            java.util.ArrayList r8 = r13.f187173j     // Catch:{ StatusException -> 0x0141 }
            r8.add(r7)     // Catch:{ StatusException -> 0x0141 }
            java.util.ArrayList r8 = r13.f187173j     // Catch:{ StatusException -> 0x0141 }
            int r8 = r8.size()     // Catch:{ StatusException -> 0x0141 }
            if (r4 > r8) goto L_0x00e6
            java.util.ArrayList r4 = r13.f187173j     // Catch:{ StatusException -> 0x0141 }
            r4.add(r11)     // Catch:{ StatusException -> 0x0141 }
            goto L_0x0101
        L_0x00f9:
            java.util.ArrayList r4 = r13.f187173j     // Catch:{ StatusException -> 0x0141 }
            r4.add(r11)     // Catch:{ StatusException -> 0x0141 }
            r13.mo61866f()     // Catch:{ StatusException -> 0x0141 }
        L_0x0101:
            if (r6 == 0) goto L_0x010a
            r13.mo61864d(r1, r14)     // Catch:{ StatusException -> 0x0141 }
            r13.f187175l = r2     // Catch:{ StatusException -> 0x0141 }
            r13.f187174k = r3     // Catch:{ StatusException -> 0x0141 }
        L_0x010a:
            int r1 = r13.f187171h     // Catch:{ StatusException -> 0x0141 }
            if (r2 != r1) goto L_0x0122
            java.util.ArrayList r2 = r13.f187173j     // Catch:{ StatusException -> 0x0141 }
            if (r2 != 0) goto L_0x0116
            int r1 = r1 + r3
            r13.f187171h = r1     // Catch:{ StatusException -> 0x0141 }
            goto L_0x0122
        L_0x0116:
            if (r5 != 0) goto L_0x0122
            if (r6 != 0) goto L_0x0122
            r2.remove(r0)     // Catch:{ StatusException -> 0x0141 }
            int r1 = r13.f187171h     // Catch:{ StatusException -> 0x0141 }
            int r1 = r1 + r3
            r13.f187171h = r1     // Catch:{ StatusException -> 0x0141 }
        L_0x0122:
            int r14 = r14.dataSize()     // Catch:{ StatusException -> 0x0141 }
            int r1 = r13.f187176m     // Catch:{ StatusException -> 0x0141 }
            int r1 = r1 + r14
            r13.f187176m = r1     // Catch:{ StatusException -> 0x0141 }
            io.grpc.e.lp r14 = r13.f187169f     // Catch:{ StatusException -> 0x0141 }
            if (r14 == 0) goto L_0x013c
            if (r1 == 0) goto L_0x013c
            long r1 = (long) r1     // Catch:{ StatusException -> 0x0141 }
            r14.mo62414c(r1)     // Catch:{ StatusException -> 0x0141 }
            io.grpc.e.lp r14 = r13.f187169f     // Catch:{ StatusException -> 0x0141 }
            r14.mo62419h()     // Catch:{ StatusException -> 0x0141 }
            r13.f187176m = r0     // Catch:{ StatusException -> 0x0141 }
        L_0x013c:
            r13.mo61871j()     // Catch:{ StatusException -> 0x0141 }
            monitor-exit(r13)
            return
        L_0x0141:
            r14 = move-exception
            io.grpc.Status r14 = r14.f186943a     // Catch:{ all -> 0x0149 }
            r13.mo61869h(r14, r14, r0)     // Catch:{ all -> 0x0149 }
            monitor-exit(r13)
            return
        L_0x0149:
            r14 = move-exception
            monitor-exit(r13)
            goto L_0x014d
        L_0x014c:
            throw r14
        L_0x014d:
            goto L_0x014c
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.binder.p5522a.C70219x.mo61872k(android.os.Parcel):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo61873l(C70187ak akVar, C70673ls lsVar) {
        this.f187168e = akVar;
        this.f187169f = akVar.f187055f;
        this.f187170g = lsVar;
        if (!mo61876o()) {
            mo61874m(C70217v.INITIALIZED);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo61874m(C70217v vVar) {
        C70217v vVar2 = this.f187177n;
        C70217v vVar3 = C70217v.UNINITIALIZED;
        int ordinal = vVar.ordinal();
        boolean z = false;
        if (ordinal == 1) {
            if (vVar2 == C70217v.UNINITIALIZED) {
                z = true;
            }
            C58838bb.m90890y(z, "%s -> %s", vVar2, vVar);
        } else if (ordinal == 2) {
            if (vVar2 == C70217v.INITIALIZED || vVar2 == C70217v.UNINITIALIZED) {
                z = true;
            }
            C58838bb.m90890y(z, "%s -> %s", vVar2, vVar);
        } else if (ordinal == 3) {
            if (vVar2 == C70217v.PREFIX_DELIVERED) {
                z = true;
            }
            C58838bb.m90890y(z, "%s -> %s", vVar2, vVar);
        } else if (ordinal == 4) {
            if (vVar2 == C70217v.ALL_MESSAGES_DELIVERED) {
                z = true;
            }
            C58838bb.m90890y(z, "%s -> %s", vVar2, vVar);
        } else if (ordinal != 5) {
            throw new AssertionError();
        }
        this.f187177n = vVar;
    }

    /* renamed from: n */
    public final void mo61875n(int i) {
        this.f187179p += i;
        mo61871j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final boolean mo61876o() {
        return this.f187177n == C70217v.CLOSED;
    }

    public final synchronized String toString() {
        String simpleName;
        boolean z;
        String valueOf;
        boolean p;
        boolean z2;
        simpleName = getClass().getSimpleName();
        z = this.f187174k;
        valueOf = String.valueOf(this.f187177n);
        p = m102350p();
        z2 = this.f187170g != null;
        return simpleName + "[SfxA=" + z + "/De=" + valueOf + "/Msg=" + p + "/Lis=" + z2 + "]";
    }

    /* renamed from: r */
    private final void m102352r() {
        C70670lp lpVar = this.f187169f;
        lpVar.getClass();
        lpVar.mo62417f();
        this.f187169f.mo62418g();
        this.f187178o++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0080, code lost:
        return r0;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.io.InputStream mo61868g() {
        /*
            r7 = this;
            monitor-enter(r7)
            java.io.InputStream r0 = r7.f187164a     // Catch:{ all -> 0x0081 }
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x000a
            r7.f187164a = r1     // Catch:{ all -> 0x0081 }
            goto L_0x005e
        L_0x000a:
            int r0 = r7.f187179p     // Catch:{ all -> 0x0081 }
            if (r0 <= 0) goto L_0x005d
            boolean r0 = r7.m102350p()     // Catch:{ all -> 0x0081 }
            if (r0 == 0) goto L_0x005d
            int r0 = r7.f187172i     // Catch:{ all -> 0x0081 }
            r7.f187172i = r2     // Catch:{ all -> 0x0081 }
            r3 = 1
            if (r0 != r3) goto L_0x0032
            java.util.ArrayList r3 = r7.f187173j     // Catch:{ all -> 0x0081 }
            java.lang.Object r3 = r3.remove(r2)     // Catch:{ all -> 0x0081 }
            io.grpc.binder.a.w r3 = (p5488io.grpc.binder.p5522a.C70218w) r3     // Catch:{ all -> 0x0081 }
            int r4 = r3.f187162c     // Catch:{ all -> 0x0081 }
            java.io.InputStream r4 = r3.f187160a     // Catch:{ all -> 0x0081 }
            if (r4 == 0) goto L_0x002a
            goto L_0x0053
        L_0x002a:
            io.grpc.binder.a.p r4 = new io.grpc.binder.a.p     // Catch:{ all -> 0x0081 }
            byte[] r3 = r3.f187161b     // Catch:{ all -> 0x0081 }
            r4.<init>(r3)     // Catch:{ all -> 0x0081 }
            goto L_0x0053
        L_0x0032:
            byte[][] r3 = new byte[r0][]     // Catch:{ all -> 0x0081 }
            r4 = 0
            r5 = 0
        L_0x0036:
            if (r4 >= r0) goto L_0x004e
            java.util.ArrayList r6 = r7.f187173j     // Catch:{ all -> 0x0081 }
            java.lang.Object r6 = r6.remove(r2)     // Catch:{ all -> 0x0081 }
            io.grpc.binder.a.w r6 = (p5488io.grpc.binder.p5522a.C70218w) r6     // Catch:{ all -> 0x0081 }
            byte[] r6 = r6.f187161b     // Catch:{ all -> 0x0081 }
            r6.getClass()
            byte[] r6 = (byte[]) r6     // Catch:{ all -> 0x0081 }
            r3[r4] = r6     // Catch:{ all -> 0x0081 }
            int r6 = r6.length     // Catch:{ all -> 0x0081 }
            int r5 = r5 + r6
            int r4 = r4 + 1
            goto L_0x0036
        L_0x004e:
            io.grpc.binder.a.p r4 = new io.grpc.binder.a.p     // Catch:{ all -> 0x0081 }
            r4.<init>(r3, r5)     // Catch:{ all -> 0x0081 }
        L_0x0053:
            int r3 = r7.f187171h     // Catch:{ all -> 0x0081 }
            int r3 = r3 + r0
            r7.f187171h = r3     // Catch:{ all -> 0x0081 }
            r7.mo61866f()     // Catch:{ all -> 0x0081 }
            r0 = r4
            goto L_0x005e
        L_0x005d:
            r0 = r1
        L_0x005e:
            if (r0 == 0) goto L_0x0067
            int r1 = r7.f187179p     // Catch:{ all -> 0x0081 }
            int r1 = r1 + -1
            r7.f187179p = r1     // Catch:{ all -> 0x0081 }
            goto L_0x007f
        L_0x0067:
            r7.f187181r = r2     // Catch:{ all -> 0x0081 }
            boolean r2 = r7.m102351q()     // Catch:{ all -> 0x0081 }
            if (r2 == 0) goto L_0x007f
            boolean r2 = r7.mo61876o()     // Catch:{ all -> 0x0081 }
            if (r2 != 0) goto L_0x007f
            io.grpc.binder.a.v r0 = p5488io.grpc.binder.p5522a.C70217v.ALL_MESSAGES_DELIVERED     // Catch:{ all -> 0x0081 }
            r7.mo61874m(r0)     // Catch:{ all -> 0x0081 }
            r7.mo61871j()     // Catch:{ all -> 0x0081 }
            monitor-exit(r7)
            return r1
        L_0x007f:
            monitor-exit(r7)
            return r0
        L_0x0081:
            r0 = move-exception
            monitor-exit(r7)
            goto L_0x0085
        L_0x0084:
            throw r0
        L_0x0085:
            goto L_0x0084
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.binder.p5522a.C70219x.mo61868g():java.io.InputStream");
    }
}
