package com.google.p4129b.p4130a.p4131a.p4132a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.b.a.a.a.z */
/* compiled from: PG */
public final class C54740z extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C54740z f143647e;

    /* renamed from: f */
    private static volatile C63010eb f143648f;

    /* renamed from: a */
    public long f143649a;

    /* renamed from: b */
    public C54678av f143650b;

    /* renamed from: c */
    public C54664ah f143651c;

    /* renamed from: d */
    public C63088z f143652d = C63088z.f170246b;

    static {
        C54740z zVar = new C54740z();
        f143647e = zVar;
        C62942bv.registerDefaultInstance(C54740z.class, zVar);
    }

    private C54740z() {
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
                return newMessageInfo(f143647e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002\t\u0003\t\u0004\n", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C54740z();
            case 4:
                return new C54739y();
            case 5:
                return f143647e;
            case 6:
                C63010eb ebVar = f143648f;
                if (ebVar == null) {
                    synchronized (C54740z.class) {
                        ebVar = f143648f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143647e);
                            f143648f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
