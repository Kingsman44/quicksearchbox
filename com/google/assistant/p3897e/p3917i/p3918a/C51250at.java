package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.at */
/* compiled from: PG */
public final class C51250at extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51250at f133421d;

    /* renamed from: e */
    private static volatile C63010eb f133422e;

    /* renamed from: a */
    public int f133423a;

    /* renamed from: b */
    public C62971cq f133424b = emptyProtobufList();

    /* renamed from: c */
    public int f133425c;

    static {
        C51250at atVar = new C51250at();
        f133421d = atVar;
        C62942bv.registerDefaultInstance(C51250at.class, atVar);
    }

    private C51250at() {
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
                return newMessageInfo(f133421d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002င\u0000", new Object[]{"a", "b", C51248ar.class, C45240c.f118157a});
            case 3:
                return new C51250at();
            case 4:
                return new C51249as();
            case 5:
                return f133421d;
            case 6:
                C63010eb ebVar = f133422e;
                if (ebVar == null) {
                    synchronized (C51250at.class) {
                        ebVar = f133422e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133421d);
                            f133422e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
