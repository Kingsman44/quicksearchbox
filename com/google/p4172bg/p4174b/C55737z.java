package com.google.p4172bg.p4174b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bg.b.z */
/* compiled from: PG */
public final class C55737z extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55737z f147095a;

    /* renamed from: b */
    private static volatile C63010eb f147096b;

    static {
        C55737z zVar = new C55737z();
        f147095a = zVar;
        C62942bv.registerDefaultInstance(C55737z.class, zVar);
    }

    private C55737z() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(f147095a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C55737z();
            case 4:
                return new C55736y();
            case 5:
                return f147095a;
            case 6:
                C63010eb ebVar = f147096b;
                if (ebVar == null) {
                    synchronized (C55737z.class) {
                        ebVar = f147096b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147095a);
                            f147096b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
