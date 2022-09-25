package p001a.p014d.p015a.p016a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4887at.p4888a.p4889a.C63813p;

/* renamed from: a.d.a.a.q */
/* compiled from: PG */
public final class C0072q extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C0072q f197d;

    /* renamed from: e */
    private static volatile C63010eb f198e;

    /* renamed from: a */
    public C62971cq f199a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public C63813p f200b;

    /* renamed from: c */
    public int f201c;

    static {
        C0072q qVar = new C0072q();
        f197d = qVar;
        C62942bv.registerDefaultInstance(C0072q.class, qVar);
    }

    private C0072q() {
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
                return newMessageInfo(f197d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ț\u0002\f\u0003\t", new Object[]{"a", C45240c.f118157a, "b"});
            case 3:
                return new C0072q();
            case 4:
                return new C0070o();
            case 5:
                return f197d;
            case 6:
                C63010eb ebVar = f198e;
                if (ebVar == null) {
                    synchronized (C0072q.class) {
                        ebVar = f198e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f197d);
                            f198e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
