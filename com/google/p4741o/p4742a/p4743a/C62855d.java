package com.google.p4741o.p4742a.p4743a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.o.a.a.d */
/* compiled from: PG */
public final class C62855d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62855d f169737b;

    /* renamed from: c */
    private static volatile C63010eb f169738c;

    /* renamed from: a */
    public C62971cq f169739a = emptyProtobufList();

    static {
        C62855d dVar = new C62855d();
        f169737b = dVar;
        C62942bv.registerDefaultInstance(C62855d.class, dVar);
    }

    private C62855d() {
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
                return newMessageInfo(f169737b, "\u0000\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0001\u0000\u0004\u001b", new Object[]{"a", C62861j.class});
            case 3:
                return new C62855d();
            case 4:
                return new C62854c();
            case 5:
                return f169737b;
            case 6:
                C63010eb ebVar = f169738c;
                if (ebVar == null) {
                    synchronized (C62855d.class) {
                        ebVar = f169738c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169737b);
                            f169738c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
