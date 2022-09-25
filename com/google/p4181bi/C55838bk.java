package com.google.p4181bi;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4420by.p4425c.p4428b.p4429a.p4430a.p4431a.C57877c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bi.bk */
/* compiled from: PG */
public final class C55838bk extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55838bk f147339d;

    /* renamed from: e */
    private static volatile C63010eb f147340e;

    /* renamed from: a */
    public int f147341a;

    /* renamed from: b */
    public int f147342b;

    /* renamed from: c */
    public C55849k f147343c;

    static {
        C55838bk bkVar = new C55838bk();
        f147339d = bkVar;
        C62942bv.registerDefaultInstance(C55838bk.class, bkVar);
    }

    private C55838bk() {
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
                return newMessageInfo(f147339d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C57877c.m88553b(), C45240c.f118157a});
            case 3:
                return new C55838bk();
            case 4:
                return new C55837bj();
            case 5:
                return f147339d;
            case 6:
                C63010eb ebVar = f147340e;
                if (ebVar == null) {
                    synchronized (C55838bk.class) {
                        ebVar = f147340e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147339d);
                            f147340e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
