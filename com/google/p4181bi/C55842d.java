package com.google.p4181bi;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4420by.p4425c.p4428b.p4429a.p4430a.p4431a.C57877c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bi.d */
/* compiled from: PG */
public final class C55842d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C55842d f147346e;

    /* renamed from: f */
    private static volatile C63010eb f147347f;

    /* renamed from: a */
    public int f147348a;

    /* renamed from: b */
    public int f147349b;

    /* renamed from: c */
    public String f147350c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C55849k f147351d;

    static {
        C55842d dVar = new C55842d();
        f147346e = dVar;
        C62942bv.registerDefaultInstance(C55842d.class, dVar);
    }

    private C55842d() {
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
                return newMessageInfo(f147346e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C57877c.m88553b(), C45240c.f118157a, "d"});
            case 3:
                return new C55842d();
            case 4:
                return new C55841c();
            case 5:
                return f147346e;
            case 6:
                C63010eb ebVar = f147347f;
                if (ebVar == null) {
                    synchronized (C55842d.class) {
                        ebVar = f147347f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147346e);
                            f147347f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
