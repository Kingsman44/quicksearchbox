package com.google.p4017at.p4082j.p4083a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4757ac.p4758a.C63111j;

/* renamed from: com.google.at.j.a.r */
/* compiled from: PG */
public final class C54453r extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54453r f142983d;

    /* renamed from: e */
    private static volatile C63010eb f142984e;

    /* renamed from: a */
    public int f142985a;

    /* renamed from: b */
    public int f142986b;

    /* renamed from: c */
    public C62971cq f142987c = emptyProtobufList();

    static {
        C54453r rVar = new C54453r();
        f142983d = rVar;
        C62942bv.registerDefaultInstance(C54453r.class, rVar);
    }

    private C54453r() {
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
                return newMessageInfo(f142983d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0001\u0002\u001b", new Object[]{"a", "b", C54451p.f142982a, C45240c.f118157a, C63111j.class});
            case 3:
                return new C54453r();
            case 4:
                return new C54450o();
            case 5:
                return f142983d;
            case 6:
                C63010eb ebVar = f142984e;
                if (ebVar == null) {
                    synchronized (C54453r.class) {
                        ebVar = f142984e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142983d);
                            f142984e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
