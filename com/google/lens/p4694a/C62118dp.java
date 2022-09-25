package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.dp */
/* compiled from: PG */
public final class C62118dp extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62118dp f167744a;

    /* renamed from: c */
    private static volatile C63010eb f167745c;

    /* renamed from: b */
    private byte f167746b = 2;

    static {
        C62118dp dpVar = new C62118dp();
        f167744a = dpVar;
        C62942bv.registerDefaultInstance(C62118dp.class, dpVar);
    }

    private C62118dp() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167746b);
            case 1:
                this.f167746b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f167744a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62118dp();
            case 4:
                return new C62117do();
            case 5:
                return f167744a;
            case 6:
                C63010eb ebVar = f167745c;
                if (ebVar == null) {
                    synchronized (C62118dp.class) {
                        ebVar = f167745c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167744a);
                            f167745c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
