package com.google.protos.p5127o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.o.af */
/* compiled from: PG */
public final class C65651af extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C65651af f178388d;

    /* renamed from: f */
    private static volatile C63010eb f178389f;

    /* renamed from: a */
    public int f178390a;

    /* renamed from: b */
    public C65678d f178391b;

    /* renamed from: c */
    public C65693s f178392c;

    /* renamed from: e */
    private byte f178393e = 2;

    static {
        C65651af afVar = new C65651af();
        f178388d = afVar;
        C62942bv.registerDefaultInstance(C65651af.class, afVar);
    }

    private C65651af() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f178393e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f178393e = b;
                return null;
            case 2:
                return newMessageInfo(f178388d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C65651af();
            case 4:
                return new C65650ae();
            case 5:
                return f178388d;
            case 6:
                C63010eb ebVar = f178389f;
                if (ebVar == null) {
                    synchronized (C65651af.class) {
                        ebVar = f178389f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178388d);
                            f178389f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
