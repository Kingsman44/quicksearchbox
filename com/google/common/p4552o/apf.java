package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.apf */
/* compiled from: PG */
public final class apf extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final apf f159635a;

    /* renamed from: e */
    private static volatile C63010eb f159636e;

    /* renamed from: b */
    private int f159637b;

    /* renamed from: c */
    private aph f159638c;

    /* renamed from: d */
    private byte f159639d = 2;

    static {
        apf apf = new apf();
        f159635a = apf;
        C62942bv.registerDefaultInstance(apf.class, apf);
    }

    private apf() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f159639d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f159639d = b;
                return null;
            case 2:
                return newMessageInfo(f159635a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005ᐉ\u0004", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new apf();
            case 4:
                return new ape();
            case 5:
                return f159635a;
            case 6:
                C63010eb ebVar = f159636e;
                if (ebVar == null) {
                    synchronized (apf.class) {
                        ebVar = f159636e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159635a);
                            f159636e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
