package com.google.lens.p4707j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.fu */
/* compiled from: PG */
public final class C62552fu extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62552fu f168881c;

    /* renamed from: f */
    private static volatile C63010eb f168882f;

    /* renamed from: a */
    public long f168883a;

    /* renamed from: b */
    public C62971cq f168884b = emptyProtobufList();

    /* renamed from: d */
    private int f168885d;

    /* renamed from: e */
    private byte f168886e = 2;

    static {
        C62552fu fuVar = new C62552fu();
        f168881c = fuVar;
        C62942bv.registerDefaultInstance(C62552fu.class, fuVar);
    }

    private C62552fu() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f168886e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f168886e = b;
                return null;
            case 2:
                return newMessageInfo(f168881c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဂ\u0000\u0002Л", new Object[]{"d", "a", "b", C62561gc.class});
            case 3:
                return new C62552fu();
            case 4:
                return new C62551ft();
            case 5:
                return f168881c;
            case 6:
                C63010eb ebVar = f168882f;
                if (ebVar == null) {
                    synchronized (C62552fu.class) {
                        ebVar = f168882f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168881c);
                            f168882f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
