package com.google.p4160bf.p4164b.p4165a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.ae */
/* compiled from: PG */
public final class C55595ae extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C55595ae f146686e;

    /* renamed from: f */
    private static volatile C63010eb f146687f;

    /* renamed from: a */
    public int f146688a;

    /* renamed from: b */
    public C62971cq f146689b = emptyProtobufList();

    /* renamed from: c */
    public C55564bq f146690c;

    /* renamed from: d */
    public C55669i f146691d;

    static {
        C55595ae aeVar = new C55595ae();
        f146686e = aeVar;
        C62942bv.registerDefaultInstance(C55595ae.class, aeVar);
    }

    private C55595ae() {
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
                return newMessageInfo(f146686e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"a", "b", C55661cq.class, C45240c.f118157a, "d"});
            case 3:
                return new C55595ae();
            case 4:
                return new C55594ad();
            case 5:
                return f146686e;
            case 6:
                C63010eb ebVar = f146687f;
                if (ebVar == null) {
                    synchronized (C55595ae.class) {
                        ebVar = f146687f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146686e);
                            f146687f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
