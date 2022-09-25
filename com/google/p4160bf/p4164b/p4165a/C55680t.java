package com.google.p4160bf.p4164b.p4165a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.t */
/* compiled from: PG */
public final class C55680t extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55680t f146904a;

    /* renamed from: b */
    private static volatile C63010eb f146905b;

    static {
        C55680t tVar = new C55680t();
        f146904a = tVar;
        C62942bv.registerDefaultInstance(C55680t.class, tVar);
    }

    private C55680t() {
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
                return newMessageInfo(f146904a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C55680t();
            case 4:
                return new C55679s();
            case 5:
                return f146904a;
            case 6:
                C63010eb ebVar = f146905b;
                if (ebVar == null) {
                    synchronized (C55680t.class) {
                        ebVar = f146905b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146904a);
                            f146905b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
