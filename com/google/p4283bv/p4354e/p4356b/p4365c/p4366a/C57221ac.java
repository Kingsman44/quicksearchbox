package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.c.a.ac */
/* compiled from: PG */
public final class C57221ac extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C57221ac f152750e;

    /* renamed from: h */
    private static volatile C63010eb f152751h;

    /* renamed from: a */
    public int f152752a = 0;

    /* renamed from: b */
    public Object f152753b;

    /* renamed from: c */
    public int f152754c;

    /* renamed from: d */
    public C57288cp f152755d;

    /* renamed from: f */
    private int f152756f;

    /* renamed from: g */
    private byte f152757g = 2;

    static {
        C57221ac acVar = new C57221ac();
        f152750e = acVar;
        C62942bv.registerDefaultInstance(C57221ac.class, acVar);
    }

    private C57221ac() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152757g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152757g = b;
                return null;
            case 2:
                return newMessageInfo(f152750e, "\u0001\u0007\u0001\u0001\u0001\t\u0007\u0000\u0000\u0004\u0001ဌ\u0000\u0002ဉ\u0001\u0003ᐼ\u0000\u0005ᐼ\u0000\u0006ᐼ\u0000\bᐼ\u0000\tြ\u0000", new Object[]{"b", "a", C10662f.f35572a, C45240c.f118157a, C57219aa.f152749a, "d", C57235aq.class, C57315dp.class, C57292ct.class, C57280ch.class, C57307dh.class});
            case 3:
                return new C57221ac();
            case 4:
                return new C57343z();
            case 5:
                return f152750e;
            case 6:
                C63010eb ebVar = f152751h;
                if (ebVar == null) {
                    synchronized (C57221ac.class) {
                        ebVar = f152751h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152750e);
                            f152751h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
