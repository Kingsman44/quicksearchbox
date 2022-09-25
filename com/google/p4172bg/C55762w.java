package com.google.p4172bg;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;

/* renamed from: com.google.bg.w */
/* compiled from: PG */
public final class C55762w extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C55762w f147146f;

    /* renamed from: g */
    private static volatile C63010eb f147147g;

    /* renamed from: a */
    public int f147148a = 0;

    /* renamed from: b */
    public Object f147149b;

    /* renamed from: c */
    public String f147150c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f147151d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C63088z f147152e = C63088z.f170246b;

    static {
        C55762w wVar = new C55762w();
        f147146f = wVar;
        C62942bv.registerDefaultInstance(C55762w.class, wVar);
    }

    private C55762w() {
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
                return newMessageInfo(f147146f, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003<\u0000\u0004Ȼ\u0000\u0005\n", new Object[]{"b", "a", C45240c.f118157a, "d", C63070h.class, "e"});
            case 3:
                return new C55762w();
            case 4:
                return new C55761v();
            case 5:
                return f147146f;
            case 6:
                C63010eb ebVar = f147147g;
                if (ebVar == null) {
                    synchronized (C55762w.class) {
                        ebVar = f147147g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147146f);
                            f147147g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
