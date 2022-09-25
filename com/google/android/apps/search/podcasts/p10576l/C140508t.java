package com.google.android.apps.search.podcasts.p10576l;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.podcasts.l.t */
/* compiled from: PG */
public final class C140508t extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C140508t f381626c;

    /* renamed from: d */
    private static volatile C63010eb f381627d;

    /* renamed from: a */
    public boolean f381628a;

    /* renamed from: b */
    public boolean f381629b;

    static {
        C140508t tVar = new C140508t();
        f381626c = tVar;
        C62942bv.registerDefaultInstance(C140508t.class, tVar);
    }

    private C140508t() {
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
                return newMessageInfo(f381626c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"a", "b"});
            case 3:
                return new C140508t();
            case 4:
                return new C140507s();
            case 5:
                return f381626c;
            case 6:
                C63010eb ebVar = f381627d;
                if (ebVar == null) {
                    synchronized (C140508t.class) {
                        ebVar = f381627d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f381626c);
                            f381627d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
