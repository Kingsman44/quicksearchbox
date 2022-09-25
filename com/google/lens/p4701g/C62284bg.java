package com.google.lens.p4701g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.bg */
/* compiled from: PG */
public final class C62284bg extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62284bg f168146e;

    /* renamed from: g */
    private static volatile C63010eb f168147g;

    /* renamed from: a */
    public int f168148a;

    /* renamed from: b */
    public int f168149b = 0;

    /* renamed from: c */
    public Object f168150c;

    /* renamed from: d */
    public int f168151d;

    /* renamed from: f */
    private byte f168152f = 2;

    static {
        C62284bg bgVar = new C62284bg();
        f168146e = bgVar;
        C62942bv.registerDefaultInstance(C62284bg.class, bgVar);
    }

    private C62284bg() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f168152f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f168152f = b;
                return null;
            case 2:
                return newMessageInfo(f168146e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဌ\u0000\u0002ြ\u0000\u0003ᐼ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C62283bf.f168145a, C62290bm.class, C62288bk.class});
            case 3:
                return new C62284bg();
            case 4:
                return new C62282be();
            case 5:
                return f168146e;
            case 6:
                C63010eb ebVar = f168147g;
                if (ebVar == null) {
                    synchronized (C62284bg.class) {
                        ebVar = f168147g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168146e);
                            f168147g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
