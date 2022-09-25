package com.google.knowledge.p4661a.p4662a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.knowledge.a.a.r */
/* compiled from: PG */
public final class C61756r extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C61756r f166819a;

    /* renamed from: e */
    private static volatile C63010eb f166820e;

    /* renamed from: b */
    private int f166821b;

    /* renamed from: c */
    private C61748j f166822c;

    /* renamed from: d */
    private byte f166823d = 2;

    static {
        C61756r rVar = new C61756r();
        f166819a = rVar;
        C62942bv.registerDefaultInstance(C61756r.class, rVar);
    }

    private C61756r() {
        C63088z zVar = C63088z.f170246b;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f166823d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f166823d = b;
                return null;
            case 2:
                return newMessageInfo(f166819a, "\u0001\u0001\u0000\u0001ee\u0001\u0000\u0000\u0001eᐉ\u0001", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C61756r();
            case 4:
                return new C61755q();
            case 5:
                return f166819a;
            case 6:
                C63010eb ebVar = f166820e;
                if (ebVar == null) {
                    synchronized (C61756r.class) {
                        ebVar = f166820e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166819a);
                            f166820e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
