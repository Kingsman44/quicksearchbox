package com.google.android.apps.gsa.nga.shared.p6345h;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.o */
/* compiled from: PG */
public final class C81319o extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C81319o f222591d;

    /* renamed from: e */
    private static volatile C63010eb f222592e;

    /* renamed from: a */
    public int f222593a;

    /* renamed from: b */
    public boolean f222594b;

    /* renamed from: c */
    public boolean f222595c;

    static {
        C81319o oVar = new C81319o();
        f222591d = oVar;
        C62942bv.registerDefaultInstance(C81319o.class, oVar);
    }

    private C81319o() {
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
                return newMessageInfo(f222591d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C81319o();
            case 4:
                return new C81318n();
            case 5:
                return f222591d;
            case 6:
                C63010eb ebVar = f222592e;
                if (ebVar == null) {
                    synchronized (C81319o.class) {
                        ebVar = f222592e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222591d);
                            f222592e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
