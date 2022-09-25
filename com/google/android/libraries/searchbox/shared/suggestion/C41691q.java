package com.google.android.libraries.searchbox.shared.suggestion;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.searchbox.shared.suggestion.q */
/* compiled from: PG */
public final class C41691q extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C41691q f109047e;

    /* renamed from: f */
    private static volatile C63010eb f109048f;

    /* renamed from: a */
    public int f109049a;

    /* renamed from: b */
    public String f109050b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f109051c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f109052d;

    static {
        C41691q qVar = new C41691q();
        f109047e = qVar;
        C62942bv.registerDefaultInstance(C41691q.class, qVar);
    }

    private C41691q() {
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
                return newMessageInfo(f109047e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C41691q();
            case 4:
                return new C41690p();
            case 5:
                return f109047e;
            case 6:
                C63010eb ebVar = f109048f;
                if (ebVar == null) {
                    synchronized (C41691q.class) {
                        ebVar = f109048f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f109047e);
                            f109048f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
