package com.google.lens.p4701g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4963bf.p4964a.p4965a.C64602g;

/* renamed from: com.google.lens.g.ag */
/* compiled from: PG */
public final class C62257ag extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62257ag f168084d;

    /* renamed from: f */
    private static volatile C63010eb f168085f;

    /* renamed from: a */
    public int f168086a;

    /* renamed from: b */
    public C62971cq f168087b = emptyProtobufList();

    /* renamed from: c */
    public C64602g f168088c;

    /* renamed from: e */
    private byte f168089e = 2;

    static {
        C62257ag agVar = new C62257ag();
        f168084d = agVar;
        C62942bv.registerDefaultInstance(C62257ag.class, agVar);
    }

    private C62257ag() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f168089e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f168089e = b;
                return null;
            case 2:
                return newMessageInfo(f168084d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u001b\u0002ᐉ\u0000", new Object[]{"a", "b", C62261ak.class, C45240c.f118157a});
            case 3:
                return new C62257ag();
            case 4:
                return new C62256af();
            case 5:
                return f168084d;
            case 6:
                C63010eb ebVar = f168085f;
                if (ebVar == null) {
                    synchronized (C62257ag.class) {
                        ebVar = f168085f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168084d);
                            f168085f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
