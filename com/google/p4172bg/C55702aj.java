package com.google.p4172bg;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bg.aj */
/* compiled from: PG */
public final class C55702aj extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C55702aj f146948b;

    /* renamed from: c */
    private static volatile C63010eb f146949c;

    /* renamed from: a */
    public C55704al f146950a;

    static {
        C55702aj ajVar = new C55702aj();
        f146948b = ajVar;
        C62942bv.registerDefaultInstance(C55702aj.class, ajVar);
    }

    private C55702aj() {
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
                return newMessageInfo(f146948b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C55702aj();
            case 4:
                return new C55701ai();
            case 5:
                return f146948b;
            case 6:
                C63010eb ebVar = f146949c;
                if (ebVar == null) {
                    synchronized (C55702aj.class) {
                        ebVar = f146949c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146948b);
                            f146949c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
