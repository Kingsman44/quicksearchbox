package com.google.assistant.p3781ad.p3787c.p3788a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.c.a.s */
/* compiled from: PG */
public final class C48539s extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48539s f125384c;

    /* renamed from: e */
    private static volatile C63010eb f125385e;

    /* renamed from: a */
    public int f125386a;

    /* renamed from: b */
    public C48545y f125387b;

    /* renamed from: d */
    private int f125388d;

    static {
        C48539s sVar = new C48539s();
        f125384c = sVar;
        C62942bv.registerDefaultInstance(C48539s.class, sVar);
    }

    private C48539s() {
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
                return newMessageInfo(f125384c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", C48541u.m85234b(), "b"});
            case 3:
                return new C48539s();
            case 4:
                return new C48538r();
            case 5:
                return f125384c;
            case 6:
                C63010eb ebVar = f125385e;
                if (ebVar == null) {
                    synchronized (C48539s.class) {
                        ebVar = f125385e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125384c);
                            f125385e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
