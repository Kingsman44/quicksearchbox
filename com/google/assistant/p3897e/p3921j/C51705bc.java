package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.bc */
/* compiled from: PG */
public final class C51705bc extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51705bc f135639e;

    /* renamed from: f */
    private static volatile C63010eb f135640f;

    /* renamed from: a */
    public int f135641a;

    /* renamed from: b */
    public int f135642b = 1;

    /* renamed from: c */
    public int f135643c = 1;

    /* renamed from: d */
    public C51800dp f135644d;

    static {
        C51705bc bcVar = new C51705bc();
        f135639e = bcVar;
        C62942bv.registerDefaultInstance(C51705bc.class, bcVar);
    }

    private C51705bc() {
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
                return newMessageInfo(f135639e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C51707be.m86367b(), C45240c.f118157a, C51697ay.m86364b(), "d"});
            case 3:
                return new C51705bc();
            case 4:
                return new C51704bb();
            case 5:
                return f135639e;
            case 6:
                C63010eb ebVar = f135640f;
                if (ebVar == null) {
                    synchronized (C51705bc.class) {
                        ebVar = f135640f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135639e);
                            f135640f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
