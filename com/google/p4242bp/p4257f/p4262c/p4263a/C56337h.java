package com.google.p4242bp.p4257f.p4262c.p4263a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.c.a.h */
/* compiled from: PG */
public final class C56337h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56337h f150163a;

    /* renamed from: b */
    private static volatile C63010eb f150164b;

    static {
        C56337h hVar = new C56337h();
        f150163a = hVar;
        C62942bv.registerDefaultInstance(C56337h.class, hVar);
    }

    private C56337h() {
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
                return newMessageInfo(f150163a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56337h();
            case 4:
                return new C56336g();
            case 5:
                return f150163a;
            case 6:
                C63010eb ebVar = f150164b;
                if (ebVar == null) {
                    synchronized (C56337h.class) {
                        ebVar = f150164b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150163a);
                            f150164b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
