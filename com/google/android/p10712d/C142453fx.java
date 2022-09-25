package com.google.android.p10712d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.fx */
/* compiled from: PG */
public final class C142453fx extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C142453fx f386551c;

    /* renamed from: d */
    private static volatile C63010eb f386552d;

    /* renamed from: a */
    public int f386553a;

    /* renamed from: b */
    public int f386554b;

    static {
        C142453fx fxVar = new C142453fx();
        f386551c = fxVar;
        C62942bv.registerDefaultInstance(C142453fx.class, fxVar);
    }

    private C142453fx() {
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
                return newMessageInfo(f386551c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C142453fx();
            case 4:
                return new C142452fw();
            case 5:
                return f386551c;
            case 6:
                C63010eb ebVar = f386552d;
                if (ebVar == null) {
                    synchronized (C142453fx.class) {
                        ebVar = f386552d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386551c);
                            f386552d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
