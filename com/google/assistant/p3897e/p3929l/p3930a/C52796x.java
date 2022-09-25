package com.google.assistant.p3897e.p3929l.p3930a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.l.a.x */
/* compiled from: PG */
public final class C52796x extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52796x f138517c;

    /* renamed from: e */
    private static volatile C63010eb f138518e;

    /* renamed from: a */
    public int f138519a;

    /* renamed from: b */
    public C62971cq f138520b = C62942bv.emptyProtobufList();

    /* renamed from: d */
    private int f138521d;

    static {
        C52796x xVar = new C52796x();
        f138517c = xVar;
        C62942bv.registerDefaultInstance(C52796x.class, xVar);
    }

    private C52796x() {
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
                return newMessageInfo(f138517c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001a", new Object[]{"d", "a", C52793u.f138516a, "b"});
            case 3:
                return new C52796x();
            case 4:
                return new C52795w();
            case 5:
                return f138517c;
            case 6:
                C63010eb ebVar = f138518e;
                if (ebVar == null) {
                    synchronized (C52796x.class) {
                        ebVar = f138518e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138517c);
                            f138518e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
