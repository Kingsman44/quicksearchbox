package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.aj */
/* compiled from: PG */
public final class C50938aj extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50938aj f132608b;

    /* renamed from: d */
    private static volatile C63010eb f132609d;

    /* renamed from: a */
    public C62971cq f132610a = emptyProtobufList();

    /* renamed from: c */
    private byte f132611c = 2;

    static {
        C50938aj ajVar = new C50938aj();
        f132608b = ajVar;
        C62942bv.registerDefaultInstance(C50938aj.class, ajVar);
    }

    private C50938aj() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f132611c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f132611c = b;
                return null;
            case 2:
                return newMessageInfo(f132608b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C50936ah.class});
            case 3:
                return new C50938aj();
            case 4:
                return new C50937ai();
            case 5:
                return f132608b;
            case 6:
                C63010eb ebVar = f132609d;
                if (ebVar == null) {
                    synchronized (C50938aj.class) {
                        ebVar = f132609d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132608b);
                            f132609d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
