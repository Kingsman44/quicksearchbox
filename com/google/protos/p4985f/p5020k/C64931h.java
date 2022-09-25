package com.google.protos.p4985f.p5020k;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.k.h */
/* compiled from: PG */
public final class C64931h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64931h f175859a;

    /* renamed from: c */
    private static volatile C63010eb f175860c;

    /* renamed from: b */
    private C62995dn f175861b = C62995dn.f170057a;

    static {
        C64931h hVar = new C64931h();
        f175859a = hVar;
        C62942bv.registerDefaultInstance(C64931h.class, hVar);
    }

    private C64931h() {
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
                return newMessageInfo(f175859a, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0001\u0000\u0000\u00032", new Object[]{"b", C64930g.f175858a});
            case 3:
                return new C64931h();
            case 4:
                return new C64929f();
            case 5:
                return f175859a;
            case 6:
                C63010eb ebVar = f175860c;
                if (ebVar == null) {
                    synchronized (C64931h.class) {
                        ebVar = f175860c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175859a);
                            f175860c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
