package com.google.protos.p4850an.p4866f;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.f.s */
/* compiled from: PG */
public final class C63614s extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63614s f172055a;

    /* renamed from: b */
    private static volatile C63010eb f172056b;

    static {
        C63614s sVar = new C63614s();
        f172055a = sVar;
        C62942bv.registerDefaultInstance(C63614s.class, sVar);
    }

    private C63614s() {
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
                return newMessageInfo(f172055a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C63614s();
            case 4:
                return new C63613r();
            case 5:
                return f172055a;
            case 6:
                C63010eb ebVar = f172056b;
                if (ebVar == null) {
                    synchronized (C63614s.class) {
                        ebVar = f172056b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172055a);
                            f172056b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
