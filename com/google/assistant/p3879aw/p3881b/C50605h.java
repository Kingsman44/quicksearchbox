package com.google.assistant.p3879aw.p3881b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.aw.b.h */
/* compiled from: PG */
public final class C50605h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50605h f131667c;

    /* renamed from: d */
    private static volatile C63010eb f131668d;

    /* renamed from: a */
    public int f131669a;

    /* renamed from: b */
    public C50603f f131670b;

    static {
        C50605h hVar = new C50605h();
        f131667c = hVar;
        C62942bv.registerDefaultInstance(C50605h.class, hVar);
    }

    private C50605h() {
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
                return newMessageInfo(f131667c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C50605h();
            case 4:
                return new C50604g();
            case 5:
                return f131667c;
            case 6:
                C63010eb ebVar = f131668d;
                if (ebVar == null) {
                    synchronized (C50605h.class) {
                        ebVar = f131668d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131667c);
                            f131668d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
