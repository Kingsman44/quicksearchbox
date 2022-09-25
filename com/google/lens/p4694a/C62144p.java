package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.p */
/* compiled from: PG */
public final class C62144p extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62144p f167778a;

    /* renamed from: b */
    private static volatile C63010eb f167779b;

    static {
        C62144p pVar = new C62144p();
        f167778a = pVar;
        C62942bv.registerDefaultInstance(C62144p.class, pVar);
    }

    private C62144p() {
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
                return newMessageInfo(f167778a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62144p();
            case 4:
                return new C62143o();
            case 5:
                return f167778a;
            case 6:
                C63010eb ebVar = f167779b;
                if (ebVar == null) {
                    synchronized (C62144p.class) {
                        ebVar = f167779b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167778a);
                            f167779b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
