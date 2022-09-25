package com.google.android.apps.gsa.staticplugins.p7678cl.p7680b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.cl.b.ba */
/* compiled from: PG */
public final class C97902ba extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C97902ba f273351e;

    /* renamed from: f */
    private static volatile C63010eb f273352f;

    /* renamed from: a */
    public int f273353a;

    /* renamed from: b */
    public C62971cq f273354b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f273355c = emptyProtobufList();

    /* renamed from: d */
    public long f273356d;

    static {
        C97902ba baVar = new C97902ba();
        f273351e = baVar;
        C62942bv.registerDefaultInstance(C97902ba.class, baVar);
    }

    private C97902ba() {
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
                return newMessageInfo(f273351e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဂ\u0000", new Object[]{"a", "b", C97881ag.class, C45240c.f118157a, C97899ay.class, "d"});
            case 3:
                return new C97902ba();
            case 4:
                return new C97900az();
            case 5:
                return f273351e;
            case 6:
                C63010eb ebVar = f273352f;
                if (ebVar == null) {
                    synchronized (C97902ba.class) {
                        ebVar = f273352f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f273351e);
                            f273352f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
