package com.google.android.apps.search.googleapp.p10527u;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.u.r */
/* compiled from: PG */
public final class C139777r extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C139777r f379893c;

    /* renamed from: d */
    private static volatile C63010eb f379894d;

    /* renamed from: a */
    public int f379895a;

    /* renamed from: b */
    public int f379896b;

    static {
        C139777r rVar = new C139777r();
        f379893c = rVar;
        C62942bv.registerDefaultInstance(C139777r.class, rVar);
    }

    private C139777r() {
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
                return newMessageInfo(f379893c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C139779t.m227246b()});
            case 3:
                return new C139777r();
            case 4:
                return new C139776q();
            case 5:
                return f379893c;
            case 6:
                C63010eb ebVar = f379894d;
                if (ebVar == null) {
                    synchronized (C139777r.class) {
                        ebVar = f379894d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f379893c);
                            f379894d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
