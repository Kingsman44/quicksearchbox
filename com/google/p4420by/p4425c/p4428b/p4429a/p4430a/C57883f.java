package com.google.p4420by.p4425c.p4428b.p4429a.p4430a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.by.c.b.a.a.f */
/* compiled from: PG */
public final class C57883f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57883f f154839d;

    /* renamed from: e */
    private static volatile C63010eb f154840e;

    /* renamed from: a */
    public int f154841a;

    /* renamed from: b */
    public int f154842b;

    /* renamed from: c */
    public C62971cq f154843c = emptyProtobufList();

    static {
        C57883f fVar = new C57883f();
        f154839d = fVar;
        C62942bv.registerDefaultInstance(C57883f.class, fVar);
    }

    private C57883f() {
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
                return newMessageInfo(f154839d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001င\u0000\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, C57882e.class});
            case 3:
                return new C57883f();
            case 4:
                return new C57874a();
            case 5:
                return f154839d;
            case 6:
                C63010eb ebVar = f154840e;
                if (ebVar == null) {
                    synchronized (C57883f.class) {
                        ebVar = f154840e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154839d);
                            f154840e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
