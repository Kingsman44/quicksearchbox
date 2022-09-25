package com.google.android.libraries.lens.view.p2069am;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.am.l */
/* compiled from: PG */
public final class C25336l extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C25336l f68957d;

    /* renamed from: e */
    private static volatile C63010eb f68958e;

    /* renamed from: a */
    public int f68959a;

    /* renamed from: b */
    public int f68960b;

    /* renamed from: c */
    public int f68961c;

    static {
        C25336l lVar = new C25336l();
        f68957d = lVar;
        C62942bv.registerDefaultInstance(C25336l.class, lVar);
    }

    private C25336l() {
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
                return newMessageInfo(f68957d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\f", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C25336l();
            case 4:
                return new C25334j();
            case 5:
                return f68957d;
            case 6:
                C63010eb ebVar = f68958e;
                if (ebVar == null) {
                    synchronized (C25336l.class) {
                        ebVar = f68958e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68957d);
                            f68958e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
