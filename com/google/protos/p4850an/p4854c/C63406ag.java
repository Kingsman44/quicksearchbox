package com.google.protos.p4850an.p4854c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4850an.p4855d.p4856a.C63446af;

/* renamed from: com.google.protos.an.c.ag */
/* compiled from: PG */
public final class C63406ag extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63406ag f171346a;

    /* renamed from: e */
    private static volatile C63010eb f171347e;

    /* renamed from: b */
    private int f171348b;

    /* renamed from: c */
    private C63446af f171349c;

    /* renamed from: d */
    private byte f171350d = 2;

    static {
        C63406ag agVar = new C63406ag();
        f171346a = agVar;
        C62942bv.registerDefaultInstance(C63406ag.class, agVar);
    }

    private C63406ag() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171350d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171350d = b;
                return null;
            case 2:
                return newMessageInfo(f171346a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C63406ag();
            case 4:
                return new C63405af();
            case 5:
                return f171346a;
            case 6:
                C63010eb ebVar = f171347e;
                if (ebVar == null) {
                    synchronized (C63406ag.class) {
                        ebVar = f171347e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171346a);
                            f171347e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
