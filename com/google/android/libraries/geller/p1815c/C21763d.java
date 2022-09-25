package com.google.android.libraries.geller.p1815c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.geller.c.d */
/* compiled from: PG */
public final class C21763d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C21763d f60062d;

    /* renamed from: e */
    private static volatile C63010eb f60063e;

    /* renamed from: a */
    public int f60064a;

    /* renamed from: b */
    public String f60065b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f60066c = BuildConfig.FLAVOR;

    static {
        C21763d dVar = new C21763d();
        f60062d = dVar;
        C62942bv.registerDefaultInstance(C21763d.class, dVar);
    }

    private C21763d() {
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
                return newMessageInfo(f60062d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C21763d();
            case 4:
                return new C21762c();
            case 5:
                return f60062d;
            case 6:
                C63010eb ebVar = f60063e;
                if (ebVar == null) {
                    synchronized (C21763d.class) {
                        ebVar = f60063e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f60062d);
                            f60063e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
