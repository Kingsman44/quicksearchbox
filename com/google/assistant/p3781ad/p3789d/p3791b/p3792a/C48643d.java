package com.google.assistant.p3781ad.p3789d.p3791b.p3792a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.a.d */
/* compiled from: PG */
public final class C48643d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48643d f125723b;

    /* renamed from: c */
    private static volatile C63010eb f125724c;

    /* renamed from: a */
    public C62971cq f125725a = emptyProtobufList();

    static {
        C48643d dVar = new C48643d();
        f125723b = dVar;
        C62942bv.registerDefaultInstance(C48643d.class, dVar);
    }

    private C48643d() {
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
                return newMessageInfo(f125723b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C48638c.class});
            case 3:
                return new C48643d();
            case 4:
                return new C48584a();
            case 5:
                return f125723b;
            case 6:
                C63010eb ebVar = f125724c;
                if (ebVar == null) {
                    synchronized (C48643d.class) {
                        ebVar = f125724c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125723b);
                            f125724c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
