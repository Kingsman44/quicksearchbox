package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.xr */
/* compiled from: PG */
public final class C8158xr extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8158xr f28676a;

    /* renamed from: c */
    private static volatile C63010eb f28677c;

    /* renamed from: b */
    private byte f28678b = 2;

    static {
        C8158xr xrVar = new C8158xr();
        f28676a = xrVar;
        C62942bv.registerDefaultInstance(C8158xr.class, xrVar);
    }

    private C8158xr() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28678b);
            case 1:
                this.f28678b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f28676a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C8158xr();
            case 4:
                return new C8157xq();
            case 5:
                return f28676a;
            case 6:
                C63010eb ebVar = f28677c;
                if (ebVar == null) {
                    synchronized (C8158xr.class) {
                        ebVar = f28677c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28676a);
                            f28677c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
