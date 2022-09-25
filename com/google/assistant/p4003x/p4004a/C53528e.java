package com.google.assistant.p4003x.p4004a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.x.a.e */
/* compiled from: PG */
public final class C53528e extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53528e f140476d;

    /* renamed from: e */
    private static volatile C63010eb f140477e;

    /* renamed from: a */
    public int f140478a;

    /* renamed from: b */
    public C62971cq f140479b = emptyProtobufList();

    /* renamed from: c */
    public int f140480c;

    static {
        C53528e eVar = new C53528e();
        f140476d = eVar;
        C62942bv.registerDefaultInstance(C53528e.class, eVar);
    }

    private C53528e() {
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
                return newMessageInfo(f140476d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002င\u0000", new Object[]{"a", "b", C53538o.class, C45240c.f118157a});
            case 3:
                return new C53528e();
            case 4:
                return new C53527d();
            case 5:
                return f140476d;
            case 6:
                C63010eb ebVar = f140477e;
                if (ebVar == null) {
                    synchronized (C53528e.class) {
                        ebVar = f140477e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140476d);
                            f140477e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
