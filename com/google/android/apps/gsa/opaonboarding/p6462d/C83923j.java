package com.google.android.apps.gsa.opaonboarding.p6462d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opaonboarding.d.j */
/* compiled from: PG */
public final class C83923j extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C83923j f228570d;

    /* renamed from: e */
    private static volatile C63010eb f228571e;

    /* renamed from: a */
    public int f228572a;

    /* renamed from: b */
    public C62971cq f228573b = emptyProtobufList();

    /* renamed from: c */
    public String f228574c = BuildConfig.FLAVOR;

    static {
        C83923j jVar = new C83923j();
        f228570d = jVar;
        C62942bv.registerDefaultInstance(C83923j.class, jVar);
    }

    private C83923j() {
    }

    /* renamed from: a */
    public final void mo77331a() {
        C62971cq cqVar = this.f228573b;
        if (!cqVar.mo58948c()) {
            this.f228573b = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f228570d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"a", "b", C83917d.class, C45240c.f118157a});
            case 3:
                return new C83923j();
            case 4:
                return new C83922i();
            case 5:
                return f228570d;
            case 6:
                C63010eb ebVar = f228571e;
                if (ebVar == null) {
                    synchronized (C83923j.class) {
                        ebVar = f228571e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228570d);
                            f228571e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
