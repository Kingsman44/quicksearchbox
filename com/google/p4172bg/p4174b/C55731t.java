package com.google.p4172bg.p4174b;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.bg.b.t */
/* compiled from: PG */
public final class C55731t extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C55731t f147061g;

    /* renamed from: i */
    private static volatile C63010eb f147062i;

    /* renamed from: a */
    public int f147063a;

    /* renamed from: b */
    public C63088z f147064b = C63088z.f170246b;

    /* renamed from: c */
    public C62971cq f147065c = emptyProtobufList();

    /* renamed from: d */
    public C55733v f147066d;

    /* renamed from: e */
    public C55727p f147067e;

    /* renamed from: f */
    public C62971cq f147068f;

    /* renamed from: h */
    private byte f147069h = 2;

    static {
        C55731t tVar = new C55731t();
        f147061g = tVar;
        C62942bv.registerDefaultInstance(C55731t.class, tVar);
    }

    private C55731t() {
        emptyProtobufList();
        this.f147068f = emptyProtobufList();
    }

    /* renamed from: a */
    public final void mo54274a() {
        C62971cq cqVar = this.f147065c;
        if (!cqVar.mo58948c()) {
            this.f147065c = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: b */
    public final void mo54275b() {
        C62971cq cqVar = this.f147068f;
        if (!cqVar.mo58948c()) {
            this.f147068f = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f147069h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f147069h = b;
                return null;
            case 2:
                return newMessageInfo(f147061g, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0002\u0003\u0001ᔊ\u0000\u0003Л\u0004ဉ\u0004\u0006ဉ\u0005\bЛ", new Object[]{"a", "b", C45240c.f118157a, C55721j.class, "d", "e", C10662f.f35572a, C55729r.class});
            case 3:
                return new C55731t();
            case 4:
                return new C55730s();
            case 5:
                return f147061g;
            case 6:
                C63010eb ebVar = f147062i;
                if (ebVar == null) {
                    synchronized (C55731t.class) {
                        ebVar = f147062i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147061g);
                            f147062i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
