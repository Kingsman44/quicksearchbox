package com.google.speech.p5218j.p5219a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62960cg;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.a.av */
/* compiled from: PG */
public final class C66718av extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66718av f181487b;

    /* renamed from: c */
    private static volatile C63010eb f181488c;

    /* renamed from: a */
    public C62960cg f181489a = emptyFloatList();

    static {
        C66718av avVar = new C66718av();
        f181487b = avVar;
        C62942bv.registerDefaultInstance(C66718av.class, avVar);
    }

    private C66718av() {
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
                return newMessageInfo(f181487b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001$", new Object[]{"a"});
            case 3:
                return new C66718av();
            case 4:
                return new C66717au();
            case 5:
                return f181487b;
            case 6:
                C63010eb ebVar = f181488c;
                if (ebVar == null) {
                    synchronized (C66718av.class) {
                        ebVar = f181488c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181487b);
                            f181488c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
