package com.google.assistant.p3994s.p3995a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.assistant.s.a.nw */
/* compiled from: PG */
public final class C53437nw extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C53437nw f140250i;

    /* renamed from: j */
    private static volatile C63010eb f140251j;

    /* renamed from: a */
    public int f140252a;

    /* renamed from: b */
    public int f140253b;

    /* renamed from: c */
    public C48952az f140254c;

    /* renamed from: d */
    public C53446oe f140255d;

    /* renamed from: e */
    public boolean f140256e;

    /* renamed from: f */
    public C63042fg f140257f;

    /* renamed from: g */
    public int f140258g;

    /* renamed from: h */
    public C53448og f140259h;

    static {
        C53437nw nwVar = new C53437nw();
        f140250i = nwVar;
        C62942bv.registerDefaultInstance(C53437nw.class, nwVar);
    }

    private C53437nw() {
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
                return newMessageInfo(f140250i, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0005ဇ\u0005\u0006ဉ\u0006\tဉ\u0002\nင\u0007\u000bဉ\b", new Object[]{"a", "b", C45240c.f118157a, "e", C10662f.f35572a, "d", C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C53437nw();
            case 4:
                return new C53436nv();
            case 5:
                return f140250i;
            case 6:
                C63010eb ebVar = f140251j;
                if (ebVar == null) {
                    synchronized (C53437nw.class) {
                        ebVar = f140251j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140250i);
                            f140251j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
