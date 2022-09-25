package com.google.protos.p4985f.p5030q;

import com.google.assistant.p3825an.p3834e.p3835a.C49362d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.ik */
/* compiled from: PG */
public final class C65285ik extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65285ik f176599b;

    /* renamed from: c */
    private static volatile C63010eb f176600c;

    /* renamed from: a */
    public C62971cq f176601a = emptyProtobufList();

    static {
        C65285ik ikVar = new C65285ik();
        f176599b = ikVar;
        C62942bv.registerDefaultInstance(C65285ik.class, ikVar);
    }

    private C65285ik() {
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
                return newMessageInfo(f176599b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C49362d.class});
            case 3:
                return new C65285ik();
            case 4:
                return new C65284ij();
            case 5:
                return f176599b;
            case 6:
                C63010eb ebVar = f176600c;
                if (ebVar == null) {
                    synchronized (C65285ik.class) {
                        ebVar = f176600c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176599b);
                            f176600c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
