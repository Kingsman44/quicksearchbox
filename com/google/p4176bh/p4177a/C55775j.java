package com.google.p4176bh.p4177a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p381aj.p382a.p383a.p384a.C8242v;
import com.google.p4481ch.p4485b.C58087b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bh.a.j */
/* compiled from: PG */
public final class C55775j extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55775j f147179a;

    /* renamed from: g */
    private static volatile C63010eb f147180g;

    /* renamed from: b */
    private int f147181b;

    /* renamed from: c */
    private C58087b f147182c;

    /* renamed from: d */
    private C8242v f147183d;

    /* renamed from: e */
    private C8242v f147184e;

    /* renamed from: f */
    private byte f147185f = 2;

    static {
        C55775j jVar = new C55775j();
        f147179a = jVar;
        C62942bv.registerDefaultInstance(C55775j.class, jVar);
    }

    private C55775j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f147185f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f147185f = b;
                return null;
            case 2:
                return newMessageInfo(f147179a, "\u0001\u0003\u0000\u0001\t\u0018\u0003\u0000\u0000\u0003\tᐉ\u0005\u0012ᐉ\u0004\u0018ᐉ\u0017", new Object[]{"b", "d", C45240c.f118157a, "e"});
            case 3:
                return new C55775j();
            case 4:
                return new C55774i();
            case 5:
                return f147179a;
            case 6:
                C63010eb ebVar = f147180g;
                if (ebVar == null) {
                    synchronized (C55775j.class) {
                        ebVar = f147180g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147179a);
                            f147180g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
