package com.google.android.libraries.social.p3269d.p3270a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.social.d.a.n */
/* compiled from: PG */
public final class C41939n extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C41939n f109468b;

    /* renamed from: d */
    private static volatile C63010eb f109469d;

    /* renamed from: a */
    public String f109470a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f109471c;

    static {
        C41939n nVar = new C41939n();
        f109468b = nVar;
        C62942bv.registerDefaultInstance(C41939n.class, nVar);
    }

    private C41939n() {
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
                return newMessageInfo(f109468b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C41939n();
            case 4:
                return new C41938m();
            case 5:
                return f109468b;
            case 6:
                C63010eb ebVar = f109469d;
                if (ebVar == null) {
                    synchronized (C41939n.class) {
                        ebVar = f109469d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f109468b);
                            f109469d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
