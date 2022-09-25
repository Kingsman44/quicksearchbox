package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.ci */
/* compiled from: PG */
public final class C138461ci extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C138461ci f376626c;

    /* renamed from: d */
    private static volatile C63010eb f376627d;

    /* renamed from: a */
    public int f376628a;

    /* renamed from: b */
    public String f376629b = BuildConfig.FLAVOR;

    static {
        C138461ci ciVar = new C138461ci();
        f376626c = ciVar;
        C62942bv.registerDefaultInstance(C138461ci.class, ciVar);
    }

    private C138461ci() {
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
                return newMessageInfo(f376626c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C138461ci();
            case 4:
                return new C138460ch();
            case 5:
                return f376626c;
            case 6:
                C63010eb ebVar = f376627d;
                if (ebVar == null) {
                    synchronized (C138461ci.class) {
                        ebVar = f376627d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f376626c);
                            f376627d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
