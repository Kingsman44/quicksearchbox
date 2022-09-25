package com.google.android.gms.measurement.p10848a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.measurement.a.ar */
/* compiled from: PG */
public final class C145140ar extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C145140ar f392291d;

    /* renamed from: e */
    private static volatile C63010eb f392292e;

    /* renamed from: a */
    public int f392293a;

    /* renamed from: b */
    public int f392294b;

    /* renamed from: c */
    public C62964ck f392295c = emptyLongList();

    static {
        C145140ar arVar = new C145140ar();
        f392291d = arVar;
        C62942bv.registerDefaultInstance(C145140ar.class, arVar);
    }

    private C145140ar() {
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
                return newMessageInfo(f392291d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C145140ar();
            case 4:
                return new C145139aq();
            case 5:
                return f392291d;
            case 6:
                C63010eb ebVar = f392292e;
                if (ebVar == null) {
                    synchronized (C145140ar.class) {
                        ebVar = f392292e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f392291d);
                            f392292e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
