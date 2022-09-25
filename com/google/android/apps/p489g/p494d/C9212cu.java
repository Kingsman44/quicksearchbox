package com.google.android.apps.p489g.p494d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7818lb;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54781a;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.cu */
/* compiled from: PG */
public final class C9212cu extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C9212cu f31820l;

    /* renamed from: m */
    private static volatile C63010eb f31821m;

    /* renamed from: a */
    public int f31822a;

    /* renamed from: b */
    public String f31823b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f31824c;

    /* renamed from: d */
    public C62971cq f31825d = emptyProtobufList();

    /* renamed from: e */
    public String f31826e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f31827f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f31828g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public int f31829h;

    /* renamed from: i */
    public C62971cq f31830i = emptyProtobufList();

    /* renamed from: j */
    public String f31831j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public String f31832k = BuildConfig.FLAVOR;

    static {
        C9212cu cuVar = new C9212cu();
        f31820l = cuVar;
        C62942bv.registerDefaultInstance(C9212cu.class, cuVar);
    }

    private C9212cu() {
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
                return newMessageInfo(f31820l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001ဈ\u0000\u0002င\u0001\u0003\u001b\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဌ\u0005\b\u001b\tဈ\u0006\nဈ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", C7818lb.class, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C54781a.f143722a, "i", C9210cs.class, "j", C19621k.f54601a});
            case 3:
                return new C9212cu();
            case 4:
                return new C9211ct();
            case 5:
                return f31820l;
            case 6:
                C63010eb ebVar = f31821m;
                if (ebVar == null) {
                    synchronized (C9212cu.class) {
                        ebVar = f31821m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31820l);
                            f31821m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
