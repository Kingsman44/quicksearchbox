package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8199c;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6277b.C80116d;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6277b.C80118f;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6277b.C80120h;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6277b.C80122j;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.c.c.n */
/* compiled from: PG */
public final class C106286n extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C106286n f296543f;

    /* renamed from: h */
    private static volatile C63010eb f296544h;

    /* renamed from: a */
    public int f296545a;

    /* renamed from: b */
    public int f296546b = 0;

    /* renamed from: c */
    public Object f296547c;

    /* renamed from: d */
    public C62971cq f296548d = emptyProtobufList();

    /* renamed from: e */
    public int f296549e;

    /* renamed from: g */
    private byte f296550g = 2;

    static {
        C106286n nVar = new C106286n();
        f296543f = nVar;
        C62942bv.registerDefaultInstance(C106286n.class, nVar);
    }

    private C106286n() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f296550g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f296550g = b;
                return null;
            case 2:
                return newMessageInfo(f296543f, "\u0001\u0014\u0001\u0001\u0001\u0019\u0014\u0000\u0001\u0005\u0001ᐼ\u0000\u0002ᐼ\u0000\u0003ᐼ\u0000\u0004ြ\u0000\u0005ᐼ\u0000\u0006ြ\u0000\tြ\u0000\nြ\u0000\u000bЛ\fြ\u0000\rင\u0012\u000fြ\u0000\u0010ဵ\u0000\u0013ြ\u0000\u0014ြ\u0000\u0015ြ\u0000\u0016ြ\u0000\u0017ြ\u0000\u0018ြ\u0000\u0019ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", C80120h.class, C80122j.class, C80118f.class, C80116d.class, C106279g.class, C106277e.class, C106273af.class, C106292t.class, "d", C106275c.class, C106294v.class, "e", C106269ab.class, C106296x.class, C106283k.class, C106288p.class, C106271ad.class, C106298z.class, C106281i.class, C106290r.class});
            case 3:
                return new C106286n();
            case 4:
                return new C106284l();
            case 5:
                return f296543f;
            case 6:
                C63010eb ebVar = f296544h;
                if (ebVar == null) {
                    synchronized (C106286n.class) {
                        ebVar = f296544h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f296543f);
                            f296544h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
