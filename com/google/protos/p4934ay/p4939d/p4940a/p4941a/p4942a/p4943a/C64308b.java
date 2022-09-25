package com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p5048z.p5053c.p5055b.p5056a.C65421b;

/* renamed from: com.google.protos.ay.d.a.a.a.a.b */
/* compiled from: PG */
public final class C64308b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64308b f173874c;

    /* renamed from: e */
    private static volatile C63010eb f173875e;

    /* renamed from: a */
    public int f173876a = 0;

    /* renamed from: b */
    public Object f173877b;

    /* renamed from: d */
    private byte f173878d = 2;

    static {
        C64308b bVar = new C64308b();
        f173874c = bVar;
        C62942bv.registerDefaultInstance(C64308b.class, bVar);
    }

    private C64308b() {
        C63088z zVar = C63088z.f170246b;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f173878d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f173878d = b;
                return null;
            case 2:
                return newMessageInfo(f173874c, "\u0001\b\u0001\u0000\u0001\n\b\u0000\u0000\u0003\u0001ြ\u0000\u0002ᐼ\u0000\u0004ᐼ\u0000\u0005ᐼ\u0000\u0006ြ\u0000\u0007ြ\u0000\tြ\u0000\nြ\u0000", new Object[]{"b", "a", C64338n.class, C64302au.class, C64348x.class, C65421b.class, C64344t.class, C64293al.class, C64334j.class, C64313be.class});
            case 3:
                return new C64308b();
            case 4:
                return new C64279a();
            case 5:
                return f173874c;
            case 6:
                C63010eb ebVar = f173875e;
                if (ebVar == null) {
                    synchronized (C64308b.class) {
                        ebVar = f173875e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173874c);
                            f173875e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
