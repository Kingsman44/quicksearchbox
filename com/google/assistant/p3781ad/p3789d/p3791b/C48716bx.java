package com.google.assistant.p3781ad.p3789d.p3791b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3781ad.p3789d.C48581ao;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.bx */
/* compiled from: PG */
public final class C48716bx extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C48716bx f126043g;

    /* renamed from: h */
    private static volatile C63010eb f126044h;

    /* renamed from: a */
    public int f126045a;

    /* renamed from: b */
    public C62971cq f126046b = emptyProtobufList();

    /* renamed from: c */
    public String f126047c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public long f126048d;

    /* renamed from: e */
    public int f126049e;

    /* renamed from: f */
    public int f126050f;

    static {
        C48716bx bxVar = new C48716bx();
        f126043g = bxVar;
        C62942bv.registerDefaultInstance(C48716bx.class, bxVar);
    }

    private C48716bx() {
    }

    /* renamed from: a */
    public final void mo53175a() {
        C62971cq cqVar = this.f126046b;
        if (!cqVar.mo58948c()) {
            this.f126046b = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f126043g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဌ\u0002\u0005ဌ\u0003", new Object[]{"a", "b", C48721cb.class, C45240c.f118157a, "d", "e", C48581ao.f125556a, C10662f.f35572a, C48674ai.m85262b()});
            case 3:
                return new C48716bx();
            case 4:
                return new C48715bw();
            case 5:
                return f126043g;
            case 6:
                C63010eb ebVar = f126044h;
                if (ebVar == null) {
                    synchronized (C48716bx.class) {
                        ebVar = f126044h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126043g);
                            f126044h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
