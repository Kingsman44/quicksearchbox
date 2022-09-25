package com.google.assistant.p3994s.p3995a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.nj */
/* compiled from: PG */
public final class C53424nj extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53424nj f140199d;

    /* renamed from: f */
    private static volatile C63010eb f140200f;

    /* renamed from: a */
    public int f140201a;

    /* renamed from: b */
    public int f140202b;

    /* renamed from: c */
    public C51012dc f140203c;

    /* renamed from: e */
    private byte f140204e = 2;

    static {
        C53424nj njVar = new C53424nj();
        f140199d = njVar;
        C62942bv.registerDefaultInstance(C53424nj.class, njVar);
    }

    private C53424nj() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140204e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f140204e = b;
                return null;
            case 2:
                return newMessageInfo(f140199d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0001\u0003င\u0000\u0004ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C53424nj();
            case 4:
                return new C53423ni();
            case 5:
                return f140199d;
            case 6:
                C63010eb ebVar = f140200f;
                if (ebVar == null) {
                    synchronized (C53424nj.class) {
                        ebVar = f140200f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140199d);
                            f140200f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
