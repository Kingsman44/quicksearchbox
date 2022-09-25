package com.google.protos.p4972d.p4983c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.d.c.h */
/* compiled from: PG */
public final class C64639h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64639h f175223c;

    /* renamed from: d */
    private static volatile C63010eb f175224d;

    /* renamed from: a */
    public int f175225a = 0;

    /* renamed from: b */
    public Object f175226b;

    static {
        C64639h hVar = new C64639h();
        f175223c = hVar;
        C62942bv.registerDefaultInstance(C64639h.class, hVar);
    }

    private C64639h() {
    }

    /* renamed from: a */
    public static C64638g m96421a() {
        return (C64638g) f175223c.createBuilder();
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
                return newMessageInfo(f175223c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဿ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", C64632a.f175214a, C64635d.class, C64637f.class});
            case 3:
                return new C64639h();
            case 4:
                return new C64638g();
            case 5:
                return f175223c;
            case 6:
                C63010eb ebVar = f175224d;
                if (ebVar == null) {
                    synchronized (C64639h.class) {
                        ebVar = f175224d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175223c);
                            f175224d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
