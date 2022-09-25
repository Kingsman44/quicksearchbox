package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.aem */
/* compiled from: PG */
public final class aem extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final aem f158471b;

    /* renamed from: c */
    private static volatile C63010eb f158472c;

    /* renamed from: a */
    public C62971cq f158473a = emptyProtobufList();

    static {
        aem aem = new aem();
        f158471b = aem;
        C62942bv.registerDefaultInstance(aem.class, aem);
    }

    private aem() {
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
                return newMessageInfo(f158471b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C59994ir.class});
            case 3:
                return new aem();
            case 4:
                return new ael();
            case 5:
                return f158471b;
            case 6:
                C63010eb ebVar = f158472c;
                if (ebVar == null) {
                    synchronized (aem.class) {
                        ebVar = f158472c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158471b);
                            f158472c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
