package com.google.protos.p4880aq;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aq.ad */
/* compiled from: PG */
public final class C63715ad extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63715ad f172262c;

    /* renamed from: e */
    private static volatile C63010eb f172263e;

    /* renamed from: a */
    public int f172264a;

    /* renamed from: b */
    public C62971cq f172265b = emptyProtobufList();

    /* renamed from: d */
    private int f172266d;

    static {
        C63715ad adVar = new C63715ad();
        f172262c = adVar;
        C62942bv.registerDefaultInstance(C63715ad.class, adVar);
    }

    private C63715ad() {
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
                return newMessageInfo(f172262c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"d", "a", C63716ae.f172267a, "b", C63769z.class});
            case 3:
                return new C63715ad();
            case 4:
                return new C63714ac();
            case 5:
                return f172262c;
            case 6:
                C63010eb ebVar = f172263e;
                if (ebVar == null) {
                    synchronized (C63715ad.class) {
                        ebVar = f172263e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172262c);
                            f172263e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
