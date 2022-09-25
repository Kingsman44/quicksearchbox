package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.c.a.dd */
/* compiled from: PG */
public final class C57303dd extends C62937bq implements C62938br {

    /* renamed from: d */
    public static final C57303dd f152957d;

    /* renamed from: f */
    private static volatile C63010eb f152958f;

    /* renamed from: a */
    public int f152959a;

    /* renamed from: b */
    public int f152960b;

    /* renamed from: c */
    public C57294cv f152961c;

    /* renamed from: e */
    private byte f152962e = 2;

    static {
        C57303dd ddVar = new C57303dd();
        f152957d = ddVar;
        C62942bv.registerDefaultInstance(C57303dd.class, ddVar);
    }

    private C57303dd() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152962e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152962e = b;
                return null;
            case 2:
                return newMessageInfo(f152957d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C57302dc.m88307b(), C45240c.f118157a});
            case 3:
                return new C57303dd();
            case 4:
                return new C57300da();
            case 5:
                return f152957d;
            case 6:
                C63010eb ebVar = f152958f;
                if (ebVar == null) {
                    synchronized (C57303dd.class) {
                        ebVar = f152958f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152957d);
                            f152958f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
