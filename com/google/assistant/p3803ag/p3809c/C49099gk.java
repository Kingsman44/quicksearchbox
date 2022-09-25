package com.google.assistant.p3803ag.p3809c;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.gk */
/* compiled from: PG */
public final class C49099gk extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C49099gk f126983g;

    /* renamed from: h */
    private static volatile C63010eb f126984h;

    /* renamed from: a */
    public int f126985a;

    /* renamed from: b */
    public C62971cq f126986b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f126987c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f126988d = emptyProtobufList();

    /* renamed from: e */
    public C62971cq f126989e = emptyProtobufList();

    /* renamed from: f */
    public C49147q f126990f;

    static {
        C49099gk gkVar = new C49099gk();
        f126983g = gkVar;
        C62942bv.registerDefaultInstance(C49099gk.class, gkVar);
    }

    private C49099gk() {
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
                return newMessageInfo(f126983g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0004\u001b\u0005\u001b\u0006ဉ\u0000", new Object[]{"a", "b", C49144n.class, "d", C49040ef.class, C45240c.f118157a, C49050ep.class, "e", C49105gq.class, C10662f.f35572a});
            case 3:
                return new C49099gk();
            case 4:
                return new C49098gj();
            case 5:
                return f126983g;
            case 6:
                C63010eb ebVar = f126984h;
                if (ebVar == null) {
                    synchronized (C49099gk.class) {
                        ebVar = f126984h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126983g);
                            f126984h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
