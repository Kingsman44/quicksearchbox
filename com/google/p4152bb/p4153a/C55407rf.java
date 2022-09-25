package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.rf */
/* compiled from: PG */
public final class C55407rf extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C55407rf f145996b;

    /* renamed from: c */
    public static final C62940bt f145997c;

    /* renamed from: e */
    private static volatile C63010eb f145998e;

    /* renamed from: a */
    public boolean f145999a;

    /* renamed from: d */
    private int f146000d;

    static {
        C55407rf rfVar = new C55407rf();
        f145996b = rfVar;
        C62942bv.registerDefaultInstance(C55407rf.class, rfVar);
        f145997c = C62942bv.newSingularGeneratedExtension(C55415rn.f146023d, rfVar, rfVar, (C62958ce) null, 86527882, C63066gd.MESSAGE, C55407rf.class);
    }

    private C55407rf() {
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
                return newMessageInfo(f145996b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဇ\u0001", new Object[]{"d", "a"});
            case 3:
                return new C55407rf();
            case 4:
                return new C55406re();
            case 5:
                return f145996b;
            case 6:
                C63010eb ebVar = f145998e;
                if (ebVar == null) {
                    synchronized (C55407rf.class) {
                        ebVar = f145998e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145996b);
                            f145998e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
