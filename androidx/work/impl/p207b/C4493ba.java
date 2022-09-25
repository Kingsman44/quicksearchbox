package androidx.work.impl.p207b;

import android.os.Build;
import androidx.work.C4375a;
import androidx.work.C4381ae;
import androidx.work.C4389am;
import androidx.work.C4394ar;
import p5462h.C69677g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.impl.b.ba */
/* compiled from: PG */
public final class C4493ba {
    /* renamed from: a */
    public static final int m12805a(C4375a aVar) {
        C69664n.m101061g(aVar, "backoffPolicy");
        C4394ar arVar = C4394ar.ENQUEUED;
        C4375a aVar2 = C4375a.EXPONENTIAL;
        C4381ae aeVar = C4381ae.NOT_REQUIRED;
        C4389am amVar = C4389am.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        if (ordinal == 1) {
            return 1;
        }
        throw new C69677g();
    }

    /* renamed from: b */
    public static final int m12806b(C4381ae aeVar) {
        C69664n.m101061g(aeVar, "networkType");
        C4394ar arVar = C4394ar.ENQUEUED;
        C4375a aVar = C4375a.EXPONENTIAL;
        C4381ae aeVar2 = C4381ae.NOT_REQUIRED;
        C4389am amVar = C4389am.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        int ordinal = aeVar.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3) {
                    i = 4;
                    if (ordinal != 4) {
                        if (Build.VERSION.SDK_INT >= 30 && aeVar == C4381ae.TEMPORARILY_UNMETERED) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + aeVar + " to int");
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: c */
    public static final int m12807c(C4389am amVar) {
        C69664n.m101061g(amVar, "policy");
        C4394ar arVar = C4394ar.ENQUEUED;
        C4375a aVar = C4375a.EXPONENTIAL;
        C4381ae aeVar = C4381ae.NOT_REQUIRED;
        C4389am amVar2 = C4389am.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        int ordinal = amVar.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        if (ordinal == 1) {
            return 1;
        }
        throw new C69677g();
    }

    /* renamed from: d */
    public static final int m12808d(C4394ar arVar) {
        C69664n.m101061g(arVar, "state");
        C4394ar arVar2 = C4394ar.ENQUEUED;
        C4375a aVar = C4375a.EXPONENTIAL;
        C4381ae aeVar = C4381ae.NOT_REQUIRED;
        C4389am amVar = C4389am.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        int ordinal = arVar.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3) {
                    i = 4;
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return 5;
                        }
                        throw new C69677g();
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: e */
    public static final C4375a m12809e(int i) {
        if (i == 0) {
            return C4375a.EXPONENTIAL;
        }
        if (i == 1) {
            return C4375a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to BackoffPolicy");
    }

    /* renamed from: g */
    public static final C4389am m12811g(int i) {
        if (i == 0) {
            return C4389am.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i == 1) {
            return C4389am.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to OutOfQuotaPolicy");
    }

    /* renamed from: h */
    public static final C4394ar m12812h(int i) {
        if (i == 0) {
            return C4394ar.ENQUEUED;
        }
        if (i == 1) {
            return C4394ar.RUNNING;
        }
        if (i == 2) {
            return C4394ar.SUCCEEDED;
        }
        if (i == 3) {
            return C4394ar.FAILED;
        }
        if (i == 4) {
            return C4394ar.BLOCKED;
        }
        if (i == 5) {
            return C4394ar.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to State");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        p5462h.p5472e.C69598b.m101013a(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        throw r4;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Set m12813i(byte[] r9) {
        /*
            java.lang.String r0 = "bytes"
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            int r1 = r9.length
            if (r1 != 0) goto L_0x000e
            return r0
        L_0x000e:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r9)
            r9 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x0049 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0049 }
            int r3 = r2.readInt()     // Catch:{ all -> 0x0040 }
            r4 = 0
        L_0x001e:
            if (r4 >= r3) goto L_0x003c
            java.lang.String r5 = r2.readUTF()     // Catch:{ all -> 0x0040 }
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ all -> 0x0040 }
            boolean r6 = r2.readBoolean()     // Catch:{ all -> 0x0040 }
            androidx.work.g r7 = new androidx.work.g     // Catch:{ all -> 0x0040 }
            java.lang.String r8 = "uri"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r8)     // Catch:{ all -> 0x0040 }
            r7.<init>(r5, r6)     // Catch:{ all -> 0x0040 }
            r0.add(r7)     // Catch:{ all -> 0x0040 }
            int r4 = r4 + 1
            goto L_0x001e
        L_0x003c:
            p5462h.p5472e.C69598b.m101013a(r2, r9)     // Catch:{ IOException -> 0x0049 }
            goto L_0x004d
        L_0x0040:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r4 = move-exception
            p5462h.p5472e.C69598b.m101013a(r2, r3)     // Catch:{ IOException -> 0x0049 }
            throw r4     // Catch:{ IOException -> 0x0049 }
        L_0x0047:
            r9 = move-exception
            goto L_0x0051
        L_0x0049:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ all -> 0x0047 }
        L_0x004d:
            p5462h.p5472e.C69598b.m101013a(r1, r9)
            return r0
        L_0x0051:
            throw r9     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r0 = move-exception
            p5462h.p5472e.C69598b.m101013a(r1, r9)
            goto L_0x0058
        L_0x0057:
            throw r0
        L_0x0058:
            goto L_0x0057
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.p207b.C4493ba.m12813i(byte[]):java.util.Set");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        p5462h.p5472e.C69598b.m101013a(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0059, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005a, code lost:
        p5462h.p5472e.C69598b.m101013a(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005e, code lost:
        throw r1;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] m12814j(java.util.Set r4) {
        /*
            java.lang.String r0 = "triggers"
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r0)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x000f
            r4 = 0
            byte[] r4 = new byte[r4]
            return r4
        L_0x000f:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0057 }
            r1.<init>(r0)     // Catch:{ all -> 0x0057 }
            int r2 = r4.size()     // Catch:{ all -> 0x0050 }
            r1.writeInt(r2)     // Catch:{ all -> 0x0050 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0050 }
        L_0x0024:
            boolean r2 = r4.hasNext()     // Catch:{ all -> 0x0050 }
            if (r2 == 0) goto L_0x003f
            java.lang.Object r2 = r4.next()     // Catch:{ all -> 0x0050 }
            androidx.work.g r2 = (androidx.work.C4411g) r2     // Catch:{ all -> 0x0050 }
            android.net.Uri r3 = r2.f14078a     // Catch:{ all -> 0x0050 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0050 }
            r1.writeUTF(r3)     // Catch:{ all -> 0x0050 }
            boolean r2 = r2.f14079b     // Catch:{ all -> 0x0050 }
            r1.writeBoolean(r2)     // Catch:{ all -> 0x0050 }
            goto L_0x0024
        L_0x003f:
            r4 = 0
            p5462h.p5472e.C69598b.m101013a(r1, r4)     // Catch:{ all -> 0x0057 }
            p5462h.p5472e.C69598b.m101013a(r0, r4)
            byte[] r4 = r0.toByteArray()
            java.lang.String r0 = "outputStream.toByteArray()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r0)
            return r4
        L_0x0050:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r2 = move-exception
            p5462h.p5472e.C69598b.m101013a(r1, r4)     // Catch:{ all -> 0x0057 }
            throw r2     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r1 = move-exception
            p5462h.p5472e.C69598b.m101013a(r0, r4)
            goto L_0x005f
        L_0x005e:
            throw r1
        L_0x005f:
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.p207b.C4493ba.m12814j(java.util.Set):byte[]");
    }

    /* renamed from: f */
    public static final C4381ae m12810f(int i) {
        if (i == 0) {
            return C4381ae.NOT_REQUIRED;
        }
        if (i == 1) {
            return C4381ae.CONNECTED;
        }
        if (i == 2) {
            return C4381ae.UNMETERED;
        }
        if (i == 3) {
            return C4381ae.NOT_ROAMING;
        }
        if (i == 4) {
            return C4381ae.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return C4381ae.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to NetworkType");
    }
}
