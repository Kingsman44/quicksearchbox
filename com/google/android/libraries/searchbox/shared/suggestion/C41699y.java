package com.google.android.libraries.searchbox.shared.suggestion;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.searchbox.shared.suggestion.y */
/* compiled from: PG */
public final class C41699y extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C41699y f109072f;

    /* renamed from: g */
    private static volatile C63010eb f109073g;

    /* renamed from: a */
    public int f109074a;

    /* renamed from: b */
    public String f109075b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C63088z f109076c = C63088z.f170246b;

    /* renamed from: d */
    public int f109077d;

    /* renamed from: e */
    public int f109078e;

    static {
        C41699y yVar = new C41699y();
        f109072f = yVar;
        C62942bv.registerDefaultInstance(C41699y.class, yVar);
    }

    private C41699y() {
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
                return newMessageInfo(f109072f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C41699y();
            case 4:
                return new C41698x();
            case 5:
                return f109072f;
            case 6:
                C63010eb ebVar = f109073g;
                if (ebVar == null) {
                    synchronized (C41699y.class) {
                        ebVar = f109073g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f109072f);
                            f109073g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
