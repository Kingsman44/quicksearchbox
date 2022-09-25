package com.google.android.libraries.search.p2998g.p2999a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.g.a.c */
/* compiled from: PG */
public final class C38362c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C38362c f101570c;

    /* renamed from: d */
    private static volatile C63010eb f101571d;

    /* renamed from: a */
    public int f101572a;

    /* renamed from: b */
    public String f101573b = BuildConfig.FLAVOR;

    static {
        C38362c cVar = new C38362c();
        f101570c = cVar;
        C62942bv.registerDefaultInstance(C38362c.class, cVar);
    }

    private C38362c() {
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
                return newMessageInfo(f101570c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C38362c();
            case 4:
                return new C38344b();
            case 5:
                return f101570c;
            case 6:
                C63010eb ebVar = f101571d;
                if (ebVar == null) {
                    synchronized (C38362c.class) {
                        ebVar = f101571d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f101570c);
                            f101571d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
