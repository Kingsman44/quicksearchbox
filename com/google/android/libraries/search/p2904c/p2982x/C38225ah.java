package com.google.android.libraries.search.p2904c.p2982x;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.x.ah */
/* compiled from: PG */
public final class C38225ah extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C38225ah f101307a;

    /* renamed from: b */
    private static volatile C63010eb f101308b;

    static {
        C38225ah ahVar = new C38225ah();
        f101307a = ahVar;
        C62942bv.registerDefaultInstance(C38225ah.class, ahVar);
    }

    private C38225ah() {
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
                return newMessageInfo(f101307a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C38225ah();
            case 4:
                return new C38224ag();
            case 5:
                return f101307a;
            case 6:
                C63010eb ebVar = f101308b;
                if (ebVar == null) {
                    synchronized (C38225ah.class) {
                        ebVar = f101308b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f101307a);
                            f101308b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
