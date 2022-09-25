package com.google.p4242bp.p4243a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p381aj.p382a.p383a.p384a.C8242v;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.a.f */
/* compiled from: PG */
public final class C56168f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56168f f149648a;

    /* renamed from: e */
    private static volatile C63010eb f149649e;

    /* renamed from: b */
    private int f149650b;

    /* renamed from: c */
    private C8242v f149651c;

    /* renamed from: d */
    private byte f149652d = 2;

    static {
        C56168f fVar = new C56168f();
        f149648a = fVar;
        C62942bv.registerDefaultInstance(C56168f.class, fVar);
    }

    private C56168f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f149652d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f149652d = b;
                return null;
            case 2:
                return newMessageInfo(f149648a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C56168f();
            case 4:
                return new C56167e();
            case 5:
                return f149648a;
            case 6:
                C63010eb ebVar = f149649e;
                if (ebVar == null) {
                    synchronized (C56168f.class) {
                        ebVar = f149649e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149648a);
                            f149649e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
