package com.google.common.p4552o.p4564j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.j.v */
/* compiled from: PG */
public final class C60047v extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C60047v f162298a;

    /* renamed from: e */
    private static volatile C63010eb f162299e;

    /* renamed from: b */
    private int f162300b;

    /* renamed from: c */
    private C60033h f162301c;

    /* renamed from: d */
    private byte f162302d = 2;

    static {
        C60047v vVar = new C60047v();
        f162298a = vVar;
        C62942bv.registerDefaultInstance(C60047v.class, vVar);
    }

    private C60047v() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f162302d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f162302d = b;
                return null;
            case 2:
                return newMessageInfo(f162298a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0003", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C60047v();
            case 4:
                return new C60046u();
            case 5:
                return f162298a;
            case 6:
                C63010eb ebVar = f162299e;
                if (ebVar == null) {
                    synchronized (C60047v.class) {
                        ebVar = f162299e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162298a);
                            f162299e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
