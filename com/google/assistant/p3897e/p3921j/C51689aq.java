package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.aq */
/* compiled from: PG */
public final class C51689aq extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51689aq f135597b;

    /* renamed from: c */
    private static volatile C63010eb f135598c;

    /* renamed from: a */
    public C62971cq f135599a = emptyProtobufList();

    static {
        C51689aq aqVar = new C51689aq();
        f135597b = aqVar;
        C62942bv.registerDefaultInstance(C51689aq.class, aqVar);
    }

    private C51689aq() {
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
                return newMessageInfo(f135597b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C51684ao.class});
            case 3:
                return new C51689aq();
            case 4:
                return new C51685ap();
            case 5:
                return f135597b;
            case 6:
                C63010eb ebVar = f135598c;
                if (ebVar == null) {
                    synchronized (C51689aq.class) {
                        ebVar = f135598c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135597b);
                            f135598c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
