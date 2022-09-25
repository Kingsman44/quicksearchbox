package com.google.protos.p5127o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.o.bd */
/* compiled from: PG */
public final class C65676bd extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65676bd f178447a;

    /* renamed from: b */
    private static volatile C63010eb f178448b;

    static {
        C65676bd bdVar = new C65676bd();
        f178447a = bdVar;
        C62942bv.registerDefaultInstance(C65676bd.class, bdVar);
    }

    private C65676bd() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f178447a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65676bd();
            case 4:
                return new C65675bc();
            case 5:
                return f178447a;
            case 6:
                C63010eb ebVar = f178448b;
                if (ebVar == null) {
                    synchronized (C65676bd.class) {
                        ebVar = f178448b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178447a);
                            f178448b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
