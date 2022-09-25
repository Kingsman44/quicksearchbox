package com.google.p4222bl.p4223a.p4224a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bl.a.a.ab */
/* compiled from: PG */
public final class C56058ab extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56058ab f149366a;

    /* renamed from: b */
    private static volatile C63010eb f149367b;

    static {
        C56058ab abVar = new C56058ab();
        f149366a = abVar;
        C62942bv.registerDefaultInstance(C56058ab.class, abVar);
    }

    private C56058ab() {
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
                return newMessageInfo(f149366a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C56058ab();
            case 4:
                return new C56057aa();
            case 5:
                return f149366a;
            case 6:
                C63010eb ebVar = f149367b;
                if (ebVar == null) {
                    synchronized (C56058ab.class) {
                        ebVar = f149367b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149366a);
                            f149367b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
