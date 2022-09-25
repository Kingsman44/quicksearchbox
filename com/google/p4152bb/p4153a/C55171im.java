package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.im */
/* compiled from: PG */
public final class C55171im extends C62937bq implements C62938br {

    /* renamed from: b */
    public static final C55171im f145242b;

    /* renamed from: e */
    private static volatile C63010eb f145243e;

    /* renamed from: a */
    public int f145244a;

    /* renamed from: c */
    private int f145245c;

    /* renamed from: d */
    private byte f145246d = 2;

    static {
        C55171im imVar = new C55171im();
        f145242b = imVar;
        C62942bv.registerDefaultInstance(C55171im.class, imVar);
    }

    private C55171im() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145246d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145246d = b;
                return null;
            case 2:
                return newMessageInfo(f145242b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဌ\u0001", new Object[]{C45240c.f118157a, "a", C55169ik.f145241a});
            case 3:
                return new C55171im();
            case 4:
                return new C55168ij();
            case 5:
                return f145242b;
            case 6:
                C63010eb ebVar = f145243e;
                if (ebVar == null) {
                    synchronized (C55171im.class) {
                        ebVar = f145243e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145242b);
                            f145243e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
