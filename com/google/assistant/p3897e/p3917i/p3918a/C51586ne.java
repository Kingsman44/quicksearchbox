package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.ne */
/* compiled from: PG */
public final class C51586ne extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51586ne f134446b;

    /* renamed from: c */
    private static volatile C63010eb f134447c;

    /* renamed from: a */
    public C62971cq f134448a = emptyProtobufList();

    static {
        C51586ne neVar = new C51586ne();
        f134446b = neVar;
        C62942bv.registerDefaultInstance(C51586ne.class, neVar);
    }

    private C51586ne() {
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
                return newMessageInfo(f134446b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C51585nd.class});
            case 3:
                return new C51586ne();
            case 4:
                return new C51583nb();
            case 5:
                return f134446b;
            case 6:
                C63010eb ebVar = f134447c;
                if (ebVar == null) {
                    synchronized (C51586ne.class) {
                        ebVar = f134447c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134446b);
                            f134447c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
