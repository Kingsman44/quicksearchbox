package com.google.p4181bi;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bi.o */
/* compiled from: PG */
public final class C55853o extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55853o f147374d;

    /* renamed from: f */
    private static volatile C63010eb f147375f;

    /* renamed from: a */
    public C55858t f147376a;

    /* renamed from: b */
    public C62971cq f147377b = emptyProtobufList();

    /* renamed from: c */
    public String f147378c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f147379e;

    static {
        C55853o oVar = new C55853o();
        f147374d = oVar;
        C62942bv.registerDefaultInstance(C55853o.class, oVar);
    }

    private C55853o() {
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
                return newMessageInfo(f147374d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဈ\u0001", new Object[]{"e", "a", "b", C55856r.class, C45240c.f118157a});
            case 3:
                return new C55853o();
            case 4:
                return new C55852n();
            case 5:
                return f147374d;
            case 6:
                C63010eb ebVar = f147375f;
                if (ebVar == null) {
                    synchronized (C55853o.class) {
                        ebVar = f147375f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147374d);
                            f147375f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
