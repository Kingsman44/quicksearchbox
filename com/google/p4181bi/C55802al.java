package com.google.p4181bi;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4420by.p4425c.p4428b.p4429a.p4430a.p4431a.C57877c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bi.al */
/* compiled from: PG */
public final class C55802al extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C55802al f147247e;

    /* renamed from: f */
    private static volatile C63010eb f147248f;

    /* renamed from: a */
    public int f147249a;

    /* renamed from: b */
    public int f147250b;

    /* renamed from: c */
    public C55849k f147251c;

    /* renamed from: d */
    public C62971cq f147252d = emptyProtobufList();

    static {
        C55802al alVar = new C55802al();
        f147247e = alVar;
        C62942bv.registerDefaultInstance(C55802al.class, alVar);
    }

    private C55802al() {
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
                return newMessageInfo(f147247e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"a", "b", C57877c.m88553b(), C45240c.f118157a, "d", C55800aj.class});
            case 3:
                return new C55802al();
            case 4:
                return new C55801ak();
            case 5:
                return f147247e;
            case 6:
                C63010eb ebVar = f147248f;
                if (ebVar == null) {
                    synchronized (C55802al.class) {
                        ebVar = f147248f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147247e);
                            f147248f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
