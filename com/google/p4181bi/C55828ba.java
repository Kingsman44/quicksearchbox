package com.google.p4181bi;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bi.ba */
/* compiled from: PG */
public final class C55828ba extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55828ba f147322d;

    /* renamed from: e */
    private static volatile C63010eb f147323e;

    /* renamed from: a */
    public int f147324a;

    /* renamed from: b */
    public String f147325b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f147326c = BuildConfig.FLAVOR;

    static {
        C55828ba baVar = new C55828ba();
        f147322d = baVar;
        C62942bv.registerDefaultInstance(C55828ba.class, baVar);
    }

    private C55828ba() {
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
                return newMessageInfo(f147322d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C55828ba();
            case 4:
                return new C55816az();
            case 5:
                return f147322d;
            case 6:
                C63010eb ebVar = f147323e;
                if (ebVar == null) {
                    synchronized (C55828ba.class) {
                        ebVar = f147323e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147322d);
                            f147323e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
