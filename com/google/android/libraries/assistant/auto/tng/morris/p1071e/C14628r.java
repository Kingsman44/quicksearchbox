package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.r */
/* compiled from: PG */
public final class C14628r extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C14628r f44209d;

    /* renamed from: e */
    private static volatile C63010eb f44210e;

    /* renamed from: a */
    public C62971cq f44211a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f44212b = emptyProtobufList();

    /* renamed from: c */
    public boolean f44213c;

    static {
        C14628r rVar = new C14628r();
        f44209d = rVar;
        C62942bv.registerDefaultInstance(C14628r.class, rVar);
    }

    private C14628r() {
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
                return newMessageInfo(f44209d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003\u0007", new Object[]{"a", C14636z.class, "b", C14528mo.class, C45240c.f118157a});
            case 3:
                return new C14628r();
            case 4:
                return new C14621q();
            case 5:
                return f44209d;
            case 6:
                C63010eb ebVar = f44210e;
                if (ebVar == null) {
                    synchronized (C14628r.class) {
                        ebVar = f44210e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f44209d);
                            f44210e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
