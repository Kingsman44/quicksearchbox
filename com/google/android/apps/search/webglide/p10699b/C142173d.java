package com.google.android.apps.search.webglide.p10699b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.webglide.b.d */
/* compiled from: PG */
public final class C142173d extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C142173d f385675i;

    /* renamed from: k */
    private static volatile C63010eb f385676k;

    /* renamed from: a */
    public int f385677a;

    /* renamed from: b */
    public C62971cq f385678b = emptyProtobufList();

    /* renamed from: c */
    public int f385679c;

    /* renamed from: d */
    public C63042fg f385680d;

    /* renamed from: e */
    public C142180k f385681e;

    /* renamed from: f */
    public String f385682f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public int f385683g;

    /* renamed from: h */
    public C60214n f385684h;

    /* renamed from: j */
    private byte f385685j = 2;

    static {
        C142173d dVar = new C142173d();
        f385675i = dVar;
        C62942bv.registerDefaultInstance(C142173d.class, dVar);
    }

    private C142173d() {
    }

    /* renamed from: a */
    public final void mo117042a() {
        C62971cq cqVar = this.f385678b;
        if (!cqVar.mo58948c()) {
            this.f385678b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f385685j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f385685j = b;
                return null;
            case 2:
                return newMessageInfo(f385675i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0001\u0001\u001b\u0002င\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဈ\u0003\u0006ဌ\u0004\u0007ᐉ\u0005", new Object[]{"a", "b", C142185p.class, C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C142171b.f385674a, C19618h.f54585a});
            case 3:
                return new C142173d();
            case 4:
                return new C142170a();
            case 5:
                return f385675i;
            case 6:
                C63010eb ebVar = f385676k;
                if (ebVar == null) {
                    synchronized (C142173d.class) {
                        ebVar = f385676k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f385675i);
                            f385676k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
