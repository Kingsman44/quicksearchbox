package com.google.lens.p4707j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.ec */
/* compiled from: PG */
public final class C62507ec extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62507ec f168770a;

    /* renamed from: c */
    private static volatile C63010eb f168771c;

    /* renamed from: b */
    private byte f168772b = 2;

    static {
        C62507ec ecVar = new C62507ec();
        f168770a = ecVar;
        C62942bv.registerDefaultInstance(C62507ec.class, ecVar);
    }

    private C62507ec() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f168772b);
            case 1:
                this.f168772b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f168770a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62507ec();
            case 4:
                return new C62506eb();
            case 5:
                return f168770a;
            case 6:
                C63010eb ebVar = f168771c;
                if (ebVar == null) {
                    synchronized (C62507ec.class) {
                        ebVar = f168771c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168770a);
                            f168771c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
