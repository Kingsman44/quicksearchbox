package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.hq */
/* compiled from: PG */
public final class C50021hq extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50021hq f130044d;

    /* renamed from: e */
    private static volatile C63010eb f130045e;

    /* renamed from: a */
    public int f130046a;

    /* renamed from: b */
    public C50466yc f130047b;

    /* renamed from: c */
    public C50020hp f130048c;

    static {
        C50021hq hqVar = new C50021hq();
        f130044d = hqVar;
        C62942bv.registerDefaultInstance(C50021hq.class, hqVar);
    }

    private C50021hq() {
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
                return newMessageInfo(f130044d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C50021hq();
            case 4:
                return new C50018hn();
            case 5:
                return f130044d;
            case 6:
                C63010eb ebVar = f130045e;
                if (ebVar == null) {
                    synchronized (C50021hq.class) {
                        ebVar = f130045e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130044d);
                            f130045e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
