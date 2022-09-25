package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b;

import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bq */
/* compiled from: PG */
public final class C128095bq extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C128095bq f352444d;

    /* renamed from: e */
    private static volatile C63010eb f352445e;

    /* renamed from: a */
    public int f352446a;

    /* renamed from: b */
    public int f352447b;

    /* renamed from: c */
    public C83320io f352448c;

    static {
        C128095bq bqVar = new C128095bq();
        f352444d = bqVar;
        C62942bv.registerDefaultInstance(C128095bq.class, bqVar);
    }

    private C128095bq() {
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
                return newMessageInfo(f352444d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C128093bo.f352443a, C45240c.f118157a});
            case 3:
                return new C128095bq();
            case 4:
                return new C128092bn();
            case 5:
                return f352444d;
            case 6:
                C63010eb ebVar = f352445e;
                if (ebVar == null) {
                    synchronized (C128095bq.class) {
                        ebVar = f352445e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f352444d);
                            f352445e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
