package com.google.android.apps.search.googleapp.p10310h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.h.p */
/* compiled from: PG */
public final class C136135p extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C136135p f370764b;

    /* renamed from: c */
    private static volatile C63010eb f370765c;

    /* renamed from: a */
    public C62971cq f370766a = emptyProtobufList();

    static {
        C136135p pVar = new C136135p();
        f370764b = pVar;
        C62942bv.registerDefaultInstance(C136135p.class, pVar);
    }

    private C136135p() {
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
                return newMessageInfo(f370764b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C136133n.class});
            case 3:
                return new C136135p();
            case 4:
                return new C136134o();
            case 5:
                return f370764b;
            case 6:
                C63010eb ebVar = f370765c;
                if (ebVar == null) {
                    synchronized (C136135p.class) {
                        ebVar = f370765c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f370764b);
                            f370765c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
