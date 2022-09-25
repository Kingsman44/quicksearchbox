package com.google.speech.p5208h;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.h.dq */
/* compiled from: PG */
public final class C66650dq extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66650dq f181323d;

    /* renamed from: e */
    public static final C62940bt f181324e;

    /* renamed from: f */
    private static volatile C63010eb f181325f;

    /* renamed from: a */
    public int f181326a;

    /* renamed from: b */
    public C62971cq f181327b = emptyProtobufList();

    /* renamed from: c */
    public boolean f181328c;

    static {
        C66650dq dqVar = new C66650dq();
        f181323d = dqVar;
        C62942bv.registerDefaultInstance(C66650dq.class, dqVar);
        f181324e = C62942bv.newSingularGeneratedExtension(C66607ce.f181191f, dqVar, dqVar, (C62958ce) null, 126706086, C63066gd.MESSAGE, C66650dq.class);
    }

    private C66650dq() {
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        emptyIntList();
        emptyProtobufList();
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
                return newMessageInfo(f181323d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0000\u0001\u001b\u0004ဇ\u0001", new Object[]{"a", "b", C66648do.class, C45240c.f118157a});
            case 3:
                return new C66650dq();
            case 4:
                return new C66649dp();
            case 5:
                return f181323d;
            case 6:
                C63010eb ebVar = f181325f;
                if (ebVar == null) {
                    synchronized (C66650dq.class) {
                        ebVar = f181325f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181323d);
                            f181325f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
