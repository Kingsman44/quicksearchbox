package com.google.p4172bg.p4174b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62960cg;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bg.b.v */
/* compiled from: PG */
public final class C55733v extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C55733v f147070l;

    /* renamed from: m */
    private static volatile C63010eb f147071m;

    /* renamed from: a */
    public int f147072a;

    /* renamed from: b */
    public String f147073b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public float f147074c;

    /* renamed from: d */
    public String f147075d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public float f147076e;

    /* renamed from: f */
    public C62971cq f147077f = C62942bv.emptyProtobufList();

    /* renamed from: g */
    public C62960cg f147078g = emptyFloatList();

    /* renamed from: h */
    public C62960cg f147079h = emptyFloatList();

    /* renamed from: i */
    public C62971cq f147080i = C62942bv.emptyProtobufList();

    /* renamed from: j */
    public C62960cg f147081j = emptyFloatList();

    /* renamed from: k */
    public C62960cg f147082k = emptyFloatList();

    static {
        C55733v vVar = new C55733v();
        f147070l = vVar;
        C62942bv.registerDefaultInstance(C55733v.class, vVar);
    }

    private C55733v() {
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
                return newMessageInfo(f147070l, "\u0001\n\u0000\u0001\n\u0013\n\u0000\u0006\u0000\nဈ\u000b\u000b\u001a\fဈ\t\rခ\n\u000eခ\f\u000f$\u0010$\u0011\u001a\u0012$\u0013$", new Object[]{"a", "d", C10662f.f35572a, "b", C45240c.f118157a, "e", C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a});
            case 3:
                return new C55733v();
            case 4:
                return new C55732u();
            case 5:
                return f147070l;
            case 6:
                C63010eb ebVar = f147071m;
                if (ebVar == null) {
                    synchronized (C55733v.class) {
                        ebVar = f147071m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147070l);
                            f147071m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
