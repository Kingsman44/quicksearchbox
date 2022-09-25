package com.google.android.apps.gsa.nga.shared.p6275aa.p6293m;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.m.m */
/* compiled from: PG */
public final class C80510m extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80510m f221010b;

    /* renamed from: c */
    private static volatile C63010eb f221011c;

    /* renamed from: a */
    public C62971cq f221012a = emptyProtobufList();

    static {
        C80510m mVar = new C80510m();
        f221010b = mVar;
        C62942bv.registerDefaultInstance(C80510m.class, mVar);
    }

    private C80510m() {
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
                return newMessageInfo(f221010b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C80508k.class});
            case 3:
                return new C80510m();
            case 4:
                return new C80509l();
            case 5:
                return f221010b;
            case 6:
                C63010eb ebVar = f221011c;
                if (ebVar == null) {
                    synchronized (C80510m.class) {
                        ebVar = f221011c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221010b);
                            f221011c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
