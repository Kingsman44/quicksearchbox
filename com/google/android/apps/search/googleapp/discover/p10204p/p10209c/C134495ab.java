package com.google.android.apps.search.googleapp.discover.p10204p.p10209c;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.p.c.ab */
/* compiled from: PG */
public final class C134495ab extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C134495ab f366276c;

    /* renamed from: d */
    private static volatile C63010eb f366277d;

    /* renamed from: a */
    public int f366278a;

    /* renamed from: b */
    public String f366279b = BuildConfig.FLAVOR;

    static {
        C134495ab abVar = new C134495ab();
        f366276c = abVar;
        C62942bv.registerDefaultInstance(C134495ab.class, abVar);
    }

    private C134495ab() {
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
                return newMessageInfo(f366276c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C134495ab();
            case 4:
                return new C134494aa();
            case 5:
                return f366276c;
            case 6:
                C63010eb ebVar = f366277d;
                if (ebVar == null) {
                    synchronized (C134495ab.class) {
                        ebVar = f366277d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f366276c);
                            f366277d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
