package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.afr */
/* compiled from: PG */
public final class afr extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final afr f158566c;

    /* renamed from: d */
    private static volatile C63010eb f158567d;

    /* renamed from: a */
    public int f158568a;

    /* renamed from: b */
    public String f158569b = BuildConfig.FLAVOR;

    static {
        afr afr = new afr();
        f158566c = afr;
        C62942bv.registerDefaultInstance(afr.class, afr);
    }

    private afr() {
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
                return newMessageInfo(f158566c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new afr();
            case 4:
                return new afq();
            case 5:
                return f158566c;
            case 6:
                C63010eb ebVar = f158567d;
                if (ebVar == null) {
                    synchronized (afr.class) {
                        ebVar = f158567d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158566c);
                            f158567d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
