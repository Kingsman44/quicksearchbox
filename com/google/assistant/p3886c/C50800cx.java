package com.google.assistant.p3886c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.cx */
/* compiled from: PG */
public final class C50800cx extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50800cx f132233b;

    /* renamed from: c */
    private static volatile C63010eb f132234c;

    /* renamed from: a */
    public C62971cq f132235a = emptyProtobufList();

    static {
        C50800cx cxVar = new C50800cx();
        f132233b = cxVar;
        C62942bv.registerDefaultInstance(C50800cx.class, cxVar);
    }

    private C50800cx() {
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
                return newMessageInfo(f132233b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", C50798cv.class});
            case 3:
                return new C50800cx();
            case 4:
                return new C50799cw();
            case 5:
                return f132233b;
            case 6:
                C63010eb ebVar = f132234c;
                if (ebVar == null) {
                    synchronized (C50800cx.class) {
                        ebVar = f132234c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132233b);
                            f132234c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
