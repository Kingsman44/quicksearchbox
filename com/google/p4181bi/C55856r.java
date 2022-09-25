package com.google.p4181bi;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4420by.p4425c.p4428b.p4429a.p4432b.C57885b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bi.r */
/* compiled from: PG */
public final class C55856r extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C55856r f147380k;

    /* renamed from: l */
    private static volatile C63010eb f147381l;

    /* renamed from: a */
    public int f147382a;

    /* renamed from: b */
    public int f147383b = 0;

    /* renamed from: c */
    public Object f147384c;

    /* renamed from: d */
    public C55858t f147385d;

    /* renamed from: e */
    public C62971cq f147386e = emptyProtobufList();

    /* renamed from: f */
    public boolean f147387f;

    /* renamed from: g */
    public boolean f147388g;

    /* renamed from: h */
    public boolean f147389h;

    /* renamed from: i */
    public C57885b f147390i;

    /* renamed from: j */
    public String f147391j = BuildConfig.FLAVOR;

    static {
        C55856r rVar = new C55856r();
        f147380k = rVar;
        C62942bv.registerDefaultInstance(C55856r.class, rVar);
    }

    private C55856r() {
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
                return newMessageInfo(f147380k, "\u0001\n\u0001\u0001\u0001\n\n\u0000\u0001\u0000\u0001ဉ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005\u001b\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဉ\u0007\nဈ\b", new Object[]{C45240c.f118157a, "b", "a", "d", C55864z.class, C55828ba.class, C55797ag.class, "e", C55834bg.class, C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C55856r();
            case 4:
                return new C55854p();
            case 5:
                return f147380k;
            case 6:
                C63010eb ebVar = f147381l;
                if (ebVar == null) {
                    synchronized (C55856r.class) {
                        ebVar = f147381l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147380k);
                            f147381l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
