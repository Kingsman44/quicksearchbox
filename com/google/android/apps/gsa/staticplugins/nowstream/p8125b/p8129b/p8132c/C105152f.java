package com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8129b.p8132c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.b.b.c.f */
/* compiled from: PG */
public final class C105152f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C105152f f293123b;

    /* renamed from: c */
    private static volatile C63010eb f293124c;

    /* renamed from: a */
    public C62971cq f293125a = emptyProtobufList();

    static {
        C105152f fVar = new C105152f();
        f293123b = fVar;
        C62942bv.registerDefaultInstance(C105152f.class, fVar);
    }

    private C105152f() {
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
                return newMessageInfo(f293123b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C105150d.class});
            case 3:
                return new C105152f();
            case 4:
                return new C105151e();
            case 5:
                return f293123b;
            case 6:
                C63010eb ebVar = f293124c;
                if (ebVar == null) {
                    synchronized (C105152f.class) {
                        ebVar = f293124c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f293123b);
                            f293124c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
