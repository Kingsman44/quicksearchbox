package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.ot */
/* compiled from: PG */
public final class C7917ot extends C62937bq implements C62938br {

    /* renamed from: d */
    public static final C7917ot f27818d;

    /* renamed from: f */
    private static volatile C63010eb f27819f;

    /* renamed from: a */
    public int f27820a;

    /* renamed from: b */
    public C8093vg f27821b;

    /* renamed from: c */
    public C8095vi f27822c;

    /* renamed from: e */
    private byte f27823e = 2;

    static {
        C7917ot otVar = new C7917ot();
        f27818d = otVar;
        C62942bv.registerDefaultInstance(C7917ot.class, otVar);
    }

    private C7917ot() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f27823e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f27823e = b;
                return null;
            case 2:
                return newMessageInfo(f27818d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0001\u0002ᐉ\u0002\u0003ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C7917ot();
            case 4:
                return new C7916os();
            case 5:
                return f27818d;
            case 6:
                C63010eb ebVar = f27819f;
                if (ebVar == null) {
                    synchronized (C7917ot.class) {
                        ebVar = f27819f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27818d);
                            f27819f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
