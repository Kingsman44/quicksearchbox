package com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.a.b.w */
/* compiled from: PG */
public final class C137963w extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C137963w f375348c;

    /* renamed from: d */
    private static volatile C63010eb f375349d;

    /* renamed from: a */
    public int f375350a;

    /* renamed from: b */
    public int f375351b;

    static {
        C137963w wVar = new C137963w();
        f375348c = wVar;
        C62942bv.registerDefaultInstance(C137963w.class, wVar);
    }

    private C137963w() {
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
                return newMessageInfo(f375348c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C137963w();
            case 4:
                return new C137962v();
            case 5:
                return f375348c;
            case 6:
                C63010eb ebVar = f375349d;
                if (ebVar == null) {
                    synchronized (C137963w.class) {
                        ebVar = f375349d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f375348c);
                            f375349d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
