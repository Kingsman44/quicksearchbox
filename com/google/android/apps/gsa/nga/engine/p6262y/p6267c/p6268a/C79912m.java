package com.google.android.apps.gsa.nga.engine.p6262y.p6267c.p6268a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.c.a.m */
/* compiled from: PG */
public final class C79912m extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C79912m f219043b;

    /* renamed from: c */
    private static volatile C63010eb f219044c;

    /* renamed from: a */
    public C62971cq f219045a = emptyProtobufList();

    static {
        C79912m mVar = new C79912m();
        f219043b = mVar;
        C62942bv.registerDefaultInstance(C79912m.class, mVar);
    }

    private C79912m() {
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
                return newMessageInfo(f219043b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C79910k.class});
            case 3:
                return new C79912m();
            case 4:
                return new C79911l();
            case 5:
                return f219043b;
            case 6:
                C63010eb ebVar = f219044c;
                if (ebVar == null) {
                    synchronized (C79912m.class) {
                        ebVar = f219044c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219043b);
                            f219044c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
