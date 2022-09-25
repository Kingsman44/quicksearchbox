package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.oi */
/* compiled from: PG */
public final class C7906oi extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C7906oi f27781d;

    /* renamed from: e */
    private static volatile C63010eb f27782e;

    /* renamed from: a */
    public int f27783a;

    /* renamed from: b */
    public C7805kp f27784b;

    /* renamed from: c */
    public C62971cq f27785c = emptyProtobufList();

    static {
        C7906oi oiVar = new C7906oi();
        f27781d = oiVar;
        C62942bv.registerDefaultInstance(C7906oi.class, oiVar);
    }

    private C7906oi() {
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
                return newMessageInfo(f27781d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"a", "b", C45240c.f118157a, C7805kp.class});
            case 3:
                return new C7906oi();
            case 4:
                return new C7905oh();
            case 5:
                return f27781d;
            case 6:
                C63010eb ebVar = f27782e;
                if (ebVar == null) {
                    synchronized (C7906oi.class) {
                        ebVar = f27782e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27781d);
                            f27782e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
