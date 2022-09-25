package com.google.android.apps.gsa.nga.engine.p6026f.p6028b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.f.b.l */
/* compiled from: PG */
public final class C76017l extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C76017l f210854b;

    /* renamed from: c */
    private static volatile C63010eb f210855c;

    /* renamed from: a */
    public int f210856a;

    static {
        C76017l lVar = new C76017l();
        f210854b = lVar;
        C62942bv.registerDefaultInstance(C76017l.class, lVar);
    }

    private C76017l() {
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
                return newMessageInfo(f210854b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
            case 3:
                return new C76017l();
            case 4:
                return new C76016k();
            case 5:
                return f210854b;
            case 6:
                C63010eb ebVar = f210855c;
                if (ebVar == null) {
                    synchronized (C76017l.class) {
                        ebVar = f210855c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f210854b);
                            f210855c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
