package com.google.protos.p4883as.p4885b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4129b.p4136c.p4137a.C54745b;
import com.google.p4129b.p4136c.p4138b.C54750b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.as.b.f */
/* compiled from: PG */
public final class C63785f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63785f f172542a;

    /* renamed from: e */
    private static volatile C63010eb f172543e;

    /* renamed from: b */
    private int f172544b;

    /* renamed from: c */
    private C54750b f172545c;

    /* renamed from: d */
    private C54745b f172546d;

    static {
        C63785f fVar = new C63785f();
        f172542a = fVar;
        C62942bv.registerDefaultInstance(C63785f.class, fVar);
    }

    private C63785f() {
        emptyProtobufList();
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
                return newMessageInfo(f172542a, "\u0001\u0002\u0000\u0001\u0005\u0007\u0002\u0000\u0000\u0000\u0005ဉ\u0004\u0007ဉ\u0006", new Object[]{"b", C45240c.f118157a, "d"});
            case 3:
                return new C63785f();
            case 4:
                return new C63784e();
            case 5:
                return f172542a;
            case 6:
                C63010eb ebVar = f172543e;
                if (ebVar == null) {
                    synchronized (C63785f.class) {
                        ebVar = f172543e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172542a);
                            f172543e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
