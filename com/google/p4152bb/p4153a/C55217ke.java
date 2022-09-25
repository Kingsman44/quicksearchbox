package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.ke */
/* compiled from: PG */
public final class C55217ke extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55217ke f145370a;

    /* renamed from: b */
    public static final C62940bt f145371b;

    /* renamed from: c */
    private static volatile C63010eb f145372c;

    static {
        C55217ke keVar = new C55217ke();
        f145370a = keVar;
        C62942bv.registerDefaultInstance(C55217ke.class, keVar);
        f145371b = C62942bv.newSingularGeneratedExtension(C55240la.f145449k, keVar, keVar, (C62958ce) null, 119419381, C63066gd.MESSAGE, C55217ke.class);
    }

    private C55217ke() {
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
                return newMessageInfo(f145370a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C55217ke();
            case 4:
                return new C55216kd();
            case 5:
                return f145370a;
            case 6:
                C63010eb ebVar = f145372c;
                if (ebVar == null) {
                    synchronized (C55217ke.class) {
                        ebVar = f145372c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145370a);
                            f145372c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
