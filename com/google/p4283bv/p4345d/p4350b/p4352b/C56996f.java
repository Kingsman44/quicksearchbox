package com.google.p4283bv.p4345d.p4350b.p4352b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.d.b.b.f */
/* compiled from: PG */
public final class C56996f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C56996f f152143d;

    /* renamed from: f */
    private static volatile C63010eb f152144f;

    /* renamed from: a */
    public int f152145a;

    /* renamed from: b */
    public C62971cq f152146b = emptyProtobufList();

    /* renamed from: c */
    public C56998h f152147c;

    /* renamed from: e */
    private int f152148e;

    static {
        C56996f fVar = new C56996f();
        f152143d = fVar;
        C62942bv.registerDefaultInstance(C56996f.class, fVar);
    }

    private C56996f() {
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
                return newMessageInfo(f152143d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0004ဉ\u0001", new Object[]{"e", "a", C56995e.m88251b(), "b", C56996f.class, C45240c.f118157a});
            case 3:
                return new C56996f();
            case 4:
                return new C56993c();
            case 5:
                return f152143d;
            case 6:
                C63010eb ebVar = f152144f;
                if (ebVar == null) {
                    synchronized (C56996f.class) {
                        ebVar = f152144f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152143d);
                            f152144f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
