package com.google.p4172bg;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5137s.C65885b;

/* renamed from: com.google.bg.u */
/* compiled from: PG */
public final class C55760u extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C55760u f147139f;

    /* renamed from: g */
    private static volatile C63010eb f147140g;

    /* renamed from: a */
    public C62995dn f147141a = C62995dn.f170057a;

    /* renamed from: b */
    public C65885b f147142b;

    /* renamed from: c */
    public boolean f147143c;

    /* renamed from: d */
    public int f147144d;

    /* renamed from: e */
    public int f147145e;

    static {
        C55760u uVar = new C55760u();
        f147139f = uVar;
        C62942bv.registerDefaultInstance(C55760u.class, uVar);
    }

    private C55760u() {
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
                return newMessageInfo(f147139f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u00012\u0002\t\u0003\u0007\u0004\u0004\u0005\u0004", new Object[]{"a", C55759t.f147138a, "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C55760u();
            case 4:
                return new C55756q();
            case 5:
                return f147139f;
            case 6:
                C63010eb ebVar = f147140g;
                if (ebVar == null) {
                    synchronized (C55760u.class) {
                        ebVar = f147140g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147139f);
                            f147140g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
