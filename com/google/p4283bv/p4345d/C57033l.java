package com.google.p4283bv.p4345d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.d.l */
/* compiled from: PG */
public final class C57033l extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C57033l f152261f;

    /* renamed from: h */
    private static volatile C63010eb f152262h;

    /* renamed from: a */
    public int f152263a;

    /* renamed from: b */
    public C57041t f152264b;

    /* renamed from: c */
    public C57025d f152265c;

    /* renamed from: d */
    public C57035n f152266d;

    /* renamed from: e */
    public C57037p f152267e;

    /* renamed from: g */
    private byte f152268g = 2;

    static {
        C57033l lVar = new C57033l();
        f152261f = lVar;
        C62942bv.registerDefaultInstance(C57033l.class, lVar);
    }

    private C57033l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152268g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152268g = b;
                return null;
            case 2:
                return newMessageInfo(f152261f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C57033l();
            case 4:
                return new C57032k();
            case 5:
                return f152261f;
            case 6:
                C63010eb ebVar = f152262h;
                if (ebVar == null) {
                    synchronized (C57033l.class) {
                        ebVar = f152262h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152261f);
                            f152262h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
