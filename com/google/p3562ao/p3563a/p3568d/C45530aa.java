package com.google.p3562ao.p3563a.p3568d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ao.a.d.aa */
/* compiled from: PG */
public final class C45530aa extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C45530aa f119006d;

    /* renamed from: e */
    private static volatile C63010eb f119007e;

    /* renamed from: a */
    public String f119008a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f119009b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public C62910ar f119010c;

    static {
        C45530aa aaVar = new C45530aa();
        f119006d = aaVar;
        C62942bv.registerDefaultInstance(C45530aa.class, aaVar);
    }

    private C45530aa() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f119006d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0001\u0000\u0001Ȉ\u0003Ț\u0004\t", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C45530aa();
            case 4:
                return new C45588z();
            case 5:
                return f119006d;
            case 6:
                C63010eb ebVar = f119007e;
                if (ebVar == null) {
                    synchronized (C45530aa.class) {
                        ebVar = f119007e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f119006d);
                            f119007e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
