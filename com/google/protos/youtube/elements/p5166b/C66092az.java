package com.google.protos.youtube.elements.p5166b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.b.az */
/* compiled from: PG */
public final class C66092az extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66092az f179718d;

    /* renamed from: f */
    private static volatile C63010eb f179719f;

    /* renamed from: a */
    public int f179720a;

    /* renamed from: b */
    public C66086at f179721b;

    /* renamed from: c */
    public C66105j f179722c;

    /* renamed from: e */
    private byte f179723e = 2;

    static {
        C66092az azVar = new C66092az();
        f179718d = azVar;
        C62942bv.registerDefaultInstance(C66092az.class, azVar);
    }

    private C66092az() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179723e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f179723e = b;
                return null;
            case 2:
                return newMessageInfo(f179718d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66092az();
            case 4:
                return new C66091ay();
            case 5:
                return f179718d;
            case 6:
                C63010eb ebVar = f179719f;
                if (ebVar == null) {
                    synchronized (C66092az.class) {
                        ebVar = f179719f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179718d);
                            f179719f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
