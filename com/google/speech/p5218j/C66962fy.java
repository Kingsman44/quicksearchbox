package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.j.fy */
/* compiled from: PG */
public final class C66962fy extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66962fy f182010c;

    /* renamed from: d */
    public static final C62940bt f182011d;

    /* renamed from: e */
    private static volatile C63010eb f182012e;

    /* renamed from: a */
    public int f182013a;

    /* renamed from: b */
    public int f182014b;

    static {
        C66962fy fyVar = new C66962fy();
        f182010c = fyVar;
        C62942bv.registerDefaultInstance(C66962fy.class, fyVar);
        f182011d = C62942bv.newSingularGeneratedExtension(C66971gg.f182040a, fyVar, fyVar, (C62958ce) null, 462237659, C63066gd.MESSAGE, C66962fy.class);
    }

    private C66962fy() {
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
                return newMessageInfo(f182010c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C66960fw.f182009a});
            case 3:
                return new C66962fy();
            case 4:
                return new C66959fv();
            case 5:
                return f182010c;
            case 6:
                C63010eb ebVar = f182012e;
                if (ebVar == null) {
                    synchronized (C66962fy.class) {
                        ebVar = f182012e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182010c);
                            f182012e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
