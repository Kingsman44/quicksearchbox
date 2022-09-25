package com.google.android.libraries.lens.view.p2069am;

import com.google.android.libraries.lens.p2014e.p2015a.C24195n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.am.ah */
/* compiled from: PG */
public final class C25300ah extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C25300ah f68813c;

    /* renamed from: d */
    private static volatile C63010eb f68814d;

    /* renamed from: a */
    public C24195n f68815a;

    /* renamed from: b */
    public C62971cq f68816b = emptyProtobufList();

    static {
        C25300ah ahVar = new C25300ah();
        f68813c = ahVar;
        C62942bv.registerDefaultInstance(C25300ah.class, ahVar);
    }

    private C25300ah() {
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
                return newMessageInfo(f68813c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0002\u001b", new Object[]{"a", "b", C24195n.class});
            case 3:
                return new C25300ah();
            case 4:
                return new C25299ag();
            case 5:
                return f68813c;
            case 6:
                C63010eb ebVar = f68814d;
                if (ebVar == null) {
                    synchronized (C25300ah.class) {
                        ebVar = f68814d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68813c);
                            f68814d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
