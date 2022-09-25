package com.google.android.apps.search.googleapp.discover.channels;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4479cg.C58070b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.channels.bp */
/* compiled from: PG */
public final class C134154bp extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C134154bp f365444e;

    /* renamed from: f */
    private static volatile C63010eb f365445f;

    /* renamed from: a */
    public int f365446a;

    /* renamed from: b */
    public C58070b f365447b;

    /* renamed from: c */
    public C58070b f365448c;

    /* renamed from: d */
    public C134152bn f365449d;

    static {
        C134154bp bpVar = new C134154bp();
        f365444e = bpVar;
        C62942bv.registerDefaultInstance(C134154bp.class, bpVar);
    }

    private C134154bp() {
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
                return newMessageInfo(f365444e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C134154bp();
            case 4:
                return new C134153bo();
            case 5:
                return f365444e;
            case 6:
                C63010eb ebVar = f365445f;
                if (ebVar == null) {
                    synchronized (C134154bp.class) {
                        ebVar = f365445f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f365444e);
                            f365445f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
