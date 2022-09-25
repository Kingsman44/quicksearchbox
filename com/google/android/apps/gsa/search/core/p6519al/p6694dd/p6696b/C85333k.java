package com.google.android.apps.gsa.search.core.p6519al.p6694dd.p6696b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.core.al.dd.b.k */
/* compiled from: PG */
public final class C85333k extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C85333k f231104g;

    /* renamed from: h */
    private static volatile C63010eb f231105h;

    /* renamed from: a */
    public int f231106a;

    /* renamed from: b */
    public String f231107b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f231108c;

    /* renamed from: d */
    public String f231109d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62971cq f231110e = C62942bv.emptyProtobufList();

    /* renamed from: f */
    public boolean f231111f;

    static {
        C85333k kVar = new C85333k();
        f231104g = kVar;
        C62942bv.registerDefaultInstance(C85333k.class, kVar);
    }

    private C85333k() {
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
                return newMessageInfo(f231104g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004\u001a\u0005ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C85333k();
            case 4:
                return new C85332j();
            case 5:
                return f231104g;
            case 6:
                C63010eb ebVar = f231105h;
                if (ebVar == null) {
                    synchronized (C85333k.class) {
                        ebVar = f231105h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f231104g);
                            f231105h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
