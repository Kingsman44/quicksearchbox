package p5451f.p5452a.p5453a.p5454a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: f.a.a.a.bt */
/* compiled from: PG */
public final class C69425bt extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C69425bt f185762e;

    /* renamed from: f */
    private static volatile C63010eb f185763f;

    /* renamed from: a */
    public int f185764a;

    /* renamed from: b */
    public int f185765b;

    /* renamed from: c */
    public long f185766c;

    /* renamed from: d */
    public C62971cq f185767d = emptyProtobufList();

    static {
        C69425bt btVar = new C69425bt();
        f185762e = btVar;
        C62942bv.registerDefaultInstance(C69425bt.class, btVar);
    }

    private C69425bt() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f185762e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003\u001b", new Object[]{"a", "b", C69423br.f185761a, C45240c.f118157a, "d", C69455t.class});
            case 3:
                return new C69425bt();
            case 4:
                return new C69422bq();
            case 5:
                return f185762e;
            case 6:
                C63010eb ebVar = f185763f;
                if (ebVar == null) {
                    synchronized (C69425bt.class) {
                        ebVar = f185763f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f185762e);
                            f185763f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
