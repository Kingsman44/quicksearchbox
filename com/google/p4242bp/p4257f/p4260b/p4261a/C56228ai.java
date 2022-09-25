package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.b.a.ai */
/* compiled from: PG */
public final class C56228ai extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56228ai f149768b;

    /* renamed from: c */
    private static volatile C63010eb f149769c;

    /* renamed from: a */
    public C62971cq f149770a = C62942bv.emptyProtobufList();

    static {
        C56228ai aiVar = new C56228ai();
        f149768b = aiVar;
        C62942bv.registerDefaultInstance(C56228ai.class, aiVar);
    }

    private C56228ai() {
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
                return newMessageInfo(f149768b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C56228ai();
            case 4:
                return new C56227ah();
            case 5:
                return f149768b;
            case 6:
                C63010eb ebVar = f149769c;
                if (ebVar == null) {
                    synchronized (C56228ai.class) {
                        ebVar = f149769c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149768b);
                            f149769c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
