package com.google.protos.p4874ap.p4875a.p4876a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p5129p.p5131b.C65768az;

/* renamed from: com.google.protos.ap.a.a.f */
/* compiled from: PG */
public final class C63667f extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C63667f f172151e;

    /* renamed from: f */
    public static final C62940bt f172152f;

    /* renamed from: g */
    private static volatile C63010eb f172153g;

    /* renamed from: a */
    public int f172154a;

    /* renamed from: b */
    public C63676o f172155b;

    /* renamed from: c */
    public C63682u f172156c;

    /* renamed from: d */
    public C63660aa f172157d;

    static {
        C63667f fVar = new C63667f();
        f172151e = fVar;
        C62942bv.registerDefaultInstance(C63667f.class, fVar);
        f172152f = C62942bv.newSingularGeneratedExtension(C65768az.f178793f, fVar, fVar, (C62958ce) null, 284070414, C63066gd.MESSAGE, C63667f.class);
    }

    private C63667f() {
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
                return newMessageInfo(f172151e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C63667f();
            case 4:
                return new C63666e();
            case 5:
                return f172151e;
            case 6:
                C63010eb ebVar = f172153g;
                if (ebVar == null) {
                    synchronized (C63667f.class) {
                        ebVar = f172153g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172151e);
                            f172153g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
