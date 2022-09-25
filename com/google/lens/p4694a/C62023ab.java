package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.ab */
/* compiled from: PG */
public final class C62023ab extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62023ab f167592a;

    /* renamed from: b */
    private static volatile C63010eb f167593b;

    static {
        C62023ab abVar = new C62023ab();
        f167592a = abVar;
        C62942bv.registerDefaultInstance(C62023ab.class, abVar);
    }

    private C62023ab() {
        emptyProtobufList();
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
                return newMessageInfo(f167592a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62023ab();
            case 4:
                return new C62022aa();
            case 5:
                return f167592a;
            case 6:
                C63010eb ebVar = f167593b;
                if (ebVar == null) {
                    synchronized (C62023ab.class) {
                        ebVar = f167593b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167592a);
                            f167593b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
