package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.oc */
/* compiled from: PG */
public final class C88072oc extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C88072oc f238127b;

    /* renamed from: d */
    private static volatile C63010eb f238128d;

    /* renamed from: a */
    public String f238129a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f238130c;

    static {
        C88072oc ocVar = new C88072oc();
        f238127b = ocVar;
        C62942bv.registerDefaultInstance(C88072oc.class, ocVar);
    }

    private C88072oc() {
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
                return newMessageInfo(f238127b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C88072oc();
            case 4:
                return new C88071ob();
            case 5:
                return f238127b;
            case 6:
                C63010eb ebVar = f238128d;
                if (ebVar == null) {
                    synchronized (C88072oc.class) {
                        ebVar = f238128d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238127b);
                            f238128d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
