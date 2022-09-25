package com.google.android.apps.gsa.staticplugins.p7686co.p7691e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.e.p */
/* compiled from: PG */
public final class C98307p extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C98307p f274423b;

    /* renamed from: c */
    private static volatile C63010eb f274424c;

    /* renamed from: a */
    public C62971cq f274425a = emptyProtobufList();

    static {
        C98307p pVar = new C98307p();
        f274423b = pVar;
        C62942bv.registerDefaultInstance(C98307p.class, pVar);
    }

    private C98307p() {
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
                return newMessageInfo(f274423b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C98305n.class});
            case 3:
                return new C98307p();
            case 4:
                return new C98306o();
            case 5:
                return f274423b;
            case 6:
                C63010eb ebVar = f274424c;
                if (ebVar == null) {
                    synchronized (C98307p.class) {
                        ebVar = f274424c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f274423b);
                            f274424c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
