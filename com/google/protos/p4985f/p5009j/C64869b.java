package com.google.protos.p4985f.p5009j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.j.b */
/* compiled from: PG */
public final class C64869b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64869b f175776a;

    /* renamed from: b */
    private static volatile C63010eb f175777b;

    static {
        C64869b bVar = new C64869b();
        f175776a = bVar;
        C62942bv.registerDefaultInstance(C64869b.class, bVar);
    }

    private C64869b() {
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
                return newMessageInfo(f175776a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64869b();
            case 4:
                return new C64866a();
            case 5:
                return f175776a;
            case 6:
                C63010eb ebVar = f175777b;
                if (ebVar == null) {
                    synchronized (C64869b.class) {
                        ebVar = f175777b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175776a);
                            f175777b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
