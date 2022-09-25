package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bi */
/* compiled from: PG */
public final class C128087bi extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C128087bi f352422f;

    /* renamed from: g */
    private static volatile C63010eb f352423g;

    /* renamed from: a */
    public int f352424a;

    /* renamed from: b */
    public C128100bv f352425b;

    /* renamed from: c */
    public C83320io f352426c;

    /* renamed from: d */
    public int f352427d;

    /* renamed from: e */
    public boolean f352428e;

    static {
        C128087bi biVar = new C128087bi();
        f352422f = biVar;
        C62942bv.registerDefaultInstance(C128087bi.class, biVar);
    }

    private C128087bi() {
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
                return newMessageInfo(f352422f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", e.b(), "e"});
            case 3:
                return new C128087bi();
            case 4:
                return new C128086bh();
            case 5:
                return f352422f;
            case 6:
                C63010eb ebVar = f352423g;
                if (ebVar == null) {
                    synchronized (C128087bi.class) {
                        ebVar = f352423g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f352422f);
                            f352423g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
