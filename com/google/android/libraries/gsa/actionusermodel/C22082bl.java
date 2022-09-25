package com.google.android.libraries.gsa.actionusermodel;

import com.google.android.libraries.gsa.actionusermodel.p1830c.C22104g;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.bl */
/* compiled from: PG */
public final class C22082bl extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C22082bl f60880b;

    /* renamed from: c */
    private static volatile C63010eb f60881c;

    /* renamed from: a */
    public C62971cq f60882a = emptyProtobufList();

    static {
        C22082bl blVar = new C22082bl();
        f60880b = blVar;
        C62942bv.registerDefaultInstance(C22082bl.class, blVar);
    }

    private C22082bl() {
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
                return newMessageInfo(f60880b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C22104g.class});
            case 3:
                return new C22082bl();
            case 4:
                return new C22081bk();
            case 5:
                return f60880b;
            case 6:
                C63010eb ebVar = f60881c;
                if (ebVar == null) {
                    synchronized (C22082bl.class) {
                        ebVar = f60881c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f60880b);
                            f60881c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
