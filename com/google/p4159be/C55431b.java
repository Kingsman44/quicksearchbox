package com.google.p4159be;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5230n.p5231a.C67379p;

/* renamed from: com.google.be.b */
/* compiled from: PG */
public final class C55431b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C55431b f146250b;

    /* renamed from: d */
    private static volatile C63010eb f146251d;

    /* renamed from: a */
    public C62971cq f146252a = emptyProtobufList();

    /* renamed from: c */
    private byte f146253c = 2;

    static {
        C55431b bVar = new C55431b();
        f146250b = bVar;
        C62942bv.registerDefaultInstance(C55431b.class, bVar);
    }

    private C55431b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f146253c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f146253c = b;
                return null;
            case 2:
                return newMessageInfo(f146250b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002Л", new Object[]{"a", C67379p.class});
            case 3:
                return new C55431b();
            case 4:
                return new C55430a();
            case 5:
                return f146250b;
            case 6:
                C63010eb ebVar = f146251d;
                if (ebVar == null) {
                    synchronized (C55431b.class) {
                        ebVar = f146251d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146250b);
                            f146251d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
