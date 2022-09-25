package com.google.protos.p4850an.p4855d.p4858c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.d.c.b */
/* compiled from: PG */
public final class C63519b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63519b f171810a;

    /* renamed from: b */
    private static volatile C63010eb f171811b;

    static {
        C63519b bVar = new C63519b();
        f171810a = bVar;
        C62942bv.registerDefaultInstance(C63519b.class, bVar);
    }

    private C63519b() {
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
                return newMessageInfo(f171810a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C63519b();
            case 4:
                return new C63492a();
            case 5:
                return f171810a;
            case 6:
                C63010eb ebVar = f171811b;
                if (ebVar == null) {
                    synchronized (C63519b.class) {
                        ebVar = f171811b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171810a);
                            f171811b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
