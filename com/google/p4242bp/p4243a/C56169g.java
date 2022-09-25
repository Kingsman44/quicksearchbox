package com.google.p4242bp.p4243a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p381aj.p382a.p383a.p384a.C8242v;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.a.g */
/* compiled from: PG */
public final class C56169g extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56169g f149653a;

    /* renamed from: f */
    private static volatile C63010eb f149654f;

    /* renamed from: b */
    private int f149655b;

    /* renamed from: c */
    private C8242v f149656c;

    /* renamed from: d */
    private C56168f f149657d;

    /* renamed from: e */
    private byte f149658e = 2;

    static {
        C56169g gVar = new C56169g();
        f149653a = gVar;
        C62942bv.registerDefaultInstance(C56169g.class, gVar);
    }

    private C56169g() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f149658e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f149658e = b;
                return null;
            case 2:
                return newMessageInfo(f149653a, "\u0001\u0002\u0000\u0001\u0006\u0007\u0002\u0000\u0000\u0002\u0006ᐉ\u0007\u0007ᐉ\b", new Object[]{"b", C45240c.f118157a, "d"});
            case 3:
                return new C56169g();
            case 4:
                return new C56160d();
            case 5:
                return f149653a;
            case 6:
                C63010eb ebVar = f149654f;
                if (ebVar == null) {
                    synchronized (C56169g.class) {
                        ebVar = f149654f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149653a);
                            f149654f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
