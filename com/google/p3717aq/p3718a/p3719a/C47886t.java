package com.google.p3717aq.p3718a.p3719a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.aq.a.a.t */
/* compiled from: PG */
public final class C47886t extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C47886t f123973b;

    /* renamed from: c */
    private static volatile C63010eb f123974c;

    /* renamed from: a */
    public String f123975a = BuildConfig.FLAVOR;

    static {
        C47886t tVar = new C47886t();
        f123973b = tVar;
        C62942bv.registerDefaultInstance(C47886t.class, tVar);
    }

    private C47886t() {
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
                return newMessageInfo(f123973b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C47886t();
            case 4:
                return new C47885s();
            case 5:
                return f123973b;
            case 6:
                C63010eb ebVar = f123974c;
                if (ebVar == null) {
                    synchronized (C47886t.class) {
                        ebVar = f123974c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f123973b);
                            f123974c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
