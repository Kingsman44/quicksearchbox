package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.jy */
/* compiled from: PG */
public final class C52227jy extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52227jy f137049b;

    /* renamed from: d */
    private static volatile C63010eb f137050d;

    /* renamed from: a */
    public int f137051a;

    /* renamed from: c */
    private int f137052c;

    static {
        C52227jy jyVar = new C52227jy();
        f137049b = jyVar;
        C62942bv.registerDefaultInstance(C52227jy.class, jyVar);
    }

    private C52227jy() {
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
                return newMessageInfo(f137049b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C52225jw.f137048a});
            case 3:
                return new C52227jy();
            case 4:
                return new C52224jv();
            case 5:
                return f137049b;
            case 6:
                C63010eb ebVar = f137050d;
                if (ebVar == null) {
                    synchronized (C52227jy.class) {
                        ebVar = f137050d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137049b);
                            f137050d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
