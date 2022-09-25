package com.google.android.apps.search.fedora.p10099e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.fedora.e.q */
/* compiled from: PG */
public final class C132809q extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C132809q f362352d;

    /* renamed from: e */
    private static volatile C63010eb f362353e;

    /* renamed from: a */
    public int f362354a;

    /* renamed from: b */
    public boolean f362355b;

    /* renamed from: c */
    public String f362356c = BuildConfig.FLAVOR;

    static {
        C132809q qVar = new C132809q();
        f362352d = qVar;
        C62942bv.registerDefaultInstance(C132809q.class, qVar);
    }

    private C132809q() {
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
                return newMessageInfo(f362352d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C132809q();
            case 4:
                return new C132808p();
            case 5:
                return f362352d;
            case 6:
                C63010eb ebVar = f362353e;
                if (ebVar == null) {
                    synchronized (C132809q.class) {
                        ebVar = f362353e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f362352d);
                            f362353e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
