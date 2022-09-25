package com.google.assistant.p3781ad.p3789d.p3791b.p3792a;

import com.google.assistant.p3825an.p3830c.p3831a.C49337n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.a.h */
/* compiled from: PG */
public final class C48647h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48647h f125730c;

    /* renamed from: d */
    private static volatile C63010eb f125731d;

    /* renamed from: a */
    public int f125732a;

    /* renamed from: b */
    public C49337n f125733b;

    static {
        C48647h hVar = new C48647h();
        f125730c = hVar;
        C62942bv.registerDefaultInstance(C48647h.class, hVar);
    }

    private C48647h() {
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
                return newMessageInfo(f125730c, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C48647h();
            case 4:
                return new C48646g();
            case 5:
                return f125730c;
            case 6:
                C63010eb ebVar = f125731d;
                if (ebVar == null) {
                    synchronized (C48647h.class) {
                        ebVar = f125731d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125730c);
                            f125731d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
