package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.at */
/* compiled from: PG */
public final class C62041at extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62041at f167618a;

    /* renamed from: c */
    private static volatile C63010eb f167619c;

    /* renamed from: b */
    private byte f167620b = 2;

    static {
        C62041at atVar = new C62041at();
        f167618a = atVar;
        C62942bv.registerDefaultInstance(C62041at.class, atVar);
    }

    private C62041at() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167620b);
            case 1:
                this.f167620b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f167618a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62041at();
            case 4:
                return new C62040as();
            case 5:
                return f167618a;
            case 6:
                C63010eb ebVar = f167619c;
                if (ebVar == null) {
                    synchronized (C62041at.class) {
                        ebVar = f167619c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167618a);
                            f167619c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
