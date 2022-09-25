package com.google.assistant.p3781ad.p3789d.p3791b.p3792a;

import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.a.f */
/* compiled from: PG */
public final class C48645f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48645f f125726c;

    /* renamed from: d */
    private static volatile C63010eb f125727d;

    /* renamed from: a */
    public C62971cq f125728a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f125729b = C62942bv.emptyProtobufList();

    static {
        C48645f fVar = new C48645f();
        f125726c = fVar;
        C62942bv.registerDefaultInstance(C48645f.class, fVar);
    }

    private C48645f() {
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
                return newMessageInfo(f125726c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002Ț", new Object[]{"a", C49301bt.class, "b"});
            case 3:
                return new C48645f();
            case 4:
                return new C48644e();
            case 5:
                return f125726c;
            case 6:
                C63010eb ebVar = f125727d;
                if (ebVar == null) {
                    synchronized (C48645f.class) {
                        ebVar = f125727d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125726c);
                            f125727d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
