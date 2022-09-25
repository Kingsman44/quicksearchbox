package com.google.assistant.p3994s.p3995a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4816ai.p4818b.C63204j;

/* renamed from: com.google.assistant.s.a.aw */
/* compiled from: PG */
public final class C53086aw extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53086aw f139110d;

    /* renamed from: f */
    private static volatile C63010eb f139111f;

    /* renamed from: a */
    public int f139112a;

    /* renamed from: b */
    public int f139113b;

    /* renamed from: c */
    public C63204j f139114c;

    /* renamed from: e */
    private byte f139115e = 2;

    static {
        C53086aw awVar = new C53086aw();
        f139110d = awVar;
        C62942bv.registerDefaultInstance(C53086aw.class, awVar);
    }

    private C53086aw() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139115e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f139115e = b;
                return null;
            case 2:
                return newMessageInfo(f139110d, "\u0001\u0002\u0000\u0001\u0007\b\u0002\u0000\u0000\u0001\u0007င\u0004\bᐉ\u0005", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C53086aw();
            case 4:
                return new C53085av();
            case 5:
                return f139110d;
            case 6:
                C63010eb ebVar = f139111f;
                if (ebVar == null) {
                    synchronized (C53086aw.class) {
                        ebVar = f139111f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139110d);
                            f139111f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
