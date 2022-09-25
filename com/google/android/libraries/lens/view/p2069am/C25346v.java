package com.google.android.libraries.lens.view.p2069am;

import com.google.android.libraries.lens.ondevice.p2037n.C24778ak;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.am.v */
/* compiled from: PG */
public final class C25346v extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C25346v f68994b;

    /* renamed from: c */
    private static volatile C63010eb f68995c;

    /* renamed from: a */
    public C62971cq f68996a = emptyProtobufList();

    static {
        C25346v vVar = new C25346v();
        f68994b = vVar;
        C62942bv.registerDefaultInstance(C25346v.class, vVar);
    }

    private C25346v() {
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
                return newMessageInfo(f68994b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C24778ak.class});
            case 3:
                return new C25346v();
            case 4:
                return new C25345u();
            case 5:
                return f68994b;
            case 6:
                C63010eb ebVar = f68995c;
                if (ebVar == null) {
                    synchronized (C25346v.class) {
                        ebVar = f68995c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68994b);
                            f68995c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
