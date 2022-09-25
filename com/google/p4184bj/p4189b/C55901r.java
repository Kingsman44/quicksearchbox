package com.google.p4184bj.p4189b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.b.r */
/* compiled from: PG */
public final class C55901r extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C55901r f148744j;

    /* renamed from: k */
    private static volatile C63010eb f148745k;

    /* renamed from: a */
    public int f148746a;

    /* renamed from: b */
    public int f148747b;

    /* renamed from: c */
    public int f148748c;

    /* renamed from: d */
    public long f148749d;

    /* renamed from: e */
    public int f148750e;

    /* renamed from: f */
    public int f148751f;

    /* renamed from: g */
    public double f148752g;

    /* renamed from: h */
    public double f148753h;

    /* renamed from: i */
    public long f148754i;

    static {
        C55901r rVar = new C55901r();
        f148744j = rVar;
        C62942bv.registerDefaultInstance(C55901r.class, rVar);
    }

    private C55901r() {
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
                return newMessageInfo(f148744j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004င\u0003\u0005င\u0004\u0006က\u0005\u0007က\u0006\bဂ\u0007", new Object[]{"a", "b", C55900q.f148743a, C45240c.f118157a, C55899p.f148742a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C55901r();
            case 4:
                return new C55898o();
            case 5:
                return f148744j;
            case 6:
                C63010eb ebVar = f148745k;
                if (ebVar == null) {
                    synchronized (C55901r.class) {
                        ebVar = f148745k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f148744j);
                            f148745k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
