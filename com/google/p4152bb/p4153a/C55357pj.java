package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.pj */
/* compiled from: PG */
public final class C55357pj extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55357pj f145860a;

    /* renamed from: b */
    public static final C62940bt f145861b;

    /* renamed from: c */
    private static volatile C63010eb f145862c;

    static {
        C55357pj pjVar = new C55357pj();
        f145860a = pjVar;
        C62942bv.registerDefaultInstance(C55357pj.class, pjVar);
        f145861b = C62942bv.newSingularGeneratedExtension(C55361pn.f145866g, pjVar, pjVar, (C62958ce) null, 127429619, C63066gd.MESSAGE, C55357pj.class);
    }

    private C55357pj() {
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
                return newMessageInfo(f145860a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C55357pj();
            case 4:
                return new C55356pi();
            case 5:
                return f145860a;
            case 6:
                C63010eb ebVar = f145862c;
                if (ebVar == null) {
                    synchronized (C55357pj.class) {
                        ebVar = f145862c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145860a);
                            f145862c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
