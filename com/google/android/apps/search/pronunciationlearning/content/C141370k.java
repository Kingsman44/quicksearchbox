package com.google.android.apps.search.pronunciationlearning.content;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.pronunciationlearning.content.k */
/* compiled from: PG */
public final class C141370k extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C141370k f383773d;

    /* renamed from: e */
    private static volatile C63010eb f383774e;

    /* renamed from: a */
    public int f383775a;

    /* renamed from: b */
    public String f383776b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f383777c = BuildConfig.FLAVOR;

    static {
        C141370k kVar = new C141370k();
        f383773d = kVar;
        C62942bv.registerDefaultInstance(C141370k.class, kVar);
    }

    private C141370k() {
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
                return newMessageInfo(f383773d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C141370k();
            case 4:
                return new C141369j();
            case 5:
                return f383773d;
            case 6:
                C63010eb ebVar = f383774e;
                if (ebVar == null) {
                    synchronized (C141370k.class) {
                        ebVar = f383774e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f383773d);
                            f383774e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
