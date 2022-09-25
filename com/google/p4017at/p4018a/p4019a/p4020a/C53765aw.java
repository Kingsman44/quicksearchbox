package com.google.p4017at.p4018a.p4019a.p4020a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.a.a.a.aw */
/* compiled from: PG */
public final class C53765aw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53765aw f141132c;

    /* renamed from: d */
    private static volatile C63010eb f141133d;

    /* renamed from: a */
    public int f141134a;

    /* renamed from: b */
    public int f141135b;

    static {
        C53765aw awVar = new C53765aw();
        f141132c = awVar;
        C62942bv.registerDefaultInstance(C53765aw.class, awVar);
    }

    private C53765aw() {
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
                return newMessageInfo(f141132c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C53764av.f141131a});
            case 3:
                return new C53765aw();
            case 4:
                return new C53763au();
            case 5:
                return f141132c;
            case 6:
                C63010eb ebVar = f141133d;
                if (ebVar == null) {
                    synchronized (C53765aw.class) {
                        ebVar = f141133d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141132c);
                            f141133d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
