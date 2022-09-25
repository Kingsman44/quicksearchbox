package com.google.lens.p4708k;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4707j.C62445bv;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.k.q */
/* compiled from: PG */
public final class C62609q extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62609q f169033d;

    /* renamed from: e */
    private static volatile C63010eb f169034e;

    /* renamed from: a */
    public int f169035a;

    /* renamed from: b */
    public C62445bv f169036b;

    /* renamed from: c */
    public C62608p f169037c;

    static {
        C62609q qVar = new C62609q();
        f169033d = qVar;
        C62942bv.registerDefaultInstance(C62609q.class, qVar);
    }

    private C62609q() {
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
                return newMessageInfo(f169033d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C62609q();
            case 4:
                return new C62606n();
            case 5:
                return f169033d;
            case 6:
                C63010eb ebVar = f169034e;
                if (ebVar == null) {
                    synchronized (C62609q.class) {
                        ebVar = f169034e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169033d);
                            f169034e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
