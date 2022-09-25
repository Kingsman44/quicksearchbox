package com.google.p4172bg.p4174b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bg.b.p */
/* compiled from: PG */
public final class C55727p extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C55727p f147048f;

    /* renamed from: g */
    private static volatile C63010eb f147049g;

    /* renamed from: a */
    public int f147050a;

    /* renamed from: b */
    public boolean f147051b;

    /* renamed from: c */
    public boolean f147052c;

    /* renamed from: d */
    public boolean f147053d;

    /* renamed from: e */
    public boolean f147054e;

    static {
        C55727p pVar = new C55727p();
        f147048f = pVar;
        C62942bv.registerDefaultInstance(C55727p.class, pVar);
    }

    private C55727p() {
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
                return newMessageInfo(f147048f, "\u0001\u0004\u0000\u0001\t\u000e\u0004\u0000\u0000\u0000\tဇ\b\nဇ\t\u000bဇ\n\u000eဇ\r", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C55727p();
            case 4:
                return new C55726o();
            case 5:
                return f147048f;
            case 6:
                C63010eb ebVar = f147049g;
                if (ebVar == null) {
                    synchronized (C55727p.class) {
                        ebVar = f147049g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147048f);
                            f147049g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
