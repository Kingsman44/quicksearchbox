package p5488io.grpc.p5525e;

import p5488io.grpc.C70250bu;
import p5488io.grpc.C70251bv;

/* renamed from: io.grpc.e.dx */
/* compiled from: PG */
final class C70462dx implements C70250bu {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo62024a(byte[] bArr) {
        if (bArr.length >= 3) {
            return Integer.valueOf(((bArr[0] - 48) * 100) + ((bArr[1] - 48) * 10) + (bArr[2] - 48));
        }
        throw new NumberFormatException("Malformed status code ".concat(new String(bArr, C70251bv.f187249a)));
    }

    /* renamed from: b */
    public final /* synthetic */ byte[] mo62025b(Object obj) {
        Integer num = (Integer) obj;
        throw new UnsupportedOperationException();
    }
}
