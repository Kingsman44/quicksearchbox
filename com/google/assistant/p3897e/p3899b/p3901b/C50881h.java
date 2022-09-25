package com.google.assistant.p3897e.p3899b.p3901b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.b.b.h */
/* compiled from: PG */
public final class C50881h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50881h f132480c;

    /* renamed from: d */
    private static volatile C63010eb f132481d;

    /* renamed from: a */
    public int f132482a;

    /* renamed from: b */
    public C63088z f132483b = C63088z.f170246b;

    static {
        C50881h hVar = new C50881h();
        f132480c = hVar;
        C62942bv.registerDefaultInstance(C50881h.class, hVar);
    }

    private C50881h() {
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
                return newMessageInfo(f132480c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            case 3:
                return new C50881h();
            case 4:
                return new C50880g();
            case 5:
                return f132480c;
            case 6:
                C63010eb ebVar = f132481d;
                if (ebVar == null) {
                    synchronized (C50881h.class) {
                        ebVar = f132481d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132480c);
                            f132481d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
