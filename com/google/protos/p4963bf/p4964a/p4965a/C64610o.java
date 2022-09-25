package com.google.protos.p4963bf.p4964a.p4965a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.bf.a.a.o */
/* compiled from: PG */
public final class C64610o extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64610o f175159a;

    /* renamed from: b */
    private static volatile C63010eb f175160b;

    static {
        C64610o oVar = new C64610o();
        f175159a = oVar;
        C62942bv.registerDefaultInstance(C64610o.class, oVar);
    }

    private C64610o() {
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
                return newMessageInfo(f175159a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64610o();
            case 4:
                return new C64609n();
            case 5:
                return f175159a;
            case 6:
                C63010eb ebVar = f175160b;
                if (ebVar == null) {
                    synchronized (C64610o.class) {
                        ebVar = f175160b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175159a);
                            f175160b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
