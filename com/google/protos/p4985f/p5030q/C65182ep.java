package com.google.protos.p4985f.p5030q;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.ep */
/* compiled from: PG */
public final class C65182ep extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C65182ep f176392d;

    /* renamed from: f */
    private static volatile C63010eb f176393f;

    /* renamed from: a */
    public int f176394a;

    /* renamed from: b */
    public C65191ey f176395b;

    /* renamed from: c */
    public C61752n f176396c;

    /* renamed from: e */
    private byte f176397e = 2;

    static {
        C65182ep epVar = new C65182ep();
        f176392d = epVar;
        C62942bv.registerDefaultInstance(C65182ep.class, epVar);
    }

    private C65182ep() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f176397e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f176397e = b;
                return null;
            case 2:
                return newMessageInfo(f176392d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C65182ep();
            case 4:
                return new C65181eo();
            case 5:
                return f176392d;
            case 6:
                C63010eb ebVar = f176393f;
                if (ebVar == null) {
                    synchronized (C65182ep.class) {
                        ebVar = f176393f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176392d);
                            f176393f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
