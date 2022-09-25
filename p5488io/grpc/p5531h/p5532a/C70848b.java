package p5488io.grpc.p5531h.p5532a;

import com.google.protobuf.C63010eb;
import com.google.protobuf.MessageLite;
import java.io.InputStream;
import p5488io.grpc.C70336dg;

/* renamed from: io.grpc.h.a.b */
/* compiled from: PG */
final class C70848b implements C70336dg {

    /* renamed from: a */
    private static final ThreadLocal f189010a = new ThreadLocal();

    /* renamed from: b */
    private final C63010eb f189011b;

    /* renamed from: c */
    private final MessageLite f189012c;

    public C70848b(MessageLite messageLite) {
        this.f189012c = messageLite;
        this.f189011b = messageLite.getParserForType();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ InputStream mo23738a(Object obj) {
        return new C70847a((MessageLite) obj, this.f189011b);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:0|(2:2|(3:4|5|(2:7|57)(2:8|9)))|10|11|(2:13|(1:(2:35|58))(5:17|(1:23)|24|(1:(1:55)(2:26|(2:54|28)(1:29)))|(9:31|(1:38)|39|40|41|42|43|44|56)(2:32|33)))|36|(0)|39|(6:40|41|42|43|44|56)) */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b7, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00be, code lost:
        throw new java.lang.RuntimeException(r8);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001b */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0021 A[Catch:{ IOException -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0089  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object mo23739b(java.io.InputStream r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p5488io.grpc.p5531h.p5532a.C70847a
            if (r0 == 0) goto L_0x001b
            r0 = r8
            io.grpc.h.a.a r0 = (p5488io.grpc.p5531h.p5532a.C70847a) r0
            com.google.protobuf.eb r1 = r0.f189008b
            com.google.protobuf.eb r2 = r7.f189011b
            if (r1 != r2) goto L_0x001b
            com.google.protobuf.MessageLite r0 = r0.f189007a     // Catch:{ IllegalStateException -> 0x001b }
            if (r0 == 0) goto L_0x0013
            goto L_0x00a0
        L_0x0013:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x001b }
            java.lang.String r1 = "message not available"
            r0.<init>(r1)     // Catch:{ IllegalStateException -> 0x001b }
            throw r0     // Catch:{ IllegalStateException -> 0x001b }
        L_0x001b:
            boolean r0 = r8 instanceof p5488io.grpc.C70255bz     // Catch:{ IOException -> 0x00b7 }
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0086
            int r0 = r8.available()     // Catch:{ IOException -> 0x00b7 }
            if (r0 <= 0) goto L_0x0081
            r3 = 4194304(0x400000, float:5.877472E-39)
            if (r0 > r3) goto L_0x0081
            java.lang.ThreadLocal r3 = f189010a     // Catch:{ IOException -> 0x00b7 }
            java.lang.Object r4 = r3.get()     // Catch:{ IOException -> 0x00b7 }
            java.lang.ref.Reference r4 = (java.lang.ref.Reference) r4     // Catch:{ IOException -> 0x00b7 }
            if (r4 == 0) goto L_0x0040
            java.lang.Object r4 = r4.get()     // Catch:{ IOException -> 0x00b7 }
            byte[] r4 = (byte[]) r4     // Catch:{ IOException -> 0x00b7 }
            if (r4 == 0) goto L_0x0040
            int r5 = r4.length     // Catch:{ IOException -> 0x00b7 }
            if (r5 >= r0) goto L_0x004a
        L_0x0040:
            byte[] r4 = new byte[r0]     // Catch:{ IOException -> 0x00b7 }
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference     // Catch:{ IOException -> 0x00b7 }
            r5.<init>(r4)     // Catch:{ IOException -> 0x00b7 }
            r3.set(r5)     // Catch:{ IOException -> 0x00b7 }
        L_0x004a:
            r3 = r0
        L_0x004b:
            if (r3 <= 0) goto L_0x0059
            int r5 = r0 - r3
            int r5 = r8.read(r4, r5, r3)     // Catch:{ IOException -> 0x00b7 }
            r6 = -1
            if (r5 != r6) goto L_0x0057
            goto L_0x0059
        L_0x0057:
            int r3 = r3 - r5
            goto L_0x004b
        L_0x0059:
            if (r3 != 0) goto L_0x0060
            com.google.protobuf.ae r0 = com.google.protobuf.C62897ae.m95112O(r4, r1, r0)     // Catch:{ IOException -> 0x00b7 }
            goto L_0x0087
        L_0x0060:
            int r8 = r0 - r3
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ IOException -> 0x00b7 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00b7 }
            r2.<init>()     // Catch:{ IOException -> 0x00b7 }
            java.lang.String r3 = "size inaccurate: "
            r2.append(r3)     // Catch:{ IOException -> 0x00b7 }
            r2.append(r0)     // Catch:{ IOException -> 0x00b7 }
            java.lang.String r0 = " != "
            r2.append(r0)     // Catch:{ IOException -> 0x00b7 }
            r2.append(r8)     // Catch:{ IOException -> 0x00b7 }
            java.lang.String r8 = r2.toString()     // Catch:{ IOException -> 0x00b7 }
            r1.<init>(r8)     // Catch:{ IOException -> 0x00b7 }
            throw r1     // Catch:{ IOException -> 0x00b7 }
        L_0x0081:
            if (r0 != 0) goto L_0x0086
            com.google.protobuf.MessageLite r0 = r7.f189012c     // Catch:{ IOException -> 0x00b7 }
            goto L_0x00a0
        L_0x0086:
            r0 = r2
        L_0x0087:
            if (r0 != 0) goto L_0x008d
            com.google.protobuf.ae r0 = com.google.protobuf.C62897ae.m95110M(r8)
        L_0x008d:
            r8 = 2147483647(0x7fffffff, float:NaN)
            r0.f169830e = r8
            com.google.protobuf.eb r8 = r7.f189011b     // Catch:{ ct -> 0x00a3 }
            com.google.protobuf.ba r3 = p5488io.grpc.p5531h.p5532a.C70850d.f189014a     // Catch:{ ct -> 0x00a3 }
            java.lang.Object r8 = r8.mo59012k(r0, r3)     // Catch:{ ct -> 0x00a3 }
            com.google.protobuf.MessageLite r8 = (com.google.protobuf.MessageLite) r8     // Catch:{ ct -> 0x00a3 }
            r0.mo58658A(r1)     // Catch:{ ct -> 0x00a1 }
            r0 = r8
        L_0x00a0:
            return r0
        L_0x00a1:
            r8 = move-exception
            throw r8     // Catch:{ ct -> 0x00a3 }
        L_0x00a3:
            r8 = move-exception
            io.grpc.Status r0 = p5488io.grpc.Status.f186915m
            java.lang.String r1 = "Invalid protobuf byte sequence"
            io.grpc.Status r0 = r0.withDescription(r1)
            io.grpc.Status r8 = r0.mo61678e(r8)
            io.grpc.fa r0 = new io.grpc.fa
            r1 = 1
            r0.<init>(r8, r2, r1)
            throw r0
        L_0x00b7:
            r8 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r8)
            goto L_0x00bf
        L_0x00be:
            throw r0
        L_0x00bf:
            goto L_0x00be
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5531h.p5532a.C70848b.mo23739b(java.io.InputStream):java.lang.Object");
    }
}
