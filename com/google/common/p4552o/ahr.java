package com.google.common.p4552o;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82924fm;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ahr */
/* compiled from: PG */
public final class ahr extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final ahr f158774d;

    /* renamed from: e */
    private static volatile C63010eb f158775e;

    /* renamed from: a */
    public int f158776a;

    /* renamed from: b */
    public int f158777b;

    /* renamed from: c */
    public C62971cq f158778c = C62942bv.emptyProtobufList();

    static {
        ahr ahr = new ahr();
        f158774d = ahr;
        C62942bv.registerDefaultInstance(ahr.class, ahr);
    }

    private ahr() {
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
                return newMessageInfo(f158774d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001a", new Object[]{"a", "b", C82924fm.m132430b(), C45240c.f118157a});
            case 3:
                return new ahr();
            case 4:
                return new ahq();
            case 5:
                return f158774d;
            case 6:
                C63010eb ebVar = f158775e;
                if (ebVar == null) {
                    synchronized (ahr.class) {
                        ebVar = f158775e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158774d);
                            f158775e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
