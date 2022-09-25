package com.google.protos.youtube.elements;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.youtube.elements.bo */
/* compiled from: PG */
public final class C66136bo extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C66136bo f179842a;

    /* renamed from: b */
    public static final C62940bt f179843b;

    /* renamed from: c */
    private static volatile C63010eb f179844c;

    static {
        C66136bo boVar = new C66136bo();
        f179842a = boVar;
        C62942bv.registerDefaultInstance(C66136bo.class, boVar);
        f179843b = C62942bv.newSingularGeneratedExtension(C66244fd.f180131a, boVar, boVar, (C62958ce) null, 158796327, C63066gd.MESSAGE, C66136bo.class);
    }

    private C66136bo() {
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
                return newMessageInfo(f179842a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C66136bo();
            case 4:
                return new C66135bn();
            case 5:
                return f179842a;
            case 6:
                C63010eb ebVar = f179844c;
                if (ebVar == null) {
                    synchronized (C66136bo.class) {
                        ebVar = f179844c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179842a);
                            f179844c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
