package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.af */
/* compiled from: PG */
public final class C62027af extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62027af f167601a;

    /* renamed from: b */
    private static volatile C63010eb f167602b;

    static {
        C62027af afVar = new C62027af();
        f167601a = afVar;
        C62942bv.registerDefaultInstance(C62027af.class, afVar);
    }

    private C62027af() {
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
                return newMessageInfo(f167601a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62027af();
            case 4:
                return new C62026ae();
            case 5:
                return f167601a;
            case 6:
                C63010eb ebVar = f167602b;
                if (ebVar == null) {
                    synchronized (C62027af.class) {
                        ebVar = f167602b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167601a);
                            f167602b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
