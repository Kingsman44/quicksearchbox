package com.google.speech.p5224k.p5225a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.k.a.u */
/* compiled from: PG */
public final class C67243u extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67243u f182767c;

    /* renamed from: d */
    private static volatile C63010eb f182768d;

    /* renamed from: a */
    public int f182769a;

    /* renamed from: b */
    public int f182770b;

    static {
        C67243u uVar = new C67243u();
        f182767c = uVar;
        C62942bv.registerDefaultInstance(C67243u.class, uVar);
    }

    private C67243u() {
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
                return newMessageInfo(f182767c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C67242t.m97444b()});
            case 3:
                return new C67243u();
            case 4:
                return new C67240r();
            case 5:
                return f182767c;
            case 6:
                C63010eb ebVar = f182768d;
                if (ebVar == null) {
                    synchronized (C67243u.class) {
                        ebVar = f182768d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182767c);
                            f182768d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
