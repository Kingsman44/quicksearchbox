package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.mu */
/* compiled from: PG */
public final class C51575mu extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51575mu f134418e;

    /* renamed from: f */
    private static volatile C63010eb f134419f;

    /* renamed from: a */
    public int f134420a;

    /* renamed from: b */
    public C62971cq f134421b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public int f134422c;

    /* renamed from: d */
    public C62971cq f134423d = emptyProtobufList();

    static {
        C51575mu muVar = new C51575mu();
        f134418e = muVar;
        C62942bv.registerDefaultInstance(C51575mu.class, muVar);
    }

    private C51575mu() {
    }

    /* renamed from: a */
    public final void mo53643a() {
        C62971cq cqVar = this.f134423d;
        if (!cqVar.mo58948c()) {
            this.f134423d = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f134418e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001\f\u0002Ț\u0003\f\u0004\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", C51574mt.class});
            case 3:
                return new C51575mu();
            case 4:
                return new C51572mr();
            case 5:
                return f134418e;
            case 6:
                C63010eb ebVar = f134419f;
                if (ebVar == null) {
                    synchronized (C51575mu.class) {
                        ebVar = f134419f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134418e);
                            f134419f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
