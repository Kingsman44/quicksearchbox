package com.google.android.apps.search.assistant.platform.p9080f.p9123l;

import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.f.l.f */
/* compiled from: PG */
public final class C120813f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C120813f f335969b;

    /* renamed from: c */
    private static volatile C63010eb f335970c;

    /* renamed from: a */
    public C62971cq f335971a = emptyProtobufList();

    static {
        C120813f fVar = new C120813f();
        f335969b = fVar;
        C62942bv.registerDefaultInstance(C120813f.class, fVar);
    }

    private C120813f() {
    }

    /* renamed from: a */
    public final void mo104939a() {
        C62971cq cqVar = this.f335971a;
        if (!cqVar.mo58948c()) {
            this.f335971a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f335969b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", C52083ep.class});
            case 3:
                return new C120813f();
            case 4:
                return new C120812e();
            case 5:
                return f335969b;
            case 6:
                C63010eb ebVar = f335970c;
                if (ebVar == null) {
                    synchronized (C120813f.class) {
                        ebVar = f335970c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f335969b);
                            f335970c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
