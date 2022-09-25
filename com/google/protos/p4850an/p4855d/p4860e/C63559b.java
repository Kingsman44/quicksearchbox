package com.google.protos.p4850an.p4855d.p4860e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.d.e.b */
/* compiled from: PG */
public final class C63559b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63559b f171923a;

    /* renamed from: b */
    private static volatile C63010eb f171924b;

    static {
        C63559b bVar = new C63559b();
        f171923a = bVar;
        C62942bv.registerDefaultInstance(C63559b.class, bVar);
    }

    private C63559b() {
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
                return newMessageInfo(f171923a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C63559b();
            case 4:
                return new C63558a();
            case 5:
                return f171923a;
            case 6:
                C63010eb ebVar = f171924b;
                if (ebVar == null) {
                    synchronized (C63559b.class) {
                        ebVar = f171924b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171923a);
                            f171924b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
