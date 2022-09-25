package com.google.lens.p4707j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.dw */
/* compiled from: PG */
public final class C62500dw extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62500dw f168731d;

    /* renamed from: e */
    private static volatile C63010eb f168732e;

    /* renamed from: a */
    public int f168733a;

    /* renamed from: b */
    public int f168734b;

    /* renamed from: c */
    public String f168735c = BuildConfig.FLAVOR;

    static {
        C62500dw dwVar = new C62500dw();
        f168731d = dwVar;
        C62942bv.registerDefaultInstance(C62500dw.class, dwVar);
    }

    private C62500dw() {
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
                return newMessageInfo(f168731d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C62501dx.f168736a, C45240c.f118157a});
            case 3:
                return new C62500dw();
            case 4:
                return new C62499dv();
            case 5:
                return f168731d;
            case 6:
                C63010eb ebVar = f168732e;
                if (ebVar == null) {
                    synchronized (C62500dw.class) {
                        ebVar = f168732e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168731d);
                            f168732e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
