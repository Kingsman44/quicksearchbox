package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.cx */
/* compiled from: PG */
public final class C49893cx extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49893cx f129688b;

    /* renamed from: c */
    private static volatile C63010eb f129689c;

    /* renamed from: a */
    public C62971cq f129690a = emptyProtobufList();

    static {
        C49893cx cxVar = new C49893cx();
        f129688b = cxVar;
        C62942bv.registerDefaultInstance(C49893cx.class, cxVar);
    }

    private C49893cx() {
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
                return newMessageInfo(f129688b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C49879cj.class});
            case 3:
                return new C49893cx();
            case 4:
                return new C49892cw();
            case 5:
                return f129688b;
            case 6:
                C63010eb ebVar = f129689c;
                if (ebVar == null) {
                    synchronized (C49893cx.class) {
                        ebVar = f129689c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129688b);
                            f129689c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
