package com.google.android.p10712d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.h */
/* compiled from: PG */
public final class C142483h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C142483h f386661d;

    /* renamed from: f */
    private static volatile C63010eb f386662f;

    /* renamed from: a */
    public int f386663a;

    /* renamed from: b */
    public int f386664b;

    /* renamed from: c */
    public boolean f386665c;

    /* renamed from: e */
    private byte f386666e = 2;

    static {
        C142483h hVar = new C142483h();
        f386661d = hVar;
        C62942bv.registerDefaultInstance(C142483h.class, hVar);
    }

    private C142483h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f386666e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f386666e = b;
                return null;
            case 2:
                return newMessageInfo(f386661d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔋ\u0000\u0002ᔇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C142483h();
            case 4:
                return new C142456g();
            case 5:
                return f386661d;
            case 6:
                C63010eb ebVar = f386662f;
                if (ebVar == null) {
                    synchronized (C142483h.class) {
                        ebVar = f386662f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386661d);
                            f386662f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
