package com.google.research.p5181a.p5182a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.research.a.a.i */
/* compiled from: PG */
public final class C66286i extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C66286i f180264e;

    /* renamed from: f */
    private static volatile C63010eb f180265f;

    /* renamed from: a */
    public int f180266a;

    /* renamed from: b */
    public long f180267b;

    /* renamed from: c */
    public int f180268c;

    /* renamed from: d */
    public C62971cq f180269d = emptyProtobufList();

    static {
        C66286i iVar = new C66286i();
        f180264e = iVar;
        C62942bv.registerDefaultInstance(C66286i.class, iVar);
    }

    private C66286i() {
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
                return newMessageInfo(f180264e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0004\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", C66290m.class});
            case 3:
                return new C66286i();
            case 4:
                return new C66285h();
            case 5:
                return f180264e;
            case 6:
                C63010eb ebVar = f180265f;
                if (ebVar == null) {
                    synchronized (C66286i.class) {
                        ebVar = f180265f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180264e);
                            f180265f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
