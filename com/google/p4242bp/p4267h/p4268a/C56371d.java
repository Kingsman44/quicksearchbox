package com.google.p4242bp.p4267h.p4268a;

import com.google.p4152bb.p4153a.C54944ab;
import com.google.p4152bb.p4153a.C55134hc;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.bp.h.a.d */
/* compiled from: PG */
public final class C56371d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56371d f150331a;

    /* renamed from: b */
    public static final C62940bt f150332b = C62942bv.newSingularGeneratedExtension(C55134hc.f145119i, C54944ab.UNKNOWN, (MessageLite) null, C54944ab.f144502Q, 109696812, C63066gd.ENUM, C54944ab.class);

    /* renamed from: c */
    private static volatile C63010eb f150333c;

    static {
        C56371d dVar = new C56371d();
        f150331a = dVar;
        C62942bv.registerDefaultInstance(C56371d.class, dVar);
    }

    private C56371d() {
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
                return newMessageInfo(f150331a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56371d();
            case 4:
                return new C56370c();
            case 5:
                return f150331a;
            case 6:
                C63010eb ebVar = f150333c;
                if (ebVar == null) {
                    synchronized (C56371d.class) {
                        ebVar = f150333c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150331a);
                            f150333c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
