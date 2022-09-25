package com.google.android.apps.gsa.search.core.p6884y.p6914h.p6916b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.search.core.y.h.b.b */
/* compiled from: PG */
public final class C87384b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C87384b f235966a;

    /* renamed from: b */
    private static volatile C63010eb f235967b;

    static {
        C87384b bVar = new C87384b();
        f235966a = bVar;
        C62942bv.registerDefaultInstance(C87384b.class, bVar);
    }

    private C87384b() {
        C63088z zVar = C63088z.f170246b;
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
                return newMessageInfo(f235966a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C87384b();
            case 4:
                return new C87383a();
            case 5:
                return f235966a;
            case 6:
                C63010eb ebVar = f235967b;
                if (ebVar == null) {
                    synchronized (C87384b.class) {
                        ebVar = f235967b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f235966a);
                            f235967b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
