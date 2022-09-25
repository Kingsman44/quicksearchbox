package com.google.p4017at.p4046e.p4047a.p4048a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.e.a.a.h */
/* compiled from: PG */
public final class C53927h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53927h f141498a;

    /* renamed from: b */
    private static volatile C63010eb f141499b;

    static {
        C53927h hVar = new C53927h();
        f141498a = hVar;
        C62942bv.registerDefaultInstance(C53927h.class, hVar);
    }

    private C53927h() {
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
                return newMessageInfo(f141498a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53927h();
            case 4:
                return new C53926g();
            case 5:
                return f141498a;
            case 6:
                C63010eb ebVar = f141499b;
                if (ebVar == null) {
                    synchronized (C53927h.class) {
                        ebVar = f141499b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141498a);
                            f141499b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
