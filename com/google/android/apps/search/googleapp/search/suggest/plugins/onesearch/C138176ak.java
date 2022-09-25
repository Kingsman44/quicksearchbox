package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p395al.p417d.p418a.p421b.C8564q;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.ak */
/* compiled from: PG */
public final class C138176ak extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C138176ak f375957e;

    /* renamed from: f */
    private static volatile C63010eb f375958f;

    /* renamed from: a */
    public int f375959a;

    /* renamed from: b */
    public String f375960b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f375961c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C8564q f375962d;

    static {
        C138176ak akVar = new C138176ak();
        f375957e = akVar;
        C62942bv.registerDefaultInstance(C138176ak.class, akVar);
    }

    private C138176ak() {
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
                return newMessageInfo(f375957e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C138176ak();
            case 4:
                return new C138175aj();
            case 5:
                return f375957e;
            case 6:
                C63010eb ebVar = f375958f;
                if (ebVar == null) {
                    synchronized (C138176ak.class) {
                        ebVar = f375958f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f375957e);
                            f375958f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
