package com.google.assistant.p3781ad.p3789d.p3790a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3781ad.p3789d.p3791b.C48680ao;
import com.google.assistant.p3781ad.p3789d.p3791b.C48708bp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.a.q */
/* compiled from: PG */
public final class C48564q extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48564q f125461d;

    /* renamed from: f */
    private static volatile C63010eb f125462f;

    /* renamed from: a */
    public C62971cq f125463a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f125464b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f125465c = emptyProtobufList();

    /* renamed from: e */
    private byte f125466e = 2;

    static {
        C48564q qVar = new C48564q();
        f125461d = qVar;
        C62942bv.registerDefaultInstance(C48564q.class, qVar);
    }

    private C48564q() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f125466e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f125466e = b;
                return null;
            case 2:
                return newMessageInfo(f125461d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0002\u0001Л\u0002Л\u0003\u001b", new Object[]{"a", C48708bp.class, "b", C48680ao.class, C45240c.f118157a, C48566s.class});
            case 3:
                return new C48564q();
            case 4:
                return new C48563p();
            case 5:
                return f125461d;
            case 6:
                C63010eb ebVar = f125462f;
                if (ebVar == null) {
                    synchronized (C48564q.class) {
                        ebVar = f125462f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125461d);
                            f125462f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
