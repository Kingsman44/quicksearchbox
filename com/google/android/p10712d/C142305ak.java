package com.google.android.p10712d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.d.ak */
/* compiled from: PG */
public final class C142305ak extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C142305ak f386065d;

    /* renamed from: f */
    private static volatile C63010eb f386066f;

    /* renamed from: a */
    public int f386067a;

    /* renamed from: b */
    public int f386068b;

    /* renamed from: c */
    public C63088z f386069c = C63088z.f170246b;

    /* renamed from: e */
    private byte f386070e = 2;

    static {
        C142305ak akVar = new C142305ak();
        f386065d = akVar;
        C62942bv.registerDefaultInstance(C142305ak.class, akVar);
    }

    private C142305ak() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f386070e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f386070e = b;
                return null;
            case 2:
                return newMessageInfo(f386065d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔌ\u0000\u0002ည\u0001", new Object[]{"a", "b", C142303ai.f386064a, C45240c.f118157a});
            case 3:
                return new C142305ak();
            case 4:
                return new C142304aj();
            case 5:
                return f386065d;
            case 6:
                C63010eb ebVar = f386066f;
                if (ebVar == null) {
                    synchronized (C142305ak.class) {
                        ebVar = f386066f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386065d);
                            f386066f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
