package com.google.p4017at.p4049f.p4050a.p4053b.p4054a.p4055a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.f.a.b.a.a.l */
/* compiled from: PG */
public final class C53947l extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53947l f141541b;

    /* renamed from: d */
    private static volatile C63010eb f141542d;

    /* renamed from: a */
    public int f141543a;

    /* renamed from: c */
    private int f141544c;

    static {
        C53947l lVar = new C53947l();
        f141541b = lVar;
        C62942bv.registerDefaultInstance(C53947l.class, lVar);
    }

    private C53947l() {
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
                return newMessageInfo(f141541b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C53944i.f141540a});
            case 3:
                return new C53947l();
            case 4:
                return new C53946k();
            case 5:
                return f141541b;
            case 6:
                C63010eb ebVar = f141542d;
                if (ebVar == null) {
                    synchronized (C53947l.class) {
                        ebVar = f141542d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141541b);
                            f141542d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
