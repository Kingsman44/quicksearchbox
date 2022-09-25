package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.ch */
/* compiled from: PG */
public final class C138252ch extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C138252ch f376145d;

    /* renamed from: e */
    private static volatile C63010eb f376146e;

    /* renamed from: a */
    public int f376147a;

    /* renamed from: b */
    public String f376148b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f376149c = BuildConfig.FLAVOR;

    static {
        C138252ch chVar = new C138252ch();
        f376145d = chVar;
        C62942bv.registerDefaultInstance(C138252ch.class, chVar);
    }

    private C138252ch() {
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
                return newMessageInfo(f376145d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C138252ch();
            case 4:
                return new C138251cg();
            case 5:
                return f376145d;
            case 6:
                C63010eb ebVar = f376146e;
                if (ebVar == null) {
                    synchronized (C138252ch.class) {
                        ebVar = f376146e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f376145d);
                            f376146e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
