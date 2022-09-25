package com.google.p4433bz.p4437b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bz.b.b */
/* compiled from: PG */
public final class C57897b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C57897b f154867a;

    /* renamed from: b */
    private static volatile C63010eb f154868b;

    static {
        C57897b bVar = new C57897b();
        f154867a = bVar;
        C62942bv.registerDefaultInstance(C57897b.class, bVar);
    }

    private C57897b() {
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
                return newMessageInfo(f154867a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C57897b();
            case 4:
                return new C57896a();
            case 5:
                return f154867a;
            case 6:
                C63010eb ebVar = f154868b;
                if (ebVar == null) {
                    synchronized (C57897b.class) {
                        ebVar = f154868b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154867a);
                            f154868b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
