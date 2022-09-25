package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.oh */
/* compiled from: PG */
public final class C55328oh extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C55328oh f145764b;

    /* renamed from: c */
    public static final C62940bt f145765c;

    /* renamed from: e */
    private static volatile C63010eb f145766e;

    /* renamed from: a */
    public C55327og f145767a;

    /* renamed from: d */
    private int f145768d;

    static {
        C55328oh ohVar = new C55328oh();
        f145764b = ohVar;
        C62942bv.registerDefaultInstance(C55328oh.class, ohVar);
        f145765c = C62942bv.newSingularGeneratedExtension(C55330oj.f145769e, ohVar, ohVar, (C62958ce) null, 104880547, C63066gd.MESSAGE, C55328oh.class);
    }

    private C55328oh() {
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
                return newMessageInfo(f145764b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C55328oh();
            case 4:
                return new C55325oe();
            case 5:
                return f145764b;
            case 6:
                C63010eb ebVar = f145766e;
                if (ebVar == null) {
                    synchronized (C55328oh.class) {
                        ebVar = f145766e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145764b);
                            f145766e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
