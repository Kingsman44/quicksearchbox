package com.google.android.p10712d;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.hs */
/* compiled from: PG */
public final class C142502hs extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C142502hs f386704b;

    /* renamed from: c */
    private static volatile C63010eb f386705c;

    /* renamed from: a */
    public String f386706a = BuildConfig.FLAVOR;

    static {
        C142502hs hsVar = new C142502hs();
        f386704b = hsVar;
        C62942bv.registerDefaultInstance(C142502hs.class, hsVar);
    }

    private C142502hs() {
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
                return newMessageInfo(f386704b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C142502hs();
            case 4:
                return new C142501hr();
            case 5:
                return f386704b;
            case 6:
                C63010eb ebVar = f386705c;
                if (ebVar == null) {
                    synchronized (C142502hs.class) {
                        ebVar = f386705c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386704b);
                            f386705c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
