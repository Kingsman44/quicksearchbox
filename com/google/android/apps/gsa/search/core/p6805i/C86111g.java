package com.google.android.apps.gsa.search.core.p6805i;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.core.i.g */
/* compiled from: PG */
public final class C86111g extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C86111g f232741g;

    /* renamed from: h */
    private static volatile C63010eb f232742h;

    /* renamed from: a */
    public int f232743a;

    /* renamed from: b */
    public C62971cq f232744b = emptyProtobufList();

    /* renamed from: c */
    public long f232745c;

    /* renamed from: d */
    public C62961ch f232746d = emptyIntList();

    /* renamed from: e */
    public C62961ch f232747e = emptyIntList();

    /* renamed from: f */
    public String f232748f = BuildConfig.FLAVOR;

    static {
        C86111g gVar = new C86111g();
        f232741g = gVar;
        C62942bv.registerDefaultInstance(C86111g.class, gVar);
    }

    private C86111g() {
    }

    /* renamed from: a */
    public final void mo79732a() {
        C62971cq cqVar = this.f232744b;
        if (!cqVar.mo58948c()) {
            this.f232744b = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f232741g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0003\u0000\u0001\u001b\u0002ဂ\u0000\u0003\u0016\u0005\u0016\u0006ဈ\u0001", new Object[]{"a", "b", C86113i.class, C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C86111g();
            case 4:
                return new C86110f();
            case 5:
                return f232741g;
            case 6:
                C63010eb ebVar = f232742h;
                if (ebVar == null) {
                    synchronized (C86111g.class) {
                        ebVar = f232742h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f232741g);
                            f232742h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
