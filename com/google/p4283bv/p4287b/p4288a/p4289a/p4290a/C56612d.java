package com.google.p4283bv.p4287b.p4288a.p4289a.p4290a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4242bp.p4253e.p4254a.C56193m;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.a.d */
/* compiled from: PG */
public final class C56612d extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C56612d f151152f;

    /* renamed from: h */
    private static volatile C63010eb f151153h;

    /* renamed from: a */
    public C62971cq f151154a = emptyProtobufList();

    /* renamed from: b */
    public String f151155b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f151156c;

    /* renamed from: d */
    public C56620l f151157d;

    /* renamed from: e */
    public int f151158e;

    /* renamed from: g */
    private int f151159g;

    static {
        C56612d dVar = new C56612d();
        f151152f = dVar;
        C62942bv.registerDefaultInstance(C56612d.class, dVar);
    }

    private C56612d() {
    }

    /* renamed from: a */
    public final void mo54429a() {
        C62971cq cqVar = this.f151154a;
        if (!cqVar.mo58948c()) {
            this.f151154a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f151152f, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0005ဉ\u0002\u0006ဌ\u0003", new Object[]{C30325g.f82003a, "a", C56610b.class, "b", C45240c.f118157a, "d", "e", C56193m.f149721a});
            case 3:
                return new C56612d();
            case 4:
                return new C56611c();
            case 5:
                return f151152f;
            case 6:
                C63010eb ebVar = f151153h;
                if (ebVar == null) {
                    synchronized (C56612d.class) {
                        ebVar = f151153h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151152f);
                            f151153h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
