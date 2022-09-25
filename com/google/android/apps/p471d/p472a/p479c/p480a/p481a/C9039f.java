package com.google.android.apps.p471d.p472a.p479c.p480a.p481a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.d.a.c.a.a.f */
/* compiled from: PG */
public final class C9039f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C9039f f31243c;

    /* renamed from: d */
    private static volatile C63010eb f31244d;

    /* renamed from: a */
    public int f31245a = 0;

    /* renamed from: b */
    public Object f31246b;

    static {
        C9039f fVar = new C9039f();
        f31243c = fVar;
        C62942bv.registerDefaultInstance(C9039f.class, fVar);
    }

    private C9039f() {
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
                return newMessageInfo(f31243c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0002ျ\u0000", new Object[]{"b", "a"});
            case 3:
                return new C9039f();
            case 4:
                return new C9038e();
            case 5:
                return f31243c;
            case 6:
                C63010eb ebVar = f31244d;
                if (ebVar == null) {
                    synchronized (C9039f.class) {
                        ebVar = f31244d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31243c);
                            f31244d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
