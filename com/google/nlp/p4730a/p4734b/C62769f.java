package com.google.nlp.p4730a.p4734b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4794ae.p4795a.p4797b.C63150b;

/* renamed from: com.google.nlp.a.b.f */
/* compiled from: PG */
public final class C62769f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62769f f169509a;

    /* renamed from: e */
    private static volatile C63010eb f169510e;

    /* renamed from: b */
    private int f169511b;

    /* renamed from: c */
    private C63150b f169512c;

    /* renamed from: d */
    private byte f169513d = 2;

    static {
        C62769f fVar = new C62769f();
        f169509a = fVar;
        C62942bv.registerDefaultInstance(C62769f.class, fVar);
    }

    private C62769f() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f169513d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f169513d = b;
                return null;
            case 2:
                return newMessageInfo(f169509a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C62769f();
            case 4:
                return new C62768e();
            case 5:
                return f169509a;
            case 6:
                C63010eb ebVar = f169510e;
                if (ebVar == null) {
                    synchronized (C62769f.class) {
                        ebVar = f169510e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169509a);
                            f169510e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
