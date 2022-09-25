package p211b.p212a.p216d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: b.a.d.d */
/* compiled from: PG */
public final class C4657d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C4657d f14601a;

    /* renamed from: b */
    private static volatile C63010eb f14602b;

    static {
        C4657d dVar = new C4657d();
        f14601a = dVar;
        C62942bv.registerDefaultInstance(C4657d.class, dVar);
    }

    private C4657d() {
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
                return newMessageInfo(f14601a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C4657d();
            case 4:
                return new C4656c();
            case 5:
                return f14601a;
            case 6:
                C63010eb ebVar = f14602b;
                if (ebVar == null) {
                    synchronized (C4657d.class) {
                        ebVar = f14602b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f14601a);
                            f14602b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
