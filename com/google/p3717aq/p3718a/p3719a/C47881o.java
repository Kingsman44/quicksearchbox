package com.google.p3717aq.p3718a.p3719a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.aq.a.a.o */
/* compiled from: PG */
public final class C47881o extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C47881o f123955b;

    /* renamed from: c */
    private static volatile C63010eb f123956c;

    /* renamed from: a */
    public String f123957a = BuildConfig.FLAVOR;

    static {
        C47881o oVar = new C47881o();
        f123955b = oVar;
        C62942bv.registerDefaultInstance(C47881o.class, oVar);
    }

    private C47881o() {
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
                return newMessageInfo(f123955b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C47881o();
            case 4:
                return new C47880n();
            case 5:
                return f123955b;
            case 6:
                C63010eb ebVar = f123956c;
                if (ebVar == null) {
                    synchronized (C47881o.class) {
                        ebVar = f123956c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f123955b);
                            f123956c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
