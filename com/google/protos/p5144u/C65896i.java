package com.google.protos.p5144u;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.u.i */
/* compiled from: PG */
public final class C65896i extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65896i f179215a;

    /* renamed from: c */
    private static volatile C63010eb f179216c;

    /* renamed from: b */
    private byte f179217b = 2;

    static {
        C65896i iVar = new C65896i();
        f179215a = iVar;
        C62942bv.registerDefaultInstance(C65896i.class, iVar);
    }

    private C65896i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179217b);
            case 1:
                this.f179217b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f179215a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65896i();
            case 4:
                return new C65895h();
            case 5:
                return f179215a;
            case 6:
                C63010eb ebVar = f179216c;
                if (ebVar == null) {
                    synchronized (C65896i.class) {
                        ebVar = f179216c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179215a);
                            f179216c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
