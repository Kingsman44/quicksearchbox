package com.google.speech.p5208h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.h.co */
/* compiled from: PG */
public final class C66617co extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66617co f181233c;

    /* renamed from: d */
    public static final C62940bt f181234d;

    /* renamed from: e */
    private static volatile C63010eb f181235e;

    /* renamed from: a */
    public int f181236a;

    /* renamed from: b */
    public boolean f181237b;

    static {
        C66617co coVar = new C66617co();
        f181233c = coVar;
        C62942bv.registerDefaultInstance(C66617co.class, coVar);
        f181234d = C62942bv.newSingularGeneratedExtension(C66607ce.f181191f, coVar, coVar, (C62958ce) null, 61914024, C63066gd.MESSAGE, C66617co.class);
    }

    private C66617co() {
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
                return newMessageInfo(f181233c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C66617co();
            case 4:
                return new C66616cn();
            case 5:
                return f181233c;
            case 6:
                C63010eb ebVar = f181235e;
                if (ebVar == null) {
                    synchronized (C66617co.class) {
                        ebVar = f181235e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181233c);
                            f181235e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
