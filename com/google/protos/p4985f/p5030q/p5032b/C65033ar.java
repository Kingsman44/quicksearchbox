package com.google.protos.p4985f.p5030q.p5032b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65137b;
import com.google.protos.p5129p.p5131b.C65768az;

/* renamed from: com.google.protos.f.q.b.ar */
/* compiled from: PG */
public final class C65033ar extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65033ar f176111c;

    /* renamed from: f */
    private static volatile C63010eb f176112f;

    /* renamed from: a */
    public C62971cq f176113a = emptyProtobufList();

    /* renamed from: b */
    public C65137b f176114b;

    /* renamed from: d */
    private int f176115d;

    /* renamed from: e */
    private byte f176116e = 2;

    static {
        C65033ar arVar = new C65033ar();
        f176111c = arVar;
        C62942bv.registerDefaultInstance(C65033ar.class, arVar);
    }

    private C65033ar() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f176116e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f176116e = b;
                return null;
            case 2:
                return newMessageInfo(f176111c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000", new Object[]{"d", "a", C65768az.class, "b"});
            case 3:
                return new C65033ar();
            case 4:
                return new C65032aq();
            case 5:
                return f176111c;
            case 6:
                C63010eb ebVar = f176112f;
                if (ebVar == null) {
                    synchronized (C65033ar.class) {
                        ebVar = f176112f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176111c);
                            f176112f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
