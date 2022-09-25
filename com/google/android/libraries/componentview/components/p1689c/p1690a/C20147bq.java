package com.google.android.libraries.componentview.components.p1689c.p1690a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.componentview.components.c.a.bq */
/* compiled from: PG */
public final class C20147bq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C20147bq f56492c;

    /* renamed from: d */
    private static volatile C63010eb f56493d;

    /* renamed from: a */
    public C62971cq f56494a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f56495b = emptyProtobufList();

    static {
        C20147bq bqVar = new C20147bq();
        f56492c = bqVar;
        C62942bv.registerDefaultInstance(C20147bq.class, bqVar);
    }

    private C20147bq() {
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
                return newMessageInfo(f56492c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", C20145bo.class, "b", C20145bo.class});
            case 3:
                return new C20147bq();
            case 4:
                return new C20146bp();
            case 5:
                return f56492c;
            case 6:
                C63010eb ebVar = f56493d;
                if (ebVar == null) {
                    synchronized (C20147bq.class) {
                        ebVar = f56493d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f56492c);
                            f56493d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
