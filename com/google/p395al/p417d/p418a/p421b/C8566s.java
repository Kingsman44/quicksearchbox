package com.google.p395al.p417d.p418a.p421b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.d.a.b.s */
/* compiled from: PG */
public final class C8566s extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8566s f29677a;

    /* renamed from: b */
    private static volatile C63010eb f29678b;

    static {
        C8566s sVar = new C8566s();
        f29677a = sVar;
        C62942bv.registerDefaultInstance(C8566s.class, sVar);
    }

    private C8566s() {
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
                return newMessageInfo(f29677a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C8566s();
            case 4:
                return new C8565r();
            case 5:
                return f29677a;
            case 6:
                C63010eb ebVar = f29678b;
                if (ebVar == null) {
                    synchronized (C8566s.class) {
                        ebVar = f29678b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29677a);
                            f29678b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
