package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.ba */
/* compiled from: PG */
public final class C64467ba extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64467ba f174864a;

    /* renamed from: b */
    private static volatile C63010eb f174865b;

    static {
        C64467ba baVar = new C64467ba();
        f174864a = baVar;
        C62942bv.registerDefaultInstance(C64467ba.class, baVar);
    }

    private C64467ba() {
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
                return newMessageInfo(f174864a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C64467ba();
            case 4:
                return new C64465az();
            case 5:
                return f174864a;
            case 6:
                C63010eb ebVar = f174865b;
                if (ebVar == null) {
                    synchronized (C64467ba.class) {
                        ebVar = f174865b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174864a);
                            f174865b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
