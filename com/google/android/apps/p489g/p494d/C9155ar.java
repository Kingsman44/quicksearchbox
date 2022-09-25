package com.google.android.apps.p489g.p494d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7773jk;
import com.google.p375ai.p378b.C7775jm;
import com.google.p375ai.p378b.C7893nw;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.ar */
/* compiled from: PG */
public final class C9155ar extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C9155ar f31598g;

    /* renamed from: h */
    private static volatile C63010eb f31599h;

    /* renamed from: a */
    public int f31600a;

    /* renamed from: b */
    public String f31601b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f31602c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f31603d = 1;

    /* renamed from: e */
    public int f31604e = 1;

    /* renamed from: f */
    public C62971cq f31605f = emptyProtobufList();

    static {
        C9155ar arVar = new C9155ar();
        f31598g = arVar;
        C62942bv.registerDefaultInstance(C9155ar.class, arVar);
    }

    private C9155ar() {
    }

    /* renamed from: a */
    public final void mo17449a() {
        C62971cq cqVar = this.f31605f;
        if (!cqVar.mo58948c()) {
            this.f31605f = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f31598g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", C7775jm.f27216a, "e", C7773jk.f27215a, C10662f.f35572a, C7893nw.class});
            case 3:
                return new C9155ar();
            case 4:
                return new C9154aq();
            case 5:
                return f31598g;
            case 6:
                C63010eb ebVar = f31599h;
                if (ebVar == null) {
                    synchronized (C9155ar.class) {
                        ebVar = f31599h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31598g);
                            f31599h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
