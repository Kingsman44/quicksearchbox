package com.google.protos.p4846am.p4847a.p4848a.p4849a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.am.a.a.a.b */
/* compiled from: PG */
public final class C63315b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63315b f171123a;

    /* renamed from: b */
    private static volatile C63010eb f171124b;

    static {
        C63315b bVar = new C63315b();
        f171123a = bVar;
        C62942bv.registerDefaultInstance(C63315b.class, bVar);
    }

    private C63315b() {
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
                return newMessageInfo(f171123a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C63315b();
            case 4:
                return new C63314a();
            case 5:
                return f171123a;
            case 6:
                C63010eb ebVar = f171124b;
                if (ebVar == null) {
                    synchronized (C63315b.class) {
                        ebVar = f171124b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171123a);
                            f171124b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
