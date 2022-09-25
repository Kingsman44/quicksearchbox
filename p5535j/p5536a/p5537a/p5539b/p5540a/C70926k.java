package p5535j.p5536a.p5537a.p5539b.p5540a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.a.b.a.k */
/* compiled from: PG */
public final class C70926k extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C70926k f189130a;

    /* renamed from: b */
    private static volatile C63010eb f189131b;

    static {
        C70926k kVar = new C70926k();
        f189130a = kVar;
        C62942bv.registerDefaultInstance(C70926k.class, kVar);
    }

    private C70926k() {
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
                return newMessageInfo(f189130a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C70926k();
            case 4:
                return new C70925j();
            case 5:
                return f189130a;
            case 6:
                C63010eb ebVar = f189131b;
                if (ebVar == null) {
                    synchronized (C70926k.class) {
                        ebVar = f189131b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189130a);
                            f189131b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
