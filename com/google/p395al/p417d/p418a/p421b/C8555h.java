package com.google.p395al.p417d.p418a.p421b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.d.a.b.h */
/* compiled from: PG */
public final class C8555h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8555h f29652a;

    /* renamed from: b */
    private static volatile C63010eb f29653b;

    static {
        C8555h hVar = new C8555h();
        f29652a = hVar;
        C62942bv.registerDefaultInstance(C8555h.class, hVar);
    }

    private C8555h() {
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
                return newMessageInfo(f29652a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C8555h();
            case 4:
                return new C8554g();
            case 5:
                return f29652a;
            case 6:
                C63010eb ebVar = f29653b;
                if (ebVar == null) {
                    synchronized (C8555h.class) {
                        ebVar = f29653b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29652a);
                            f29653b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
