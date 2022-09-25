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

/* renamed from: com.google.common.o.wt */
/* compiled from: PG */
public final class C60623wt extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C60623wt f164468k;

    /* renamed from: l */
    private static volatile C63010eb f164469l;

    /* renamed from: a */
    public int f164470a;

    /* renamed from: b */
    public int f164471b = 1;

    /* renamed from: c */
    public boolean f164472c;

    /* renamed from: d */
    public int f164473d;

    /* renamed from: e */
    public int f164474e;

    /* renamed from: f */
    public int f164475f;

    /* renamed from: g */
    public int f164476g;

    /* renamed from: h */
    public int f164477h;

    /* renamed from: i */
    public int f164478i;

    /* renamed from: j */
    public int f164479j;

    static {
        C60623wt wtVar = new C60623wt();
        f164468k = wtVar;
        C62942bv.registerDefaultInstance(C60623wt.class, wtVar);
    }

    private C60623wt() {
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
                return newMessageInfo(f164468k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b", new Object[]{"a", "b", C60622ws.f164467a, C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C60623wt();
            case 4:
                return new C60621wr();
            case 5:
                return f164468k;
            case 6:
                C63010eb ebVar = f164469l;
                if (ebVar == null) {
                    synchronized (C60623wt.class) {
                        ebVar = f164469l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164468k);
                            f164469l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
