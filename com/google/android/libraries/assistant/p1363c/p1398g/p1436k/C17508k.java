package com.google.android.libraries.assistant.p1363c.p1398g.p1436k;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.c.g.k.k */
/* compiled from: PG */
public final class C17508k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C17508k f50521c;

    /* renamed from: d */
    private static volatile C63010eb f50522d;

    /* renamed from: a */
    public int f50523a = 0;

    /* renamed from: b */
    public Object f50524b;

    static {
        C17508k kVar = new C17508k();
        f50521c = kVar;
        C62942bv.registerDefaultInstance(C17508k.class, kVar);
    }

    private C17508k() {
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
                return newMessageInfo(f50521c, "\u0001\b\u0001\u0000\u0001\t\b\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000", new Object[]{"b", "a", C17494bc.class, C17514q.class, C17516s.class, C17501d.class, C17491b.class, C17505h.class, C17518u.class, C17512o.class});
            case 3:
                return new C17508k();
            case 4:
                return new C17506i();
            case 5:
                return f50521c;
            case 6:
                C63010eb ebVar = f50522d;
                if (ebVar == null) {
                    synchronized (C17508k.class) {
                        ebVar = f50522d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f50521c);
                            f50522d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
