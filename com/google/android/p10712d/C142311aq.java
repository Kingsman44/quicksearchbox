package com.google.android.p10712d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.aq */
/* compiled from: PG */
public final class C142311aq extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C142311aq f386076d;

    /* renamed from: f */
    private static volatile C63010eb f386077f;

    /* renamed from: a */
    public int f386078a;

    /* renamed from: b */
    public boolean f386079b;

    /* renamed from: c */
    public boolean f386080c;

    /* renamed from: e */
    private byte f386081e = 2;

    static {
        C142311aq aqVar = new C142311aq();
        f386076d = aqVar;
        C62942bv.registerDefaultInstance(C142311aq.class, aqVar);
    }

    private C142311aq() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f386081e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f386081e = b;
                return null;
            case 2:
                return newMessageInfo(f386076d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C142311aq();
            case 4:
                return new C142310ap();
            case 5:
                return f386076d;
            case 6:
                C63010eb ebVar = f386077f;
                if (ebVar == null) {
                    synchronized (C142311aq.class) {
                        ebVar = f386077f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386076d);
                            f386077f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
