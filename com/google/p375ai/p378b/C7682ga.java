package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.ga */
/* compiled from: PG */
public final class C7682ga extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C7682ga f26836d;

    /* renamed from: f */
    private static volatile C63010eb f26837f;

    /* renamed from: a */
    public int f26838a;

    /* renamed from: b */
    public int f26839b;

    /* renamed from: c */
    public C7684gc f26840c;

    /* renamed from: e */
    private byte f26841e = 2;

    static {
        C7682ga gaVar = new C7682ga();
        f26836d = gaVar;
        C62942bv.registerDefaultInstance(C7682ga.class, gaVar);
    }

    private C7682ga() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f26841e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f26841e = b;
                return null;
            case 2:
                return newMessageInfo(f26836d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ဌ\u0000\u0003ᐉ\u0002", new Object[]{"a", "b", C7679fy.f26656a, C45240c.f118157a});
            case 3:
                return new C7682ga();
            case 4:
                return new C7678fx();
            case 5:
                return f26836d;
            case 6:
                C63010eb ebVar = f26837f;
                if (ebVar == null) {
                    synchronized (C7682ga.class) {
                        ebVar = f26837f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26836d);
                            f26837f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
