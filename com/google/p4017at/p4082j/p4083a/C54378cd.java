package com.google.p4017at.p4082j.p4083a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.cd */
/* compiled from: PG */
public final class C54378cd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54378cd f142835c;

    /* renamed from: d */
    private static volatile C63010eb f142836d;

    /* renamed from: a */
    public C62971cq f142837a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f142838b = emptyProtobufList();

    static {
        C54378cd cdVar = new C54378cd();
        f142835c = cdVar;
        C62942bv.registerDefaultInstance(C54378cd.class, cdVar);
    }

    private C54378cd() {
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
                return newMessageInfo(f142835c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", C54396cv.class, "b", C54457v.class});
            case 3:
                return new C54378cd();
            case 4:
                return new C54377cc();
            case 5:
                return f142835c;
            case 6:
                C63010eb ebVar = f142836d;
                if (ebVar == null) {
                    synchronized (C54378cd.class) {
                        ebVar = f142836d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142835c);
                            f142836d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
