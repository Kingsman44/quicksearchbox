package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.agt */
/* compiled from: PG */
public final class agt extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final agt f129256f;

    /* renamed from: g */
    private static volatile C63010eb f129257g;

    /* renamed from: a */
    public int f129258a;

    /* renamed from: b */
    public C62971cq f129259b = emptyProtobufList();

    /* renamed from: c */
    public boolean f129260c;

    /* renamed from: d */
    public C62971cq f129261d = emptyProtobufList();

    /* renamed from: e */
    public boolean f129262e;

    static {
        agt agt = new agt();
        f129256f = agt;
        C62942bv.registerDefaultInstance(agt.class, agt);
    }

    private agt() {
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
                return newMessageInfo(f129256f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0004ဇ\u0000\u0005ဇ\u0001", new Object[]{"a", "b", agp.class, "d", agp.class, C45240c.f118157a, "e"});
            case 3:
                return new agt();
            case 4:
                return new ags();
            case 5:
                return f129256f;
            case 6:
                C63010eb ebVar = f129257g;
                if (ebVar == null) {
                    synchronized (agt.class) {
                        ebVar = f129257g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129256f);
                            f129257g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
