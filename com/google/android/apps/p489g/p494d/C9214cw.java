package com.google.android.apps.p489g.p494d;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.cw */
/* compiled from: PG */
public final class C9214cw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C9214cw f31833c;

    /* renamed from: d */
    private static volatile C63010eb f31834d;

    /* renamed from: a */
    public int f31835a;

    /* renamed from: b */
    public String f31836b = BuildConfig.FLAVOR;

    static {
        C9214cw cwVar = new C9214cw();
        f31833c = cwVar;
        C62942bv.registerDefaultInstance(C9214cw.class, cwVar);
    }

    private C9214cw() {
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
                return newMessageInfo(f31833c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C9214cw();
            case 4:
                return new C9213cv();
            case 5:
                return f31833c;
            case 6:
                C63010eb ebVar = f31834d;
                if (ebVar == null) {
                    synchronized (C9214cw.class) {
                        ebVar = f31834d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31833c);
                            f31834d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
