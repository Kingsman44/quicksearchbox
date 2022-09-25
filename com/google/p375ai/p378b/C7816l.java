package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import java.util.List;

/* renamed from: com.google.ai.b.l */
/* compiled from: PG */
public final class C7816l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C7816l f27316c;

    /* renamed from: e */
    private static volatile C63010eb f27317e;

    /* renamed from: a */
    public int f27318a;

    /* renamed from: b */
    public int f27319b;

    /* renamed from: d */
    private C62971cq f27320d = emptyProtobufList();

    static {
        C7816l lVar = new C7816l();
        f27316c = lVar;
        C62942bv.registerDefaultInstance(C7816l.class, lVar);
    }

    private C7816l() {
    }

    /* renamed from: a */
    public final List mo16971a() {
        return this.f27320d;
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
                return newMessageInfo(f27316c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"a", "b", C8099vm.f28485a, "d", C7832lp.class});
            case 3:
                return new C7816l();
            case 4:
                return new C7789k();
            case 5:
                return f27316c;
            case 6:
                C63010eb ebVar = f27317e;
                if (ebVar == null) {
                    synchronized (C7816l.class) {
                        ebVar = f27317e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27316c);
                            f27317e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
