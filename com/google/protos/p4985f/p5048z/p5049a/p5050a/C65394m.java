package com.google.protos.p4985f.p5048z.p5049a.p5050a;

import com.google.assistant.p3825an.p3830c.p3831a.C49330g;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.z.a.a.m */
/* compiled from: PG */
public final class C65394m extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65394m f177809b;

    /* renamed from: c */
    private static volatile C63010eb f177810c;

    /* renamed from: a */
    public C62971cq f177811a = emptyProtobufList();

    static {
        C65394m mVar = new C65394m();
        f177809b = mVar;
        C62942bv.registerDefaultInstance(C65394m.class, mVar);
    }

    private C65394m() {
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
                return newMessageInfo(f177809b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C49330g.class});
            case 3:
                return new C65394m();
            case 4:
                return new C65393l();
            case 5:
                return f177809b;
            case 6:
                C63010eb ebVar = f177810c;
                if (ebVar == null) {
                    synchronized (C65394m.class) {
                        ebVar = f177810c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177809b);
                            f177810c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
