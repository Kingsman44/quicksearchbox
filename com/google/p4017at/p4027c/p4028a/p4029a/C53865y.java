package com.google.p4017at.p4027c.p4028a.p4029a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.c.a.a.y */
/* compiled from: PG */
public final class C53865y extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53865y f141355a;

    /* renamed from: b */
    private static volatile C63010eb f141356b;

    static {
        C53865y yVar = new C53865y();
        f141355a = yVar;
        C62942bv.registerDefaultInstance(C53865y.class, yVar);
    }

    private C53865y() {
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
                return newMessageInfo(f141355a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C53865y();
            case 4:
                return new C53864x();
            case 5:
                return f141355a;
            case 6:
                C63010eb ebVar = f141356b;
                if (ebVar == null) {
                    synchronized (C53865y.class) {
                        ebVar = f141356b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141355a);
                            f141356b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
