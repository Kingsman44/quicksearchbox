package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.t */
/* compiled from: PG */
public final class C65306t extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65306t f176632c;

    /* renamed from: d */
    private static volatile C63010eb f176633d;

    /* renamed from: a */
    public int f176634a;

    /* renamed from: b */
    public C65172ef f176635b;

    static {
        C65306t tVar = new C65306t();
        f176632c = tVar;
        C62942bv.registerDefaultInstance(C65306t.class, tVar);
    }

    private C65306t() {
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
                return newMessageInfo(f176632c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65306t();
            case 4:
                return new C65305s();
            case 5:
                return f176632c;
            case 6:
                C63010eb ebVar = f176633d;
                if (ebVar == null) {
                    synchronized (C65306t.class) {
                        ebVar = f176633d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176632c);
                            f176633d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
