package com.google.android.apps.p489g.p494d;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.bn */
/* compiled from: PG */
public final class C9178bn extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C9178bn f31697c;

    /* renamed from: d */
    private static volatile C63010eb f31698d;

    /* renamed from: a */
    public int f31699a;

    /* renamed from: b */
    public String f31700b = BuildConfig.FLAVOR;

    static {
        C9178bn bnVar = new C9178bn();
        f31697c = bnVar;
        C62942bv.registerDefaultInstance(C9178bn.class, bnVar);
    }

    private C9178bn() {
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
                return newMessageInfo(f31697c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C9178bn();
            case 4:
                return new C9177bm();
            case 5:
                return f31697c;
            case 6:
                C63010eb ebVar = f31698d;
                if (ebVar == null) {
                    synchronized (C9178bn.class) {
                        ebVar = f31698d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31697c);
                            f31698d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
