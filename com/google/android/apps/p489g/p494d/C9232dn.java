package com.google.android.apps.p489g.p494d;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.dn */
/* compiled from: PG */
public final class C9232dn extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C9232dn f31910c;

    /* renamed from: d */
    private static volatile C63010eb f31911d;

    /* renamed from: a */
    public int f31912a;

    /* renamed from: b */
    public String f31913b = BuildConfig.FLAVOR;

    static {
        C9232dn dnVar = new C9232dn();
        f31910c = dnVar;
        C62942bv.registerDefaultInstance(C9232dn.class, dnVar);
    }

    private C9232dn() {
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
                return newMessageInfo(f31910c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C9232dn();
            case 4:
                return new C9231dm();
            case 5:
                return f31910c;
            case 6:
                C63010eb ebVar = f31911d;
                if (ebVar == null) {
                    synchronized (C9232dn.class) {
                        ebVar = f31911d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31910c);
                            f31911d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
