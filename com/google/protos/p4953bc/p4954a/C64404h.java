package com.google.protos.p4953bc.p4954a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.bc.a.h */
/* compiled from: PG */
public final class C64404h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64404h f174663a;

    /* renamed from: c */
    private static volatile C63010eb f174664c;

    /* renamed from: b */
    private C62995dn f174665b = C62995dn.f170057a;

    static {
        C64404h hVar = new C64404h();
        f174663a = hVar;
        C62942bv.registerDefaultInstance(C64404h.class, hVar);
    }

    private C64404h() {
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
                return newMessageInfo(f174663a, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0001\u0000\u0000\u0003࠲", new Object[]{"b", C64403g.f174662a, C64399c.f174660a});
            case 3:
                return new C64404h();
            case 4:
                return new C64402f();
            case 5:
                return f174663a;
            case 6:
                C63010eb ebVar = f174664c;
                if (ebVar == null) {
                    synchronized (C64404h.class) {
                        ebVar = f174664c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174663a);
                            f174664c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
