package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.b */
/* compiled from: PG */
public final class C62048b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62048b f167629a;

    /* renamed from: b */
    private static volatile C63010eb f167630b;

    static {
        C62048b bVar = new C62048b();
        f167629a = bVar;
        C62942bv.registerDefaultInstance(C62048b.class, bVar);
    }

    private C62048b() {
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
                return newMessageInfo(f167629a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62048b();
            case 4:
                return new C62021a();
            case 5:
                return f167629a;
            case 6:
                C63010eb ebVar = f167630b;
                if (ebVar == null) {
                    synchronized (C62048b.class) {
                        ebVar = f167630b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167629a);
                            f167630b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
