package com.google.p4242bp.p4267h.p4268a;

import com.google.p4152bb.p4153a.C54946ad;
import com.google.p4242bp.p4267h.C56394af;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bp.h.a.l */
/* compiled from: PG */
public final class C56379l extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56379l f150354a;

    /* renamed from: b */
    public static final C62940bt f150355b = C62942bv.newSingularGeneratedExtension(C54946ad.f144531h, C56394af.f150399g, C56394af.f150399g, (C62958ce) null, 109594883, C63066gd.MESSAGE, C56394af.class);

    /* renamed from: c */
    private static volatile C63010eb f150356c;

    static {
        C56379l lVar = new C56379l();
        f150354a = lVar;
        C62942bv.registerDefaultInstance(C56379l.class, lVar);
    }

    private C56379l() {
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
                return newMessageInfo(f150354a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56379l();
            case 4:
                return new C56378k();
            case 5:
                return f150354a;
            case 6:
                C63010eb ebVar = f150356c;
                if (ebVar == null) {
                    synchronized (C56379l.class) {
                        ebVar = f150356c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150354a);
                            f150356c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
