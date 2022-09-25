package com.google.p4172bg;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bg.y */
/* compiled from: PG */
public final class C55764y extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55764y f147153c;

    /* renamed from: d */
    private static volatile C63010eb f147154d;

    /* renamed from: a */
    public String f147155a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f147156b = emptyProtobufList();

    static {
        C55764y yVar = new C55764y();
        f147153c = yVar;
        C62942bv.registerDefaultInstance(C55764y.class, yVar);
    }

    private C55764y() {
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
                return newMessageInfo(f147153c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"a", "b", C55762w.class});
            case 3:
                return new C55764y();
            case 4:
                return new C55763x();
            case 5:
                return f147153c;
            case 6:
                C63010eb ebVar = f147154d;
                if (ebVar == null) {
                    synchronized (C55764y.class) {
                        ebVar = f147154d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147153c);
                            f147154d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
