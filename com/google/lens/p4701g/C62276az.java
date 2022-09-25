package com.google.lens.p4701g;

import com.google.p4172bg.p4174b.C55729r;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.az */
/* compiled from: PG */
public final class C62276az extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62276az f168130b;

    /* renamed from: d */
    private static volatile C63010eb f168131d;

    /* renamed from: a */
    public C62971cq f168132a = emptyProtobufList();

    /* renamed from: c */
    private byte f168133c = 2;

    static {
        C62276az azVar = new C62276az();
        f168130b = azVar;
        C62942bv.registerDefaultInstance(C62276az.class, azVar);
    }

    private C62276az() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f168133c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f168133c = b;
                return null;
            case 2:
                return newMessageInfo(f168130b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C55729r.class});
            case 3:
                return new C62276az();
            case 4:
                return new C62275ay();
            case 5:
                return f168130b;
            case 6:
                C63010eb ebVar = f168131d;
                if (ebVar == null) {
                    synchronized (C62276az.class) {
                        ebVar = f168131d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168130b);
                            f168131d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
