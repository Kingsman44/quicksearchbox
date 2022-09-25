package com.google.android.p10712d;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.r */
/* compiled from: PG */
public final class C142526r extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C142526r f386750c;

    /* renamed from: d */
    private static volatile C63010eb f386751d;

    /* renamed from: a */
    public int f386752a;

    /* renamed from: b */
    public String f386753b = BuildConfig.FLAVOR;

    static {
        C142526r rVar = new C142526r();
        f386750c = rVar;
        C62942bv.registerDefaultInstance(C142526r.class, rVar);
    }

    private C142526r() {
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
                return newMessageInfo(f386750c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C142526r();
            case 4:
                return new C142525q();
            case 5:
                return f386750c;
            case 6:
                C63010eb ebVar = f386751d;
                if (ebVar == null) {
                    synchronized (C142526r.class) {
                        ebVar = f386751d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386750c);
                            f386751d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
