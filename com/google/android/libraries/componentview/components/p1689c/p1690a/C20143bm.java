package com.google.android.libraries.componentview.components.p1689c.p1690a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.componentview.components.c.a.bm */
/* compiled from: PG */
public final class C20143bm extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C20143bm f56484b;

    /* renamed from: c */
    private static volatile C63010eb f56485c;

    /* renamed from: a */
    public C62971cq f56486a = emptyProtobufList();

    static {
        C20143bm bmVar = new C20143bm();
        f56484b = bmVar;
        C62942bv.registerDefaultInstance(C20143bm.class, bmVar);
    }

    private C20143bm() {
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
                return newMessageInfo(f56484b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C20145bo.class});
            case 3:
                return new C20143bm();
            case 4:
                return new C20142bl();
            case 5:
                return f56484b;
            case 6:
                C63010eb ebVar = f56485c;
                if (ebVar == null) {
                    synchronized (C20143bm.class) {
                        ebVar = f56485c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f56484b);
                            f56485c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
