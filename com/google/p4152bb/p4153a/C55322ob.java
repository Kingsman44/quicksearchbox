package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.ob */
/* compiled from: PG */
public final class C55322ob extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55322ob f145742a;

    /* renamed from: b */
    public static final C62940bt f145743b;

    /* renamed from: c */
    private static volatile C63010eb f145744c;

    static {
        C55322ob obVar = new C55322ob();
        f145742a = obVar;
        C62942bv.registerDefaultInstance(C55322ob.class, obVar);
        f145743b = C62942bv.newSingularGeneratedExtension(C55330oj.f145769e, obVar, obVar, (C62958ce) null, 119566004, C63066gd.MESSAGE, C55322ob.class);
    }

    private C55322ob() {
        emptyIntList();
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
                return newMessageInfo(f145742a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C55322ob();
            case 4:
                return new C55321oa();
            case 5:
                return f145742a;
            case 6:
                C63010eb ebVar = f145744c;
                if (ebVar == null) {
                    synchronized (C55322ob.class) {
                        ebVar = f145744c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145742a);
                            f145744c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
