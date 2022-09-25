package com.google.protos.p4985f.p5048z.p5051b.p5052a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.z.b.a.d */
/* compiled from: PG */
public final class C65402d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65402d f177817a;

    /* renamed from: b */
    private static volatile C63010eb f177818b;

    static {
        C65402d dVar = new C65402d();
        f177817a = dVar;
        C62942bv.registerDefaultInstance(C65402d.class, dVar);
    }

    private C65402d() {
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
                return newMessageInfo(f177817a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65402d();
            case 4:
                return new C65401c();
            case 5:
                return f177817a;
            case 6:
                C63010eb ebVar = f177818b;
                if (ebVar == null) {
                    synchronized (C65402d.class) {
                        ebVar = f177818b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177817a);
                            f177818b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
