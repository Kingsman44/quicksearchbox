package com.google.p4172bg.p4174b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bg.b.n */
/* compiled from: PG */
public final class C55725n extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C55725n f147039h;

    /* renamed from: i */
    private static volatile C63010eb f147040i;

    /* renamed from: a */
    public int f147041a;

    /* renamed from: b */
    public C55727p f147042b;

    /* renamed from: c */
    public boolean f147043c;

    /* renamed from: d */
    public float f147044d;

    /* renamed from: e */
    public boolean f147045e;

    /* renamed from: f */
    public boolean f147046f;

    /* renamed from: g */
    public boolean f147047g = true;

    static {
        C55725n nVar = new C55725n();
        f147039h = nVar;
        C62942bv.registerDefaultInstance(C55725n.class, nVar);
    }

    private C55725n() {
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
                return newMessageInfo(f147039h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0004ခ\u0003\u0005ဇ\u0004\u0007ဇ\u0006\bဇ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C55725n();
            case 4:
                return new C55724m();
            case 5:
                return f147039h;
            case 6:
                C63010eb ebVar = f147040i;
                if (ebVar == null) {
                    synchronized (C55725n.class) {
                        ebVar = f147040i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147039h);
                            f147040i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
