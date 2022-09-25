package com.google.protos.p5132q;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4172bg.C55747h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.q.g */
/* compiled from: PG */
public final class C65864g extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65864g f179039b;

    /* renamed from: f */
    private static volatile C63010eb f179040f;

    /* renamed from: a */
    public int f179041a = 2;

    /* renamed from: c */
    private int f179042c;

    /* renamed from: d */
    private C55747h f179043d;

    /* renamed from: e */
    private byte f179044e = 2;

    static {
        C65864g gVar = new C65864g();
        f179039b = gVar;
        C62942bv.registerDefaultInstance(C65864g.class, gVar);
    }

    private C65864g() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179044e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f179044e = b;
                return null;
            case 2:
                return newMessageInfo(f179039b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᐉ\u0001", new Object[]{C45240c.f118157a, "a", C65862e.f179038a, "d"});
            case 3:
                return new C65864g();
            case 4:
                return new C65863f();
            case 5:
                return f179039b;
            case 6:
                C63010eb ebVar = f179040f;
                if (ebVar == null) {
                    synchronized (C65864g.class) {
                        ebVar = f179040f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179039b);
                            f179040f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
