package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.br */
/* compiled from: PG */
public final class C138210br extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C138210br f376044c;

    /* renamed from: e */
    private static volatile C63010eb f376045e;

    /* renamed from: a */
    public String f376046a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f376047b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f376048d;

    static {
        C138210br brVar = new C138210br();
        f376044c = brVar;
        C62942bv.registerDefaultInstance(C138210br.class, brVar);
    }

    private C138210br() {
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
                return newMessageInfo(f376044c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C138210br();
            case 4:
                return new C138209bq();
            case 5:
                return f376044c;
            case 6:
                C63010eb ebVar = f376045e;
                if (ebVar == null) {
                    synchronized (C138210br.class) {
                        ebVar = f376045e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f376044c);
                            f376045e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
