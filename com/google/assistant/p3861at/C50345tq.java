package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.tq */
/* compiled from: PG */
public final class C50345tq extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50345tq f131022d;

    /* renamed from: e */
    private static volatile C63010eb f131023e;

    /* renamed from: a */
    public int f131024a;

    /* renamed from: b */
    public int f131025b;

    /* renamed from: c */
    public C62971cq f131026c = emptyProtobufList();

    static {
        C50345tq tqVar = new C50345tq();
        f131022d = tqVar;
        C62942bv.registerDefaultInstance(C50345tq.class, tqVar);
    }

    private C50345tq() {
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
                return newMessageInfo(f131022d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u001b", new Object[]{"a", "b", C45240c.f118157a, ado.class});
            case 3:
                return new C50345tq();
            case 4:
                return new C50344tp();
            case 5:
                return f131022d;
            case 6:
                C63010eb ebVar = f131023e;
                if (ebVar == null) {
                    synchronized (C50345tq.class) {
                        ebVar = f131023e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131022d);
                            f131023e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
