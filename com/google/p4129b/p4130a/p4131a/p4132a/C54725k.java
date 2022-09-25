package com.google.p4129b.p4130a.p4131a.p4132a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.a.a.a.k */
/* compiled from: PG */
public final class C54725k extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54725k f143621a;

    /* renamed from: b */
    private static volatile C63010eb f143622b;

    static {
        C54725k kVar = new C54725k();
        f143621a = kVar;
        C62942bv.registerDefaultInstance(C54725k.class, kVar);
    }

    private C54725k() {
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
                return newMessageInfo(f143621a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C54725k();
            case 4:
                return new C54724j();
            case 5:
                return f143621a;
            case 6:
                C63010eb ebVar = f143622b;
                if (ebVar == null) {
                    synchronized (C54725k.class) {
                        ebVar = f143622b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143621a);
                            f143622b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
