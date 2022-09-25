package com.google.p427am.p438d.p439a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.d.a.dc */
/* compiled from: PG */
public final class C8783dc extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8783dc f30155a;

    /* renamed from: b */
    private static volatile C63010eb f30156b;

    static {
        C8783dc dcVar = new C8783dc();
        f30155a = dcVar;
        C62942bv.registerDefaultInstance(C8783dc.class, dcVar);
    }

    private C8783dc() {
        emptyProtobufList();
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
                return newMessageInfo(f30155a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C8783dc();
            case 4:
                return new C8782db();
            case 5:
                return f30155a;
            case 6:
                C63010eb ebVar = f30156b;
                if (ebVar == null) {
                    synchronized (C8783dc.class) {
                        ebVar = f30156b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30155a);
                            f30156b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
