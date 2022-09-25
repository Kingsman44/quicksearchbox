package com.google.android.gms.measurement.p10848a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.measurement.a.an */
/* compiled from: PG */
public final class C145136an extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C145136an f392282b;

    /* renamed from: c */
    private static volatile C63010eb f392283c;

    /* renamed from: a */
    public C62971cq f392284a = emptyProtobufList();

    static {
        C145136an anVar = new C145136an();
        f392282b = anVar;
        C62942bv.registerDefaultInstance(C145136an.class, anVar);
    }

    private C145136an() {
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
                return newMessageInfo(f392282b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", C145128af.class});
            case 3:
                return new C145136an();
            case 4:
                return new C145135am();
            case 5:
                return f392282b;
            case 6:
                C63010eb ebVar = f392283c;
                if (ebVar == null) {
                    synchronized (C145136an.class) {
                        ebVar = f392283c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f392282b);
                            f392283c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
