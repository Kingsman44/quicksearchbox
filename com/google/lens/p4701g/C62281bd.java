package com.google.lens.p4701g;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.bd */
/* compiled from: PG */
public final class C62281bd extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62281bd f168141b;

    /* renamed from: d */
    private static volatile C63010eb f168142d;

    /* renamed from: a */
    public C62971cq f168143a = emptyProtobufList();

    /* renamed from: c */
    private byte f168144c = 2;

    static {
        C62281bd bdVar = new C62281bd();
        f168141b = bdVar;
        C62942bv.registerDefaultInstance(C62281bd.class, bdVar);
    }

    private C62281bd() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f168144c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f168144c = b;
                return null;
            case 2:
                return newMessageInfo(f168141b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C62279bb.class});
            case 3:
                return new C62281bd();
            case 4:
                return new C62280bc();
            case 5:
                return f168141b;
            case 6:
                C63010eb ebVar = f168142d;
                if (ebVar == null) {
                    synchronized (C62281bd.class) {
                        ebVar = f168142d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168141b);
                            f168142d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
