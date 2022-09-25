package com.google.assistant.p3931f.p3939c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.f.c.an */
/* compiled from: PG */
public final class C52824an extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52824an f138590b;

    /* renamed from: c */
    private static volatile C63010eb f138591c;

    /* renamed from: a */
    public C62971cq f138592a = emptyProtobufList();

    static {
        C52824an anVar = new C52824an();
        f138590b = anVar;
        C62942bv.registerDefaultInstance(C52824an.class, anVar);
    }

    private C52824an() {
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
                return newMessageInfo(f138590b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C52822al.class});
            case 3:
                return new C52824an();
            case 4:
                return new C52823am();
            case 5:
                return f138590b;
            case 6:
                C63010eb ebVar = f138591c;
                if (ebVar == null) {
                    synchronized (C52824an.class) {
                        ebVar = f138591c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138590b);
                            f138591c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
