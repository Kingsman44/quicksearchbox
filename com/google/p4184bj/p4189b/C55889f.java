package com.google.p4184bj.p4189b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.b.f */
/* compiled from: PG */
public final class C55889f extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C55889f f148724a;

    /* renamed from: c */
    private static volatile C63010eb f148725c;

    /* renamed from: b */
    private byte f148726b = 2;

    static {
        C55889f fVar = new C55889f();
        f148724a = fVar;
        C62942bv.registerDefaultInstance(C55889f.class, fVar);
    }

    private C55889f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f148726b);
            case 1:
                this.f148726b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f148724a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C55889f();
            case 4:
                return new C55888e();
            case 5:
                return f148724a;
            case 6:
                C63010eb ebVar = f148725c;
                if (ebVar == null) {
                    synchronized (C55889f.class) {
                        ebVar = f148725c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f148724a);
                            f148725c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
