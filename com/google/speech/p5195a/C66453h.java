package com.google.speech.p5195a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.a.h */
/* compiled from: PG */
public final class C66453h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66453h f180692b;

    /* renamed from: f */
    private static volatile C63010eb f180693f;

    /* renamed from: a */
    public C62971cq f180694a = emptyProtobufList();

    /* renamed from: c */
    private int f180695c;

    /* renamed from: d */
    private int f180696d;

    /* renamed from: e */
    private byte f180697e = 2;

    static {
        C66453h hVar = new C66453h();
        f180692b = hVar;
        C62942bv.registerDefaultInstance(C66453h.class, hVar);
    }

    private C66453h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f180697e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f180697e = b;
                return null;
            case 2:
                return newMessageInfo(f180692b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001Л\u0002ᔄ\u0000", new Object[]{C45240c.f118157a, "a", C66451f.class, "d"});
            case 3:
                return new C66453h();
            case 4:
                return new C66452g();
            case 5:
                return f180692b;
            case 6:
                C63010eb ebVar = f180693f;
                if (ebVar == null) {
                    synchronized (C66453h.class) {
                        ebVar = f180693f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180692b);
                            f180693f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
