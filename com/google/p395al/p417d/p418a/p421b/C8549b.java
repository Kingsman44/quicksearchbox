package com.google.p395al.p417d.p418a.p421b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.d.a.b.b */
/* compiled from: PG */
public final class C8549b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8549b f29646a;

    /* renamed from: b */
    private static volatile C63010eb f29647b;

    static {
        C8549b bVar = new C8549b();
        f29646a = bVar;
        C62942bv.registerDefaultInstance(C8549b.class, bVar);
    }

    private C8549b() {
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
                return newMessageInfo(f29646a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C8549b();
            case 4:
                return new C8548a();
            case 5:
                return f29646a;
            case 6:
                C63010eb ebVar = f29647b;
                if (ebVar == null) {
                    synchronized (C8549b.class) {
                        ebVar = f29647b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29646a);
                            f29647b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
