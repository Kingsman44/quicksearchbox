package com.google.assistant.p3897e.p3921j.p3925d;

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

/* renamed from: com.google.assistant.e.j.d.d */
/* compiled from: PG */
public final class C51778d extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C51778d f135848m;

    /* renamed from: n */
    private static volatile C63010eb f135849n;

    /* renamed from: a */
    public int f135850a;

    /* renamed from: b */
    public C51782h f135851b;

    /* renamed from: c */
    public C51782h f135852c;

    /* renamed from: d */
    public C51782h f135853d;

    /* renamed from: e */
    public C51782h f135854e;

    /* renamed from: f */
    public C51782h f135855f;

    /* renamed from: g */
    public C51782h f135856g;

    /* renamed from: h */
    public C51782h f135857h;

    /* renamed from: i */
    public C51782h f135858i;

    /* renamed from: j */
    public C51782h f135859j;

    /* renamed from: k */
    public C51782h f135860k;

    /* renamed from: l */
    public C51782h f135861l;

    static {
        C51778d dVar = new C51778d();
        f135848m = dVar;
        C62942bv.registerDefaultInstance(C51778d.class, dVar);
    }

    private C51778d() {
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
                return newMessageInfo(f135848m, "\u0001\u000b\u0000\u0001\u0001\u0010\u000b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဉ\u0004\u0005ဉ\u0005\u0006ဉ\u0006\fဉ\u0007\rဉ\u0001\u000eဉ\b\u000fဉ\t\u0010ဉ\n", new Object[]{"a", "b", "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", C45240c.f118157a, "j", C19621k.f54601a, "l"});
            case 3:
                return new C51778d();
            case 4:
                return new C51777c();
            case 5:
                return f135848m;
            case 6:
                C63010eb ebVar = f135849n;
                if (ebVar == null) {
                    synchronized (C51778d.class) {
                        ebVar = f135849n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135848m);
                            f135849n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
