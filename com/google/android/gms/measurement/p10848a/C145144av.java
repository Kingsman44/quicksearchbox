package com.google.android.gms.measurement.p10848a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.measurement.a.av */
/* compiled from: PG */
public final class C145144av extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C145144av f392304b;

    /* renamed from: c */
    private static volatile C63010eb f392305c;

    /* renamed from: a */
    public C62971cq f392306a = emptyProtobufList();

    static {
        C145144av avVar = new C145144av();
        f392304b = avVar;
        C62942bv.registerDefaultInstance(C145144av.class, avVar);
    }

    private C145144av() {
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
                return newMessageInfo(f392304b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C145146ax.class});
            case 3:
                return new C145144av();
            case 4:
                return new C145143au();
            case 5:
                return f392304b;
            case 6:
                C63010eb ebVar = f392305c;
                if (ebVar == null) {
                    synchronized (C145144av.class) {
                        ebVar = f392305c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f392304b);
                            f392305c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
