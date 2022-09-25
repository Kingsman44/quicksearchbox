package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.aoz */
/* compiled from: PG */
public final class aoz extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final aoz f159538d;

    /* renamed from: e */
    private static volatile C63010eb f159539e;

    /* renamed from: a */
    public int f159540a;

    /* renamed from: b */
    public C62971cq f159541b = emptyProtobufList();

    /* renamed from: c */
    public int f159542c;

    static {
        aoz aoz = new aoz();
        f159538d = aoz;
        C62942bv.registerDefaultInstance(aoz.class, aoz);
    }

    private aoz() {
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
                return newMessageInfo(f159538d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002င\u0000", new Object[]{"a", "b", apb.class, C45240c.f118157a});
            case 3:
                return new aoz();
            case 4:
                return new aoy();
            case 5:
                return f159538d;
            case 6:
                C63010eb ebVar = f159539e;
                if (ebVar == null) {
                    synchronized (aoz.class) {
                        ebVar = f159539e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159538d);
                            f159539e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
