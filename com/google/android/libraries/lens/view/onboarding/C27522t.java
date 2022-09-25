package com.google.android.libraries.lens.view.onboarding;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.onboarding.t */
/* compiled from: PG */
public final class C27522t extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C27522t f75266c;

    /* renamed from: d */
    private static volatile C63010eb f75267d;

    /* renamed from: a */
    public int f75268a;

    /* renamed from: b */
    public boolean f75269b;

    static {
        C27522t tVar = new C27522t();
        f75266c = tVar;
        C62942bv.registerDefaultInstance(C27522t.class, tVar);
    }

    private C27522t() {
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
                return newMessageInfo(f75266c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C27522t();
            case 4:
                return new C27521s();
            case 5:
                return f75266c;
            case 6:
                C63010eb ebVar = f75267d;
                if (ebVar == null) {
                    synchronized (C27522t.class) {
                        ebVar = f75267d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f75266c);
                            f75267d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
