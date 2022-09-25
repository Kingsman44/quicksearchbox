package com.google.protos.p4895aw.p4896a.p4897a.p4898a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.aw.a.a.a.d */
/* compiled from: PG */
public final class C63940d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63940d f172916c;

    /* renamed from: d */
    public static final C62940bt f172917d;

    /* renamed from: e */
    private static volatile C63010eb f172918e;

    /* renamed from: a */
    public int f172919a;

    /* renamed from: b */
    public int f172920b;

    static {
        C63940d dVar = new C63940d();
        f172916c = dVar;
        C62942bv.registerDefaultInstance(C63940d.class, dVar);
        f172917d = C62942bv.newSingularGeneratedExtension(C63959w.f172981b, dVar, dVar, (C62958ce) null, 1006, C63066gd.MESSAGE, C63940d.class);
    }

    private C63940d() {
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
                return newMessageInfo(f172916c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C63913b.f172824a});
            case 3:
                return new C63940d();
            case 4:
                return new C63858a();
            case 5:
                return f172916c;
            case 6:
                C63010eb ebVar = f172918e;
                if (ebVar == null) {
                    synchronized (C63940d.class) {
                        ebVar = f172918e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172916c);
                            f172918e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
