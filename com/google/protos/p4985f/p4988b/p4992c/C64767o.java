package com.google.protos.p4985f.p4988b.p4992c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.b.c.o */
/* compiled from: PG */
public final class C64767o extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64767o f175559c;

    /* renamed from: e */
    private static volatile C63010eb f175560e;

    /* renamed from: a */
    public C64756d f175561a;

    /* renamed from: b */
    public C64765m f175562b;

    /* renamed from: d */
    private int f175563d;

    static {
        C64767o oVar = new C64767o();
        f175559c = oVar;
        C62942bv.registerDefaultInstance(C64767o.class, oVar);
    }

    private C64767o() {
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
                return newMessageInfo(f175559c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C64767o();
            case 4:
                return new C64766n();
            case 5:
                return f175559c;
            case 6:
                C63010eb ebVar = f175560e;
                if (ebVar == null) {
                    synchronized (C64767o.class) {
                        ebVar = f175560e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175559c);
                            f175560e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
