package com.google.p4181bi;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4181bi.p4182a.C55786d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bi.z */
/* compiled from: PG */
public final class C55864z extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C55864z f147406f;

    /* renamed from: g */
    private static volatile C63010eb f147407g;

    /* renamed from: a */
    public int f147408a;

    /* renamed from: b */
    public String f147409b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f147410c = emptyProtobufList();

    /* renamed from: d */
    public C55792ab f147411d;

    /* renamed from: e */
    public C55786d f147412e;

    static {
        C55864z zVar = new C55864z();
        f147406f = zVar;
        C62942bv.registerDefaultInstance(C55864z.class, zVar);
    }

    private C55864z() {
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
                return newMessageInfo(f147406f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, C55863y.class, "d", "e"});
            case 3:
                return new C55864z();
            case 4:
                return new C55859u();
            case 5:
                return f147406f;
            case 6:
                C63010eb ebVar = f147407g;
                if (ebVar == null) {
                    synchronized (C55864z.class) {
                        ebVar = f147407g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147406f);
                            f147407g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
