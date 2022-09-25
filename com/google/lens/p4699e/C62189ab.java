package com.google.lens.p4699e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.e.ab */
/* compiled from: PG */
public final class C62189ab extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62189ab f167914a;

    /* renamed from: b */
    private static volatile C63010eb f167915b;

    static {
        C62189ab abVar = new C62189ab();
        f167914a = abVar;
        C62942bv.registerDefaultInstance(C62189ab.class, abVar);
    }

    private C62189ab() {
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
                return newMessageInfo(f167914a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62189ab();
            case 4:
                return new C62188aa();
            case 5:
                return f167914a;
            case 6:
                C63010eb ebVar = f167915b;
                if (ebVar == null) {
                    synchronized (C62189ab.class) {
                        ebVar = f167915b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167914a);
                            f167915b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
