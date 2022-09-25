package p5488io.grpc.binder;

import android.content.pm.Signature;
import com.google.common.base.C58839bc;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4537i.C59277b;
import com.google.common.p4537i.C59290o;
import com.google.common.p4537i.C59294s;
import java.util.Arrays;

/* renamed from: io.grpc.binder.k */
/* compiled from: PG */
public final /* synthetic */ class C70231k implements C58839bc {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f187215a;

    public /* synthetic */ C70231k(C58485gu guVar) {
        this.f187215a = guVar;
    }

    /* renamed from: a */
    public final boolean mo5941a(Object obj) {
        C58485gu guVar = this.f187215a;
        int i = C70234n.f187218a;
        C59290o e = C59294s.m92135e();
        byte[] byteArray = ((Signature) obj).toByteArray();
        byte[] e2 = ((C59277b) e).mo56761d(byteArray, byteArray.length).mo56775e();
        C58801sm G = guVar.listIterator(0);
        while (G.hasNext()) {
            if (Arrays.equals((byte[]) G.next(), e2)) {
                return true;
            }
        }
        return false;
    }
}
