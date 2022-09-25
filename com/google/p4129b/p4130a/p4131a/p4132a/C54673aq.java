package com.google.p4129b.p4130a.p4131a.p4132a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.a.a.a.aq */
/* compiled from: PG */
public final class C54673aq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54673aq f143514c;

    /* renamed from: d */
    private static volatile C63010eb f143515d;

    /* renamed from: a */
    public C62971cq f143516a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f143517b = emptyProtobufList();

    static {
        C54673aq aqVar = new C54673aq();
        f143514c = aqVar;
        C62942bv.registerDefaultInstance(C54673aq.class, aqVar);
    }

    private C54673aq() {
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
                return newMessageInfo(f143514c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", C54680ax.class, "b", C54740z.class});
            case 3:
                return new C54673aq();
            case 4:
                return new C54672ap();
            case 5:
                return f143514c;
            case 6:
                C63010eb ebVar = f143515d;
                if (ebVar == null) {
                    synchronized (C54673aq.class) {
                        ebVar = f143515d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143514c);
                            f143515d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
