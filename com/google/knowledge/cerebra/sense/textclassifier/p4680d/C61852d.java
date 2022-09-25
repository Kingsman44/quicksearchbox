package com.google.knowledge.cerebra.sense.textclassifier.p4680d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.d.d */
/* compiled from: PG */
public final class C61852d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C61852d f167143e;

    /* renamed from: f */
    private static volatile C63010eb f167144f;

    /* renamed from: a */
    public int f167145a;

    /* renamed from: b */
    public C62971cq f167146b = emptyProtobufList();

    /* renamed from: c */
    public int f167147c;

    /* renamed from: d */
    public int f167148d;

    static {
        C61852d dVar = new C61852d();
        f167143e = dVar;
        C62942bv.registerDefaultInstance(C61852d.class, dVar);
    }

    private C61852d() {
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
                return newMessageInfo(f167143e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001", new Object[]{"a", "b", C61850b.class, C45240c.f118157a, "d"});
            case 3:
                return new C61852d();
            case 4:
                return new C61851c();
            case 5:
                return f167143e;
            case 6:
                C63010eb ebVar = f167144f;
                if (ebVar == null) {
                    synchronized (C61852d.class) {
                        ebVar = f167144f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167143e);
                            f167144f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
