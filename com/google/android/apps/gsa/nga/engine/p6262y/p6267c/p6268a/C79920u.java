package com.google.android.apps.gsa.nga.engine.p6262y.p6267c.p6268a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.c.a.u */
/* compiled from: PG */
public final class C79920u extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C79920u f219060b;

    /* renamed from: c */
    private static volatile C63010eb f219061c;

    /* renamed from: a */
    public C62971cq f219062a = C62942bv.emptyProtobufList();

    static {
        C79920u uVar = new C79920u();
        f219060b = uVar;
        C62942bv.registerDefaultInstance(C79920u.class, uVar);
    }

    private C79920u() {
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
                return newMessageInfo(f219060b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C79920u();
            case 4:
                return new C79919t();
            case 5:
                return f219060b;
            case 6:
                C63010eb ebVar = f219061c;
                if (ebVar == null) {
                    synchronized (C79920u.class) {
                        ebVar = f219061c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219060b);
                            f219061c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
