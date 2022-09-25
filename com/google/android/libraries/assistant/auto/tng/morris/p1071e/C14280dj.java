package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123749bp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.dj */
/* compiled from: PG */
public final class C14280dj extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14280dj f43192b;

    /* renamed from: c */
    private static volatile C63010eb f43193c;

    /* renamed from: a */
    public C62971cq f43194a = emptyProtobufList();

    static {
        C14280dj djVar = new C14280dj();
        f43192b = djVar;
        C62942bv.registerDefaultInstance(C14280dj.class, djVar);
    }

    private C14280dj() {
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
                return newMessageInfo(f43192b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C123749bp.class});
            case 3:
                return new C14280dj();
            case 4:
                return new C14279di();
            case 5:
                return f43192b;
            case 6:
                C63010eb ebVar = f43193c;
                if (ebVar == null) {
                    synchronized (C14280dj.class) {
                        ebVar = f43193c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43192b);
                            f43193c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
