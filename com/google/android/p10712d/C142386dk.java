package com.google.android.p10712d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.dk */
/* compiled from: PG */
public final class C142386dk extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C142386dk f386370c;

    /* renamed from: e */
    private static volatile C63010eb f386371e;

    /* renamed from: a */
    public int f386372a;

    /* renamed from: b */
    public int f386373b;

    /* renamed from: d */
    private byte f386374d = 2;

    static {
        C142386dk dkVar = new C142386dk();
        f386370c = dkVar;
        C62942bv.registerDefaultInstance(C142386dk.class, dkVar);
    }

    private C142386dk() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f386374d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f386374d = b;
                return null;
            case 2:
                return newMessageInfo(f386370c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔌ\u0000", new Object[]{"a", "b", C142385dj.f386369a});
            case 3:
                return new C142386dk();
            case 4:
                return new C142384di();
            case 5:
                return f386370c;
            case 6:
                C63010eb ebVar = f386371e;
                if (ebVar == null) {
                    synchronized (C142386dk.class) {
                        ebVar = f386371e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386370c);
                            f386371e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
