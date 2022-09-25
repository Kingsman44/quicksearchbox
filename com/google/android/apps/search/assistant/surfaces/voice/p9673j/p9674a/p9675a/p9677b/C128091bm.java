package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bm */
/* compiled from: PG */
public final class C128091bm extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C128091bm f352436f;

    /* renamed from: g */
    private static volatile C63010eb f352437g;

    /* renamed from: a */
    public int f352438a;

    /* renamed from: b */
    public C128100bv f352439b;

    /* renamed from: c */
    public C128084bf f352440c;

    /* renamed from: d */
    public C83320io f352441d;

    /* renamed from: e */
    public int f352442e;

    static {
        C128091bm bmVar = new C128091bm();
        f352436f = bmVar;
        C62942bv.registerDefaultInstance(C128091bm.class, bmVar);
    }

    private C128091bm() {
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
                return newMessageInfo(f352436f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e", e.b()});
            case 3:
                return new C128091bm();
            case 4:
                return new C128090bl();
            case 5:
                return f352436f;
            case 6:
                C63010eb ebVar = f352437g;
                if (ebVar == null) {
                    synchronized (C128091bm.class) {
                        ebVar = f352437g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f352436f);
                            f352437g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
