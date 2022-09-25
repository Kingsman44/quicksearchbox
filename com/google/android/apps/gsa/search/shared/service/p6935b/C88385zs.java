package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.zs */
/* compiled from: PG */
public final class C88385zs extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88385zs f238998c;

    /* renamed from: d */
    private static volatile C63010eb f238999d;

    /* renamed from: a */
    public int f239000a;

    /* renamed from: b */
    public String f239001b = BuildConfig.FLAVOR;

    static {
        C88385zs zsVar = new C88385zs();
        f238998c = zsVar;
        C62942bv.registerDefaultInstance(C88385zs.class, zsVar);
    }

    private C88385zs() {
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
                return newMessageInfo(f238998c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C88385zs();
            case 4:
                return new C88384zr();
            case 5:
                return f238998c;
            case 6:
                C63010eb ebVar = f238999d;
                if (ebVar == null) {
                    synchronized (C88385zs.class) {
                        ebVar = f238999d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238998c);
                            f238999d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
