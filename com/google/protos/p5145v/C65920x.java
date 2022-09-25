package com.google.protos.p5145v;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4479cg.C58072d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.v.x */
/* compiled from: PG */
public final class C65920x extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C65920x f179266m;

    /* renamed from: n */
    private static volatile C63010eb f179267n;

    /* renamed from: a */
    public int f179268a;

    /* renamed from: b */
    public int f179269b;

    /* renamed from: c */
    public C58072d f179270c;

    /* renamed from: d */
    public C58072d f179271d;

    /* renamed from: e */
    public int f179272e;

    /* renamed from: f */
    public int f179273f;

    /* renamed from: g */
    public int f179274g;

    /* renamed from: h */
    public int f179275h;

    /* renamed from: i */
    public int f179276i;

    /* renamed from: j */
    public int f179277j;

    /* renamed from: k */
    public int f179278k;

    /* renamed from: l */
    public int f179279l;

    static {
        C65920x xVar = new C65920x();
        f179266m = xVar;
        C62942bv.registerDefaultInstance(C65920x.class, xVar);
    }

    private C65920x() {
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
                return newMessageInfo(f179266m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bဌ\u0007\tဌ\b\nဌ\t\u000bဌ\n", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", C65913q.m96826b(), "j", C65913q.m96826b(), C19621k.f54601a, C65913q.m96826b(), "l", C65913q.m96826b()});
            case 3:
                return new C65920x();
            case 4:
                return new C65919w();
            case 5:
                return f179266m;
            case 6:
                C63010eb ebVar = f179267n;
                if (ebVar == null) {
                    synchronized (C65920x.class) {
                        ebVar = f179267n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179266m);
                            f179267n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
