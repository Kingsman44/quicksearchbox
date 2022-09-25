package com.google.assistant.p3931f.p3939c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.f.c.s */
/* compiled from: PG */
public final class C52842s extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52842s f138640d;

    /* renamed from: e */
    private static volatile C63010eb f138641e;

    /* renamed from: a */
    public String f138642a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f138643b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f138644c = emptyProtobufList();

    static {
        C52842s sVar = new C52842s();
        f138640d = sVar;
        C62942bv.registerDefaultInstance(C52842s.class, sVar);
    }

    private C52842s() {
    }

    /* renamed from: a */
    public final void mo53928a() {
        C62971cq cqVar = this.f138643b;
        if (!cqVar.mo58948c()) {
            this.f138643b = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f138640d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003\u001b", new Object[]{"a", "b", C52818ah.class, C45240c.f118157a, C52844u.class});
            case 3:
                return new C52842s();
            case 4:
                return new C52841r();
            case 5:
                return f138640d;
            case 6:
                C63010eb ebVar = f138641e;
                if (ebVar == null) {
                    synchronized (C52842s.class) {
                        ebVar = f138641e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138640d);
                            f138641e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
