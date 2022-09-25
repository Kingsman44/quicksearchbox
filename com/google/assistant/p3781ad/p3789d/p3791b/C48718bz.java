package com.google.assistant.p3781ad.p3789d.p3791b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.bz */
/* compiled from: PG */
public final class C48718bz extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48718bz f126051b;

    /* renamed from: c */
    private static volatile C63010eb f126052c;

    /* renamed from: a */
    public C62971cq f126053a = emptyProtobufList();

    static {
        C48718bz bzVar = new C48718bz();
        f126051b = bzVar;
        C62942bv.registerDefaultInstance(C48718bz.class, bzVar);
    }

    private C48718bz() {
    }

    /* renamed from: a */
    public final void mo53178a() {
        C62971cq cqVar = this.f126053a;
        if (!cqVar.mo58948c()) {
            this.f126053a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f126051b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C48716bx.class});
            case 3:
                return new C48718bz();
            case 4:
                return new C48717by();
            case 5:
                return f126051b;
            case 6:
                C63010eb ebVar = f126052c;
                if (ebVar == null) {
                    synchronized (C48718bz.class) {
                        ebVar = f126052c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126051b);
                            f126052c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
