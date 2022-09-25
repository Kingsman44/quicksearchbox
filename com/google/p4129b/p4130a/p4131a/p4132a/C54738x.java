package com.google.p4129b.p4130a.p4131a.p4132a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.a.a.a.x */
/* compiled from: PG */
public final class C54738x extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54738x f143643c;

    /* renamed from: d */
    private static volatile C63010eb f143644d;

    /* renamed from: a */
    public int f143645a = 0;

    /* renamed from: b */
    public Object f143646b;

    static {
        C54738x xVar = new C54738x();
        f143643c = xVar;
        C62942bv.registerDefaultInstance(C54738x.class, xVar);
    }

    private C54738x() {
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
                return newMessageInfo(f143643c, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004:\u0000\u0005<\u0000\u0006:\u0000", new Object[]{"b", "a", C54730p.class, C54733s.class, C54737w.class, C54735u.class});
            case 3:
                return new C54738x();
            case 4:
                return new C54731q();
            case 5:
                return f143643c;
            case 6:
                C63010eb ebVar = f143644d;
                if (ebVar == null) {
                    synchronized (C54738x.class) {
                        ebVar = f143644d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143643c);
                            f143644d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
