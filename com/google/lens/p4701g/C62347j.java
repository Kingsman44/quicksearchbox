package com.google.lens.p4701g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.j */
/* compiled from: PG */
public final class C62347j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62347j f168312b;

    /* renamed from: e */
    private static volatile C63010eb f168313e;

    /* renamed from: a */
    public C56220aa f168314a;

    /* renamed from: c */
    private int f168315c;

    /* renamed from: d */
    private byte f168316d = 2;

    static {
        C62347j jVar = new C62347j();
        f168312b = jVar;
        C62942bv.registerDefaultInstance(C62347j.class, jVar);
    }

    private C62347j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f168316d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f168316d = b;
                return null;
            case 2:
                return newMessageInfo(f168312b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C62347j();
            case 4:
                return new C62346i();
            case 5:
                return f168312b;
            case 6:
                C63010eb ebVar = f168313e;
                if (ebVar == null) {
                    synchronized (C62347j.class) {
                        ebVar = f168313e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168312b);
                            f168313e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
