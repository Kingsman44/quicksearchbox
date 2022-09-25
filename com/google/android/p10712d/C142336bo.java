package com.google.android.p10712d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.bo */
/* compiled from: PG */
public final class C142336bo extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C142336bo f386159f;

    /* renamed from: g */
    private static volatile C63010eb f386160g;

    /* renamed from: a */
    public int f386161a;

    /* renamed from: b */
    public int f386162b;

    /* renamed from: c */
    public C142355cg f386163c;

    /* renamed from: d */
    public C142355cg f386164d;

    /* renamed from: e */
    public C142355cg f386165e;

    static {
        C142336bo boVar = new C142336bo();
        f386159f = boVar;
        C62942bv.registerDefaultInstance(C142336bo.class, boVar);
    }

    private C142336bo() {
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
                return newMessageInfo(f386159f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C142334bm.f386158a, C45240c.f118157a, "d", "e"});
            case 3:
                return new C142336bo();
            case 4:
                return new C142333bl();
            case 5:
                return f386159f;
            case 6:
                C63010eb ebVar = f386160g;
                if (ebVar == null) {
                    synchronized (C142336bo.class) {
                        ebVar = f386160g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386159f);
                            f386160g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
