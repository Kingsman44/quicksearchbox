package com.google.android.apps.gsa.nga.shared.p6345h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.bo */
/* compiled from: PG */
public final class C81284bo extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C81284bo f222515b;

    /* renamed from: c */
    private static volatile C63010eb f222516c;

    /* renamed from: a */
    public C62971cq f222517a = emptyProtobufList();

    static {
        C81284bo boVar = new C81284bo();
        f222515b = boVar;
        C62942bv.registerDefaultInstance(C81284bo.class, boVar);
    }

    private C81284bo() {
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
                return newMessageInfo(f222515b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C81282bm.class});
            case 3:
                return new C81284bo();
            case 4:
                return new C81283bn();
            case 5:
                return f222515b;
            case 6:
                C63010eb ebVar = f222516c;
                if (ebVar == null) {
                    synchronized (C81284bo.class) {
                        ebVar = f222516c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222515b);
                            f222516c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
