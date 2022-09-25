package com.google.p4181bi;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4420by.p4425c.p4428b.p4429a.p4432b.C57887d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bi.ay */
/* compiled from: PG */
public final class C55815ay extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C55815ay f147275f;

    /* renamed from: h */
    private static volatile C63010eb f147276h;

    /* renamed from: a */
    public int f147277a;

    /* renamed from: b */
    public C55817b f147278b;

    /* renamed from: c */
    public C62971cq f147279c = emptyProtobufList();

    /* renamed from: d */
    public C55851m f147280d;

    /* renamed from: e */
    public C57887d f147281e;

    /* renamed from: g */
    private byte f147282g = 2;

    static {
        C55815ay ayVar = new C55815ay();
        f147275f = ayVar;
        C62942bv.registerDefaultInstance(C55815ay.class, ayVar);
    }

    private C55815ay() {
    }

    /* renamed from: a */
    public final void mo54280a() {
        C62971cq cqVar = this.f147279c;
        if (!cqVar.mo58948c()) {
            this.f147279c = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f147282g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f147282g = b;
                return null;
            case 2:
                return newMessageInfo(f147275f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0001\u0001\u001b\u0002ဉ\u0000\u0003ᐉ\u0001\u0005ဉ\u0003", new Object[]{"a", C45240c.f118157a, C55856r.class, "b", "d", "e"});
            case 3:
                return new C55815ay();
            case 4:
                return new C55814ax();
            case 5:
                return f147275f;
            case 6:
                C63010eb ebVar = f147276h;
                if (ebVar == null) {
                    synchronized (C55815ay.class) {
                        ebVar = f147276h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147275f);
                            f147276h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
