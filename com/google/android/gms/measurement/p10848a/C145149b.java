package com.google.android.gms.measurement.p10848a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.measurement.a.b */
/* compiled from: PG */
public final class C145149b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C145149b f392317e;

    /* renamed from: f */
    private static volatile C63010eb f392318f;

    /* renamed from: a */
    public int f392319a;

    /* renamed from: b */
    public int f392320b;

    /* renamed from: c */
    public C62971cq f392321c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f392322d = emptyProtobufList();

    static {
        C145149b bVar = new C145149b();
        f392317e = bVar;
        C62942bv.registerDefaultInstance(C145149b.class, bVar);
    }

    private C145149b() {
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
                return newMessageInfo(f392317e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, C145163l.class, "d", C145155d.class});
            case 3:
                return new C145149b();
            case 4:
                return new C145122a();
            case 5:
                return f392317e;
            case 6:
                C63010eb ebVar = f392318f;
                if (ebVar == null) {
                    synchronized (C145149b.class) {
                        ebVar = f392318f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f392317e);
                            f392318f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
