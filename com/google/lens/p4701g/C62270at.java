package com.google.lens.p4701g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4172bg.p4174b.C55719h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.at */
/* compiled from: PG */
public final class C62270at extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62270at f168119b;

    /* renamed from: e */
    private static volatile C63010eb f168120e;

    /* renamed from: a */
    public C55719h f168121a;

    /* renamed from: c */
    private int f168122c;

    /* renamed from: d */
    private byte f168123d = 2;

    static {
        C62270at atVar = new C62270at();
        f168119b = atVar;
        C62942bv.registerDefaultInstance(C62270at.class, atVar);
    }

    private C62270at() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f168123d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f168123d = b;
                return null;
            case 2:
                return newMessageInfo(f168119b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C62270at();
            case 4:
                return new C62269as();
            case 5:
                return f168119b;
            case 6:
                C63010eb ebVar = f168120e;
                if (ebVar == null) {
                    synchronized (C62270at.class) {
                        ebVar = f168120e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168119b);
                            f168120e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
