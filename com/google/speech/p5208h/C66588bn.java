package com.google.speech.p5208h;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.h.bn */
/* compiled from: PG */
public final class C66588bn extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66588bn f181127d;

    /* renamed from: e */
    public static final C62940bt f181128e;

    /* renamed from: f */
    private static volatile C63010eb f181129f;

    /* renamed from: a */
    public int f181130a;

    /* renamed from: b */
    public boolean f181131b;

    /* renamed from: c */
    public boolean f181132c;

    static {
        C66588bn bnVar = new C66588bn();
        f181127d = bnVar;
        C62942bv.registerDefaultInstance(C66588bn.class, bnVar);
        f181128e = C62942bv.newSingularGeneratedExtension(C66607ce.f181191f, bnVar, bnVar, (C62958ce) null, 205277209, C63066gd.MESSAGE, C66588bn.class);
    }

    private C66588bn() {
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
                return newMessageInfo(f181127d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66588bn();
            case 4:
                return new C66587bm();
            case 5:
                return f181127d;
            case 6:
                C63010eb ebVar = f181129f;
                if (ebVar == null) {
                    synchronized (C66588bn.class) {
                        ebVar = f181129f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181127d);
                            f181129f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
