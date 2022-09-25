package com.google.android.apps.search.weather.suggestions.p10697d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.weather.suggestions.d.b */
/* compiled from: PG */
public final class C142143b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C142143b f385599d;

    /* renamed from: e */
    private static volatile C63010eb f385600e;

    /* renamed from: a */
    public int f385601a;

    /* renamed from: b */
    public String f385602b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f385603c = BuildConfig.FLAVOR;

    static {
        C142143b bVar = new C142143b();
        f385599d = bVar;
        C62942bv.registerDefaultInstance(C142143b.class, bVar);
    }

    private C142143b() {
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
                return newMessageInfo(f385599d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C142143b();
            case 4:
                return new C142142a();
            case 5:
                return f385599d;
            case 6:
                C63010eb ebVar = f385600e;
                if (ebVar == null) {
                    synchronized (C142143b.class) {
                        ebVar = f385600e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f385599d);
                            f385600e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
