package com.google.protos.p4985f.p5030q;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3929l.p3930a.C52792t;
import com.google.p4184bj.C55910c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.el */
/* compiled from: PG */
public final class C65178el extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65178el f176383b;

    /* renamed from: f */
    private static volatile C63010eb f176384f;

    /* renamed from: a */
    public boolean f176385a;

    /* renamed from: c */
    private C52792t f176386c;

    /* renamed from: d */
    private C55910c f176387d;

    /* renamed from: e */
    private byte f176388e = 2;

    static {
        C65178el elVar = new C65178el();
        f176383b = elVar;
        C62942bv.registerDefaultInstance(C65178el.class, elVar);
    }

    private C65178el() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f176388e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f176388e = b;
                return null;
            case 2:
                return newMessageInfo(f176383b, "\u0000\u0003\u0000\u0000\u0002\u0006\u0003\u0000\u0000\u0002\u0002\u0007\u0004Љ\u0006Љ", new Object[]{"a", C45240c.f118157a, "d"});
            case 3:
                return new C65178el();
            case 4:
                return new C65177ek();
            case 5:
                return f176383b;
            case 6:
                C63010eb ebVar = f176384f;
                if (ebVar == null) {
                    synchronized (C65178el.class) {
                        ebVar = f176384f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176383b);
                            f176384f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
