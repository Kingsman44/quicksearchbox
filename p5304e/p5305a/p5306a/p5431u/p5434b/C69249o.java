package p5304e.p5305a.p5306a.p5431u.p5434b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: e.a.a.u.b.o */
/* compiled from: PG */
public final class C69249o extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C69249o f185360b;

    /* renamed from: c */
    private static volatile C63010eb f185361c;

    /* renamed from: a */
    public C62971cq f185362a = emptyProtobufList();

    static {
        C69249o oVar = new C69249o();
        f185360b = oVar;
        C62942bv.registerDefaultInstance(C69249o.class, oVar);
    }

    private C69249o() {
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
                return newMessageInfo(f185360b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C69247m.class});
            case 3:
                return new C69249o();
            case 4:
                return new C69248n();
            case 5:
                return f185360b;
            case 6:
                C63010eb ebVar = f185361c;
                if (ebVar == null) {
                    synchronized (C69249o.class) {
                        ebVar = f185361c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f185360b);
                            f185361c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
