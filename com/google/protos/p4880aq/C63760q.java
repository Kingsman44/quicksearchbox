package com.google.protos.p4880aq;

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

/* renamed from: com.google.protos.aq.q */
/* compiled from: PG */
public final class C63760q extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C63760q f172487j;

    /* renamed from: l */
    private static volatile C63010eb f172488l;

    /* renamed from: a */
    public int f172489a = 0;

    /* renamed from: b */
    public Object f172490b;

    /* renamed from: c */
    public int f172491c = 0;

    /* renamed from: d */
    public Object f172492d;

    /* renamed from: e */
    public C63750g f172493e;

    /* renamed from: f */
    public C63750g f172494f;

    /* renamed from: g */
    public C63750g f172495g;

    /* renamed from: h */
    public C63750g f172496h;

    /* renamed from: i */
    public C63758o f172497i;

    /* renamed from: k */
    private int f172498k;

    static {
        C63760q qVar = new C63760q();
        f172487j = qVar;
        C62942bv.registerDefaultInstance(C63760q.class, qVar);
    }

    private C63760q() {
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
                return newMessageInfo(f172487j, "\u0001\n\u0002\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဿ\u0000\u0004ဿ\u0001\u0005ဉ\u0007\u0006ဉ\b\u0007ဉ\t\bျ\u0000\tျ\u0001\nျ\u0001", new Object[]{"b", "a", "d", C45240c.f118157a, C19621k.f54601a, "e", C10662f.f35572a, C63754k.m96304b(), C63736ay.m96293b(), C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C63760q();
            case 4:
                return new C63759p();
            case 5:
                return f172487j;
            case 6:
                C63010eb ebVar = f172488l;
                if (ebVar == null) {
                    synchronized (C63760q.class) {
                        ebVar = f172488l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172487j);
                            f172488l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
