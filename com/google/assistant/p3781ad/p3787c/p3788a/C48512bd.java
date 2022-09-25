package com.google.assistant.p3781ad.p3787c.p3788a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.c.a.bd */
/* compiled from: PG */
public final class C48512bd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48512bd f125323c;

    /* renamed from: e */
    private static volatile C63010eb f125324e;

    /* renamed from: a */
    public C48516bh f125325a;

    /* renamed from: b */
    public C62995dn f125326b = C62995dn.f170057a;

    /* renamed from: d */
    private int f125327d;

    static {
        C48512bd bdVar = new C48512bd();
        f125323c = bdVar;
        C62942bv.registerDefaultInstance(C48512bd.class, bdVar);
    }

    private C48512bd() {
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
                return newMessageInfo(f125323c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဉ\u0000\u00022", new Object[]{"d", "a", "b", C48510bb.f125322a});
            case 3:
                return new C48512bd();
            case 4:
                return new C48511bc();
            case 5:
                return f125323c;
            case 6:
                C63010eb ebVar = f125324e;
                if (ebVar == null) {
                    synchronized (C48512bd.class) {
                        ebVar = f125324e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125323c);
                            f125324e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
