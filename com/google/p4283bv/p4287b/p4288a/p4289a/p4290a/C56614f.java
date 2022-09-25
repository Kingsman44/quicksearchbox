package com.google.p4283bv.p4287b.p4288a.p4289a.p4290a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.a.f */
/* compiled from: PG */
public final class C56614f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56614f f151160b;

    /* renamed from: c */
    private static volatile C63010eb f151161c;

    /* renamed from: a */
    public C62971cq f151162a = emptyProtobufList();

    static {
        C56614f fVar = new C56614f();
        f151160b = fVar;
        C62942bv.registerDefaultInstance(C56614f.class, fVar);
    }

    private C56614f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f151160b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C56610b.class});
            case 3:
                return new C56614f();
            case 4:
                return new C56613e();
            case 5:
                return f151160b;
            case 6:
                C63010eb ebVar = f151161c;
                if (ebVar == null) {
                    synchronized (C56614f.class) {
                        ebVar = f151161c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151160b);
                            f151161c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
