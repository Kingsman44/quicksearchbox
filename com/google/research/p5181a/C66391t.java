package com.google.research.p5181a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.research.a.t */
/* compiled from: PG */
public final class C66391t extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66391t f180526d;

    /* renamed from: e */
    private static volatile C63010eb f180527e;

    /* renamed from: a */
    public int f180528a;

    /* renamed from: b */
    public long f180529b;

    /* renamed from: c */
    public String f180530c = BuildConfig.FLAVOR;

    static {
        C66391t tVar = new C66391t();
        f180526d = tVar;
        C62942bv.registerDefaultInstance(C66391t.class, tVar);
    }

    private C66391t() {
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
                return newMessageInfo(f180526d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66391t();
            case 4:
                return new C66390s();
            case 5:
                return f180526d;
            case 6:
                C63010eb ebVar = f180527e;
                if (ebVar == null) {
                    synchronized (C66391t.class) {
                        ebVar = f180527e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180526d);
                            f180527e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
