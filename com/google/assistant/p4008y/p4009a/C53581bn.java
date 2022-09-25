package com.google.assistant.p4008y.p4009a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.a.bn */
/* compiled from: PG */
public final class C53581bn extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53581bn f140630d;

    /* renamed from: e */
    private static volatile C63010eb f140631e;

    /* renamed from: a */
    public int f140632a;

    /* renamed from: b */
    public int f140633b;

    /* renamed from: c */
    public C62971cq f140634c = emptyProtobufList();

    static {
        C53581bn bnVar = new C53581bn();
        f140630d = bnVar;
        C62942bv.registerDefaultInstance(C53581bn.class, bnVar);
    }

    private C53581bn() {
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
                return newMessageInfo(f140630d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"a", "b", C53577bj.m86875b(), C45240c.f118157a, C53575bh.class});
            case 3:
                return new C53581bn();
            case 4:
                return new C53580bm();
            case 5:
                return f140630d;
            case 6:
                C63010eb ebVar = f140631e;
                if (ebVar == null) {
                    synchronized (C53581bn.class) {
                        ebVar = f140631e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140630d);
                            f140631e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
