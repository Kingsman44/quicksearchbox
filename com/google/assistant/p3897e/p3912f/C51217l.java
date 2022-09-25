package com.google.assistant.p3897e.p3912f;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.f.l */
/* compiled from: PG */
public final class C51217l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51217l f133345c;

    /* renamed from: d */
    private static volatile C63010eb f133346d;

    /* renamed from: a */
    public int f133347a;

    /* renamed from: b */
    public C51216k f133348b;

    static {
        C51217l lVar = new C51217l();
        f133345c = lVar;
        C62942bv.registerDefaultInstance(C51217l.class, lVar);
    }

    private C51217l() {
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
                return newMessageInfo(f133345c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C51217l();
            case 4:
                return new C51214i();
            case 5:
                return f133345c;
            case 6:
                C63010eb ebVar = f133346d;
                if (ebVar == null) {
                    synchronized (C51217l.class) {
                        ebVar = f133346d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133345c);
                            f133346d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
