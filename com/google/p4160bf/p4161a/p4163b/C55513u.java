package com.google.p4160bf.p4161a.p4163b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.a.b.u */
/* compiled from: PG */
public final class C55513u extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55513u f146492a;

    /* renamed from: b */
    private static volatile C63010eb f146493b;

    static {
        C55513u uVar = new C55513u();
        f146492a = uVar;
        C62942bv.registerDefaultInstance(C55513u.class, uVar);
    }

    private C55513u() {
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
                return newMessageInfo(f146492a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C55513u();
            case 4:
                return new C55512t();
            case 5:
                return f146492a;
            case 6:
                C63010eb ebVar = f146493b;
                if (ebVar == null) {
                    synchronized (C55513u.class) {
                        ebVar = f146493b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146492a);
                            f146493b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
