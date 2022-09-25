package com.google.android.libraries.assistant.auto.tng.suggestions.p1263k;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3994s.p3995a.C53435nu;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.k.ar */
/* compiled from: PG */
public final class C16344ar extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C16344ar f48114e;

    /* renamed from: g */
    private static volatile C63010eb f48115g;

    /* renamed from: a */
    public int f48116a;

    /* renamed from: b */
    public C53435nu f48117b;

    /* renamed from: c */
    public int f48118c;

    /* renamed from: d */
    public boolean f48119d;

    /* renamed from: f */
    private byte f48120f = 2;

    static {
        C16344ar arVar = new C16344ar();
        f48114e = arVar;
        C62942bv.registerDefaultInstance(C16344ar.class, arVar);
    }

    private C16344ar() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f48120f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f48120f = b;
                return null;
            case 2:
                return newMessageInfo(f48114e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဌ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, C16341ao.f48113a, "d"});
            case 3:
                return new C16344ar();
            case 4:
                return new C16343aq();
            case 5:
                return f48114e;
            case 6:
                C63010eb ebVar = f48115g;
                if (ebVar == null) {
                    synchronized (C16344ar.class) {
                        ebVar = f48115g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48114e);
                            f48115g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
