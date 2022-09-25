package com.google.protos.p4816ai.p4820d.p4826d.p4827a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ai.d.d.a.f */
/* compiled from: PG */
public final class C63233f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63233f f170841d;

    /* renamed from: e */
    private static volatile C63010eb f170842e;

    /* renamed from: a */
    public int f170843a;

    /* renamed from: b */
    public boolean f170844b;

    /* renamed from: c */
    public C62971cq f170845c = emptyProtobufList();

    static {
        C63233f fVar = new C63233f();
        f170841d = fVar;
        C62942bv.registerDefaultInstance(C63233f.class, fVar);
    }

    private C63233f() {
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
                return newMessageInfo(f170841d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001b", new Object[]{"a", "b", C45240c.f118157a, C63230c.class});
            case 3:
                return new C63233f();
            case 4:
                return new C63228a();
            case 5:
                return f170841d;
            case 6:
                C63010eb ebVar = f170842e;
                if (ebVar == null) {
                    synchronized (C63233f.class) {
                        ebVar = f170842e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170841d);
                            f170842e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
