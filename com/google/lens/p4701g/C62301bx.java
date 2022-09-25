package com.google.lens.p4701g;

import com.google.lens.p4707j.C62483df;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5132q.C65876s;

/* renamed from: com.google.lens.g.bx */
/* compiled from: PG */
public final class C62301bx extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62301bx f168185c;

    /* renamed from: f */
    private static volatile C63010eb f168186f;

    /* renamed from: a */
    public C65876s f168187a;

    /* renamed from: b */
    public C62483df f168188b;

    /* renamed from: d */
    private int f168189d;

    /* renamed from: e */
    private byte f168190e = 2;

    static {
        C62301bx bxVar = new C62301bx();
        f168185c = bxVar;
        C62942bv.registerDefaultInstance(C62301bx.class, bxVar);
    }

    private C62301bx() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f168190e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f168190e = b;
                return null;
            case 2:
                return newMessageInfo(f168185c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0001\u0002ᐉ\u0000\u0003ဉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C62301bx();
            case 4:
                return new C62300bw();
            case 5:
                return f168185c;
            case 6:
                C63010eb ebVar = f168186f;
                if (ebVar == null) {
                    synchronized (C62301bx.class) {
                        ebVar = f168186f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168185c);
                            f168186f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
