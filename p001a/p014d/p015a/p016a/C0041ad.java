package p001a.p014d.p015a.p016a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: a.d.a.a.ad */
/* compiled from: PG */
public final class C0041ad extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C0041ad f110c;

    /* renamed from: d */
    private static volatile C63010eb f111d;

    /* renamed from: a */
    public C62971cq f112a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public C62971cq f113b = C62942bv.emptyProtobufList();

    static {
        C0041ad adVar = new C0041ad();
        f110c = adVar;
        C62942bv.registerDefaultInstance(C0041ad.class, adVar);
    }

    private C0041ad() {
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
                return newMessageInfo(f110c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001Ț\u0002Ț", new Object[]{"a", "b"});
            case 3:
                return new C0041ad();
            case 4:
                return new C0040ac();
            case 5:
                return f110c;
            case 6:
                C63010eb ebVar = f111d;
                if (ebVar == null) {
                    synchronized (C0041ad.class) {
                        ebVar = f111d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f110c);
                            f111d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
