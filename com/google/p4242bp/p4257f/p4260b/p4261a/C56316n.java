package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.b.a.n */
/* compiled from: PG */
public final class C56316n extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56316n f150085a;

    /* renamed from: b */
    private static volatile C63010eb f150086b;

    static {
        C56316n nVar = new C56316n();
        f150085a = nVar;
        C62942bv.registerDefaultInstance(C56316n.class, nVar);
    }

    private C56316n() {
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
                return newMessageInfo(f150085a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56316n();
            case 4:
                return new C56315m();
            case 5:
                return f150085a;
            case 6:
                C63010eb ebVar = f150086b;
                if (ebVar == null) {
                    synchronized (C56316n.class) {
                        ebVar = f150086b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150085a);
                            f150086b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
