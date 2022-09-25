package com.google.p4500cm.p4501a.p4508c.p4509a.p4510a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.cm.a.c.a.a.f */
/* compiled from: PG */
public final class C58154f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C58154f f155477d;

    /* renamed from: e */
    private static volatile C63010eb f155478e;

    /* renamed from: a */
    public int f155479a = 0;

    /* renamed from: b */
    public Object f155480b;

    /* renamed from: c */
    public C62971cq f155481c = emptyProtobufList();

    static {
        C58154f fVar = new C58154f();
        f155477d = fVar;
        C62942bv.registerDefaultInstance(C58154f.class, fVar);
    }

    private C58154f() {
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
                return newMessageInfo(f155477d, "\u0001\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0001\u0000\u0001း\u0000\u0003\u001b\u0004ဵ\u0000", new Object[]{"b", "a", C45240c.f118157a, C58152d.class});
            case 3:
                return new C58154f();
            case 4:
                return new C58153e();
            case 5:
                return f155477d;
            case 6:
                C63010eb ebVar = f155478e;
                if (ebVar == null) {
                    synchronized (C58154f.class) {
                        ebVar = f155478e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155477d);
                            f155478e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
