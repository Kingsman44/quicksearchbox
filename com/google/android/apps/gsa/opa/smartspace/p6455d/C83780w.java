package com.google.android.apps.gsa.opa.smartspace.p6455d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.d.w */
/* compiled from: PG */
public final class C83780w extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C83780w f228351d;

    /* renamed from: e */
    private static volatile C63010eb f228352e;

    /* renamed from: a */
    public int f228353a;

    /* renamed from: b */
    public String f228354b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C83776s f228355c;

    static {
        C83780w wVar = new C83780w();
        f228351d = wVar;
        C62942bv.registerDefaultInstance(C83780w.class, wVar);
    }

    private C83780w() {
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
                return newMessageInfo(f228351d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C83780w();
            case 4:
                return new C83779v();
            case 5:
                return f228351d;
            case 6:
                C63010eb ebVar = f228352e;
                if (ebVar == null) {
                    synchronized (C83780w.class) {
                        ebVar = f228352e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228351d);
                            f228352e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
