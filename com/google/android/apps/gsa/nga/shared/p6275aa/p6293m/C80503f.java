package com.google.android.apps.gsa.nga.shared.p6275aa.p6293m;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.m.f */
/* compiled from: PG */
public final class C80503f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C80503f f220995d;

    /* renamed from: e */
    private static volatile C63010eb f220996e;

    /* renamed from: a */
    public int f220997a;

    /* renamed from: b */
    public C51805du f220998b;

    /* renamed from: c */
    public C80502e f220999c;

    static {
        C80503f fVar = new C80503f();
        f220995d = fVar;
        C62942bv.registerDefaultInstance(C80503f.class, fVar);
    }

    private C80503f() {
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
                return newMessageInfo(f220995d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C80503f();
            case 4:
                return new C80492a();
            case 5:
                return f220995d;
            case 6:
                C63010eb ebVar = f220996e;
                if (ebVar == null) {
                    synchronized (C80503f.class) {
                        ebVar = f220996e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220995d);
                            f220996e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
