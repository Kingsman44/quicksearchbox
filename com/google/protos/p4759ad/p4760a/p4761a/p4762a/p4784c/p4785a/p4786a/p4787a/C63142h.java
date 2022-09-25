package com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4784c.p4785a.p4786a.p4787a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ad.a.a.a.c.a.a.a.h */
/* compiled from: PG */
public final class C63142h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63142h f170512a;

    /* renamed from: b */
    private static volatile C63010eb f170513b;

    static {
        C63142h hVar = new C63142h();
        f170512a = hVar;
        C62942bv.registerDefaultInstance(C63142h.class, hVar);
    }

    private C63142h() {
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
                return newMessageInfo(f170512a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C63142h();
            case 4:
                return new C63141g();
            case 5:
                return f170512a;
            case 6:
                C63010eb ebVar = f170513b;
                if (ebVar == null) {
                    synchronized (C63142h.class) {
                        ebVar = f170513b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170512a);
                            f170513b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
