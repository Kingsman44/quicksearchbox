package p5488io.grpc;

import com.google.common.base.C58913w;
import java.util.List;

/* renamed from: io.grpc.ey */
/* compiled from: PG */
final class C70720ey implements C70333dd {
    /* renamed from: a */
    public final /* synthetic */ Object mo62024a(byte[] bArr) {
        int i;
        int i2;
        byte b;
        List list = Status.f186903a;
        int length = bArr.length;
        char c = 0;
        if (length == 1) {
            if (bArr[0] == 48) {
                return Status.f186902OK;
            }
            length = 1;
        }
        if (length != 1) {
            if (length == 2 && (b = bArr[0]) >= 48 && b <= 57) {
                i = (b - 48) * 10;
                c = 1;
            }
            return Status.f186905c.withDescription("Unknown code ".concat(new String(bArr, C58913w.f156752a)));
        }
        i = 0;
        byte b2 = bArr[c];
        if (b2 >= 48 && b2 <= 57 && (i2 = i + (b2 - 48)) < Status.f186903a.size()) {
            return (Status) Status.f186903a.get(i2);
        }
        return Status.f186905c.withDescription("Unknown code ".concat(new String(bArr, C58913w.f156752a)));
    }

    /* renamed from: b */
    public final /* synthetic */ byte[] mo62025b(Object obj) {
        return ((Status) obj).getCode().f186941r;
    }
}
