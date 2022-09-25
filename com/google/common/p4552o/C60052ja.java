package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.common.o.ja */
/* compiled from: PG */
public final class C60052ja extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C60052ja f162314c;

    /* renamed from: d */
    public static final C62940bt f162315d;

    /* renamed from: e */
    private static volatile C63010eb f162316e;

    /* renamed from: a */
    public int f162317a;

    /* renamed from: b */
    public int f162318b;

    static {
        C60052ja jaVar = new C60052ja();
        f162314c = jaVar;
        C62942bv.registerDefaultInstance(C60052ja.class, jaVar);
        f162315d = C62942bv.newSingularGeneratedExtension(aqs.f159780k, jaVar, jaVar, (C62958ce) null, 625, C63066gd.MESSAGE, C60052ja.class);
    }

    private C60052ja() {
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
                return newMessageInfo(f162314c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C60002iz.f162164a});
            case 3:
                return new C60052ja();
            case 4:
                return new C60001iy();
            case 5:
                return f162314c;
            case 6:
                C63010eb ebVar = f162316e;
                if (ebVar == null) {
                    synchronized (C60052ja.class) {
                        ebVar = f162316e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162314c);
                            f162316e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
