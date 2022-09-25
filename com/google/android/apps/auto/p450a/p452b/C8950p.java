package com.google.android.apps.auto.p450a.p452b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.auto.a.b.p */
/* compiled from: PG */
public final class C8950p extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C8950p f31020d;

    /* renamed from: f */
    private static volatile C63010eb f31021f;

    /* renamed from: a */
    public C8956v f31022a;

    /* renamed from: b */
    public C62971cq f31023b = emptyProtobufList();

    /* renamed from: c */
    public int f31024c;

    /* renamed from: e */
    private int f31025e;

    static {
        C8950p pVar = new C8950p();
        f31020d = pVar;
        C62942bv.registerDefaultInstance(C8950p.class, pVar);
    }

    private C8950p() {
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
                return newMessageInfo(f31020d, "\u0001\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0001\u0000\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"e", "a", "b", C8954t.class, C45240c.f118157a});
            case 3:
                return new C8950p();
            case 4:
                return new C8949o();
            case 5:
                return f31020d;
            case 6:
                C63010eb ebVar = f31021f;
                if (ebVar == null) {
                    synchronized (C8950p.class) {
                        ebVar = f31021f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31020d);
                            f31021f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
