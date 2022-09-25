package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.am */
/* compiled from: PG */
public final class C124620am extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C124620am f343761f;

    /* renamed from: g */
    private static volatile C63010eb f343762g;

    /* renamed from: a */
    public int f343763a;

    /* renamed from: b */
    public String f343764b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f343765c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f343766d;

    /* renamed from: e */
    public boolean f343767e;

    static {
        C124620am amVar = new C124620am();
        f343761f = amVar;
        C62942bv.registerDefaultInstance(C124620am.class, amVar);
    }

    private C124620am() {
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
                return newMessageInfo(f343761f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C124620am();
            case 4:
                return new C124619al();
            case 5:
                return f343761f;
            case 6:
                C63010eb ebVar = f343762g;
                if (ebVar == null) {
                    synchronized (C124620am.class) {
                        ebVar = f343762g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f343761f);
                            f343762g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
