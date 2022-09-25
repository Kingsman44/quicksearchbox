package p5304e.p5305a.p5306a.p5431u.p5434b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: e.a.a.u.b.i */
/* compiled from: PG */
public final class C69243i extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C69243i f185349b;

    /* renamed from: c */
    private static volatile C63010eb f185350c;

    /* renamed from: a */
    public C62971cq f185351a = emptyProtobufList();

    static {
        C69243i iVar = new C69243i();
        f185349b = iVar;
        C62942bv.registerDefaultInstance(C69243i.class, iVar);
    }

    private C69243i() {
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
                return newMessageInfo(f185349b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C69241g.class});
            case 3:
                return new C69243i();
            case 4:
                return new C69242h();
            case 5:
                return f185349b;
            case 6:
                C63010eb ebVar = f185350c;
                if (ebVar == null) {
                    synchronized (C69243i.class) {
                        ebVar = f185350c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f185349b);
                            f185350c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
