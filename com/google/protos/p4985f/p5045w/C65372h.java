package com.google.protos.p4985f.p5045w;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.w.h */
/* compiled from: PG */
public final class C65372h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65372h f177766a;

    /* renamed from: b */
    private static volatile C63010eb f177767b;

    static {
        C65372h hVar = new C65372h();
        f177766a = hVar;
        C62942bv.registerDefaultInstance(C65372h.class, hVar);
    }

    private C65372h() {
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
                return newMessageInfo(f177766a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65372h();
            case 4:
                return new C65371g();
            case 5:
                return f177766a;
            case 6:
                C63010eb ebVar = f177767b;
                if (ebVar == null) {
                    synchronized (C65372h.class) {
                        ebVar = f177767b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177766a);
                            f177767b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
