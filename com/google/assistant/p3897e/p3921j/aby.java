package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.j.aby */
/* compiled from: PG */
public final class aby extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final aby f134781d;

    /* renamed from: e */
    private static volatile C63010eb f134782e;

    /* renamed from: a */
    public int f134783a;

    /* renamed from: b */
    public C63088z f134784b = C63088z.f170246b;

    /* renamed from: c */
    public C62971cq f134785c = C62942bv.emptyProtobufList();

    static {
        aby aby = new aby();
        f134781d = aby;
        C62942bv.registerDefaultInstance(aby.class, aby);
    }

    private aby() {
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
                return newMessageInfo(f134781d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ည\u0000\u0002\u001a", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new aby();
            case 4:
                return new abx();
            case 5:
                return f134781d;
            case 6:
                C63010eb ebVar = f134782e;
                if (ebVar == null) {
                    synchronized (aby.class) {
                        ebVar = f134782e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134781d);
                            f134782e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
