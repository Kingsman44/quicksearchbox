package com.google.assistant.p3741aa;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.aa.h */
/* compiled from: PG */
public final class C48173h extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C48173h f124650e;

    /* renamed from: f */
    private static volatile C63010eb f124651f;

    /* renamed from: a */
    public int f124652a;

    /* renamed from: b */
    public boolean f124653b = true;

    /* renamed from: c */
    public C62971cq f124654c = emptyProtobufList();

    /* renamed from: d */
    public C63088z f124655d = C63088z.f170246b;

    static {
        C48173h hVar = new C48173h();
        f124650e = hVar;
        C62942bv.registerDefaultInstance(C48173h.class, hVar);
    }

    private C48173h() {
    }

    /* renamed from: a */
    public final void mo53146a() {
        C62971cq cqVar = this.f124654c;
        if (!cqVar.mo58948c()) {
            this.f124654c = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f124650e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဇ\u0000\u0003\u001b\u0004ည\u0001", new Object[]{"a", "b", C45240c.f118157a, C48172g.class, "d"});
            case 3:
                return new C48173h();
            case 4:
                return new C48170e();
            case 5:
                return f124650e;
            case 6:
                C63010eb ebVar = f124651f;
                if (ebVar == null) {
                    synchronized (C48173h.class) {
                        ebVar = f124651f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124650e);
                            f124651f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
