package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.mz */
/* compiled from: PG */
public final class C55292mz extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C55292mz f145643e;

    /* renamed from: f */
    public static final C62940bt f145644f;

    /* renamed from: g */
    private static volatile C63010eb f145645g;

    /* renamed from: a */
    public int f145646a;

    /* renamed from: b */
    public long f145647b;

    /* renamed from: c */
    public int f145648c;

    /* renamed from: d */
    public C55198jm f145649d;

    static {
        C55292mz mzVar = new C55292mz();
        f145643e = mzVar;
        C62942bv.registerDefaultInstance(C55292mz.class, mzVar);
        f145644f = C62942bv.newSingularGeneratedExtension(C55213ka.f145356g, mzVar, mzVar, (C62958ce) null, 64989506, C63066gd.MESSAGE, C55292mz.class);
    }

    private C55292mz() {
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
                return newMessageInfo(f145643e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001\u0005ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C55292mz();
            case 4:
                return new C55291my();
            case 5:
                return f145643e;
            case 6:
                C63010eb ebVar = f145645g;
                if (ebVar == null) {
                    synchronized (C55292mz.class) {
                        ebVar = f145645g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145643e);
                            f145645g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
