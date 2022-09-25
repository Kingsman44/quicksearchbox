package com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.as.b.a.ak */
/* compiled from: PG */
public final class C107517ak extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C107517ak f299143b;

    /* renamed from: c */
    private static volatile C63010eb f299144c;

    /* renamed from: a */
    public C62971cq f299145a = emptyProtobufList();

    static {
        C107517ak akVar = new C107517ak();
        f299143b = akVar;
        C62942bv.registerDefaultInstance(C107517ak.class, akVar);
    }

    private C107517ak() {
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
                return newMessageInfo(f299143b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C107535n.class});
            case 3:
                return new C107517ak();
            case 4:
                return new C107516aj();
            case 5:
                return f299143b;
            case 6:
                C63010eb ebVar = f299144c;
                if (ebVar == null) {
                    synchronized (C107517ak.class) {
                        ebVar = f299144c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f299143b);
                            f299144c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
