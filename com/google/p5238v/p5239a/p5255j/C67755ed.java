package com.google.p5238v.p5239a.p5255j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.v.a.j.ed */
/* compiled from: PG */
public final class C67755ed extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C67755ed f183823d;

    /* renamed from: e */
    private static volatile C63010eb f183824e;

    /* renamed from: a */
    public C67757ef f183825a;

    /* renamed from: b */
    public int f183826b;

    /* renamed from: c */
    public C63088z f183827c = C63088z.f170246b;

    static {
        C67755ed edVar = new C67755ed();
        f183823d = edVar;
        C62942bv.registerDefaultInstance(C67755ed.class, edVar);
    }

    private C67755ed() {
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
                return newMessageInfo(f183823d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\n", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C67755ed();
            case 4:
                return new C67754ec();
            case 5:
                return f183823d;
            case 6:
                C63010eb ebVar = f183824e;
                if (ebVar == null) {
                    synchronized (C67755ed.class) {
                        ebVar = f183824e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183823d);
                            f183824e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
