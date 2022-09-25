package com.google.android.libraries.search.p3055n;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.speech.p5218j.C67087ko;

/* renamed from: com.google.android.libraries.search.n.x */
/* compiled from: PG */
public final class C39820x extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C39820x f104709c;

    /* renamed from: d */
    public static final C62940bt f104710d;

    /* renamed from: e */
    private static volatile C63010eb f104711e;

    /* renamed from: a */
    public int f104712a;

    /* renamed from: b */
    public int f104713b;

    static {
        C39820x xVar = new C39820x();
        f104709c = xVar;
        C62942bv.registerDefaultInstance(C39820x.class, xVar);
        f104710d = C62942bv.newSingularGeneratedExtension(C67087ko.f182366n, xVar, xVar, (C62958ce) null, 432592178, C63066gd.MESSAGE, C39820x.class);
    }

    private C39820x() {
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
                return newMessageInfo(f104709c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C39819w.f104708a});
            case 3:
                return new C39820x();
            case 4:
                return new C39818v();
            case 5:
                return f104709c;
            case 6:
                C63010eb ebVar = f104711e;
                if (ebVar == null) {
                    synchronized (C39820x.class) {
                        ebVar = f104711e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f104709c);
                            f104711e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
