package com.google.p4160bf.p4161a.p4163b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62959cf;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.a.b.ae */
/* compiled from: PG */
public final class C55441ae extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C55441ae f146268f;

    /* renamed from: g */
    private static volatile C63010eb f146269g;

    /* renamed from: a */
    public int f146270a;

    /* renamed from: b */
    public String f146271b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f146272c;

    /* renamed from: d */
    public int f146273d;

    /* renamed from: e */
    public int f146274e;

    static {
        C55441ae aeVar = new C55441ae();
        f146268f = aeVar;
        C62942bv.registerDefaultInstance(C55441ae.class, aeVar);
    }

    private C55441ae() {
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
                Object[] objArr = new Object[8];
                objArr[0] = "a";
                objArr[1] = "b";
                objArr[2] = C45240c.f118157a;
                objArr[3] = C55439ac.f146266a;
                objArr[4] = "d";
                C62959cf cfVar = C55440ad.f146267a;
                objArr[7] = cfVar;
                objArr[5] = cfVar;
                objArr[6] = "e";
                return newMessageInfo(f146268f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", objArr);
            case 3:
                return new C55441ae();
            case 4:
                return new C55438ab();
            case 5:
                return f146268f;
            case 6:
                C63010eb ebVar = f146269g;
                if (ebVar == null) {
                    synchronized (C55441ae.class) {
                        ebVar = f146269g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146268f);
                            f146269g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
