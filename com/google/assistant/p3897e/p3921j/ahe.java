package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ahe */
/* compiled from: PG */
public final class ahe extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final ahe f135090a;

    /* renamed from: b */
    private static volatile C63010eb f135091b;

    static {
        ahe ahe = new ahe();
        f135090a = ahe;
        C62942bv.registerDefaultInstance(ahe.class, ahe);
    }

    private ahe() {
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
                return newMessageInfo(f135090a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new ahe();
            case 4:
                return new ahd();
            case 5:
                return f135090a;
            case 6:
                C63010eb ebVar = f135091b;
                if (ebVar == null) {
                    synchronized (ahe.class) {
                        ebVar = f135091b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135090a);
                            f135091b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
