package com.google.android.gms.measurement.p10848a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.measurement.a.az */
/* compiled from: PG */
public final class C145148az extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C145148az f392312c;

    /* renamed from: e */
    private static volatile C63010eb f392313e;

    /* renamed from: a */
    public C62971cq f392314a = emptyProtobufList();

    /* renamed from: b */
    public C145144av f392315b;

    /* renamed from: d */
    private int f392316d;

    static {
        C145148az azVar = new C145148az();
        f392312c = azVar;
        C62942bv.registerDefaultInstance(C145148az.class, azVar);
    }

    private C145148az() {
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
                return newMessageInfo(f392312c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"d", "a", C145153bd.class, "b"});
            case 3:
                return new C145148az();
            case 4:
                return new C145147ay();
            case 5:
                return f392312c;
            case 6:
                C63010eb ebVar = f392313e;
                if (ebVar == null) {
                    synchronized (C145148az.class) {
                        ebVar = f392313e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f392312c);
                            f392313e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
