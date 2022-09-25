package com.google.protos.p4895aw.p4896a.p4897a.p4898a.p4899a.p4901b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63955s;

/* renamed from: com.google.protos.aw.a.a.a.a.b.d */
/* compiled from: PG */
public final class C63872d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63872d f172709b;

    /* renamed from: c */
    public static final C62940bt f172710c;

    /* renamed from: e */
    private static volatile C63010eb f172711e;

    /* renamed from: a */
    public int f172712a;

    /* renamed from: d */
    private int f172713d;

    static {
        C63872d dVar = new C63872d();
        f172709b = dVar;
        C62942bv.registerDefaultInstance(C63872d.class, dVar);
        f172710c = C62942bv.newSingularGeneratedExtension(C63955s.f172966b, dVar, dVar, (C62958ce) null, 1001, C63066gd.MESSAGE, C63872d.class);
    }

    private C63872d() {
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
                return newMessageInfo(f172709b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"d", "a", C63869a.f172708a});
            case 3:
                return new C63872d();
            case 4:
                return new C63871c();
            case 5:
                return f172709b;
            case 6:
                C63010eb ebVar = f172711e;
                if (ebVar == null) {
                    synchronized (C63872d.class) {
                        ebVar = f172711e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172709b);
                            f172711e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
