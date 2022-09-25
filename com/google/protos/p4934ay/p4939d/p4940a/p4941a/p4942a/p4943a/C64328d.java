package com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p5048z.p5053c.p5055b.p5056a.C65423d;

/* renamed from: com.google.protos.ay.d.a.a.a.a.d */
/* compiled from: PG */
public final class C64328d extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C64328d f173910c;

    /* renamed from: e */
    private static volatile C63010eb f173911e;

    /* renamed from: a */
    public int f173912a = 0;

    /* renamed from: b */
    public Object f173913b;

    /* renamed from: d */
    private byte f173914d = 2;

    static {
        C64328d dVar = new C64328d();
        f173910c = dVar;
        C62942bv.registerDefaultInstance(C64328d.class, dVar);
    }

    private C64328d() {
        C63088z zVar = C63088z.f170246b;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f173914d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f173914d = b;
                return null;
            case 2:
                return newMessageInfo(f173910c, "\u0001\b\u0001\u0000\u0001\t\b\u0000\u0000\u0003\u0001ြ\u0000\u0002ᐼ\u0000\u0004ᐼ\u0000\u0005ᐼ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000", new Object[]{"b", "a", C64340p.class, C64304aw.class, C64350z.class, C65423d.class, C64346v.class, C64295an.class, C64336l.class, C64317bi.class});
            case 3:
                return new C64328d();
            case 4:
                return new C64327c();
            case 5:
                return f173910c;
            case 6:
                C63010eb ebVar = f173911e;
                if (ebVar == null) {
                    synchronized (C64328d.class) {
                        ebVar = f173911e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173910c);
                            f173911e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
