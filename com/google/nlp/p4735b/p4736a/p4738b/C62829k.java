package com.google.nlp.p4735b.p4736a.p4738b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.b.a.b.k */
/* compiled from: PG */
public final class C62829k extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62829k f169662b;

    /* renamed from: d */
    private static volatile C63010eb f169663d;

    /* renamed from: a */
    public C62825g f169664a;

    /* renamed from: c */
    private int f169665c;

    static {
        C62829k kVar = new C62829k();
        f169662b = kVar;
        C62942bv.registerDefaultInstance(C62829k.class, kVar);
    }

    private C62829k() {
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
                return newMessageInfo(f169662b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C62829k();
            case 4:
                return new C62828j();
            case 5:
                return f169662b;
            case 6:
                C63010eb ebVar = f169663d;
                if (ebVar == null) {
                    synchronized (C62829k.class) {
                        ebVar = f169663d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169662b);
                            f169663d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
