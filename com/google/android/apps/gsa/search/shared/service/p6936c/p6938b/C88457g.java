package com.google.android.apps.gsa.search.shared.service.p6936c.p6938b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.c.b.g */
/* compiled from: PG */
public final class C88457g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88457g f239132c;

    /* renamed from: d */
    private static volatile C63010eb f239133d;

    /* renamed from: a */
    public int f239134a;

    /* renamed from: b */
    public long f239135b;

    static {
        C88457g gVar = new C88457g();
        f239132c = gVar;
        C62942bv.registerDefaultInstance(C88457g.class, gVar);
    }

    private C88457g() {
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
                return newMessageInfo(f239132c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C88457g();
            case 4:
                return new C88456f();
            case 5:
                return f239132c;
            case 6:
                C63010eb ebVar = f239133d;
                if (ebVar == null) {
                    synchronized (C88457g.class) {
                        ebVar = f239133d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f239132c);
                            f239133d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
