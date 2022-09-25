package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.cw */
/* compiled from: PG */
public final class C14266cw extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C14266cw f43156f;

    /* renamed from: g */
    private static volatile C63010eb f43157g;

    /* renamed from: a */
    public boolean f43158a;

    /* renamed from: b */
    public boolean f43159b;

    /* renamed from: c */
    public boolean f43160c;

    /* renamed from: d */
    public boolean f43161d;

    /* renamed from: e */
    public C62971cq f43162e = emptyProtobufList();

    static {
        C14266cw cwVar = new C14266cw();
        f43156f = cwVar;
        C62942bv.registerDefaultInstance(C14266cw.class, cwVar);
    }

    private C14266cw() {
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
                return newMessageInfo(f43156f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u001b\u0005\u0007", new Object[]{"a", "b", C45240c.f118157a, "e", C14265cv.class, "d"});
            case 3:
                return new C14266cw();
            case 4:
                return new C14263ct();
            case 5:
                return f43156f;
            case 6:
                C63010eb ebVar = f43157g;
                if (ebVar == null) {
                    synchronized (C14266cw.class) {
                        ebVar = f43157g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43156f);
                            f43157g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
