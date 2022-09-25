package com.google.common.p4552o.p4563i;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63237j;

/* renamed from: com.google.common.o.i.bf */
/* compiled from: PG */
public final class C59897bf extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C59897bf f161859f;

    /* renamed from: g */
    private static volatile C63010eb f161860g;

    /* renamed from: a */
    public int f161861a;

    /* renamed from: b */
    public C63088z f161862b = C63088z.f170246b;

    /* renamed from: c */
    public boolean f161863c;

    /* renamed from: d */
    public boolean f161864d;

    /* renamed from: e */
    public C63237j f161865e;

    static {
        C59897bf bfVar = new C59897bf();
        f161859f = bfVar;
        C62942bv.registerDefaultInstance(C59897bf.class, bfVar);
    }

    private C59897bf() {
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
                return newMessageInfo(f161859f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C59897bf();
            case 4:
                return new C59896be();
            case 5:
                return f161859f;
            case 6:
                C63010eb ebVar = f161860g;
                if (ebVar == null) {
                    synchronized (C59897bf.class) {
                        ebVar = f161860g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161859f);
                            f161860g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
