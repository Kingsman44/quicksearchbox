package com.google.speech.p5204e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.e.d */
/* compiled from: PG */
public final class C66493d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66493d f180800d;

    /* renamed from: e */
    private static volatile C63010eb f180801e;

    /* renamed from: a */
    public int f180802a;

    /* renamed from: b */
    public String f180803b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f180804c = BuildConfig.FLAVOR;

    static {
        C66493d dVar = new C66493d();
        f180800d = dVar;
        C62942bv.registerDefaultInstance(C66493d.class, dVar);
    }

    private C66493d() {
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
                return newMessageInfo(f180800d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66493d();
            case 4:
                return new C66492c();
            case 5:
                return f180800d;
            case 6:
                C63010eb ebVar = f180801e;
                if (ebVar == null) {
                    synchronized (C66493d.class) {
                        ebVar = f180801e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180800d);
                            f180801e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
