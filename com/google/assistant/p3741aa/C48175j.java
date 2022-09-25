package com.google.assistant.p3741aa;

import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.aa.j */
/* compiled from: PG */
public final class C48175j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48175j f124656b;

    /* renamed from: c */
    private static volatile C63010eb f124657c;

    /* renamed from: a */
    public C62971cq f124658a = emptyProtobufList();

    static {
        C48175j jVar = new C48175j();
        f124656b = jVar;
        C62942bv.registerDefaultInstance(C48175j.class, jVar);
    }

    private C48175j() {
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
                return newMessageInfo(f124656b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", C52232kc.class});
            case 3:
                return new C48175j();
            case 4:
                return new C48174i();
            case 5:
                return f124656b;
            case 6:
                C63010eb ebVar = f124657c;
                if (ebVar == null) {
                    synchronized (C48175j.class) {
                        ebVar = f124657c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124656b);
                            f124657c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
