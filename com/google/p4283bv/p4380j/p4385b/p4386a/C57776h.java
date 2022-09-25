package com.google.p4283bv.p4380j.p4385b.p4386a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.j.b.a.h */
/* compiled from: PG */
public final class C57776h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57776h f154365b;

    /* renamed from: d */
    private static volatile C63010eb f154366d;

    /* renamed from: a */
    public C62971cq f154367a = emptyProtobufList();

    /* renamed from: c */
    private byte f154368c = 2;

    static {
        C57776h hVar = new C57776h();
        f154365b = hVar;
        C62942bv.registerDefaultInstance(C57776h.class, hVar);
    }

    private C57776h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f154368c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f154368c = b;
                return null;
            case 2:
                return newMessageInfo(f154365b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C57778j.class});
            case 3:
                return new C57776h();
            case 4:
                return new C57775g();
            case 5:
                return f154365b;
            case 6:
                C63010eb ebVar = f154366d;
                if (ebVar == null) {
                    synchronized (C57776h.class) {
                        ebVar = f154366d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154365b);
                            f154366d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
