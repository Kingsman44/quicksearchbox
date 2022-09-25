package com.google.android.libraries.assistant.p1533o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.o.n */
/* compiled from: PG */
public final class C18496n extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C18496n f52438d;

    /* renamed from: e */
    private static volatile C63010eb f52439e;

    /* renamed from: a */
    public C62971cq f52440a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f52441b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f52442c = C62942bv.emptyProtobufList();

    static {
        C18496n nVar = new C18496n();
        f52438d = nVar;
        C62942bv.registerDefaultInstance(C18496n.class, nVar);
    }

    private C18496n() {
    }

    /* renamed from: a */
    public final void mo24009a() {
        C62971cq cqVar = this.f52440a;
        if (!cqVar.mo58948c()) {
            this.f52440a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: b */
    public final void mo24010b() {
        C62971cq cqVar = this.f52441b;
        if (!cqVar.mo58948c()) {
            this.f52441b = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f52438d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003Ț", new Object[]{"a", C18490h.class, "b", C18505w.class, C45240c.f118157a});
            case 3:
                return new C18496n();
            case 4:
                return new C18495m();
            case 5:
                return f52438d;
            case 6:
                C63010eb ebVar = f52439e;
                if (ebVar == null) {
                    synchronized (C18496n.class) {
                        ebVar = f52439e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f52438d);
                            f52439e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
