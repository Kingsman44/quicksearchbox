package com.google.android.p10712d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.hp */
/* compiled from: PG */
public final class C142499hp extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C142499hp f386692b;

    /* renamed from: c */
    private static volatile C63010eb f386693c;

    /* renamed from: a */
    public C142520l f386694a;

    static {
        C142499hp hpVar = new C142499hp();
        f386692b = hpVar;
        C62942bv.registerDefaultInstance(C142499hp.class, hpVar);
    }

    private C142499hp() {
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
                return newMessageInfo(f386692b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C142499hp();
            case 4:
                return new C142498ho();
            case 5:
                return f386692b;
            case 6:
                C63010eb ebVar = f386693c;
                if (ebVar == null) {
                    synchronized (C142499hp.class) {
                        ebVar = f386693c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386692b);
                            f386693c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
