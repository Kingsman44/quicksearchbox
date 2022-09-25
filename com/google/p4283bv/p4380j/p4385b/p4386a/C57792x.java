package com.google.p4283bv.p4380j.p4385b.p4386a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.j.b.a.x */
/* compiled from: PG */
public final class C57792x extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57792x f154404b;

    /* renamed from: c */
    private static volatile C63010eb f154405c;

    /* renamed from: a */
    public C62971cq f154406a = emptyProtobufList();

    static {
        C57792x xVar = new C57792x();
        f154404b = xVar;
        C62942bv.registerDefaultInstance(C57792x.class, xVar);
    }

    private C57792x() {
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
                return newMessageInfo(f154404b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C57790v.class});
            case 3:
                return new C57792x();
            case 4:
                return new C57791w();
            case 5:
                return f154404b;
            case 6:
                C63010eb ebVar = f154405c;
                if (ebVar == null) {
                    synchronized (C57792x.class) {
                        ebVar = f154405c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154404b);
                            f154405c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
