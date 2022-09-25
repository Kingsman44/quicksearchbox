package com.google.assistant.p3931f.p3939c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.f.c.f */
/* compiled from: PG */
public final class C52829f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52829f f138611c;

    /* renamed from: d */
    private static volatile C63010eb f138612d;

    /* renamed from: a */
    public C62971cq f138613a = emptyProtobufList();

    /* renamed from: b */
    public C52824an f138614b;

    static {
        C52829f fVar = new C52829f();
        f138611c = fVar;
        C62942bv.registerDefaultInstance(C52829f.class, fVar);
    }

    private C52829f() {
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
                return newMessageInfo(f138611c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\t", new Object[]{"a", C52825b.class, "b"});
            case 3:
                return new C52829f();
            case 4:
                return new C52826c();
            case 5:
                return f138611c;
            case 6:
                C63010eb ebVar = f138612d;
                if (ebVar == null) {
                    synchronized (C52829f.class) {
                        ebVar = f138612d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138611c);
                            f138612d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
