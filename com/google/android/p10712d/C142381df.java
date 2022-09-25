package com.google.android.p10712d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.df */
/* compiled from: PG */
public final class C142381df extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C142381df f386349b;

    /* renamed from: e */
    private static volatile C63010eb f386350e;

    /* renamed from: a */
    public int f386351a;

    /* renamed from: c */
    private int f386352c;

    /* renamed from: d */
    private byte f386353d = 2;

    static {
        C142381df dfVar = new C142381df();
        f386349b = dfVar;
        C62942bv.registerDefaultInstance(C142381df.class, dfVar);
    }

    private C142381df() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f386353d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f386353d = b;
                return null;
            case 2:
                return newMessageInfo(f386349b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔄ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C142381df();
            case 4:
                return new C142380de();
            case 5:
                return f386349b;
            case 6:
                C63010eb ebVar = f386350e;
                if (ebVar == null) {
                    synchronized (C142381df.class) {
                        ebVar = f386350e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386349b);
                            f386350e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
