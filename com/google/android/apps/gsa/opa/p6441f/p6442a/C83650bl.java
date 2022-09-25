package com.google.android.apps.gsa.opa.p6441f.p6442a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.f.a.bl */
/* compiled from: PG */
public final class C83650bl extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C83650bl f228018b;

    /* renamed from: c */
    private static volatile C63010eb f228019c;

    /* renamed from: a */
    public C62971cq f228020a = emptyProtobufList();

    static {
        C83650bl blVar = new C83650bl();
        f228018b = blVar;
        C62942bv.registerDefaultInstance(C83650bl.class, blVar);
    }

    private C83650bl() {
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
                return newMessageInfo(f228018b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C83635ax.class});
            case 3:
                return new C83650bl();
            case 4:
                return new C83649bk();
            case 5:
                return f228018b;
            case 6:
                C63010eb ebVar = f228019c;
                if (ebVar == null) {
                    synchronized (C83650bl.class) {
                        ebVar = f228019c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228018b);
                            f228019c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
