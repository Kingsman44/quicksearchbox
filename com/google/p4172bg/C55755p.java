package com.google.p4172bg;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bg.p */
/* compiled from: PG */
public final class C55755p extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55755p f147130c;

    /* renamed from: d */
    private static volatile C63010eb f147131d;

    /* renamed from: a */
    public double f147132a;

    /* renamed from: b */
    public String f147133b = BuildConfig.FLAVOR;

    static {
        C55755p pVar = new C55755p();
        f147130c = pVar;
        C62942bv.registerDefaultInstance(C55755p.class, pVar);
    }

    private C55755p() {
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
                return newMessageInfo(f147130c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C55755p();
            case 4:
                return new C55754o();
            case 5:
                return f147130c;
            case 6:
                C63010eb ebVar = f147131d;
                if (ebVar == null) {
                    synchronized (C55755p.class) {
                        ebVar = f147131d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147130c);
                            f147131d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
