package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.vt */
/* compiled from: PG */
public final class C60596vt extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C60596vt f164383a;

    /* renamed from: e */
    private static volatile C63010eb f164384e;

    /* renamed from: b */
    private int f164385b;

    /* renamed from: c */
    private C60220t f164386c;

    /* renamed from: d */
    private byte f164387d = 2;

    static {
        C60596vt vtVar = new C60596vt();
        f164383a = vtVar;
        C62942bv.registerDefaultInstance(C60596vt.class, vtVar);
    }

    private C60596vt() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f164387d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f164387d = b;
                return null;
            case 2:
                return newMessageInfo(f164383a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0003", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C60596vt();
            case 4:
                return new C60595vs();
            case 5:
                return f164383a;
            case 6:
                C63010eb ebVar = f164384e;
                if (ebVar == null) {
                    synchronized (C60596vt.class) {
                        ebVar = f164384e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164383a);
                            f164384e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
