package com.google.p4017at.p4082j.p4083a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.d */
/* compiled from: PG */
public final class C54401d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54401d f142883d;

    /* renamed from: e */
    private static volatile C63010eb f142884e;

    /* renamed from: a */
    public long f142885a;

    /* renamed from: b */
    public C62971cq f142886b = emptyProtobufList();

    /* renamed from: c */
    public boolean f142887c;

    static {
        C54401d dVar = new C54401d();
        f142883d = dVar;
        C62942bv.registerDefaultInstance(C54401d.class, dVar);
    }

    private C54401d() {
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
                return newMessageInfo(f142883d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0002\u0002\u001b\u0003\u0007", new Object[]{"a", "b", C54455t.class, C45240c.f118157a});
            case 3:
                return new C54401d();
            case 4:
                return new C54374c();
            case 5:
                return f142883d;
            case 6:
                C63010eb ebVar = f142884e;
                if (ebVar == null) {
                    synchronized (C54401d.class) {
                        ebVar = f142884e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142883d);
                            f142884e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
