package com.google.lens.p4701g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4172bg.p4174b.C55721j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.cj */
/* compiled from: PG */
public final class C62314cj extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C62314cj f168217f;

    /* renamed from: h */
    private static volatile C63010eb f168218h;

    /* renamed from: a */
    public int f168219a;

    /* renamed from: b */
    public int f168220b;

    /* renamed from: c */
    public int f168221c;

    /* renamed from: d */
    public C62971cq f168222d = emptyProtobufList();

    /* renamed from: e */
    public float f168223e;

    /* renamed from: g */
    private byte f168224g = 2;

    static {
        C62314cj cjVar = new C62314cj();
        f168217f = cjVar;
        C62942bv.registerDefaultInstance(C62314cj.class, cjVar);
    }

    private C62314cj() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f168224g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f168224g = b;
                return null;
            case 2:
                return newMessageInfo(f168217f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001င\u0000\u0002င\u0001\u0003Л\u0004ခ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", C55721j.class, "e"});
            case 3:
                return new C62314cj();
            case 4:
                return new C62313ci();
            case 5:
                return f168217f;
            case 6:
                C63010eb ebVar = f168218h;
                if (ebVar == null) {
                    synchronized (C62314cj.class) {
                        ebVar = f168218h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168217f);
                            f168218h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
