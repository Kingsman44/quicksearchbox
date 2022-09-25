package com.google.android.gms.measurement.p10848a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.measurement.a.aj */
/* compiled from: PG */
public final class C145132aj extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C145132aj f392233b;

    /* renamed from: c */
    private static volatile C63010eb f392234c;

    /* renamed from: a */
    public C62971cq f392235a = emptyProtobufList();

    static {
        C145132aj ajVar = new C145132aj();
        f392233b = ajVar;
        C62942bv.registerDefaultInstance(C145132aj.class, ajVar);
    }

    private C145132aj() {
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
                return newMessageInfo(f392233b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C145134al.class});
            case 3:
                return new C145132aj();
            case 4:
                return new C145131ai();
            case 5:
                return f392233b;
            case 6:
                C63010eb ebVar = f392234c;
                if (ebVar == null) {
                    synchronized (C145132aj.class) {
                        ebVar = f392234c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f392233b);
                            f392234c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
