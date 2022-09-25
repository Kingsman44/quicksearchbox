package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.apa */
/* compiled from: PG */
public final class C51686apa extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51686apa f135536e;

    /* renamed from: f */
    private static volatile C63010eb f135537f;

    /* renamed from: a */
    public int f135538a;

    /* renamed from: b */
    public String f135539b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f135540c;

    /* renamed from: d */
    public String f135541d = BuildConfig.FLAVOR;

    static {
        C51686apa apa = new C51686apa();
        f135536e = apa;
        C62942bv.registerDefaultInstance(C51686apa.class, apa);
    }

    private C51686apa() {
    }

    /* renamed from: a */
    public static C63010eb m86358a() {
        return f135536e.getParserForType();
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
                return newMessageInfo(f135536e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, aoy.f135535a, "d"});
            case 3:
                return new C51686apa();
            case 4:
                return new aox();
            case 5:
                return f135536e;
            case 6:
                C63010eb ebVar = f135537f;
                if (ebVar == null) {
                    synchronized (C51686apa.class) {
                        ebVar = f135537f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135536e);
                            f135537f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
