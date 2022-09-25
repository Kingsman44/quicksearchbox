package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.ap */
/* compiled from: PG */
public final class C62037ap extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62037ap f167613a;

    /* renamed from: c */
    private static volatile C63010eb f167614c;

    /* renamed from: b */
    private byte f167615b = 2;

    static {
        C62037ap apVar = new C62037ap();
        f167613a = apVar;
        C62942bv.registerDefaultInstance(C62037ap.class, apVar);
    }

    private C62037ap() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167615b);
            case 1:
                this.f167615b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f167613a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62037ap();
            case 4:
                return new C62036ao();
            case 5:
                return f167613a;
            case 6:
                C63010eb ebVar = f167614c;
                if (ebVar == null) {
                    synchronized (C62037ap.class) {
                        ebVar = f167614c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167613a);
                            f167614c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
