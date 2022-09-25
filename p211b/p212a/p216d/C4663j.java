package p211b.p212a.p216d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: b.a.d.j */
/* compiled from: PG */
public final class C4663j extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C4663j f14617a;

    /* renamed from: b */
    private static volatile C63010eb f14618b;

    static {
        C4663j jVar = new C4663j();
        f14617a = jVar;
        C62942bv.registerDefaultInstance(C4663j.class, jVar);
    }

    private C4663j() {
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
                return newMessageInfo(f14617a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C4663j();
            case 4:
                return new C4662i();
            case 5:
                return f14617a;
            case 6:
                C63010eb ebVar = f14618b;
                if (ebVar == null) {
                    synchronized (C4663j.class) {
                        ebVar = f14618b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f14617a);
                            f14618b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
