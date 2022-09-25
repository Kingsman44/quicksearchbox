package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.ve */
/* compiled from: PG */
public final class C8091ve extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C8091ve f28455e;

    /* renamed from: f */
    private static volatile C63010eb f28456f;

    /* renamed from: a */
    public int f28457a;

    /* renamed from: b */
    public C62971cq f28458b = emptyProtobufList();

    /* renamed from: c */
    public boolean f28459c = true;

    /* renamed from: d */
    public String f28460d = BuildConfig.FLAVOR;

    static {
        C8091ve veVar = new C8091ve();
        f28455e = veVar;
        C62942bv.registerDefaultInstance(C8091ve.class, veVar);
    }

    private C8091ve() {
    }

    /* renamed from: a */
    public final void mo17011a() {
        C62971cq cqVar = this.f28458b;
        if (!cqVar.mo58948c()) {
            this.f28458b = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f28455e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001\u001b\u0003ဇ\u0001\u0004ဈ\u0002", new Object[]{"a", "b", C8090vd.class, C45240c.f118157a, "d"});
            case 3:
                return new C8091ve();
            case 4:
                return new C8085uz();
            case 5:
                return f28455e;
            case 6:
                C63010eb ebVar = f28456f;
                if (ebVar == null) {
                    synchronized (C8091ve.class) {
                        ebVar = f28456f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28455e);
                            f28456f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
