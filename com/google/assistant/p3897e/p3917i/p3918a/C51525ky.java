package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.ky */
/* compiled from: PG */
public final class C51525ky extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51525ky f134269b;

    /* renamed from: d */
    private static volatile C63010eb f134270d;

    /* renamed from: a */
    public C62971cq f134271a = emptyProtobufList();

    /* renamed from: c */
    private byte f134272c = 2;

    static {
        C51525ky kyVar = new C51525ky();
        f134269b = kyVar;
        C62942bv.registerDefaultInstance(C51525ky.class, kyVar);
    }

    private C51525ky() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f134272c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f134272c = b;
                return null;
            case 2:
                return newMessageInfo(f134269b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C51523kw.class});
            case 3:
                return new C51525ky();
            case 4:
                return new C51524kx();
            case 5:
                return f134269b;
            case 6:
                C63010eb ebVar = f134270d;
                if (ebVar == null) {
                    synchronized (C51525ky.class) {
                        ebVar = f134270d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134269b);
                            f134270d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
