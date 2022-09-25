package com.google.lens.p4701g;

import com.google.android.libraries.p1657ba.p1664c.p1668c.C19652b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.cx */
/* compiled from: PG */
public final class C62328cx extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62328cx f168247b;

    /* renamed from: c */
    private static volatile C63010eb f168248c;

    /* renamed from: a */
    public C62971cq f168249a = emptyProtobufList();

    static {
        C62328cx cxVar = new C62328cx();
        f168247b = cxVar;
        C62942bv.registerDefaultInstance(C62328cx.class, cxVar);
    }

    private C62328cx() {
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
                return newMessageInfo(f168247b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C19652b.class});
            case 3:
                return new C62328cx();
            case 4:
                return new C62327cw();
            case 5:
                return f168247b;
            case 6:
                C63010eb ebVar = f168248c;
                if (ebVar == null) {
                    synchronized (C62328cx.class) {
                        ebVar = f168248c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168247b);
                            f168248c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
