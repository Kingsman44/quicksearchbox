package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p5036r.C65320f;

/* renamed from: com.google.assistant.at.ed */
/* compiled from: PG */
public final class C49927ed extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49927ed f129772c;

    /* renamed from: e */
    private static volatile C63010eb f129773e;

    /* renamed from: a */
    public int f129774a;

    /* renamed from: b */
    public C62971cq f129775b = emptyProtobufList();

    /* renamed from: d */
    private int f129776d;

    static {
        C49927ed edVar = new C49927ed();
        f129772c = edVar;
        C62942bv.registerDefaultInstance(C49927ed.class, edVar);
    }

    private C49927ed() {
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
                return newMessageInfo(f129772c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"d", "a", C65320f.f176654a, "b", C49937en.class});
            case 3:
                return new C49927ed();
            case 4:
                return new C49926ec();
            case 5:
                return f129772c;
            case 6:
                C63010eb ebVar = f129773e;
                if (ebVar == null) {
                    synchronized (C49927ed.class) {
                        ebVar = f129773e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129772c);
                            f129773e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
