package com.google.p4181bi;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45662h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bi.m */
/* compiled from: PG */
public final class C55851m extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C55851m f147367e;

    /* renamed from: g */
    private static volatile C63010eb f147368g;

    /* renamed from: a */
    public int f147369a;

    /* renamed from: b */
    public C45662h f147370b;

    /* renamed from: c */
    public boolean f147371c;

    /* renamed from: d */
    public long f147372d;

    /* renamed from: f */
    private byte f147373f = 2;

    static {
        C55851m mVar = new C55851m();
        f147367e = mVar;
        C62942bv.registerDefaultInstance(C55851m.class, mVar);
    }

    private C55851m() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f147373f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f147373f = b;
                return null;
            case 2:
                return newMessageInfo(f147367e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0004ဂ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C55851m();
            case 4:
                return new C55850l();
            case 5:
                return f147367e;
            case 6:
                C63010eb ebVar = f147368g;
                if (ebVar == null) {
                    synchronized (C55851m.class) {
                        ebVar = f147368g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147367e);
                            f147368g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
