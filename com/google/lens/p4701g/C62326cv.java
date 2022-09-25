package com.google.lens.p4701g;

import com.google.android.libraries.p1657ba.p1664c.p1668c.p1669a.C19651b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.cv */
/* compiled from: PG */
public final class C62326cv extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62326cv f168243c;

    /* renamed from: d */
    private static volatile C63010eb f168244d;

    /* renamed from: a */
    public int f168245a;

    /* renamed from: b */
    public C19651b f168246b;

    static {
        C62326cv cvVar = new C62326cv();
        f168243c = cvVar;
        C62942bv.registerDefaultInstance(C62326cv.class, cvVar);
    }

    private C62326cv() {
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
                return newMessageInfo(f168243c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C62326cv();
            case 4:
                return new C62325cu();
            case 5:
                return f168243c;
            case 6:
                C63010eb ebVar = f168244d;
                if (ebVar == null) {
                    synchronized (C62326cv.class) {
                        ebVar = f168244d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168243c);
                            f168244d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
