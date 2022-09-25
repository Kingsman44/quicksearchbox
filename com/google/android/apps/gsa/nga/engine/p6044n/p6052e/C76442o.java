package com.google.android.apps.gsa.nga.engine.p6044n.p6052e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.e.o */
/* compiled from: PG */
public final class C76442o extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C76442o f211610c;

    /* renamed from: e */
    private static volatile C63010eb f211611e;

    /* renamed from: a */
    public int f211612a;

    /* renamed from: b */
    public boolean f211613b;

    /* renamed from: d */
    private int f211614d;

    static {
        C76442o oVar = new C76442o();
        f211610c = oVar;
        C62942bv.registerDefaultInstance(C76442o.class, oVar);
    }

    private C76442o() {
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
                return newMessageInfo(f211610c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C76442o();
            case 4:
                return new C76441n();
            case 5:
                return f211610c;
            case 6:
                C63010eb ebVar = f211611e;
                if (ebVar == null) {
                    synchronized (C76442o.class) {
                        ebVar = f211611e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f211610c);
                            f211611e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
