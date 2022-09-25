package com.google.android.libraries.search.p3055n;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.speech.p5218j.C67087ko;

/* renamed from: com.google.android.libraries.search.n.cm */
/* compiled from: PG */
public final class C39659cm extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C39659cm f104397e;

    /* renamed from: f */
    public static final C62940bt f104398f;

    /* renamed from: g */
    private static volatile C63010eb f104399g;

    /* renamed from: a */
    public int f104400a;

    /* renamed from: b */
    public int f104401b;

    /* renamed from: c */
    public C39647ca f104402c;

    /* renamed from: d */
    public C39661co f104403d;

    static {
        C39659cm cmVar = new C39659cm();
        f104397e = cmVar;
        C62942bv.registerDefaultInstance(C39659cm.class, cmVar);
        f104398f = C62942bv.newSingularGeneratedExtension(C67087ko.f182366n, cmVar, cmVar, (C62958ce) null, 413019263, C63066gd.MESSAGE, C39659cm.class);
    }

    private C39659cm() {
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
                return newMessageInfo(f104397e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C39658cl.m69122b(), C45240c.f118157a, "d"});
            case 3:
                return new C39659cm();
            case 4:
                return new C39656cj();
            case 5:
                return f104397e;
            case 6:
                C63010eb ebVar = f104399g;
                if (ebVar == null) {
                    synchronized (C39659cm.class) {
                        ebVar = f104399g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f104397e);
                            f104399g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
