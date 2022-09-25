package com.google.p427am.p432b.p433a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.b.a.bt */
/* compiled from: PG */
public final class C8668bt extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8668bt f29979a;

    /* renamed from: b */
    private static volatile C63010eb f29980b;

    static {
        C8668bt btVar = new C8668bt();
        f29979a = btVar;
        C62942bv.registerDefaultInstance(C8668bt.class, btVar);
    }

    private C8668bt() {
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
                return newMessageInfo(f29979a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C8668bt();
            case 4:
                return new C8667bs();
            case 5:
                return f29979a;
            case 6:
                C63010eb ebVar = f29980b;
                if (ebVar == null) {
                    synchronized (C8668bt.class) {
                        ebVar = f29980b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29979a);
                            f29980b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
