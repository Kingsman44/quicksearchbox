package com.google.protos.p4985f.p5030q;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.dv */
/* compiled from: PG */
public final class C65161dv extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C65161dv f176346e;

    /* renamed from: f */
    private static volatile C63010eb f176347f;

    /* renamed from: a */
    public int f176348a;

    /* renamed from: b */
    public long f176349b;

    /* renamed from: c */
    public long f176350c;

    /* renamed from: d */
    public C65291iq f176351d;

    static {
        C65161dv dvVar = new C65161dv();
        f176346e = dvVar;
        C62942bv.registerDefaultInstance(C65161dv.class, dvVar);
    }

    private C65161dv() {
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
                return newMessageInfo(f176346e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C65161dv();
            case 4:
                return new C65160du();
            case 5:
                return f176346e;
            case 6:
                C63010eb ebVar = f176347f;
                if (ebVar == null) {
                    synchronized (C65161dv.class) {
                        ebVar = f176347f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176346e);
                            f176347f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
