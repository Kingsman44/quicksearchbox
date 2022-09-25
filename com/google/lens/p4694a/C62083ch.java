package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.ch */
/* compiled from: PG */
public final class C62083ch extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62083ch f167686a;

    /* renamed from: c */
    private static volatile C63010eb f167687c;

    /* renamed from: b */
    private byte f167688b = 2;

    static {
        C62083ch chVar = new C62083ch();
        f167686a = chVar;
        C62942bv.registerDefaultInstance(C62083ch.class, chVar);
    }

    private C62083ch() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167688b);
            case 1:
                this.f167688b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f167686a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62083ch();
            case 4:
                return new C62082cg();
            case 5:
                return f167686a;
            case 6:
                C63010eb ebVar = f167687c;
                if (ebVar == null) {
                    synchronized (C62083ch.class) {
                        ebVar = f167687c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167686a);
                            f167687c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
