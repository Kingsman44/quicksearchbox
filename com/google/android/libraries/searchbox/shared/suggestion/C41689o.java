package com.google.android.libraries.searchbox.shared.suggestion;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.searchbox.shared.suggestion.o */
/* compiled from: PG */
public final class C41689o extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C41689o f109041e;

    /* renamed from: f */
    private static volatile C63010eb f109042f;

    /* renamed from: a */
    public int f109043a;

    /* renamed from: b */
    public String f109044b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f109045c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C63088z f109046d = C63088z.f170246b;

    static {
        C41689o oVar = new C41689o();
        f109041e = oVar;
        C62942bv.registerDefaultInstance(C41689o.class, oVar);
    }

    private C41689o() {
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
                return newMessageInfo(f109041e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ည\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C41689o();
            case 4:
                return new C41688n();
            case 5:
                return f109041e;
            case 6:
                C63010eb ebVar = f109042f;
                if (ebVar == null) {
                    synchronized (C41689o.class) {
                        ebVar = f109042f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f109041e);
                            f109042f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
