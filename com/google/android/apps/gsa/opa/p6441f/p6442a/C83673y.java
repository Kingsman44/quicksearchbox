package com.google.android.apps.gsa.opa.p6441f.p6442a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.f.a.y */
/* compiled from: PG */
public final class C83673y extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C83673y f228080e;

    /* renamed from: g */
    private static volatile C63010eb f228081g;

    /* renamed from: a */
    public int f228082a;

    /* renamed from: b */
    public int f228083b = 0;

    /* renamed from: c */
    public Object f228084c;

    /* renamed from: d */
    public String f228085d = BuildConfig.FLAVOR;

    /* renamed from: f */
    private byte f228086f = 2;

    static {
        C83673y yVar = new C83673y();
        f228080e = yVar;
        C62942bv.registerDefaultInstance(C83673y.class, yVar);
    }

    private C83673y() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f228086f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f228086f = b;
                return null;
            case 2:
                return newMessageInfo(f228080e, "\u0001\u0012\u0001\u0001\u0001\u0014\u0012\u0000\u0000\u0002\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ဈ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nᐼ\u0000\fြ\u0000\rြ\u0000\u000eြ\u0000\u000fᐼ\u0000\u0010ြ\u0000\u0011ြ\u0000\u0012ြ\u0000\u0014ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", C83644bf.class, C83642bd.class, C83637az.class, C83648bj.class, C83614ac.class, "d", C83650bl.class, C83660l.class, C83654f.class, C83666r.class, C83656h.class, C83612aa.class, C83670v.class, C83631at.class, C83633av.class, C83664p.class, C83618ag.class, C83640bb.class});
            case 3:
                return new C83673y();
            case 4:
                return new C83671w();
            case 5:
                return f228080e;
            case 6:
                C63010eb ebVar = f228081g;
                if (ebVar == null) {
                    synchronized (C83673y.class) {
                        ebVar = f228081g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228080e);
                            f228081g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
