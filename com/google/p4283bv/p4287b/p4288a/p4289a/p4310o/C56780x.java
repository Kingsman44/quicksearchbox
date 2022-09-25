package com.google.p4283bv.p4287b.p4288a.p4289a.p4310o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.o.x */
/* compiled from: PG */
public final class C56780x extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56780x f151516a;

    /* renamed from: b */
    private static volatile C63010eb f151517b;

    static {
        C56780x xVar = new C56780x();
        f151516a = xVar;
        C62942bv.registerDefaultInstance(C56780x.class, xVar);
    }

    private C56780x() {
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
                return newMessageInfo(f151516a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56780x();
            case 4:
                return new C56779w();
            case 5:
                return f151516a;
            case 6:
                C63010eb ebVar = f151517b;
                if (ebVar == null) {
                    synchronized (C56780x.class) {
                        ebVar = f151517b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151516a);
                            f151517b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
