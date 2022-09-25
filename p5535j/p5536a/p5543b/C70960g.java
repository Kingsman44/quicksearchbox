package p5535j.p5536a.p5543b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.b.g */
/* compiled from: PG */
public final class C70960g extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C70960g f189212a;

    /* renamed from: b */
    private static volatile C63010eb f189213b;

    static {
        C70960g gVar = new C70960g();
        f189212a = gVar;
        C62942bv.registerDefaultInstance(C70960g.class, gVar);
    }

    private C70960g() {
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
                return newMessageInfo(f189212a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C70960g();
            case 4:
                return new C70959f();
            case 5:
                return f189212a;
            case 6:
                C63010eb ebVar = f189213b;
                if (ebVar == null) {
                    synchronized (C70960g.class) {
                        ebVar = f189213b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189212a);
                            f189213b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
