package p5488io.grpc.binder.p5522a;

import android.os.Parcel;
import com.google.common.base.C58838bb;
import java.io.InputStream;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import p5488io.grpc.p5525e.C70670lp;

/* renamed from: io.grpc.binder.a.ak */
/* compiled from: PG */
abstract class C70187ak {

    /* renamed from: a */
    private InputStream f187050a;

    /* renamed from: b */
    private Queue f187051b;

    /* renamed from: c */
    private int f187052c;

    /* renamed from: d */
    public final C70206k f187053d;

    /* renamed from: e */
    public final int f187054e;

    /* renamed from: f */
    public final C70670lp f187055f;

    /* renamed from: g */
    public boolean f187056g;

    /* renamed from: h */
    public boolean f187057h;

    /* renamed from: i */
    private int f187058i;

    /* renamed from: j */
    private int f187059j;

    /* renamed from: k */
    private int f187060k = 1;

    public C70187ak(C70206k kVar, int i, C70670lp lpVar) {
        this.f187053d = kVar;
        this.f187054e = i;
        this.f187055f = lpVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo61784a(Parcel parcel);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo61785b(Parcel parcel);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo61787d(InputStream inputStream) {
        this.f187056g = true;
        Queue queue = this.f187051b;
        if (queue != null) {
            queue.add(inputStream);
        } else if (this.f187050a == null) {
            this.f187050a = inputStream;
        } else {
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            this.f187051b = concurrentLinkedQueue;
            concurrentLinkedQueue.add(inputStream);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo61789f() {
        Queue queue = this.f187051b;
        return queue != null ? !queue.isEmpty() : this.f187050a != null && this.f187058i == 0;
    }

    public final synchronized String toString() {
        String simpleName;
        String str;
        int i;
        simpleName = getClass().getSimpleName();
        int i2 = this.f187060k;
        str = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "null" : "CLOSED" : "SUFFIX_SENT" : "ALL_MESSAGES_SENT" : "PREFIX_SENT" : "INITIAL";
        i = this.f187058i;
        return simpleName + "[S=" + str + "/NDM=" + i + "]";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.io.InputStream} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:79|80|81|85|86) */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        throw null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x0155 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61788e() {
        /*
            r8 = this;
        L_0x0000:
            int r0 = r8.f187060k
            int r1 = r0 + -1
            r2 = 0
            if (r0 == 0) goto L_0x016a
            r0 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0023
            if (r1 == r3) goto L_0x0017
            if (r1 == r0) goto L_0x0011
            goto L_0x0169
        L_0x0011:
            boolean r1 = r8.f187057h
            if (r1 != 0) goto L_0x0027
            goto L_0x0169
        L_0x0017:
            boolean r1 = r8.mo61789f()
            if (r1 != 0) goto L_0x0027
            boolean r1 = r8.f187057h
            if (r1 != 0) goto L_0x0027
            goto L_0x0169
        L_0x0023:
            boolean r1 = r8.f187056g
            if (r1 == 0) goto L_0x0169
        L_0x0027:
            io.grpc.binder.a.k r1 = r8.f187053d
            boolean r1 = r1.mo61847u()
            if (r1 == 0) goto L_0x0169
            io.grpc.binder.a.al r1 = p5488io.grpc.binder.p5522a.C70188al.m102242b()     // Catch:{ IOException -> 0x0158 }
            r4 = 0
            android.os.Parcel r5 = r1.mo61791a()     // Catch:{ all -> 0x013a }
            r5.writeInt(r4)     // Catch:{ all -> 0x013a }
            android.os.Parcel r5 = r1.mo61791a()     // Catch:{ all -> 0x013a }
            int r6 = r8.f187052c     // Catch:{ all -> 0x013a }
            int r7 = r6 + 1
            r8.f187052c = r7     // Catch:{ all -> 0x013a }
            r5.writeInt(r6)     // Catch:{ all -> 0x013a }
            int r5 = r8.f187060k     // Catch:{ all -> 0x013a }
            int r6 = r5 + -1
            if (r5 == 0) goto L_0x0139
            if (r6 == 0) goto L_0x005f
            if (r6 == r3) goto L_0x005d
            if (r6 != r0) goto L_0x0057
            r5 = 0
            goto L_0x0104
        L_0x0057:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x013a }
            r0.<init>()     // Catch:{ all -> 0x013a }
            throw r0     // Catch:{ all -> 0x013a }
        L_0x005d:
            r5 = 0
            goto L_0x0077
        L_0x005f:
            android.os.Parcel r5 = r1.mo61791a()     // Catch:{ all -> 0x013a }
            int r5 = r8.mo61784a(r5)     // Catch:{ all -> 0x013a }
            r5 = r5 | r3
            r8.m102236c(r0)     // Catch:{ all -> 0x013a }
            boolean r0 = r8.mo61789f()     // Catch:{ all -> 0x013a }
            if (r0 != 0) goto L_0x0077
            boolean r0 = r8.f187057h     // Catch:{ all -> 0x013a }
            if (r0 != 0) goto L_0x0077
            goto L_0x0113
        L_0x0077:
            int r0 = r8.f187058i     // Catch:{ all -> 0x013a }
            if (r0 != 0) goto L_0x007e
            java.io.InputStream r2 = r8.f187050a     // Catch:{ all -> 0x013a }
            goto L_0x0089
        L_0x007e:
            java.util.Queue r0 = r8.f187051b     // Catch:{ all -> 0x013a }
            if (r0 == 0) goto L_0x0089
            java.lang.Object r0 = r0.peek()     // Catch:{ all -> 0x013a }
            r2 = r0
            java.io.InputStream r2 = (java.io.InputStream) r2     // Catch:{ all -> 0x013a }
        L_0x0089:
            if (r2 == 0) goto L_0x00f1
            r0 = r5 | 2
            android.os.Parcel r5 = r1.mo61791a()     // Catch:{ all -> 0x013a }
            boolean r6 = r2 instanceof p5488io.grpc.binder.p5522a.C70189am     // Catch:{ all -> 0x013a }
            if (r6 == 0) goto L_0x00a2
            r6 = r2
            io.grpc.binder.a.am r6 = (p5488io.grpc.binder.p5522a.C70189am) r6     // Catch:{ all -> 0x013a }
            int r5 = r6.mo61793a(r5)     // Catch:{ all -> 0x013a }
            r8.f187059j = r5     // Catch:{ all -> 0x013a }
            r5 = 64
            r7 = 0
            goto L_0x00c8
        L_0x00a2:
            int r6 = p5488io.grpc.binder.p5522a.C70212q.f187143a     // Catch:{ all -> 0x013a }
            byte[] r6 = p5488io.grpc.binder.p5522a.C70212q.m102336b(r6)     // Catch:{ all -> 0x013a }
            int r7 = r2.read(r6)     // Catch:{ all -> 0x00ec }
            if (r7 > 0) goto L_0x00b4
            r5.writeInt(r4)     // Catch:{ all -> 0x00ec }
        L_0x00b1:
            r5 = 0
            r7 = 0
            goto L_0x00c5
        L_0x00b4:
            r5.writeInt(r7)     // Catch:{ all -> 0x00ec }
            r5.writeByteArray(r6, r4, r7)     // Catch:{ all -> 0x00ec }
            int r5 = r8.f187059j     // Catch:{ all -> 0x00ec }
            int r5 = r5 + r7
            r8.f187059j = r5     // Catch:{ all -> 0x00ec }
            int r5 = r6.length     // Catch:{ all -> 0x00ec }
            if (r7 != r5) goto L_0x00b1
            r5 = 128(0x80, float:1.794E-43)
            r7 = 1
        L_0x00c5:
            p5488io.grpc.binder.p5522a.C70212q.m102335a(r6)     // Catch:{ all -> 0x013a }
        L_0x00c8:
            if (r7 != 0) goto L_0x00e9
            r2.close()     // Catch:{ all -> 0x013a }
            int r2 = r8.f187058i     // Catch:{ all -> 0x013a }
            int r6 = r2 + 1
            r8.f187058i = r6     // Catch:{ all -> 0x013a }
            if (r2 <= 0) goto L_0x00dd
            java.util.Queue r2 = r8.f187051b     // Catch:{ all -> 0x013a }
            r2.getClass()
            r2.poll()     // Catch:{ all -> 0x013a }
        L_0x00dd:
            io.grpc.e.lp r2 = r8.f187055f     // Catch:{ all -> 0x013a }
            r2.mo62420i()     // Catch:{ all -> 0x013a }
            io.grpc.e.lp r2 = r8.f187055f     // Catch:{ all -> 0x013a }
            r2.mo62421j()     // Catch:{ all -> 0x013a }
            r8.f187059j = r4     // Catch:{ all -> 0x013a }
        L_0x00e9:
            r0 = r0 | r5
            r5 = r0
            goto L_0x00f6
        L_0x00ec:
            r0 = move-exception
            p5488io.grpc.binder.p5522a.C70212q.m102335a(r6)     // Catch:{ all -> 0x013a }
            throw r0     // Catch:{ all -> 0x013a }
        L_0x00f1:
            boolean r0 = r8.f187057h     // Catch:{ all -> 0x013a }
            com.google.common.base.C58838bb.m90883r(r0)     // Catch:{ all -> 0x013a }
        L_0x00f6:
            boolean r0 = r8.f187057h     // Catch:{ all -> 0x013a }
            if (r0 == 0) goto L_0x0113
            boolean r0 = r8.mo61789f()     // Catch:{ all -> 0x013a }
            if (r0 != 0) goto L_0x0113
            r0 = 3
            r8.m102236c(r0)     // Catch:{ all -> 0x013a }
        L_0x0104:
            r0 = 4
            r2 = r5 | 4
            android.os.Parcel r5 = r1.mo61791a()     // Catch:{ all -> 0x013a }
            int r5 = r8.mo61785b(r5)     // Catch:{ all -> 0x013a }
            r5 = r5 | r2
            r8.m102236c(r0)     // Catch:{ all -> 0x013a }
        L_0x0113:
            android.os.Parcel r0 = r1.mo61791a()     // Catch:{ all -> 0x013a }
            p5488io.grpc.binder.p5522a.C70196at.m102282c(r0, r5)     // Catch:{ all -> 0x013a }
            android.os.Parcel r0 = r1.mo61791a()     // Catch:{ all -> 0x013a }
            int r0 = r0.dataSize()     // Catch:{ all -> 0x013a }
            io.grpc.binder.a.k r2 = r8.f187053d     // Catch:{ all -> 0x013a }
            int r5 = r8.f187054e     // Catch:{ all -> 0x013a }
            r2.mo61844r(r5, r1)     // Catch:{ all -> 0x013a }
            io.grpc.e.lp r2 = r8.f187055f     // Catch:{ all -> 0x013a }
            long r5 = (long) r0     // Catch:{ all -> 0x013a }
            r2.mo62415d(r5)     // Catch:{ all -> 0x013a }
            io.grpc.e.lp r0 = r8.f187055f     // Catch:{ all -> 0x013a }
            r0.mo62422k()     // Catch:{ all -> 0x013a }
            r1.close()     // Catch:{ IOException -> 0x0158 }
            goto L_0x0000
        L_0x0139:
            throw r2     // Catch:{ all -> 0x013a }
        L_0x013a:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x013f }
            goto L_0x0155
        L_0x013f:
            r1 = move-exception
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0155 }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            r2[r4] = r5     // Catch:{ Exception -> 0x0155 }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r2 = r5.getDeclaredMethod(r6, r2)     // Catch:{ Exception -> 0x0155 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0155 }
            r3[r4] = r1     // Catch:{ Exception -> 0x0155 }
            r2.invoke(r0, r3)     // Catch:{ Exception -> 0x0155 }
        L_0x0155:
            throw r0     // Catch:{ IOException -> 0x0158 }
        L_0x0156:
            r0 = move-exception
            goto L_0x0164
        L_0x0158:
            r0 = move-exception
            io.grpc.Status r1 = p5488io.grpc.Status.f186915m     // Catch:{ StatusException -> 0x0156 }
            io.grpc.Status r0 = r1.mo61678e(r0)     // Catch:{ StatusException -> 0x0156 }
            io.grpc.StatusException r0 = r0.asException()     // Catch:{ StatusException -> 0x0156 }
            throw r0     // Catch:{ StatusException -> 0x0156 }
        L_0x0164:
            r1 = 5
            r8.m102236c(r1)
            throw r0
        L_0x0169:
            return
        L_0x016a:
            goto L_0x016c
        L_0x016b:
            throw r2
        L_0x016c:
            goto L_0x016b
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.binder.p5522a.C70187ak.mo61788e():void");
    }

    /* renamed from: c */
    private final void m102236c(int i) {
        int i2 = this.f187060k;
        int i3 = i - 1;
        boolean z = false;
        if (i3 == 1) {
            if (i2 == 1) {
                z = true;
            }
            C58838bb.m90883r(z);
        } else if (i3 == 2) {
            if (i2 == 2) {
                z = true;
            }
            C58838bb.m90883r(z);
        } else if (i3 == 3) {
            if (i2 == 3) {
                z = true;
            }
            C58838bb.m90883r(z);
        }
        this.f187060k = i;
    }
}
