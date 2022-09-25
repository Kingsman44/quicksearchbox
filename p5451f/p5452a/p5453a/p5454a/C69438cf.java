package p5451f.p5452a.p5453a.p5454a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: f.a.a.a.cf */
/* compiled from: PG */
public final class C69438cf extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C69438cf f185810a;

    /* renamed from: b */
    private static volatile C63010eb f185811b;

    static {
        C69438cf cfVar = new C69438cf();
        f185810a = cfVar;
        C62942bv.registerDefaultInstance(C69438cf.class, cfVar);
    }

    private C69438cf() {
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
                return newMessageInfo(f185810a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C69438cf();
            case 4:
                return new C69437ce();
            case 5:
                return f185810a;
            case 6:
                C63010eb ebVar = f185811b;
                if (ebVar == null) {
                    synchronized (C69438cf.class) {
                        ebVar = f185811b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f185810a);
                            f185811b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
