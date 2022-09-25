package com.google.p4500cm.p4501a.p4508c.p4509a.p4510a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.cm.a.c.a.a.d */
/* compiled from: PG */
public final class C58152d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C58152d f155472d;

    /* renamed from: e */
    private static volatile C63010eb f155473e;

    /* renamed from: a */
    public int f155474a;

    /* renamed from: b */
    public long f155475b;

    /* renamed from: c */
    public long f155476c;

    static {
        C58152d dVar = new C58152d();
        f155472d = dVar;
        C62942bv.registerDefaultInstance(C58152d.class, dVar);
    }

    private C58152d() {
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
                return newMessageInfo(f155472d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C58152d();
            case 4:
                return new C58151c();
            case 5:
                return f155472d;
            case 6:
                C63010eb ebVar = f155473e;
                if (ebVar == null) {
                    synchronized (C58152d.class) {
                        ebVar = f155473e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155472d);
                            f155473e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
