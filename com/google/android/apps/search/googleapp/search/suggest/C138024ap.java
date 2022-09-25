package com.google.android.apps.search.googleapp.search.suggest;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ap */
/* compiled from: PG */
public final class C138024ap extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C138024ap f375507d;

    /* renamed from: e */
    private static volatile C63010eb f375508e;

    /* renamed from: a */
    public int f375509a;

    /* renamed from: b */
    public String f375510b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f375511c = BuildConfig.FLAVOR;

    static {
        C138024ap apVar = new C138024ap();
        f375507d = apVar;
        C62942bv.registerDefaultInstance(C138024ap.class, apVar);
    }

    private C138024ap() {
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
                return newMessageInfo(f375507d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C138024ap();
            case 4:
                return new C138023ao();
            case 5:
                return f375507d;
            case 6:
                C63010eb ebVar = f375508e;
                if (ebVar == null) {
                    synchronized (C138024ap.class) {
                        ebVar = f375508e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f375507d);
                            f375508e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
