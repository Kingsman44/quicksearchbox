package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.pl */
/* compiled from: PG */
public final class C55359pl extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55359pl f145863a;

    /* renamed from: b */
    public static final C62940bt f145864b;

    /* renamed from: c */
    private static volatile C63010eb f145865c;

    static {
        C55359pl plVar = new C55359pl();
        f145863a = plVar;
        C62942bv.registerDefaultInstance(C55359pl.class, plVar);
        f145864b = C62942bv.newSingularGeneratedExtension(C55361pn.f145866g, plVar, plVar, (C62958ce) null, 78351885, C63066gd.MESSAGE, C55359pl.class);
    }

    private C55359pl() {
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
                return newMessageInfo(f145863a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C55359pl();
            case 4:
                return new C55358pk();
            case 5:
                return f145863a;
            case 6:
                C63010eb ebVar = f145865c;
                if (ebVar == null) {
                    synchronized (C55359pl.class) {
                        ebVar = f145865c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145863a);
                            f145865c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
