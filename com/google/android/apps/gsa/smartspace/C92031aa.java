package com.google.android.apps.gsa.smartspace;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.smartspace.aa */
/* compiled from: PG */
public final class C92031aa extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C92031aa f256569b;

    /* renamed from: c */
    private static volatile C63010eb f256570c;

    /* renamed from: a */
    public C62971cq f256571a = emptyProtobufList();

    static {
        C92031aa aaVar = new C92031aa();
        f256569b = aaVar;
        C62942bv.registerDefaultInstance(C92031aa.class, aaVar);
    }

    private C92031aa() {
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
                return newMessageInfo(f256569b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C92130y.class});
            case 3:
                return new C92031aa();
            case 4:
                return new C92131z();
            case 5:
                return f256569b;
            case 6:
                C63010eb ebVar = f256570c;
                if (ebVar == null) {
                    synchronized (C92031aa.class) {
                        ebVar = f256570c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f256569b);
                            f256570c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
