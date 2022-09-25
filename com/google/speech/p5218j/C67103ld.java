package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.j.ld */
/* compiled from: PG */
public final class C67103ld extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67103ld f182428c;

    /* renamed from: d */
    public static final C62940bt f182429d;

    /* renamed from: e */
    private static volatile C63010eb f182430e;

    /* renamed from: a */
    public int f182431a;

    /* renamed from: b */
    public int f182432b;

    static {
        C67103ld ldVar = new C67103ld();
        f182428c = ldVar;
        C62942bv.registerDefaultInstance(C67103ld.class, ldVar);
        f182429d = C62942bv.newSingularGeneratedExtension(C67087ko.f182366n, ldVar, ldVar, (C62958ce) null, 453155935, C63066gd.MESSAGE, C67103ld.class);
    }

    private C67103ld() {
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
                return newMessageInfo(f182428c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C67102lc.f182427a});
            case 3:
                return new C67103ld();
            case 4:
                return new C67101lb();
            case 5:
                return f182428c;
            case 6:
                C63010eb ebVar = f182430e;
                if (ebVar == null) {
                    synchronized (C67103ld.class) {
                        ebVar = f182430e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182428c);
                            f182430e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
