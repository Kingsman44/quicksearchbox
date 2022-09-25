package com.google.android.libraries.p1657ba.p1664c.p1668c;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.ba.c.c.f */
/* compiled from: PG */
public final class C19668f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C19668f f54700c;

    /* renamed from: d */
    private static volatile C63010eb f54701d;

    /* renamed from: a */
    public int f54702a;

    /* renamed from: b */
    public String f54703b = BuildConfig.FLAVOR;

    static {
        C19668f fVar = new C19668f();
        f54700c = fVar;
        C62942bv.registerDefaultInstance(C19668f.class, fVar);
    }

    private C19668f() {
        C63088z zVar = C63088z.f170246b;
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
                return newMessageInfo(f54700c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C19668f();
            case 4:
                return new C19667e();
            case 5:
                return f54700c;
            case 6:
                C63010eb ebVar = f54701d;
                if (ebVar == null) {
                    synchronized (C19668f.class) {
                        ebVar = f54701d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f54700c);
                            f54701d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
