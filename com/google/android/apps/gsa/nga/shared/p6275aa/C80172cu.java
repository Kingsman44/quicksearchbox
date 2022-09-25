package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.cu */
/* compiled from: PG */
public final class C80172cu extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80172cu f219987b;

    /* renamed from: c */
    private static volatile C63010eb f219988c;

    /* renamed from: a */
    public C62971cq f219989a = emptyProtobufList();

    static {
        C80172cu cuVar = new C80172cu();
        f219987b = cuVar;
        C62942bv.registerDefaultInstance(C80172cu.class, cuVar);
    }

    private C80172cu() {
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
                return newMessageInfo(f219987b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C80169cr.class});
            case 3:
                return new C80172cu();
            case 4:
                return new C80167cp();
            case 5:
                return f219987b;
            case 6:
                C63010eb ebVar = f219988c;
                if (ebVar == null) {
                    synchronized (C80172cu.class) {
                        ebVar = f219988c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219987b);
                            f219988c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
