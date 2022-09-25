package com.google.assistant.p3775ac.p3780e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ac.e.b */
/* compiled from: PG */
public final class C48474b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48474b f125218a;

    /* renamed from: b */
    private static volatile C63010eb f125219b;

    static {
        C48474b bVar = new C48474b();
        f125218a = bVar;
        C62942bv.registerDefaultInstance(C48474b.class, bVar);
    }

    private C48474b() {
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
                return newMessageInfo(f125218a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48474b();
            case 4:
                return new C48473a();
            case 5:
                return f125218a;
            case 6:
                C63010eb ebVar = f125219b;
                if (ebVar == null) {
                    synchronized (C48474b.class) {
                        ebVar = f125219b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125218a);
                            f125219b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
