package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.kf */
/* compiled from: PG */
public final class C60086kf extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C60086kf f162445c;

    /* renamed from: d */
    private static volatile C63010eb f162446d;

    /* renamed from: a */
    public int f162447a;

    /* renamed from: b */
    public int f162448b;

    static {
        C60086kf kfVar = new C60086kf();
        f162445c = kfVar;
        C62942bv.registerDefaultInstance(C60086kf.class, kfVar);
    }

    private C60086kf() {
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
                return newMessageInfo(f162445c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C60085ke.f162444a});
            case 3:
                return new C60086kf();
            case 4:
                return new C60084kd();
            case 5:
                return f162445c;
            case 6:
                C63010eb ebVar = f162446d;
                if (ebVar == null) {
                    synchronized (C60086kf.class) {
                        ebVar = f162446d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162445c);
                            f162446d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
