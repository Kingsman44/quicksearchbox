package com.google.protos.p5127o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.o.bb */
/* compiled from: PG */
public final class C65674bb extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65674bb f178442c;

    /* renamed from: d */
    public static final C62940bt f178443d;

    /* renamed from: e */
    private static volatile C63010eb f178444e;

    /* renamed from: a */
    public int f178445a;

    /* renamed from: b */
    public int f178446b;

    static {
        C65674bb bbVar = new C65674bb();
        f178442c = bbVar;
        C62942bv.registerDefaultInstance(C65674bb.class, bbVar);
        f178443d = C62942bv.newSingularGeneratedExtension(C65695u.f178492a, bbVar, bbVar, (C62958ce) null, 406210601, C63066gd.MESSAGE, C65674bb.class);
    }

    private C65674bb() {
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
                return newMessageInfo(f178442c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C65671az.f178439a});
            case 3:
                return new C65674bb();
            case 4:
                return new C65670ay();
            case 5:
                return f178442c;
            case 6:
                C63010eb ebVar = f178444e;
                if (ebVar == null) {
                    synchronized (C65674bb.class) {
                        ebVar = f178444e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178442c);
                            f178444e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
