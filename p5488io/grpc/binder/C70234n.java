package p5488io.grpc.binder;

import android.content.pm.PackageManager;
import android.os.Process;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4522b.C58801sm;
import java.util.Arrays;

/* renamed from: io.grpc.binder.n */
/* compiled from: PG */
public final class C70234n {

    /* renamed from: a */
    public static final int f187218a = Process.myUid();

    /* renamed from: a */
    public static C70235o m102384a() {
        return new C70232l();
    }

    /* renamed from: b */
    public static C70237q m102385b() {
        return new C70237q(C58729pv.f156485a);
    }

    /* renamed from: c */
    public static C70235o m102386c(PackageManager packageManager, byte[] bArr) {
        C58485gu n = C58485gu.m89846n(bArr);
        packageManager.getClass();
        n.getClass();
        C58838bb.m90868c(!n.isEmpty());
        C58480gp e = C58485gu.m89837e();
        C58801sm G = n.listIterator(0);
        while (G.hasNext()) {
            byte[] bArr2 = (byte[]) G.next();
            bArr2.getClass();
            int length = bArr2.length;
            C58838bb.m90868c(length == 32);
            e.mo55395g(Arrays.copyOf(bArr2, length));
        }
        return new C70233m(packageManager, e.mo55394f());
    }
}
