package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.hs */
/* compiled from: PG */
public final class C51438hs extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51438hs f133965b;

    /* renamed from: c */
    private static volatile C63010eb f133966c;

    /* renamed from: a */
    public C62971cq f133967a = C62942bv.emptyProtobufList();

    static {
        C51438hs hsVar = new C51438hs();
        f133965b = hsVar;
        C62942bv.registerDefaultInstance(C51438hs.class, hsVar);
    }

    private C51438hs() {
    }

    /* renamed from: a */
    public final void mo53615a() {
        C62971cq cqVar = this.f133967a;
        if (!cqVar.mo58948c()) {
            this.f133967a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f133965b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C51438hs();
            case 4:
                return new C51437hr();
            case 5:
                return f133965b;
            case 6:
                C63010eb ebVar = f133966c;
                if (ebVar == null) {
                    synchronized (C51438hs.class) {
                        ebVar = f133966c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133965b);
                            f133966c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
