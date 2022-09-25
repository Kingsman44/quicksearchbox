package com.google.common.p4552o.p4570p;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.p.v */
/* compiled from: PG */
public final class C60401v extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C60401v f163448n;

    /* renamed from: o */
    private static volatile C63010eb f163449o;

    /* renamed from: a */
    public int f163450a;

    /* renamed from: b */
    public int f163451b;

    /* renamed from: c */
    public long f163452c;

    /* renamed from: d */
    public int f163453d;

    /* renamed from: e */
    public int f163454e;

    /* renamed from: f */
    public int f163455f;

    /* renamed from: g */
    public int f163456g;

    /* renamed from: h */
    public int f163457h;

    /* renamed from: i */
    public boolean f163458i;

    /* renamed from: j */
    public boolean f163459j;

    /* renamed from: k */
    public boolean f163460k;

    /* renamed from: l */
    public int f163461l;

    /* renamed from: m */
    public boolean f163462m;

    static {
        C60401v vVar = new C60401v();
        f163448n = vVar;
        C62942bv.registerDefaultInstance(C60401v.class, vVar);
    }

    private C60401v() {
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
                return newMessageInfo(f163448n, "\u0001\f\u0000\u0001\u0001\r\f\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဃ\u0001\u0003ဌ\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bဇ\u0007\nဇ\t\u000bဇ\n\fင\u000b\rဇ\f", new Object[]{"a", "b", C60400u.f163447a, C45240c.f118157a, "d", C60402w.f163463a, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m"});
            case 3:
                return new C60401v();
            case 4:
                return new C60399t();
            case 5:
                return f163448n;
            case 6:
                C63010eb ebVar = f163449o;
                if (ebVar == null) {
                    synchronized (C60401v.class) {
                        ebVar = f163449o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163448n);
                            f163449o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
