package com.google.assistant.p3781ad.p3787c.p3788a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.c.a.aq */
/* compiled from: PG */
public final class C48498aq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48498aq f125279c;

    /* renamed from: d */
    private static volatile C63010eb f125280d;

    /* renamed from: a */
    public int f125281a;

    /* renamed from: b */
    public float f125282b;

    static {
        C48498aq aqVar = new C48498aq();
        f125279c = aqVar;
        C62942bv.registerDefaultInstance(C48498aq.class, aqVar);
    }

    private C48498aq() {
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
                return newMessageInfo(f125279c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C48498aq();
            case 4:
                return new C48497ap();
            case 5:
                return f125279c;
            case 6:
                C63010eb ebVar = f125280d;
                if (ebVar == null) {
                    synchronized (C48498aq.class) {
                        ebVar = f125280d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125279c);
                            f125280d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
