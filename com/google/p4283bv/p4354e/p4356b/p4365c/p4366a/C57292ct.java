package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.c.a.ct */
/* compiled from: PG */
public final class C57292ct extends C62937bq implements C62938br {

    /* renamed from: b */
    public static final C57292ct f152935b;

    /* renamed from: e */
    private static volatile C63010eb f152936e;

    /* renamed from: a */
    public int f152937a;

    /* renamed from: c */
    private int f152938c;

    /* renamed from: d */
    private byte f152939d = 2;

    static {
        C57292ct ctVar = new C57292ct();
        f152935b = ctVar;
        C62942bv.registerDefaultInstance(C57292ct.class, ctVar);
    }

    private C57292ct() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152939d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152939d = b;
                return null;
            case 2:
                return newMessageInfo(f152935b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C57290cr.f152934a});
            case 3:
                return new C57292ct();
            case 4:
                return new C57289cq();
            case 5:
                return f152935b;
            case 6:
                C63010eb ebVar = f152936e;
                if (ebVar == null) {
                    synchronized (C57292ct.class) {
                        ebVar = f152936e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152935b);
                            f152936e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
