package com.google.android.libraries.search.p2476a.p2483e.p2484a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.a.e.a.b */
/* compiled from: PG */
public final class C32219b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C32219b f86427c;

    /* renamed from: d */
    private static volatile C63010eb f86428d;

    /* renamed from: a */
    public int f86429a;

    /* renamed from: b */
    public String f86430b = BuildConfig.FLAVOR;

    static {
        C32219b bVar = new C32219b();
        f86427c = bVar;
        C62942bv.registerDefaultInstance(C32219b.class, bVar);
    }

    private C32219b() {
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
                return newMessageInfo(f86427c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C32219b();
            case 4:
                return new C32218a();
            case 5:
                return f86427c;
            case 6:
                C63010eb ebVar = f86428d;
                if (ebVar == null) {
                    synchronized (C32219b.class) {
                        ebVar = f86428d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f86427c);
                            f86428d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
