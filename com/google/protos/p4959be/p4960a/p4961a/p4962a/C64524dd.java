package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.dd */
/* compiled from: PG */
public final class C64524dd extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64524dd f174991b;

    /* renamed from: c */
    private static volatile C63010eb f174992c;

    /* renamed from: a */
    public String f174993a = BuildConfig.FLAVOR;

    static {
        C64524dd ddVar = new C64524dd();
        f174991b = ddVar;
        C62942bv.registerDefaultInstance(C64524dd.class, ddVar);
    }

    private C64524dd() {
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
                return newMessageInfo(f174991b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C64524dd();
            case 4:
                return new C64523dc();
            case 5:
                return f174991b;
            case 6:
                C63010eb ebVar = f174992c;
                if (ebVar == null) {
                    synchronized (C64524dd.class) {
                        ebVar = f174992c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174991b);
                            f174992c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
