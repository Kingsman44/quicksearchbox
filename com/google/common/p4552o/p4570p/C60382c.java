package com.google.common.p4552o.p4570p;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.p.c */
/* compiled from: PG */
public final class C60382c extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C60382c f163409a;

    /* renamed from: b */
    private static volatile C63010eb f163410b;

    static {
        C60382c cVar = new C60382c();
        f163409a = cVar;
        C62942bv.registerDefaultInstance(C60382c.class, cVar);
    }

    private C60382c() {
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
                return newMessageInfo(f163409a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C60382c();
            case 4:
                return new C60371b();
            case 5:
                return f163409a;
            case 6:
                C63010eb ebVar = f163410b;
                if (ebVar == null) {
                    synchronized (C60382c.class) {
                        ebVar = f163410b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163409a);
                            f163410b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
