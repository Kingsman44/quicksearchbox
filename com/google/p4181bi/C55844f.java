package com.google.p4181bi;

import com.google.p4420by.p4425c.p4428b.p4429a.p4430a.C57883f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bi.f */
/* compiled from: PG */
public final class C55844f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55844f f147352c;

    /* renamed from: f */
    private static volatile C63010eb f147353f;

    /* renamed from: a */
    public C62971cq f147354a = emptyProtobufList();

    /* renamed from: b */
    public C57883f f147355b;

    /* renamed from: d */
    private int f147356d;

    /* renamed from: e */
    private byte f147357e = 2;

    static {
        C55844f fVar = new C55844f();
        f147352c = fVar;
        C62942bv.registerDefaultInstance(C55844f.class, fVar);
    }

    private C55844f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f147357e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f147357e = b;
                return null;
            case 2:
                return newMessageInfo(f147352c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000", new Object[]{"d", "a", C55847i.class, "b"});
            case 3:
                return new C55844f();
            case 4:
                return new C55843e();
            case 5:
                return f147352c;
            case 6:
                C63010eb ebVar = f147353f;
                if (ebVar == null) {
                    synchronized (C55844f.class) {
                        ebVar = f147353f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147352c);
                            f147353f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
