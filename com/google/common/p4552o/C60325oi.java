package com.google.common.p4552o;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.oi */
/* compiled from: PG */
public final class C60325oi extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C60325oi f163247i;

    /* renamed from: j */
    private static volatile C63010eb f163248j;

    /* renamed from: a */
    public int f163249a;

    /* renamed from: b */
    public int f163250b;

    /* renamed from: c */
    public int f163251c;

    /* renamed from: d */
    public boolean f163252d;

    /* renamed from: e */
    public int f163253e;

    /* renamed from: f */
    public int f163254f;

    /* renamed from: g */
    public int f163255g;

    /* renamed from: h */
    public int f163256h;

    static {
        C60325oi oiVar = new C60325oi();
        f163247i = oiVar;
        C62942bv.registerDefaultInstance(C60325oi.class, oiVar);
    }

    private C60325oi() {
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
                return newMessageInfo(f163247i, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0000\u0000\u0001င\u0000\u0004င\u0003\u0005ဇ\u0004\u0006ဌ\u0007\u0007ဋ\b\bဋ\t\nဋ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", C10662f.f35572a, C60324oh.m92568b(), C30325g.f82003a, C19618h.f54585a, "e"});
            case 3:
                return new C60325oi();
            case 4:
                return new C60322of();
            case 5:
                return f163247i;
            case 6:
                C63010eb ebVar = f163248j;
                if (ebVar == null) {
                    synchronized (C60325oi.class) {
                        ebVar = f163248j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163247i);
                            f163248j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
