package com.google.p4181bi;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bi.be */
/* compiled from: PG */
public final class C55832be extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C55832be f147328e;

    /* renamed from: f */
    private static volatile C63010eb f147329f;

    /* renamed from: a */
    public int f147330a;

    /* renamed from: b */
    public String f147331b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f147332c;

    /* renamed from: d */
    public String f147333d = BuildConfig.FLAVOR;

    static {
        C55832be beVar = new C55832be();
        f147328e = beVar;
        C62942bv.registerDefaultInstance(C55832be.class, beVar);
    }

    private C55832be() {
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
                return newMessageInfo(f147328e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, C55830bc.f147327a, "d"});
            case 3:
                return new C55832be();
            case 4:
                return new C55829bb();
            case 5:
                return f147328e;
            case 6:
                C63010eb ebVar = f147329f;
                if (ebVar == null) {
                    synchronized (C55832be.class) {
                        ebVar = f147329f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147328e);
                            f147329f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
