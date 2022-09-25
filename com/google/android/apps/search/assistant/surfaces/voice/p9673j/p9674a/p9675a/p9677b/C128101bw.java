package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bw */
/* compiled from: PG */
public final class C128101bw extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C128101bw f352467e;

    /* renamed from: f */
    private static volatile C63010eb f352468f;

    /* renamed from: a */
    public int f352469a;

    /* renamed from: b */
    public int f352470b = 0;

    /* renamed from: c */
    public Object f352471c;

    /* renamed from: d */
    public int f352472d;

    static {
        C128101bw bwVar = new C128101bw();
        f352467e = bwVar;
        C62942bv.registerDefaultInstance(C128101bw.class, bwVar);
    }

    private C128101bw() {
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
                return newMessageInfo(f352467e, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ဌ\u0004", new Object[]{C45240c.f118157a, "b", "a", C128095bq.class, C128089bk.class, C128091bm.class, C128087bi.class, "d", C128097bs.m209215b()});
            case 3:
                return new C128101bw();
            case 4:
                return new C128085bg();
            case 5:
                return f352467e;
            case 6:
                C63010eb ebVar = f352468f;
                if (ebVar == null) {
                    synchronized (C128101bw.class) {
                        ebVar = f352468f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f352467e);
                            f352468f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
