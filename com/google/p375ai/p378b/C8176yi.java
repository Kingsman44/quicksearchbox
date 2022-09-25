package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.yi */
/* compiled from: PG */
public final class C8176yi extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C8176yi f28728f;

    /* renamed from: h */
    private static volatile C63010eb f28729h;

    /* renamed from: a */
    public int f28730a;

    /* renamed from: b */
    public C60220t f28731b;

    /* renamed from: c */
    public int f28732c;

    /* renamed from: d */
    public int f28733d = -1;

    /* renamed from: e */
    public int f28734e = -1;

    /* renamed from: g */
    private byte f28735g = 2;

    static {
        C8176yi yiVar = new C8176yi();
        f28728f = yiVar;
        C62942bv.registerDefaultInstance(C8176yi.class, yiVar);
    }

    private C8176yi() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28735g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28735g = b;
                return null;
            case 2:
                return newMessageInfo(f28728f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C8176yi();
            case 4:
                return new C8175yh();
            case 5:
                return f28728f;
            case 6:
                C63010eb ebVar = f28729h;
                if (ebVar == null) {
                    synchronized (C8176yi.class) {
                        ebVar = f28729h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28728f);
                            f28729h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
