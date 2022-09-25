package com.google.android.libraries.assistant.p1594s.p1597b;

import com.google.assistant.p3781ad.p3789d.p3791b.C48714bv;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.s.b.ad */
/* compiled from: PG */
public final class C19143ad extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C19143ad f53623c;

    /* renamed from: e */
    private static volatile C63010eb f53624e;

    /* renamed from: a */
    public int f53625a;

    /* renamed from: b */
    public boolean f53626b;

    /* renamed from: d */
    private int f53627d;

    static {
        C19143ad adVar = new C19143ad();
        f53623c = adVar;
        C62942bv.registerDefaultInstance(C19143ad.class, adVar);
    }

    private C19143ad() {
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
                return newMessageInfo(f53623c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", C48714bv.m85266b(), "b"});
            case 3:
                return new C19143ad();
            case 4:
                return new C19142ac();
            case 5:
                return f53623c;
            case 6:
                C63010eb ebVar = f53624e;
                if (ebVar == null) {
                    synchronized (C19143ad.class) {
                        ebVar = f53624e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53623c);
                            f53624e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
