package com.google.android.apps.gsa.search.core.state.p6875g;

import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88433bd;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.search.core.state.g.f */
/* compiled from: PG */
public final class C87071f extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C87071f f235263f;

    /* renamed from: g */
    public static final C62940bt f235264g;

    /* renamed from: h */
    private static volatile C63010eb f235265h;

    /* renamed from: a */
    public int f235266a;

    /* renamed from: b */
    public C63088z f235267b = C63088z.f170246b;

    /* renamed from: c */
    public int f235268c;

    /* renamed from: d */
    public boolean f235269d;

    /* renamed from: e */
    public long f235270e;

    static {
        C87071f fVar = new C87071f();
        f235263f = fVar;
        C62942bv.registerDefaultInstance(C87071f.class, fVar);
        f235264g = C62942bv.newSingularGeneratedExtension(C88433bd.f239087e, fVar, fVar, (C62958ce) null, 132264001, C63066gd.MESSAGE, C87071f.class);
    }

    private C87071f() {
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
                return newMessageInfo(f235263f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ဍ\u0001\u0003ဇ\u0002\u0004ဎ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C87071f();
            case 4:
                return new C87070e();
            case 5:
                return f235263f;
            case 6:
                C63010eb ebVar = f235265h;
                if (ebVar == null) {
                    synchronized (C87071f.class) {
                        ebVar = f235265h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f235263f);
                            f235265h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
