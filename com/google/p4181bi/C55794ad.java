package com.google.p4181bi;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bi.ad */
/* compiled from: PG */
public final class C55794ad extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C55794ad f147223g;

    /* renamed from: i */
    private static volatile C63010eb f147224i;

    /* renamed from: a */
    public int f147225a;

    /* renamed from: b */
    public C55858t f147226b;

    /* renamed from: c */
    public C62971cq f147227c = emptyProtobufList();

    /* renamed from: d */
    public int f147228d;

    /* renamed from: e */
    public String f147229e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f147230f = BuildConfig.FLAVOR;

    /* renamed from: h */
    private byte f147231h = 2;

    static {
        C55794ad adVar = new C55794ad();
        f147223g = adVar;
        C62942bv.registerDefaultInstance(C55794ad.class, adVar);
    }

    private C55794ad() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f147231h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f147231h = b;
                return null;
            case 2:
                return newMessageInfo(f147223g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003င\u0001\u0004ဈ\u0002\u0005ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, C55815ay.class, "d", "e", C10662f.f35572a});
            case 3:
                return new C55794ad();
            case 4:
                return new C55793ac();
            case 5:
                return f147223g;
            case 6:
                C63010eb ebVar = f147224i;
                if (ebVar == null) {
                    synchronized (C55794ad.class) {
                        ebVar = f147224i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147223g);
                            f147224i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
