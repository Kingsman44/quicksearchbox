package com.google.android.libraries.search.p3055n;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.n.co */
/* compiled from: PG */
public final class C39661co extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C39661co f104404d;

    /* renamed from: e */
    private static volatile C63010eb f104405e;

    /* renamed from: a */
    public int f104406a;

    /* renamed from: b */
    public String f104407b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f104408c = BuildConfig.FLAVOR;

    static {
        C39661co coVar = new C39661co();
        f104404d = coVar;
        C62942bv.registerDefaultInstance(C39661co.class, coVar);
    }

    private C39661co() {
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
                return newMessageInfo(f104404d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C39661co();
            case 4:
                return new C39660cn();
            case 5:
                return f104404d;
            case 6:
                C63010eb ebVar = f104405e;
                if (ebVar == null) {
                    synchronized (C39661co.class) {
                        ebVar = f104405e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f104404d);
                            f104405e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
