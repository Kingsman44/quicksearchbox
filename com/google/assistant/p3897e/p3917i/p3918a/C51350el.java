package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.el */
/* compiled from: PG */
public final class C51350el extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51350el f133749b;

    /* renamed from: c */
    private static volatile C63010eb f133750c;

    /* renamed from: a */
    public C62971cq f133751a = emptyProtobufList();

    static {
        C51350el elVar = new C51350el();
        f133749b = elVar;
        C62942bv.registerDefaultInstance(C51350el.class, elVar);
    }

    private C51350el() {
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
                return newMessageInfo(f133749b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C51348ej.class});
            case 3:
                return new C51350el();
            case 4:
                return new C51349ek();
            case 5:
                return f133749b;
            case 6:
                C63010eb ebVar = f133750c;
                if (ebVar == null) {
                    synchronized (C51350el.class) {
                        ebVar = f133750c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133749b);
                            f133750c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
