package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.cz */
/* compiled from: PG */
public final class C124687cz extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C124687cz f343986d;

    /* renamed from: e */
    private static volatile C63010eb f343987e;

    /* renamed from: a */
    public int f343988a;

    /* renamed from: b */
    public String f343989b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f343990c = BuildConfig.FLAVOR;

    static {
        C124687cz czVar = new C124687cz();
        f343986d = czVar;
        C62942bv.registerDefaultInstance(C124687cz.class, czVar);
    }

    private C124687cz() {
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
                return newMessageInfo(f343986d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C124687cz();
            case 4:
                return new C124686cy();
            case 5:
                return f343986d;
            case 6:
                C63010eb ebVar = f343987e;
                if (ebVar == null) {
                    synchronized (C124687cz.class) {
                        ebVar = f343987e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f343986d);
                            f343987e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
