package com.google.p4181bi;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bi.ag */
/* compiled from: PG */
public final class C55797ag extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C55797ag f147232e;

    /* renamed from: f */
    private static volatile C63010eb f147233f;

    /* renamed from: a */
    public int f147234a;

    /* renamed from: b */
    public int f147235b = 0;

    /* renamed from: c */
    public Object f147236c;

    /* renamed from: d */
    public String f147237d = BuildConfig.FLAVOR;

    static {
        C55797ag agVar = new C55797ag();
        f147232e = agVar;
        C62942bv.registerDefaultInstance(C55797ag.class, agVar);
    }

    private C55797ag() {
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
                return newMessageInfo(f147232e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ျ\u0000\u0003ျ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d"});
            case 3:
                return new C55797ag();
            case 4:
                return new C55795ae();
            case 5:
                return f147232e;
            case 6:
                C63010eb ebVar = f147233f;
                if (ebVar == null) {
                    synchronized (C55797ag.class) {
                        ebVar = f147233f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147232e);
                            f147233f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
