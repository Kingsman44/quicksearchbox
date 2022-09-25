package com.google.android.apps.search.googleapp.search.p10415i;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.search.googleapp.search.i.t */
/* compiled from: PG */
public final class C137518t extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C137518t f374029c;

    /* renamed from: d */
    private static volatile C63010eb f374030d;

    /* renamed from: a */
    public int f374031a;

    /* renamed from: b */
    public C63088z f374032b = C63088z.f170246b;

    static {
        C137518t tVar = new C137518t();
        f374029c = tVar;
        C62942bv.registerDefaultInstance(C137518t.class, tVar);
    }

    private C137518t() {
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
                return newMessageInfo(f374029c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            case 3:
                return new C137518t();
            case 4:
                return new C137517s();
            case 5:
                return f374029c;
            case 6:
                C63010eb ebVar = f374030d;
                if (ebVar == null) {
                    synchronized (C137518t.class) {
                        ebVar = f374030d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f374029c);
                            f374030d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
