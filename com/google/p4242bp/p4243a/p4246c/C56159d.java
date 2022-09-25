package com.google.p4242bp.p4243a.p4246c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.a.c.d */
/* compiled from: PG */
public final class C56159d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56159d f149629b;

    /* renamed from: c */
    private static volatile C63010eb f149630c;

    /* renamed from: a */
    public C62971cq f149631a = emptyProtobufList();

    static {
        C56159d dVar = new C56159d();
        f149629b = dVar;
        C62942bv.registerDefaultInstance(C56159d.class, dVar);
    }

    private C56159d() {
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
                return newMessageInfo(f149629b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C56157b.class});
            case 3:
                return new C56159d();
            case 4:
                return new C56158c();
            case 5:
                return f149629b;
            case 6:
                C63010eb ebVar = f149630c;
                if (ebVar == null) {
                    synchronized (C56159d.class) {
                        ebVar = f149630c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149629b);
                            f149630c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
