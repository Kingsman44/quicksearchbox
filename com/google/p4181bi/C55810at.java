package com.google.p4181bi;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bi.at */
/* compiled from: PG */
public final class C55810at extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C55810at f147265f;

    /* renamed from: g */
    private static volatile C63010eb f147266g;

    /* renamed from: a */
    public int f147267a;

    /* renamed from: b */
    public String f147268b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f147269c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f147270d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f147271e;

    static {
        C55810at atVar = new C55810at();
        f147265f = atVar;
        C62942bv.registerDefaultInstance(C55810at.class, atVar);
    }

    private C55810at() {
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
                return newMessageInfo(f147265f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C55835bh.f147338a});
            case 3:
                return new C55810at();
            case 4:
                return new C55809as();
            case 5:
                return f147265f;
            case 6:
                C63010eb ebVar = f147266g;
                if (ebVar == null) {
                    synchronized (C55810at.class) {
                        ebVar = f147266g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147265f);
                            f147266g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
