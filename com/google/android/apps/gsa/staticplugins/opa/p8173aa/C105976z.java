package com.google.android.apps.gsa.staticplugins.opa.p8173aa;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.aa.z */
/* compiled from: PG */
public final class C105976z extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C105976z f295879b;

    /* renamed from: c */
    private static volatile C63010eb f295880c;

    /* renamed from: a */
    public C62971cq f295881a = emptyProtobufList();

    static {
        C105976z zVar = new C105976z();
        f295879b = zVar;
        C62942bv.registerDefaultInstance(C105976z.class, zVar);
    }

    private C105976z() {
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
                return newMessageInfo(f295879b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C105975y.class});
            case 3:
                return new C105976z();
            case 4:
                return new C105973w();
            case 5:
                return f295879b;
            case 6:
                C63010eb ebVar = f295880c;
                if (ebVar == null) {
                    synchronized (C105976z.class) {
                        ebVar = f295880c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f295879b);
                            f295880c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
