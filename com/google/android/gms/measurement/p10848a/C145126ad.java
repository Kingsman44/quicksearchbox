package com.google.android.gms.measurement.p10848a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.measurement.a.ad */
/* compiled from: PG */
public final class C145126ad extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C145126ad f392211g;

    /* renamed from: h */
    private static volatile C63010eb f392212h;

    /* renamed from: a */
    public int f392213a;

    /* renamed from: b */
    public C62971cq f392214b = emptyProtobufList();

    /* renamed from: c */
    public String f392215c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public long f392216d;

    /* renamed from: e */
    public long f392217e;

    /* renamed from: f */
    public int f392218f;

    static {
        C145126ad adVar = new C145126ad();
        f392211g = adVar;
        C62942bv.registerDefaultInstance(C145126ad.class, adVar);
    }

    private C145126ad() {
    }

    /* renamed from: a */
    public final void mo120667a() {
        C62971cq cqVar = this.f392214b;
        if (!cqVar.mo58948c()) {
            this.f392214b = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f392211g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"a", "b", C145130ah.class, C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C145126ad();
            case 4:
                return new C145125ac();
            case 5:
                return f392211g;
            case 6:
                C63010eb ebVar = f392212h;
                if (ebVar == null) {
                    synchronized (C145126ad.class) {
                        ebVar = f392212h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f392211g);
                            f392212h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
