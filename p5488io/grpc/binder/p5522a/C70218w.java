package p5488io.grpc.binder.p5522a;

import java.io.InputStream;

/* renamed from: io.grpc.binder.a.w */
/* compiled from: PG */
final class C70218w {

    /* renamed from: a */
    final InputStream f187160a;

    /* renamed from: b */
    final byte[] f187161b;

    /* renamed from: c */
    final int f187162c;

    /* renamed from: d */
    final boolean f187163d;

    public C70218w(InputStream inputStream, byte[] bArr, int i, boolean z) {
        this.f187160a = inputStream;
        this.f187161b = bArr;
        this.f187162c = i;
        this.f187163d = z;
    }

    public final String toString() {
        int i = this.f187162c;
        String str = this.f187160a != null ? "stream" : "array";
        String str2 = true != this.f187163d ? "]" : "(last)]";
        return "TransactionData[" + i + "b " + str + str2;
    }
}
