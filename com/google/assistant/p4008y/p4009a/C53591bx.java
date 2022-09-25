package com.google.assistant.p4008y.p4009a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.a.bx */
/* compiled from: PG */
public final class C53591bx extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53591bx f140654b;

    /* renamed from: d */
    private static volatile C63010eb f140655d;

    /* renamed from: a */
    public C62971cq f140656a = emptyProtobufList();

    /* renamed from: c */
    private byte f140657c = 2;

    static {
        C53591bx bxVar = new C53591bx();
        f140654b = bxVar;
        C62942bv.registerDefaultInstance(C53591bx.class, bxVar);
    }

    private C53591bx() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140657c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f140657c = b;
                return null;
            case 2:
                return newMessageInfo(f140654b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002Л", new Object[]{"a", C53593bz.class});
            case 3:
                return new C53591bx();
            case 4:
                return new C53590bw();
            case 5:
                return f140654b;
            case 6:
                C63010eb ebVar = f140655d;
                if (ebVar == null) {
                    synchronized (C53591bx.class) {
                        ebVar = f140655d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140654b);
                            f140655d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
