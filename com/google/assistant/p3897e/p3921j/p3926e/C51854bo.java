package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.bo */
/* compiled from: PG */
public final class C51854bo extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51854bo f136022e;

    /* renamed from: f */
    private static volatile C63010eb f136023f;

    /* renamed from: a */
    public int f136024a;

    /* renamed from: b */
    public C62971cq f136025b = emptyProtobufList();

    /* renamed from: c */
    public boolean f136026c;

    /* renamed from: d */
    public long f136027d;

    static {
        C51854bo boVar = new C51854bo();
        f136022e = boVar;
        C62942bv.registerDefaultInstance(C51854bo.class, boVar);
    }

    private C51854bo() {
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
                return newMessageInfo(f136022e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000\u0003ဂ\u0001", new Object[]{"a", "b", C51853bn.class, C45240c.f118157a, "d"});
            case 3:
                return new C51854bo();
            case 4:
                return new C51851bl();
            case 5:
                return f136022e;
            case 6:
                C63010eb ebVar = f136023f;
                if (ebVar == null) {
                    synchronized (C51854bo.class) {
                        ebVar = f136023f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136022e);
                            f136023f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
