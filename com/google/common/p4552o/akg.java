package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.common.o.akg */
/* compiled from: PG */
public final class akg extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final akg f158961c;

    /* renamed from: d */
    public static final C62940bt f158962d;

    /* renamed from: e */
    private static volatile C63010eb f158963e;

    /* renamed from: a */
    public int f158964a;

    /* renamed from: b */
    public boolean f158965b;

    static {
        akg akg = new akg();
        f158961c = akg;
        C62942bv.registerDefaultInstance(akg.class, akg);
        f158962d = C62942bv.newSingularGeneratedExtension(akn.f158974a, akg, akg, (C62958ce) null, 461707708, C63066gd.MESSAGE, akg.class);
    }

    private akg() {
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
                return newMessageInfo(f158961c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new akg();
            case 4:
                return new akf();
            case 5:
                return f158961c;
            case 6:
                C63010eb ebVar = f158963e;
                if (ebVar == null) {
                    synchronized (akg.class) {
                        ebVar = f158963e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158961c);
                            f158963e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
