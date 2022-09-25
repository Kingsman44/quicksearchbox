package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.speech.p5208h.C66669ei;
import com.google.speech.p5218j.p5219a.C66752s;

/* renamed from: com.google.speech.j.np */
/* compiled from: PG */
public final class C67169np extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67169np f182570c;

    /* renamed from: d */
    public static final C62940bt f182571d;

    /* renamed from: e */
    private static volatile C63010eb f182572e;

    /* renamed from: a */
    public int f182573a;

    /* renamed from: b */
    public C66669ei f182574b;

    static {
        C67169np npVar = new C67169np();
        f182570c = npVar;
        C62942bv.registerDefaultInstance(C67169np.class, npVar);
        f182571d = C62942bv.newSingularGeneratedExtension(C66752s.f181544q, npVar, npVar, (C62958ce) null, 311836513, C63066gd.MESSAGE, C67169np.class);
    }

    private C67169np() {
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
                return newMessageInfo(f182570c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C67169np();
            case 4:
                return new C67168no();
            case 5:
                return f182570c;
            case 6:
                C63010eb ebVar = f182572e;
                if (ebVar == null) {
                    synchronized (C67169np.class) {
                        ebVar = f182572e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182570c);
                            f182572e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
