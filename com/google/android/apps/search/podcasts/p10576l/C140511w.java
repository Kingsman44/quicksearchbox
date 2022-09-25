package com.google.android.apps.search.podcasts.p10576l;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.podcasts.l.w */
/* compiled from: PG */
public final class C140511w extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C140511w f381636b;

    /* renamed from: c */
    private static volatile C63010eb f381637c;

    /* renamed from: a */
    public boolean f381638a;

    static {
        C140511w wVar = new C140511w();
        f381636b = wVar;
        C62942bv.registerDefaultInstance(C140511w.class, wVar);
    }

    private C140511w() {
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
                return newMessageInfo(f381636b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u0007", new Object[]{"a"});
            case 3:
                return new C140511w();
            case 4:
                return new C140510v();
            case 5:
                return f381636b;
            case 6:
                C63010eb ebVar = f381637c;
                if (ebVar == null) {
                    synchronized (C140511w.class) {
                        ebVar = f381637c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f381636b);
                            f381637c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
