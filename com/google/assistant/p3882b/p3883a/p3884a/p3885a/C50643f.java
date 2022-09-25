package com.google.assistant.p3882b.p3883a.p3884a.p3885a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.b.a.a.a.f */
/* compiled from: PG */
public final class C50643f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50643f f131741c;

    /* renamed from: d */
    private static volatile C63010eb f131742d;

    /* renamed from: a */
    public int f131743a;

    /* renamed from: b */
    public C50638an f131744b;

    static {
        C50643f fVar = new C50643f();
        f131741c = fVar;
        C62942bv.registerDefaultInstance(C50643f.class, fVar);
    }

    private C50643f() {
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
                return newMessageInfo(f131741c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C50643f();
            case 4:
                return new C50642e();
            case 5:
                return f131741c;
            case 6:
                C63010eb ebVar = f131742d;
                if (ebVar == null) {
                    synchronized (C50643f.class) {
                        ebVar = f131742d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131741c);
                            f131742d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
