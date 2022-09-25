package p001a.p014d.p015a.p016a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: a.d.a.a.as */
/* compiled from: PG */
public final class C0056as extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C0056as f147d;

    /* renamed from: e */
    private static volatile C63010eb f148e;

    /* renamed from: a */
    public C62971cq f149a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public C62971cq f150b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public float f151c;

    static {
        C0056as asVar = new C0056as();
        f147d = asVar;
        C62942bv.registerDefaultInstance(C0056as.class, asVar);
    }

    private C0056as() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f147d, "\u0000\u0003\u0000\u0000\u0010\u0012\u0003\u0000\u0002\u0000\u0010Ț\u0011Ț\u0012\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C0056as();
            case 4:
                return new C0055ar();
            case 5:
                return f147d;
            case 6:
                C63010eb ebVar = f148e;
                if (ebVar == null) {
                    synchronized (C0056as.class) {
                        ebVar = f148e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147d);
                            f148e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
